package androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.RecyclerView$l$b;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;

public class RecyclerView$m implements RecyclerView$l$b	// class@000897
{
    public final RecyclerView a;

    public void RecyclerView$m(RecyclerView p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView$ViewHolder p0){
       p0.setIsRecyclable(true);
       RecyclerView$ViewHolder viewHolder = null;
       if (p0.mShadowedHolder != null && p0.mShadowingHolder == null) {
          p0.mShadowedHolder = viewHolder;
       }
       p0.mShadowingHolder = viewHolder;
       if (!p0.shouldBeKeptAsChild() && (!this.a.removeAnimatingView(p0.itemView) && p0.isTmpDetached())) {
          this.a.removeDetachedView(p0.itemView, false);
       }
    label_002f :
       return;
    }
}
