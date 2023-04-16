package c5c.t;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.common.model.AdUnionFollowInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.commercial.common.model.AdUnionFollowInfo$LiveInfo;
import com.yxcorp.gifshow.commercial.common.model.AdUnionFollowInfo$ShopInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.User;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import android.app.Activity;
import lnc.a1;
import tkd.b;
import tkd.d;
import nl9.u;

public class t	// class@000533
{

    public void t(){
       super();
    }
    public static boolean a(AdUnionFollowInfo p0){
       boolean b1;
       boolean b2;
       t ot = t.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, ot, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       AdUnionFollowInfo obj1 = PatchProxy.applyOneRefs(p0, null, ot, "2");
       if (obj1 != PatchProxyResult.class) {
          b1 = obj1.booleanValue();
       }else {
          obj1 = p0.mLiveInfo;
          b1 = (obj1 != null)? obj1.isLiving(): false;
       }
       if (!b1) {
          Object obj2 = PatchProxy.applyOneRefs(p0, null, ot, "3");
          if (obj2 != PatchProxyResult.class) {
             b2 = obj2.booleanValue();
          }else {
             p0 = p0.mShopInfo;
             b2 = (p0 != null)? TextUtils.isEmpty(p0.mShopLink) ^ 1: 0;
          }
          if (!b2) {
          label_0053 :
             return b;
          }
       }
       b = true;
       goto label_0053 ;
    }
    public static void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, t.class, "5")) {
          return;
       }
       Log.d("UnionFollow", p0.getMessage());
       return;
    }
    public static void c(GifshowActivity p0,QPhoto p1,User p2,AdUnionFollowInfo p3,ProfileParam p4){
       if (PatchProxy.isSupport2(t.class, "4")) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, t.class, "4")) {
             return;
          }
       }
       if (p3 == null) {
          Log.d("UnionFollow", "adUnionFollowInfo is null");
          PatchProxy.onMethodExit(t.class, "4");
          return;
       }else if(a1.i(p0)){
          d.a(-1694791652).Qd(p0, p1, p2, p3, p4.mAdExtra, p4.mServerExpTag);
       }
       PatchProxy.onMethodExit(t.class, "4");
       return;
    }
}
