package aq3.g;
import java.lang.Runnable;
import com.kuaishou.live.tuna.presenter.b;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.tuna.button.TunaButtonModel;
import com.kwai.framework.model.tuna.button.ActionParams;
import com.kwai.framework.model.tuna.button.JumpUrlModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import va1.s0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import t02.a0;
import k2b.e0;
import z12.x;
import op3.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.HashMap;
import com.kuaishou.livestream.message.nano.LiveBsStateMessages$SCLiveCurrentBsState;
import com.kuaishou.livestream.message.nano.LiveBsStateMessages$SCLiveCurrentBsState$Button;
import tkd.b;
import tkd.d;
import xx5.d;
import java.util.Map;
import com.kwai.framework.model.feed.BaseFeed;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import cq3.b;
import com.kuaishou.tuna_logger.KsgLogTunaLiveTag;
import android.content.Context;
import vq5.d;
import com.kuaishou.live.tuna.util.LiveTunaUtils;
import android.app.Application;
import o56.a;
import com.yxcorp.utility.repo.a;
import java.lang.Integer;
import xx5.a;
import java.util.Queue;

public final class g implements Runnable	// class@0002a2
{
    public final b b;
    public final Activity c;

    public void g(b p0,Activity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       TunaButtonModel mActionParam;
       int i;
       g tb = this.b;
       g tc = this.c;
       b uob = b.class;
       b r = tb.R;
       if (r == null) {
       }else if(PatchProxy.applyVoidOneRefs(r, tb, uob, "14")){
          TunaButtonModel mActionParam1 = r.mActionParams;
          if (mActionParam1 != null) {
             ActionParams mJumpUrlMode = mActionParam1.mJumpUrlModel;
             if (mJumpUrlMode != null) {
                if (!TextUtils.x(mJumpUrlMode.mUrl)) {
                   PhotoAdvertisement photoAdverti = tb.O.get("AD");
                   if (photoAdverti != null) {
                      ActionParams mJumpUrlMode1 = r.mActionParams.mJumpUrlModel;
                      mJumpUrlMode1.mUrl = s0.c(mJumpUrlMode1.mUrl, "fansTopAttributeParams", photoAdverti.mFansTopAttributeParams);
                   }
                }
                ActionParams mJumpUrlMode2 = r.mActionParams.mJumpUrlModel;
                mJumpUrlMode2.setHideHalfScreenMask(mJumpUrlMode2.getIsHiddenHalfScreenMask(1));
             }
          }
       }
       ClientContent$LiveStreamPackage liveStreamPa = tb.L.a();
       b q = tb.Q;
       e0 uoe0 = x.l(tb.M);
       b r1 = tb.R;
       b o = tb.O;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{liveStreamPa,q,uoe0,r1,o};
          if (!PatchProxy.applyVoid(objArray, null, uoa, "5")) {
          label_0082 :
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "LIVE_BOTTOM_SERVER_CARD";
             HashMap hashMap = new HashMap();
             hashMap.put("button_type", String.valueOf(q.activeButton.buttonType));
             hashMap.put("business_type", TextUtils.k(q.bizType));
             hashMap.put("form_id", String.valueOf(q.formId));
             hashMap.put("statistics_info", q.statisticsInfo);
             d.a(-734569516).Y9(hashMap, r1, o);
             uElementPack.params = a.a.q(hashMap);
             ClientContent$KsOrderInfoPackage ksOrderInfoP = new ClientContent$KsOrderInfoPackage();
             ksOrderInfoP.ksOrderId = q.ksOrderId;
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.ksOrderInfoPackage = ksOrderInfoP;
             uContentPack.liveStreamPackage = liveStreamPa;
             ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
             uClickEvent.contentPackage = uContentPack;
             uClickEvent.elementPackage = uElementPack;
             try{
                uContentPack = 0x4b316083;
                b.a(uContentPack).B("2559740", uClickEvent, uoe0);
             }catch(java.lang.Exception e3){
                ExceptionHandler.handleCaughtException(e3);
             }
          }
       }else {
          goto label_0082 ;
       }
    label_0183 :
       return;
    }
}
