package com.yxcorp.gifshow.log.z;
import java.lang.Runnable;
import com.yxcorp.gifshow.log.c0;
import com.yxcorp.gifshow.log.d0;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.log.realshow.nano.RealShowLogs$RealShowFeed;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.LiveStreamModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.feed.PhotoType;
import kp.w1;
import com.kuaishou.android.model.feed.TemplateFeed;
import com.kuaishou.android.model.feed.ActivityTemplateFeed;
import com.kuaishou.android.model.feed.FindTkFeed;
import java.lang.Long;
import java.lang.NumberFormatException;
import com.kwai.framework.model.user.User;
import k2b.k2;
import k2b.u1;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.kwai.component.uiconfig.browsestyle.model.BrowseStyle;
import uh5.e;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import f3b.h;
import p56.b;
import com.kwai.framework.app.huaweisuperapp.HuaweiSuperAppPrelaunchStage;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kwai.framework.model.common.Distance;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import f3b.u;
import ok.x;
import java.lang.Boolean;
import lnc.i3;
import com.google.common.base.Optional;
import com.yxcorp.gifshow.log.realtime.RealShowDao;
import com.yxcorp.gifshow.log.realtime.RealShow;
import com.google.protobuf.nano.MessageNano;
import com.yxcorp.gifshow.log.policy.LogPolicy$Save;
import com.yxcorp.gifshow.log.policy.LogPolicy;
import org.greenrobot.greendao.AbstractDao;
import k2b.w2;
import msd.a;
import com.kwai.framework.kgi.sdk.Kgi;
import java.lang.Throwable;
import android.util.Log;
import java.lang.Exception;

public final class z implements Runnable	// class@001b63
{
    public final c0 b;
    public final d0 c;
    public final String d;

    public void z(c0 p0,d0 p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       boolean b;
       boolean b1;
       d0 b2;
       long l;
       k2 ok2;
       int i;
       boolean b3;
       CommonMeta mDistance;
       FeedLogCtx uFeedLogCtx;
       String str;
       i3 oi3;
       RealShowDao realShowDao;
       Long longx;
       byte[] uobyteArray;
       z tb = this.b;
       z tc = this.c;
       z td = this.d;
       Objects.requireNonNull(tb);
       RealShowLogs$RealShowFeed realShowFeed = new RealShowLogs$RealShowFeed();
       try{
          d0 a = tc.a;
          if (r1.S2(a)) {
             realShowFeed.feedType = 2;
             realShowFeed.liveStreamId = a.mLiveStreamModel.mLiveStreamId;
             if (!TextUtils.x(tc.f)) {
                realShowFeed.entryPageSource = tc.f;
             }
             realShowFeed.isNormalLive = tc.h;
             realShowFeed.isSlide = tc.i;
             realShowFeed.liveStyle = tc.j;
          }else if(r1.c3(a)){
             realShowFeed.feedType = 11;
             realShowFeed.momentId = a.getId();
          }else if(w1.r(a) == PhotoType.FOLLOWING_USER_BANNER){
             realShowFeed.feedType = 15;
          }else if(!a instanceof TemplateFeed && (!a instanceof ActivityTemplateFeed && (r1.k2(a) || a instanceof FindTkFeed))){
             realShowFeed.feedType = 3;
          }else if(r1.c2(a)){
             realShowFeed.feedType = 20;
             String id = a.getId();
             try{
                realShowFeed.feedId = id;
                realShowFeed.photoId = Long.parseLong(a.getId());
             }catch(java.lang.NumberFormatException e5){
                e5.printStackTrace();
             }
          }else if(r1.q2(a)){
             realShowFeed.feedType = 22;
             realShowFeed.feedId = a.getId();
          }else if(r1.d3(a)){
             realShowFeed.feedType = 24;
             realShowFeed.feedId = a.getId();
          }else {
             realShowFeed.feedType = 1;
             if (r1.e2(a)) {
                realShowFeed.subtype = 1;
             }
             realShowFeed.photoId = Long.valueOf(a.getId()).longValue();
          }
       }catch(java.lang.Exception e0){
          u1.Q("realShowLogSaveError", Log.getStackTraceString(e0));
          e0.printStackTrace();
       }
       return;
    }
}
