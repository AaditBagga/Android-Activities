package com.example.assessment002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.Serializable;

public class SetWeightActivity implements Serializable {
    double weight;


    public SetWeightActivity(double weight) {
        this.weight = weight;

    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    };

    }
