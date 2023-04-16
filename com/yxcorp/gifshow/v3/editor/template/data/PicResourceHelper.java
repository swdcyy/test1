package com.yxcorp.gifshow.v3.editor.template.data.PicResourceHelper;
import com.yxcorp.gifshow.v3.editor.template.data.PicResourceHelper$dirFile$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateInfo;
import eb7.a;
import asd.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.template.data.PicResourceHelper$downloadPicTemplate$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import kotlin.coroutines.CoroutineContext;
import lnc.u7;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import qrd.l1;
import android.app.Application;
import o56.a;
import kotlin.jvm.internal.a;
import android.content.Context;
import wkd.b;
import c0d.a;
import ftd.l;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import ztc.p;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.io.File;
import ztc.k;
import java.util.concurrent.atomic.AtomicBoolean;
import ztc.j;
import ftd.k;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import gb7.c;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper;
import com.yxcorp.gifshow.v3.editor.template.data.PicResourceHelper$downloadPicTemplate$$inlined$suspendCancellableCoroutine$lambda$2;
import msd.l;
import dsd.e;
import isd.h;
import isd.l;
import java.util.Iterator;
import wsd.m;
import java.lang.Boolean;

public final class PicResourceHelper	// class@001322
{
    public static final p a;
    public static final PicResourceHelper b;

    static {
       PicResourceHelper.b = new PicResourceHelper();
       PicResourceHelper.a = s.c(PicResourceHelper$dirFile$2.INSTANCE);
    }
    public void PicResourceHelper(){
       super();
    }
    public final Object a(PicTemplateInfo p0,a p1,c p2){
       PicResourceHelper$downloadPicTemplate$1 l$1;
       PicResourceHelper$downloadPicTemplate$1 l$0;
       l1 a;
       a uoa;
       PicResourceHelper$downloadPicTemplate$1 obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PicResourceHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p2 instanceof PicResourceHelper$downloadPicTemplate$1) {
          obj = p2;
          PicResourceHelper$downloadPicTemplate$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj.label = label - i;
          label_0029 :
             PicResourceHelper$downloadPicTemplate$1 result = obj.result;
             Object obj1 = b.h();
             PicResourceHelper$downloadPicTemplate$1 label1 = obj.label;
             Ref$ObjectRef int i1 = 2;
             int i2 = 1;
             if (label1 != null) {
                if (label1 != i2) {
                   if (label1 == i1) {
                      j0.n(result);
                   label_0132 :
                      return result;
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   l$1 = obj.L$1;
                   l$0 = obj.L$0;
                   j0.n(result);
                }
             }else {
                j0.n(result);
                if (this.d(p0)) {
                   float f = 100.00f;
                   obj.L$0 = this;
                   obj.L$1 = p0;
                   obj.L$2 = p1;
                   obj.label = i2;
                   u7 ou7 = obj.getContext().get(u7.h);
                   if (ou7 != null) {
                      ou7.v(f);
                      a = l1.a;
                   }else {
                      a = null;
                   }
                   if (a != b.h()) {
                      a = l1.a;
                   }
                   if (a == obj1) {
                      return obj1;
                   }else {
                      l$0 = this;
                   }
                }else if(p1 != null){
                   uoa = p1;
                }else {
                   Application uApplication = a.b();
                   a.o(uApplication, "AppEnv.getAppContext\(\)");
                   Context applicationC = uApplication.getApplicationContext();
                   a.o(applicationC, "AppEnv.getAppContext\(\).applicationContext");
                   uoa = new a(applicationC, b.a(0x1a7467ca));
                }
                obj.L$0 = this;
                obj.L$1 = p0;
                obj.L$2 = p1;
                obj.L$3 = uoa;
                obj.label = i1;
                l ol = new l(IntrinsicsKt__IntrinsicsJvmKt.d(obj), i2);
                ol.u();
                p op = new p(p0);
                i1 = new Ref$ObjectRef();
                i1.element = op.getId();
                File uFile = new File(PicResourceHelper.b.b(), k.a(p0));
                if (uFile.exists()) {
                   uFile.delete();
                }
                j oj = new j(ol, new AtomicBoolean(false), i1, uoa, p0);
                uoa.d(op, uFile);
                ol.w(new PicResourceHelper$downloadPicTemplate$$inlined$suspendCancellableCoroutine$lambda$2(i1, uoa, p0));
                result = ol.r();
                if (result == b.h()) {
                   e.c(obj);
                }
                if (result == obj1) {
                   return obj1;
                }else {
                   goto label_0132 ;
                }
             }
             String str = l$0.c(l$1);
             if (str == null) {
                str = "";
             }
             return str;
          }
       }
       obj = new PicResourceHelper$downloadPicTemplate$1(this, p2);
       goto label_0029 ;
    }
    public final File b(){
       Object obj = PatchProxy.apply(null, this, PicResourceHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PicResourceHelper.a.getValue();
    }
    public final String c(PicTemplateInfo p0){
       File obj = PatchProxy.applyOneRefs(p0, this, PicResourceHelper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "picTemplateInfo");
       obj = new File(this.b(), k.a(p0));
       if (k.b(obj)) {
          return obj.getAbsolutePath();
       }
       Iterator iterator = l.M(obj).iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          obj = iterator.next();
          if (k.b(obj)) {
             break ;
          }
       }
       return obj.getAbsolutePath();
    }
    public final boolean d(PicTemplateInfo p0){
       File obj = PatchProxy.applyOneRefs(p0, this, PicResourceHelper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "picTemplateInfo");
       obj = new File(this.b(), k.a(p0));
       boolean b = false;
       if (obj.exists() && obj.isDirectory()) {
          File[] uFileArray = obj.listFiles();
          if (uFileArray != null) {
             int i = (!uFileArray.length)? 1: 0;
             if ((i ^ 1) == 1) {
                b = true;
             }
          }
       }
       return b;
    }
}
