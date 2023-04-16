package com.yxcorp.gifshow.model.ExtractFrameVerify;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class ExtractFrameVerify	// class@001e0f
{
    public int mMaxFragmeNum;
    public int mNeedExtract;
    public String mPhotoHeight;
    public String mPhotoWidth;
    public float mQuality;

    public void ExtractFrameVerify(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ExtractFrameVerify.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ExtractFrameVerify{mNeedExtract="+this.mNeedExtract+", mQuality="+this.mQuality+", mPhotoWidth=\'"+this.mPhotoWidth+'''+", mPhotoHeight=\'"+this.mPhotoHeight+'''+", mMaxFragmeNum="+this.mMaxFragmeNum+'}';
    }
}
