package com.example.myapplication3;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ArrayList<DataModel> dataSet;
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private CustomeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataSet = new ArrayList<>();
        recyclerView =  findViewById(R.id.resView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        for ( int i =0 ; i < myData.nameArray.length ; i++){
            dataSet.add(new DataModel(
                    myData.nameArray[i],
                    myData.versionArray[i],
                    myData.drawableArray[i],
                    myData.id_[i]
            ));
        }

        adapter = new CustomeAdapter(dataSet);
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new CustomeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(DataModel item) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle(item.getName());
                builder.setMessage(item.getVersion());
                builder.setPositiveButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                builder.show();
            }
        });
    }
}









