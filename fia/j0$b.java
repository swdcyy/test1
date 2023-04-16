package fia.j0$b;
import android.view.View$OnClickListener;
import fia.j0;
import java.lang.Object;
import android.view.View;
import xha.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo;
import im8.f;
import kotlin.jvm.internal.a;
import java.lang.Number;
import bia.h;
import java.util.List;
import vha.c;
import k2b.e0;
import java.util.Objects;
import xha.b;
import java.lang.Boolean;
import java.lang.Integer;
import xha.a$a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TargetUserPackageV2;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.feature.api.social.followStagger.model.FeedUserAvatarInfo;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import yga.b;
import yga.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Map;
import java.util.HashMap;
import bia.k;

public final class j0$b implements View$OnClickListener	// class@002912
{
    public final j0 b;

    public void j0$b(j0 p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       j0 oj0;
       int b;
       HashMap hashMap;
       Map map;
       a$a uoa2;
       FollowingUserBannerFeed$UserBannerInfo mAvatarInfo1;
       Object obj = this;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, obj, j0$b.class, str)) {
          return;
       }
       String str1 = "mPosition.get\(\)";
       Object[] objArray = null;
       if (!FollowConfigUtil.i()) {
          j0$b obj1 = obj.b.R8().get();
          a.o(obj1, str1);
          int i = obj1.intValue();
          obj.b.S8().e(obj.b.P8(), obj.b.W8(), "LIVE_IN_PROCESS_VISITED_AUTHOR_HEAD", i, -1, 0, null, obj.b.X8().r1().size());
          FollowingUserBannerFeed$UserBannerInfo userBannerIn = obj.b.W8();
          obj1 = obj.b.R8().get();
          a.o(obj1, str1);
          int i1 = obj1.intValue();
          int i2 = 0;
          obj1 = obj.b;
          Objects.requireNonNull(obj1);
          Object obj2 = PatchProxy.apply(objArray, obj1, j0.class, "10");
          if (obj2 != patchProxyRe) {
             oj0 = obj2;
          }else {
             j0 u = obj1.u;
             if (u == null) {
                a.S("mListLoadSequenceId");
             }
             oj0 = u;
          }
          b.b(userBannerIn, "LIVE_IN_PROCESS_VISITED_AUTHOR_HEAD", i1, i2, oj0, "slide");
       }
       int i3 = 1;
       if (obj.b.V8() == 6) {
          a uoa1 = obj.b.S8();
          BaseFragment uBaseFragmen = obj.b.P8();
          FollowingUserBannerFeed$UserBannerInfo userBannerIn1 = obj.b.W8();
          String str2 = "LIVE_TOP_HEAD";
          Object obj3 = obj.b.R8().get();
          a.o(obj3, str1);
          int i4 = obj3.intValue();
          int i5 = obj.b.X8().r1().size();
          String str3 = a.c();
          ClientContent$ContentPackage obj4 = PatchProxy.apply(objArray, objArray, uoa, str);
          b = (obj4 != patchProxyRe)? obj4.booleanValue(): a.d(objArray);
          Objects.requireNonNull(uoa1);
          int i6 = 5;
          int i7 = 4;
          int i8 = 0;
          int i9 = 2;
          int i10 = 3;
          if (PatchProxy.isSupport(uoa)) {
             Object[] objArray1 = new Object[]{uBaseFragmen,userBannerIn1,str2,Integer.valueOf(i4),Integer.valueOf(i5),str3,Boolean.valueOf(b)};
             if (!PatchProxy.applyVoid(objArray1, uoa1, uoa, "7")) {
             }
          }else if(PatchProxy.isSupport(uoa)){
             Object[] objArray2 = new Object[]{userBannerIn1,str2,str3,Boolean.valueOf(b),Integer.valueOf(i5),Integer.valueOf(i4)};
             uoa2 = PatchProxy.apply(objArray2, null, uoa, "13");
             if (uoa2 != patchProxyRe) {
             label_01a8 :
                obj4 = new ClientContent$ContentPackage();
                obj4.targetUserPackage = uoa2.b;
                mAvatarInfo1 = userBannerIn1.mAvatarInfo;
                if (mAvatarInfo1 != null) {
                   FeedUserAvatarInfo mLiveStreamF1 = mAvatarInfo1.mLiveStreamFeed;
                   if (mLiveStreamF1 != null) {
                      obj4.photoPackage = w1.f(mLiveStreamF1);
                   }
                }
                u1.B(new ClickMetaData().setLogPage(uBaseFragmen).setType(3).setElementPackage(uoa2.a).setContentPackage(obj4).setFeedLogCtx(userBannerIn1.getFeedLogCtx()));
             }
          }
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = str2;
          i3 oi3 = i3.f();
          oi3.d("follow_group_id", str3);
          oi3.a("is_click_enter", Boolean.valueOf(b));
          oi3.c("index", Integer.valueOf((i4 + i3)));
          oi3.c("serverLiveNum", Integer.valueOf(i5));
          oi3.d("exp_tag", a.b(userBannerIn1));
          uElementPack.params = oi3.e();
          ClientContent$TargetUserPackageV2 targetUserPa = new ClientContent$TargetUserPackageV2();
          mAvatarInfo1 = userBannerIn1.mUser;
          if (mAvatarInfo1 != null) {
             targetUserPa.identity = mAvatarInfo1.mId;
             User mFriend = mAvatarInfo1.mFriend;
             i10 = (mFriend != null)? 1: 2;
             targetUserPa.relationshipType = i10;
             targetUserPa.isFriend = mFriend;
          }
          uoa2 = new a$a(uElementPack, targetUserPa);
          goto label_01a8 ;
       }
       FollowingUserBannerFeed$UserBannerInfo mAvatarInfo = obj.b.W8().mAvatarInfo;
       if (mAvatarInfo != null && mAvatarInfo.mStatus == i3) {
          c.i(KsLogFollowTag.NIRVANA_PYMI.appendTag("NirvanaFollowPymiClickAvatarPresenter"), "openLivePage");
          Activity activity = obj.b.getActivity();
          if (!activity instanceof GifshowActivity) {
             activity = 0;
          }
          Activity uActivity = activity;
          BaseFragment uBaseFragmen1 = obj.b.P8();
          FeedUserAvatarInfo mLiveStreamF = obj.b.W8().mAvatarInfo.mLiveStreamFeed;
          List list = obj.b.X8().r1();
          int i11 = obj.b.V8();
          if (obj.b.V8() == 6) {
             b = obj.b.V8();
             if (PatchProxy.isSupport(uoa)) {
                hashMap = PatchProxy.applyOneRefs(Integer.valueOf(b), null, uoa, "5");
                if (hashMap != patchProxyRe) {
                }else {
                label_0250 :
                   hashMap = new HashMap();
                   hashMap.put("follow_group_id", a.b);
                   if (b == 6) {
                      hashMap.put("follow_live_source", "live_top");
                   }
                }
             }else {
                goto label_0250 ;
             }
             map = hashMap;
          }else {
             map = null;
          }
          k.c(uActivity, uBaseFragmen1, mLiveStreamF, list, i11, map, false, 64, null);
       }
       return;
    }
}
