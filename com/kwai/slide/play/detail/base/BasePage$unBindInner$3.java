package com.kwai.slide.play.detail.base.BasePage$unBindInner$3;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import qp7.w0;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import qp7.b;
import crd.a;

public final class BasePage$unBindInner$3 extends FunctionReferenceImpl implements l	// class@00178f
{
    public static final BasePage$unBindInner$3 INSTANCE;

    static {
       BasePage$unBindInner$3.INSTANCE = new BasePage$unBindInner$3();
    }
    public void BasePage$unBindInner$3(){
       super(1, w0.class, "unbind", "unbind\(\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(w0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePage$unBindInner$3.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoid(null, p0, w0.class, "8")) {
          w0 e = p0.e;
          if (e == null) {
             a.S("singleElement");
          }
          e.d0();
          p0.g = false;
          p0.d.dispose();
          p0.d = new a();
       }
       return;
    }
}
