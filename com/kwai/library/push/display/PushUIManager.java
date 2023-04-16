package com.kwai.library.push.display.PushUIManager;
import com.kwai.library.push.display.PushUIManager$queue$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.library.push.display.PushUIManager$a;
import java.lang.Object;
import com.kwai.library.push.display.Push;
import java.lang.String;
import ny6.a;
import com.kwai.library.push.model.InAppNotification;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.library.push.utils.InPushSettingExt;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.List;
import java.util.Collection;
import com.kwai.library.push.utils.c;
import kotlin.jvm.internal.a;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.library.push.log.InAppLogExt$logDiscardPushError$1;
import java.lang.Iterable;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kwai.library.push.channel.bean.PRIORITY;
import ly6.c;
import jy6.b;
import android.app.Activity;
import android.content.Context;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.GestureDetector;
import iy6.e;
import android.view.GestureDetector$OnGestureListener;
import iy6.f;
import android.view.View$OnTouchListener;
import iy6.i;
import com.kwai.library.widget.popup.common.f$c;
import com.kwai.library.widget.popup.common.f;
import iy6.d;
import android.view.View$OnAttachStateChangeListener;
import com.kwai.library.push.display.Push$startToShow$$inlined$let$lambda$1;
import com.kwai.library.push.display.Push$startToShow$$inlined$let$lambda$2;
import android.view.ViewTreeObserver;
import iy6.k;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import iy6.j;

public final class PushUIManager	// class@0008c1
{
    public static final p a;
    public static Push b;
    public static Runnable c;
    public static final PushUIManager$a d;
    public static final PushUIManager e;

    static {
       PushUIManager.e = new PushUIManager();
       PushUIManager.a = s.c(PushUIManager$queue$2.INSTANCE);
       PushUIManager.d = new PushUIManager$a();
    }
    public void PushUIManager(){
       super();
    }
    public final boolean a(Push p0){
       if (!this.i()) {
          a.b("canUpdateContent: 10");
          return false;
       }else {
          Push b = PushUIManager.b;
          if (b != null) {
             InAppNotification inAppNotific = b.f();
             if (inAppNotific != null) {
                String bizType = inAppNotific.getBizType();
                if (bizType != null && bizType.equals(p0.f().getBizType()) == true) {
                   a.b("canUpdateContent: 11");
                   return true;
                }
             }
          }
          return false;
       }
    }
    public final void b(){
       k1.m(PushUIManager.c);
    }
    public final void c(){
       if (!InPushSettingExt.g()) {
          this.d();
       }
       return;
    }
    public final void d(){
       Push push;
       ArrayList uArrayList = new ArrayList();
       InAppNotification inAppNotific = null;
       while (!this.f().isEmpty()) {
          push = this.f().poll();
          if (push != null) {
             if (inAppNotific == null && push.f().getIsFromKlink()) {
                inAppNotific = push.f();
             }
             uArrayList.add(push.f());
          }
       }
       if (uArrayList.isEmpty() ^ 0x01) {
          c.e("errorCode={10015},clear all push", 0x271f, inAppNotific);
          a.p("hide_clear_queue", "tag");
          a.p(uArrayList, "list");
          i3 oi3 = i3.f();
          oi3.c("count", Integer.valueOf(uArrayList.size()));
          oi3.d("type", CollectionsKt___CollectionsKt.V2(uArrayList, ",", null, null, 0, null, InAppLogExt$logDiscardPushError$1.INSTANCE, 30, null));
          String str = oi3.e();
          a.o(str, "it");
          a.c("hide_clear_queue", str);
       }
       return;
    }
    public final void e(Push p0){
       if (!this.f().offer(p0)) {
          c.a(p0.f());
       }
       return;
    }
    public final PriorityQueue f(){
       return PushUIManager.a.getValue();
    }
    public final void g(boolean p0){
       Push b = PushUIManager.b;
       if (b != null) {
          Push.e(b, "6", null, p0, 2, null);
       }
       return;
    }
    public final boolean h(Push p0){
       boolean b;
       if (p0 != null) {
          InAppNotification inAppNotific = p0.f();
          if (inAppNotific != null) {
             PRIORITY priorityType = inAppNotific.getPriorityType();
             if (priorityType != null && priorityType.mValue == PRIORITY.VERY_HIGH.mValue) {
                b = true;
             label_0019 :
                return b;
             }
          }
       }
       b = false;
       goto label_0019 ;
    }
    public final boolean i(){
       Push b = PushUIManager.b;
       boolean b1 = false;
       if (b != null && b.e == 1) {
          b1 = true;
       }
       return b1;
    }
    public final void j(){
       Push c;
       Push a;
       this.c();
       Push push = this.f().poll();
       if (push != null) {
          if (c.a(push.f())) {
             PushUIManager.b = push;
             push.k(PushUIManager.d);
             Activity uActivity = InPushSettingExt.c();
             a.m(uActivity);
             String str = "activity";
             a.p(uActivity, str);
             push.b();
             push.e = 3;
             ViewConfiguration viewConfigur = ViewConfiguration.get(uActivity);
             a.o(viewConfigur, "ViewConfiguration.get\(activity\)");
             push.d = viewConfigur.getScaledTouchSlop();
             push.b = new FrameLayout(uActivity);
             LayoutInflater layoutInflat = LayoutInflater.from(uActivity);
             if (layoutInflat != null) {
                push.c = push.c(layoutInflat);
             }
             c = push.c;
             Push$startToShow$$inlined$let$lambda$2 ostartToShow = 2;
             if (c != null) {
                Push b = push.b;
                if (b != null) {
                   b.addView(c, -1, -2);
                }
                push.a(c, push.g);
                c = push.b;
                if (c != null) {
                   c.setOnTouchListener(new f(new GestureDetector(c.getContext(), new e(push))));
                }
                c = push.b;
                if (c != null) {
                   a.p(c, "view");
                   a.p(uActivity, str);
                   boolean b1 = f.a(uActivity, c, 256, i.a);
                   if (!b1) {
                      c.d("add to window error");
                   }
                   if (b1) {
                      c.addOnAttachStateChangeListener(new d(push));
                      a = push.a;
                      if (a != null) {
                         a.c(push);
                      }
                      a = push.c;
                      Push$startToShow$$inlined$let$lambda$1 ostartToShow1 = new Push$startToShow$$inlined$let$lambda$1(push, uActivity);
                      ostartToShow = new Push$startToShow$$inlined$let$lambda$2(push, uActivity);
                      a.p(ostartToShow1, "enterAnimationEnd");
                      a.p(ostartToShow, "onCancel");
                      if (a != null) {
                         if (!a.getHeight()) {
                            ViewTreeObserver viewTreeObse = a.getViewTreeObserver();
                            if (viewTreeObse != null) {
                               viewTreeObse.addOnGlobalLayoutListener(new k(a, ostartToShow1, ostartToShow));
                            }
                         }else {
                            j.a.a(a, ostartToShow1, ostartToShow);
                         }
                      }
                   }else {
                      Push.j(push, "-1", null, ostartToShow, null);
                   }
                }
             }else {
                Push.j(push, "-1", null, ostartToShow, null);
             }
          }else {
             PushUIManager.e.j();
          }
       }
       return;
    }
}
