package com.kwai.framework.imagebase.ImageManagerInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jdb.c;
import jdb.b;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.switchs.SwitchConfigInitModule;
import com.kwai.framework.abtest.ABTestInitModule;
import com.kwai.framework.network.cronet.CronetInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.kwai.framework.imagebase.d;
import java.lang.Runnable;
import com.kwai.framework.init.c;
import com.kwai.framework.imagebase.e;
import android.app.Application;
import o56.a;
import com.kwai.sdk.switchconfig.a;
import e0d.d;
import com.yxcorp.utility.SystemUtil;
import java.lang.Runtime;
import oe6.b;
import java.lang.Boolean;
import java.lang.reflect.Type;
import com.kwai.framework.imagebase.a;
import com.kwai.framework.imagebase.b;
import com.kwai.framework.imagebase.c;
import com.kwai.framework.imagebase.interceptor.CdnHostInterceptor;
import y66.d;
import y66.c;
import y66.b;
import gg.a;
import z66.a;
import android.content.Context;
import gg.b;
import e0d.h;
import com.yxcorp.image.common.log.Log;
import java.lang.StringBuilder;
import com.yxcorp.image.network.c$c;
import vc.h$b;
import vc.h;
import p0d.j;
import e0d.g;
import com.yxcorp.image.fresco.wrapper.a;
import ed.v;
import ed.u$b;
import ed.u;
import ab.e;
import java.io.File;
import ab.h;
import ab.i;
import n0d.e;
import java.lang.Integer;
import yc.c;
import n0d.c;
import com.kwai.video.ksheifdec.KSHeifSoLoader;
import com.kwai.video.ksheifdec.KSHeifConfig;
import h0d.d;
import java.util.concurrent.Executor;
import n0d.d;
import com.yxcorp.image.common.log.Log$b;
import yc.c$a;
import com.kwai.video.ksheifdec.KpgImageFormat;
import com.kwai.video.ksheifdec.KpgImageFormatChecker;
import com.kwai.video.ksheifdec.HeifImageDecoder;
import com.facebook.imageformat.a;
import com.facebook.imageformat.a$a;
import yc.b;
import nc.a;
import n0d.a;
import j0d.b;
import ua.a$b;
import ua.a;
import f0d.b;
import f0d.a;
import ld.h;
import e0d.f;
import com.yxcorp.image.network.c;
import com.yxcorp.image.network.c$a;
import com.kuaishou.aegon.Aegon;
import java.util.Set;
import okhttp3.OkHttpClient$Builder;
import okhttp3.Interceptor;
import com.facebook.imagepipeline.producers.n;
import e0d.e;
import android.widget.ImageView;
import ukd.a;
import java.lang.IllegalArgumentException;

public class ImageManagerInitModule extends a	// class@000b57
{
    public static d q;

