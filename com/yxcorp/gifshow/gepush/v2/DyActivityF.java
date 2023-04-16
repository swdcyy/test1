package com.yxcorp.gifshow.gepush.v2.DyActivityF;
import com.yxcorp.gifshow.third.BaseDyActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.u1;
import n6b.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import o6b.a;
import com.kwai.android.common.bean.Channel;
import nsd.u;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class DyActivityF extends BaseDyActivity	// class@0012d6
{

    public void DyActivityF(){
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, DyActivityF.class, "1")) {
          return;
       }
       u1.G0(20);
       b.b(b.a, "GEPUSH_SUC", null, 2, null);
       RxBus.f.b(new a(Channel.MATRIX_GETUI, 0, 2, null));
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, DyActivityF.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
