package com.kuaishou.ark.rtx.widget.listview.RTXRecyclerView$b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.ark.rtx.widget.listview.RTXRecyclerView;
import kr.b;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Math;
import java.lang.Runnable;
import iq8.x;
import ep8.d;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public class RTXRecyclerView$b extends RecyclerView$r	// class@000f9c
{
    public boolean a;
    public final Runnable b;
    public final RTXRecyclerView c;

    public void RTXRecyclerView$b(RTXRecyclerView p0){
       this.c = p0;
       super();
       this.a = false;
       this.b = new b(this);
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(RTXRecyclerView$b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, RTXRecyclerView$b.class, "1")) {
          return;
       }
       if (!p1 && this.a != null) {
          this.c();
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(RTXRecyclerView$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, RTXRecyclerView$b.class, "2")) {
          return;
       }
       boolean b = (p2 > 0 && Math.abs(p2) >= Math.abs(p1))? true: false;
       this.a = b;
       if (b) {
          x.e(this.b);
          x.d(this.b, 30);
       }
       return;
    }
    public final void c(){
       int i;
       int i1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RTXRecyclerView$b.class, "3")) {
          return;
       }
       if (this.c.mRecyclerView.getScrollState()) {
          return;
       }
       x.e(this.b);
       int itemCount = this.c.mHeaderFooterAdapter.getItemCount();
       RTXRecyclerView rTXRecyclerV = -1;
       if (this.c.mRecyclerView.getLayoutManager() instanceof LinearLayoutManager) {
          i = this.c.mRecyclerView.getLayoutManager().h();
          if (i == rTXRecyclerV) {
             i = this.c.mRecyclerView.getLayoutManager().i0();
          }
          i1 = this.c.mRecyclerView.getLayoutManager().E();
          if (i1 == rTXRecyclerV) {
             i1 = this.c.mRecyclerView.getLayoutManager().c();
          }
       }else {
          i = -1;
          i1 = -1;
       }
       if (this.c.mRecyclerView.getLayoutManager() instanceof StaggeredGridLayoutManager) {
          int[] ointArray = this.c.mRecyclerView.getLayoutManager().findFirstCompletelyVisibleItemPositions(objArray);
          int i2 = this.d(ointArray);
          if (i1 == rTXRecyclerV) {
             this.c.mRecyclerView.getLayoutManager().findFirstVisibleItemPositions(ointArray);
             i = this.d(ointArray);
          }else {
             i = i2;
          }
          int[] ointArray1 = this.c.mRecyclerView.getLayoutManager().findLastCompletelyVisibleItemPositions(objArray);
          i1 = this.e(ointArray1);
          if (i1 == rTXRecyclerV) {
             this.c.mRecyclerView.getLayoutManager().findLastVisibleItemPositions(ointArray1);
             i1 = this.e(ointArray1);
          }
       }
       if (i1 != rTXRecyclerV) {
          RTXRecyclerView$b tc = this.c;
          if ((float)((itemCount - 1) - i1) - (tc.onEndReachedThreshold * (float)((i1 - i) + 2)) <= 0) {
             tc.onEndReached();
          }
       }
       return;
    }
    public final int d(int[] p0){
       int i = -1;
       int i1 = 0;
       while (i1 < p0.length) {
          if (!i1) {
             i = p0[i1];
          }else if(p0[i1] < i){
             i = p0[i1];
          }
          i1 = i1 + 1;
       }
       return i;
    }
    public final int e(int[] p0){
       int i = -1;
       int i1 = 0;
       while (i1 < p0.length) {
          if (!i1) {
             i = p0[i1];
          }else if(p0[i1] > i){
             i = p0[i1];
          }
          i1 = i1 + 1;
       }
       return i;
    }
}
