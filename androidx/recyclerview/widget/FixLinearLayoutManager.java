package androidx.recyclerview.widget.FixLinearLayoutManager;
import androidx.recyclerview.widget.ObservableLinearLayoutManager;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import hn5.i0;
import uw9.o;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import q87.c;

public class FixLinearLayoutManager extends ObservableLinearLayoutManager	// class@00086e
{

    public void FixLinearLayoutManager(Context p0){
       super(p0);
    }
    public void FixLinearLayoutManager(Context p0,int p1,boolean p2){
       super(p0, p1, p2);
    }
    public void FixLinearLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
    }
    public void removeAndRecycleAllViews(RecyclerView$t p0){
       View obj;
       int i3;
       int i = 0;
       try{
          int i1 = this.getChildCount() - 1;
          int i2 = i;
          while (i1 >= 0) {
             try{
                View childAt = this.getChildAt(i1);
                if (!i1) {
                   i3 = i;
                }else {
                   i3 = i1 - 1;
                   i3 = this.getChildAt(i3);
                }
                if (!RecyclerView.getChildViewHolderInt(childAt).shouldIgnore()) {
                   this.removeAndRecycleViewAt(i1, p0);
                }
                i1 = i1 - 1;
                obj = i3;
             }catch(java.lang.Exception e9){
                Object obj1 = i;
             }
             i0.b("FixLinearLayoutManager", "last = "+i+", next = "+obj);
             Object[] objArray = new Object[0];
             o.C().u("FixLinearLayoutManager", new IllegalStateException("last = "+i+", next = "+obj, e9), objArray);
          }
          return;
       }catch(java.lang.Exception e9){
          obj = i;
          goto label_0030 ;
       }
    }
}
