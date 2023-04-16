package com.yxcorp.gifshow.lelink.floatbutton.FloatWindowView;
import android.widget.FrameLayout;
import android.content.Context;
import lnc.a1;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.utility.n;
import lnc.d2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.view.WindowManager$LayoutParams;
import android.view.WindowManager;
import com.yxcorp.utility.SystemUtil;
import java.lang.Math;
import com.yxcorp.gifshow.lelink.floatbutton.FloatWindowView$a;
import com.kwai.robust.PatchProxyResult;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.lelink.floatbutton.a;

public final class FloatWindowView extends FrameLayout	// class@001a42
{
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public WindowManager$LayoutParams g;
    public WindowManager h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public boolean o;
    public FloatWindowView$a p;
    public int q;
    public int r;
    public View s;
    public static long t;

    public void FloatWindowView(Context p0,int p1,int p2,int p3,int p4,int p5){
       super(p0);
       int i = a1.e(19.00f);
       this.e = i;
       int i1 = a1.e(54.00f);
       this.f = i1;
       boolean b = false;
       this.o = b;
       this.q = p1;
       p1 = n.A(a.a().a());
       this.b = p1;
       int i2 = d2.f();
       this.c = i2;
       this.d = d2.e();
       if (PatchProxy.isSupport(FloatWindowView.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, FloatWindowView.class, "1")) {
          label_0120 :
             return;
          }
       }
       FloatWindowView.t = SystemClock.elapsedRealtime();
       View view = a.c(p0, this.q, null);
       this.addView(view);
       this.s = view.findViewById(0x7f0a0f14);
       this.g = new WindowManager$LayoutParams();
       this.h = a.a().a().getSystemService("window");
       view.type = (SystemUtil.a(26))? 2038: 2003;
       FloatWindowView tg = this.g;
       tg.format = -3;
       tg.flags = 520;
       tg.gravity = 51;
       tg.width = p2;
       tg.height = p3;
       if (!PatchProxy.isSupport(FloatWindowView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p4), Integer.valueOf(p5), this, FloatWindowView.class, "3")) {
          tg = this.g;
          tg.x = Math.max(p4, ((i2 - tg.width) - i));
          tg.y = Math.max(p5, (i1 - p1));
       }
       tg = this.p;
       if (tg != null) {
          FloatWindowView tg1 = this.g;
          tg.a(tg1.x, tg1.y);
          tg1 = this.g;
          this.p.b(tg1.width, tg1.height);
       }
       tg = this.s;
       a uoa = PatchProxy.apply(null, this, FloatWindowView.class, "4");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a(this);
       }
       tg.setOnTouchListener(uoa);
       goto label_0120 ;
    }
    public void setFloatingWindowListener(FloatWindowView$a p0){
       this.p = p0;
    }
    public void setShrinkWidth(int p0){
       this.r = p0;
    }
}
