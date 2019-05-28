package com.example.punissementmanager;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.objetsjava.*;

import java.sql.Blob;

public class MyViewHolderStagiaire extends RecyclerView.ViewHolder {

    private Integer id;
    private TextView nom;
    private TextView prenom;
    private byte photo;
    private TextView email;
    private TextView telephone;
    private Integer session_id;

    public MyViewHolderStagiaire(View itemView) {
        super(itemView);

        //photo = (byte) itemView.findViewById(R.id.Photo_Stagiaire);
        nom = (TextView) itemView.findViewById(R.id.Nom_Stagiaire);
        prenom = (TextView) itemView.findViewById(R.id.Prenom_Stagiaire);
        telephone = (TextView) itemView.findViewById(R.id.Telephone_Stagiaire);
        email= (TextView) itemView.findViewById(R.id.Email_Stagiaire);
    }

    public void bind(Stagiaire StagiaireObject) {
        Stagiaire stag = ApplicationManager.getInstance().StagiaireSelectionner;
        prenom.setText(stag.getPrenom());
        nom.setText(stag.getNom());
        telephone.setText(stag.getTelephone());
        email.setText(stag.getEmail());
    }
}
