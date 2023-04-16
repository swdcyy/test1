package com.kwai.component.menudot.c$a;
import com.kwai.component.menudot.b$b;
import com.kwai.component.menudot.c;
import java.lang.Object;
import com.yxcorp.gifshow.reddot.model.RedDot;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import nc5.l;

public class c$a implements b$b	// class@0009b8
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(RedDot p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "2")) {
          return;
       }
       if (!this.d(p0)) {
          return;
       }
       p0.reset();
       this.a.a(p0.mTypeValue);
       return;
    }
    public void b(RedDot p0,RedDot p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$a.class, "1")) {
          return;
       }
       this.a.a(p0.mTypeValue);
       return;
    }
    public void c(RedDot p0,RedDot p1){
    }
    public boolean d(RedDot p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.mRealShow != null && l.c(p0) > 0))? true: false;
       return b;
    }
    public void e(RedDot p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "3")) {
          return;
       }
       if (p0 != null) {
          p0.mRealShow = false;
          this.a.a(p0.mTypeValue);
       }
       return;
    }
}
