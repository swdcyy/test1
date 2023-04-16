package com.yxcorp.gifshow.third.DyActivityJF;
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

public class DyActivityJF extends BaseDyActivity	// class@001d8d
{

    public void DyActivityJF(){
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, DyActivityJF.class, "1")) {
          return;
       }
       u1.G0(22);
       b.b(b.a, "JPUSH_SUC", null, 2, null);
       RxBus.f.b(new a(Channel.MATRIX_JPUSH, 0, 2, null));
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, DyActivityJF.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
