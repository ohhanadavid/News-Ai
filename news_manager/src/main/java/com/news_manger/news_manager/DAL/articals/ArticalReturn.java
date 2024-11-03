package com.news_manger.news_manager.DAL.articals;


import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain=true)
public class ArticalReturn {
    private String url;
    private String title;
    private String summary;
    private String videoUrl;
    @JsonDeserialize(using= ArticalDataTimeFormatter.class)
    private LocalDateTime pubDate;
    private String description;

    public ArticalReturn(Article artical){
        this.url=artical.getLink();
        this.title=artical.getTitle();
        this.videoUrl=artical.getVideo_url();
        this.summary="";
       
        this.pubDate=artical.getPubDate();
        this.description=artical.getDescription();

    }

    @Override
    public String toString (){
        return String.format("-  url: %S\ntitle: %s\n   summary: %s\n   video url: %s\n   publish date: %s\n",url,title,summary,videoUrl,pubDate);
    }
}
