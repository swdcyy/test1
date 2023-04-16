package com.kuaishou.live.core.show.topic.audience.e;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailActivityView$a;
import com.kuaishou.live.core.show.topic.audience.d;
import com.kuaishou.live.core.show.topic.api.LiveTopicHeaderInfo;
import java.lang.Object;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicActivityBasicItemInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ql2.o0;
import com.kuaishou.live.core.show.topic.a;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import ekd.w0;
import android.content.Intent;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import com.kuaishou.webkit.URLUtil;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.c;
import t02.a0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import androidx.fragment.app.Fragment;
import kq3.a;
import c22.a;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import com.kuaishou.live.webview.a;
import ql2.i;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;

public class e implements LiveAudienceTopicDetailActivityView$a	// class@0011ff
{
    public final LiveTopicHeaderInfo a;
    public final d b;

    public void e(d p0,LiveTopicHeaderInfo p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(LiveTopicActivityBasicItemInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       if (p0.mHasShown != null) {
          return;
       }
       boolean b = true;
       p0.mHasShown = b;
       e ta = this.a;
       LiveTopicHeaderInfo mTopicId = ta.mTopicId;
       LiveTopicHeaderInfo mTopicName = ta.mTopicName;
       o0 a = this.b.p.a;
       LiveTopicActivityBasicItemInfo mTopicActivi = p0.mTopicActivityId;
       p0 = p0.mTopicActivityJumpUrl;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Long.valueOf(mTopicId),mTopicName,a,mTopicActivi,p0};
          if (PatchProxy.applyVoid(objArray, null, uoa, "21")) {
          label_0093 :
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_TOPIC_DETAIL_PANEL_ACTIVITY_INFO_ITEM";
       i3 oi3 = i3.f();
       oi3.c("tag_id", Long.valueOf(mTopicId));
       oi3.d("tag_name", mTopicName);
       oi3.d("anchor_user_id", r1.U1(a));
       oi3.d("live_stream_id", r1.n1(a));
       oi3.d("server_exp_tag", r1.I1(a));
       oi3.d("url", p0);
       oi3.d("activity_id", mTopicActivi);
       uElementPack.params = oi3.e();
       u1.u0(3, uElementPack, null);
       goto label_0093 ;
    }
    public void b(LiveTopicActivityBasicItemInfo p0){
       Activity activity;
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       e ta = this.a;
       LiveTopicHeaderInfo mTopicId = ta.mTopicId;
       LiveTopicHeaderInfo mTopicName = ta.mTopicName;
       o0 a = this.b.p.a;
       LiveTopicActivityBasicItemInfo mTopicActivi = p0.mTopicActivityId;
       LiveTopicActivityBasicItemInfo mTopicActivi1 = p0.mTopicActivityJumpUrl;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Long.valueOf(mTopicId),mTopicName,a,mTopicActivi,mTopicActivi1};
          if (PatchProxy.applyVoid(objArray, null, uoa, "22")) {
          label_008c :
             if (!TextUtils.isEmpty(p0.mTopicActivityJumpUrl)) {
                if ((p0.mTopicActivityJumpUrl).startsWith("kwai://")) {
                   Uri uri = w0.f(p0.mTopicActivityJumpUrl);
                   if (uri != null) {
                      this.b.getActivity().startActivity(new Intent("android.intent.action.VIEW", uri));
                   }
                }else {
                   ta = this.b;
                   p0 = p0.mTopicActivityJumpUrl;
                   Objects.requireNonNull(ta);
                   if (!PatchProxy.applyVoidOneRefs(p0, ta, d.class, "5")) {
                      if (!URLUtil.isNetworkUrl(p0)) {
                         b.Z(LiveLogTag.LIVE_TOPIC_DETAIL, "activity url is invalid");
                      }else {
                         activity = ta.getActivity();
                         d p = ta.p;
                         Objects.requireNonNull(p);
                         c uoc = PatchProxy.apply(null, p, o0.class, "6");
                         if (uoc != PatchProxyResult.class) {
                         }else {
                            uoc = p.o0().Z2.b().getChildFragmentManager();
                         }
                         a uoa1 = a.b(activity, uoc, ta.p.o0());
                         uoa1.f("live-topic-activity-fragment");
                         uoa1.b.setPortraitHeightRatio(0x3f4ccccd).setLayoutType("0");
                         a uoa2 = a.c();
                         uoa2.f(new i(ta));
                         ta.q = uoa2.h(p0, uoa1);
                      }
                   }
                }
             }
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_TOPIC_DETAIL_PANEL_ACTIVITY_INFO_ITEM";
       i3 oi3 = i3.f();
       oi3.c("tag_id", Long.valueOf(mTopicId));
       oi3.d("tag_name", mTopicName);
       oi3.d("anchor_user_id", r1.U1(a));
       oi3.d("live_stream_id", r1.n1(a));
       oi3.d("server_exp_tag", r1.I1(a));
       oi3.d("url", mTopicActivi1);
       oi3.d("activity_id", mTopicActivi);
       uElementPack.params = oi3.e();
       u1.u(1, uElementPack, null);
       goto label_008c ;
    }
}
