package g69.a;
import f7c.d;
import android.app.Activity;
import java.lang.String;
import com.kwai.framework.model.user.RecoUser;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.yxcorp.gifshow.pymk.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.live.LiveTipInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import tkd.b;
import tkd.d;
import os5.l;
import java.lang.StringBuilder;
import g7c.e;
import g7c.a;
import a7c.h;
import com.yxcorp.gifshow.pymk.log.PymkLogSender;
import org.json.JSONObject;
import g7c.i;
import java.util.ArrayList;
import java.util.List;

public class a extends d	// class@002420
{
    public final String f;
    public final int g;
    public final int h;
    public Activity i;

    public void a(Activity p0,String p1,int p2,int p3){
       super();
       this.f = p1;
       this.g = p2;
       this.i = p0;
       this.h = p3;
    }
    public void Ad(RecoUser p0,User p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, a.class, "5")) {
          return;
       }
       if (b.a()) {
          this.c(p0, p1, p2);
       }else {
          super.Ad(p0, p1, p2);
       }
       return;
    }
    public boolean If(RecoUser p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.h > null && p0 != null) {
          p0 = p0.mUser;
          if (p0 != null && p0.mIsLiving != null) {
             User mLiveTipInfo = p0.mLiveTipInfo;
             if (mLiveTipInfo != null && !TextUtils.isEmpty(mLiveTipInfo.mLiveStreamId)) {
                b = true;
             }
          }
       }
       return b;
    }
    public void W9(RecoUser p0,User p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
          return;
       }
       if (this.If(p0)) {
          this.d(p0);
          return;
       }else {
          super.W9(p0, p1);
          return;
       }
    }
    public void a5(RecoUser p0,User p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "4")) {
          return;
       }
       if (this.If(p0)) {
          this.d(p0);
          return;
       }else {
          super.a5(p0, p1);
          return;
       }
    }
    public final void d(RecoUser p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       if (!this.i instanceof GifshowActivity) {
          return;
       }
       User mLiveTipInfo = p0.mUser.mLiveTipInfo;
       LiveAudienceParam$a uoa = new LiveAudienceParam$a();
       uoa.i(mLiveTipInfo.mLiveStreamId);
       uoa.n(mLiveTipInfo.mExptag);
       uoa.g(this.h);
       d.a(-1492894991).wV(this.i, uoa.a(), 1025);
       e.a(d.e, "onAvatarClick - userName is "+p0.mUser.mName);
       PymkLogSender.reportClickLive(this.od(p0.mUser), this.b7(p0.mUser), mLiveTipInfo.mLiveStreamId, p0.mUser, this.b.j());
       RecoUser mUser = p0.mUser;
       i.b(mUser, this.od(mUser), this.b.k(), "live_pendent");
       if (!PatchProxy.applyVoidOneRefs(p0, this, d.class, "19") && p0.mShowed == null) {
          p0.mShowed = true;
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(p0);
          this.Ee(uArrayList);
       }
       return;
    }
}
