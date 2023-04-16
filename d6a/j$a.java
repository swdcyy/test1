package d6a.j$a;
import d6a.k;
import qvb.i;
import java.lang.String;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import d6a.i;
import d6a.h;

public class j$a extends k	// class@001e9f
{

    public void j$a(i p0,String p1,SlideMediaType p2){
       super(p0, p1, p2);
    }
    public boolean a(QPhoto p0,boolean p1){
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (!p0.isNasaRecommendUser() && (!p0.isLocationPermissionFeed() && (!r1.r3(p0.mEntity) && (!r1.I2(p0.mEntity) && (!r1.J2(p0.mEntity) && (r1.H2(p0.mEntity) || h.a(this, p0, p1)))))))? true: false;
       return b;
    }
}
