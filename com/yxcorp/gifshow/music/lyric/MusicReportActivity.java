package com.yxcorp.gifshow.music.lyric.MusicReportActivity;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class MusicReportActivity extends KwaiWebViewActivity	// class@002057
{
    public static final int K;

    public void MusicReportActivity(){
       super();
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, MusicReportActivity.class, "2")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(R.anim.arg_RES_7f0100f3, 0x7f01010d);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MusicReportActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
