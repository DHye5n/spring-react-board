package com.dgm.boardbackend.repository;

import com.dgm.boardbackend.domain.Favorite;
import com.dgm.boardbackend.domain.primarykey.FavoritePk;
import com.dgm.boardbackend.repository.resultset.GetFavoriteListResultSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, FavoritePk> {

    Favorite findByBoardNumberAndUserEmail(Integer boardNumber, String userEmail);

    @Query(value = "SELECT " +
            "U.email AS email, " +
            "U.nickname AS nickname, " +
            "U.profile_image AS profileImage " +
            "FROM favorite AS F " +
            "INNER JOIN user AS U " +
            "ON F.user_email = U.email " +
            "WHERE F.board_number = ?1 ",
            nativeQuery = true
    )
    List<GetFavoriteListResultSet> getFavoriteList(Integer boardNumber);

}
