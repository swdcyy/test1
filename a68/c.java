package a68.c;
import ma8.s;
import com.mini.app.model.page.LaunchPageInfo;
import e68.a;
import h88.c;
import java.lang.Object;
import k68.a;
import com.mini.app.runtime.f;
import k68.o;
import com.mini.app.miniapp.MiniApp;
import com.mini.app.activity.MiniAppActivity0;
import mh8.b$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wi8.c;
import com.mini.d;
import a68.b;
import java.lang.Runnable;
import android.app.Activity;
import zi8.c;
import a68.a;
import java.util.Objects;
import qj8.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.e;
import android.view.View$OnTouchListener;
import java.util.List;
import java.util.Map;
import com.mini.widget.capsule.a;
import com.mini.widget.activity.MiniActivity;
import yd8.b;
import m68.m;
import java.lang.Integer;
import com.google.common.base.Optional;
import java.lang.Boolean;
import om.f$b;
import hm.a;
import java.lang.CharSequence;
import om.f;
import com.kwai.robust.PatchProxyResult;

public abstract class c implements s	// class@00003f
{
    public final f a;
    public final String b;
    public final MiniAppActivity0 c;
    public final f d;
    public final LaunchPageInfo e;
    public n1 f;
    public int g;

    public void c(int p0,LaunchPageInfo p1,a p2,c p3){
       super();
       this.g = p0;
       f uof = a.d.b();
       this.a = uof;
       this.c = uof.b().d();
       this.b = p1.b;
       this.d = uof.B;
       this.e = p1;
    }
    public void a(b$a p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, str)) {
          return;
       }
       this.f = p0.c;
       d.v().X1(new b(p0), 3000);
       if (c.b(this.c)) {
          c tc = this.c;
          c tb = this.b;
          a uoa = new a(this, p0);
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoidTwoRefs(tb, uoa, tc, MiniAppActivity0.class, "64")) {
             MiniAppActivity0 v = tc.v;
             if (v == null || (!PatchProxy.applyVoidTwoRefs(tb, uoa, v, b.class, str) && c.b(v.a))) {
                if (v.b != null) {
                   View view = a.c(LayoutInflater.from(v.a), R.layout.arg_RES_7f0d0f73, v.b, false);
                   view.setOnTouchListener(e.b);
                   view.setTag(tb);
                   v.b.addView(view);
                   v.c.add(tb);
                   v.d.put(tb, uoa);
                }
                a uoa1 = v.a.N2();
                if (uoa1 != null) {
                   uoa1.setMoreBtnClickable(false);
                }
             }
          }
       }
       return;
    }
    public void b(b p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "5")) {
          return;
       }
       this.e(this.c, this.b, false);
       if (!this.f(this.c)) {
          p0.a = 0x4a76e;
          p0.b = "app not in foreground";
       }else {
          m om = this.g();
          if (p0 != null && (om != null && !om.g())) {
             p0.a = Optional.fromNullable(om.d()).or(Integer.valueOf(0x4a77d)).intValue();
             p0.b = om.e();
          }
       }
       p1.accept(p0);
       return;
    }
    public void c(Integer p0,c p1,b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "6")) {
          return;
       }
       p1.accept(p2);
       this.e(this.c, this.b, true);
       return;
    }
    public void d(){
    }
    public final void e(MiniAppActivity0 p0,String p1,boolean p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, c.class, "4")) {
          return;
       }
       if (c.b(p0)) {
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(p1, p0, MiniAppActivity0.class, "65")) {
             MiniAppActivity0 v = p0.v;
             if (v != null) {
                v.a(p1);
             }
          }
       }
       if (p2 && this.f(p0)) {
          f$b uob = a.a();
          uob.b("Õ¯¬Á“Ï≥££¨«Î‘Ÿ¥Œ≥¢ ‘");
          uob.l = true;
          f.d(uob);
       }
       return;
    }
    public boolean f(MiniAppActivity0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && p0.f3())? true: false;
       return b;
    }
    public abstract m g();
}
