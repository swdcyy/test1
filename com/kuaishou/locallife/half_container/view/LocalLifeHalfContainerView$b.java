package com.kuaishou.locallife.half_container.view.LocalLifeHalfContainerView$b;
import java.lang.Runnable;
import com.kuaishou.locallife.half_container.view.LocalLifeHalfContainerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.a;

public final class LocalLifeHalfContainerView$b implements Runnable	// class@001499
{
    public final LocalLifeHalfContainerView b;
    public final int c;

    public void LocalLifeHalfContainerView$b(LocalLifeHalfContainerView p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LocalLifeHalfContainerView$b.class, "1")) {
          return;
       }
       View childAt = this.b.getChildAt(this.c);
       a.o(childAt, "getChildAt\(i\)");
       childAt.setVisibility(8);
       return;
    }
}
