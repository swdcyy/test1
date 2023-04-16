package com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker$mFinishRunnable$1;
import java.lang.Runnable;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import tb5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.component.homepage_interface.uxmonitor.GestureType;
import java.lang.ref.WeakReference;
import android.view.View;
import tb5.k;
import java.lang.Boolean;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.CharSequence;
import zsd.u;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Color;
import com.kwai.component.homepage_interface.uxmonitor.AnswerType;
import java.util.List;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker$mFinishRunnable$1$1;
import msd.l;
import ub5.b;
import tb5.j;
import tb5.i;
import java.util.concurrent.Future;
import t45.c;
import java.lang.StringBuilder;

public final class InvalidGestureChecker$mFinishRunnable$1 implements Runnable	// class@00097b
{
    public final InvalidGestureChecker b;

    public void InvalidGestureChecker$mFinishRunnable$1(InvalidGestureChecker p0){
       this.b = p0;
       super();
    }
    public final void run(){
       StringBuilder str1;
       k c;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, this, InvalidGestureChecker$mFinishRunnable$1.class, "1")) {
          return;
       }
       InvalidGestureChecker b = this.b.b;
       if (b == null) {
          return;
       }
       a.m(b);
       Objects.requireNonNull(b);
       String str = 1;
       if (!PatchProxy.applyVoid(null, b, uoc, "13") && b.g != null) {
          c e = b.e;
          if (e == GestureType.CLICK || (e == GestureType.LONG_PRESS || e == GestureType.DOUBLE_CLICK)) {
             e = b.h;
             if (e != null) {
                View view = e.get();
                if (view != null) {
                   a.o(view, "mConsumerViewWeak?.get\(\) ?: return");
                   c = k.c;
                   Objects.requireNonNull(c);
                   CharSequence obj1 = PatchProxy.applyOneRefs(view, c, k.class, "3");
                   boolean b2 = false;
                   if (obj1 != patchProxyRe) {
                      b2 = obj1.booleanValue();
                   }else {
                      a.p(view, "view");
                      if (view.getVisibility() != 4 && view.getAlpha()) {
                         if (!view instanceof ViewGroup || !view.getChildCount()) {
                            if (view instanceof TextView) {
                               obj1 = view.getText();
                               long l = (obj1 == null || u.S1(obj1))? 1: 0;
                               if (l) {
                               label_00a5 :
                                  if (!view instanceof ImageView || view.getDrawable() == null) {
                                     if (view.getBackground() != null) {
                                        if (view.getBackground() instanceof ColorDrawable) {
                                           Drawable background = view.getBackground();
                                           Objects.requireNonNull(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                                           if (Color.alpha(background.getColor())) {
                                           label_00d7 :
                                              if (!b2) {
                                                 b.d(AnswerType.DEFAULT);
                                              }
                                           }
                                        }else {
                                           goto label_00d7 ;
                                        }
                                     }
                                  }
                               }
                            }else {
                               goto label_00a5 ;
                            }
                         }
                      }
                      b2 = true;
                      goto label_00d7 ;
                   }
                }
             }
          }
       }
       j obj = PatchProxy.apply(null, b, uoc, "4");
       boolean b1 = (obj != patchProxyRe)? obj.booleanValue(): CollectionsKt___CollectionsKt.H1(b.e.getAnswerTypes(), b.f) ^ str;
       if (b1) {
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          objectRef.element = null;
          b.c(new InvalidGestureChecker$mFinishRunnable$1$1(this, objectRef, b));
          objectRef = objectRef.element;
          if (objectRef != null) {
             objectRef.costDuration = b.i / (long)1000;
             obj = j.a;
             Objects.requireNonNull(obj);
             if (!PatchProxy.applyVoidOneRefs(objectRef, obj, j.class, "2")) {
                a.p(objectRef, "info");
                c.k(new i(objectRef));
             }
          }
          str1 = "无效 = "+b;
       }else {
          str1 = "有效 = "+b;
       }
       this.b.b = null;
       return;
    }
}
