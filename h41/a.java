package h41.a;
import h41.b$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import crd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h41.b;
import kotlin.jvm.internal.a;
import zp5.a;
import h41.c;
import java.util.Objects;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import java.lang.Boolean;
import h41.a$a;
import crd.b;
import ok.h;
import lnc.b9;
import fq5.b;
import qrd.l1;

public class a extends PresenterV2 implements b$a	// class@00261c
{
    public b p;
    public a q;
    public b r;

    public void a(){
       super();
       this.q = new a();
    }
    public final void E8(){
       b a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "4")) {
          return;
       }
       a tp = this.p;
       boolean b = false;
       if (tp != null) {
          if (!PatchProxy.applyVoid(objArray, tp, b.class, "2")) {
             b b1 = tp.b;
             if (b1 == null) {
                a.S("mFragmentService");
             }
             if (b1.a()) {
                tp.a();
                tp.e = true;
                tp.f = b;
             }
             if (tp.d != null && (!PatchProxy.applyVoid(objArray, tp, b.class, "6") && tp.a != null)) {
                tp.g = new c(tp);
                a = tp.a;
                a.m(a);
                b g = tp.g;
                Objects.requireNonNull(g, "null cannot be cast to non-null type com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayListener");
                a.P4(g);
             }
          }
       }else {
          this.x(b);
       }
       return;
    }
    public final void J8(){
       b a;
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       a tp = this.p;
       boolean b = false;
       if (tp != null) {
          if (!PatchProxy.applyVoid(null, tp, b.class, "3")) {
             if (tp.d != null) {
                a = tp.a;
                if (a != null && tp.g != null) {
                   a.m(a);
                   b g = tp.g;
                   a.m(g);
                   a.d5(g);
                }
             }
             if (tp.e != null && tp.f == null) {
                tp.b();
                tp.e = b;
                tp.f = true;
             }
             tp.h = null;
          }
       }else {
          this.Q(b);
       }
       this.p = null;
       return;
    }
    public void Q(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "7")) {
          return;
       }
       b uob = b9.c(this.q, a$a.b);
       Objects.requireNonNull(uob, "null cannot be cast to non-null type io.reactivex.disposables.CompositeDisposable");
       this.q = uob;
       return;
    }
    public void X7(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       a.p(p0, "disposable");
       this.q.c(p0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       b obj = this.r8("LIVE_BASIC_CONTEXT");
       a.o(obj, "inject\(LiveAccessIds.LIVE_BASIC_CONTEXT\)");
       this.r = obj;
       obj = new b(this);
       Object obj1 = this.t8("LIVE_SLIDE_PLAY_SERVICE");
       Class obj2 = this.r8("LIVE_FRAGMENT_SIMPLE_SERVICE");
       a.o(obj2, "inject\(LiveAccessIds.LIVE_FRAGMENT_SIMPLE_SERVICE\)");
       Object obj3 = obj2;
       obj2 = Boolean.TYPE;
       Object obj4 = this.v8("LIVE_IS_SLIDE_AVAILABLE", obj2);
       a.o(obj4, "injectOptionalPrimitive\(¡­BLE, Boolean::class.java\)");
       boolean b = obj4.booleanValue();
       Object obj5 = this.v8("LIVE_IS_SLIDE_CONTAINER", obj2);
       a.o(obj5, "injectOptionalPrimitive\(¡­NER, Boolean::class.java\)");
       boolean b1 = obj5.booleanValue();
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidFourRefs(obj1, obj3, Boolean.valueOf(b), Boolean.valueOf(b1), obj, b.class, "1")) {
          a.p(obj3, "fragmentService");
          obj.a = obj1;
          obj.b = obj3;
          obj.c = b;
          obj.d = b1;
       }
       this.p = obj;
       return;
    }
    public void x(boolean p0){
    }
}
