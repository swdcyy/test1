package com.kuaishou.live.lite.comment.view.CommentLinearLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$y;
import com.kuaishou.live.lite.comment.view.CommentLinearLayoutManager$a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Integer;
import com.kuaishou.live.lite.comment.view.CommentLinearLayoutManager$b;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public final class CommentLinearLayoutManager extends LinearLayoutManager	// class@000812
{
    public CommentLinearLayoutManager$a r;
    public int s;
    public Context t;

    public void CommentLinearLayoutManager(Context p0){
       a.p(p0, "context");
       super(p0);
       this.s = 1000;
       this.W0(p0);
    }
    public void CommentLinearLayoutManager(Context p0,int p1,boolean p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.s = 1000;
       this.W0(p0);
    }
    public void CommentLinearLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       a.p(p0, "context");
       super(p0, p1, p2, p3);
       this.s = 1000;
       this.W0(p0);
    }
    public final void W0(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommentLinearLayoutManager.class, "1")) {
          return;
       }
       this.t = p0;
       this.N0(true);
       return;
    }
    public void onLayoutCompleted(RecyclerView$y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommentLinearLayoutManager.class, "3")) {
          return;
       }
       super.onLayoutCompleted(p0);
       CommentLinearLayoutManager tr = this.r;
       if (tr != null) {
          tr.a();
       }
       return;
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       if (PatchProxy.isSupport(CommentLinearLayoutManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, CommentLinearLayoutManager.class, "4")) {
          return;
       }
       CommentLinearLayoutManager tt = this.t;
       if (tt == null) {
          a.S("context");
       }
       CommentLinearLayoutManager$b uob = new CommentLinearLayoutManager$b(this, tt);
       uob.p(p2);
       this.startSmoothScroll(uob);
       return;
    }
    public boolean supportsPredictiveItemAnimations(){
       return false;
    }
}
