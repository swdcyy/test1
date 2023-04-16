package com.kwai.feature.post.api.feature.bridge.JsSetActionParam;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class JsSetActionParam implements Serializable	// class@00137d
{
    public String mPath;
    public String mViewId;

    public void JsSetActionParam(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsSetActionParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "viewId: "+this.mViewId+" mPath: "+this.mPath;
    }
}
