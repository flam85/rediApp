package com.example.rediapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.rediapp.databinding.ActivityMainBinding;
import com.example.rediapp.ui.HomeFragment;
import com.example.rediapp.ui.ProfileFragment;
import com.example.rediapp.ui.TrackFragment;
import com.example.rediapp.ui.WalletFragment;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ImageView addButton;
    ImageButton notButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());



        binding.bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()){

                case R.id.home:
                    replaceFragment(new HomeFragment());
                    break;
                case R.id.wallet:
                    replaceFragment(new WalletFragment());
                    break;
                case R.id.track:
                    replaceFragment(new TrackFragment());
                    break;
                case R.id.profile:
                    replaceFragment(new ProfileFragment());
                    break;
            }


            return true;
        });
    }

    private void replaceFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_lot, fragment);
        fragmentTransaction.commit();

    }
}