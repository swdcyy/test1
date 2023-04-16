package com.yxcorp.gifshow.photo.download.widget.q;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$h;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.io.File;
import com.yxcorp.gifshow.photo.download.widget.k;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog;
import com.yxcorp.gifshow.photo.download.utils.c;
import java.lang.Float;
import java.lang.Math;

public class q extends DownloadPicDialog$h	// class@000f4f
{
    public final int a;
    public final QPhoto b;
    public final File c;
    public final DownloadPicDialog$b d;

    public void q(DownloadPicDialog$b p0,int p1,QPhoto p2,File p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super(null);
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "4")) {
          return;
       }
       DownloadPicDialog$b a = this.d.a;
       a.wh(((this.a + a.E) + 1), -1);
       this.d.a.Ch(this.b, this.a, this.c);
       c.g(this.b, 8);
       return;
    }
    public void onProgress(float p0){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oq, "2")) {
          return;
       }
       DownloadPicDialog$b a = this.d.a;
       a.wh(((this.a + a.E) + 1), Math.round((float)(int)(p0 * 100.00f)));
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       this.d.a.vh();
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, q.class, "3")) {
          return;
       }
       DownloadPicDialog$b a = this.d.a;
       a.wh(((this.a + a.E) + 1), 100);
       this.d.a.Ch(this.b, this.a, this.c);
       return;
    }
}
