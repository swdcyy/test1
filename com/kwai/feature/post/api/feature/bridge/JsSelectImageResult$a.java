package com.kwai.feature.post.api.feature.bridge.JsSelectImageResult$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class JsSelectImageResult$a	// class@00136d
{
    public String mBase64Image;
    public long mCreateTime;
    public String mFilePath;
    public String mFileType;
    public int mHeight;
    public String mOriginFilePath;
    public int mWidth;

    public void JsSelectImageResult$a(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsSelectImageResult$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ImageData{, mWidth="+this.mWidth+", mHeight="+this.mHeight+", mFilePath=\'"+this.mFilePath+'''+", mFileType=\'"+this.mFileType+'''+", mOriginFilePath=\'"+this.mOriginFilePath+'''+", mCreateTime="+this.mCreateTime+'}';
    }
}
