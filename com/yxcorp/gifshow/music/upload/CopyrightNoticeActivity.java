package com.yxcorp.gifshow.music.upload.CopyrightNoticeActivity;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import com.yxcorp.gifshow.webview.api.WebViewFragment$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.music.upload.MusicChooserFragment;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import android.content.res.Resources;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.content.Intent;
import java.lang.Integer;

public class CopyrightNoticeActivity extends KwaiWebViewActivity	// class@00207a
{

    public void CopyrightNoticeActivity(){
       super();
    }
    public WebViewFragment$d C1(){
       Object obj = PatchProxy.apply(null, this, CopyrightNoticeActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new WebViewFragment$d(new MusicChooserFragment(), 2);
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, CopyrightNoticeActivity.class, "3")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(R.anim.arg_RES_7f0100f3, 0x7f01010d);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, CopyrightNoticeActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(CopyrightNoticeActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, CopyrightNoticeActivity.class, "2")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (p0 == 1002 && p1 == -1) {
          this.setResult(-1);
          this.finish();
       }
       return;
    }
}
