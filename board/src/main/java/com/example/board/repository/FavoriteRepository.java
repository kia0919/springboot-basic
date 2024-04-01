package com.example.board.repository;

import org.springframework.stereotype.Repository;


import com.example.board.entity.FavoriteEntity;
import com.example.board.entity.pk.FavoritePk;

@Repository
public class FavoriteRepository extends JpaRepository<FavoriteEntity, FavoritePk> {
    
}
