package com.yxcorp.gifshow.postfont.model.FontConfigExtra;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public final class FontConfigExtra implements Serializable	// class@001098
{
    public int androidLineSpace;
    public String coverSelectedImageName;
    public String fontFileFullName;
    public String fontRealName;
    public String statisticsName;

    public void FontConfigExtra(){
       super();
    }
    public final int getAndroidLineSpace(){
       return this.androidLineSpace;
    }
    public final String getCoverSelectedImageName(){
       return this.coverSelectedImageName;
    }
    public final String getFontFileFullName(){
       return this.fontFileFullName;
    }
    public final String getFontRealName(){
       return this.fontRealName;
    }
    public final String getStatisticsName(){
       return this.statisticsName;
    }
    public final void setAndroidLineSpace(int p0){
       this.androidLineSpace = p0;
    }
    public final void setCoverSelectedImageName(String p0){
       this.coverSelectedImageName = p0;
    }
    public final void setFontFileFullName(String p0){
       this.fontFileFullName = p0;
    }
    public final void setFontRealName(String p0){
       this.fontRealName = p0;
    }
    public final void setStatisticsName(String p0){
       this.statisticsName = p0;
    }
}
