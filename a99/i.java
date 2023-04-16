package a99.i;
import l17.b$a;
import a99.g;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import l17.a;
import android.view.View;

public class i implements b$a	// class@000066
{
    public final g a;

    public void i(g p0){
       this.a = p0;
       super();
    }
    public void a(){
       boolean b1;
       g og = g.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       i ta = this.a;
       Objects.requireNonNull(ta);
       RecyclerView$LayoutManager obj = PatchProxy.apply(null, ta, og, "18");
       boolean b = true;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else {
          obj = PatchProxy.apply(null, ta, og, "19");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
             obj = ta.I.getLayoutManager();
             if (obj instanceof LinearLayoutManager) {
                if (obj.c() > ta.X8()) {
                label_0061 :
                   b1 = true;
                }
             }else if(obj instanceof StaggeredGridLayoutManager){
                int[] ointArray1 = new int[2];
                if (obj.findLastVisibleItemPositions(ointArray1)[b] > ta.X8()) {
                   goto label_0061 ;
                }
             }
             b1 = false;
          }
       }
       if (b1) {
          this.a.P8();
          return;
       }else {
          ta = this.a;
          Objects.requireNonNull(ta);
          RecyclerView$LayoutManager obj1 = PatchProxy.apply(null, ta, og, "17");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             obj1 = ta.I.getLayoutManager();
             if (a.a(ta.I).c() <= 0) {
                View childAt = obj1.getChildAt(0);
                if (childAt != null) {
                   int[] ointArray = new int[2];
                   childAt.getLocationOnScreen(ointArray);
                   if (ointArray[b] > (ta.G - 0)) {
                   }
                }else {
                }
             }
          }
          if (b) {
             this.a.R8();
          }
          return;
       }
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       this.a.P8();
       return;
    }
}
