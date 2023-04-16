package com.yxcorp.gifshow.activity.f$a;
import fr6.g;
import com.yxcorp.gifshow.activity.f;
import java.lang.Object;
import wq6.h;
import xr6.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.content.Context;
import zr6.e;
import android.app.Activity;
import isa.a;
import kx8.v;
import sta.n;
import wq6.d;
import ro5.a;

public class f$a implements g	// class@001348
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,h p1,c p2){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, f$a.class, "2")) {
          return;
       }
       if (p0) {
          if (this.a.b() instanceof Activity) {
             v.a(this.a.b(), this.a.e.c());
          }
          int i = this.a.e.f();
          if (i > 0) {
             n.a(i);
          }
          a.h(this.a.n());
       }
       return;
    }
    public void b(boolean p0,h p1,h p2,c p3){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), p1, p2, p3, this, f$a.class, "1")) {
          return;
       }
       if (p0) {
          this.a.q();
       }
       return;
    }
}
