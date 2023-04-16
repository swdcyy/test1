package com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicBizActionLogger;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicBizActionLogger$a;
import nsd.u;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerConfig;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.lang.System;
import java.util.UUID;
import lnc.i3;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerStyle;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kwai.framework.model.feed.BaseFeed;
import kp.w1;
import kp.r1;
import com.kuaishou.android.model.mix.w;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import android.content.res.Resources;
import android.content.res.Configuration;
import com.kuaishou.android.model.mix.ShareToFollowModel;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ChatPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import com.yxcorp.utility.TextUtils;
import android.os.SystemClock;
import com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicLogger;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Long;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;
import tkd.b;
import tkd.d;
import u06.f;
import com.kwai.feature.plc.api.model.PlcRecoSignalInfo$a;
import com.kwai.feature.plc.api.model.PlcRecoSignalInfo;
import androidx.lifecycle.LifecycleOwner;
import n2.a;

public final class PlcDynamicBizActionLogger implements DefaultLifecycleObserver	// class@000fe2
{
    public boolean b;
    public boolean c;
    public boolean d;
    public long e;
    public final String f;
    public long g;
    public final PlcDynamicContainerConfig h;
    public final QPhoto i;
    public final String j;
    public static final PlcDynamicBizActionLogger$a k;

    static {
       PlcDynamicBizActionLogger.k = new PlcDynamicBizActionLogger$a(null);
    }
    public void PlcDynamicBizActionLogger(PlcDynamicContainerConfig p0,QPhoto p1,String p2){
       a.p(p0, "containerConfig");
       a.p(p2, "prePage2");
       super();
       this.h = p0;
       this.i = p1;
       this.j = p2;
       this.f = System.currentTimeMillis()+'_'+UUID.randomUUID();
    }
    public final i3 a(int p0){
       i3 obj;
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PlcDynamicBizActionLogger plcDynamicBi = PlcDynamicBizActionLogger.class;
       if (PatchProxy.isSupport(plcDynamicBi)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, plcDynamicBi, "9");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = i3.f();
       obj.c("business_type", Integer.valueOf(this.h.getBizType()));
       Object obj1 = PatchProxy.apply(null, this, plcDynamicBi, "7");
       int i = 2;
       if (obj1 != patchProxyRe) {
          i1 = obj1.intValue();
       }else {
          PlcDynamicContainerStyle containerSty = this.h.getContainerStyle();
          i1 = (containerSty != null && containerSty.getDragStyle() == 1)? 1: 2;
       }
       obj.c("popup_type", Integer.valueOf(i1));
       int i2 = (!p0)? 1: 0;
       obj.c("is_have_content", Integer.valueOf(i2));
       obj.d("session_id", this.f);
       obj.d("quote_page2", this.j);
       if (p0 != -1) {
          i = (p0)? 0: 1;
       }
    label_007d :
       obj.c("load_status", Integer.valueOf(i));
       a.o(obj, "jsonBuilder");
       return obj;
    }
    public final ClientContent$ContentPackage b(QPhoto p0){
       ShareToFollowModel shareToFollo;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PlcDynamicBizActionLogger plcDynamicBi = PlcDynamicBizActionLogger.class;
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, this, plcDynamicBi, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       ClientContent$PhotoPackage photoPackage = PatchProxy.applyOneRefs(p0, this, plcDynamicBi, "11");
       if (photoPackage != patchProxyRe) {
       }else if(p0 == null){
          photoPackage = null;
       }else {
          photoPackage = w1.f(p0.mEntity);
          photoPackage.shareIdentify = p0.isShareToFollow();
          boolean b = false;
          boolean b1 = (r1.D3(p0.getEntity()) && w.P(p0.getEntity()))? true: false;
          photoPackage.supportLandscapeMode = b1;
          ActivityContext uActivityCon = ActivityContext.g();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          Activity uActivity = uActivityCon.e();
          if (uActivity != null) {
             Resources resources = uActivity.getResources();
             a.o(resources, "activity.resources");
             if (resources.getConfiguration().orientation == 2) {
                b = true;
             }
             photoPackage.landscapeScreenDisplay = b;
          }
       }
       obj.photoPackage = photoPackage;
       if (photoPackage && p0 != null) {
          photoPackage.supportLandscapeMode = w.P(p0.mEntity);
       }
       if (p0 != null && p0.isShareToFollow()) {
          shareToFollo = p0.getShareToFollowModel();
          if (shareToFollo != null) {
             ClientContent$ChatPackage uChatPackage = new ClientContent$ChatPackage();
             uChatPackage.sendUserId = shareToFollo.getSharerUserIds();
             obj.chatPackage = uChatPackage;
          }
       }
       if (obj.tagPackage == null) {
          obj.tagPackage = new ClientContent$TagPackage();
       }
       shareToFollo.params = TextUtils.I(this.h.getBizExtraData());
       return obj;
    }
    public final void c(int p0,int p1){
       String str;
       FeedLogCtx this;
       PlcDynamicBizActionLogger plcDynamicBi = this;
       if (PatchProxy.isSupport(PlcDynamicBizActionLogger.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, PlcDynamicBizActionLogger.class, "5")) {
          return;
       }
       if (plcDynamicBi.d != null) {
          return;
       }
       plcDynamicBi.d = true;
       long l = (plcDynamicBi.e)? (plcDynamicBi.g + SystemClock.elapsedRealtime()) - plcDynamicBi.e: 0;
       PlcDynamicLogger.a("∞Î∆¡Õ£¡Ù ±≥§£∫"+l);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PLC_HALF_PAGE_CONTAINER_CLOSE";
       if (PatchProxy.isSupport(PlcDynamicBizActionLogger.class)) {
          str = PatchProxy.applyThreeRefs(Long.valueOf(l), Integer.valueOf(p0), Integer.valueOf(p1), this, PlcDynamicBizActionLogger.class, "8");
          if (str != PatchProxyResult.class) {
          label_009c :
             uElementPack.params = str;
             ClickMetaData uClickMetaDa = new ClickMetaData();
             ClickMetaData uClickMetaDa1 = uClickMetaDa.setType(4).setElementPackage(uElementPack).setContentPackage(this.b(plcDynamicBi.i));
             PlcDynamicBizActionLogger i = plcDynamicBi.i;
             this = null;
             FeedLogCtx feedLogCtx = (i != null)? i.getFeedLogCtx(): this;
             uClickMetaDa1.setFeedLogCtx(feedLogCtx);
             u1.B(uClickMetaDa);
             if (!PatchProxy.isSupport(PlcDynamicBizActionLogger.class) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(l), Integer.valueOf(p0), this, PlcDynamicBizActionLogger.class, "6")) {
                if (p0) {
                   PlcDynamicLogger.g("load status failed! not upload plc reco signal!");
                }else if(l <= 0){
                   PlcDynamicLogger.g("duration invalid! not upload plc reco signal!");
                }else {
                   f uof = d.a(-1575111559);
                   ClientContent$ContentPackage uContentPack = this.b(plcDynamicBi.i);
                   i = plcDynamicBi.i;
                   if (i != null) {
                      this = i.getFeedLogCtx();
                   }
                   PlcRecoSignalInfo$a uoa = new PlcRecoSignalInfo$a();
                   uoa.b(plcDynamicBi.h.getBizType());
                   uoa = uoa.c(l);
                   uoa.d(true);
                   uof.zc(uContentPack, this, uoa.a());
                }
             }
             return;
          }
       }
       i3 oi3 = this.a(p0);
       oi3.d("quote_page2", plcDynamicBi.j);
       oi3.c("duration", Long.valueOf(l));
       oi3.c("close_type", Integer.valueOf(p1));
       str = oi3.e();
       a.o(str, "jsonBuilder.build\(\)");
       goto label_009c ;
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicBizActionLogger.class, "2")) {
          return;
       }
       a.p(p0, "owner");
       if (this.b != null && this.e > 0) {
          this.g = this.g + (SystemClock.elapsedRealtime() - this.e);
       }
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicBizActionLogger.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       if (this.b != null) {
          this.e = SystemClock.elapsedRealtime();
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
