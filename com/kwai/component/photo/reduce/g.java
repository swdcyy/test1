package com.kwai.component.photo.reduce.g;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.photo.reduce.PhotoReduceToast;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.Window;
import android.app.Activity;
import e3a.a;
import android.view.View;
import java.lang.Runnable;
import android.view.ViewPropertyAnimator;
import l2.b;
import android.animation.TimeInterpolator;
import yf5.b2;
import android.animation.Animator$AnimatorListener;
import java.util.List;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback;
import java.lang.reflect.Type;
import yf5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import android.content.SharedPreferences;
import km8.b;
import com.kuaishou.android.model.mix.CommonMeta;
import tl8.d;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$NegativeReason;
import wkd.b;
import ip.b;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kwai.user.base.intimate.b;
import com.yxcorp.gifshow.model.IntimateResponse;
import com.yxcorp.gifshow.model.IntimateResponse$UnFollowIntimateReminder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.component.photo.reduce.g$b;
import el.a;
import com.kwai.component.photo.reduce.g$c;
import com.kwai.component.photo.reduce.g$d;
import java.lang.Integer;
import lnc.a1;
import com.kuaishou.android.model.mix.QRecoTag;
import yf5.l0;
import com.kwai.library.widget.popup.common.c;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import lnc.ja;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.component.photo.reduce.g$a;
import kzc.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import kotlin.jvm.internal.a;
import yf5.q;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.kwai.library.widget.popup.common.c$b;
import yf5.r;
import com.kwai.library.widget.popup.common.PopupInterface$f;

public final class g	// class@000ae9
{
    public static boolean a;

