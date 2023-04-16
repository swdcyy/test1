package com.yxcorp.gifshow.growth.pad.PadRequestPresenter$pageListReference$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import kotlin.jvm.internal.a;
import ida.b;

public final class PadRequestPresenter$pageListReference$2 extends Lambda implements a	// class@001471
{
    public static final PadRequestPresenter$pageListReference$2 INSTANCE;

    static {
       PadRequestPresenter$pageListReference$2.INSTANCE = new PadRequestPresenter$pageListReference$2();
    }
    public void PadRequestPresenter$pageListReference$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final WeakReference invoke(){
       b obj = PatchProxy.apply(null, this, PadRequestPresenter$pageListReference$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a(-859095268);
       a.o(obj, "PluginManager.get\(FeaturedPlugin::class.java\)");
       return obj.NP();
    }
}
