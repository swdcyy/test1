package com.yxcorp.gifshow.widget.fitbar.FitNavigationBarRelativeLayout$1;
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
import p1.b;

public final class FitNavigationBarRelativeLayout$1 extends Lambda implements q	// class@001981
{
    public static final FitNavigationBarRelativeLayout$1 INSTANCE;

    static {
       FitNavigationBarRelativeLayout$1.INSTANCE = new FitNavigationBarRelativeLayout$1();
    }
    public void FitNavigationBarRelativeLayout$1(){
       super(3);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       this.invoke(p0, p1, p2);
       return l1.a;
    }
    public final void invoke(View p0,l p1,f3 p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, FitNavigationBarRelativeLayout$1.class, "1")) {
          return;
       }
       a.p(p0, "v");
       a.p(p1, "insets");
       a.p(p2, "padding");
       p0.setPadding(p0.getPaddingLeft(), p0.getPaddingTop(), p0.getPaddingRight(), (p1.f(2).d + p2.a()));
       return;
    }
}
