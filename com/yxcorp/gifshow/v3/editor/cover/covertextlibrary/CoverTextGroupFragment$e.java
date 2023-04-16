package com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextGroupFragment$e;
import androidx.recyclerview.widget.RecyclerView$n;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager$b;

public class CoverTextGroupFragment$e extends RecyclerView$n	// class@000e4a
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public void CoverTextGroupFragment$e(int p0,int p1,int p2,int p3,int p4,int p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       CoverTextGroupFragment$e this;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, CoverTextGroupFragment$e.class, "1")) {
          return;
       }
       RecyclerView$LayoutManager layoutManage = p2.getLayoutManager();
       RecyclerView$Adapter adapter = p2.getAdapter();
       int childAdapter = p2.getChildAdapterPosition(p1);
       if (layoutManage instanceof GridLayoutManager && adapter != null) {
          int spanCount = layoutManage.getSpanCount();
          GridLayoutManager$b uob = layoutManage.j1();
          int i = uob.f(childAdapter);
          int i1 = uob.e(childAdapter, spanCount);
          CoverTextGroupFragment$e tc = this.c;
          this = this.d;
          CoverTextGroupFragment$e ta = this.a;
          int i2 = spanCount - i1;
          p0.left = (((ta - this) * i1) + (i2 * tc)) / spanCount;
          p0.right = (((i2 - i) * (ta - tc)) + (this * (i1 + i))) / spanCount;
          int i3 = uob.d((adapter.getItemCount() - 1), spanCount);
          childAdapter = uob.d(childAdapter, spanCount);
          p0.top = (!childAdapter)? this.e: 0;
          if (childAdapter == i3) {
             p0.bottom = this.f;
          }else {
             p0.bottom = this.b;
          }
       }
       return;
    }
}
