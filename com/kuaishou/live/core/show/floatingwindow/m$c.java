package com.kuaishou.live.core.show.floatingwindow.m$c;
import s82.r0;
import com.kuaishou.live.core.show.floatingwindow.m;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import android.graphics.Rect;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowCloseType;
import java.lang.System;
import s82.w;
import z1.a;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import s82.v;

public class m$c implements r0	// class@000b8d
{
    public final m a;

    public void m$c(m p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
       m j;
       m$c uoc = m$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "3")) {
          return;
       }
       uoc = this.a;
       uoc.f = p0;
       uoc.g = p1;
       if (uoc.k == null) {
          Objects.requireNonNull(uoc);
          m om = m.class;
          if (!PatchProxy.isSupport(om) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), uoc, om, "12")) {
             uoc.k = true;
             if (uoc.l != null) {
                j = uoc.j;
                j.left = p0;
                j.right = p0 + uoc.j.width();
                j.top = p1;
                j.bottom = p1 + uoc.j.height();
             }else {
                j = uoc.j;
                j.left = p0;
                j.top = p1;
             }
          }
       }
       return;
    }
    public void b(int p0,int p1){
       m$c uoc = m$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "4")) {
          return;
       }
       uoc = this.a;
       uoc.i = p0;
       uoc.h = p1;
       if (uoc.l == null) {
          uoc.l = true;
          m j = uoc.j;
          j.right = j.left + p0;
          j.bottom = j.top + p1;
       }
       return;
    }
    public void c(LiveFloatingWindowCloseType p0){
       m$c ta1;
       if (PatchProxy.applyVoidOneRefs(p0, this, m$c.class, "1")) {
          return;
       }
       m$c ta = this.a;
       m f = ta.f;
       m g = ta.g;
       Rect rect = new Rect(f, g, (ta.i + f), (ta.h + g));
       w ow = new w(this, (System.currentTimeMillis() - this.a.m), rect, p0);
       this.a.d(f);
       this.a.e();
       if (p0 != LiveFloatingWindowCloseType.ENTER_OTHER_PAGE_TEMP_CLOSE) {
          ta1 = this.a;
          ta1.c.unregisterActivityLifecycleCallbacks(ta1.s);
       }
       this.a.h();
       ta1 = this.a;
       ta1.e = false;
       ta1.p = null;
       return;
    }
    public int d(){
       return 0x34000000;
    }
    public boolean e(){
       Object obj = PatchProxy.apply(null, this, m$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.a.d(new v(this));
       return false;
    }
}
