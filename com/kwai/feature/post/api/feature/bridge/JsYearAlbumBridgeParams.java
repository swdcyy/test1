package com.kwai.feature.post.api.feature.bridge.JsYearAlbumBridgeParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class JsYearAlbumBridgeParams implements Serializable	// class@00138f
{
    public String mActivity;
    public String mCallBack;
    public int mEnterType;
    public String mTaskId;
    public static final long serialVersionUID = 0xd0925b2edbd4d1ab;

    public void JsYearAlbumBridgeParams(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsYearAlbumBridgeParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsYearAlbumBridgeParams{, mTaskId=\'"+this.mTaskId+'''+", mEnterType="+this.mEnterType+", mActivity=\'"+this.mActivity+'''+'}';
    }
}
