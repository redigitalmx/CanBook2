package mx.redigital.canbook2;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by jcarlosmarqz on 12/13/16.
 */

public class MascotasFavoritas extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    public MascotaAdaptador adaptador;


    public View findViewById(@IdRes int id) {
        return super.findViewById(id);
    }

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        listaMascotas = (RecyclerView)findViewById(R.id.rvMascotasFavoritas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
    }
    private void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }

    private void inicializarListaMascotas() {
        mascotas =new ArrayList<Mascota>();

        mascotas.add(new Mascota("Nala",R.drawable.pet1, 6));
        mascotas.add(new Mascota("Naomi",R.drawable.pet2,8));
        mascotas.add(new Mascota("Kyara", R.drawable.pet3,5));
        mascotas.add(new Mascota("Mapach", R.drawable.pet4,7));

    }

}

