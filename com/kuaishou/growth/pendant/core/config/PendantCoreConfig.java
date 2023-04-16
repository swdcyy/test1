package com.kuaishou.growth.pendant.core.config.PendantCoreConfig;
import com.kuaishou.growth.pendant.core.config.PendantCoreConfig$disablePendantShowByGRVideo$2;
import msd.a;
import qrd.p;
import qrd.s;
import o56.a;
import com.yxcorp.utility.SystemUtil;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vqa.s;
import vqa.k;
import java.lang.Integer;
import java.lang.CharSequence;
import zsd.u;
import vsd.d;
import nsd.m0;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;
import java.lang.NullPointerException;
import java.lang.Long;
import java.lang.Float;
import java.lang.Number;

public final class PendantCoreConfig	// class@000640
{
    public static int a = 0;
    public static String b = "";
    public static boolean c;
    public static final p d;
    public static boolean e;
    public static boolean f;
    public static boolean g;
    public static final boolean h;
    public static final PendantCoreConfig i;

    static {
       PendantCoreConfig.i = new PendantCoreConfig();
       PendantCoreConfig.d = s.c(PendantCoreConfig$disablePendantShowByGRVideo$2.INSTANCE);
       boolean b = true;
       PendantCoreConfig.e = b;
       boolean b1 = (a.d() && SystemUtil.K())? true: false;
       PendantCoreConfig.g = b1;
       if (!a.d() || !SystemUtil.K()) {
          b = false;
       }
       PendantCoreConfig.h = b;
       PendantCoreConfig.a();
    }
    public void PendantCoreConfig(){
       super();
    }
    public static final void a(){
       k b;
       String str1;
       Integer integer;
       String str2;
       String str3;
       Boolean fALSE;
       int i1;
       Boolean uBoolean;
       long l;
       float f;
       Object[] objArray1;
       int b1;
       int intx;
       String str4;
       long longx;
       float floatx;
       Object[] objArray2;
       Integer integer1;
       Integer integer2;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, PendantCoreConfig.class, "3")) {
          return;
       }
       try{
          String str = String.class;
          if (!PatchProxy.applyVoid(objArray, objArray, s.class, "1")) {
             try{
                b = k.b;
                str1 = "KEY_PENDANT_TK_CONFIG";
                int i = 0;
                integer = Integer.valueOf(i);
                str2 = "";
                if (!u.S1(str1)) {
                   d uod = m0.d(integer.getClass());
                   if (a.g(uod, m0.d(Boolean.TYPE))) {
                      objArray2 = (!integer instanceof Boolean)? objArray: integer;
                      boolean b2 = (objArray2 != null)? objArray2.booleanValue(): false;
                      integer1 = Boolean.valueOf(b.a().getBoolean(str1, b2));
                   }else if(a.g(uod, m0.d(str))){
                      objArray2 = (!integer instanceof String)? objArray: integer;
                      if (objArray2 == null) {
                         String str5 = str2;
                      }
                      integer1 = b.a().getString(str1, objArray2);
                      str1 = (integer1 == null || !integer1.length())? 1: null;
                      if (!str1) {
                         if (integer1 != null) {
                         }else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                         }
                      }
                   }else if(a.g(uod, m0.d(Integer.TYPE))){
                      intx = b.a().getInt(str1, integer.intValue());
                      if (intx != Integer.MIN_VALUE) {
                         integer = Integer.valueOf(intx);
                      }
                   }else if(a.g(uod, m0.d(Long.TYPE))){
                      objArray2 = (!integer instanceof Long)? objArray: integer;
                      long l2 = (objArray2 != null)? objArray2.longValue(): Long.MIN_VALUE;
                      longx = b.a().getLong(str1, l2);
                      if (longx - Long.MIN_VALUE) {
                         integer1 = Long.valueOf(longx);
                      }
                   }else if(a.g(uod, m0.d(Float.TYPE))){
                      objArray2 = (!integer instanceof Float)? objArray: integer;
                      float f2 = (objArray2 != null)? objArray2.floatValue(): Float.MIN_VALUE;
                      floatx = b.a().getFloat(str1, f2);
                      if (floatx - 1) {
                         integer1 = Float.valueOf(floatx);
                      }
                   }
                   integer = integer1;
                }
             }catch(java.lang.Exception e0){
             }
          label_0126 :
             PendantCoreConfig.a = integer.intValue();
             b = k.b;
             str1 = "KEY_PENDANT_DEMOTE_LEVEL";
             if (!u.S1(str1)) {
                try{
                   d uod1 = m0.d(str2.getClass());
                   if (a.g(uod1, m0.d(Boolean.TYPE))) {
                      objArray1 = (!str2 instanceof Boolean)? objArray: str2;
                      b1 = (objArray1 != null)? objArray1.booleanValue(): false;
                      str3 = Boolean.valueOf(b.a().getBoolean(str1, b1));
                   }else if(a.g(uod1, m0.d(str))){
                      str3 = b.a().getString(str1, str2);
                      str1 = (str3 == null || !str3.length())? 1: null;
                      if (!str1) {
                         if (str3 != null) {
                         }else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                         }
                      }
                   }else if(a.g(uod1, m0.d(Integer.TYPE))){
                      objArray1 = (!str2 instanceof Integer)? objArray: str2;
                      b1 = (objArray1 != null)? objArray1.intValue(): Integer.MIN_VALUE;
                      intx = b.a().getInt(str1, b1);
                      if (intx != Integer.MIN_VALUE) {
                         str3 = Integer.valueOf(intx);
                      }
                   }else if(a.g(uod1, m0.d(Long.TYPE))){
                      objArray1 = (!str2 instanceof Long)? objArray: str2;
                      long l1 = (objArray1 != null)? objArray1.longValue(): Long.MIN_VALUE;
                      longx = b.a().getLong(str1, l1);
                      if (longx - Long.MIN_VALUE) {
                         str3 = Long.valueOf(longx);
                      }
                   }else if(a.g(uod1, m0.d(Float.TYPE))){
                      objArray1 = (!str2 instanceof Float)? objArray: str2;
                      float f1 = (objArray1 != null)? objArray1.floatValue(): Float.MIN_VALUE;
                      floatx = b.a().getFloat(str1, f1);
                      if (floatx - 1) {
                         str3 = Float.valueOf(floatx);
                      }
                   }
                }catch(java.lang.Exception e0){
                }
             }
             str3 = str2;
          }
       }catch(java.lang.Exception e0){
       }
       return;
    }
    public final boolean b(){
       return PendantCoreConfig.e;
    }
    public final boolean c(){
       return PendantCoreConfig.f;
    }
    public final boolean d(){
       return PendantCoreConfig.h;
    }
}
