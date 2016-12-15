package mx.redigital.canbook2;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        private ArrayList<Mascota> mascotas;
        private RecyclerView rvMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar actionbar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(actionbar);
/*
        ImageButton ibTop = (ImageButton) findViewById(R.id.ibTop);
        ibTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MascotasFavoritas.class);
                startActivity(intent);
            }
        });

        FloatingActionButton fabFoto = (FloatingActionButton) findViewById(R.id.fabFoto);
        fabFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Proximamente", Toast.LENGTH_SHORT).show();
            }
        });
*/
        rvMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

/*
       GridLayoutManager glm = new GridLayoutManager(this, 2);
*/
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);


        rvMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
    }
    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        rvMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
            mascotas = new ArrayList<>();
            mascotas.add(new Mascota("Nala", R.drawable.pet1,0));
            mascotas.add(new Mascota("Naomi", R.drawable.pet2,0));
            mascotas.add(new Mascota("Kyara", R.drawable.pet3,0));
            mascotas.add(new Mascota("Mapach", R.drawable.pet4,0));
     }
}


