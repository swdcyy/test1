package com.kwai.components.playerkit.QPhotoPlayerKitDataSource;
import rx6.b;
import v5a.a;
import java.lang.Object;
import p5a.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.components.playerkit.QPhotoPlayerKitDataSource$IllegalDataSourceException;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import p5a.c;
import v5a.f;
import java.lang.Boolean;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import java.lang.Integer;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.player.mid.multisource.switcher.Switcher;
import qc6.h;
import ec6.f;
import ec6.g;
import com.kwai.video.player.CdnEventLogCallback;
import com.kwai.video.wayne.player.main.IPlayerListener;
import com.kwai.video.wayne.player.logreport.DataReporter;
import zc6.a;
import wc6.c;
import nc6.e;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kwai.components.playerkit.QPhotoPlayerKitDataSource$a;
import com.kwai.video.wayne.player.listeners.InnerPlayerLifeCycleListener;
import com.kwai.video.wayne.player.builder.PlayerCommonBuildData;
import p5a.d;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import oi5.h;
import o5a.n;
import oi5.a;
import com.yxcorp.utility.Log;
import r5a.b;
import com.kwai.framework.player.multisource.PlaySourceSwitcher;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import gi5.b;
import qc6.k;
import com.kuaishou.android.model.mix.VideoMeta;
import tl8.d;
import java.io.File;
import zp.c0;
import s5a.e;
import com.yxcorp.gifshow.model.CDNUrl;
import p5a.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.IllegalArgumentException;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import vca.i;
import gi5.a;
import ekd.j;
import gi5.c;
import com.kwai.components.playerkit.a;
import ok.h;
import tl8.e;

public class QPhotoPlayerKitDataSource implements b	// class@000cd8
{
    public final a a;
    public final g b;
    public int c;

