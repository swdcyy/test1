package eja.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import eja.m1$a;
import eja.m1$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import qvb.q;
import qvb.j;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import qvb.i;
import rja.c;

public class m1 extends PresenterV2	// class@0026dd
{
    public HomeFollowFragment p;
    public RecyclerView q;
    public i r;
    public c s;
    public boolean t;
    public final q u;
    public final RecyclerView$r v;

    public void m1(){
       super();
       this.u = new m1$a(this);
       this.v = new m1$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m1.class, "4")) {
          return;
       }
       this.q.addOnScrollListener(this.v);
       this.r.h(this.u);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, m1.class, "5")) {
          return;
       }
       this.q.removeOnScrollListener(this.v);
       this.r.f(this.u);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m1.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.q8(RecyclerView.class);
       this.r = this.r8("PAGE_LIST");
       this.s = this.r8("FOLLOW_FILTER_STATE");
       return;
    }
}
