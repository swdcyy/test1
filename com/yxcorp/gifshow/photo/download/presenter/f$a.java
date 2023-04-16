package com.yxcorp.gifshow.photo.download.presenter.f$a;
import exb.b;
import com.yxcorp.gifshow.photo.download.presenter.f;
import java.lang.Object;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import com.yxcorp.gifshow.photo.download.task.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fxb.b;
import q87.c;
import java.lang.Throwable;
import com.smile.gifmaker.mvps.utils.observable.ObservableList;
import com.yxcorp.gifshow.entity.QPhoto;
import fxb.a;
import e17.i;
import java.lang.Float;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.fragment.ProgressFragment;

public class f$a implements b	// class@000ee4
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void a(){
    }
    public void b(DownloadPhotoInfoResponse p0){
    }
    public void c(b p0){
    }
    public void onCancel(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("download_pic", "单图下载，取消onCancel", objArray);
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "3")) {
          return;
       }
       f$a ta = this.a;
       a.h(ta.c, false, ta.b.size(), false, 8);
       this.a.b();
       i.a(R.style.arg_RES_7f11066a, 0x7f1043cb);
       return;
    }
    public void onProgress(float p0){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "1")) {
          return;
       }
       p0 = p0 * 100.00f;
       Object[] objArray = new Object[0];
       b.C().w("download_pic", "单图下载进度"+p0, objArray);
       uoa = this.a;
       uoa.c(uoa.f, p0);
       return;
    }
    public void onStart(){
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("download_pic", "单图下载完成", objArray);
       f$a ta = this.a;
       ta.c(ta.f, 100.00f);
       return;
    }
}
