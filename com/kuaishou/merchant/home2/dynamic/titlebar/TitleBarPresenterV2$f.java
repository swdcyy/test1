package com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2$f;
import qy5.b;
import com.kuaishou.merchant.home2.dynamic.titlebar.TitleBarPresenterV2;
import java.lang.Object;
import qy5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import jz3.a;
import android.graphics.Typeface;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.graphics.drawable.Drawable;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import zf6.j;

public final class TitleBarPresenterV2$f implements b	// class@001775
{
    public final TitleBarPresenterV2 a;

    public void TitleBarPresenterV2$f(TitleBarPresenterV2 p0){
       this.a = p0;
       super();
    }
    public int[] a(){
       return a.y(this);
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, TitleBarPresenterV2$f.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return TitleBarPresenterV2.W8(this.a).e();
    }
    public Typeface c(){
       return a.g(this);
    }
    public int d(){
       return 0;
    }
    public int[] e(){
       int[] obj = PatchProxy.apply(null, this, TitleBarPresenterV2$f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new int[]{0,0,n.c(this.a.Y8(), 12.00f),0};
       return obj;
    }
    public ViewGroup$LayoutParams f(){
       return a.x(this);
    }
    public ViewGroup$LayoutParams g(){
       LinearLayout$LayoutParams obj = PatchProxy.apply(null, this, TitleBarPresenterV2$f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinearLayout$LayoutParams(n.c(this.a.Y8(), 60.00f), n.c(this.a.Y8(), 0x41f00000));
       obj.setMargins(n.c(this.a.Y8(), 3.00f), n.c(this.a.Y8(), 3.00f), n.c(this.a.Y8(), 3.00f), n.c(this.a.Y8(), 3.00f));
       obj.gravity = 17;
       return obj;
    }
    public Typeface h(){
       return a.s(this);
    }
    public ViewGroup$LayoutParams i(){
       LinearLayout$LayoutParams obj = PatchProxy.apply(null, this, TitleBarPresenterV2$f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinearLayout$LayoutParams(-1, -2);
       obj.setMarginStart(n.c(this.a.Y8(), 6.00f));
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
       return 14.00f;
    }
    public int o(){
       Object obj = PatchProxy.apply(null, this, TitleBarPresenterV2$f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return TitleBarPresenterV2.W8(this.a).g();
    }
    public int p(){
       Object obj = PatchProxy.apply(null, this, TitleBarPresenterV2$f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return TitleBarPresenterV2.W8(this.a).f();
    }
    public Drawable q(){
       Context obj = PatchProxy.apply(null, this, TitleBarPresenterV2$f.class, "2");
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
       LinearLayout$LayoutParams obj = PatchProxy.apply(null, this, TitleBarPresenterV2$f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinearLayout$LayoutParams(n.c(this.a.Y8(), 16.00f), n.c(this.a.Y8(), 16.00f));
       obj.setMarginStart(n.c(this.a.Y8(), 12.00f));
       return obj;
    }
    public float u(){
       return 14.00f;
    }
    public String v(){
       return a.a(this);
    }
    public Drawable w(){
       Object obj = PatchProxy.apply(null, this, TitleBarPresenterV2$f.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TitleBarPresenterV2.W8(this.a).d();
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
