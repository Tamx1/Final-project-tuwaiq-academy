package com.example.Final_Project.Favorite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path= "favorite")
@CrossOrigin("*")
public class FavoriteController {

    private final FavoriteService favoriteService;


    @Autowired
    public FavoriteController(FavoriteService favoriteService) {
        this.favoriteService = favoriteService;
    }



    @GetMapping
    public List<Favorite> getFavorites(@RequestParam(required = false) String filter){
        return favoriteService.getFavorites();
    }

    @GetMapping("/{id}")
    public Favorite getFavorite(@PathVariable String id){
        return favoriteService.getFavorite(id);
    }

    @PostMapping
    public void addFavorite(@RequestBody Favorite favorite){
        favoriteService.addFavorite(favorite);
    }

    @DeleteMapping("/{id}")
    public void delFavorite(@PathVariable String id){
        favoriteService.deleteFavorite(id);
    }



}
