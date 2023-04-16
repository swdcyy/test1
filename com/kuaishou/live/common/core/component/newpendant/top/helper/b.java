package com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import java.lang.Boolean;
import java.lang.String;
import java.lang.reflect.Type;
import java.lang.Object;
import com.kwai.framework.abtest.f;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.b;
import lnc.a1;
import bld.c;
import xs5.a;
import xp5.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.smile.gifmaker.mvps.presenter.PresenterV2$b;
import android.view.View;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.List;
import com.kuaishou.live.common.core.component.newpendant.top.helper.a;
import java.util.Comparator;
import java.util.Collections;
import bv1.c;

public class b	// class@0016cb
{
    public static final boolean a;
    public static final int b;

    static {
       b.a = f.b("enableLiveInteract", Boolean.class, Boolean.TRUE).booleanValue();
       b.b = 0x7f0a224a;
    }
    public void b(){
       super();
    }
    public static Drawable a(){
       Object obj = PatchProxy.apply(null, null, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.b(KwaiRadiusStyles.FULL);
    }
    public static Drawable b(KwaiRadiusStyles p0){
       b obj = PatchProxy.applyOneRefs(p0, null, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       obj.v(a1.a(R.color.arg_RES_7f060846));
       obj.g(p0);
       return obj.a();
    }
    public static boolean c(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       if (p0.e.f()) {
          return false;
       }
       return true;
    }
    public static boolean d(PresenterV2 p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefsWithListener(p0, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PresenterV2$b a = p0.j.a;
       b = false;
       if (a == null) {
          PatchProxy.onMethodExit(b.class, "2");
          return b;
       }else {
          a = a.getTag(b.b);
          if (a instanceof Boolean && a.booleanValue()) {
             b = true;
          }
          PatchProxy.onMethodExit(b.class, "2");
          return b;
       }
    }
    public static void e(View p0,int p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, b.class, "9")) {
          return;
       }
       if (p0.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
          layoutParams.setMargins(p1, 0, p2, 0);
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
    public static void f(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "7")) {
          return;
       }
       Collections.sort(p0, a.b);
       return;
    }
    public static void g(List p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uob, "8")) {
          return;
       }
       Collections.sort(p0, new c(p1));
       return;
    }
    public static void h(boolean p0,View p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, null, uob, "1")) {
          return;
       }
       p1.setTag(b.b, Boolean.valueOf((p0 ^ 0x01)));
       return;
    }
}
