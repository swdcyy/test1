package com.kwai.live.gzone.accompanyplay.anchor.j0$a;
import xl6.h;
import com.kwai.live.gzone.accompanyplay.anchor.j0;
import java.lang.String;
import java.lang.Object;
import xl6.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import e17.i;

public class j0$a implements h	// class@000b16
{
    public final String a;
    public final boolean b;
    public final j0 c;

    public void j0$a(j0 p0,String p1,boolean p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0$a.class, "1")) {
          return;
       }
       f a = p0.a;
       if (a != null) {
          p0 = p0.b;
          if (p0 != null) {
             this.c.S8(this.a, p0, a, this.b);
          }
       }
       return;
    }
    public void onError(int p0){
       j0$a uoa = j0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       if (p0 == 3001) {
          i.a(R.style.arg_RES_7f11066a, 0x7f1023d9);
          return;
       }else {
          this.c.V8();
          return;
       }
    }
}
