package com.kwai.feature.post.api.feature.bridge.JsSelectImageResult;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class JsSelectImageResult implements Serializable	// class@00136e
{
    public List mImageDatas;
    public final int mResult;
    public static final long serialVersionUID = 0xcef6f64535d47bf8;

    public void JsSelectImageResult(int p0){
       super();
       this.mResult = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsSelectImageResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsSelectImageResult{mResult="+this.mResult+", mImageDatas="+this.mImageDatas+'}';
    }
}
