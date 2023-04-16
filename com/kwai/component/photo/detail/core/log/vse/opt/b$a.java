package com.kwai.component.photo.detail.core.log.vse.opt.b$a;
import java.lang.Runnable;
import com.kwai.component.photo.detail.core.log.vse.opt.b;
import java.lang.String;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import id5.v;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import zd5.b;
import zd5.g;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$VideoStatEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.yxcorp.gifshow.log.model.StatMetaData;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import java.lang.Enum;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kwai.component.photo.detail.core.log.vse.opt.VseOptCollectObj;
import java.lang.System;
import com.google.protobuf.nano.MessageNano;
import zd5.d;
import com.kwai.framework.player.log.PlayerKitCheckException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.StringBuilder;

public class b$a implements Runnable	// class@000a2d
{
    public WeakReference b;
    public String c;

    public void b$a(b p0,String p1){
       super();
       this.b = new WeakReference(p0);
       this.c = p1;
    }
    public void run(){
       boolean b;
       int i;
       boolean b1;
       int i1;
       QPhoto qPhoto1;
       VseOptCollectObj obj = this;
       if (PatchProxy.applyVoid(null, obj, b$a.class, "1")) {
          return;
       }
       Object obj1 = obj.b.get();
       if (obj1 != null) {
          b$a c = obj.c;
          if (!PatchProxy.applyVoidOneRefs(c, obj1, b.class, "10") && obj1.c == null) {
             Object[] objArray = new Object[]{c};
             String str = "VseReportOpt";
             v.C().w(str, "doUpdateWorkSync ", objArray);
             b d = obj1.d;
             b e = obj1.e;
             if (d != null && !TextUtils.x(e)) {
                g og = d.a();
                if (og != null) {
                   g a = og.a;
                   String str1 = "";
                   ClientStat$VideoStatEvent urlPackage = a.urlPackage;
                   if (urlPackage != null) {
                      str1 = urlPackage.page2;
                   }
                   String str2 = str1;
                   StatMetaData statMetaData = new StatMetaData();
                   QPhoto qPhoto = -1;
                   if (og.a() != null) {
                      b = og.a().isVideoType();
                      PhotoAdvertisement photoAdverti = k.B(og.a());
                      if (photoAdverti != null) {
                         photoAdverti = photoAdverti.mAdGroup;
                         if (photoAdverti != null) {
                            i = photoAdverti.ordinal();
                         label_0089 :
                            if (og.a().getPlcEntryStyleInfo() != null) {
                               qPhoto = og.a().getPlcEntryStyleInfo().mBizType;
                            }
                            statMetaData.setFeedLogCtx(og.a().getFeedLogCtx());
                            b1 = b;
                            i1 = i;
                            qPhoto1 = qPhoto;
                         }
                      }
                      i = -1;
                      goto label_0089 ;
                   }else {
                      b1 = null;
                      i1 = -1;
                      qPhoto1 = -1;
                   }
                   VseOptCollectObj vseOptCollec = v12;
                   obj = v12;
                   vseOptCollec = new VseOptCollectObj(c, System.currentTimeMillis(), MessageNano.toByteArray(a), a.playedDuration, str2, a.sPhotoId, e, b1, i1, qPhoto1, 1, statMetaData);
                   d.c().g(e, obj);
                }
             }
          }
       }
       return;
    }
}
