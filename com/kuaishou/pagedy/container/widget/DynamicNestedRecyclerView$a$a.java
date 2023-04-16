package com.kuaishou.pagedy.container.widget.DynamicNestedRecyclerView$a$a;
import androidx.recyclerview.widget.o;
import com.kuaishou.pagedy.container.widget.DynamicNestedRecyclerView$a;
import com.kuaishou.pagedy.container.widget.DynamicNestedRecyclerView;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$x$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView;
import android.util.DisplayMetrics;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class DynamicNestedRecyclerView$a$a extends o	// class@000a6a
{
    public int q;
    public final int r;
    public final DynamicNestedRecyclerView$a s;
    public final DynamicNestedRecyclerView t;

    public void DynamicNestedRecyclerView$a$a(DynamicNestedRecyclerView$a p0,DynamicNestedRecyclerView p1,Context p2){
       this.s = p0;
       this.t = p1;
       super(p2);
       this.r = 3;
    }
    public int B(){
       return -1;
    }
    public void l(int p0,int p1,RecyclerView$y p2,RecyclerView$x$a p3){
       if (PatchProxy.isSupport(DynamicNestedRecyclerView$a$a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, p3, this, DynamicNestedRecyclerView$a$a.class, "1")) {
          return;
       }
       a.p(p2, "state");
       a.p(p3, "action");
       super.l(p0, p1, p2, p3);
       p0 = this.q + 1;
       this.q = p0;
       if (p0 > this.r) {
          this.r();
          DynamicNestedRecyclerView$a$a tt = this.t;
          if (tt != null) {
             tt.scrollToPosition(this.s.c);
          }
       }
       return;
    }
    public float v(DisplayMetrics p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DynamicNestedRecyclerView$a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       a.m(p0);
       return (0x3f19999a / p0.density);
    }
}
