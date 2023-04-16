package com.tachikoma.component.listview.layoutmanager.TKStaggeredGridLayoutManager;
import ao8.a;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tachikoma.component.listview.layoutmanager.a;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.IndexOutOfBoundsException;
import java.lang.Throwable;
import zp8.a;
import java.lang.Exception;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView;
import com.tachikoma.component.listview.layoutmanager.a$a;
import androidx.recyclerview.widget.RecyclerView$x;

public class TKStaggeredGridLayoutManager extends StaggeredGridLayoutManager implements a	// class@000d11
{
    public a b;
    public Method c;
    public boolean d;
    public WeakReference e;

    public void TKStaggeredGridLayoutManager(int p0,int p1){
       super(p0, p1);
       this.c = null;
       this.d = false;
       this.N();
    }
    public void TKStaggeredGridLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
       this.c = null;
       this.d = false;
       this.N();
    }
    public void N(){
       if (PatchProxy.applyVoid(null, this, TKStaggeredGridLayoutManager.class, "1")) {
          return;
       }
       this.setGapStrategy(0);
       this.b = new a();
       return;
    }
    public void f(int p0){
       TKStaggeredGridLayoutManager tKStaggeredG = TKStaggeredGridLayoutManager.class;
       if (PatchProxy.isSupport(tKStaggeredG) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKStaggeredG, "4")) {
          return;
       }
       this.b.a(p0);
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, TKStaggeredGridLayoutManager.class, "5")) {
          return;
       }
       this.b.b();
       return;
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKStaggeredGridLayoutManager.class, "11")) {
          return;
       }
       try{
          super.onLayoutChildren(p0, p1);
       }catch(java.lang.IndexOutOfBoundsException e3){
          a.g(e3.getMessage(), e3);
       }
       p1.j();
       return;
    }
    public void onScrollStateChanged(int p0){
       TKStaggeredGridLayoutManager tKStaggeredG = TKStaggeredGridLayoutManager.class;
       if (PatchProxy.isSupport(tKStaggeredG) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKStaggeredG, "10")) {
          return;
       }
       try{
          super.onScrollStateChanged(p0);
       }catch(java.lang.Exception e4){
          a.g(e4.getMessage(), e4);
       }
       return;
    }
    public void requestSimpleAnimationsInNextLayout(){
       if (PatchProxy.applyVoid(null, this, TKStaggeredGridLayoutManager.class, "8")) {
          return;
       }
       super.requestSimpleAnimationsInNextLayout();
       return;
    }
    public void scrollToPositionWithOffset(int p0,int p1){
       TKStaggeredGridLayoutManager tKStaggeredG = TKStaggeredGridLayoutManager.class;
       if (PatchProxy.isSupport(tKStaggeredG) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, tKStaggeredG, "7")) {
          return;
       }
       super.scrollToPositionWithOffset(p0, p1);
       return;
    }
    public int scrollVerticallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       if (PatchProxy.isSupport(TKStaggeredGridLayoutManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, TKStaggeredGridLayoutManager.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       try{
          return super.scrollVerticallyBy(p0, p1, p2);
       }catch(java.lang.Exception e8){
          a.g(e8.getMessage(), e8);
          return 0;
       }
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       if (PatchProxy.isSupport(TKStaggeredGridLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, TKStaggeredGridLayoutManager.class, "6")) {
          return;
       }
       this.startSmoothScroll(this.b.d(p0, p1, p2));
       return;
    }
    public void x(int p0){
       TKStaggeredGridLayoutManager tKStaggeredG = TKStaggeredGridLayoutManager.class;
       if (PatchProxy.isSupport(tKStaggeredG) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKStaggeredG, "3")) {
          return;
       }
       this.b.c(p0);
       return;
    }
}
