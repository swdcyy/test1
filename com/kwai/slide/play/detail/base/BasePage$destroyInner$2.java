package com.kwai.slide.play.detail.base.BasePage$destroyInner$2;
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
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.LifecycleRegistry;

public final class BasePage$destroyInner$2 extends FunctionReferenceImpl implements l	// class@001758
{
    public static final BasePage$destroyInner$2 INSTANCE;

    static {
       BasePage$destroyInner$2.INSTANCE = new BasePage$destroyInner$2();
    }
    public void BasePage$destroyInner$2(){
       super(1, w0.class, "destroy", "destroy\(\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(w0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePage$destroyInner$2.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoid(null, p0, w0.class, "13")) {
          if (p0.f != null) {
             w0 e = p0.e;
             if (e == null) {
                a.S("singleElement");
             }
             e.u();
          }
          p0.c.setCurrentState(Lifecycle$State.DESTROYED);
       }
       return;
    }
}
