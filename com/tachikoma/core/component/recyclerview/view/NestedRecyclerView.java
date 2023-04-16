package com.tachikoma.core.component.recyclerview.view.NestedRecyclerView;
import com.tachikoma.core.component.recyclerview.view.CustomRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView;

public class NestedRecyclerView extends CustomRecyclerView	// class@000d87
{

    public void NestedRecyclerView(Context p0){
       super(p0);
    }
    public void NestedRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void NestedRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void smoothScrollBy(int p0,int p1){
       if (PatchProxy.isSupport(NestedRecyclerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, NestedRecyclerView.class, "2")) {
          return;
       }
       this.startNestedScroll(2, 1);
       super.smoothScrollBy(p0, p1);
       return;
    }
    public void smoothScrollToPosition(int p0){
       if (PatchProxy.isSupport(NestedRecyclerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, NestedRecyclerView.class, "1")) {
          return;
       }
       this.startNestedScroll(2, 1);
       super.smoothScrollToPosition(p0);
       return;
    }
}
