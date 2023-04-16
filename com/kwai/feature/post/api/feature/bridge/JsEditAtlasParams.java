package com.kwai.feature.post.api.feature.bridge.JsEditAtlasParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.ArrayList;

public class JsEditAtlasParams implements Serializable	// class@001333
{
    public String mActivityId;
    public Map mArgsMap;
    public String mBridgeSource;
    public String mCallBack;
    public String mDefaultEditPreviewTab;
    public ArrayList mImagePaths;
    public String mInitCaption;
    public boolean mIsReturnToWeb;
    public String mTag;
    public static final long serialVersionUID = 0x511af350783af6f6;

    public void JsEditAtlasParams(){
       super();
       this.mBridgeSource = "unknown";
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsEditAtlasParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "imagePaths: "+this.mImagePaths.toString()+"\n"+"tag:"+this.mTag+"\n"+"activityId: "+this.mActivityId+"\n"+"initCaption: "+this.mInitCaption+"\n"+"isReturnToWeb "+this.mIsReturnToWeb+"\n"+"callback: "+this.mCallBack+"\n";
    }
}
