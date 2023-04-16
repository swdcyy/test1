package com.kwai.feature.post.api.feature.bridge.JsPostAtlasParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.ArrayList;

public class JsPostAtlasParams implements Serializable	// class@00135d
{
    public String mActivityId;
    public Map mArgsMap;
    public String mCallBack;
    public ArrayList mImagePaths;
    public String mMusicId;
    public int mMusicType;
    public String mSource;
    public String mTag;
    public static final long serialVersionUID = 0x7cf97e9f2d9f7a39;

    public void JsPostAtlasParams(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsPostAtlasParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "imagePaths: "+this.mImagePaths.toString()+", "+"musicId: "+this.mMusicId+", "+"musicType: "+this.mMusicType+", "+"tag:"+this.mTag+", "+"activityId: "+this.mActivityId+", "+"source: "+this.mSource+", "+"callback: "+this.mCallBack+", ";
    }
}
