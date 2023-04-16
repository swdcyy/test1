package com.kuaishou.pagedy.container.widget.DynamicNestedRecyclerView$a;
import java.lang.Runnable;
import com.kuaishou.pagedy.container.widget.DynamicNestedRecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.pagedy.container.widget.DynamicNestedRecyclerView$a$a;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class DynamicNestedRecyclerView$a implements Runnable	// class@000a6b
{
    public final DynamicNestedRecyclerView b;
    public final int c;

    public void DynamicNestedRecyclerView$a(DynamicNestedRecyclerView p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, DynamicNestedRecyclerView$a.class, "1")) {
          return;
       }
       DynamicNestedRecyclerView$a tb = this.b;
       DynamicNestedRecyclerView$a$a uoa$a = new DynamicNestedRecyclerView$a$a(this, tb, tb.getContext());
       uoa$a.p(this.c);
       RecyclerView$LayoutManager layoutManage = this.b.getLayoutManager();
       if (layoutManage != null) {
          layoutManage.startSmoothScroll(uoa$a);
       }
       return;
    }
}
