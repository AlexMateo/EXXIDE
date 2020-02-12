package com.example.exxide;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.exxide.utilidades.Utilidades;

public class Registro_Seccion extends AppCompatActivity {

    EditText edSeccion,edBloque,edVariedad,edtallos;
    public Button consultar,guardar,editar,eliminar,salir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro__seccion);
        //edit text
        edSeccion=findViewById(R.id.edSeccion);
        edBloque=findViewById(R.id.edbloque);
        edVariedad=findViewById(R.id.edVariedad);
        edtallos=findViewById(R.id.edtallos);
        /*botones*/
        consultar=(Button)findViewById(R.id.consultar);
        guardar=(Button)findViewById(R.id.guardar);
        editar=(Button)findViewById(R.id.editar);
        eliminar=(Button)findViewById(R.id.eliminar);
        salir=(Button)findViewById(R.id.salir);
    }

    public void guardar(View view) {
        AdminSQLiteOpenHelper conn = new AdminSQLiteOpenHelper (this,"seccion",null,1);
        SQLiteDatabase db=conn.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(Utilidades.CAMPO_SECCION,edSeccion.getText().toString());
        values.put(Utilidades.CAMPO_BLOQUE,edBloque.getText().toString());
        values.put(Utilidades.CAMPO_VARIEDAD,edVariedad.getText().toString());
        values.put(Utilidades.CAMPO_TALLOS,edtallos.getText().toString());

        Long idResultante=db.insert(Utilidades.TABLA_SECCION,Utilidades.CAMPO_ID_SECCION,values);

        Toast.makeText(getApplicationContext(),"Id Registro: "+idResultante,Toast.LENGTH_SHORT).show();
        db.close();
    }
}
