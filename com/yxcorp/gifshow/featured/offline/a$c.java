package com.yxcorp.gifshow.featured.offline.a$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.featured.offline.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import lnc.a1;
import ekd.p0;
import xea.h;
import com.yxcorp.gifshow.featured.offline.a$c$a;
import wkd.b;
import yea.f;

public class a$c implements Runnable	// class@000fdd
{
    public final String b;
    public final a c;

    public void a$c(a p0,String p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$c.class, "1")) {
          return;
       }
       if (!p0.C(a1.c())) {
          h.j();
          return;
       }else {
          boolean b = h.b();
          if (p0.A(a1.c()) && !b) {
             h.i(new a$c$a(this));
          }else {
             b.a(0x60e4a25a).d(this.b);
          }
          return;
       }
    }
}
