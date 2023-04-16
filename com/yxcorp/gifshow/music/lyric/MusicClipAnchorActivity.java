package com.yxcorp.gifshow.music.lyric.MusicClipAnchorActivity;
import com.yxcorp.gifshow.music.lyric.MusicClipActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import a46.a;
import a46.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import android.content.res.Resources;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.content.Intent;

public class MusicClipAnchorActivity extends MusicClipActivity	// class@002056
{

    public void MusicClipAnchorActivity(){
       super();
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, MusicClipAnchorActivity.class, "2")) {
          return;
       }
       d.a(0x500192b6).reset();
       super.finish();
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MusicClipAnchorActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(MusicClipAnchorActivity.class, null);
       return objectsByTag;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MusicClipAnchorActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onNewIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicClipAnchorActivity.class, "1")) {
          return;
       }
       super.onNewIntent(p0);
       if (p0 != null) {
          p0.putExtra("EXTRA_IS_FROM_CLIP", false);
          this.setResult(-1, p0);
          this.finish();
       }
       return;
    }
}
