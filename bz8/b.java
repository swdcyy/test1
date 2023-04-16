package bz8.b;
import java.lang.Runnable;
import bz8.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.StringBuilder;
import yx.j0;
import g9c.a;
import t29.d;

public final class b implements Runnable	// class@000495
{
    public final a b;

    public void b(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "1")) {
          return;
       }
       a t = this.b.t;
       RecyclerView$LayoutManager layoutManage = (t != null)? t.getLayoutManager(): objArray;
       if (layoutManage instanceof LinearLayoutManager) {
          objArray = layoutManage;
       }
       int i = 0;
       int i1 = (objArray != null)? objArray.E(): 0;
       Object[] objArray1 = new Object[i];
       j0.a("ContainerSizePresenter", "recyclerView lastCompletelyVisibleItemPosition is $ "+i1, objArray1);
       a s = this.b.s;
       if (s != null) {
          i = s.getItemCount();
       }
       if (i1 < (i - 1)) {
          t = this.b.p;
          if (t != null) {
             t.y4();
          }
       }
       return;
    }
}
