package com.yxcorp.gifshow.photo.download.utils.e$a;
import sfc.a;
import axb.b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.retrofit.model.KwaiException;
import com.yxcorp.gifshow.photo.download.utils.e;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.framework.model.feed.BaseFeed;
import kxb.e;

public class e$a extends a	// class@000f25
{
    public final b c;
    public final QPhoto d;

    public void e$a(b p0,QPhoto p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       if (p0 instanceof KwaiException) {
          KwaiException kwaiExceptio = p0;
          e$a tc = this.c;
          if (tc != null && kwaiExceptio.mErrorCode == 205) {
             if (!PatchProxy.applyVoidOneRefs(tc, null, e.class, "3")) {
                DownloadPhotoInfoResponse uDownloadPho = new DownloadPhotoInfoResponse();
                uDownloadPho.mPhotoDownloadDeny = false;
                uDownloadPho.mNotNeedWaterMark = true;
                if (tc != null) {
                   tc.a(uDownloadPho);
                }
             }
          }else {
             super.b(p0);
             i3 oi3 = i3.f();
             oi3.c("type", Integer.valueOf(kwaiExceptio.getErrorCode()));
             e.h(this.d.mEntity, "PHOTO_DOWNLOAD_FAIL_TOAST", oi3.e(), 7);
          }
       }else {
          super.b(p0);
       }
       return;
    }
}
