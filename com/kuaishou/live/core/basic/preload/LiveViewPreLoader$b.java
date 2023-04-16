package com.kuaishou.live.core.basic.preload.LiveViewPreLoader$b;
import r12.f$a;
import android.view.ViewGroup;
import ftd.z1;
import android.view.View;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveViewPreLoader$b	// class@0008c8
{
    public final f$a a;
    public ViewGroup b;
    public z1 c;
    public View d;

    public void LiveViewPreLoader$b(f$a p0,ViewGroup p1,z1 p2,View p3,int p4,u p5){
       a.p(p0, "taskId");
       super();
       this.a = p0;
       this.b = p1;
       this.c = null;
       this.d = null;
    }
    public final ViewGroup a(){
       return this.b;
    }
    public final z1 b(){
       return this.c;
    }
    public final f$a c(){
       return this.a;
    }
    public final View d(){
       return this.d;
    }
    public final void e(ViewGroup p0){
       this.b = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveViewPreLoader$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveViewPreLoader$b && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && a.g(this.d, p0.d)))))) {
          return true;
       }
       return false;
    }
    public final void f(View p0){
       this.d = p0;
    }
    public int hashCode(){
       LiveViewPreLoader$b obj = PatchProxy.apply(null, this, LiveViewPreLoader$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveViewPreLoader$b tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.d;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveViewPreLoader$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Task\(taskId="+this.a+", container="+this.b+", job="+this.c+", view="+this.d+"\)";
    }
}
