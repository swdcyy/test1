package com.kwai.components.feedmodel.ProgressHighLightInfo;
import java.io.Serializable;
import java.lang.Object;

public class ProgressHighLightInfo implements Serializable	// class@000c34
{
    public String mDisplayText;
    public int mHighLightPos;
    public int mType;
    public static final long serialVersionUID = 0x3f89f3bf4c6e3ff2;

    public void ProgressHighLightInfo(){
       super();
    }
    public long getHighLightPosition(){
       return ((long)this.mHighLightPos * 1000);
    }
}
