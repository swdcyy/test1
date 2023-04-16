package fja.j;
import ok.x;
import qvb.i;
import rja.c;
import java.lang.Object;
import lga.a;
import com.kwai.social.config.utils.HoldoutConfigUtilKt;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.lang.Boolean;
import pia.d;
import com.yxcorp.gifshow.follow.stagger.data.m;
import qvb.n0;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class j implements x	// class@002955
{
    public final i b;
    public final c c;

    public void j(i p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object get(){
       Boolean fALSE;
       boolean b1;
       j tb = this.b;
       j tc = this.c;
       if (a.a() || HoldoutConfigUtilKt.a()) {
          fALSE = Boolean.FALSE;
       }else {
          HomeFeedResponse homeFeedResp = tb.L0();
          if (homeFeedResp == null) {
             fALSE = Boolean.FALSE;
          }else if(tb instanceof d && tb.Z2().D1()){
             fALSE = Boolean.FALSE;
          }else if(!QCurrentUser.ME.isLogined()){
             fALSE = Boolean.valueOf(homeFeedResp.mNeedShowNotLoginInterestedUser);
          }else {
             boolean b = false;
             if (homeFeedResp.mNeedShowInterestedUser == null) {
                if (tc.f() && tb.isEmpty()) {
                   b = true;
                }
                fALSE = Boolean.valueOf(b);
             }else if(tb.isEmpty()){
                Objects.requireNonNull(tc);
                Object obj = PatchProxy.apply(null, tc, c.class, "8");
                if (obj != PatchProxyResult.class) {
                   b1 = obj.booleanValue();
                }else if(!tc.e() && (tc.j() || tc.f())){
                   b = 1;
                }
                b1 = b;
                fALSE = Boolean.valueOf(b1);
             }else if(!tb.hasMore()){
                if (tc.e() || tc.f()) {
                   b = true;
                }
                fALSE = Boolean.valueOf(b);
             }else {
                fALSE = Boolean.FALSE;
             }
          }
       }
       return fALSE;
    }
}
