package com.yxcorp.gifshow.widget.ScrollableRecyclerView;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;

public class ScrollableRecyclerView extends CustomRecyclerView	// class@0018bf
{

    public void ScrollableRecyclerView(Context p0){
       super(p0, null);
    }
    public void ScrollableRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void ScrollableRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean canScrollHorizontally(int p0){
       if (PatchProxy.isSupport(ScrollableRecyclerView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ScrollableRecyclerView.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.computeHorizontalScrollRange() - this.computeHorizontalScrollExtent()) {
          return true;
       }else {
          return super.canScrollHorizontally(p0);
       }
    }
}
