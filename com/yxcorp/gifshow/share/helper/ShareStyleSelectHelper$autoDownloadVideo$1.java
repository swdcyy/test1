package com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$autoDownloadVideo$1;
import exb.b;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$autoDownloadVideo$1$onRepeatDownload$1;
import msd.a;
import tb7.b;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.photo.download.task.b;
import e17.i;
import java.lang.Throwable;
import com.kwai.library.widget.popup.common.c;
import java.lang.Boolean;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$autoDownloadVideo$1$onError$1;
import java.lang.Float;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Long;
import java.lang.StringBuilder;
import java.text.DecimalFormat;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$autoDownloadVideo$1$onProgress$1;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$autoDownloadVideo$1$onStart$1;
import java.util.Objects;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$processSuccess$1;
import u07.t;

public final class ShareStyleSelectHelper$autoDownloadVideo$1 implements b	// class@001b9e
{
    public DownloadPhotoInfoResponse a;
    public final ShareStyleSelectHelper b;

    public void ShareStyleSelectHelper$autoDownloadVideo$1(ShareStyleSelectHelper p0){
       this.b = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, ShareStyleSelectHelper$autoDownloadVideo$1.class, "8")) {
          return;
       }
       b.j(new ShareStyleSelectHelper$autoDownloadVideo$1$onRepeatDownload$1(this));
       return;
    }
    public void b(DownloadPhotoInfoResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareStyleSelectHelper$autoDownloadVideo$1.class, "4")) {
          return;
       }
       a.p(p0, "infoResponse");
       this.a = p0;
       return;
    }
    public void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareStyleSelectHelper$autoDownloadVideo$1.class, "2")) {
          return;
       }
       a.p(p0, "task");
       this.b.o = p0;
       return;
    }
    public void onCancel(){
       if (PatchProxy.applyVoid(null, this, ShareStyleSelectHelper$autoDownloadVideo$1.class, "3")) {
          return;
       }
       i.a(R.style.arg_RES_7f11066a, 0x7f1004c5);
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareStyleSelectHelper$autoDownloadVideo$1.class, "6")) {
          return;
       }
       ShareStyleSelectHelper q = this.b.q;
       Boolean uBoolean = (q != null)? Boolean.valueOf(q.K()): null;
       if (uBoolean.booleanValue()) {
          b.j(new ShareStyleSelectHelper$autoDownloadVideo$1$onError$1(this));
       }
       return;
    }
    public void onProgress(float p0){
       StringBuilder str;
       ShareStyleSelectHelper$autoDownloadVideo$1 uoautoDownlo = ShareStyleSelectHelper$autoDownloadVideo$1.class;
       if (PatchProxy.isSupport(uoautoDownlo) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoautoDownlo, "5")) {
          return;
       }
       int i = 100;
       int i1 = (int)(p0 * (float)i);
       Ref$ObjectRef objectRef = new Ref$ObjectRef();
       ShareStyleSelectHelper$autoDownloadVideo$1 ta = this.a;
       Boolean uBoolean = null;
       Long longx = (ta != null)? Long.valueOf(ta.mVideoSize): uBoolean;
       a.m(longx);
       if (longx.longValue() - 0x100000 < 0) {
          str = String.valueOf(i1);
       }else {
          str = "";
          DecimalFormat uDecimalForm = new DecimalFormat("0.0");
          ShareStyleSelectHelper$autoDownloadVideo$1 ta1 = this.a;
          Long longx1 = (ta1 != null)? Long.valueOf(ta1.mVideoSize): uBoolean;
          a.m(longx1);
          str = str+uDecimalForm.format((longx1.longValue() / 0x100000))+"MB/"+i1;
       }
       objectRef.element = str;
       ShareStyleSelectHelper q = this.b.q;
       if (q != null) {
          uBoolean = Boolean.valueOf(q.K());
       }
       if (uBoolean.booleanValue() && (i1 >= 0 && i1 <= i)) {
          b.j(new ShareStyleSelectHelper$autoDownloadVideo$1$onProgress$1(this, i1, objectRef));
       }
    label_0095 :
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, ShareStyleSelectHelper$autoDownloadVideo$1.class, "7")) {
          return;
       }
       b.j(new ShareStyleSelectHelper$autoDownloadVideo$1$onStart$1(this));
       return;
    }
    public void onSuccess(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ShareStyleSelectHelper$autoDownloadVideo$1.class, "1")) {
          return;
       }
       ShareStyleSelectHelper$autoDownloadVideo$1 tb = this.b;
       ShareStyleSelectHelper q = tb.q;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(q, tb, ShareStyleSelectHelper.class, "8")) {
          if (q != null) {
             objArray = Boolean.valueOf(q.K());
          }
          if (objArray.booleanValue()) {
             b.j(new ShareStyleSelectHelper$processSuccess$1(tb, q));
          }else {
             tb.l = true;
          }
       }
       return;
    }
}
