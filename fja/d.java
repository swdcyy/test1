package fja.d;
import com.yxcorp.gifshow.pymk.net.a;
import ok.x;
import fja.c;
import com.yxcorp.gifshow.pymk.net.RecommendUserResponseV2;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.framework.model.user.RecoUser;

public class d extends a	// class@00294e
{
    public final x f;

    public void d(x p0,x p1){
       super(false, c.b, true, p0);
       this.f = p1;
    }
    public void a(RecommendUserResponseV2 p0,List p1,boolean p2,int p3){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Integer.valueOf(p3), this, d.class, "1")) {
          return;
       }
       super.a(p0, p1, p2, p3);
       if (PatchProxy.isSupport(d.class) && (!PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p2), p1, this, d.class, "2") && p2)) {
          d tf = this.f;
          if (tf != null && tf.get().booleanValue()) {
             RecoUser recoUser = new RecoUser();
             recoUser.mShowed = true;
             recoUser.mViewType = 18;
             p1.add(0, recoUser);
          }
       }
       return;
    }
}
