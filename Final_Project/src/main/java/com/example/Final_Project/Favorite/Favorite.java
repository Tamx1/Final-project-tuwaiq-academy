package com.example.Final_Project.Favorite;

import javax.persistence.*;


@Entity
@Table(name = "favorite")
public class Favorite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int favorite_id;
    private int user_id;
    private int post_id;

    public Favorite() {
    }

    public Favorite(int favorite_id, int user_id, int post_id) {
        this.favorite_id = favorite_id;
        this.user_id = user_id;
        this.post_id = post_id;
    }

    public int getFavorite_id() {
        return favorite_id;
    }

    public void setFavorite_id(int favorite_id) {
        this.favorite_id = favorite_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }
}

