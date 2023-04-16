package com.yxcorp.gifshow.detail.common.information.username.UserNameElement$h;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.username.UserNameElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import qp7.g;
import qp7.b;
import xq7.e;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.yxcorp.gifshow.detail.common.information.username.b;
import java.util.HashMap;
import java.lang.Integer;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPreInfo;
import az6.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.slideplay.c;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.CommonParams;
import e3b.a;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;

public final class UserNameElement$h implements g	// class@001467
{
    public final UserNameElement b;

    public void UserNameElement$h(UserNameElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       PhotoDetailParam mPhoto;
       if (PatchProxy.applyVoidOneRefs(p0, this, UserNameElement$h.class, "1")) {
       }else {
          Object[] objArray = null;
          if (UserNameElement.n0(this.b).isQuestionnaire()) {
             this.b.D().i();
          }else if(!VisitorModeManager.g(13)){
             b b = b.b;
             HashMap hashMap = new HashMap();
             hashMap.put("clickType", Integer.valueOf(14));
             GifshowActivity gifshowActiv = this.b.p0();
             mPhoto = UserNameElement.o0(this.b).mPhoto;
             DetailCommonParam detailCommon = UserNameElement.o0(this.b).getDetailCommonParam();
             a.o(detailCommon, "mPhotoDetailParam.detailCommonParam");
             QPreInfo preInfo = detailCommon.getPreInfo();
             a mPhotoIndex = UserNameElement.o0(this.b).mPhotoIndex;
             b uob = (k.B(UserNameElement.o0(this.b).mPhoto) != null)? b: objArray;
             c.d(gifshowActiv, mPhoto, preInfo, mPhotoIndex, true, null, uob, hashMap, this.b.C);
          }
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(objArray, p0, UserNameElement.class, "10")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CLICK_NICKNAME";
             i3 oi3 = i3.f();
             UserNameElement t = p0.t;
             if (t == null) {
                a.S("mPhoto");
             }
             oi3.c("questionnaire_link", Integer.valueOf((TextUtils.x(t.getQuestionnaireLink()) ^ 1)));
             oi3.d("location", "LEFT_CORNER");
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             t = p0.t;
             if (t == null) {
                a.S("mPhoto");
             }
             BaseFeed entity = t.getEntity();
             UserNameElement t1 = p0.t;
             if (t1 == null) {
                a.S("mPhoto");
             }
             uContentPack.photoPackage = w1.g(entity, (t1.getPosition() + 1));
             ClickMetaData uClickMetaDa = new ClickMetaData().setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack);
             UserNameElement t2 = p0.t;
             if (t2 == null) {
                a.S("mPhoto");
             }
             uClickMetaDa = uClickMetaDa.setCommonParams(a.b(t2));
             p0 = p0.t;
             if (p0 == null) {
                a.S("mPhoto");
             }
             u1.B(uClickMetaDa.setFeedLogCtx(p0.getFeedLogCtx()));
          }
       }
       return;
    }
}
