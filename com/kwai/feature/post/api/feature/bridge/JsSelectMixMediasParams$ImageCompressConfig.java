package com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasParams$ImageCompressConfig;
import java.io.Serializable;
import java.lang.Object;

public class JsSelectMixMediasParams$ImageCompressConfig implements Serializable	// class@001375
{
    public int mMaxFileSize;
    public int mMaxHeight;
    public int mMaxWidth;
    public boolean mSupportGif;

    public void JsSelectMixMediasParams$ImageCompressConfig(){
       super();
       this.mMaxFileSize = Integer.MAX_VALUE;
       this.mMaxWidth = Integer.MAX_VALUE;
       this.mMaxHeight = Integer.MAX_VALUE;
       this.mSupportGif = false;
    }
}
