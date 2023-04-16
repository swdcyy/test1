package com.kuaishou.locallife.half_container.LocalLifeHalfContainerActivity$c;
import java.lang.Runnable;
import com.kuaishou.locallife.half_container.LocalLifeHalfContainerActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.widget.SwipeLayout;

public final class LocalLifeHalfContainerActivity$c implements Runnable	// class@001491
{
    public final LocalLifeHalfContainerActivity b;
    public final boolean c;

    public void LocalLifeHalfContainerActivity$c(LocalLifeHalfContainerActivity p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LocalLifeHalfContainerActivity$c.class, "1")) {
          return;
       }
       LocalLifeHalfContainerActivity f = this.b.F;
       if (f == null) {
          a.S("mSwipeLayout");
       }
       f.setEnabled(this.c);
       return;
    }
}
