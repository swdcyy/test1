package com.kuaishou.live.external.lite.LiteLazyLoadRecommendBarPresenter$DelegatePresenter$realPresenter$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import kotlin.jvm.internal.a;
import u33.h;
import os5.j;

public final class LiteLazyLoadRecommendBarPresenter$DelegatePresenter$realPresenter$2 extends Lambda implements a	// class@001ba1
{
    public static final LiteLazyLoadRecommendBarPresenter$DelegatePresenter$realPresenter$2 INSTANCE;

    static {
       LiteLazyLoadRecommendBarPresenter$DelegatePresenter$realPresenter$2.INSTANCE = new LiteLazyLoadRecommendBarPresenter$DelegatePresenter$realPresenter$2();
    }
    public void LiteLazyLoadRecommendBarPresenter$DelegatePresenter$realPresenter$2(){
       super(0);
    }
    public final PresenterV2 invoke(){
       b obj = PatchProxy.applyWithListener(null, this, LiteLazyLoadRecommendBarPresenter$DelegatePresenter$realPresenter$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a(0x7357d123);
       a.o(obj, "PluginManager.get\(LiveLi¡­PluginGetter::class.java\)");
       PatchProxy.onMethodExit(LiteLazyLoadRecommendBarPresenter$DelegatePresenter$realPresenter$2.class, "1");
       return obj.Ie().tV();
    }
    public Object invoke(){
       return this.invoke();
    }
}
