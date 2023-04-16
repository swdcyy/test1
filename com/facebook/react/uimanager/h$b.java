package com.facebook.react.uimanager.h$b;
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

public class h$b extends GuardedRunnable	// class@00134a
{
    public final int b;
    public final Object c;
    public final h d;

    public void h$b(h p0,ReactContext p1,int p2,Object p3){
       this.d = p0;
       this.b = p2;
       this.c = p3;
       super(p1);
    }
    public void runGuarded(){
       if (PatchProxy.applyVoid(null, this, h$b.class, "1")) {
          return;
       }
       h f = this.d.f;
       h$b tb = this.b;
       h$b tc = this.c;
       Objects.requireNonNull(f);
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(tb), tc, f, uof, "11")) {
          x ox = f.d.a(tb);
          if (ox == null) {
             a.x("ReactNative", "Attempt to set local data for view with unknown tag: "+tb);
          }else {
             ox.setLocalData(tc);
             f.h();
          }
       }
       return;
    }
}
