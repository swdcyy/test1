package com.kwai.slide.play.detail.base.BasePage$attachedInner$2;
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
import qp7.d;
import android.view.View;
import android.view.ViewParent;

public final class BasePage$attachedInner$2 extends FunctionReferenceImpl implements l	// class@00172d
{
    public static final BasePage$attachedInner$2 INSTANCE;

    static {
       BasePage$attachedInner$2.INSTANCE = new BasePage$attachedInner$2();
    }
    public void BasePage$attachedInner$2(){
       super(1, w0.class, "attached", "attached\(\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(w0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePage$attachedInner$2.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       Objects.requireNonNull(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, p0, w0.class, "11")) {
          w0 e = p0.e;
          if (e == null) {
             a.S("singleElement");
          }
          e.k();
          e = p0.e;
          if (e == null) {
             a.S("singleElement");
          }
          if (e.m != null) {
             e = p0.e;
             if (e == null) {
                a.S("singleElement");
             }
             if (e.C() != null) {
                e = p0.e;
                if (e == null) {
                   a.S("singleElement");
                }
                d uod = e.C();
                if (uod != null) {
                   View view = uod.p();
                   if (view != null) {
                      objArray = view.getParent();
                   }
                }
                if (objArray != null) {
                   e = p0.e;
                   if (e == null) {
                      a.S("singleElement");
                   }
                   e.S();
                }
             }
          }
       label_0066 :
          p0.i = true;
       }
       return;
    }
}
