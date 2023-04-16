package com.kuaishou.live.core.basic.activity.LivePlayActivity;
import ml8.d;
import jga.e;
import zs5.a;
import m02.n;
import ux1.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.util.t0;
import xj2.a;
import java.util.HashSet;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import ym5.a;
import com.kuaishou.live.core.basic.activity.LivePlayActivityTablet;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import nf6.h;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import android.view.View;
import com.yxcorp.utility.n;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.x0;
import rma.c;
import rma.a;
import rma.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import u53.b;
import ekd.j0;
import java.lang.Number;
import dq3.b;
import org.json.JSONObject;
import com.kuaishou.live.basic.utils.LiveBasicLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import com.kuaishou.android.model.feed.SearchParams;
import r12.g;
import android.content.Context;
import b12.e;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import b12.f;
import com.kwai.framework.activitycontext.ActivityContext;
import java.util.List;
import trd.z;
import java.util.ArrayList;
import com.kwai.framework.activitycontext.ActivityContext$a;
import java.util.Collection;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import com.kuaishou.live.common.course.model.QLiveCourse;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.plugin.impl.search.util.c;
import d61.v;
import com.kuaishou.android.model.feed.SearchParams$a;
import com.kuaishou.merchant.api.core.model.MerchantAudienceParams;
import com.kwai.feature.api.live.base.model.LiveBusinessParams;
import m02.a;
import java.lang.System;
import z12.n;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import m02.k;
import com.kwai.feature.api.live.base.model.LivePrivateAutoCheckParams;
import com.kuaishou.live.core.show.liveprivate.LiveAudiencePrivatePasswordFragment$b;
import com.kuaishou.live.core.show.liveprivate.LiveAudiencePrivatePasswordFragment;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.widget.ImageView;
import jga.c;
import com.kwai.framework.model.feed.BaseFeed;
import wca.b;
import je5.c;
import android.view.MotionEvent;
import java.util.Set;
import tyc.k3;
import m02.i;
import android.view.View$OnClickListener;
import ekd.m1;
import vu5.b;
import com.kwai.framework.model.user.User;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import com.yxcorp.gifshow.entity.QPreInfo;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Exception;
import android.util.Log;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import va1.d0;
import kp3.e;
import android.content.res.Configuration;
import lnc.l1;
import qka.a;
import android.view.Window;
import com.yxcorp.gifshow.widget.SwipeLayout;
import android.os.Bundle;
import wh5.c;
import e17.i;
import com.yxcorp.gifshow.util.rx.RxBus;
import e06.b;
import brd.t;
import t45.d;
import brd.z;
import m02.l;
import erd.g;
import crd.b;
import lnc.w9;
import com.yxcorp.gifshow.widget.SwipeLayout$Direction;
import android.os.Parcelable;
import org.parceler.b;
import android.os.SystemClock;
import m02.j;
import android.view.ViewGroup;
import com.kuaishou.live.core.basic.preload.a$b;
import com.kuaishou.live.core.basic.preload.a$a;
import com.kuaishou.live.core.basic.preload.a;
import xa2.k;
import nl9.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import c12.p;
import wkd.b;
import ai3.b;
import java.util.Objects;
import lnc.b9;
import nl9.u;
import lm9.a;
import java.lang.Integer;
import o02.j;
import o02.i;
import cjd.e;
import erd.o;
import m02.m;
import com.kuaishou.live.core.basic.activity.LivePlayActivity$a;

public class LivePlayActivity extends GifshowActivity implements d, e, a, n, a	// class@00180b
{
    public LiveStreamFeedWrapper A;
    public boolean B;
    public long C;
    public SwipeLayout D;
    public t0 E;
    public int F;
    public PresenterV2 G;
    public final a H;
    public int I;
    public Set J;
    public b K;
    public Object L;
    public e M;
    public ImageView y;
    public LiveAudienceParam z;
    public static int N;