    public void QPhotoPlayerKitDataSource(a p0){
       super();
       this.c = 0;
       this.a = p0;
       a uoa = new a(p0.e);
       try{
          this.b = uoa;
          this.i();
          return;
       }catch(java.lang.Exception e3){
          throw new QPhotoPlayerKitDataSource$IllegalDataSourceException("DataSource illegal ", e3);
       }
    }
    public static QPhotoPlayerKitDataSource g(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, QPhotoPlayerKitDataSource.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new QPhotoPlayerKitDataSource(p0);
    }
    public static QPhotoPlayerKitDataSource h(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, QPhotoPlayerKitDataSource.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return QPhotoPlayerKitDataSource.g(p0.K);
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, QPhotoPlayerKitDataSource.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.e.isHdr();
    }
    public void b(IWaynePlayer p0){
       c a;
       if (PatchProxy.applyVoidOneRefs(p0, this, QPhotoPlayerKitDataSource.class, "6")) {
          return;
       }
       p0.putExtra("WAYNE_EXTRA_FOR_QPHOTO_TYPE", Integer.valueOf(this.c));
       WayneBuildData wayneBuildDa = null;
       if (p0.getWaynePlayerBuildData() != null) {
          wayneBuildDa = p0.getWaynePlayerBuildData().getSwitcher();
       }
       if (wayneBuildDa instanceof h) {
          p0.setCdnEventLogCallBack(this.b.build());
       }
       DataReporter uDataReporte = a.b(p0);
       if (uDataReporte instanceof c) {
          a = uDataReporte.a;
          a.d(this.a.e.getVideoMetaDuration());
          a.h(this.a.e.getPhotoId());
       }
       return;
    }
    public void c(WayneBuildData p0){
       File uFile;
       KwaiManifest kwaiManifest;
       h oh;
       h oh1;
       QPhotoPlayerKitDataSource qPhotoPlayer = QPhotoPlayerKitDataSource.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, qPhotoPlayer, "2")) {
          return;
       }
       int i = 1;
       p0.setPlayIndex((p0.getPlayIndex() + i));
       QPhotoPlayerKitDataSource ta = this.a;
       int i1 = 0;
       if (ta != null) {
          a e = ta.e;
          if (e != null) {
             p0.setBizStrategyData(i1, e.getWatchTime());
             if (this.a.e.getEntity() != null) {
                p0.setBizStrategyData(i, r1.A1(this.a.e.getEntity()));
             }
          }
       }
       p0.setInnerPlayerLifeCycleListener(new QPhotoPlayerKitDataSource$a(this));
       if (this.a.e.isVideoType() && this.a.e.isMine()) {
          this.a.e.updateLocalFileIfAny();
       }
       int i2 = d.a(this.a.e);
       this.c = i2;
       QPhotoPlayerKitDataSource ta1 = this.a;
       if (!PatchProxy.isSupport(qPhotoPlayer) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(i2), p0, ta1, this, QPhotoPlayerKitDataSource.class, "7")) {
          a uoa = 2;
          switch (i2){
              case 1:
                uFile = c0.e(ta1.e.getEntity().a(VideoMeta.class));
                if (uFile != null) {
                   n.l(uFile, p0);
                }else {
                   ExceptionHandler.handleCaughtException(new IllegalArgumentException("No local file"));
                }
                break;
              case 2:
                kwaiManifest = i.b(ta1.e);
                a uoa1 = new a(ta1);
                if (kwaiManifest.mMediaType == i) {
                   p0.setPlaylistCachePolicy(uoa);
                   this.e(ta1, p0, kwaiManifest, uoa1);
                }else {
                   this.f(ta1, p0, kwaiManifest, uoa1);
                }
                break;
              case 3:
                oh = new h(n.a(ta1));
                oh.a();
                p0.setSwitcher(oh);
                break;
              case 5:
                CDNUrl[] uCDNUrlArray = b.b(ta1.e);
                if (uCDNUrlArray != null && uCDNUrlArray.length == i) {
                   CDNUrl mUrl = uCDNUrlArray[i1].mUrl;
                   if (TextUtils.isEmpty(mUrl)) {
                      ExceptionHandler.handleCaughtException(new IllegalArgumentException("player music url is empty"));
                   }else {
                      n.k(p0, mUrl);
                   }
                }
                break;
              case 6:
                oh1 = new h(n.i(ta1, b.b(ta1.e)));
                oh1.a();
                p0.setSwitcher(oh1);
                break;
              case 7:
                uFile = c0.e(ta1.e.getEntity().a(VideoMeta.class));
                if (uFile != null && (uFile.exists() && uFile.canRead())) {
                   n.l(uFile, p0);
                }else {
                   oh1 = new h(new e(ta1.e));
                   oh1.a();
                   p0.setSwitcher(oh1);
                }
                break;
              case 8:
                oh = new h(n.e(ta1));
                oh.a();
                p0.setSwitcher(oh);
                break;
              case 9:
                this.e(ta1, p0, this.l(ta1), this.k(ta1));
                break;
              case 10:
                this.f(ta1, p0, this.l(ta1), this.k(ta1));
                break;
              case 11:
                kwaiManifest = r1.q1(ta1.e.mEntity);
                b uob = new b(ta1);
                if (kwaiManifest.mMediaType == i) {
                   p0.setPlaylistCachePolicy(uoa);
                   this.e(ta1, p0, kwaiManifest, uob);
                }else {
                   this.f(ta1, p0, kwaiManifest, uob);
                }
                break;
              case 12:
                oh = h.a;
                if (oh.d(this.a.e)) {
                   n.m(ta1, p0);
                }else if(oh.b(this.a.e)){
                   n.j(p0);
                }else if(oh.c(this.a.e)){
                   n.j(p0);
                }
                uoa = this.a.d;
                if (uoa != null) {
                }else {
                   Log.a("QPhotoPlayerKitDataSour", new IllegalStateException("playerBuildData No setContentSdkHelper for Fushion Photo"));
                   uoa = new a(this.a.e);
                }
                oh1 = new h(new b(uoa));
                oh1.a();
                p0.setSwitcher(oh1);
                break;
              default:
             label_0089 :
                throw new IllegalStateException("[config media type failed ]Unknown media type:"+i2);
          }
       }
    label_0204 :
       a.a(p0, p0.getSwitcher());
       return;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, QPhotoPlayerKitDataSource.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return r1.l3(this.a.e.mEntity);
    }
    public final void e(a p0,WayneBuildData p1,KwaiManifest p2,k p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, QPhotoPlayerKitDataSource.class, "8")) {
          return;
       }
       n.j(p1);
       h oh = new h(n.d(p1, p2, p3));
       oh.a();
       p1.setSwitcher(oh);
       return;
    }
    public final void f(a p0,WayneBuildData p1,KwaiManifest p2,k p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, QPhotoPlayerKitDataSource.class, "9")) {
          return;
       }
       n.m(p0, p1);
       h oh = new h(n.h(p0, p2, p3));
       oh.a();
       p1.setSwitcher(oh);
       return;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, QPhotoPlayerKitDataSource.class, "5")) {
          return;
       }
       int i = d.a(this.a.e);
       switch (i){
           case 1:
             if (c0.e(this.a.e.getEntity().a(VideoMeta.class)) == null) {
             label_007e :
                throw new IllegalStateException();
             }
             break;
           case 2:
             if (i.b(this.a.e) == null) {
             label_0061 :
                throw new IllegalStateException();
             }
             break;
           case 3:
           case 5:
           case 7:
           case 8:
           case 9:
           case 10:
           case 12:
           case 6:
             if (j.h(b.b(this.a.e))) {
             label_0050 :
                throw new IllegalStateException();
             }
             break;
           case 11:
             if (r1.q1(this.a.e.mEntity) == null) {
                throw new IllegalStateException();
             }
             break;
           default:
          label_0017 :
             throw new IllegalStateException("unimpl mediaType "+i);
       }
       return;
    }
    public a j(){
       return this.a;
    }
    public final k k(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QPhotoPlayerKitDataSource.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(p0);
    }
    public final KwaiManifest l(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QPhotoPlayerKitDataSource.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(p0.e.mEntity, VideoMeta.class, a.b);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, QPhotoPlayerKitDataSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "QPhotoPlayerKitDataSource"+this.hashCode()+"{"+this.a.e+"}";
    }
}
