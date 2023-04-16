package com.kuaishou.live.core.show.wishlight.render.a$c;
import c03.l;
import com.kuaishou.live.core.show.wishlight.render.a;
import xy2.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.util.Log;
import java.lang.StringBuilder;
import pz2.c;
import pz2.i;
import pz2.a;
import java.lang.Long;
import com.kuaishou.live.core.show.wishlight.render.a$a;

public final class a$c implements l	// class@0012b4
{
    public final a a;
    public final a b;

    public void a$c(a p0,a p1){
       a.p(p1, "mTask");
       this.b = p0;
       super();
       this.a = p1;
    }
    public void a(String p0,int p1,Throwable p2){
       if (PatchProxy.isSupport(a$c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, a$c.class, "2")) {
          return;
       }
       a.p(p0, "resourceId");
       if (p2 != null) {
          p0 = Log.getStackTraceString(p2);
          a.o(p0, "Log.getStackTraceString\(it\)");
       }else {
          p0 = "";
       }
       this.b.p(this.a);
       this.b.j(false, 1001, "errorCode:"+p1+",errorMsg:"+p0);
       a f = this.b.f;
       if (f != null) {
          f.c(this.a, p0);
       }
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
          return;
       }
       a.p(p0, "resourceId");
       a$a l = a.l;
       StringBuilder str = "[onDownloadCompleted]taskId:"+this.a.N()+",magicFaceId:"+this.a.b()+','+"rending magicFaceId:";
       a e = this.b.e;
       Long longx = (e != null)? Long.valueOf(e.b()): null;
       l.b(str+longx);
       if (this.b.m()) {
          a e1 = this.b.e;
          if (e1 == null || e1.b() - this.a.b()) {
             this.b.a();
             this.b.o(this.a);
          }else {
             this.b.k(this.a);
          }
       }else {
          this.b.o(this.a);
       }
       this.b.p(this.a);
       return;
    }
}
