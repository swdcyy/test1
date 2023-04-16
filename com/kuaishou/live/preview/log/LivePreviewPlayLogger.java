package com.kuaishou.live.preview.log.LivePreviewPlayLogger;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.framework.model.feed.BaseFeed;
import kp.w1;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import rl3.a;
import kp.r1;
import k2b.u1;
import java.lang.CharSequence;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;

public class LivePreviewPlayLogger extends SlidePlayLogger	// class@000e65
{
    public int mIndexInAdapter;
    public static final long serialVersionUID = 0x39d7e1abdccf0055;

    public void LivePreviewPlayLogger(){
       super();
    }
    public static ClientContent$PhotoPackage a(QPhoto p0,int p1){
       ClientContent$PhotoPackage obj;
       if (PatchProxy.isSupport(LivePreviewPlayLogger.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, LivePreviewPlayLogger.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0 = (p0 != null)? p0.mEntity: null;
       if (PatchProxy.isSupport(LivePreviewPlayLogger.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, LivePreviewPlayLogger.class, "4");
          if (obj != PatchProxyResult.class) {
          }else if(p0 == null){
             obj = new ClientContent$PhotoPackage();
          }else {
             p1++;
             obj = w1.g(p0, p1);
             obj.type = 2;
             obj.index = (long)p1;
          }
       }else {
          goto label_003b ;
       }
       return obj;
    }
    public ClientEvent$ExpTagTrans buildExpTagTrans(QLivePlayConfig p0){
       ClientEvent$ExpTagTrans obj = PatchProxy.applyOneRefs(p0, this, LivePreviewPlayLogger.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       obj = new ClientEvent$ExpTagTrans();
       obj.serverExpTag = TextUtils.I(p0.mServerExpTag);
       obj.clientExpTag = TextUtils.I(this.mClientExpTag);
       return obj;
    }
    public void onButtonClicked(BaseFeed p0,String p1,int p2,int p3,int p4,int p5,String p6,CommonParams p7){
       String str;
       if (PatchProxy.isSupport(LivePreviewPlayLogger.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),p6,p7};
          if (PatchProxy.applyVoid(objArray, this, LivePreviewPlayLogger.class, "1")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.name = p1;
       uElementPack.type = p2;
       uElementPack.status = 0;
       uElementPack.action = p5;
       QPhoto qPhoto = null;
       if (p0 instanceof LiveStreamFeed) {
          qPhoto = new QPhoto(p0);
       }
       if (p4 == 1) {
          str = "up";
       }else if(p4 == 2){
          str = "down";
       }else {
          str = "";
       }
       i3 oi3 = i3.f();
       oi3.d("swipe_gestures", str);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = PatchProxy.applyOneRefs(qPhoto, this, LivePreviewPlayLogger.class, "7");
       if (uContentPack != PatchProxyResult.class) {
       }else {
          uContentPack = new ClientContent$ContentPackage();
          if (qPhoto != null) {
             uContentPack.liveStreamPackage = a.a(qPhoto.mEntity, 1);
          }
          ClientContent$PhotoPackage photoPackage1 = (qPhoto != null)? w1.g(qPhoto.mEntity, 0): new ClientContent$PhotoPackage();
          photoPackage1.type = 2;
          uContentPack.photoPackage = photoPackage1;
       }
       ClientContent$ContentPackage photoPackage = uContentPack.photoPackage;
       if (photoPackage != null && p0 != null) {
          photoPackage.index = (long)(r1.y1(p0) + 1);
       }
       u1.x(p3, "", p4, uElementPack, uContentPack);
       return;
    }
    public ClientContent$ContentPackage onEnterLivePage(QPhoto p0){
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, this, LivePreviewPlayLogger.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.photoPackage = LivePreviewPlayLogger.a(p0, this.mIndexInAdapter);
       if (p0 != null) {
          obj.liveStreamPackage = a.a(p0.mEntity, 1);
       }
       CharSequence uCharSequenc = (p0 == null)? null: p0.getKsOrderId();
       if (!TextUtils.x(uCharSequenc)) {
          obj.ksOrderInfoPackage = l0.a(uCharSequenc);
       }
       return obj;
    }
    public ClientContent$ContentPackage onExitLivePage(QPhoto p0){
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, this, LivePreviewPlayLogger.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.photoPackage = LivePreviewPlayLogger.a(p0, this.mIndexInAdapter);
       CharSequence uCharSequenc = (p0 == null)? null: p0.getKsOrderId();
       if (!TextUtils.x(uCharSequenc)) {
          obj.ksOrderInfoPackage = l0.a(uCharSequenc);
       }
       return obj;
    }
    public void setIndexInAdapter(int p0){
       this.mIndexInAdapter = p0;
    }
    public void setLeaveAction(int p0){
    }
}
