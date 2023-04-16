package com.kuaishou.live.common.core.component.comments.display.f$b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.live.common.core.component.comments.display.f;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class f$b extends RecyclerView$r	// class@001075
{
    public final f a;

    public void f$b(f p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(f$b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, f$b.class, "1")) {
          return;
       }
       f$b ta = this.a;
       boolean b = (!p1)? true: false;
       ta.n = b;
       ta.a();
       return;
    }
}
