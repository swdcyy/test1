package com.yxcorp.gifshow.ad.award.scheme.NeoSchemeDispatchActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.ad.award.scheme.NeoSchemeDispatchActivity$a;
import nsd.u;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import kotlin.jvm.internal.a;
import android.net.Uri;
import yx.j0;
import com.yxcorp.gifshow.commercial.bridge.model.NeoTaskLiveParam;
import com.yxcorp.gifshow.commercial.bridge.model.NeoTaskParam;
import brd.t;
import ul9.a;
import t45.d;
import brd.z;
import jy8.a;
import erd.a;
import jy8.d;
import erd.g;
import crd.b;

public final class NeoSchemeDispatchActivity extends GifshowActivity	// class@001529
{
    public HashMap y;
    public static final NeoSchemeDispatchActivity$a z;

    static {
       NeoSchemeDispatchActivity.z = new NeoSchemeDispatchActivity$a(null);
    }
    public void NeoSchemeDispatchActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, NeoSchemeDispatchActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       Object[] objArray;
       NeoSchemeDispatchActivity neoSchemeDis = NeoSchemeDispatchActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, neoSchemeDis, "1")) {
          return;
       }
       super.onCreate(p0);
       Intent intent = this.getIntent();
       a.o(intent, "intent");
       Uri data = intent.getData();
       int i = 0;
       if (data != null) {
          a.o(data, "it");
          if (a.g(data.getHost(), "neo")) {
          label_0031 :
             i = 0;
             String str = "NeoSchemeDispatchActivity";
             if (data == null) {
                objArray = new Object[i];
                j0.c(str, "only support neo host!", objArray);
                this.finish();
                return;
             }else {
                String path = data.getPath();
                if (path == null || (path.hashCode() == 0x2c9019b && path.equals("/live"))) {
                   if (!PatchProxy.applyVoidOneRefs(data, this, neoSchemeDis, "2")) {
                      NeoTaskLiveParam neoTaskLiveP = new NeoTaskLiveParam();
                      neoTaskLiveP.mAwardType = 2;
                      neoTaskLiveP.mTimeout = 3000;
                      neoTaskLiveP.mNeoParams = data.getQueryParameter("neoParams");
                      neoTaskLiveP.mFromSource = data.getQueryParameter("from");
                      neoTaskLiveP.parseNeoParamsInfo();
                      a.f(this, "neo_live", 0, 0, 12, null).observeOn(d.a).doFinally(new a(this)).subscribe(new d(this, neoTaskLiveP));
                   }
                }else {
                   objArray = new Object[i];
                   j0.c(str, "other path is not currently supported!", objArray);
                   this.finish();
                }
                return;
             }
          }
       }
       data = i;
       goto label_0031 ;
    }
}