    static {
       if (PatchProxy.applyVoid(null, null, ImageManagerInitModule.class, "1")) {
       }else if(PatchProxy.applyVoid(null, null, c.class, "1")){
          ImageManagerInitModule.q = new b();
       }
    }
    public void ImageManagerInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public boolean H7(){
       return false;
    }
    public int f0(){
       return 18;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, ImageManagerInitModule.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{SwitchConfigInitModule.class,ABTestInitModule.class,CronetInitModule.class};
       return Lists.e(obj);
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, ImageManagerInitModule.class, "2")) {
          return;
       }
       c.c(d.b);
       return;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, ImageManagerInitModule.class, "3")) {
          return;
       }
       c.c(e.b);
       return;
    }
    public void n(){
       c uoc;
       d e;
       a objArray11;
       c$c objArray11;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ImageManagerInitModule.class, "5")) {
          return;
       }
       Application uApplication = a.b();
       a uoa = a.t();
       d uod = new d(uoa.c("kwaiImageConfig", ""));
       boolean b = false;
       uod.t = b;
       boolean b1 = (!SystemUtil.a(23) || (Runtime.getRuntime().maxMemory() >> 20) - 256 <= 0)? true: false;
       uod.r = b1;
       b1 = (b.u() > 0)? true: false;
       uod.A = b1;
       Boolean fALSE = Boolean.FALSE;
       Boolean value = uoa.getValue("imageDisableCDNResizeDefaultWebp", Boolean.TYPE, fALSE);
       d obj = PatchProxy.applyOneRefs(value, uod, d.class, "4");
       uod = (obj != patchProxyRe)? obj: value.booleanValue();
       uod.P = a.a;
       uod.R = b.a;
       uod.O = c.b;
       uod.T = ImageManagerInitModule.q;
       uod.U = new CdnHostInterceptor();
       uod.M = new d();
       uod.K = new c();
       uod.L = new b();
       if (!a.b()) {
          a.a(new a(uApplication));
       }
       h oh = h.class;
       if (!PatchProxy.applyVoidTwoRefs(uApplication, uod, objArray, oh, "9")) {
          h.a = uod;
          obj = uod.M;
          if (obj != null) {
             Log.a = obj;
          }
          Log.c("ImageManager", "config string from user : "+h.a.D);
          Log.c("ImageManager", "effective config with json format: "+uod);
          h$b uob = PatchProxy.applyTwoRefs(uApplication, uod, objArray, oh, "8");
          if (uob != patchProxyRe) {
          }else {
             uob = h.y(uApplication);
             j oj = new j();
             a.d = new g(oj);
             u$b uob1 = u.l();
             e.d(oj);
             uob1.b = oj;
             v ov = new v(uob1.a());
             h oh1 = i.a(uApplication.getApplicationContext().getFilesDir());
             d m = uod.M;
             d v = uod.v;
             d j = uod.J;
             d y = uod.y;
             e uoe = e.class;
             if (PatchProxy.isSupport(uoe)) {
                Object[] a$b objArray1 = new Object[]{ov,uApplication,m,Boolean.valueOf(v),Integer.valueOf(j),Boolean.valueOf(y)};
                uoc = PatchProxy.apply(objArray1, null, uoe, "1");
                if (uoc != patchProxyRe) {
                label_01ae :
                   objArray1 = a.c(uApplication);
                   objArray1.b(oh1);
                   objArray1.c(true);
                   e = uod.e;
                   if (e > null) {
                      objArray1.d(((long)e * 0x100000));
                   }
                   objArray11 = objArray1.a();
                   a$b uob2 = a.c(uApplication);
                   uob2.b(oh1);
                   uob2.c(true);
                   d f = uod.f;
                   if (f > null) {
                      uob2.d(((long)f * 0x100000));
                   }
                   uob.e = new b();
                   uob.y = uob2.a();
                   uob.o = objArray11;
                   objArray11 = new a(uApplication);
                   objArray11.c = uod.p;
                   objArray11.d = uod.q;
                   e.d(objArray11);
                   uob.b = objArray11;
                   uob.t = ov;
                   uob.i = h.d();
                   uob.A = uoc;
                   uob.l = new h(2048);
                   uob.n = new f(uod);
                   uob.b(true);
                   Object[] objArray2 = null;
                   objArray11 = PatchProxy.apply(objArray2, objArray2, c.class, "1");
                   if (objArray11 != patchProxyRe) {
                   }else {
                      objArray11 = new c$c(objArray2);
                   }
                   b = (uod.z != null && Aegon.f())? true: false;
                   objArray11.f = b;
                   objArray11.b = uod.a;
                   objArray11.c = uod.b;
                   objArray11.d = uod.c;
                   d t = uod.T;
                   if (t != null) {
                      if (PatchProxy.applyOneRefs(t, objArray11, c$c.class, "1") != patchProxyRe) {
                      }else {
                         objArray11.a.add(t);
                      }
                   }
                   OkHttpClient$Builder uBuilder = new OkHttpClient$Builder();
                   e = uod.U;
                   if (e != null) {
                      uBuilder.addInterceptor(e);
                   }
                   objArray11.e = uBuilder;
                   uoc = PatchProxy.apply(null, objArray11, c$c.class, "2");
                   if (uoc != patchProxyRe) {
                   }else {
                      uoc = new c(objArray11);
                   }
                   uob.c(uoc);
                }
             }
             KSHeifConfig.setKSHeifSoLoader(new c(uApplication));
             h.d().f().execute(new d(v, j, m));
             c$a uoa1 = c.a();
             objArray11 = KpgImageFormat.KPG;
             uoa1.a(objArray11, new KpgImageFormatChecker(), new HeifImageDecoder(ov, objArray11));
             uoa1.c(a.k, new a(ov));
             uoa1.c(a.b, new b(y));
             uoc = uoa1.b();
             goto label_01ae ;
          }
          if (uob != null) {
             h.b.a(uApplication, uod, uob);
          }else {
             throw new IllegalArgumentException("ImagePipelineConfig.Builder must not be null!!!");
          }
       }
       try{
          Boolean tRUE = Boolean.TRUE;
          a.p(ImageView.class, "sCompatDone", tRUE);
          a.p(ImageView.class, "sCompatUseCorrectStreamDensity", fALSE);
          a.p(ImageView.class, "sCompatDrawableVisibilityDispatch", tRUE);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public int priority(){
       return 0;
    }
}