    public void g(){
       super();
    }
    public static void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, g.class, "18")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       View obj = PatchProxy.applyOneRefs(p0, null, PhotoReduceToast.class, "4");
       if (obj != patchProxyRe) {
          obj.booleanValue();
       }else {
          obj = PatchProxy.applyOneRefs(p0, null, PhotoReduceToast.class, "7");
          if (obj != patchProxyRe) {
          }else {
             Window window = PatchProxy.applyOneRefs(p0, null, PhotoReduceToast.class, "6");
             if (window != patchProxyRe) {
             }else {
                Activity uActivity = a.b(p0);
                window = (uActivity != null)? uActivity.getWindow(): null;
             }
             if (window != null) {
                obj = window.findViewById(0x7f0a3f9b);
             }else {
                obj = null;
             }
          }
          boolean b = false;
          if (obj != null) {
             Object obj1 = PatchProxy.apply(null, obj, PhotoReduceToast.class, "9");
             if (obj1 != patchProxyRe) {
                obj1.booleanValue();
             }else if(PatchProxy.isSupport(PhotoReduceToast.class)){
                obj1 = PatchProxy.applyOneRefs(Boolean.TRUE, obj, PhotoReduceToast.class, "10");
                if (obj1 != patchProxyRe) {
                   obj1.booleanValue();
                }
             }
             if (obj.f != null) {
                obj.f = b;
                if (!PatchProxy.applyVoid(null, obj, PhotoReduceToast.class, "12")) {
                   PhotoReduceToast e = obj.e;
                   if (e != null) {
                      e.run();
                      obj.e = null;
                   }
                }
                obj.b.animate().translationY((float)(- obj.b.getHeight())).setDuration(200).setInterpolator(new b()).setListener(new b2(obj)).start();
             }
          }
       }
       return;
    }
    public static List b(){
       FeedNegativeFeedback obj = PatchProxy.apply(null, null, g.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a(FeedNegativeFeedback.class);
       if (obj == null) {
          return null;
       }
       return obj.mLiveSquareReasons;
    }
    public static List c(QPhoto p0,boolean p1,boolean p2,Boolean p3){
       String obj;
       FeedNegativeFeedback uFeedNegativ;
       boolean b;
       FeedNegativeFeedback mPhotoReason;
       FeedNegativeFeedback mChannelReas;
       b a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, null, g.class, "11");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = "";
       if (p2) {
          uFeedNegativ = FeedNegativeFeedback.class;
          String str = a.a.getString("followPageNegativeFeedback", obj);
          uFeedNegativ = (str == null || str == obj)? null: b.a(str, uFeedNegativ);
       }else {
          uFeedNegativ = a.a(FeedNegativeFeedback.class);
       }
       if (uFeedNegativ == null) {
          return null;
       }else {
          QPhoto mEntity = p0.mEntity;
          Object obj1 = PatchProxy.applyOneRefs(mEntity, null, og, "14");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             CommonMeta uCommonMeta = mEntity.a(CommonMeta.class);
             b = (uCommonMeta != null && uCommonMeta.mShowGrDetailPage != null)? true: false;
          }
          if (b) {
             mPhotoReason = uFeedNegativ.mPhotoReasons;
             if (q.f(mPhotoReason)) {
                return null;
             }else {
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = mPhotoReason.iterator();
                while (iterator.hasNext()) {
                   FeedNegativeFeedback$NegativeReason negativeReas = iterator.next();
                   if ((negativeReas.mId).equals("4")) {
                      negativeReas.mSubTitle = obj;
                   }
                   if (!(negativeReas.mId).equals("2")) {
                      uArrayList.add(negativeReas);
                   }
                }
                g.i(uArrayList, "PHOTO");
                return uArrayList;
             }
          }else if(p0.isLiveStream()){
             mPhotoReason = uFeedNegativ.mLiveReasons;
             g.i(mPhotoReason, "LIVE_STREAM");
             return mPhotoReason;
          }else {
             Object obj2 = PatchProxy.applyOneRefs(p0, null, og, "23");
             boolean b1 = (obj2 != patchProxyRe)? obj2.booleanValue(): b.a(-570058679).b(p0.mEntity);
             if (b1 && !q.f(uFeedNegativ.mAdReasons)) {
                mPhotoReason = uFeedNegativ.mAdReasons;
                g.i(mPhotoReason, "AD");
                return mPhotoReason;
             }else if(p1){
                mChannelReas = uFeedNegativ.mChannelReasons;
                if (!q.f(mChannelReas)) {
                   if (g.g(p0)) {
                      g.i(mChannelReas, "PHOTO");
                   }
                   return mChannelReas;
                }
             }else {
                mChannelReas = null;
             }
             if (p0.isLocalFunTemplateType()) {
                mChannelReas = uFeedNegativ.mFunctionalTemplate;
                if (!q.f(mChannelReas)) {
                   g.i(mChannelReas, "NEARBY_FUNC_TEMPLATE");
                   return mChannelReas;
                }
             }
             if (r1.r2(p0.mEntity)) {
                mChannelReas = uFeedNegativ.mContentAggregateWeakTemplate;
                if (!q.f(mChannelReas)) {
                   g.i(mChannelReas, "NEARBY_AGGREGATE_WEAK");
                   return mChannelReas;
                }
             }
             if (r1.U2(p0.mEntity)) {
                mChannelReas = uFeedNegativ.mCoverAggregateTemplate;
                if (!q.f(mChannelReas)) {
                   g.i(mChannelReas, "NEARBY_COVER_AGGREGATE");
                   return mChannelReas;
                }
             }
             if (p3.booleanValue()) {
                mChannelReas = uFeedNegativ.mReasonsForRecommend;
                if (!q.f(mChannelReas)) {
                   g.i(mChannelReas, "RECOMMEND_PHOTO");
                   return mChannelReas;
                }
             }
             if (r1.k2(p0.mEntity)) {
                mChannelReas = uFeedNegativ.mChannelTemplatePhoto;
                g.i(mChannelReas, "CHANNEL_TEMPLATE");
             }
             if (g.g(p0)) {
                mChannelReas = uFeedNegativ.mPhotoReasons;
                g.i(mChannelReas, "PHOTO");
                if (!p2 || (p0.getCommonMeta() == null || (p0.getCommonMeta().mIntimateType > null && !PatchProxy.applyVoidOneRefs(mChannelReas, null, og, "12")))) {
                   a = b.a(0x40193068).a;
                   IntimateResponse mUnFollowInt = (a != null)? a.mUnFollowIntimateReminder: null;
                   if (mUnFollowInt != null && !TextUtils.x(mUnFollowInt.mSubTitle)) {
                      Iterator iterator1 = mChannelReas.iterator();
                      while (iterator1.hasNext()) {
                         FeedNegativeFeedback$NegativeReason negativeReas1 = iterator1.next();
                         if (TextUtils.n(mUnFollowInt.mId, negativeReas1.mId)) {
                            negativeReas1.mSubTitle = mUnFollowInt.mSubTitle;
                            break ;
                         }
                      }
                   }
                }
             }
          label_01be :
             if (q.f(mChannelReas)) {
                return null;
             }else {
                g.h(mChannelReas, p0);
                return mChannelReas;
             }
          }
       }
    }
    public static FeedNegativeFeedback d(QPhoto p0,boolean p1,boolean p2){
       FeedNegativeFeedback obj;
       FeedNegativeFeedback uFeedNegativ;
       FeedNegativeFeedback mPhotoNegati;
       String str;
       String str1;
       if (PatchProxy.isSupport(g.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), null, g.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = a.a(FeedNegativeFeedback.class);
       if (obj == null) {
          try{
             obj = a.a.h("{\"followLiveNegative\":[{\"id\":\"6\",\"title\":\"不喜欢该直播\",\"iconImageUrl\":\"https://static.yximgs.com/udata/pkg/KS-LowActiveBanner_2/light/cileizuopingguoduo.png\",\"toast\":\"反馈成功，将为你优化推荐结果\"},{\"id\":\"4\",\"title\":\"取消关注\",\"iconImageUrl\":\"https://static.yximgs.com/udata/pkg/KS-LowActiveBanner_2/light/bukangaizuozhe.png\",\"toast\":\"反馈成功，将为你优化推荐结果\"}],\"specialPhotoNegative\":[{\"id\":\"16\",\"title\":\"不喜欢该内容\",\"iconImageUrl\":\"https://static.yximgs.com/udata/pkg/KS-LowActiveBanner_2/light/buganxingqu.png\",\"darkIconImageUrl\":\"https://static.yximgs.com/udata/pkg/KS-LowActiveBanner_2/light/buganxingqu_dark.png\",\"toast\":\"反馈成功，将为你优化推荐结果\"}],\"photoContentNegative\":[{\"id\":\"5\",\"title\":\"内容质量较差\",\"toast\":\"反馈成功，将为你优化推荐结果\"},{\"id\":\"8\",\"title\":\"相似内容过多\",\"toast\":\"反馈成功，将为你优化推荐结果\"},{\"id\":\"14\",\"title\":\"内容虚假夸张\",\"toast\":\"反馈成功，将为你优化推荐结果\"},{\"id\":\"11\",\"title\":\"疑似广告\",\"toast\":\"反馈成功，将为你优化推荐结果\"},{\"id\":\"6\",\"title\":\"色情低俗\",\"toast\":\"反馈成功，将为你优化推荐结果\"},{\"id\":\"7\",\"title\":\"封面标题党\",\"toast\":\"反馈成功，将为你优化推荐结果\"}],\"photoContentNegativeHeader\":[{\"title\":\"内容反馈\",\"iconImageUrl\":\"https://static.yximgs.com/udata/pkg/webserver/feedback/header_icon_content_v1.png\",\"darkIconImageUrl\":\"https://static.yximgs.com/udata/pkg/webserver/feedback/header_icon_content_v1.png\"}],\"followPhotoNegative\":[{\"id\":\"1\",\"title\":\"不喜欢该作品\",\"iconImageUrl\":\"https://static.yximgs.com/udata/pkg/KS-LowActiveBanner_2/light/buganxingqu.png\",\"darkIconImageUrl\":\"https://static.yximgs.com/udata/pkg/KS-LowActiveBanner_2/light/buganxingqu_dark.png\",\"toast\":\"反馈成功，将为你优化推荐结果\"},{\"id\":\"4\",\"title\":\"取消关注\",\"iconImageUrl\":\"https://static.yximgs.com/udata/pkg/KS-LowActiveBanner_2/light/bukangaizuozhe.png\"
    ,\"darkIconImageUrl\":\"https://static.yximgs.com/udata/pkg/KS-LowActiveBanner_2/light/bukangaizuozhe_dark.png\",\"toast\":\"反馈成功，将为你优化推荐结果\"}],\"photoNegative\":[{\"id\":\"1\",\"title\":\"不喜欢该作品\",\"iconImageUrl\":\"https://static.yximgs.com/udata/pkg/KS-LowActiveBanner_2/light/buganxingqu.png\",\"darkIconImageUrl\":\"https://static.yximgs.com/udata/pkg/KS-LowActiveBanner_2/light/buganxingqu_dark.png\",\"toast\":\"反馈成功，将为你优化推荐结果\"},{\"id\":\"4\",\"title\":\"不喜欢该作者\",\"iconImageUrl\":\"https://static.yximgs.com/udata/pkg/KS-LowActiveBanner_2/light/bukangaizuozhe.png\",\"darkIconImageUrl\":\"https://static.yximgs.com/udata/pkg/KS-LowActiveBanner_2/light/bukangaizuozhe_dark.png\",\"toast\":\"反馈成功，将为你优化推荐结果\"}],\"liveNegative\":[{\"id\":\"4\",\"title\":\"不喜欢该主播\",\"iconImageUrl\":\"https://static.yximgs.com/udata/pkg/KS-LowActiveBanner_2/light/bukangaizuozhe.png\",\"toast\":\"反馈成功，将为你优化推荐结果\"},{\"id\":\"6\",\"title\":\"不喜欢该直播\",\"iconImageUrl\":\"https://static.yximgs.com/udata/pkg/KS-LowActiveBanner_2/light/cileizuopingguoduo.png\",\"toast\":\"反馈成功，将为你优化推荐结果\"}],\"photoNegativeHeader\":[{\"title\":\"不感兴趣\",\"iconImageUrl\":\"https://static.yximgs.com/udata/pkg/webserver/feedback/header_icon_not_interested_v1.png\",\"darkIconImageUrl\":\"https://static.yximgs.com/udata/pkg/webserver/feedback/header_icon_not_interested_v1.png\"}]}", FeedNegativeFeedback.class);
          }catch(java.lang.Exception e0){
          }
       }
    }
    public static List e(List p0,int p1){
       ArrayList uArrayList;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, og, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          uArrayList = new ArrayList();
          uArrayList.add(new FeedNegativeFeedback$NegativeReason());
       }else if(!p0.size()){
          p0.add(new FeedNegativeFeedback$NegativeReason());
       }
       int i = 0;
       if (TextUtils.x(uArrayList.get(i).mTitle)) {
          uArrayList.get(i).mTitle = a1.p(p1);
       }
       p1.mIsTitle = true;
       return uArrayList;
    }
    public static boolean f(int p0){
       boolean b = (p0 != 8 && (p0 != 9 && (p0 != 47 && (p0 != 88 && (p0 != 123 && (p0 == 288 || p0 == 289))))))? true: false;
       return b;
    }
    public static boolean g(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!p0.isVideoType() && (p0.isImageType() || p0.isArticle()))? true: false;
       return b;
    }
    public static void h(List p0,QPhoto p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, g.class, "17")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          FeedNegativeFeedback$NegativeReason negativeReas = iterator.next();
          if (!TextUtils.n(negativeReas.mId, "1")) {
             continue ;
          }else if(negativeReas.mDetailReason == null){
             negativeReas.mDetailReason = new ArrayList();
          }
          if (!q.f(p1.getPhotoMmuTagInfo())) {
             negativeReas.mDetailReason.addAll(p1.getPhotoMmuTagInfo());
          }
          if (!TextUtils.x(negativeReas.mSubTitle)) {
             break ;
          }else {
             int i = 0;
             if (negativeReas.mDetailReason.size() > 1) {
                Object[] objArray = new Object[]{negativeReas.mDetailReason.get(i).mName,negativeReas.mDetailReason.get(1).mName};
                negativeReas.mSubTitle = String.format("%s、%s", objArray);
                break ;
             }else if(negativeReas.mDetailReason.size() > 0){
                negativeReas.mSubTitle = negativeReas.mDetailReason.get(i).mName;
                break ;
             }else {
                break ;
             }
          }
       }
       return;
    }
    public static void i(ArrayList p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, g.class, "22")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          iterator.next().mContentType = p1;
       }
       return;
    }
    public static c j(l0 p0){
       g$a uoa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       l0 obj = null;
       PopupInterface$h obj1 = PatchProxy.applyOneRefs(p0, obj, g.class, "9");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (VisitorModeManager.f()) {
          return obj;
       }
       ja.a();
       obj1 = (p0.c() != null)? p0.c(): new g$a();
       obj = PatchProxy.applyWithListener(obj, p0, l0.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = p0.o;
          if (obj == null) {
             a.S("mActivity");
          }
          PatchProxy.onMethodExit(l0.class, "1");
       }
       d uod = new d(obj);
       uod.G(new q(p0));
       uod.O(new r(p0));
       uod.L(p0);
       return uod.Y(obj1);
    }
}
