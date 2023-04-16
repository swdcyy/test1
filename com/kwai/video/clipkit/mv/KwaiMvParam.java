package com.kwai.video.clipkit.mv.KwaiMvParam;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.clipkit.ClipKitUtils;
import com.google.gson.Gson;

public class KwaiMvParam	// class@001ac9
{
    public AllMvReplaceableAreaDetail allDetails;
    public ClipkitSdk$ClipKitBackgroundVideo bgVideo;
    public int blendMode;
    public String configJsonPath;
    public int encyptedMethod;
    public int minVersion;
    public List mvPhotoInfos;
    public int renderOrder;
    public ClipkitSdk$ClipKitBackgroundVideo subBgVideo;
    public String templateDirectory;
    public int type;

    public void KwaiMvParam(){
       super();
       this.type = 0;
    }
    public KwaiMvParam deserialize(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiMvParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ClipKitUtils.COMMON_GSON.h(p0, KwaiMvParam.class);
    }
    public String serialize(){
       Object obj = PatchProxy.apply(null, this, KwaiMvParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ClipKitUtils.COMMON_GSON.q(this);
    }
}
