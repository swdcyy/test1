package com.yxcorp.gifshow.growth.activity.GrowthRouterActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import wkd.b;
import java.lang.String;
import kotlin.jvm.internal.a;
import oqa.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import cra.w;
import q87.c;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import nf6.f;

public final class GrowthRouterActivity extends GifshowActivity	// class@0012e9
{
    public final a y;

    public void GrowthRouterActivity(){
       super();
       Object obj = b.a(0xda2a5cb);
       a.o(obj, "Singleton.get\(KwaiGrowthRouter::class.java\)");
       this.y = obj;
    }
    public void f3(){
       if (PatchProxy.applyVoid(null, this, GrowthRouterActivity.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       w.C().s("GrowthRouterActivity", "onFinishedAsTheLastActivity", objArray);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, GrowthRouterActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthRouterActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (this.y.b(this, this.getIntent()) != 3) {
          this.finish();
       }
       return;
    }
}
