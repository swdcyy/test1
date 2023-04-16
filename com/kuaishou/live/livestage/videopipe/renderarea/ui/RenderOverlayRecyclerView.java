package com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderOverlayRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView$q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import oe3.e;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.lang.AssertionError;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public class RenderOverlayRecyclerView extends RecyclerView	// class@000c17
{

    public void RenderOverlayRecyclerView(Context p0){
       a.p(p0, "context");
       super(p0);
    }
    public void RenderOverlayRecyclerView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public void RenderOverlayRecyclerView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void addOnItemTouchListener(RecyclerView$q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RenderOverlayRecyclerView.class, "1")) {
          return;
       }
       a.p(p0, "listener");
       e d = e.d;
       String str = "::addOnItemTouchListener is not implemented, don\'t use this method";
       if (d.b()) {
          throw new AssertionError(this.getClass().getSimpleName()+str);
       }
       e.d(d, "LiveStage", "[ERROR] ASSERT FAIL!!! "+this.getClass().getSimpleName()+str, null, 4, null);
       super.addOnItemTouchListener(p0);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       RecyclerView$LayoutManager obj = PatchProxy.applyOneRefs(p0, this, RenderOverlayRecyclerView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "e");
       obj = this.getLayoutManager();
       if (obj != null && (!obj.canScrollHorizontally() && !obj.canScrollVertically())) {
          return false;
       }
       return super.onTouchEvent(p0);
    }
}
