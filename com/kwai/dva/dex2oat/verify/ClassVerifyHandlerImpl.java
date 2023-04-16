package com.kwai.dva.dex2oat.verify.ClassVerifyHandlerImpl;
import cj5.a;
import com.kwai.dva.dex2oat.verify.ClassVerifyHandlerImpl$a;
import nsd.u;
import java.lang.String;
import java.lang.System;
import java.lang.Object;
import kotlin.jvm.internal.a;
import cj5.a$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.os.Build$VERSION;
import java.lang.CharSequence;

public final class ClassVerifyHandlerImpl implements a	// class@000d25
{
    public static final ClassVerifyHandlerImpl$a a;
    public static String b;
    public static boolean c;

    static {
       ClassVerifyHandlerImpl.a = new ClassVerifyHandlerImpl$a(null);
       ClassVerifyHandlerImpl.b = "";
       System.loadLibrary("dva-dex2oat");
    }
    public void ClassVerifyHandlerImpl(){
       super();
    }
    public static native final String disableClassVerify(int p0,int p1);
    public a$a a(int p0){
       a$a obj;
       ClassVerifyHandlerImpl uClassVerify = ClassVerifyHandlerImpl.class;
       if (PatchProxy.isSupport(uClassVerify)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uClassVerify, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       boolean b = false;
       if (ClassVerifyHandlerImpl.c) {
          return new a$a(b, ClassVerifyHandlerImpl.b);
       }else {
          String str = ClassVerifyHandlerImpl.a.a(Build$VERSION.SDK_INT, p0);
          boolean b1 = true;
          if (str != null) {
             int i = (!str.length())? 1: 0;
             if (!i) {
                obj = new a$a(b, str);
             label_004b :
                return obj;
             }
          }
          obj = new a$a(b1, null, 2, null);
          goto label_004b ;
       }
    }
}
