package e69.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e69.b$a;
import s2b.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import s2b.a;
import com.yxcorp.gifshow.aggregate.relation.RelationAggregateFragment;

public class b extends PresenterV2	// class@002148
{
    public RelationAggregateFragment p;
    public String q;
    public a r;

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       if (this.r == null) {
          this.r = new b$a(this);
       }
       this.p.r9().h(this.r);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("RELATION_USER_FRAGMENT");
       this.q = this.r8("RELATION_AGGREGATE_QUERY_URL");
       return;
    }
}
