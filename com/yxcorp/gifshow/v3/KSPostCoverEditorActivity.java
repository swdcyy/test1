package com.yxcorp.gifshow.v3.KSPostCoverEditorActivity;
import com.yxcorp.gifshow.v3.EditorActivity;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.res.Resources;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public final class KSPostCoverEditorActivity extends EditorActivity	// class@000d21
{
    public HashMap p1;

    public void KSPostCoverEditorActivity(){
       super();
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KSPostCoverEditorActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(KSPostCoverEditorActivity.class, null);
       return objectsByTag;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, KSPostCoverEditorActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
