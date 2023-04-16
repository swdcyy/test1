package com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker$a;
import nsd.u;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker$mFinishRunnable$1;
import android.content.Context;
import android.view.ViewConfiguration;
import android.view.GestureDetector;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker$b;
import android.view.GestureDetector$OnGestureListener;
import com.kwai.component.homepage_interface.uxmonitor.AnswerType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import android.view.MotionEvent;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker$onTouchEvent$2;
import msd.l;
import tb5.c;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker$onTouchEvent$3;
import com.kwai.component.homepage_interface.uxmonitor.GestureType;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.component.homepage_interface.uxmonitor.UxMonitorExpUtil;

public final class InvalidGestureChecker	// class@00097e
{
    public boolean a;
    public c b;
    public final Runnable c;
    public final ViewConfiguration d;
    public final GestureDetector e;
    public final Activity f;
    public final boolean g;
    public static final InvalidGestureChecker$a h;

    static {
       InvalidGestureChecker.h = new InvalidGestureChecker$a(null);
    }
    public void InvalidGestureChecker(Activity p0,boolean p1){
       a.p(p0, "mActivity");
       super();
       this.f = p0;
       this.g = p1;
       this.c = new InvalidGestureChecker$mFinishRunnable$1(this);
       ViewConfiguration viewConfigur = ViewConfiguration.get(p0);
       a.o(viewConfigur, "ViewConfiguration.get\(mActivity\)");
       this.d = viewConfigur;
       this.e = new GestureDetector(p0, new InvalidGestureChecker$b(this));
    }
    public static final void a(Context p0,AnswerType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, InvalidGestureChecker.class, "7")) {
          return;
       }
       InvalidGestureChecker.h.b(p0, p1);
       return;
    }
    public static final void b(Context p0,boolean p1){
       InvalidGestureChecker invalidGestu = InvalidGestureChecker.class;
       if (PatchProxy.isSupport(invalidGestu) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, invalidGestu, "8")) {
          return;
       }
       InvalidGestureChecker$a h = InvalidGestureChecker.h;
       Objects.requireNonNull(h);
       InvalidGestureChecker$a uoa = InvalidGestureChecker$a.class;
       if (PatchProxy.isSupport(uoa) && (!PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), h, uoa, "3") && p0 != null)) {
          InvalidGestureChecker invalidGestu1 = h.a(p0);
          if (invalidGestu1 != null) {
             invalidGestu1.a = p1;
          }
       }
       return;
    }
    public final void onTouchEvent(MotionEvent p0){
       InvalidGestureChecker tb;
       if (PatchProxy.applyVoidOneRefs(p0, this, InvalidGestureChecker.class, "1")) {
          return;
       }
       a.p(p0, "event");
       if (this.a == null) {
          return;
       }
       int action = p0.getAction();
       InvalidGestureChecker$onTouchEvent$3 oonTouchEven = 1;
       if (action) {
          if (action != oonTouchEven) {
             if (action != 2) {
                if (action == 3) {
                }
             }else {
                tb = this.b;
                if (tb != null) {
                   tb.c(new InvalidGestureChecker$onTouchEvent$2(this, p0));
                }
             }
          }else {
          }
       }else {
          tb = this.b;
          if (tb != null) {
             if (tb.e == GestureType.UNKNOWN) {
                oonTouchEven = null;
             }
             if (oonTouchEven != null) {
                k1.m(this.c);
                this.c.run();
                this.b = null;
             }
          }
          if (this.b == null && UxMonitorExpUtil.b.b(this.g)) {
             this.b = new c(p0);
          }
       }
    label_006f :
       this.e.onTouchEvent(p0);
       return;
    }
}
