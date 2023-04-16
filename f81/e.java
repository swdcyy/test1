package f81.e;
import java.lang.Object;
import com.kuaishou.merchant.api.core.model.MerchantAudienceParams;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.activity.GifshowActivity;
import yqb.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam$b;
import java.util.List;
import java.util.Collections;
import tkd.b;
import tkd.d;
import os5.e;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam;

public class e	// class@0022cd
{

    public void e(){
       super();
    }
    public static void a(int p0,MerchantAudienceParams p1,String p2,QPhoto p3,GifshowActivity p4,c p5,boolean p6){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4,null,Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, null, uoe, "1")) {
             return;
          }
       }
       LiveAudienceParam$a uoa = new LiveAudienceParam$a();
       uoa.s(p1);
       uoa.i(p3.getLiveStreamId());
       uoa.o(p2);
       LiveAudienceParam liveAudience = uoa.a();
       LiveSlidePlayEnterParam$b uob = new LiveSlidePlayEnterParam$b();
       uob.C(p3);
       uob.q(p3.getLiveStreamId());
       uob.z(p3.getLiveStreamId());
       uob.v("/rest/n/live/feed/hotPage/slide/more");
       uob.w(Collections.singletonList(p3));
       uob.n(4);
       uob.o(p0);
       uob.l(p6);
       uob.d(1);
       uob.m(liveAudience);
       d.a(-1835681758).b1(p4, uob.k(p3.getUserId(), liveAudience.mInternalJumpSchema).a());
       return;
    }
}
