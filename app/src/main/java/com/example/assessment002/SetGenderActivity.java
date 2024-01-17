package com.example.assessment002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.Serializable;

public class SetGenderActivity implements Serializable {
    String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public SetGenderActivity(String gender) {
        this.gender = gender;



    }

}