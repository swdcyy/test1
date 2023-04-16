package androidx.recyclerview.widget.SlideVerticalAtlasPlayer$VerticalLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer$AutoPlayLinearSmoothScroller;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public final class SlideVerticalAtlasPlayer$VerticalLayoutManager extends LinearLayoutManager	// class@0008c0
{
    public final SlideVerticalAtlasPlayer r;

    public void SlideVerticalAtlasPlayer$VerticalLayoutManager(SlideVerticalAtlasPlayer p0,Context p1){
       a.p(p1, "context");
       this.r = p0;
       super(p1, 1, false);
    }
    public void N(RecyclerView$y p0,int[] p1){
       a.p(p0, "state");
       a.p(p1, "extraLayoutSpace");
       p1[0] = 1200;
       p1[1] = 1200;
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       if (this.r.B()) {
          SlideVerticalAtlasPlayer$VerticalLayoutManager tr = this.r;
          Context context = tr.getContext();
          a.o(context, "context");
          SlideVerticalAtlasPlayer$AutoPlayLinearSmoothScroller uAutoPlayLin = new SlideVerticalAtlasPlayer$AutoPlayLinearSmoothScroller(tr, context);
          uAutoPlayLin.p(p2);
          this.startSmoothScroll(uAutoPlayLin);
       }else {
          super.smoothScrollToPosition(p0, p1, p2);
       }
       return;
    }
}