    public void LivePlayActivity(){
       super();
       this.E = new t0();
       this.H = new a();
       this.I = -1;
       this.J = new HashSet();
    }
    public static Class y3(){
       LivePlayActivity livePlayActi = LivePlayActivity.class;
       Object obj = PatchProxy.apply(null, null, livePlayActi, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (d.a(0x4c5dd1b8).f2()) {
          livePlayActi = LivePlayActivityTablet.class;
       }
       return livePlayActi;
    }
    public void A3(String p0){
       b obj2;
       String str2;
       View[] viewArray;
       boolean i1;
       String str3;
       String str4;
       String str5;
       String str6;
       SearchParams searchParams;
       LiveAudienceParam$a uoa1;
       String str9;
       LivePlayActivity a;
       int i4;
       boolean b2;
       ArrayList obj5;
       Object obj6;
       Object obj41;
       Object obj7;
       LiveAudienceParam liveAudience = this;
       Object obj = p0;
       LivePlayActivity livePlayActi = LivePlayActivity.class;
       if (PatchProxy.applyVoidOneRefs(obj, liveAudience, livePlayActi, "7")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e obj1 = PatchProxy.applyOneRefs(obj, liveAudience, livePlayActi, "17");
       if (obj1 != patchProxyRe) {
          obj2 = obj1;
       }else if(this.getIntent() != null && this.getIntent().getData() != null){
          h.a(this.getIntent().getData());
       }
       livePlayActi = liveAudience.A;
       String str = "1";
       String str1 = null;
       int i = 1;
       if (livePlayActi != null) {
          LiveStreamFeedWrapper mEntity = livePlayActi.mEntity;
          if (mEntity != null) {
             if (mEntity.mConfig == null) {
                this.B3();
                viewArray = new View[i];
                viewArray[str1] = liveAudience.y;
                n.Z(str1, viewArray);
                uoa1 = new LiveAudienceParam$a(liveAudience.z);
                uoa1.i(liveAudience.A.getLiveStreamId());
                uoa1.n(liveAudience.A.getServerExpTag());
                liveAudience.z = uoa1.a();
                this.u3();
                obj2 = null;
             }else {
                LiveAudienceParam mLiveSourceU = liveAudience.z.mLiveSourceUrl;
                if (TextUtils.x(mLiveSourceU) && this.getIntent().getData() != null) {
                   str9 = this.getIntent().getData().toString();
                   str4 = x0.a(this.getIntent().getData(), "scheme_source");
                }else {
                   str9 = mLiveSourceU;
                   i4 = 0;
                }
                LivePlayActivity z = liveAudience.z;
                b uob = d.a(-1782425284).oL().e(this.getIntent(), z.mLiveSourceType, z.mFormerH5PageSource);
                a = liveAudience.A;
                boolean b = (a != null && b.j(a.getLivePlayConfig(), liveAudience.A.getUserId()))? true: false;
                b uob1 = (uob != null)? uob.b: 0;
                b uob2 = (uob != null)? uob.a: 0;
                str6 = j0.f(this.getIntent(), "push_params_push_type");
                str5 = j0.f(this.getIntent(), "push_params_event_type");
                str1 = j0.f(this.getIntent(), "push_params_red_pack_id");
                str2 = str6;
                String str10 = str5;
                String str11 = str6;
                obj2 = uob2;
                String str12 = str;
                b uob3 = uob1;
                e obj3 = PatchProxy.applyThreeRefs(str4, str2, str5, this, LivePlayActivity.class, "18");
                if (obj3 != patchProxyRe) {
                   i4 = obj3.intValue();
                }else {
                   LivePlayActivity z1 = liveAudience.z;
                   i4 = b.a(z1.mLiveSourceType, z1.mPhoto, str4, str11, str10);
                   if (!i4) {
                      i4 = b.b(this.getIntent().getData());
                   }
                }
                int i5 = i4;
                if (this.getIntent() != null) {
                   str4 = x0.a(this.getIntent().getData(), "openFrom");
                   if (!TextUtils.x(str4)) {
                      try{
                         i4 = TextUtils.n(new JSONObject(str4).optString("channel"), "share");
                      label_0180 :
                         uoa1 = new LiveAudienceParam$a(liveAudience.z);
                         uoa1.g(i5);
                         uoa1.h(str9);
                         uoa1.a = str1;
                         uoa1.x = i4;
                         uoa1.b(uob3);
                         uoa1.c(obj2);
                         uoa1.m(liveAudience.z.mSearchParams);
                         uoa1.f(obj);
                         mLiveSourceU = uoa1.a();
                         liveAudience.z = mLiveSourceU;
                         g.j(mLiveSourceU.mPhoto);
                         g.h(liveAudience, b, liveAudience.z.mPhoto);
                         obj1 = new e(liveAudience.z.mPhoto.getId(), liveAudience, this.getIntent().getData());
                         liveAudience.M = obj1;
                         obj3 = e.class;
                         str2 = str12;
                         Object[] objArray = null;
                         if (!PatchProxy.applyVoid(objArray, obj1, obj3, str2)) {
                            Activity ActivityContext$a obj4 = PatchProxy.apply(objArray, obj1, obj3, "3");
                            i1 = (obj4 != patchProxyRe)? obj4.booleanValue(): a.t().d("enableLiveSlideClearTopFromSameLiveInStack", true);
                            if (i1) {
                               e b1 = obj1.b;
                               obj4 = PatchProxy.applyOneRefs(b1, obj1, obj3, "4");
                               if (obj4 != patchProxyRe) {
                                  b2 = obj4.booleanValue();
                               }else if(b1 != null){
                                  str5 = b1.getQueryParameter("clearTopFromSameLive");
                               }else {
                                  str5 = null;
                               }
                               b2 = a.g(str5, str2);
                               if (b2) {
                                  Iterator iterator = e.c.iterator();
                                  while (true) {
                                     if (iterator.hasNext()) {
                                        obj5 = iterator.next();
                                        if (a.g(obj5.b(), obj1.a.b())) {
                                           obj6 = obj5;
                                        }
                                     }else {
                                        obj6 = null;
                                     }
                                     if (obj6 != null) {
                                        Activity uActivity = obj6.a();
                                        if (!PatchProxy.applyVoidOneRefs(uActivity, obj1, obj3, "5")) {
                                           ActivityContext uActivityCon = ActivityContext.g();
                                           a.o(uActivityCon, "ActivityContext.getInstance\(\)");
                                           List list = uActivityCon.d();
                                           a.o(list, "ActivityContext.getInsta¡­  .activityStackWithState");
                                           obj5 = new ArrayList();
                                           Iterator iterator1 = z.X0(list).iterator();
                                           while (iterator1.hasNext()) {
                                              obj4 = iterator1.next();
                                              a.o(obj4, "it");
                                              obj4 = obj4.a();
                                              if (obj4 != null) {
                                                 obj5.add(obj4);
                                              }else {
                                                 continue ;
                                              }
                                           }
                                           ArrayList uArrayList = new ArrayList();
                                           Iterator iterator2 = obj5.iterator();
                                           while (iterator2.hasNext()) {
                                              obj41 = iterator2.next();
                                              obj7 = (obj41 != obj1.a.a())? 1: null;
                                              if (obj7) {
                                                 uArrayList.add(obj41);
                                              }else {
                                                 continue ;
                                              }
                                           }
                                           obj5 = new ArrayList();
                                           iterator1 = uArrayList.iterator();
                                           while (iterator1.hasNext()) {
                                              obj41 = iterator1.next();
                                              obj7 = (obj41 != uActivity)? 1: null;
                                              if (!obj7) {
                                              }
                                              obj5.add(obj41);
                                           }
                                           iterator1 = obj5.iterator();
                                           while (iterator1.hasNext()) {
                                              iterator1.next().finish();
                                           }
                                           uActivity.finish();
                                        }
                                     }
                                  }
                                  return;
                               }
                            }
                         label_02e6 :
                            e.c.add(obj1.a);
                         }
                         obj2 = LivePlayFragment.Mh(liveAudience.z);
                      }catch(org.json.JSONException e0){
                         b.I(LiveBasicLogTag.LIVE_EXCEPTION, "optString error", e0);
                      }
                   }
                }
             }
          }
       }
       str2 = str;
       this.B3();
       viewArray = new View[]{liveAudience.y};
       i1 = 0;
       n.Z(i1, viewArray);
       QLiveCourse qLiveCourse = QLiveCourse.parseUri(this.getIntent().getData());
       if (qLiveCourse != null) {
          SerializableHook.putExtra(this.getIntent(), "live_course", qLiveCourse);
       }
       if (this.getIntent().getData() != null) {
          str3 = "courseChannel";
          str4 = x0.a(this.getIntent().getData(), str3);
          if (str4 != null) {
             this.getIntent().putExtra(str3, str4);
          }
       }
       if (this.getIntent() != null && (this.getIntent().getData() != null && !TextUtils.x(this.getIntent().getData().getLastPathSegment()))) {
          str4 = this.getIntent().getData().toString();
          str3 = this.getIntent().getData().getLastPathSegment();
          str5 = x0.a(this.getIntent().getData(), "serverExpTag");
          str6 = x0.a(this.getIntent().getData(), "recommendReason");
          String str7 = c.b(x0.a(this.getIntent().getData(), "searchType"));
          int i2 = v.e(x0.a(this.getIntent().getData(), "searchPosition"), -1);
          String str8 = c.b(x0.a(this.getIntent().getData(), "content"));
          int i3 = v.e(x0.a(this.getIntent().getData(), "sourceType"), -1);
          str = x0.a(this.getIntent().getData(), "searchSessionId");
          if (!TextUtils.x(str7) && !TextUtils.x(str)) {
             SearchParams$a uoa = SearchParams.newBuilder();
             uoa.g(str7);
             uoa.c(str8);
             uoa.f(str);
             uoa.e(i2);
             searchParams = uoa.a();
          }else {
             searchParams = null;
          }
          MerchantAudienceParams merchantAudi = MerchantAudienceParams.parseUri(this.getIntent().getData());
          LiveBusinessParams liveBusiness = new LiveBusinessParams();
          Uri data = this.getIntent().getData();
          if (!PatchProxy.applyVoidTwoRefs(data, liveBusiness, null, a.class, str2)) {
             a.p(data, "uri");
             a.p(liveBusiness, "liveBusinessParams");
             liveBusiness.hotSpotId = x0.a(data, "hotspotId");
          }
          uoa1 = new LiveAudienceParam$a(liveAudience.z);
          uoa1.i(str3);
          uoa1.n(str5);
          uoa1.l(str6);
          uoa1.h(str4);
          uoa1.m(searchParams);
          uoa1.e(liveBusiness);
          uoa1.s(merchantAudi);
          uoa1.v(System.currentTimeMillis());
          if (i3 != -1) {
             uoa1.g(i3);
          }
          liveAudience.z = uoa1.a();
          n.a();
       }else {
          i = 0;
       }
       this.u3();
       obj2 = null;
       if (obj2 == null) {
          goto label_0479 ;
       }else {
          obj1 = this.getSupportFragmentManager().beginTransaction();
          obj1.v(R.id.fragment_container, obj2);
          obj1.m();
          return;
       }
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, LivePlayActivity.class, "5")) {
          return;
       }
       View[] viewArray = new View[]{this.y};
       n.Z(8, viewArray);
       LivePlayActivity tz = this.z;
       e uoe = this.getSupportFragmentManager().beginTransaction();
       uoe.v(R.id.fragment_container, LiveAudiencePrivatePasswordFragment.eh(tz.mPhoto, tz.mLivePrivateAutoCheckParams, new k(this)));
       uoe.m();
       return;
    }
    public final void B3(){
       if (PatchProxy.applyVoid(null, this, LivePlayActivity.class, "32")) {
          return;
       }
       if (a.t().d("enable_video_tex_change_kwai_link_background", false)) {
          Intent intent = this.getIntent();
          if (intent != null) {
             Uri data = intent.getData();
             if (data != null) {
                String str = x0.b(data, "source_type", "");
                if (!TextUtils.x(str)) {
                   String str1 = a.t().c("video_tex_change_bg_source_type_set", "");
                   if (str1 != null && str1.contains(str)) {
                      LivePlayActivity ty = this.y;
                      if (ty != null) {
                         ty.setImageDrawable(a1.f(R.drawable.arg_RES_7f08024b));
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public c G9(){
       Object[] objArray = null;
       LivePlayActivity obj = PatchProxy.apply(objArray, this, LivePlayActivity.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.A;
       if (obj != null) {
          LiveStreamFeedWrapper mEntity = obj.mEntity;
          if (mEntity != null) {
             objArray = b.c(mEntity);
          }
       }
       return objArray;
    }
    public String M2(Intent p0){
       String obj = PatchProxy.applyOneRefs(p0, this, LivePlayActivity.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.M2(p0);
       if (obj == null && p0.getData() != null) {
          String str = c.a(p0.getData(), "2");
          if (!TextUtils.x(str)) {
             return str;
          }
       }
       return obj;
    }
    public int P2(){
       return 2;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, LivePlayActivity.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.J.isEmpty()) {
          obj = this.J.iterator();
          while (obj.hasNext()) {
             k3 ok3 = obj.next();
             if (ok3 != null) {
                ok3.onDispatchTouchEvent(p0);
             }
          }
       }
       return super.dispatchTouchEvent(p0);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayActivity.class, "1")) {
          return;
       }
       m1.a(p0, new i(this), R.id.live_close);
       this.y = m1.f(p0, 0x7f0a22ac);
       return;
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, LivePlayActivity.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (TextUtils.n(this.U2(), "ks://message"))? 35: 7;
       return i;
    }
    public void f3(){
       if (PatchProxy.applyVoid(null, this, LivePlayActivity.class, "21")) {
          return;
       }
       if (this.z != null && this.A != null) {
          ProfileStartParam profileStart = ProfileStartParam.l(this.A.getUser());
          profileStart.A(this.z.mPreInfo);
          profileStart.x(this.A.mEntity);
          d.a(-1718536792).Y7(this, profileStart);
          this.overridePendingTransition(R.anim.arg_RES_7f01004a, 0x7f010112);
       }else {
          super.f3();
       }
       return;
    }
    public void finish(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePlayActivity.class, "20")) {
          return;
       }
       b.c0(LiveLogTag.FRAGMENT_LIFE_CYCLE, "finish", "by", Log.getStackTraceString(new Exception()));
       Fragment uFragment = this.v3();
       if (uFragment == null || (uFragment instanceof LivePlayFragment && !PatchProxy.applyVoid(objArray, uFragment, LivePlayFragment.class, "58"))) {
          uFragment.Dh();
       }
    label_0038 :
       super.finish();
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LivePlayActivity.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       Object obj = PatchProxy.apply(null, this, LivePlayActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d0.a(this.A);
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public e l(){
       return this.H.c;
    }
    public void onConfigurationChanged(Configuration p0){
       LivePlayActivity livePlayActi = LivePlayActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, livePlayActi, "15")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (l1.a()) {
          if (a.a() && !PatchProxy.applyVoid(null, this, livePlayActi, "25")) {
             this.getWindow().clearFlags(2048);
             this.getWindow().addFlags(1024);
          }
          this.D.setEnabled(d.a(0x4c5dd1b8).f2());
       }else if(!a.a() || PatchProxy.applyVoid(null, this, livePlayActi, "24")){
          this.getWindow().clearFlags(1024);
          this.getWindow().addFlags(2048);
       }
       this.D.setEnabled(true);
       return;
    }
    public void onCreate(Bundle p0){
       int i;
       LivePlayActivity livePlayActi = LivePlayActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, livePlayActi, "10")) {
          return;
       }
       super.onCreate(p0);
       if (!c.d()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f10054d);
          this.finish();
          return;
       }else {
          this.K = RxBus.f.f(b.class).observeOn(d.a).subscribe(new l(this));
          i = 1;
          LivePlayActivity.N = LivePlayActivity.N + i;
          this.getWindow().addFlags(128);
          this.setVolumeControlStream(3);
          SwipeLayout swipeLayout = w9.a(this);
          this.D = swipeLayout;
          swipeLayout.setDirection(SwipeLayout$Direction.BOTH);
          LivePlayActivity tD = this.D;
          try{
             tD.setRestrictDirection(i);
             this.z = b.a(this.getIntent().getParcelableExtra(LiveAudienceParam.LIVE_AUDIENCE_PARAM_KEY));
          }catch(java.lang.Exception e11){
             b.I(LiveBasicLogTag.LIVE_EXCEPTION, "Parcels.unwrap", e11);
          }
          tD = this.z;
          if (tD != null && tD.mPhoto != null) {
             this.A = new LiveStreamFeedWrapper(this.z.mPhoto);
          }
          a.e(this, R.layout.activity_live_play, null, false, new j(this), null);
          this.doBindView(this.getWindow().getDecorView());
          this.C = SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime();
          int i1 = 0x691527a8;
          if (k.c(this.A)) {
             this.B();
          }else if(this.A != null && (this.z != null && d.a(i1).II(this.L, this.A.mEntity, i))){
             d.a(i1).UW(this.L, this.z);
          }else {
             this.z3();
          }
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, livePlayActi, "11")) {
             View view = this.findViewById(R.id.live_play_root_layout);
             PresenterV2 presenterV2 = new PresenterV2();
             this.G = presenterV2;
             if (view != null) {
                presenterV2.U7(new p());
                this.G.U7(d.a(i1).hW());
             }
             this.G.f(view);
             if (!PatchProxy.applyVoid(objArray, this, livePlayActi, "12")) {
                objArray = d.a(i1).qu(R.id.fragment_container);
                this.L = objArray;
                Object[] objArray1 = new Object[i];
                objArray1[0] = objArray;
                this.G.i(objArray1);
             }
          }
          return;
       }
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePlayActivity.class, "26")) {
          return;
       }
       super.onDestroy();
       Objects.requireNonNull(b.a(-1731004515));
       int i = 1;
       LivePlayActivity.N = LivePlayActivity.N - i;
       b9.a(this.K);
       LivePlayActivity tG = this.G;
       if (tG != null) {
          tG.unbind();
          this.G.destroy();
       }
       int i1 = 0;
       if (!PatchProxy.applyVoid(objArray, objArray, g.class, "3")) {
          b.Z(LiveLogTag.LIVE_PRELOAD, "clearLivePlayerActivityLayout");
          int[] ointArray = new int[i];
          ointArray[i1] = 0x7f0d0032;
          a.a(ointArray);
          g.l();
       }
       View[] viewArray = new View[i];
       viewArray[i1] = this.y;
       n.Z(8, viewArray);
       d.a(-1694791652).n1();
       d.a(-1638991736).nS(this.z);
       tG = this.M;
       if (tG != null) {
          Objects.requireNonNull(tG);
          if (!PatchProxy.applyVoid(objArray, tG, e.class, "2")) {
             e.c.remove(tG.a);
          }
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, LivePlayActivity.class, "14")) {
          return;
       }
       super.onPause();
       this.E.a();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LivePlayActivity.class, "13")) {
          return;
       }
       super.onResume();
       this.E.c();
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayActivity.class, "27")) {
          return;
       }
       p0.clear();
       return;
    }
    public void setRequestedOrientation(int p0){
       LivePlayActivity livePlayActi = LivePlayActivity.class;
       if (PatchProxy.isSupport(livePlayActi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, livePlayActi, "28")) {
          return;
       }
       super.setRequestedOrientation(p0);
       this.I = p0;
       return;
    }
    public int u(){
       return this.I;
    }
    public final void u3(){
       if (PatchProxy.applyVoid(null, this, LivePlayActivity.class, "19")) {
          return;
       }
       LivePlayActivity tz = this.z;
       if (tz == null || TextUtils.x(tz.mLiveStreamId)) {
          b.c0(LiveBasicLogTag.LIVE_EXCEPTION, "finish by invalid liveAudienceParam", "intent", this.getIntent());
          this.finish();
          return;
       }else {
          d.a(-1638991736).AH(this.z.mLiveStreamId);
          long l = SystemClock.elapsedRealtime();
          LivePlayActivity tz1 = this.z;
          i.a().a(tz1.mLiveStreamId, tz1.mServerExpTag, tz1.mRecommendReason).map(new e()).subscribe(new m(this, l), new LivePlayActivity$a(this, l));
          return;
       }
    }
    public Fragment v3(){
       Object obj = PatchProxy.apply(null, this, LivePlayActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getSupportFragmentManager().findFragmentById(0x7f0a0fe6);
    }
    public a w3(){
       return this.H;
    }
    public LiveStreamFeedWrapper x3(){
       return this.A;
    }
    public void z3(){
       if (PatchProxy.applyVoid(null, this, LivePlayActivity.class, "6")) {
          return;
       }
       this.A3("");
       return;
    }
}
