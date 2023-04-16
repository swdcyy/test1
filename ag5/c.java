package ag5.c;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import lnc.i3;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed;
import com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed$ContentInfo;
import com.kuaishou.android.model.feed.ContentAggregateWeakFeed;
import com.kuaishou.android.model.mix.ContentAggregateWeakMeta;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$CoverAggregateMeta;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$NegativeReason;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.Collection;
import ekd.q;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;
import com.kuaishou.android.model.feed.ActivityTemplateFeed;
import tl8.d;
import com.yxcorp.gifshow.util.rx.RxBus;
import zf5.a;
import java.lang.StringBuilder;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.CharSequence;
import java.lang.Iterable;
import android.text.TextUtils;
import com.yxcorp.gifshow.log.model.ShowMetaData;

public final class c	// class@00009c
{

    public void c(){
       super();
    }
    public static void a(QPhoto p0,i3 p1){
       LocalFuncTemplateFeed$ContentInfo mContentType;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "9")) {
          return;
       }
       if (p0.isLocalFunTemplateType()) {
          mContentType = p0.mEntity.mContentInfo.mContentType;
       }else if(p0.isLocalContentAggregateWeak()){
          mContentType = p0.mEntity.mRankInfo.mContentType;
       }else if(p0.isLocalCoverAggregateType()){
          mContentType = p0.mEntity.mCoverAggregateMeta.mContentType;
       }else {
          mContentType = -1;
       }
       if (mContentType != -1) {
          p1.c("sub_content_type", Integer.valueOf(mContentType));
       }
       return;
    }
    public static i3 b(QPhoto p0,FeedNegativeFeedback$NegativeReason p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       i3 oi3 = c.c(p0);
       oi3.d("content_type", TextUtils.I(p1.mContentType));
       oi3.d("one_level_reason_id", TextUtils.I(p1.mId));
       oi3.d("one_level_reason_content", TextUtils.I(p1.mTitle));
       return oi3;
    }
    public static i3 c(QPhoto p0){
       i3 obj = PatchProxy.applyOneRefs(p0, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       String str = (p0.isLiveStream())? "live_stream_id": "photo_id";
       obj.d(str, p0.getPhotoId());
       obj.d("exp_tag", TextUtils.I(p0.getExpTag()));
       obj.a("is_article", Boolean.valueOf(p0.isArticle()));
       obj.d("server_exp_tag", TextUtils.I(p0.getServerExpTag()));
       return obj;
    }
    public static void d(QPhoto p0,FeedNegativeFeedback$NegativeReason p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), null, c.class, "8")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "CLICK_ONE_LEVEL_DIALOG";
       i3 oi3 = c.b(p0, p1);
       oi3.c("has_two_level_dialog", Integer.valueOf((q.f(p1.mDetailReason) ^ 1)));
       c.a(p0, oi3);
       String str = (p3)? "TRUE": "FALSE";
       oi3.d("is_new_style", str);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p0.getEntity());
       u1.B(new ClickMetaData().setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(p0.getFeedLogCtx()));
       if (p0.isActivityTemplate()) {
          c.e(p0.mEntity.a(ActivityTemplateFeed.class), p1);
       }
       if (p2) {
          RxBus.f.b(new a(p0, p1));
       }
       return;
    }
    public static void e(ActivityTemplateFeed p0,FeedNegativeFeedback$NegativeReason p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "15")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "OPERATION_ONE_LEVEL_DIALOG";
       uElementPack.params = "{\"REASON_TYPE\":"+p1.mId+"}";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p0);
       p0 = p0.mCommonMeta;
       if (p0 != null) {
          uContentPack.ksOrderInfoPackage = l0.a(p0.mKsOrderId);
       }
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void f(QPhoto p0,FeedNegativeFeedback$NegativeReason p1,boolean p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, c.class, "11")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "REMOVE_CONFIRM_POP";
       i3 oi3 = c.b(p0, p1);
       String str = (p2)? "confirm": "cancel";
       oi3.d("click_area", str);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p0.getEntity());
       u1.u(1, uElementPack, uContentPack);
       if (p0.isActivityTemplate()) {
          c.e(p0.mEntity.a(ActivityTemplateFeed.class), p1);
       }
       return;
    }
    public static void g(QPhoto p0,FeedNegativeFeedback$NegativeReason p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "4")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "CLICK_ROAST_CLOSE_BUTTON";
       uElementPack.params = c.b(p0, p1).e();
       u1.u(1, uElementPack, null);
       return;
    }
    public static void h(QPhoto p0,List p1,boolean p2,List p3){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, null, c.class, "6")) {
          return;
       }
       if (q.f(p1)) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SHOW_ONE_LEVEL_DIALOG";
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       ArrayList uArrayList2 = new ArrayList();
       Iterator iterator = p1.iterator();
       String str = "";
       while (iterator.hasNext()) {
          FeedNegativeFeedback$NegativeReason negativeReas = iterator.next();
          if (negativeReas.mIsTitle != null) {
             continue ;
          }else if(TextUtils.x(str) && !TextUtils.x(negativeReas.mContentType)){
             str = negativeReas.mContentType;
          }
          uArrayList.add(negativeReas.mId);
          uArrayList2.add(negativeReas.mTitle);
          if (!q.f(negativeReas.mDetailReason)) {
             uArrayList1.add(negativeReas.mId);
          }
       }
       if (!q.f(p3)) {
          uArrayList2.addAll(p3);
       }
       i3 oi3 = c.c(p0);
       oi3.d("content_type", TextUtils.I(str));
       oi3.d("reasons", TextUtils.join(",", uArrayList));
       oi3.d("second_page_id", TextUtils.join(",", uArrayList1));
       oi3.d("reasons_content", TextUtils.join("|", uArrayList2));
       String str1 = (p2)? "TRUE": "FALSE";
       oi3.d("is_new_style", str1);
       c.a(p0, oi3);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p0.getEntity());
       u1.B0(new ShowMetaData().setType(6).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(p0.getFeedLogCtx()));
       return;
    }
}
