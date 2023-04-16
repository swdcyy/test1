package dac.t;
import com.yxcorp.gifshow.pymk.f;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendFragment;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import com.yxcorp.gifshow.pymk.net.RecommendUserResponseV2;
import la6.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qvb.n0;
import java.util.Collection;
import ekd.q;

public class t extends f	// class@00214c
{
    public final ExploreFriendFragment E;

    public void t(ExploreFriendFragment p0,int p1,String p2){
       this.E = p0;
       super(p1, null);
    }
    public void M1(Object p0,List p1){
       this.o2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.o2(p0, p1);
    }
    public void o2(RecommendUserResponseV2 p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, t.class, "1")) {
          return;
       }
       if (this.K()) {
          this.E.L = (p0 != null && !q.f(p0.mFriendUserList))? true: false;
       }
    label_0026 :
       this.E.M = true;
       super.o2(p0, p1);
       return;
    }
}
