package n1a.i$a;
import qvb.q;
import n1a.i;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.List;
import l1a.b;
import y8c.g;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import g9c.d;

public class i$a implements q	// class@0030bf
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       List items = this.b.p.q().getItems();
       int i = 0;
       while (i < items.size()) {
          i = i + 1;
          items.get(i).mIndex = i;
       }
       this.b.p.g7().W0(items);
       this.b.p.g7().k0();
       return;
    }
    public void v2(boolean p0,boolean p1){
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       List items = this.b.p.q().getItems();
       int i = 0;
       while (i < items.size()) {
          i++;
          items.get(i).mIndex = i;
       }
       if (this.b.p.ia().a1() == null) {
          this.b.p.ia().N0(this.b.r);
       }
       return;
    }
}
