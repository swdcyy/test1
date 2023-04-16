package androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$PageAutoScrollLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$AutoPlayLinearSmoothScroller;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;

public final class SlideHorizontalAtlasPlayer$PageAutoScrollLayoutManager extends LinearLayoutManager	// class@0008ac
{
    public final SlideHorizontalAtlasPlayer r;

    public void SlideHorizontalAtlasPlayer$PageAutoScrollLayoutManager(SlideHorizontalAtlasPlayer p0,Context p1){
       a.p(p1, "context");
       this.r = p0;
       super(p1, 0, 0);
    }
    public void N(RecyclerView$y p0,int[] p1){
       a.p(p0, "state");
       a.p(p1, "extraLayoutSpace");
       p1[0] = this.getWidth();
       p1[1] = this.getWidth();
    }
    public boolean canScrollHorizontally(){
       return this.r.getEnableScroll();
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       a.p(p0, "recyclerView");
       if (this.r.H()) {
          Context context = p0.getContext();
          a.o(context, "recyclerView.context");
          SlideHorizontalAtlasPlayer$AutoPlayLinearSmoothScroller uAutoPlayLin = new SlideHorizontalAtlasPlayer$AutoPlayLinearSmoothScroller(this.r, context);
          uAutoPlayLin.p(p2);
          this.startSmoothScroll(uAutoPlayLin);
       }else {
          super.smoothScrollToPosition(p0, p1, p2);
       }
       return;
    }
}
