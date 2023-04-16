package com.kuaishou.live.common.core.component.topbar.topuser.i$j;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.common.core.component.topbar.topuser.i$j$a;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class i$j extends RecyclerView$n	// class@001791
{
    public final i$j$a a;

    public void i$j(i$j$a p0){
       super();
       this.a = p0;
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, i$j.class, "1")) {
          return;
       }
       super.c(p0, p1, p2, p3);
       p0.left = this.a.a(p2.getChildAdapterPosition(p1));
       return;
    }
}
