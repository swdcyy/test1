package com.yxcorp.gifshow.upload.t1;
import erd.g;
import com.yxcorp.gifshow.upload.r1$b;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.String;
import zb6.a;
import com.yxcorp.gifshow.upload.r1;
import java.util.Objects;
import com.yxcorp.gifshow.upload.o1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import com.yxcorp.utility.Log;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import java.io.File;
import com.yxcorp.retrofit.model.RetrofitException;
import com.yxcorp.retrofit.model.KwaiException;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import java.lang.System;
import dnc.e2;
import java.lang.Runnable;
import t45.c;

public final class t1 implements g	// class@001eac
{
    public final r1$b b;

    public void t1(r1$b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r1 a;
       boolean b2;
       t1 b = this.b;
       Throwable throwable = p0;
       if (b.b.isNeedFallback()) {
       }else {
          String str = a.d(throwable);
          String str1 = a.c(throwable);
          a = b.o.a;
          r1$b e = b.e;
          r1$b b1 = b.b;
          r1$b c = b.c;
          Objects.requireNonNull(a);
          o1 oo1 = o1.class;
          int i = 5;
          int i1 = 3;
          int i2 = 2;
          int i3 = 4;
          int i4 = 0;
          int i5 = 1;
          if (PatchProxy.isSupport(oo1)) {
             Object[] objArray = new Object[]{throwable,str,str1,Long.valueOf(e),b1,Boolean.valueOf(c)};
             if (!PatchProxy.applyVoid(objArray, a, oo1, "30")) {
             }
          }else if(o1.e(b1)){
             ClientEvent$ResultPackage obj = PatchProxy.applyOneRefs(b1, null, oo1, "32");
             if (obj != PatchProxyResult.class) {
                b2 = obj.booleanValue();
             }else if(b1 != null && (b1.getKtvInfo() != null && b1.getKtvInfo().isSinglePicSongMode())){
                b2 = true;
             }else {
                b2 = false;
             }
             if (b2) {
             label_0089 :
                if (c != null) {
                   a.l(str1, str, e, b1);
                }else if(PatchProxy.isSupport(oo1)){
                   Object[] objArray1 = new Object[i];
                   objArray1[i4] = str1;
                   objArray1[i5] = str;
                   objArray1[i2] = Long.valueOf(e);
                   objArray1[i1] = b1;
                   objArray1[4] = throwable;
                   if (!PatchProxy.applyVoid(objArray1, a, oo1, "10")) {
                   }
                }else if(o1.e(b1)){
                   String str2 = Log.f(throwable);
                   if (TextUtils.x(str2)) {
                      str2 = (throwable.getCause() != null)? throwable.getCause().getMessage(): "";
                   }
                label_00d9 :
                   str2 = throwable.getClass().getName()+":"+str2;
                   long l = new File(b1.getFilePath()).length();
                   float f = (float)l * b1.getProgress();
                   if (throwable instanceof RetrofitException) {
                      throwable = throwable.getCause();
                   }else if(throwable instanceof KwaiException){
                      str2 = throwable.getErrorCode()+" "+str2;
                   }
                   obj = new ClientEvent$ResultPackage();
                   obj.domain = i1;
                   obj.timeCost = System.currentTimeMillis() - e;
                   obj.message = TextUtils.k(str2);
                   if (throwable instanceof KwaiException) {
                      i4 = throwable.getErrorCode();
                   }
                   obj.code = i4;
                   e2 uoe2 = new e2(a, b1, str1, str, l, f, obj);
                   c.a(str2);
                }
             }
          }else {
             goto label_0089 ;
          }
       }
    label_015f :
       return;
    }
}
