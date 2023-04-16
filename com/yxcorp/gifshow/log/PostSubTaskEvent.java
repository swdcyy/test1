package com.yxcorp.gifshow.log.PostSubTaskEvent;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class PostSubTaskEvent extends Enum	// class@001aef
{
    public String mName;
    public static final PostSubTaskEvent[] $VALUES;
    public static final PostSubTaskEvent ENCODE_CLIP_MUSIC;
    public static final PostSubTaskEvent ENCODE_COPY;
    public static final PostSubTaskEvent ENCODE_EVENT;
    public static final PostSubTaskEvent ENCODE_EXPORT;
    public static final PostSubTaskEvent ENCODE_LOAD_VISION_ENGINE_SO;
    public static final PostSubTaskEvent ENCODE_RENDER_IMAGE;
    public static final PostSubTaskEvent UPLOAD_ASSET;
    public static final PostSubTaskEvent UPLOAD_COVER;
    public static final PostSubTaskEvent UPLOAD_EVENT;
    public static final PostSubTaskEvent UPLOAD_PUBLISH;

    static {
       PostSubTaskEvent[] postSubTaskE = new PostSubTaskEvent[10];
       PostSubTaskEvent postSubTaskE1 = new PostSubTaskEvent("ENCODE_EVENT", 0, "encodeTask");
       PostSubTaskEvent.ENCODE_EVENT = postSubTaskE1;
       postSubTaskE[0] = postSubTaskE1;
       postSubTaskE1 = new PostSubTaskEvent("ENCODE_LOAD_VISION_ENGINE_SO", 1, "visionEngineSo");
       PostSubTaskEvent.ENCODE_LOAD_VISION_ENGINE_SO = postSubTaskE1;
       postSubTaskE[1] = postSubTaskE1;
       postSubTaskE1 = new PostSubTaskEvent("ENCODE_CLIP_MUSIC", 2, "clipMusic");
       PostSubTaskEvent.ENCODE_CLIP_MUSIC = postSubTaskE1;
       postSubTaskE[2] = postSubTaskE1;
       postSubTaskE1 = new PostSubTaskEvent("ENCODE_EXPORT", 3, "exportVideo");
       PostSubTaskEvent.ENCODE_EXPORT = postSubTaskE1;
       postSubTaskE[3] = postSubTaskE1;
       postSubTaskE1 = new PostSubTaskEvent("ENCODE_COPY", 4, "copyVideo");
       PostSubTaskEvent.ENCODE_COPY = postSubTaskE1;
       postSubTaskE[4] = postSubTaskE1;
       postSubTaskE1 = new PostSubTaskEvent("ENCODE_RENDER_IMAGE", 5, "renderImage");
       PostSubTaskEvent.ENCODE_RENDER_IMAGE = postSubTaskE1;
       postSubTaskE[5] = postSubTaskE1;
       postSubTaskE1 = new PostSubTaskEvent("UPLOAD_EVENT", 6, "uploadTask");
       PostSubTaskEvent.UPLOAD_EVENT = postSubTaskE1;
       postSubTaskE[6] = postSubTaskE1;
       postSubTaskE1 = new PostSubTaskEvent("UPLOAD_ASSET", 7, "uploadAsset");
       PostSubTaskEvent.UPLOAD_ASSET = postSubTaskE1;
       postSubTaskE[7] = postSubTaskE1;
       postSubTaskE1 = new PostSubTaskEvent("UPLOAD_COVER", 8, "uploadCover");
       PostSubTaskEvent.UPLOAD_COVER = postSubTaskE1;
       postSubTaskE[8] = postSubTaskE1;
       postSubTaskE1 = new PostSubTaskEvent("UPLOAD_PUBLISH", 9, "uploadPublish");
       PostSubTaskEvent.UPLOAD_PUBLISH = postSubTaskE1;
       postSubTaskE[9] = postSubTaskE1;
       PostSubTaskEvent.$VALUES = postSubTaskE;
    }
    public void PostSubTaskEvent(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static PostSubTaskEvent valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostSubTaskEvent.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PostSubTaskEvent.class, p0);
    }
    public static PostSubTaskEvent[] values(){
       Object obj = PatchProxy.apply(null, null, PostSubTaskEvent.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PostSubTaskEvent.$VALUES.clone();
    }
    public final String getMName(){
       return this.mName;
    }
    public final String getValue(){
       return this.mName;
    }
    public final void setMName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostSubTaskEvent.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mName = p0;
       return;
    }
}
