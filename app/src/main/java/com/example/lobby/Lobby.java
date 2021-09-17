package com.example.lobby;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListAdapter;

public class Lobby extends AppCompatActivity {
    ChatsFragment chatsFragment;
    androidx.fragment.app.FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby);

      //  requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
       // getSupportActionBar().hide(); // hide the title bar
       // this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
         //       WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
       // setContentView(R.layout.activity_lobby);

       // manager = getSupportFragmentManager();
       // FragmentTransaction fragmentTransaction = manager.beginTransaction();
       // chatsFragment = (ChatsFragment) manager.findFragmentById(R.id.chatsFrag);
       // fragmentTransaction.add(R.id.chatsFrag, chatsFragment);
       // fragmentTransaction.commit();


    }
}