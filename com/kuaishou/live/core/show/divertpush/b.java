package com.kuaishou.live.core.show.divertpush.b;
import lf3.g;
import com.kuaishou.live.core.show.divertpush.c;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLiveActivityPushV2;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.basic.activity.x;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.divertpush.a;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.yxcorp.gifshow.entity.QPhoto;
import gb2.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import pm8.a;
import km8.b;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.util.DateUtils;
import java.util.List;
import com.kuaishou.live.core.show.divertpush.d;
import java.lang.reflect.Type;
import el.a;
import java.util.ArrayList;
import java.lang.System;
import com.kuaishou.live.core.show.push.LiveDivertPushV2Config;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.live.core.show.divertpush.c$b;
import android.content.SharedPreferences$Editor;
import oe6.g;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.h;
import com.kuaishou.live.core.show.divertpush.view.LiveDivertPushView;
import android.app.Activity;
import a72.a;
import android.view.View$OnClickListener;
import f12.d;
import va1.i0;
import android.widget.LinearLayout;
import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import d72.c;
import android.animation.Animator$AnimatorListener;
import c72.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import m91.b;
import a72.c;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import a72.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import o02.f;
import o02.e;
import brd.t;
import cjd.e;
import erd.o;
import bp6.a;
import erd.g;
import crd.b;
import lf3.f;

public final class b implements g	// class@000af7
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       boolean b1;
       SharedPreferences a;
       boolean b2;
       b b = this.b;
       Object obj = p0;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(obj, b, uoc, "5")) {
       }else if(obj != null){
          Object[] objArray = null;
          String str = "7";
          c obj1 = PatchProxy.apply(objArray, b, uoc, str);
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(b.K.isResumed() && (b.N.a() && b.P.mIsSpecialAccount == null)){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
             if (!TextUtils.n(obj.targetLiveStreamId, r1.n1(b.L.mEntity)) && !TextUtils.n(k0.a(obj.targetAuthorInfo, a.a).orNull(), r1.U1(b.L.mEntity))) {
                obj1 = b.S;
                if (obj1 == null || (obj1.a() == null || !TextUtils.n(obj.targetLiveStreamId, r1.n1(b.S.a().mEntity)))) {
                   b.Z(LiveLogTag.LIVE_BROADCAST_BANNER, "Receive diver push v2 data, SCLiveActivityPushV2:"+obj);
                   a = a.a;
                   long longx = a.getLong(b.d("user")+"lastDivertPushShowTimeMs", 0);
                   b.U = longx;
                   if (!DateUtils.H(longx)) {
                      a.U0(objArray);
                   }
                   Type type = new d(b).getType();
                   String str1 = a.getString(b.d("user")+"hasShownDivertPushList", "null");
                   Object[] objArray1 = (str1 == null || str1 == "")? objArray: b.a(str1, type);
                   b.V = objArray1;
                   if (objArray1 == null) {
                      b.V = new ArrayList();
                   }
                   long l = System.currentTimeMillis() - b.U;
                   if (obj.enableSkipLimit == null) {
                      if (l - b.Y.mPushShowIntervalInMs > 0 && (long)b.V.size() - b.Y.mMaxShowTimesInOneDay < 0) {
                         SCLiveActivityPushV2 activityId = obj.activityId;
                         SCLiveActivityPushV2 messageId = obj.messageId;
                         c$b obj2 = PatchProxy.applyTwoRefs(activityId, messageId, b, uoc, "12");
                         if (obj2 != patchProxyRe) {
                            b2 = obj2.booleanValue();
                         }else if(TextUtils.x(messageId) || q.f(b.V)){
                            Iterator iterator = b.V.iterator();
                            while (true) {
                               if (iterator.hasNext()) {
                                  obj2 = iterator.next();
                                  if (TextUtils.n(obj2.a, activityId) || TextUtils.n(obj2.b, messageId)) {
                                     b2 = true;
                                     break ;
                                  }
                               }
                            }
                         }
                         b2 = false;
                         if (b2) {
                         label_02dd :
                            return;
                         }
                      }else {
                         goto label_02dd ;
                      }
                   }
                   b.Z(LiveLogTag.LIVE_BROADCAST_BANNER, "Show divert push v2:"+obj);
                   b.V.add(new c$b(obj.activityId, obj.messageId));
                   a.U0(b.V);
                   SharedPreferences$Editor uEditor = a.a.edit();
                   uEditor.putLong(b.d("user")+"lastDivertPushShowTimeMs", System.currentTimeMillis());
                   g.a(uEditor);
                   if (!PatchProxy.applyVoidOneRefs(obj, b, uoc, "8")) {
                      if (b.W == null) {
                         b.W = h.f(b.m8(), 0x7f0a1bff, 0x7f0a1bfe);
                      }
                      b.W.c(b.getActivity(), true, b.X.getY());
                      b.W.setPushV2Info(obj);
                      b.W.setOnClickListener(new a(b, obj));
                   }
                   b.T.S(b.getActivity(), b.W);
                   i0.b(b.getActivity(), b.W);
                   c w = b.W;
                   Objects.requireNonNull(w);
                   if (!PatchProxy.applyVoid(objArray, w, LiveDivertPushView.class, str)) {
                      w.n = true;
                      w.setVisibility(0);
                      float[] uofloatArray = new float[]{(float)w.getDefaultTranslationYPx(),w.r};
                      ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(w, "TranslationY", uofloatArray);
                      w.x = objectAnimat;
                      objectAnimat.setDuration(300);
                      w.x.setInterpolator(new DecelerateInterpolator());
                      w.x.addListener(new c(w));
                      w.x.start();
                      w.v.a();
                   }
                   b.R.Pj(AudienceBizRelation.TOP_DIVERT_PUSH);
                   SCLiveActivityPushV2 displayDurat = obj.displayDurationMillis;
                   if (!displayDurat) {
                      displayDurat = 5000;
                   }
                   k1.s(new c(b), b, displayDurat);
                   ClientContent$LiveStreamPackage liveStreamPa = b.O.a();
                   if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, obj, objArray, g.class, "1")) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "LIVE_PUSH_POPUP";
                      u1.u0(5, uElementPack, g.a(liveStreamPa, obj));
                   }
                   if (obj.messageType != null) {
                      b.X7(e.a().m(obj.messageId, obj.targetLiveStreamId, obj.bizType, obj.messageType, obj.extraInfo).map(new e()).subscribe(new a(), new a()));
                      goto label_02dd ;
                   }else {
                      goto label_02dd ;
                   }
                }
             }
          }
       }
       b.Z(LiveLogTag.LIVE_BROADCAST_BANNER, "SCLiveActivityPushV2 info is null or should not process.");
       goto label_02dd ;
    }
    public boolean V(){
       return f.a(this);
    }
}
