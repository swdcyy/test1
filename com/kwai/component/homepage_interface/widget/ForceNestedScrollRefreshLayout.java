package com.kwai.component.homepage_interface.widget.ForceNestedScrollRefreshLayout;
import com.kwai.library.widget.refresh.CustomRefreshLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;
import android.view.MotionEvent;
import com.kwai.library.widget.refresh.RefreshLayout;

public class ForceNestedScrollRefreshLayout extends CustomRefreshLayout	// class@000985
{
    public final int[] h1;
    public final int[] i1;
    public int j1;

    public void ForceNestedScrollRefreshLayout(Context p0){
       super(p0);
       int[] ointArray = new int[2];
       this.h1 = ointArray;
       int[] ointArray1 = new int[2];
       this.i1 = ointArray1;
    }
    public void ForceNestedScrollRefreshLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       int[] ointArray = new int[2];
       this.h1 = ointArray;
       int[] ointArray1 = new int[2];
       this.i1 = ointArray1;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2){
       if (PatchProxy.isSupport(ForceNestedScrollRefreshLayout.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, ForceNestedScrollRefreshLayout.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       boolean b = (this.isEnabled() && (p2 & 0x02))? true: false;
       return b;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ForceNestedScrollRefreshLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       if (action) {
          if (action == 2) {
             action = (int)p0.getRawY();
             int i = action - this.j1;
             this.j1 = action;
             this.dispatchNestedPreScroll(0, (- i), this.i1, this.h1);
             this.startNestedScroll(2);
          }
       }else {
          this.j1 = (int)p0.getRawY();
       }
       return super.onTouchEvent(p0);
    }
}
