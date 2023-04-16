package com.yxcorp.gifshow.media.model.EncodeConfig$SkipTranscodingConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class EncodeConfig$SkipTranscodingConfig implements Serializable	// class@001d0d
{
    public boolean mEnabled;
    public int mMaxBytes;
    public boolean mSupportAdvancedColorSpace;
    public static EncodeConfig$SkipTranscodingConfig b;
    public static final long serialVersionUID;

    public void EncodeConfig$SkipTranscodingConfig(){
       super();
    }
    public static EncodeConfig$SkipTranscodingConfig getDefaultSkipTranscodeConfig(){
       EncodeConfig$SkipTranscodingConfig obj = PatchProxy.apply(null, null, EncodeConfig$SkipTranscodingConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (EncodeConfig$SkipTranscodingConfig.b == null) {
          obj = new EncodeConfig$SkipTranscodingConfig();
          EncodeConfig$SkipTranscodingConfig.b = obj;
          obj.setEnabled(false);
          EncodeConfig$SkipTranscodingConfig.b.setMaxBytes(0x989680);
          EncodeConfig$SkipTranscodingConfig.b.setSupportAdvancedColorSpace(false);
       }
       return EncodeConfig$SkipTranscodingConfig.b;
    }
    public int getMaxBytes(){
       return this.mMaxBytes;
    }
    public boolean isEnabled(){
       return this.mEnabled;
    }
    public boolean isSupportAdvancedColorSpace(){
       return this.mSupportAdvancedColorSpace;
    }
    public void setEnabled(boolean p0){
       this.mEnabled = p0;
    }
    public void setMaxBytes(int p0){
       this.mMaxBytes = p0;
    }
    public void setSupportAdvancedColorSpace(boolean p0){
       this.mSupportAdvancedColorSpace = p0;
    }
}
