package com.kuaishou.android.model.mix.KMovieTemplate;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public final class KMovieTemplate implements Serializable	// class@000cf5
{
    public String image;
    public int kmovieTemplateId;
    public String kmovieTemplateUrl;
    public String name;

    public void KMovieTemplate(){
       super();
       this.kmovieTemplateUrl = "";
       this.name = "";
       this.image = "";
    }
    public final String getImage(){
       return this.image;
    }
    public final int getKmovieTemplateId(){
       return this.kmovieTemplateId;
    }
    public final String getKmovieTemplateUrl(){
       return this.kmovieTemplateUrl;
    }
    public final String getName(){
       return this.name;
    }
    public final void setImage(String p0){
       this.image = p0;
    }
    public final void setKmovieTemplateId(int p0){
       this.kmovieTemplateId = p0;
    }
    public final void setKmovieTemplateUrl(String p0){
       this.kmovieTemplateUrl = p0;
    }
    public final void setName(String p0){
       this.name = p0;
    }
}
