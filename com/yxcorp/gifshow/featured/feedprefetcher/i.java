package com.yxcorp.gifshow.featured.feedprefetcher.i;
import java.lang.Object;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import com.yxcorp.gifshow.featured.feedprefetcher.i$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import iea.n;
import java.lang.Runnable;
import java.util.concurrent.Future;
import lea.f;
import lea.b;
import com.yxcorp.gifshow.entity.QPhoto;
import wkd.b;
import com.yxcorp.gifshow.featured.feedprefetcher.logger.PhotoPrefetchLogManager;
import com.yxcorp.gifshow.featured.feedprefetcher.logger.PrefetchPhotoInfo;
import com.yxcorp.gifshow.featured.feedprefetcher.g;
import p5a.d;
import com.yxcorp.gifshow.featured.feedprefetcher.logger.DownloadPhotoInfo;
import o56.a;
import java.lang.System;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import java.lang.StringBuilder;
import pea.b;
import java.util.List;
import java.util.Objects;
import iea.a;
import iea.m;
import iea.l;

public class i	// class@000fbc
{
    public List a;
    public String b;
    public m c;
    public l d;
    public boolean e;
    public i$a f;
    public final ExecutorService g;

    public void i(){
       super();
       this.g = c.f("PhotoPrefetcher");
    }
    public void a(i$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.g.submit(new n(this, p0));
       return;
    }
    public void b(f p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "5")) {
          return;
       }
       b mQPhoto = p0.mQPhoto;
       if (mQPhoto != null) {
          String photoId = mQPhoto.getPhotoId();
          PrefetchPhotoInfo prefetchPhot = b.a(0x31d4e985).a(photoId);
          if (prefetchPhot == null) {
             prefetchPhot = new PrefetchPhotoInfo();
             prefetchPhot.mPhotoId = photoId;
             prefetchPhot.mPhotoHetu = g.g(p0.mQPhoto);
             prefetchPhot.mLlsid = p0.mLlsid;
             prefetchPhot.mPhotoType = p0.mQPhoto.getType();
             prefetchPhot.mMediaType = d.a(p0.mQPhoto);
             DownloadPhotoInfo uDownloadPho = new DownloadPhotoInfo();
             prefetchPhot.mDownloadPhotoInfo = uDownloadPho;
             uDownloadPho.mAppVer = a.m;
             uDownloadPho.mReason = "UNKNOWN";
          }
          prefetchPhot.mDownloadPhotoInfo.mFinishTime = System.currentTimeMillis();
          PrefetchPhotoInfo mDownloadPho = prefetchPhot.mDownloadPhotoInfo;
          mDownloadPho.mStatus = p1;
          mDownloadPho.mIsFullyCache = g.i(p0.mQPhoto);
          p1.mSize = g.f(p0.mQPhoto);
          p1.mHlsSegCnt = g.d(p0.mQPhoto);
          b.a(0x31d4e985).f(prefetchPhot);
       }
       return;
    }
    public String c(){
       return this.b;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, i.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (q.f(this.a) ^ 0x01);
    }
    public final void e(String p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "10")) {
          return;
       }
       b.g("Manager reset reason: "+p0);
       if (this.a != null) {
          this.a.clear();
          this.a = null;
       }
       this.b = null;
       if (this.c != null) {
          i tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(null, tc, a.class, "4")) {
             StringBuilder str = "release prefetchVideo submit HodorTask==null?";
             b = (tc.e != null)? true: false;
             tc.e(str+b);
             if (tc.e != null) {
                tc.e = null;
             }
          }
          this.c = null;
       }
       if (this.d != null) {
          this.d.d();
       }
       this.e = false;
       this.f = null;
       return;
    }
    public void f(){
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "7")) {
          return;
       }
       StringBuilder str = "Manager resume prefetch, mCurrentPhotoPrefetcher != null ? ";
       boolean b = true;
       boolean b1 = (this.c != null)? true: false;
       b.g(str+b1+" mIsPrefetchTaskPaused = "+this.e);
       if (this.c != null && this.e != null) {
          this.e = false;
          if (!PatchProxy.applyVoid(objArray, this, oi, "9")) {
             StringBuilder str1 = "Manager resumeLastPrefetchTask, mCurrentPrefetchListener != null ? ";
             boolean b2 = (this.f != null)? true: false;
             str1 = str1+b2+" mPhotoPrefetchSwitcher != null ? ";
             if (this.d == null) {
                b = false;
             }
             b.g(str1+b);
             if (this.d != null) {
                this.a(this.f);
             }
          }
       }
       return;
    }
}
