package com.yxcorp.gifshow.activity.g;
import com.kwai.component.menudot.b$b;
import java.lang.Object;
import wkd.b;
import com.kwai.component.menudot.b;
import com.yxcorp.gifshow.reddot.model.RedDot;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fw8.k;
import lnc.c3$a;
import lnc.c3;
import fw8.j;
import fw8.l;

public class g implements b$b	// class@00134b
{
    public final b a;

    public void g(){
       super();
       this.a = b.a(0x34c80eb4);
    }
    public void a(RedDot p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       if (!this.d(p0)) {
          return;
       }
       p0.mWaterline = p0.mTotal;
       c3.c(this.a, new k(p0));
       return;
    }
    public void b(RedDot p0,RedDot p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "1")) {
          return;
       }
       c3.c(this.a, new j(p0));
       return;
    }
    public void c(RedDot p0,RedDot p1){
    }
    public boolean d(RedDot p0){
       boolean b = (p0 != null && (p0.mRealShow != null && p0.mTotal - p0.mWaterline > 0))? true: false;
       return b;
    }
    public void e(RedDot p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "3")) {
          return;
       }
       if (p0 != null) {
          p0.mRealShow = false;
          c3.c(this.a, new l(p0));
       }
       return;
    }
}
