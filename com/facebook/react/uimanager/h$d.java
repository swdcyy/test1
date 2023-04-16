package com.facebook.react.uimanager.h$d;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.uimanager.h;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.facebook.react.uimanager.f;
import java.lang.Integer;
import ze.x;
import ze.j0;
import java.lang.StringBuilder;
import cb.a;
import com.facebook.react.uimanager.e;
import gf.f;

public class h$d extends GuardedRunnable	// class@00134c
{
    public final int b;
    public final int c;
    public final int d;
    public final h e;

    public void h$d(h p0,ReactContext p1,int p2,int p3,int p4){
       this.e = p0;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super(p1);
    }
    public void runGuarded(){
       String str = "1";
       if (PatchProxy.applyVoid(null, this, h$d.class, str)) {
          return;
       }
       h f = this.e.f;
       h$d tb = this.b;
       h$d tc = this.c;
       h$d td = this.d;
       Objects.requireNonNull(f);
       if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(tb), Integer.valueOf(tc), Integer.valueOf(td), f, f.class, "5")) {
          x ox = f.d.a(tb);
          if (ox == null) {
             a.x("ReactNative", "Tried to update non-existent root tag: "+tb);
          }else if(PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(ox, Integer.valueOf(tc), Integer.valueOf(td), f, f.class, "6")){
             if (ox.getWidthMeasureSpec() != null && (ox.getWidthMeasureSpec().intValue() == tc && (ox.getHeightMeasureSpec() == null || ox.getHeightMeasureSpec().intValue() != td))) {
                ox.increaseLayoutCount();
                f l = f.l;
                Objects.requireNonNull(l);
                if (!PatchProxy.applyVoidOneRefs(ox, l, e.class, str)) {
                   l.c.b(ox, true);
                }
             }
             ox.setMeasureSpecs(tc, td);
          }
       }
       this.e.f.g(-1);
       return;
    }
}
