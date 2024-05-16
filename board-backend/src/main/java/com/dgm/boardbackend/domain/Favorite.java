package com.dgm.boardbackend.domain;


import com.dgm.boardbackend.domain.primarykey.FavoritePk;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "favorite")
@Table(name = "favorite")
@IdClass(FavoritePk.class)
public class Favorite {

    @Id
    private String userEmail;
    @Id
    private int boardNumber;

}
