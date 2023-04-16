package com.kwai.component.misc.wallpaper.WallPaperDownloadUtil$a;
import com.yxcorp.gifshow.video.c$c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.video.c$e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import pc5.b;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.video.c$g;
import q87.c;
import com.kwai.component.misc.wallpaper.WallPaperDownloadUtil;
import e17.i;
import java.lang.Double;
import exc.j;
import com.yxcorp.gifshow.video.c$f;

public class WallPaperDownloadUtil$a implements c$c	// class@0009db
{
    public final GifshowActivity a;
    public final QPhoto b;
    public final ProgressFragment c;
    public final String d;

    public void WallPaperDownloadUtil$a(GifshowActivity p0,QPhoto p1,ProgressFragment p2,String p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void a(c$e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WallPaperDownloadUtil$a.class, "3")) {
          return;
       }
       p0.release();
       Object[] objArray = new Object[0];
       b.C().t("WallPaperDownloadUtil", "executePhoto2Video error:"+p0.getError(), objArray);
       WallPaperDownloadUtil.c(this.c);
       i.a(R.style.arg_RES_7f11066a, 0x7f105153);
       WallPaperDownloadUtil.k(this.a, this.b, this.d, 8, p0.getError().toString(), "");
       return;
    }
    public void b(c$e p0,double p1){
       Object[] objArray;
       WallPaperDownloadUtil$a uoa = WallPaperDownloadUtil$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, uoa, "2")) {
          return;
       }
       int i = 0;
       if (p1 - null < 0) {
          objArray = new Object[i];
          b.C().t("WallPaperDownloadUtil", "ExportTask onProgress not excepted percent "+p1, objArray);
          return;
       }else {
          int i1 = (int)((((double)0.20f * p1) + 0x3fe99999a0000000) * 100.00f);
          WallPaperDownloadUtil.m(this.c, (float)i1);
          objArray = new Object[i];
          b.C().w("WallPaperDownloadUtil", "executePhoto2Video convert percent "+p1+" whole pregress "+i1, objArray);
          return;
       }
    }
    public void d(c$e p0,double p1){
       j.a(this, p0, p1);
    }
    public void e(c$e p0,c$f[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WallPaperDownloadUtil$a.class, "1")) {
          return;
       }
       p0.release();
       Object[] objArray = new Object[0];
       b.C().w("WallPaperDownloadUtil", "executePhoto2Video finish and whole task complete", objArray);
       WallPaperDownloadUtil.d(this.a, this.b, "", this.c, this.d);
       return;
    }
    public void f(c$e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WallPaperDownloadUtil$a.class, "4")) {
          return;
       }
       p0.release();
       Object[] objArray = new Object[0];
       b.C().w("WallPaperDownloadUtil", "executePhoto2Video cancel", objArray);
       i.a(R.style.arg_RES_7f11066a, 0x7f1004c5);
       WallPaperDownloadUtil.c(this.c);
       WallPaperDownloadUtil.k(this.a, this.b, this.d, 9, "", "");
       return;
    }
}
