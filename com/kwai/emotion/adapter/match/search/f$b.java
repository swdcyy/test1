package com.kwai.emotion.adapter.match.search.f$b;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kwai.emotion.adapter.match.search.f;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import g9c.a;
import qvb.n0;

public class f$b extends RecyclerView$n	// class@000d6c
{
    public final f a;

    public void f$b(f p0){
       this.a = p0;
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, f$b.class, "1")) {
          return;
       }
       int childAdapter = p2.getChildAdapterPosition(p1);
       p0.top = a1.d(0x7f070e41);
       p0.bottom = a1.d(0x7f070e41);
       if (!childAdapter) {
          p0.left = a1.d(0x7f070e40);
       }else if(childAdapter == (this.a.v.getItemCount() - 1) && !this.a.w.hasMore()){
          p0.left = a1.d(0x7f070e42);
          p0.right = a1.d(0x7f070e40);
       }else {
          p0.left = a1.d(0x7f070e42);
       }
       return;
    }
}
