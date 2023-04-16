package com.yxcorp.gifshow.activity.SchemeActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uv8.p0;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import xh7.b;
import android.content.Context;
import fw8.x;
import qh7.b;
import qh7.a;
import wkd.b;
import com.yxcorp.gifshow.log.h;

public class SchemeActivity extends GifshowActivity	// class@001033
{
    public static SchemeActivity$a y;

    static {
       if (PatchProxy.applyVoid(null, null, SchemeActivity.class, "1")) {
       }else {
          p0.F();
       }
    }
    public void SchemeActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, SchemeActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "scheme-router";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SchemeActivity.class, "2")) {
          return;
       }
       super.onCreate(p0);
       Uri data = this.getIntent().getData();
       String str = (data != null)? data.toString(): "";
       a.b(new b(this, str), new x(this));
       return;
    }
    public final void u3(){
       if (PatchProxy.applyVoid(null, this, SchemeActivity.class, "3")) {
          return;
       }
       b.a(0x4b316083).p0("URI", true);
       this.finish();
       return;
    }
}
