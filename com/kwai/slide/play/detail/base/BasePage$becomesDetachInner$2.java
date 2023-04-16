package com.kwai.slide.play.detail.base.BasePage$becomesDetachInner$2;
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
import as7.a;
import q87.c;
import qp7.b;

public final class BasePage$becomesDetachInner$2 extends FunctionReferenceImpl implements l	// class@001734
{
    public static final BasePage$becomesDetachInner$2 INSTANCE;

    static {
       BasePage$becomesDetachInner$2.INSTANCE = new BasePage$becomesDetachInner$2();
    }
    public void BasePage$becomesDetachInner$2(){
       super(1, w0.class, "becomesDetached", "becomesDetached\(\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(w0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePage$becomesDetachInner$2.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoid(null, p0, w0.class, "10")) {
          int i = 0;
          if (p0.g == null) {
             Object[] objArray = new Object[i];
             a.C().t("VM_BaseSingleGroup", "notify becomesDetached but not bind", objArray);
          }else {
             w0 e = p0.e;
             if (e == null) {
                a.S("singleElement");
             }
             e.m();
             p0.h = i;
          }
       }
       return;
    }
}
