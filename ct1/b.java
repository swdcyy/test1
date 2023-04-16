package ct1.b;
import com.kuaishou.live.viewcontroller.ViewController;
import zs1.b;
import com.kuaishou.protobuf.livestream.nano.CohesionPkInfo;
import ps1.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ut1.j;
import android.view.View;
import android.view.ViewGroup;
import com.kuaishou.live.common.core.component.multipk.game.cohesion.rank.LiveMultiPkCohesionRankVC;

public final class b extends ViewController	// class@001e4b
{
    public LiveMultiPkCohesionRankVC j;
    public final b k;
    public final CohesionPkInfo l;
    public final e m;

    public void b(b p0,CohesionPkInfo p1,e p2){
       a.p(p0, "coreModel");
       a.p(p2, "pkDelegate");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
    }
    public void F2(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0cbc);
       if (!PatchProxy.applyVoid(objArray, this, uob, "4") && this.k.w().j == null) {
          ViewGroup viewGroup = this.A2(R.id.live_multi_pk_cohesion_rank_entry_container);
          if (viewGroup != null) {
             LiveMultiPkCohesionRankVC liveMultiPkC = new LiveMultiPkCohesionRankVC(this.k, this.l, this.m);
             this.j = liveMultiPkC;
             a.m(liveMultiPkC);
             this.y2(viewGroup, liveMultiPkC);
          }
       }
       return;
    }
    public void J2(){
       PatchProxy.applyVoid(null, this, b.class, "2");
    }
}
