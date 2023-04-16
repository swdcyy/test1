package med.d;
import ufd.q;
import nfd.t0;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import g9c.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import med.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import y8c.g;
import g9c.a;
import com.yxcorp.plugin.search.entity.SearchItem;
import add.e;

public class d extends q	// class@001d11
{
    public final int a;
    public final int b;

    public void d(){
       super();
       this.a = t0.c;
       this.b = t0.i;
    }
    public int f(int p0){
       p0++;
       return (p0 * this.a);
    }
    public void g(Rect p0,RecyclerView p1,View p2,d p3,int p4,int p5,int p6){
       d uod = d.class;
       int i = 0;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, uod, "1")) {
             return;
          }
       }
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          uoc = PatchProxy.applyTwoRefs(p3, Integer.valueOf(p4), null, uoc, "1");
          if (uoc != PatchProxyResult.class) {
             i = uoc.booleanValue();
          }else if(p4 < 0 || (p4 < p3.getItemCount() && p3.W0() instanceof g)){
             uoc = p3.W0().N0(p4);
             if (uoc instanceof SearchItem) {
                i = uoc.isFeedItem();
             }
          }
       }else {
          goto label_0051 ;
       }
       if (i) {
          d ta = this.a;
          int i1 = ta / 2;
          if (!p5) {
             p0.right = i1;
             p0.left = ta;
          }else if(p5 == (p6 - 1)){
             p0.left = i1;
             p0.right = ta;
          }else {
             p0.left = i1;
             p0.right = i1;
          }
          p0.top = (p3.f0(((p4 - p5) - 1)) == e.w)? this.b: i1;
          p0.bottom = i1;
       }
       return;
    }
}
