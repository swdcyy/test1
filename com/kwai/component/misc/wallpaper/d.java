package com.kwai.component.misc.wallpaper.d;
import com.yxcorp.download.k;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.misc.wallpaper.WallPaperDownloadUtil;
import com.kwai.component.misc.wallpaper.f;
import com.yxcorp.download.DownloadManager;
import android.os.SystemClock;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import q2b.h$b;
import k2b.u1;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import s31.d;
import java.lang.Runnable;
import ekd.k1;
import java.io.File;
import java.lang.Throwable;
import java.lang.Math;

public class d extends k	// class@0009e1
{
    public final ProgressFragment c;
    public final QPhoto d;
    public final GifshowActivity e;

    public void d(ProgressFragment p0,QPhoto p1,GifshowActivity p2){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       super();
    }
    public void b(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "5")) {
          return;
       }
       WallPaperDownloadUtil.c(this.c);
       f.c(false, this.d);
       DownloadManager.n().e(p0.getId());
       return;
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       WallPaperDownloadUtil.l();
       if (WallPaperDownloadUtil.f) {
          long l = SystemClock.elapsedRealtime() - WallPaperDownloadUtil.c;
          f uof = f.class;
          if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), null, uof, "6")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             JsonObject jsonObject = new JsonObject();
             jsonObject.a0("dowmload_time", Long.valueOf(l));
             uElementPack.params = jsonObject.toString();
             h$b uob = h$b.e(7, "PLUGIN_DOWNLOAD_SUCCESS");
             uob.k(uElementPack);
             u1.r0(uob);
          }
       }
       WallPaperDownloadUtil.f = false;
       d tc = this.c;
       if (tc != null && tc.isAdded()) {
          this.c.Nh(100);
          tc = this.c;
          Objects.requireNonNull(tc);
          k1.r(new d(tc), 1);
       }
       f.c(true, this.d);
       if (new File(WallPaperDownloadUtil.b, WallPaperDownloadUtil.a).exists()) {
          WallPaperDownloadUtil.i(this.e);
       }
       DownloadManager.n().e(p0.getId());
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "3")) {
          return;
       }
       WallPaperDownloadUtil.c(this.c);
       f.c(false, this.d);
       return;
    }
    public void k(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, d.class, "2")) {
          return;
       }
       WallPaperDownloadUtil.m(this.c, Math.min((((float)p1 * 100.00f) / (float)p2), 100.00f));
       return;
    }
    public void o(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       WallPaperDownloadUtil.f = true;
       WallPaperDownloadUtil.c = SystemClock.elapsedRealtime();
       return;
    }
}
