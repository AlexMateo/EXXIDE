package com.example.exxide;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.exxide.utilidades.Utilidades;

import java.text.DateFormat;
import java.util.Calendar;

public class Rendimiento extends AppCompatActivity {
    TextView textViewfecha,tvTallos;
    EditText edfecha,edmallas;
    Spinner bloque,variedad,cortador;
    public Button consultar,guardar,editar,eliminar,salir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rendimiento);
        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());
        textViewfecha=findViewById(R.id.textViewfecha);
        textViewfecha.setText(currentDate);
        //edit text
        edfecha=findViewById(R.id.edfecha);
        edmallas=findViewById(R.id.edmallas);
        bloque= (Spinner) findViewById(R.id.bloque);
        variedad= (Spinner) findViewById(R.id.variedad);
        cortador= (Spinner) findViewById(R.id.cortador);
        /*botones*/
        consultar=(Button)findViewById(R.id.consultar);
        guardar=(Button)findViewById(R.id.guardar);
        editar=(Button)findViewById(R.id.editar);
        eliminar=(Button)findViewById(R.id.eliminar);
        salir=(Button)findViewById(R.id.salir);
    }
    public void guardar(View view) {
        AdminSQLiteOpenHelper conn = new AdminSQLiteOpenHelper (this,"cortador",null,1);
        SQLiteDatabase db=conn.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(Utilidades.CAMPO_CODIGO,edCodigo.getText().toString());
        values.put(Utilidades.CAMPO_NOM_CORTADOR,edNombre.getText().toString());

        Long idResultante=db.insert(Utilidades.TABLA_CORTADOR,Utilidades.CAMPO_ID_CORTADOR,values);

        Toast.makeText(getApplicationContext(),"Id Registro: "+idResultante,Toast.LENGTH_SHORT).show();
        db.close();
    }
}
