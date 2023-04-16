package com.horcrux.svg.RenderableViewManager$1;
import android.view.ViewGroup$OnHierarchyChangeListener;
import com.horcrux.svg.RenderableViewManager;
import java.lang.Object;
import android.view.View;
import com.horcrux.svg.VirtualView;

public class RenderableViewManager$1 implements ViewGroup$OnHierarchyChangeListener	// class@0005c0
{
    public final RenderableViewManager this$0;

    public void RenderableViewManager$1(RenderableViewManager p0){
       this.this$0 = p0;
       super();
    }
    public void onChildViewAdded(View p0,View p1){
       if (p0 instanceof VirtualView) {
          this.this$0.invalidateSvgView(p0);
       }
       return;
    }
    public void onChildViewRemoved(View p0,View p1){
       if (p0 instanceof VirtualView) {
          this.this$0.invalidateSvgView(p0);
       }
       return;
    }
}
