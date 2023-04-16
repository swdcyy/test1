package com.kuaishou.merchant.home2.home.titlebar.TitleBarPresenter$e;
import qy5.b;
import com.kuaishou.merchant.home2.home.titlebar.TitleBarPresenter;
import java.lang.Object;
import qy5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import jz3.a;
import android.graphics.Typeface;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.graphics.drawable.Drawable;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import zf6.j;

public final class TitleBarPresenter$e implements b	// class@0017e2
{
    public final TitleBarPresenter a;

    public void TitleBarPresenter$e(TitleBarPresenter p0){
       this.a = p0;
       super();
    }
    public int[] a(){
       return a.y(this);
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, TitleBarPresenter$e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return TitleBarPresenter.V8(this.a).e();
    }
    public Typeface c(){
       return a.g(this);
    }
    public int d(){
       return 0;
    }
    public int[] e(){
       int[] obj = PatchProxy.apply(null, this, TitleBarPresenter$e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new int[]{0,0,a1.e(12.00f),0};
       return obj;
    }
    public ViewGroup$LayoutParams f(){
       return a.x(this);
    }
    public ViewGroup$LayoutParams g(){
       return a.o(this);
    }
    public Typeface h(){
       return a.s(this);
    }
    public ViewGroup$LayoutParams i(){
       LinearLayout$LayoutParams obj = PatchProxy.apply(null, this, TitleBarPresenter$e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinearLayout$LayoutParams(-1, -2);
       obj.setMarginStart(a1.e(6.00f));
       return obj;
    }
    public int j(){
       return 0x7f102c97;
    }
    public int[] k(){
       return a.p(this);
    }
    public ViewGroup$LayoutParams l(){
       return a.h(this);
    }
    public int m(){
       return a.u(this);
    }
    public float n(){
       return a.r(this);
    }
    public int o(){
       Object obj = PatchProxy.apply(null, this, TitleBarPresenter$e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return TitleBarPresenter.V8(this.a).g();
    }
    public int p(){
       Object obj = PatchProxy.apply(null, this, TitleBarPresenter$e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return TitleBarPresenter.V8(this.a).f();
    }
    public Drawable q(){
       Context obj = PatchProxy.apply(null, this, TitleBarPresenter$e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.getContext();
       a.m(obj);
       return j.k(obj, 0x7f081719);
    }
    public int r(){
       return a.w(this);
    }
    public Drawable s(){
       return a.v(this);
    }
    public ViewGroup$LayoutParams t(){
       LinearLayout$LayoutParams obj = PatchProxy.apply(null, this, TitleBarPresenter$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinearLayout$LayoutParams(a1.e(16.00f), a1.e(16.00f));
       obj.setMarginStart(a1.e(12.00f));
       return obj;
    }
    public float u(){
       return a.f(this);
    }
    public String v(){
       return a.a(this);
    }
    public Drawable w(){
       Object obj = PatchProxy.apply(null, this, TitleBarPresenter$e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TitleBarPresenter.V8(this.a).d();
    }
    public int x(){
       return a.m(this);
    }
    public int y(){
       return a.z(this);
    }
    public int z(){
       return a.i(this);
    }
}
