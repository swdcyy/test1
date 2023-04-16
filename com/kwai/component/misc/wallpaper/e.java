package com.kwai.component.misc.wallpaper.e;
import com.yxcorp.download.k;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.List;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import pc5.b;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.component.misc.wallpaper.WallPaperDownloadUtil;
import lnc.qa;
import com.yxcorp.gifshow.video.c;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import wc5.l;
import wc5.k;
import erd.g;
import crd.b;
import java.lang.Throwable;
import e17.i;
import java.lang.Long;
import ukd.a;
import java.lang.Math;

public class e extends k	// class@0009e2
{
    public final AtomicBoolean c;
    public final List d;
    public final float e;
    public final ProgressFragment f;
    public final int g;
    public final GifshowActivity h;
    public final QPhoto i;
    public final String j;

    public void e(AtomicBoolean p0,List p1,float p2,ProgressFragment p3,int p4,GifshowActivity p5,QPhoto p6,String p7){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       this.i = p6;
       this.j = p7;
       super();
    }
    public void b(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("WallPaperDownloadUtil", "executeAtlasPhotosDownloadTask "+this.d.indexOf(p0.getTargetFilePath())+" in "+this.g+" downloadTasks cancel url "+p0.getUrl()+" file "+p0.getTargetFilePath(), objArray);
       WallPaperDownloadUtil.c(this.f);
       return;
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       if (this.c.get()) {
          return;
       }
       int i = this.d.indexOf(p0.getTargetFilePath());
       if (i >= 0) {
          int i1 = 0;
          String str = " whole progress ";
          String str1 = " file ";
          String str2 = " downloadTasks complete url ";
          String str3 = " in ";
          String str4 = "executeAtlasPhotosDownloadTask ";
          String str5 = "WallPaperDownloadUtil";
          if (i < (this.g - 1)) {
             WallPaperDownloadUtil.m(this.f, (this.e * (float)(i + 1)));
             Object[] objArray = new Object[i1];
             b.C().w(str5, str4+i+str3+this.g+str2+p0.getUrl()+str1+p0.getTargetFilePath()+str+this.f.uh(), objArray);
          }else {
             WallPaperDownloadUtil.m(this.f, 80.00f);
             Object[] objArray1 = new Object[i1];
             b.C().w(str5, str4+i+str3+this.g+str2+p0.getUrl()+str1+p0.getTargetFilePath()+str+this.f.uh(), objArray1);
             e tc = this.c;
             l ol = new l(this, tc, this.d, this.j, this.i, this.h, this.f, p0);
             qa.s(c.class, LoadPolicy.SILENT_IMMEDIATE).R(v11, new k(this, tc, p0));
          }
       }
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "2")) {
          return;
       }
       b.C().e("WallPaperDownloadUtil", "executeAtlasPhotosDownloadTask "+this.d.indexOf(p0.getTargetFilePath())+" in "+this.g+" downloadTasks error url "+p0.getUrl()+" file "+p0.getTargetFilePath(), p1);
       WallPaperDownloadUtil.c(this.f);
       i.a(R.style.arg_RES_7f11066a, 0x7f105153);
       this.c.set(true);
       WallPaperDownloadUtil.k(this.h, this.i, this.j, 8, p1.getMessage(), "");
       return;
    }
    public void k(DownloadTask p0,long p1,long p2){
       Object[] objArray;
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, e.class, "1")) {
          return;
       }
       if (this.c.get()) {
          objArray = new Object[0];
          a.a(p0, "cancel", objArray);
          return;
       }else {
          int i = this.d.indexOf(p0.getTargetFilePath());
          if (i > 0) {
             e te = this.e;
             float f = (float)p1;
             float f1 = (float)p2;
             float f2 = ((float)i * te) + Math.min(((f * te) / f1), te);
             WallPaperDownloadUtil.m(this.f, f2);
             objArray = new Object[0];
             b.C().w("WallPaperDownloadUtil", "executeAtlasPhotosDownloadTask "+i+" in "+this.g+" downloadTasks url "+p0.getUrl()+" file "+p0.getTargetFilePath()+" progress "+(f / f1)+" whole progress "+f2, objArray);
          }
          return;
       }
    }
}
