package com.yxcorp.gifshow.detail.nonslide.VerticalScrollDisabledRecyclerView;
import com.yxcorp.gifshow.recycler.widget.FixedCustomRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;

public class VerticalScrollDisabledRecyclerView extends FixedCustomRecyclerView	// class@0015c9
{
    public boolean q;

    public void VerticalScrollDisabledRecyclerView(Context p0){
       super(p0);
    }
    public void VerticalScrollDisabledRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void VerticalScrollDisabledRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean canScrollVertically(int p0){
       if (PatchProxy.isSupport(VerticalScrollDisabledRecyclerView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, VerticalScrollDisabledRecyclerView.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (this.q == null && super.canScrollVertically(p0))? true: false;
       return b;
    }
    public void setDisableVerticalScroll(boolean p0){
       this.q = p0;
    }
    public void setScrollVertically(boolean p0){
       this.q = p0;
    }
}
