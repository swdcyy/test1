package androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.a$a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import androidx.recyclerview.widget.a$b;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import androidx.recyclerview.widget.ChildHelper;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public class RecyclerView$f implements a$a	// class@00088d
{
    public final RecyclerView a;

    public void RecyclerView$f(RecyclerView p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
       this.a.offsetPositionRecordsForMove(p0, p1);
       p0.mItemsAddedOrRemoved = true;
    }
    public void b(a$b p0){
       this.i(p0);
    }
    public void c(a$b p0){
       this.i(p0);
    }
    public void d(int p0,int p1){
       this.a.offsetPositionRecordsForRemove(p0, p1, true);
       RecyclerView$f ta = this.a;
       ta.mItemsAddedOrRemoved = true;
       RecyclerView mState = ta.mState;
       mState.d = mState.d + p1;
    }
    public void e(int p0,int p1,Object p2){
       this.a.viewRangeUpdate(p0, p1, p2);
       p0.mItemsChanged = true;
    }
    public RecyclerView$ViewHolder f(int p0){
       RecyclerView$ViewHolder viewHolder = this.a.findViewHolderForPosition(p0, true);
       if (viewHolder == null) {
          return null;
       }
       if (this.a.mChildHelper.isHidden(viewHolder.itemView)) {
          return null;
       }
       return viewHolder;
    }
    public void g(int p0,int p1){
       this.a.offsetPositionRecordsForInsert(p0, p1);
       p0.mItemsAddedOrRemoved = true;
    }
    public void h(int p0,int p1){
       this.a.offsetPositionRecordsForRemove(p0, p1, false);
       p0.mItemsAddedOrRemoved = true;
    }
    public void i(a$b p0){
       RecyclerView$f ta;
       a$b a = p0.a;
       int i = 1;
       if (a != i) {
          if (a != 2) {
             if (a != 4) {
                if (a == 8) {
                   ta = this.a;
                   ta.mLayout.onItemsMoved(ta, p0.b, p0.d, i);
                }
             }else {
                ta = this.a;
                ta.mLayout.onItemsUpdated(ta, p0.b, p0.d, p0.c);
             }
          }else {
             ta = this.a;
             ta.mLayout.onItemsRemoved(ta, p0.b, p0.d);
          }
       }else {
          ta = this.a;
          ta.mLayout.onItemsAdded(ta, p0.b, p0.d);
       }
       return;
    }
}
