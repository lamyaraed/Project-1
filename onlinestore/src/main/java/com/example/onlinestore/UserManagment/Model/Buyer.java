package com.example.onlinestore.UserManagment.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Buyer extends User
{
    @NotNull
    private String adrress;

    public String getAdrress() {
            return adrress;
    }

    public void setAdrress( String adrress) {
        this.adrress = adrress;
    }
}
