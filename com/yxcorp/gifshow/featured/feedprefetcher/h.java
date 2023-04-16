package com.yxcorp.gifshow.featured.feedprefetcher.h;
import iea.h;
import com.yxcorp.gifshow.featured.feedprefetcher.i;
import com.yxcorp.gifshow.featured.feedprefetcher.i$a;
import java.lang.Object;
import lea.b;
import lea.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import iea.l;
import pea.b;
import wkd.b;
import qea.u;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.List;
import com.yxcorp.gifshow.featured.feedprefetcher.g;

public class h implements h	// class@000fba
{
    public final i$a a;
    public final i b;

    public void h(i p0,i$a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(b p0,long p1,long p2){
    }
    public void b(b p0,long p1,long p2){
       if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, h.class, "1")) {
          b.g("Manager prefetch prefetchPhoto onCompleted, photo id = "+p0.mQPhoto.getPhotoId()+", hasNext = "+this.b.d.b()+", currentIndex = "+this.b.d.a());
          p0.mCanUser = true;
          b.a(-622777217).c(p0);
          this.b.b(p0, "SUCCESS");
          this.b.a(this.a);
       }
       return;
    }
    public void c(b p0,long p1,long p2){
       if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, h.class, "3")) {
          b.g("Manager prefetch prefetchPhoto onCanceled, photo id = "+p0.mQPhoto.getPhotoId()+", hasNext = "+this.b.d.b()+", currentIndex = "+this.b.d.a());
          this.b.b(p0, "CANCEL");
       }
       return;
    }
    public void d(b p0,int p1,long p2,long p3){
       if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Long.valueOf(p2), Long.valueOf(p3), this, h.class, "2")) {
          p0.mHadDownLoadErrorCount = p0.mHadDownLoadErrorCount + 1;
          b.g("Manager prefetch prefetchPhoto onError, photo id = "+p0.mQPhoto.getPhotoId()+", error count = "+p0.mHadDownLoadErrorCount+", errorCode = "+p1+", hasNext = "+this.b.d.b()+", currentIndex = "+this.b.d.a());
          this.b.b(p0, "FAIL");
          if (p0.mHadDownLoadErrorCount < 2 && (p1 != -2403 && p1 != -999999)) {
             b.a(-622777217).c(p0);
          }else {
             ArrayList uArrayList = new ArrayList();
             p0.mDownloadErrorCode = p1;
             p0.mDiscardReason = "download_error";
             uArrayList.add(p0);
             g.b(uArrayList, false);
          }
          this.b.a(this.a);
       }
       return;
    }
}
