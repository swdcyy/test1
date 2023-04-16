package com.yxcorp.plugin.search.widget.SearchRefreshLayout;
import com.kwai.library.widget.refresh.CustomRefreshLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import android.view.MotionEvent;

public class SearchRefreshLayout extends CustomRefreshLayout	// class@0007df
{

    public void SearchRefreshLayout(Context p0){
       super(p0);
    }
    public void SearchRefreshLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public boolean canScrollVertically(int p0){
       View childAt;
       if (PatchProxy.isSupport(SearchRefreshLayout.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, SearchRefreshLayout.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 0;
       while (true) {
          if (i >= this.getChildCount()) {
             return super.canScrollVertically(p0);
          }
          childAt = this.getChildAt(i);
          if (childAt instanceof RecyclerView) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return childAt.canScrollVertically(p0);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       return false;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2){
       if (PatchProxy.isSupport(SearchRefreshLayout.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, SearchRefreshLayout.class, "3");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       boolean b = (this.isEnabled() && (p2 & 0x02))? true: false;
       return b;
    }
}
