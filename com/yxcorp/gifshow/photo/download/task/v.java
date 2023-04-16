package com.yxcorp.gifshow.photo.download.task.v;
import com.yxcorp.gifshow.photo.download.task.f;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import exb.b;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.photo.download.task.b;
import com.kuaishou.android.model.mix.PhotoMeta;
import jxb.i;
import com.yxcorp.gifshow.video.d$b;
import nxc.c;
import java.lang.Void;
import kxb.e;
import crd.b;
import lnc.b9;
import java.io.File;
import com.yxcorp.gifshow.photo.download.utils.e;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import com.yxcorp.gifshow.model.CDNUrl;
import erd.o;
import t45.d;
import brd.z;
import ixb.o0;
import ixb.p0;
import erd.g;
import com.yxcorp.gifshow.video.d;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.qa;
import ixb.r0;
import ixb.q0;
import com.yxcorp.gifshow.photo.download.task.t;

public class v extends f	// class@000f1b
{
    public c l;
    public b m;
    public d$b n;
    public static final int o;

    public void v(GifshowActivity p0,QPhoto p1,StatModel p2,b p3){
       super(p0, p1, p2, p3);
       p2.mNeedCdnReport = false;
    }
    public t b(){
       Object obj = PatchProxy.apply(null, this, v.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b.getPhotoMeta() != null && this.b.getPhotoMeta().mPostWorkInfoId >= null) {
          return i.e(this.b);
       }
       return super.b();
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, v.class, "5")) {
          return;
       }
       super.cancel();
       v tn = this.n;
       if (tn != null) {
          tn.e();
          e.e(this.l);
       }
       b9.a(this.m);
       return;
    }
    public void e(){
       v ov = v.class;
       if (PatchProxy.applyVoid(null, this, ov, "1")) {
          return;
       }
       this.d.onStart();
       File uFile = new File(e.a(), i.f(this.b));
       CDNUrl[] downloadUrl = DownloadPhotoInfoResponse.getDownloadUrl(this.f);
       if (downloadUrl != null) {
          this.e.mWaterMarkType = 4;
          if (!PatchProxy.applyVoidOneRefs(downloadUrl, this, ov, "3")) {
             this.e.mIsNetDownload = true;
             this.m = t.just(downloadUrl).flatMap(this.f(false)).flatMap(this.j()).subscribeOn(d.c).observeOn(d.a).subscribe(new o0(this), new p0(this));
          }
       }else {
          this.m = qa.s(d.class, LoadPolicy.SILENT_IMMEDIATE).C(new r0(this, uFile)).G(d.a).R(new q0(this, uFile), t.b);
       }
       return;
    }
}
