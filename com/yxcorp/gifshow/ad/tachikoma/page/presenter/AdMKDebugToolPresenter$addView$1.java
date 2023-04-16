package com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKDebugToolPresenter$addView$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import uv8.h1;
import java.lang.CharSequence;
import e17.i;
import xf6.l;

public final class AdMKDebugToolPresenter$addView$1 extends Lambda implements p	// class@001848
{
    public static final AdMKDebugToolPresenter$addView$1 INSTANCE;

    static {
       AdMKDebugToolPresenter$addView$1.INSTANCE = new AdMKDebugToolPresenter$addView$1();
    }
    public void AdMKDebugToolPresenter$addView$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0.booleanValue(), p1.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0,boolean p1){
       if (PatchProxy.isSupport(AdMKDebugToolPresenter$addView$1.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, AdMKDebugToolPresenter$addView$1.class, "1")) {
          return;
       }
       if (p1) {
          h1.a.d("重新进入页面生效");
          l.h("KEY_DISABLE_PAGE_SCALE", p0);
       }
       return;
    }
}
