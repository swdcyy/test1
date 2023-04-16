package com.yxcorp.gifshow.detail.post.bubble.data.NotifyRecoBubbleInfo;
import java.io.Serializable;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.String;
import java.lang.Integer;

public final class NotifyRecoBubbleInfo implements Serializable	// class@0016ae
{
    public Drawable iconDrawable;
    public String iconUrl;
    public String materialId;
    public String photoId;
    public String schemeUrl;
    public String subTitle;
    public String title;
    public Integer type;

    public void NotifyRecoBubbleInfo(){
       super();
    }
    public final Drawable getIconDrawable(){
       return this.iconDrawable;
    }
    public final String getIconUrl(){
       return this.iconUrl;
    }
    public final String getMaterialId(){
       return this.materialId;
    }
    public final String getPhotoId(){
       return this.photoId;
    }
    public final String getSchemeUrl(){
       return this.schemeUrl;
    }
    public final String getSubTitle(){
       return this.subTitle;
    }
    public final String getTitle(){
       return this.title;
    }
    public final Integer getType(){
       return this.type;
    }
    public final void setIconDrawable(Drawable p0){
       this.iconDrawable = p0;
    }
    public final void setIconUrl(String p0){
       this.iconUrl = p0;
    }
    public final void setMaterialId(String p0){
       this.materialId = p0;
    }
    public final void setPhotoId(String p0){
       this.photoId = p0;
    }
    public final void setSchemeUrl(String p0){
       this.schemeUrl = p0;
    }
    public final void setSubTitle(String p0){
       this.subTitle = p0;
    }
    public final void setTitle(String p0){
       this.title = p0;
    }
    public final void setType(Integer p0){
       this.type = p0;
    }
}
