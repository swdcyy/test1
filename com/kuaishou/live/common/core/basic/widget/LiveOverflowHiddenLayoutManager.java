package com.kuaishou.live.common.core.basic.widget.LiveOverflowHiddenLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$y;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Integer;
import java.lang.Boolean;
import ya1.a0;
import msd.a;
import qrd.l1;

public class LiveOverflowHiddenLayoutManager extends RecyclerView$LayoutManager	// class@000f1e
{
    public a a;
    public final s b;
    public final int c;
    public final boolean d;

    public void LiveOverflowHiddenLayoutManager(int p0,boolean p1){
       super();
       this.c = p0;
       this.d = p1;
       this.b = s.b(this, p0);
    }
    public RecyclerView$LayoutParams generateDefaultLayoutParams(){
       Object obj = PatchProxy.apply(null, this, LiveOverflowHiddenLayoutManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RecyclerView$LayoutParams(-2, -2);
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       int paddingLeft;
       int i;
       int paddingRight;
       boolean b;
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, LiveOverflowHiddenLayoutManager.class, "3")) {
          return;
       }
       a.p(obj1, "recycler");
       a.p(obj2, "state");
       if (!p1.c()) {
          this.removeAndRecycleAllViews(p0);
          return;
       }else {
          this.detachAndScrapAttachedViews(p0);
          if (obj.c == null) {
             paddingLeft = this.getPaddingLeft();
             i = this.getWidth() - this.getPaddingLeft();
             paddingRight = this.getPaddingRight();
          }else {
             paddingLeft = this.getPaddingTop();
             i = this.getHeight() - this.getPaddingTop();
             paddingRight = this.getPaddingBottom();
          }
          int i1 = i - paddingRight;
          int i2 = p1.c();
          int i3 = 0;
          int i4 = paddingLeft;
          int i5 = 0;
          while (i5 < i2) {
             View view = obj1.o(i5);
             a.o(view, "recycler.getViewForPosition\(index\)");
             obj.addView(view);
             obj.measureChild(view, i3, i3);
             int i6 = i4 + obj.b.e(view);
             if (i6 <= i1 || (obj.d == null && !i5)) {
                if (obj.c == null) {
                   int i7 = i4 + obj.b.e(view);
                   this.layoutDecorated(view, i4, 0, i7, view.getMeasuredHeight());
                }else {
                   int i8 = i4 + obj.b.e(view);
                   this.layoutDecorated(view, 0, i4, view.getMeasuredWidth(), i8);
                }
                i5 = i5 + 1;
                i4 = i6;
             }else if(PatchProxy.isSupport(LiveOverflowHiddenLayoutManager.class)){
                obj2 = PatchProxy.applyThreeRefs(Integer.valueOf(i1), view, Integer.valueOf(i4), this, LiveOverflowHiddenLayoutManager.class, "4");
                if (obj2 != PatchProxyResult.class) {
                   b = obj2.booleanValue();
                label_013e :
                   if (!b) {
                      obj.removeView(view);
                      obj1.B(view);
                      break ;
                   }else {
                      break ;
                   }
                }
             }
             if (obj.c == null) {
                if (PatchProxy.isSupport(LiveOverflowHiddenLayoutManager.class)) {
                   obj2 = PatchProxy.applyThreeRefs(Integer.valueOf(i1), view, Integer.valueOf(i4), this, LiveOverflowHiddenLayoutManager.class, "5");
                   if (obj2 != PatchProxyResult.class) {
                      i3 = obj2.booleanValue();
                   }
                }
                if (view instanceof a0 && view.a(((i1 - i4) - obj.getLeftDecorationWidth(view)), view.getMeasuredWidth())) {
                   obj.measureChild(view, i4, i3);
                   this.layoutDecorated(view, i4, 0, i1, view.getMeasuredHeight());
                label_013c :
                   i3 = 1;
                }
             }else if(PatchProxy.isSupport(LiveOverflowHiddenLayoutManager.class)){
                obj2 = PatchProxy.applyThreeRefs(Integer.valueOf(i1), view, Integer.valueOf(i4), this, LiveOverflowHiddenLayoutManager.class, "6");
                if (obj2 != PatchProxyResult.class) {
                   i3 = obj2.booleanValue();
                }
             }
             if (view instanceof a0 && view.a((i1 - obj.getTopDecorationHeight(view)), view.getMeasuredHeight())) {
                obj.measureChild(view, i3, i4);
                this.layoutDecorated(view, 0, i4, view.getMeasuredWidth(), i1);
                goto label_013c ;
             }
          label_013d :
             b = i3;
             goto label_013e ;
          }
          return;
       }
    }
    public void onLayoutCompleted(RecyclerView$y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveOverflowHiddenLayoutManager.class, "2")) {
          return;
       }
       super.onLayoutCompleted(p0);
       LiveOverflowHiddenLayoutManager ta = this.a;
       if (ta != null) {
          ta.invoke();
       }
       return;
    }
}
