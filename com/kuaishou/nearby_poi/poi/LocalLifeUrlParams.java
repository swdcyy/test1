package com.kuaishou.nearby_poi.poi.LocalLifeUrlParams;
import java.io.Serializable;
import java.lang.Object;

public class LocalLifeUrlParams implements Serializable	// class@000a13
{
    public String mDesc;
    public String mTag;
    public String mUrl;
    public static final long serialVersionUID = 0xeb0dfcbd4ce06ab8;

    public void LocalLifeUrlParams(){
       super();
       this.mTag = "";
       this.mUrl = "";
       this.mDesc = "";
    }
}
