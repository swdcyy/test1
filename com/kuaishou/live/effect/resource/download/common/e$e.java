package com.kuaishou.live.effect.resource.download.common.e$e;
import c03.l;
import com.kuaishou.live.effect.resource.download.common.e;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Set;

public class e$e implements l	// class@001b38
{
    public final l a;
    public int b;
    public final e c;

    public void e$e(e p0,l p1,int p2){
       this.c = p0;
       super();
       this.a = p1;
       this.b = p2;
    }
    public void a(String p0,int p1,Throwable p2){
       if (PatchProxy.isSupport(e$e.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, e$e.class, "2")) {
          return;
       }
       if (this.b != null) {
          this.b = 0;
          this.a.a(p0, p1, p2);
          this.c.i.remove(this);
          this.c.Xk(p0, this);
       }
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$e.class, "1")) {
          return;
       }
       int i = this.b - 1;
       this.b = i;
       if (!i) {
          this.a.e(p0);
          this.c.i.remove(this);
          this.c.Xk(p0, this);
       }
       return;
    }
}
