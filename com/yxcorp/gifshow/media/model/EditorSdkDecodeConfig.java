package com.yxcorp.gifshow.media.model.EditorSdkDecodeConfig;
import java.lang.Object;

public class EditorSdkDecodeConfig	// class@001d08
{
    public String mCvdCacheOn;
    public String mCvdType;
    public String mHevcDecoderName;
    public String mTvdType;

    public void EditorSdkDecodeConfig(){
       super();
       this.mTvdType = "sw";
       this.mCvdType = "sw";
       this.mCvdCacheOn = "false";
       this.mHevcDecoderName = "default";
    }
}
