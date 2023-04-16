package com.yxcorp.gifshow.photo.download.task.a0;
import com.yxcorp.gifshow.photo.download.task.b;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import ixb.x0;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import com.yxcorp.gifshow.entity.QPhoto;
import java.io.File;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import exb.b;
import k2b.e0;
import crd.b;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import ixb.w0;
import ekd.k1;
import java.lang.System;
import com.kwai.video.videoprocessor.JpegBuilder;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import java.util.ArrayList;
import com.yxcorp.gifshow.photo.download.task.x;
import io.reactivex.g;
import brd.t;
import ixb.y0;
import com.yxcorp.gifshow.photo.download.task.y;
import java.util.concurrent.Callable;
import erd.b;
import brd.a0;
import t45.d;
import brd.z;
import ixb.z0;
import erd.a;
import ixb.c1;
import ixb.d1;
import erd.g;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import com.yxcorp.gifshow.photo.download.utils.e;

public class a0 extends b	// class@000eec
{
    public b i;

    public static void f(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a0.class, "8")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       c.k(new x0(p0));
       return;
    }
    public static b g(QPhoto p0,File p1,boolean p2,StatModel p3,b p4,e0 p5){
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),p3,p4,p5};
          Object obj = PatchProxy.apply(objArray, null, uoa0, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return a0.h(p0, p1, p2, p3, p4, p5, true);
    }
    public static b h(QPhoto p0,File p1,boolean p2,StatModel p3,b p4,e0 p5,boolean p6){
       JpegBuilder obj;
       object oobject = p0;
       object oobject1 = p1;
       boolean b = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       a0 uoa0 = a0.class;
       int i = 3;
       int i1 = 1;
       int i2 = 0;
       if (PatchProxy.isSupport(uoa0)) {
          Object[] objArray = new Object[]{oobject,oobject1,Boolean.valueOf(p2),oobject2,oobject3,p5,Boolean.valueOf(p6)};
          obj = PatchProxy.apply(objArray, null, uoa0, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       k1.o(new w0(oobject3));
       oobject2.mStartTime = System.currentTimeMillis();
       if (b) {
          i = 1;
       }
       oobject2.mWaterMarkType = i;
       ArrayList uArrayList = new ArrayList();
       oobject2.mIsNetDownload = i2;
       oobject2.mLocalFile = oobject1;
       obj = new JpegBuilder(a.a().a());
       z0 oz0 = new z0(obj, p0, p3, p5, uArrayList);
       c1 uoc1 = new c1(obj, p1, p4, p6, p0, p3, p5);
       return t.create(new x(p0, b, oobject2, oobject3)).collect(new y0(uArrayList), y.b).G(d.a).o(v13).R(v12, new d1(oobject3));
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, a0.class, "2")) {
          return;
       }
       a0 ti = this.i;
       if (ti != null) {
          ti.dispose();
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, a0.class, "1")) {
          return;
       }
       File uFile = e.b(this.b);
       b te = this.e;
       te.mLocalFile = uFile;
       this.i = a0.g(this.b, uFile, (this.f.mNotNeedWaterMark ^ 0x01), te, this.d, this.c);
       return;
    }
}
