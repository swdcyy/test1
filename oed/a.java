package oed.a;
import java.lang.Object;
import android.app.Activity;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import os5.l;
import com.yxcorp.plugin.search.utils.k;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import com.kwai.framework.model.feed.BaseFeed;
import vu5.b;

public class a	// class@001f13
{

    public void a(){
       super();
    }
    public static void a(Activity p0,LiveAudienceParam p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "5")) {
          return;
       }
       d.a(-1492894991).m1(p0, p1);
       return;
    }
    public static void b(String p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "7")) {
          return;
       }
       k.c(p1, p0);
       return;
    }
    public static void c(User p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "2")) {
          return;
       }
       a.d(p0, p1, null);
       return;
    }
    public static void d(User p0,Activity p1,QPhoto p2){
       ProfileStartParam profileStart;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (!(v0 = p1 instanceof GifshowActivity)) {
          return;
       }
       if (p2 != null && p2.isAd()) {
          if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "4") && v0) {
             profileStart = ProfileStartParam.l(p0);
             profileStart.q("SEARCH");
             profileStart.x(p2.mEntity);
             d.a(-1718536792).Y7(p1, profileStart);
          }
          return;
       }else {
          profileStart = ProfileStartParam.l(p0);
          profileStart.q("SEARCH");
          d.a(-1718536792).Kp(p1, profileStart);
          return;
       }
    }
}
