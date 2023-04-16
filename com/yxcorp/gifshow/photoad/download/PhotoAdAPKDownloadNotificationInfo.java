package com.yxcorp.gifshow.photoad.download.PhotoAdAPKDownloadNotificationInfo;
import com.kwai.framework.download.KwaiDownloadNotificationInfo;
import java.lang.String;
import java.lang.Object;
import android.os.Bundle;
import j66.c;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import tkd.b;
import tkd.d;
import nl9.d;
import android.app.Application;
import o56.a;
import com.yxcorp.gifshow.commercial.model.AdDownloadCenterSource;
import android.content.Context;
import com.yxcorp.gifshow.photoad.download.h;
import java.util.Map;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import java.io.Serializable;
import ekd.j0;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import mxb.j0;
import mxb.i0;
import mxb.j;
import java.io.File;
import tw.d;

public class PhotoAdAPKDownloadNotificationInfo implements KwaiDownloadNotificationInfo	// class@000f77
{
    public final String mIconUrl;
    public static final long serialVersionUID = 0xcc4b6c09044a85;

    public void PhotoAdAPKDownloadNotificationInfo(String p0){
       super();
       this.mIconUrl = p0;
    }
    public boolean canProcessNotificationClick(int p0){
       int i = 1;
       if (p0 != i && p0 != 2) {
          i = false;
       }
       return i;
    }
    public String getNotificationIconUrl(int p0){
       return this.mIconUrl;
    }
    public Bundle getNotificationIntentExtras(int p0){
       return c.c(this, p0);
    }
    public long getNotificationShowWhen(int p0){
       return c.d(this, p0);
    }
    public String getNotificationTargetName(int p0){
       return c.e(this, p0);
    }
    public boolean isNotificationCancellable(int p0){
       return c.f(this, p0);
    }
    public void onNotificationClick(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(PhotoAdAPKDownloadNotificationInfo.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, PhotoAdAPKDownloadNotificationInfo.class, "1")) {
          return;
       }
       int i = 1;
       if (p1 == i) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.type = 10;
          uElementPack.action = 0x757b;
          uElementPack.name = "click_downloading_progress_bar";
          u1.u(i, uElementPack, null);
          d.a(0x4bd38ddd).W10(a.b(), AdDownloadCenterSource.FROM_NOTIFICATION);
       }else if(p1 == 2){
          APKDownloadTask uAPKDownload = h.n().g().get(Integer.valueOf(p0));
          AdDataWrapper uAdDataWrapp = j0.e(p2, "task_tag1");
          if (uAdDataWrapp != null) {
             i0.a().p(37, uAdDataWrapp.getAdLogWrapper()).a();
          }
          if (uAPKDownload != null) {
             d.j(uAPKDownload.getDownloadAPKFile(), uAdDataWrapp);
          }
       }
       return;
    }
}
