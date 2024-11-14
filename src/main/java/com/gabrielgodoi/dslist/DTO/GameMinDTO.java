package com.gabrielgodoi.dslist.DTO;

import com.gabrielgodoi.dslist.entities.Game;

public class GameMinDTO {
    public Long id;
    private String title;
    private Integer gameYear;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){}

    public GameMinDTO(Game entity){
       id = entity.getId();
       title = entity.getTitle();
       gameYear = entity.getGameYear();
       imgUrl = entity.getImgUrl();
       shortDescription = entity.getShortDescription();
    }

    public Long getId(){
        return this.id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getGanmeYear() {
        return gameYear;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
