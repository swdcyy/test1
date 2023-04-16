package com.yxcorp.gifshow.detail.comment.nonslide.CoordinatorLinearLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import java.lang.Integer;
import java.lang.Boolean;
import android.view.ViewParent;
import android.graphics.Rect;
import com.yxcorp.utility.n;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import com.yxcorp.gifshow.detail.comment.nonslide.CoordinatorLinearLayoutManager$a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;

public class CoordinatorLinearLayoutManager extends LinearLayoutManager	// class@001393
{
    public int r;

    public void CoordinatorLinearLayoutManager(Context p0){
       super(p0);
    }
    public int E(){
       View obj = PatchProxy.apply(null, this, CoordinatorLinearLayoutManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       obj = this.W0((this.getChildCount() - 1), i, 1);
       if (obj != null) {
          i = this.getPosition(obj);
       }
       return i;
    }
    public final View W0(int p0,int p1,boolean p2){
       View this;
       int b;
       int i3;
       RecyclerView$LayoutManager layoutManage = this;
       int i = p0;
       int i1 = p1;
       if (PatchProxy.isSupport(CoordinatorLinearLayoutManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, CoordinatorLinearLayoutManager.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i2 = this.getChildCount() - 1;
       if (i <= i2 && (i >= 0 && i1 <= this.getChildCount())) {
          i2 = -1;
          if (i1 >= i2) {
             if (i1 > i) {
                i2 = 1;
             }
             while (i != i1) {
                this = layoutManage.getChildAt(i);
                if (PatchProxy.isSupport(CoordinatorLinearLayoutManager.class)) {
                   Object obj1 = PatchProxy.applyTwoRefs(this, Boolean.valueOf(p2), layoutManage, CoordinatorLinearLayoutManager.class, "7");
                   if (obj1 != PatchProxyResult.class) {
                      b = obj1.booleanValue();
                   }else {
                   label_0064 :
                      Rect rect = new Rect();
                      b = this.getParent().getGlobalVisibleRect(rect);
                      if (layoutManage.r == null) {
                         layoutManage.r = n.w(this.getContext());
                      }
                      int[] ointArray = new int[2];
                      this.getLocationOnScreen(ointArray);
                      boolean globalVisibl = this.getGlobalVisibleRect(new Rect());
                      if (!this.getOrientation()) {
                         b = ointArray[0];
                         i3 = ointArray[0] + this.getWidth();
                         if (p2) {
                            if (b >= rect.left && i3 <= rect.right) {
                            label_00b3 :
                               b = true;
                            }
                         }else if(b <= rect.right && i3 >= rect.left){
                            goto label_00b3 ;
                         }
                      }else {
                         int i4 = ointArray[1];
                         i3 = ointArray[1] + this.getHeight();
                         if (p2) {
                            if (i4 >= rect.top && (i3 <= rect.bottom && (i3 <= layoutManage.r && i4 >= 0))) {
                               goto label_00b3 ;
                            }
                         }else if(i4 <= rect.bottom && (i3 >= rect.top && (i4 < layoutManage.r && (i3 > 0 && (b && globalVisibl))))){
                            goto label_00b3 ;
                         }
                      }
                      b = false;
                   }
                }else {
                   goto label_0064 ;
                }
                if (b) {
                   return this;
                }
                i = i + i2;
             }
          }
       }
       return null;
    }
    public int c(){
       View obj = PatchProxy.apply(null, this, CoordinatorLinearLayoutManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       obj = this.W0((this.getChildCount() - 1), i, false);
       if (obj != null) {
          i = this.getPosition(obj);
       }
       return i;
    }
    public int h(){
       View obj = PatchProxy.apply(null, this, CoordinatorLinearLayoutManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.W0(0, this.getChildCount(), true);
       int i = (obj == null)? -1: this.getPosition(obj);
       return i;
    }
    public int i0(){
       View obj = PatchProxy.apply(null, this, CoordinatorLinearLayoutManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.W0(0, this.getChildCount(), 0);
       int i = (obj == null)? -1: this.getPosition(obj);
       return i;
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       if (PatchProxy.isSupport(CoordinatorLinearLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, CoordinatorLinearLayoutManager.class, "1")) {
          return;
       }
       CoordinatorLinearLayoutManager$a uoa = new CoordinatorLinearLayoutManager$a(this, p0.getContext());
       uoa.p(p2);
       this.startSmoothScroll(uoa);
       return;
    }
}
