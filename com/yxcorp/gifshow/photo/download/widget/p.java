package com.yxcorp.gifshow.photo.download.widget.p;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$h;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$b;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import com.yxcorp.gifshow.photo.download.widget.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog;
import java.lang.Throwable;
import java.lang.Float;
import java.lang.Integer;
import java.util.Map;
import java.lang.Math;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import k2b.e0;
import com.yxcorp.gifshow.photo.download.utils.c;

public class p extends DownloadPicDialog$h	// class@000f4e
{
    public boolean a;
    public final int b;
    public final StatModel c;
    public final DownloadPicDialog$b d;

    public void p(DownloadPicDialog$b p0,int p1,StatModel p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super(null);
       this.a = false;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       if (this.a != null) {
          return;
       }
       this.a = true;
       this.d.a.wh(this.b, true);
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "5")) {
          return;
       }
       this.onStart();
       this.d.a.wh(this.b, -1);
       this.d.a.vh();
       return;
    }
    public void onProgress(float p0){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, op, "3")) {
          return;
       }
       this.d();
       int i = (int)(p0 * 100.00f);
       if (i < this.d.a.L.get(Integer.valueOf(this.b)).intValue()) {
          return;
       }
       this.d.a.wh(this.b, Math.round((float)i));
       this.d.a.vh();
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, p.class, "2")) {
          return;
       }
       this.d();
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, p.class, "4")) {
          return;
       }
       this.d();
       this.d.a.wh(this.b, 100);
       this.d.a.vh();
       c.f(new QPhoto(this.d.a.x), 7, null, this.c, this.d.a.z, "PHOTO_DOWNLOAD_IMAGE_DIALOG_ONE_BUTTON");
       return;
    }
}
