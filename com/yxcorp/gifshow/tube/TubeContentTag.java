package com.yxcorp.gifshow.tube.TubeContentTag;
import java.io.Serializable;
import com.yxcorp.gifshow.tube.TubeContentTag$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;

public final class TubeContentTag implements Serializable	// class@001e08
{
    public String mMode;
    public String mTagIconUrl;
    public String mTagId;
    public String mTagName;
    public static final TubeContentTag$a Companion;
    public static final long serialVersionUID;

    static {
       TubeContentTag.Companion = new TubeContentTag$a(null);
    }
    public void TubeContentTag(){
       super();
    }
    public final String getMMode(){
       return this.mMode;
    }
    public final String getMTagIconUrl(){
       return this.mTagIconUrl;
    }
    public final String getMTagId(){
       return this.mTagId;
    }
    public final String getMTagName(){
       return this.mTagName;
    }
    public final void setMMode(String p0){
       this.mMode = p0;
    }
    public final void setMTagIconUrl(String p0){
       this.mTagIconUrl = p0;
    }
    public final void setMTagId(String p0){
       this.mTagId = p0;
    }
    public final void setMTagName(String p0){
       this.mTagName = p0;
    }
}
