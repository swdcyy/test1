package com.kwai.dva.design.internal.UIStrategy$mHandler$2$a;
import android.os.Handler;
import com.kwai.dva.design.internal.UIStrategy;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import zi5.a;
import java.util.Objects;
import vi5.c;
import java.lang.System;
import java.lang.Runnable;

public final class UIStrategy$mHandler$2$a extends Handler	// class@000d12
{
    public final UIStrategy a;

    public void UIStrategy$mHandler$2$a(UIStrategy p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       UIStrategy$mHandler$2$a ta;
       UIStrategy uIStrategy = UIStrategy.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, UIStrategy$mHandler$2$a.class, "1")) {
          return;
       }
       a.p(p0, "msg");
       if (this.a.g()) {
          a.b("strategy handler, anim is cancelled!");
          return;
       }else {
          p0 = p0.what;
          Object[] objArray = null;
          int i = 2;
          boolean b = true;
          if (p0 != b) {
             if (p0 != i) {
                if (p0 != 3) {
                   if (p0 == 4) {
                      this.a.a();
                   }
                }else {
                   ta = this.a;
                   Objects.requireNonNull(ta);
                   if (!PatchProxy.applyVoid(objArray, ta, uIStrategy, "11")) {
                      a.a("strategy show max value delayed.");
                      ta.i(100);
                      ta.e().sendEmptyMessageDelayed(4, 100);
                   }
                }
             }else {
                ta = this.a;
                ta.a.b(ta.f());
             }
          }else {
             ta = this.a;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoid(objArray, ta, uIStrategy, "14")) {
                a.a("strategy start anim.");
                ta.e = b;
                ta.g = System.currentTimeMillis();
                ta.a.c();
                ta.a.b(0);
                ta.e().sendEmptyMessage(i);
                UIStrategy h = ta.h;
                if (h != null) {
                   h.run();
                }
             }
          }
          return;
       }
    }
}
