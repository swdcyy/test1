package com.kwai.yoda.slide.SwipeBackLayout$a;
import com.kwai.yoda.slide.a$c;
import com.kwai.yoda.slide.SwipeBackLayout;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import tz7.a;
import android.app.Activity;
import java.lang.reflect.Method;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import java.lang.Float;
import com.kwai.yoda.slide.a;
import java.lang.Boolean;
import java.util.Objects;

public class SwipeBackLayout$a extends a$c	// class@0012e5
{
    public final SwipeBackLayout a;

    public void SwipeBackLayout$a(SwipeBackLayout p0){
       this.a = p0;
       super();
    }
    public int a(View p0,int p1,int p2){
       if (PatchProxy.isSupport(SwipeBackLayout$a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, SwipeBackLayout$a.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return Math.min(p0.getWidth(), Math.max(p1, 0));
    }
    public int b(View p0){
       return this.a.k;
    }
    public void c(int p0){
       SwipeBackLayout$a uoa = SwipeBackLayout$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "5")) {
          return;
       }
       if (!p0) {
          SwipeBackLayout$a ta = this.a;
          if (ta.f - 0x3f800000 < 0) {
             SwipeBackLayout c = ta.c;
             if (!PatchProxy.applyVoidOneRefs(c, null, a.class, "1")) {
                Class[] uClassArray = new Class[0];
                Method declaredMeth = Activity.class.getDeclaredMethod("convertFromTranslucent", uClassArray);
                declaredMeth.setAccessible(true);
                Object[] objArray = new Object[0];
                declaredMeth.invoke(c, objArray);
             }
          }
       }
       return;
    }
    public void d(View p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(SwipeBackLayout$a.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, SwipeBackLayout$a.class, "2")) {
             return;
          }
       }
       SwipeBackLayout$a ta = this.a;
       SwipeBackLayout d = ta.d;
       if (p0 == d) {
          ta.f = Math.abs(((float)p1 / (float)(d.getWidth() + this.a.g.getIntrinsicWidth())));
          SwipeBackLayout$a ta1 = this.a;
          ta1.e = p1;
          ta1.invalidate();
          ta1 = this.a;
          if (ta1.f - 0x3f800000 >= 0 && !ta1.c.isFinishing()) {
             this.a.c.finish();
          }
       }
       return;
    }
    public void e(View p0,float p1,float p2){
       if (PatchProxy.isSupport(SwipeBackLayout$a.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, SwipeBackLayout$a.class, "3")) {
          return;
       }
       int width = p0.getWidth();
       if (p1 - 0x43fa0000 <= 0) {
          SwipeBackLayout$a ta = this.a;
          if (ta.f - 0x3f000000 <= 0) {
             ta.b.q(0, 0);
          label_0049 :
             this.a.invalidate();
             return;
          }
       }
       this.a.b.q((width + this.a.g.getIntrinsicWidth()), 0);
       goto label_0049 ;
    }
    public boolean f(View p0,int p1){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SwipeBackLayout$a uoa = SwipeBackLayout$a.class;
       if (PatchProxy.isSupport(uoa)) {
          p0 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (p0 != patchProxyRe) {
             return p0.booleanValue();
          }
       }
       SwipeBackLayout b = this.a.b;
       Objects.requireNonNull(b);
       a uoa1 = a.class;
       if (PatchProxy.isSupport(uoa1)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(1), Integer.valueOf(p1), b, uoa1, "32");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else if(b.j(p1) && (b.j[p1] & 1)){
             b1 = true;
          }else {
             b1 = false;
          }
       }else {
          goto label_0045 ;
       }
       SwipeBackLayout$a ta = this.a;
       if (ta.k != null && b1) {
          b = ta.c;
          if (!PatchProxy.applyVoidOneRefs(b, null, a.class, "2")) {
             a.a(b);
          }
          return 1;
       }else {
          return false;
       }
    }
}
