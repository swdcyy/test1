package f69.y;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f69.y$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.q;
import qvb.a;
import android.view.View;
import ekd.m1;
import android.widget.Button;
import com.yxcorp.gifshow.aggregate.relation.RelationAggregateFragment;
import d69.p;

public class y extends PresenterV2	// class@0022ca
{
    public RelationAggregateFragment p;
    public p q;
    public Button r;
    public final q s;

    public void y(){
       super();
       this.s = new y$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, y.class, "3")) {
          return;
       }
       this.q.h(this.s);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, y.class, "5")) {
          return;
       }
       this.q.f(this.s);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a0483);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, y.class, "1")) {
          return;
       }
       this.p = this.r8("RELATION_USER_FRAGMENT");
       this.q = this.r8("RELATION_USER_PAGE_LIST");
       return;
    }
}
