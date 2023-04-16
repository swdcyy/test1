package com.yxcorp.gifshow.widget.FitNavigationBarTableLayout$1;
import msd.q;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import android.view.View;
import a2.l;
import lnc.f3;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import p1.b;

public final class FitNavigationBarTableLayout$1 extends Lambda implements q	// class@001847
{
    public static final FitNavigationBarTableLayout$1 INSTANCE;

    static {
       FitNavigationBarTableLayout$1.INSTANCE = new FitNavigationBarTableLayout$1();
    }
    public void FitNavigationBarTableLayout$1(){
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       this.invoke(p0, p1, p2);
       return l1.a;
    }
    public final void invoke(View p0,l p1,f3 p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, FitNavigationBarTableLayout$1.class, "1")) {
          return;
       }
       a.p(p0, "v");
       a.p(p1, "insets");
       a.p(p2, "<anonymous parameter 2>");
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       layoutParams.bottomMargin = p1.f(2).d;
       p0.setLayoutParams(layoutParams);
       return;
    }
}
