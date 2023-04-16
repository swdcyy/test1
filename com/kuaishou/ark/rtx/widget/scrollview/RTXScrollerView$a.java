package com.kuaishou.ark.rtx.widget.scrollview.RTXScrollerView$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.ark.rtx.widget.scrollview.RTXScrollerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import or.a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewTreeObserver;

public class RTXScrollerView$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@000f9f
{
    public final RTXScrollerView b;

    public void RTXScrollerView$a(RTXScrollerView p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, RTXScrollerView$a.class, "1")) {
          return;
       }
       RTXScrollerView$a tb = this.b;
       tb.mChildRecyclerView = tb.findRecyclerView(tb.mScrollView.getView());
       tb = this.b;
       if (tb.mChildRecyclerView != null) {
          tb.mScrollView.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
          tb = this.b;
          tb.mScrollView.a(tb.mChildRecyclerView);
       }
       return;
    }
}
