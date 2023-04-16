package com.yxcorp.plugin.search.utils.j0$a;
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
import java.util.Objects;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class j0$a extends RecyclerView$n	// class@0007a4
{
    public int a;
    public int b;
    public int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public void j0$a(int p0,int p1,int p2,int p3,int p4,int p5){
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.h = p4;
       this.i = p5;
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, j0$a.class, "1")) {
          return;
       }
       if (this.a == null) {
          RecyclerView$LayoutManager layoutManage = p2.getLayoutManager();
          Objects.requireNonNull(layoutManage);
          this.a = layoutManage.getSpanCount();
       }
       if (this.b == null) {
          RecyclerView$Adapter adapter = p2.getAdapter();
          Objects.requireNonNull(adapter);
          this.b = adapter.getItemCount();
       }
       int childLayoutP = p2.getChildLayoutPosition(p1);
       this.c = childLayoutP;
       j0$a ta = this.a;
       j0$a td = (!(childLayoutP % ta))? this.d: this.e / 2;
       j0$a tf = (!(childLayoutP / ta))? this.f: this.g / 2;
       j0$a th = ((childLayoutP % ta) == (ta - 1))? this.h: this.e / 2;
       j0$a ti = ((childLayoutP / ta) == ((this.b - 1) / ta))? this.i: this.g / 2;
       p0.set(td, tf, th, ti);
       return;
    }
}
