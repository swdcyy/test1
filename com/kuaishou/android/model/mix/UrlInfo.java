package com.kuaishou.android.model.mix.UrlInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public final class UrlInfo implements Serializable	// class@000e22
{
    public String cdn;
    public String url;

    public void UrlInfo(){
       super();
    }
    public final String getCdn(){
       return this.cdn;
    }
    public final String getUrl(){
       return this.url;
    }
    public final void setCdn(String p0){
       this.cdn = p0;
    }
    public final void setUrl(String p0){
       this.url = p0;
    }
}
