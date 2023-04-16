package com.tachikoma.component.listview.layoutmanager.TKGridLayoutManger;
import ao8.a;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.tachikoma.component.listview.layoutmanager.a;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Throwable;
import zp8.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tachikoma.component.listview.layoutmanager.a$a;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public class TKGridLayoutManger extends GridLayoutManager implements a	// class@000d0f
{
    public a A;

    public void TKGridLayoutManger(Context p0,int p1){
       super(p0, p1);
       this.o1();
    }
    public void TKGridLayoutManger(Context p0,int p1,int p2,boolean p3){
       super(p0, p1, p2, p3);
       this.o1();
    }
    public void TKGridLayoutManger(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
       this.o1();
    }
    public void f(int p0){
       TKGridLayoutManger tKGridLayout = TKGridLayoutManger.class;
       if (PatchProxy.isSupport(tKGridLayout) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKGridLayout, "6")) {
          return;
       }
       this.A.a(p0);
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, TKGridLayoutManger.class, "3")) {
          return;
       }
       this.A.b();
       return;
    }
    public void o1(){
       if (PatchProxy.applyVoid(null, this, TKGridLayoutManger.class, "1")) {
          return;
       }
       this.A = new a();
       return;
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKGridLayoutManger.class, "7")) {
          return;
       }
       try{
          super.onLayoutChildren(p0, p1);
       }catch(java.lang.Exception e3){
          a.g("onLayoutChildren", e3);
       }
       return;
    }
    public int scrollHorizontallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       if (PatchProxy.isSupport(TKGridLayoutManger.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, TKGridLayoutManger.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       try{
          return super.scrollHorizontallyBy(p0, p1, p2);
       }catch(java.lang.Exception e8){
          a.g("scrollHorizontallyBy", e8);
          return 0;
       }
    }
    public void scrollToPositionWithOffset(int p0,int p1){
       TKGridLayoutManger tKGridLayout = TKGridLayoutManger.class;
       if (PatchProxy.isSupport(tKGridLayout) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, tKGridLayout, "5")) {
          return;
       }
       super.scrollToPositionWithOffset(p0, p1);
       return;
    }
    public int scrollVerticallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       if (PatchProxy.isSupport(TKGridLayoutManger.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, TKGridLayoutManger.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       try{
          return super.scrollVerticallyBy(p0, p1, p2);
       }catch(java.lang.Exception e8){
          a.g("scrollHorizontallyBy", e8);
          return 0;
       }
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       if (PatchProxy.isSupport(TKGridLayoutManger.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, TKGridLayoutManger.class, "4")) {
          return;
       }
       this.startSmoothScroll(this.A.d(p0, p1, p2));
       return;
    }
    public void x(int p0){
       TKGridLayoutManger tKGridLayout = TKGridLayoutManger.class;
       if (PatchProxy.isSupport(tKGridLayout) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKGridLayout, "2")) {
          return;
       }
       this.A.c(p0);
       return;
    }
}
