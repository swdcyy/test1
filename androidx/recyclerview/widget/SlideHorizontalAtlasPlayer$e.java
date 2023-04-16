package androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$e;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$PageAutoScrollLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

public final class SlideHorizontalAtlasPlayer$e extends RecyclerView$r	// class@0008b8
{
    public final SlideHorizontalAtlasPlayer a;

    public void SlideHorizontalAtlasPlayer$e(SlideHorizontalAtlasPlayer p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       int i;
       a.p(p0, "recyclerView");
       if (this.a.getMeasuredWidth()) {
          SlideHorizontalAtlasPlayer$e ta = this.a;
          if (ta.m == null) {
             if ((float)(ta.computeHorizontalScrollOffset() % this.a.getMeasuredWidth()) - ((float)this.a.getMeasuredWidth() / 2.00f) <= 0) {
                ta = this.a;
                if (ta.l == null) {
                   i = ta.getManager().i0();
                label_0048 :
                   this.a.setCurrentPosition(i);
                   this.a.K(i);
                }
             }
             i = this.a.getManager().c();
             goto label_0048 ;
          }
       }
       return;
    }
}
