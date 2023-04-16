package com.yxcorp.gifshow.detail.plc.adapter.b;
import com.yxcorp.download.k;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import mxb.j0;
import mxb.i0;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import nl9.d;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kwai.framework.model.feed.BaseFeed;
import v3a.c;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.android.model.mix.ShareToFollowModel;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ChatPackage;
import com.yxcorp.gifshow.detail.plc.adapter.a;
import lnc.c3$b;
import lnc.c3;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import q2b.h$b;
import k2b.u1;
import java.lang.Throwable;
import java.lang.Long;
import v3a.a;
import v3a.b;
import mxb.j;

public class b extends k	// class@001662
{
    public final j0 c;
    public QPhoto d;
    public PlcEntryStyleInfo e;

    public void b(QPhoto p0,PlcEntryStyleInfo p1){
       super();
       this.c = i0.a();
       this.d = p0;
       this.e = p1;
    }
    public void a(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       d.a(0x4bd38ddd).TJ(p0.getUrl());
       return;
    }
    public void b(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       d.a(0x4bd38ddd).yP(p0.getId()).subscribe(Functions.d(), Functions.d());
       return;
    }
    public void c(DownloadTask p0){
       boolean b;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "2")) {
          return;
       }
       d.a(0x4bd38ddd).EJ(p0.getId()).subscribe(Functions.d(), Functions.d());
       j0 oj0 = this.c.j(31, this.d.mEntity, this.e).d(new c(p0));
       d uod = d.a(0x4bd38ddd);
       Object[] objArray = null;
       PlcEntryStyleInfo$StyleInfo styleInfo = PatchProxy.apply(objArray, this, uob, "10");
       if (styleInfo != PatchProxyResult.class) {
       }else {
          b te1 = this.e;
          if (te1 == null) {
             te1 = this.d.getPlcEntryStyleInfo();
          }
          styleInfo = te1.mStyleInfo.mPackageName;
       }
       uod.J10(styleInfo, objArray, p0.getUrl(), oj0);
       if (!PatchProxy.applyVoid(objArray, this, uob, "3")) {
          b te = this.e;
          b = false;
          PlcEntryStyleInfo mBizType = (te != null)? te.mBizType: null;
          int i = 10;
          if (mBizType == i) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "DOWNLOAD_SUCCESS";
             i3 oi3 = i3.f();
             oi3.d("bussiness_type", String.valueOf(i));
             oi3.d("show_type", "weak");
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             ClientContent$PhotoPackage photoPackage = w1.f(this.d.mEntity);
             photoPackage.fullScreenDisplay = b;
             photoPackage.shareIdentify = this.d.isShareToFollow();
             uContentPack.photoPackage = photoPackage;
             uob = this.d;
             if (uob != null && uob.isShareToFollow()) {
                ShareToFollowModel shareToFollo = this.d.getShareToFollowModel();
                if (shareToFollo != null) {
                   ClientContent$ChatPackage uChatPackage = new ClientContent$ChatPackage();
                   uChatPackage.sendUserId = shareToFollo.getSharerUserIds();
                   uContentPack.chatPackage = uChatPackage;
                }
             }
             uob = this.e;
             if (uob == null) {
                PlcEntryStyleInfo plcEntryStyl = this.d.getPlcEntryStyleInfo();
             }
             PlcEntryStyleInfo$TagPackage tagPackage = c3.a(uob.mStyleInfo.mWeakStyleTemplateInfo, a.a);
             if (tagPackage != null) {
                ClientContent$TagPackage tagPackage1 = new ClientContent$TagPackage();
                uContentPack.tagPackage = tagPackage1;
                tagPackage1.identity = tagPackage.mIdentity;
                tagPackage1.name = tagPackage.mName;
                tagPackage1.type = tagPackage.mType;
                tagPackage1.secondaryType = tagPackage.mSecondaryType;
                tagPackage1.params = tagPackage.mParams;
             }
             h$b uob1 = h$b.e(7, "DOWNLOAD_SUCCESS");
             uob1.k(uElementPack);
             uob1.h(uContentPack);
             u1.r0(uob1);
          }
       }
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "9")) {
          return;
       }
       d.a(0x4bd38ddd).Ay(p0.getId(), p0.getTotalBytes(), p1).subscribe(Functions.d(), Functions.d());
       return;
    }
    public void i(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, b.class, "6")) {
          return;
       }
       d.a(0x4bd38ddd).um(p0.getId(), p0.getSoFarBytes(), p0.getTotalBytes()).subscribe(Functions.d(), Functions.d());
       this.c.j(33, this.d.mEntity, this.e).d(new a(p1, p2)).a();
       return;
    }
    public void k(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, b.class, "8")) {
          return;
       }
       d.a(0x4bd38ddd).ti(p0.getId(), p0.getSoFarBytes(), p0.getTotalBytes()).subscribe(Functions.d(), Functions.d());
       return;
    }
    public void m(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, b.class, "7")) {
          return;
       }
       d.a(0x4bd38ddd).kP(p0.getId(), p0.getSoFarBytes(), p0.getTotalBytes()).subscribe(Functions.d(), Functions.d());
       this.c.j(34, this.d.mEntity, this.e).d(new b(p1, p2)).a();
       return;
    }
    public void o(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       if (!p0.getSoFarBytes()) {
          b tc = this.c;
          tc.b(tc.x(this.d.mEntity, this.e), 30);
       }
       return;
    }
}
