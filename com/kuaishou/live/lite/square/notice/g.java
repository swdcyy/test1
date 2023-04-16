package com.kuaishou.live.lite.square.notice.g;
import yh3.a;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.lite.square.notice.g$a;
import androidx.lifecycle.MutableLiveData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import ld3.a;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.live.model.LiveSquareSideBarNoticeModel;
import androidx.lifecycle.LiveData;
import kd3.f;
import kd3.g;
import kd3.f$d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import java.lang.System;
import z83.a;
import kd3.f$a;
import com.kuaishou.android.live.model.LiveStreamModel;
import kd3.f$c;

public class g extends a	// class@000b75
{
    public final LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig a;
    public LiveStreamFeed b;
    public final ClientContent$LiveStreamPackage c;
    public final g$a d;
    public final MutableLiveData e;

    public void g(LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig p0,LiveStreamFeed p1,ClientContent$LiveStreamPackage p2,g$a p3){
       super();
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.e = mutableLiveD;
       this.b = p1;
       this.c = p2;
       this.a = p0;
       this.d = p3;
       if (PatchProxy.applyVoidOneRefs(p1, this, g.class, "5")) {
       }else {
          b.Z(LiveLiteLogTag.SQUARE, "show feed notice");
          mutableLiveD.setValue(new a(p1.mUser.getAvatars(), p1.mLiveSquareSideBarNoticeModel.mLiveSquareSideBarNoticeSubTitle, p0.mNoticeEntranceShowDurationMs));
       }
       return;
    }
    public LiveData u0(){
       return this.e;
    }
    public void v0(f p0){
       g tb;
       LiveSquareSideBarNoticeModel mLiveSquareS;
       ClientEvent$ElementPackage uElementPack;
       i3 oi3;
       ClientContent$ContentPackage uContentPack;
       g og = g.class;
       g og1 = g.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, og1, str)) {
          return;
       }
       if (p0 instanceof f$d) {
          if (!PatchProxy.applyVoid(null, this, og1, "2")) {
             if (!PatchProxy.applyVoid(null, this, og1, "6")) {
                tb = this.b;
                if (tb != null) {
                   og1 = this.c;
                   mLiveSquareS = tb.mLiveSquareSideBarNoticeModel.mLiveSquareSideBarNoticeSubTitle;
                   if (!PatchProxy.applyVoidTwoRefs(og1, mLiveSquareS, null, og, str)) {
                      uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "LIVE_LITE_SQUARE_PUSH_BUTTON";
                      oi3 = i3.f();
                      oi3.d("push_text", mLiveSquareS);
                      uElementPack.params = oi3.e();
                      uContentPack = new ClientContent$ContentPackage();
                      uContentPack.liveStreamPackage = og1;
                      u1.y0(null, 3, uElementPack, uContentPack);
                   }
                }
             }
             a.d(System.currentTimeMillis());
             a.f((a.c() + 1));
          }
       }else if(p0 instanceof f$a){
          if (!PatchProxy.applyVoid(null, this, og1, "3")) {
             tb = this.b;
             if (tb != null) {
                og1 = this.c;
                mLiveSquareS = tb.mLiveSquareSideBarNoticeModel.mLiveSquareSideBarNoticeSubTitle;
                if (!PatchProxy.applyVoidTwoRefs(og1, mLiveSquareS, null, og, "2")) {
                   uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "LIVE_LITE_SQUARE_PUSH_BUTTON";
                   oi3 = i3.f();
                   oi3.d("push_text", mLiveSquareS);
                   uElementPack.params = oi3.e();
                   uContentPack = new ClientContent$ContentPackage();
                   uContentPack.liveStreamPackage = og1;
                   u1.G(null, 1, uElementPack, uContentPack);
                }
                og = this.b;
                this.d.b(og.mLiveStreamModel.mLiveStreamId, og.mLiveSquareSideBarNoticeModel.mLiveSquareSideBarNoticeType);
             }
          }
       }else if(!p0 instanceof f$c || PatchProxy.applyVoid(null, this, og1, "4")){
          this.d.a();
       }
       return;
    }
}
