package com.yxcorp.gifshow.photo.download.presenter.a$a;
import exb.b;
import com.yxcorp.gifshow.photo.download.presenter.a;
import java.lang.Object;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import com.yxcorp.gifshow.photo.download.task.b;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e17.i;
import java.lang.Float;
import fxb.b;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Math;
import com.smile.gifmaker.mvps.utils.observable.ObservableList;
import com.yxcorp.gifshow.entity.QPhoto;
import fxb.a;

public class a$a implements b	// class@000edb
{
    public final boolean a;
    public final a b;

    public void a$a(a p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
    }
    public void b(DownloadPhotoInfoResponse p0){
    }
    public void c(b p0){
    }
    public void onCancel(){
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "3")) {
          return;
       }
       this.b.c();
       i.a(R.style.arg_RES_7f11066a, 0x7f1043cb);
       return;
    }
    public void onProgress(float p0){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (this.a == null) {
          p0 = p0 * 100.00f;
          Object[] objArray = new Object[0];
          b.C().w("download_pic", "长图下载进度"+p0, objArray);
          uoa = this.b;
          uoa.j(uoa.f, p0);
       }
       return;
    }
    public void onStart(){
    }
    public void onSuccess(){
       a$a tb;
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "download_pic";
       b.C().w(str, "长图下载完成", objArray);
       int i1 = 1;
       if (this.a != null) {
          tb = this.b;
          tb.g = tb.g + i1;
          Object[] objArray1 = new Object[i];
          b.C().w(str, "长图下载完成, 开始下图集", objArray1);
          a$a tb1 = this.b;
          tb1.j(tb1.f, (float)Math.round((tb.i() * 100.00f)));
          this.b.d();
       }else {
          this.b.h();
          tb = this.b;
          a.h(tb.c, i1, tb.b.size(), i1, 7);
       }
       return;
    }
}
