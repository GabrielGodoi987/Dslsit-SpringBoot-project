package com.gabrielgodoi.dslist.DTO;

import com.gabrielgodoi.dslist.entities.Game;

public class GameMinDTO {
    public Long Id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){}

    public GameMinDTO(Game entity){
       Id = entity.getId();
       title = entity.getTitle();
       year = entity.getYear();
       imgUrl = entity.getImgUrl();
       shortDescription = entity.getShortDescription();
    }

    public Long getId(){
        return this.Id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
