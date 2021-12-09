package com.example.Final_Project.Favorite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class FavoriteService {

    private final FavoriteRepository favoriteRepository;


    @Autowired
    public FavoriteService(FavoriteRepository favoriteRepository) {
        this.favoriteRepository = favoriteRepository;
    }

    public List<Favorite> getFavorites(){
        return favoriteRepository.findAll();
    }

    public Favorite getFavorite(String id){
        int favorite_id = Integer.valueOf(id);
        return favoriteRepository.findById(favorite_id).orElse(null);
    }

    public Favorite addFavorite(Favorite favorite){

        return favoriteRepository.save(favorite);
    }

    public void deleteFavorite(String id){
        int favorite_id = Integer.valueOf(id);
        favoriteRepository.deleteById(favorite_id);

    }




    }


