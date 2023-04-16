package com.yxcorp.gifshow.moment_downloader.model.MomentPublishPageConfig;
import java.io.Serializable;
import java.lang.Object;

public class MomentPublishPageConfig implements Serializable	// class@001fc5
{
    public int mAtMaxNum;
    public boolean mDisableSetVisibility;
    public int mTagMaxNum;
    public static final long serialVersionUID = 0xc65537d41677ecaa;

    public void MomentPublishPageConfig(){
       super();
       this.mAtMaxNum = 10;
       this.mTagMaxNum = 3;
    }
}
