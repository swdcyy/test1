package dac.s;
import com.yxcorp.gifshow.pymk.net.a;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendFragment;
import ok.x;
import com.yxcorp.gifshow.pymk.net.RecommendUserResponseV2;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Collection;
import ekd.q;
import com.kwai.framework.model.user.RecoUser;

public class s extends a	// class@00214b
{
    public final ExploreFriendFragment f;

    public void s(ExploreFriendFragment p0,boolean p1,x p2,x p3,x p4){
       this.f = p0;
       super(p1, null, p3, p4);
    }
    public void a(RecommendUserResponseV2 p0,List p1,boolean p2,int p3){
       if (PatchProxy.isSupport(s.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Integer.valueOf(p3), this, s.class, "1")) {
          return;
       }
       if (p2 && !q.f(p0.mFriendUserList)) {
          int i = 0;
          while (i < p0.mFriendUserList.size()) {
             RecoUser recoUser = p0.mFriendUserList.get(i);
             if (recoUser.mUser != null) {
                recoUser.mViewType = 13;
                p1.add(i, recoUser);
             }
             i = i + 1;
          }
       }
       super.a(p0, p1, p2, p3);
       return;
    }
    public void b(RecoUser p0,boolean p1,int p2){
       p0.mViewType = 13;
    }
}
