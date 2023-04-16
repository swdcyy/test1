package com.yxcorp.gifshow.model.ExtractFrameAttribute;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class ExtractFrameAttribute	// class@001e09
{
    public int mNeedExtract;
    public float mQuality;
    public float maxFileSize;

    public void ExtractFrameAttribute(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ExtractFrameAttribute.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ExtractFrameAttribute{mNeedExtract="+this.mNeedExtract+", maxFileSize="+this.maxFileSize+", mQuality="+this.mQuality+'}';
    }
}
