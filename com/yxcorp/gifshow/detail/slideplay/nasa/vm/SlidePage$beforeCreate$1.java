package com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage$beforeCreate$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import pp7.b;
import com.kwai.slide.play.detail.base.BasePage;
import java.lang.Float;
import kotlin.jvm.internal.a;
import uq7.b;
import kotlin.Pair;
import qrd.r0;
import trd.s0;

public final class SlidePage$beforeCreate$1 extends Lambda implements a	// class@0017d4
{
    public final SlidePage this$0;

    public void SlidePage$beforeCreate$1(SlidePage p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       String obj = PatchProxy.applyWithListener(null, this, SlidePage$beforeCreate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.e(this.this$0.j0().a(), 0)) {
          obj = "SIDESLIP";
       }else {
          b uob = this.this$0.e0().a();
          boolean b = (uob != null)? uob.b(): true;
          if (!b) {
             obj = "CLEAR_SCREEN";
          }else {
             obj = "NOT_CLEAR";
          }
       }
       PatchProxy.onMethodExit(SlidePage$beforeCreate$1.class, "1");
       return s0.k(r0.a("slide_page_state", obj));
    }
}
