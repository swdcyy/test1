package com.kwai.dva.dex2oat.switch.Dex2OatSwitcherImpl;
import bj5.a;
import com.kwai.dva.dex2oat.switch.Dex2OatSwitcherImpl$a;
import nsd.u;
import java.lang.String;
import java.lang.System;
import java.lang.Object;
import kotlin.jvm.internal.a;
import bj5.a$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Build$VERSION;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.CharSequence;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import java.util.Collection;

public final class Dex2OatSwitcherImpl implements a	// class@000d1b
{
    public static final Dex2OatSwitcherImpl$a b;
    public static boolean c;
    public static String d;
    public static boolean e;

    static {
       Dex2OatSwitcherImpl.b = new Dex2OatSwitcherImpl$a(null);
       Dex2OatSwitcherImpl.d = "";
       System.loadLibrary("dva-dex2oat");
    }
    public void Dex2OatSwitcherImpl(){
       super();
    }
    public static native final String disableDex2Oat(int p0);
    public static native final String restoreDex2Oat(int p0);
    public static native final void setDebugModel(boolean p0);
    public a$b a(){
       a$b obj = PatchProxy.apply(null, this, Dex2OatSwitcherImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 13;
       if (Dex2OatSwitcherImpl.e) {
          return new a$b(i, Dex2OatSwitcherImpl.d);
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT > 28) {
          return new a$b(i, a.C("sdkVersion invalid, ", Integer.valueOf(sDK_INT)));
       }
       obj = this.e(Dex2OatSwitcherImpl.b.a(sDK_INT));
       if (obj.b() == 10) {
          Dex2OatSwitcherImpl.c = true;
       }
       return obj;
    }
    public a$b b(){
       a$b obj = PatchProxy.apply(null, this, Dex2OatSwitcherImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 13;
       if (Dex2OatSwitcherImpl.e) {
          return new a$b(i, Dex2OatSwitcherImpl.d);
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT > 28) {
          return new a$b(i, a.C("sdkVersion invalid, ", Integer.valueOf(sDK_INT)));
       }
       obj = this.e(Dex2OatSwitcherImpl.b.b(sDK_INT));
       if (obj.b() == 10) {
          Dex2OatSwitcherImpl.c = false;
       }
       return obj;
    }
    public boolean c(){
       return Dex2OatSwitcherImpl.c;
    }
    public void d(boolean p0){
       Dex2OatSwitcherImpl uDex2OatSwit = Dex2OatSwitcherImpl.class;
       if (PatchProxy.isSupport(uDex2OatSwit) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uDex2OatSwit, "3")) {
          return;
       }
       if (!Dex2OatSwitcherImpl.e) {
          Dex2OatSwitcherImpl$a b = Dex2OatSwitcherImpl.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.isSupport(Dex2OatSwitcherImpl$a.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), b, Dex2OatSwitcherImpl$a.class, "3")) {
             Dex2OatSwitcherImpl.setDebugModel(p0);
          }
       }
       return;
    }
    public final a$b e(String p0){
       a$b uob1;
       String str = "statusCode error: ";
       Object obj = PatchProxy.applyOneRefs(p0, this, Dex2OatSwitcherImpl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 13;
       if (p0 != null) {
          String str1 = (!p0.length())? 1: null;
          if (!str1) {
             String[] stringArray = new String[]{"&"};
             String[] stringArray1 = new String[0];
             Object[] objArray = StringsKt__StringsKt.H4(p0, stringArray, false, 0, 6, null).toArray(stringArray1);
             Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
             int i1 = (!objArray.length)? 1: 0;
             if (i1) {
                return new a$b(i, p0);
             }else {
                try{
                   object oobject = objArray[0];
                   i1 = oobject.length() - 1;
                   int i2 = 0;
                   int i3 = 0;
                   while (true) {
                      if (i2 <= i1) {
                         int i4 = (!i3)? i2: i1;
                         i4 = (a.t(oobject.charAt(i4), 32) <= 0)? 1: 0;
                         if (!i3) {
                            if (!i4) {
                               i3 = 1;
                            }else {
                               i2 = i2 + 1;
                            }
                         }else if(!i4){
                         label_007c :
                            int i5 = Integer.parseInt(oobject.subSequence(i2, (i1 + 1)).toString());
                            i2 = 10;
                            if (i5 == i2) {
                               a$b uob = (objArray.length < 2)? new a$b(i2, ""): new a$b(i2, objArray[1]);
                               return uob;
                            }else if(i5 != 11 && i5 != 12){
                               return new a$b(i, a.C(str, objArray[0]));
                            }else if(objArray.length < 2){
                               uob1 = new a$b(i5, "errMsg=null");
                               break ;
                            }else {
                               uob1 = new a$b(i5, objArray[1]);
                               break ;
                            }
                         }else {
                            i1 = i1 - 1;
                         }
                      }else {
                         goto label_007c ;
                      }
                   }
                   return uob1;
                }catch(java.lang.Exception e0){
                   return new a$b(i, a.C(e0, objArray[0]));
                }
             }
          }
       }
       return new a$b(i, "null");
    }
}
