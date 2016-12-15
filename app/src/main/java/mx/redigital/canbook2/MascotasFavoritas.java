package mx.redigital.canbook2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by jcarlosmarqz on 12/13/16.
 */

public class MascotasFavoritas extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotas;

        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        setTitle("Mascotas Favoritas");

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
/*
        FloatingActionButton fabFoto = (FloatingActionButton) findViewById(R.id.fabFoto);
        fabFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Deshabilitado", Toast.LENGTH_SHORT).show();
         }
            });
*/
        rvMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        inicializarListaMascotas();
        inicializarAdaptador();
   }
        public void inicializarAdaptador() {
            MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
            rvMascotas.setAdapter(adaptador);
   }

        public void inicializarListaMascotas(){
            mascotas=new ArrayList<>();
            mascotas.add(new Mascota("Nala",R.drawable.pet1,0));
            mascotas.add(new Mascota("Naomi",R.drawable.pet2,2));
            mascotas.add(new Mascota("Kyara",R.drawable.pet3,3));
            mascotas.add(new Mascota("Mapach",R.drawable.pet4,4));
    }

}

