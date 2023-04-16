package com.kuaishou.merchant.live.basic.widget.ClipRecyclerView;
import k24.b;
import com.kuaishou.merchant.basic.drawloggerwidget.WatchDispatchDrawRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import k24.a;
import android.view.View;
import java.lang.Boolean;

public class ClipRecyclerView extends WatchDispatchDrawRecyclerView implements b	// class@0018d3
{
    public b c;

    public void ClipRecyclerView(Context p0){
       super(p0);
    }
    public void ClipRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void ClipRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void b(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ClipRecyclerView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ClipRecyclerView.class, "9")) {
          return;
       }
       ClipRecyclerView tc = this.c;
       if (tc != null) {
          tc.b(p0, p1, p2, p3);
       }
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipRecyclerView.class, "3")) {
          return;
       }
       this.i(p0);
       super.dispatchDraw(p0);
       this.t(p0);
       return;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipRecyclerView.class, "2")) {
          return;
       }
       this.u(p0);
       super.draw(p0);
       this.q(p0);
       return;
    }
    public void i(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipRecyclerView.class, "6")) {
          return;
       }
       ClipRecyclerView tc = this.c;
       if (tc != null) {
          tc.i(p0);
       }
       return;
    }
    public void k(){
       a.f(this);
    }
    public void o(View p0){
       a.e(this, p0);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(ClipRecyclerView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ClipRecyclerView.class, "1")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (p0) {
          this.b(p1, p2, p3, p4);
       }
       return;
    }
    public void q(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipRecyclerView.class, "8")) {
          return;
       }
       ClipRecyclerView tc = this.c;
       if (tc != null) {
          tc.q(p0);
       }
       return;
    }
    public void setClipDelegate(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipRecyclerView.class, "4")) {
          return;
       }
       ClipRecyclerView tc = this.c;
       if (tc != null && tc != p0) {
          tc.k();
       }
       this.c = p0;
       if (p0 != null) {
          p0.o(this);
       }
       return;
    }
    public void t(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipRecyclerView.class, "7")) {
          return;
       }
       ClipRecyclerView tc = this.c;
       if (tc != null) {
          tc.t(p0);
       }
       return;
    }
    public void u(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipRecyclerView.class, "5")) {
          return;
       }
       ClipRecyclerView tc = this.c;
       if (tc != null) {
          tc.u(p0);
       }
       return;
    }
}
