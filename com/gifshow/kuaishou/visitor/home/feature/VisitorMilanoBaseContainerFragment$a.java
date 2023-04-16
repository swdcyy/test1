package com.gifshow.kuaishou.visitor.home.feature.VisitorMilanoBaseContainerFragment$a;
import com.yxcorp.gifshow.w$b;
import com.gifshow.kuaishou.visitor.home.feature.VisitorMilanoBaseContainerFragment;
import java.lang.Object;
import android.app.Activity;
import uv8.o1;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kda.e;
import q87.c;
import java.lang.Runnable;
import android.os.Handler;
import wh.l;

public class VisitorMilanoBaseContainerFragment$a implements w$b	// class@0015dd
{
    public final VisitorMilanoBaseContainerFragment a;

    public void VisitorMilanoBaseContainerFragment$a(VisitorMilanoBaseContainerFragment p0){
       this.a = p0;
       super();
    }
    public void a(Activity p0){
    }
    public void b(){
       o1.a(this);
    }
    public void c(int p0,String p1){
       o1.d(this, p0, p1);
    }
    public void d(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorMilanoBaseContainerFragment$a.class, "1")) {
          return;
       }
       this.f();
       return;
    }
    public void e(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorMilanoBaseContainerFragment$a.class, "2")) {
          return;
       }
       this.f();
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, VisitorMilanoBaseContainerFragment$a.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.C().w("NasaSlide", "on launch finish", objArray);
       VisitorMilanoBaseContainerFragment$a ta = this.a;
       VisitorMilanoBaseContainerFragment q = ta.Q;
       if (q != null) {
          ta.R.removeCallbacks(q);
       }
       ta = this.a;
       l ol = new l(this);
       ta.Q = ol;
       ta.R.post(ol);
       return;
    }
}
