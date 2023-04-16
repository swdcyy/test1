package com.tachikoma.component.listview.layoutmanager.TKLinearLayoutManger;
import ao8.a;
import androidx.recyclerview.widget.LinearLayoutManager;
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
import java.lang.Throwable;
import zp8.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView;
import com.tachikoma.component.listview.layoutmanager.a$a;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public class TKLinearLayoutManger extends LinearLayoutManager implements a	// class@000d10
{
    public a r;

    public void TKLinearLayoutManger(Context p0){
       super(p0);
       this.W0();
    }
    public void TKLinearLayoutManger(Context p0,int p1,boolean p2){
       super(p0, p1, p2);
       this.W0();
    }
    public void TKLinearLayoutManger(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
       this.W0();
    }
    public void W0(){
       if (PatchProxy.applyVoid(null, this, TKLinearLayoutManger.class, "1")) {
          return;
       }
       this.r = new a();
       return;
    }
    public void f(int p0){
       TKLinearLayoutManger tKLinearLayo = TKLinearLayoutManger.class;
       if (PatchProxy.isSupport(tKLinearLayo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKLinearLayo, "3")) {
          return;
       }
       this.r.a(p0);
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, TKLinearLayoutManger.class, "4")) {
          return;
       }
       this.r.b();
       return;
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKLinearLayoutManger.class, "7")) {
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
       if (PatchProxy.isSupport(TKLinearLayoutManger.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, TKLinearLayoutManger.class, "8");
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
       TKLinearLayoutManger tKLinearLayo = TKLinearLayoutManger.class;
       if (PatchProxy.isSupport(tKLinearLayo) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, tKLinearLayo, "6")) {
          return;
       }
       super.scrollToPositionWithOffset(p0, p1);
       return;
    }
    public int scrollVerticallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       if (PatchProxy.isSupport(TKLinearLayoutManger.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, TKLinearLayoutManger.class, "9");
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
       if (PatchProxy.isSupport(TKLinearLayoutManger.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, TKLinearLayoutManger.class, "5")) {
          return;
       }
       this.startSmoothScroll(this.r.d(p0, p1, p2));
       return;
    }
    public void x(int p0){
       TKLinearLayoutManger tKLinearLayo = TKLinearLayoutManger.class;
       if (PatchProxy.isSupport(tKLinearLayo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKLinearLayo, "2")) {
          return;
       }
       this.r.c(p0);
       return;
    }
}
