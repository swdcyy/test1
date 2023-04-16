package androidx.recyclerview.widget.ItemDecorStaggeredLayoutManager;
import com.yxcorp.gifshow.recycler.widget.KwaiStaggeredGridLayoutManager;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

public class ItemDecorStaggeredLayoutManager extends KwaiStaggeredGridLayoutManager	// class@000873
{
    public RecyclerView b;

    public void ItemDecorStaggeredLayoutManager(int p0,int p1){
       super(p0, p1);
    }
    public void ItemDecorStaggeredLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
    }
    public void N(RecyclerView p0){
       this.b = p0;
    }
}
