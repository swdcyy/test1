package com.kuaishou.live.comments.view.LiveCommentLinearLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import com.kuaishou.live.comments.view.LiveCommentLinearLayoutManager$ScrollSpeed;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.comments.view.LiveCommentLinearLayoutManager$b;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public class LiveCommentLinearLayoutManager extends LinearLayoutManager	// class@000e4a
{
    public Context r;
    public boolean s;
    public int t;
    public int u;
    public LiveCommentLinearLayoutManager$ScrollSpeed v;

    public void LiveCommentLinearLayoutManager(Context p0){
       super(p0, 1, false);
    }
    public void LiveCommentLinearLayoutManager(Context p0,int p1,boolean p2){
       super(p0, p1, p2);
       this.v = LiveCommentLinearLayoutManager$ScrollSpeed.NORMAL;
       this.r = p0;
       this.N0(true);
    }
    public boolean isAutoMeasureEnabled(){
       return false;
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       if (PatchProxy.isSupport(LiveCommentLinearLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, LiveCommentLinearLayoutManager.class, "2")) {
          return;
       }
       LiveCommentLinearLayoutManager$b uob = new LiveCommentLinearLayoutManager$b(this, p0.getContext());
       uob.p(p2);
       this.startSmoothScroll(uob);
       return;
    }
    public boolean supportsPredictiveItemAnimations(){
       return false;
    }
}
