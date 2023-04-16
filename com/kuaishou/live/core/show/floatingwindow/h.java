package com.kuaishou.live.core.show.floatingwindow.h;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$m;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.String;
import s82.r0;
import s82.o;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowCloseType;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import s82.y;
import java.util.Objects;
import com.kuaishou.live.core.show.floatingwindow.g;
import lnc.c3$b;
import lnc.c3;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.floatingwindow.i;
import java.lang.Boolean;
import java.lang.IllegalArgumentException;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import tkd.b;
import tkd.d;
import yxb.b;
import vm5.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import za2.y;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import android.view.View;
import android.content.Intent;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.core.basic.activity.LiveSlideActivity;
import android.content.Context;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import java.lang.System;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import r12.g;
import o56.c;
import o56.a;
import android.app.Application;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;
import android.os.Parcelable;
import org.parceler.b;
import z12.n;

public class h implements LiveFloatingWindowManager$m	// class@000b86
{
    public final LiveFloatingWindowManager a;
    public final LiveStreamFeedWrapper b;
    public final String c;
    public final r0 d;
    public final o e;
    public final LivePlayFragment f;

    public void h(LiveFloatingWindowManager p0,LiveStreamFeedWrapper p1,String p2,r0 p3,o p4,LivePlayFragment p5){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public void a(int p0,int p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oh, "3")) {
          return;
       }
       this.a.F(p0, p1);
       oh = this.d;
       if (oh != null) {
          oh.a(p0, p1);
       }
       return;
    }
    public void b(int p0,int p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oh, "4")) {
          return;
       }
       oh = this.d;
       if (oh != null) {
          oh.b(p0, p1);
       }
       return;
    }
    public void c(LiveFloatingWindowCloseType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       this.a.c(p0);
       return;
    }
    public void d(){
       Intent intent;
       LiveBizParam liveBizParam;
       boolean b1;
       LiveAudienceParam$a obj1;
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, h.class, "2")) {
          return;
       }
       int i = 2;
       int i1 = 1;
       int i2 = (obj.a.l())? 2: 1;
       y.g(obj.b.mEntity, QCurrentUser.me().getId(), obj.c, i2);
       h d = obj.d;
       int i3 = 0;
       d = (d != null && d.e())? 1: null;
       if (d) {
          return;
       }else {
          d = obj.d;
          i2 = (d != null && d.d() > 0)? obj.d.d(): 0x10000000;
          int i4 = 0x4000000 & i2;
          if (!i4) {
             h e = obj.e;
             Objects.requireNonNull(e);
             if (!PatchProxy.applyVoid(objArray, e, o.class, "4")) {
                LivePlayFragment livePlayFrag = c3.a(e.a, g.a);
                if (livePlayFrag != null) {
                   livePlayFrag.getActivity().finish();
                }
             }
          }
          FragmentActivity activity = obj.f.getActivity();
          LiveStreamFeedWrapper mEntity = obj.b.mEntity;
          h e1 = obj.e;
          o e2 = e1.e;
          boolean b = e1.a();
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          i oi = i.class;
          if (PatchProxy.isSupport(oi)) {
             Object[] objArray1 = new Object[]{activity,mEntity,Integer.valueOf(e2),Integer.valueOf(i2),Boolean.valueOf(b)};
             if (!PatchProxy.applyVoid(objArray1, objArray, oi, "3")) {
             label_00b9 :
                if (mEntity.mConfig == null) {
                   ExceptionHandler.handleCaughtException(new IllegalArgumentException(a.a.q(mEntity)));
                }else if(d.a(-430326918).cR(activity) && (i4 && b)){
                   e uoe = d.a(-1818031860);
                   PhotoDetailParam photoDetailP = PatchProxy.applyTwoRefs("", mEntity, objArray, y.class, "1");
                   if (photoDetailP != patchProxyRe) {
                   }else {
                      PhotoDetailParam photoDetailP1 = new PhotoDetailParam(new QPhoto(mEntity));
                      photoDetailP1.setBizType(10).setSlidePlayId("");
                      photoDetailP = photoDetailP1;
                   }
                   intent = uoe.tF(activity, photoDetailP, objArray);
                   liveBizParam = new LiveBizParam();
                   liveBizParam.mLiveSourceType = e2;
                   liveBizParam.putParamIntoIntent(intent);
                }else if(activity instanceof LiveSlideActivity && b){
                   intent = new Intent(activity, LiveSlideActivity.u3());
                   liveBizParam = new LiveBizParam();
                   liveBizParam.mLiveSourceType = e2;
                   liveBizParam.putParamIntoIntent(intent);
                }else if(PatchProxy.isSupport(oi)){
                   b1 = b;
                   obj1 = PatchProxy.applyThreeRefs(mEntity, Integer.valueOf(e2), Boolean.valueOf(b), null, i.class, "4");
                   if (obj1 != patchProxyRe) {
                      intent = obj1;
                   }
                }else {
                   b1 = b;
                }
                obj1 = new LiveAudienceParam$a();
                obj1.j(mEntity);
                obj1.g(e2);
                obj1.v(System.currentTimeMillis());
                obj1.m = b1;
                g.g();
                Intent intent1 = new Intent(a.a().a(), LivePlayActivity.y3());
                intent1.putExtra(LiveAudienceParam.LIVE_AUDIENCE_PARAM_KEY, b.c(obj1.a()));
                intent = intent1;
                intent.setFlags(i2);
                a.a().a().startActivity(intent);
                n.a();
             }
          }else {
             goto label_00b9 ;
          }
          return;
       }
    }
}
