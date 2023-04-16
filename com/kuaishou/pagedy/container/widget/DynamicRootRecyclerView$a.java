package com.kuaishou.pagedy.container.widget.DynamicRootRecyclerView$a;
import java.lang.Runnable;
import com.kuaishou.pagedy.container.widget.DynamicRootRecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.a;

public final class DynamicRootRecyclerView$a implements Runnable	// class@000a70
{
    public final DynamicRootRecyclerView b;

    public void DynamicRootRecyclerView$a(DynamicRootRecyclerView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DynamicRootRecyclerView$a.class, "1")) {
          return;
       }
       DynamicRootRecyclerView$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, DynamicRootRecyclerView.class, "17")) {
          DynamicRootRecyclerView c = tb.c;
          if (c != null) {
             ViewGroup$LayoutParams layoutParams = c.getLayoutParams();
             int i = tb.getHeight() - tb.g;
             if (i != layoutParams.height) {
                layoutParams.height = i;
                DynamicRootRecyclerView c1 = tb.c;
                a.m(c1);
                c1.setLayoutParams(layoutParams);
             }
          }
       }
       return;
    }
}
