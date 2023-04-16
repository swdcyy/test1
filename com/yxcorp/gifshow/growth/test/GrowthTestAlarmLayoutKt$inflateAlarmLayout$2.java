package com.yxcorp.gifshow.growth.test.GrowthTestAlarmLayoutKt$inflateAlarmLayout$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import vqa.k;
import java.lang.CharSequence;
import zsd.u;
import vsd.d;
import nsd.m0;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;
import pna.k;
import java.lang.NullPointerException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import java.lang.Number;
import com.yxcorp.utility.alarm.KwaiAlarm$Builder;
import com.yxcorp.utility.alarm.KwaiAlarm;
import android.app.Activity;

public final class GrowthTestAlarmLayoutKt$inflateAlarmLayout$2 extends Lambda implements a	// class@0014d8
{
    public final int $DEFAULT_HOUR;
    public final String $DEFAULT_ID;
    public final int $DEFAULT_LENGTH;
    public final int $DEFAULT_MINUTE;
    public final String $DEFAULT_NAME;
    public final String[] $weekKeys;

    public void GrowthTestAlarmLayoutKt$inflateAlarmLayout$2(String p0,String p1,int p2,int p3,int p4,String[] p5){
       this.$DEFAULT_ID = p0;
       this.$DEFAULT_NAME = p1;
       this.$DEFAULT_HOUR = p2;
       this.$DEFAULT_MINUTE = p3;
       this.$DEFAULT_LENGTH = p4;
       this.$weekKeys = p5;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       int i1;
       KwaiAlarm$Builder uBuilder;
       int len;
       int i3;
       object oobject;
       boolean b2;
       int i4;
       int[] ointArray;
       String str4;
       boolean b3;
       boolean i5;
       Boolean uBoolean;
       Long longx;
       long l;
       float floatx;
       d uod2;
       String str5;
       String str6;
       String str7;
       Integer integer4;
       Long longx1;
       long l1;
       Float uFloat1;
       float f1;
       float floatx1;
       Boolean uBoolean2;
       Integer integer5;
       long l2;
       Integer integer6;
       d uod4;
       k ok1;
       Object[] objArray1;
       int b4;
       GrowthTestAlarmLayoutKt$inflateAlarmLayout$2 oinflateAlar1;
       k ok2;
       Object[] objArray3;
       Object obj = this;
       String str = String.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, GrowthTestAlarmLayoutKt$inflateAlarmLayout$2.class, "1")) {
          return;
       }
       try{
          k b = k.b;
          String str1 = "KEY_ALARM_ID";
          GrowthTestAlarmLayoutKt$inflateAlarmLayout$2 $DEFAULT_ID = obj.$DEFAULT_ID;
          String str2 = "null cannot be cast to non-null type kotlin.String";
          GrowthTestAlarmLayoutKt$inflateAlarmLayout$2 oinflateAlar = Integer.MIN_VALUE;
          int i = 1;
          k ok = Long.MIN_VALUE;
          if (!u.S1(str1)) {
             uod2 = ($DEFAULT_ID != null)? m0.d($DEFAULT_ID.getClass()): m0.d(str);
             if (a.g(uod2, m0.d(Boolean.TYPE))) {
                objArray3 = (!$DEFAULT_ID instanceof Boolean)? objArray: $DEFAULT_ID;
                i3 = (objArray3 != null)? objArray3.booleanValue(): false;
                str6 = Boolean.valueOf(b.a().getBoolean(str1, i3));
             }else if(a.g(uod2, m0.d(str))){
                objArray3 = (!$DEFAULT_ID instanceof String)? objArray: $DEFAULT_ID;
                if (objArray3 == null) {
                   str5 = "";
                }
                str6 = b.a().getString(str1, objArray3);
                str1 = (str6 == null || !str6.length())? 1: null;
                if (!str1) {
                   if (str6 == null) {
                      throw new NullPointerException(str2);
                   }
                }
             }else if(a.g(uod2, m0.d(Integer.TYPE))){
                objArray3 = (!$DEFAULT_ID instanceof Integer)? objArray: $DEFAULT_ID;
                i3 = (objArray3 != null)? objArray3.intValue(): Integer.MIN_VALUE;
                i1 = b.a().getInt(str1, i3);
                if (i1 != oinflateAlar) {
                   str6 = Integer.valueOf(i1);
                }
             }else if(a.g(uod2, m0.d(Long.TYPE))){
                objArray3 = (!$DEFAULT_ID instanceof Long)? objArray: $DEFAULT_ID;
                l = (objArray3 != null)? objArray3.longValue(): ok;
                l = b.a().getLong(str1, l);
                if (l - ok) {
                   str6 = Long.valueOf(l);
                }
             }else if(a.g(uod2, m0.d(Float.TYPE))){
                objArray3 = (!$DEFAULT_ID instanceof Float)? objArray: $DEFAULT_ID;
                f1 = (objArray3 != null)? objArray3.floatValue(): Float.MIN_VALUE;
                floatx1 = b.a().getFloat(str1, f1);
                if (floatx1 - i) {
                   str6 = Float.valueOf(floatx1);
                }
             }
             str7 = str6;
          }
          try{
          label_012a :
             b = k.b;
             str1 = "KEY_ALARM_NAME";
             GrowthTestAlarmLayoutKt$inflateAlarmLayout$2 $DEFAULT_NAM = obj.$DEFAULT_NAME;
             if (!u.S1(str1)) {
                uod4 = ($DEFAULT_NAM != null)? m0.d($DEFAULT_NAM.getClass()): m0.d(str);
                if (a.g(uod4, m0.d(Boolean.TYPE))) {
                   objArray1 = (!$DEFAULT_NAM instanceof Boolean)? objArray: $DEFAULT_NAM;
                   b4 = (objArray1 != null)? objArray1.booleanValue(): false;
                   str6 = Boolean.valueOf(b.a().getBoolean(str1, b4));
                }else if(a.g(uod4, m0.d(str))){
                   Object[] objArray2 = (!$DEFAULT_NAM instanceof String)? objArray: $DEFAULT_NAM;
                   if (objArray2 == null) {
                      objArray2 = "";
                   }
                   str6 = b.a().getString(str1, objArray2);
                   str1 = (str6 == null || !str6.length())? 1: null;
                   if (!str1) {
                      if (str6 == null) {
                         throw new NullPointerException(str2);
                      }
                   }
                }else if(a.g(uod4, m0.d(Integer.TYPE))){
                   objArray1 = (!$DEFAULT_NAM instanceof Integer)? objArray: $DEFAULT_NAM;
                   b4 = (objArray1 != null)? objArray1.intValue(): Integer.MIN_VALUE;
                   i1 = b.a().getInt(str1, b4);
                   if (i1 != oinflateAlar) {
                      str6 = Integer.valueOf(i1);
                   }
                }else if(a.g(uod4, m0.d(Long.TYPE))){
                   objArray1 = (!$DEFAULT_NAM instanceof Long)? objArray: $DEFAULT_NAM;
                   l = (objArray1 != null)? objArray1.longValue(): ok;
                   l = b.a().getLong(str1, l);
                   if (l - ok) {
                      str6 = Long.valueOf(l);
                   }
                }else if(a.g(uod4, m0.d(Float.TYPE))){
                   objArray1 = (!$DEFAULT_NAM instanceof Float)? objArray: $DEFAULT_NAM;
                   float f3 = (objArray1 != null)? objArray1.floatValue(): Float.MIN_VALUE;
                   floatx1 = b.a().getFloat(str1, f3);
                   if (floatx1 - i) {
                      str6 = Float.valueOf(floatx1);
                   }
                }
                str5 = str6;
             }
             try{
             label_023a :
                b = k.b;
                str1 = "KEY_ALARM_HOUR";
                Integer integer = Integer.valueOf(obj.$DEFAULT_HOUR);
                String str3 = "null cannot be cast to non-null type kotlin.Int";
                if (!u.S1(str1)) {
                   uod4 = m0.d(integer.getClass());
                   if (a.g(uod4, m0.d(Boolean.TYPE))) {
                      uBoolean = (!integer instanceof Boolean)? null: integer;
                      i5 = (uBoolean != null)? uBoolean.booleanValue(): false;
                      integer5 = Boolean.valueOf(b.a().getBoolean(str1, i5));
                   }else if(a.g(uod4, m0.d(str))){
                      str4 = (!integer instanceof String)? null: integer;
                      if (str4 == null) {
                         str4 = "";
                      }
                      str6 = b.a().getString(str1, str4);
                      d uod1 = (str6 == null || !str6.length())? 1: null;
                      if (!uod1) {
                         if (str6 != null) {
                         }else {
                            throw new NullPointerException(str3);
                         }
                      }
                   }else if(a.g(uod4, m0.d(Integer.TYPE))){
                      i1 = b.a().getInt(str1, integer.intValue());
                      if (i1 != oinflateAlar) {
                         integer = Integer.valueOf(i1);
                      }
                   }else if(a.g(uod4, m0.d(Long.TYPE))){
                      longx = (!integer instanceof Long)? null: integer;
                      l2 = (longx != null)? longx.longValue(): ok;
                      l2 = b.a().getLong(str1, l2);
                      if (l2 - ok) {
                         integer5 = Long.valueOf(l2);
                      }
                   }else if(a.g(uod4, m0.d(Float.TYPE))){
                      Float uFloat3 = (!integer instanceof Float)? null: integer;
                      float f2 = (uFloat3 != null)? uFloat3.floatValue(): Float.MIN_VALUE;
                      floatx1 = b.a().getFloat(str1, f2);
                      if (floatx1 - i) {
                         integer5 = Float.valueOf(floatx1);
                      }
                   }
                   integer = integer5;
                }
                try{
                label_0340 :
                   i1 = integer.intValue();
                   k b1 = k.b;
                   str2 = "KEY_ALARM_MINUTE";
                   Integer integer1 = Integer.valueOf(obj.$DEFAULT_MINUTE);
                   if (!u.S1(str2)) {
                      d uod3 = m0.d(integer1.getClass());
                      if (a.g(uod3, m0.d(Boolean.TYPE))) {
                         Boolean uBoolean3 = (!integer1 instanceof Boolean)? null: integer1;
                         b3 = (uBoolean3 != null)? uBoolean3.booleanValue(): false;
                         integer6 = Boolean.valueOf(b1.a().getBoolean(str2, b3));
                      }else if(a.g(uod3, m0.d(str))){
                         String str8 = (!integer1 instanceof String)? null: integer1;
                         if (str8 == null) {
                            str8 = "";
                         }
                         integer6 = b1.a().getString(str2, str8);
                         uBuilder = (integer6 == null || !integer6.length())? 1: null;
                         if (!uBuilder) {
                            if (integer6 != null) {
                            }else {
                               throw new NullPointerException(str3);
                            }
                         }
                      }else if(a.g(uod3, m0.d(Integer.TYPE))){
                         len = b1.a().getInt(str2, integer1.intValue());
                         if (len != Integer.MIN_VALUE) {
                            integer1 = Integer.valueOf(len);
                         }
                      }else if(a.g(uod3, m0.d(Long.TYPE))){
                         Long longx2 = (!integer1 instanceof Long)? null: integer1;
                         long l3 = (longx2 != null)? longx2.longValue(): ok;
                         l1 = b1.a().getLong(str2, l3);
                         if (l1 - Long.MIN_VALUE) {
                            integer6 = Long.valueOf(l1);
                         }
                      }else if(a.g(uod3, m0.d(Float.TYPE))){
                         Float uFloat2 = (!integer1 instanceof Float)? null: integer1;
                         floatx = (uFloat2 != null)? uFloat2.floatValue(): Float.MIN_VALUE;
                         float floatx2 = b1.a().getFloat(str2, floatx);
                         if (floatx2 - 1) {
                            integer6 = Float.valueOf(floatx2);
                         }
                      }
                      integer1 = integer6;
                   }
                   try{
                   label_044d :
                      uBuilder = new KwaiAlarm$Builder($DEFAULT_ID, $DEFAULT_NAM, i1, integer1.intValue());
                      b = k.b;
                      str1 = "KEY_ALARM_LENGTH";
                      Integer integer2 = Integer.valueOf(obj.$DEFAULT_LENGTH);
                      if (!u.S1(str1)) {
                         uod2 = m0.d(integer2.getClass());
                         if (a.g(uod2, m0.d(Boolean.TYPE))) {
                            Boolean uBoolean1 = (!integer2 instanceof Boolean)? null: integer2;
                            i3 = (uBoolean1 != null)? uBoolean1.booleanValue(): false;
                            integer5 = Boolean.valueOf(b.a().getBoolean(str1, i3));
                         }else if(a.g(uod2, m0.d(str))){
                            str5 = (!integer2 instanceof String)? null: integer2;
                            if (str5 == null) {
                               str5 = "";
                            }
                            integer5 = b.a().getString(str1, str5);
                            str1 = (integer5 == null || !integer5.length())? 1: null;
                            if (!str1) {
                               if (integer5 != null) {
                               }else {
                                  throw new NullPointerException(str3);
                               }
                            }
                         }else if(a.g(uod2, m0.d(Integer.TYPE))){
                            i1 = b.a().getInt(str1, integer2.intValue());
                            if (i1 != Integer.MIN_VALUE) {
                               integer2 = Integer.valueOf(i1);
                            }
                         }else if(a.g(uod2, m0.d(Long.TYPE))){
                            longx1 = (!integer2 instanceof Long)? null: integer2;
                            l2 = (longx1 != null)? longx1.longValue(): Long.MIN_VALUE;
                            l2 = b.a().getLong(str1, l2);
                            if (l2 - Long.MIN_VALUE) {
                               integer5 = Long.valueOf(l2);
                            }
                         }else if(a.g(uod2, m0.d(Float.TYPE))){
                            uFloat1 = (!integer2 instanceof Float)? null: integer2;
                            f1 = (uFloat1 != null)? uFloat1.floatValue(): Float.MIN_VALUE;
                            floatx1 = b.a().getFloat(str1, f1);
                            if (floatx1 - 1) {
                               integer5 = Float.valueOf(floatx1);
                            }
                         }
                         integer2 = integer5;
                      }
                   label_055d :
                      uBuilder.f(integer2.intValue());
                      b = k.b;
                      str1 = "KEY_ALARM_RINGTONE";
                      Boolean tRUE = Boolean.TRUE;
                      if (!u.S1(str1)) {
                         try{
                            uod2 = m0.d(tRUE.getClass());
                            if (a.g(uod2, m0.d(Boolean.TYPE))) {
                               tRUE = Boolean.valueOf(b.a().getBoolean(str1, true));
                            }else if(a.g(uod2, m0.d(str))){
                               str5 = (!tRUE instanceof String)? null: tRUE;
                               if (str5 == null) {
                                  str5 = "";
                               }
                               str6 = b.a().getString(str1, str5);
                               str1 = (str6 == null || !str6.length())? 1: null;
                               if (!str1) {
                                  if (str6 != null) {
                                  }else {
                                     throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                                  }
                               }
                            }else if(a.g(uod2, m0.d(Integer.TYPE))){
                               integer4 = (!tRUE instanceof Integer)? null: tRUE;
                               i3 = (integer4 != null)? integer4.intValue(): Integer.MIN_VALUE;
                               i1 = b.a().getInt(str1, i3);
                               if (i1 != Integer.MIN_VALUE) {
                                  uBoolean2 = Integer.valueOf(i1);
                               }
                            }else if(a.g(uod2, m0.d(Long.TYPE))){
                               longx1 = (!tRUE instanceof Long)? null: tRUE;
                               l1 = (longx1 != null)? longx1.longValue(): Long.MIN_VALUE;
                               l1 = b.a().getLong(str1, l1);
                               if (l1 - Long.MIN_VALUE) {
                                  uBoolean2 = Long.valueOf(l1);
                               }
                            }else if(a.g(uod2, m0.d(Float.TYPE))){
                               uFloat1 = (!tRUE instanceof Float)? null: tRUE;
                               f1 = (uFloat1 != null)? uFloat1.floatValue(): Float.MIN_VALUE;
                               floatx1 = b.a().getFloat(str1, f1);
                               if (floatx1 - 1) {
                                  uBoolean2 = Float.valueOf(floatx1);
                               }
                            }
                            str7 = str6;
                         }catch(java.lang.Exception e0){
                         }
                         if (!str6.length()) {
                            len = 1;
                         }else {
                            len = 0;
                         }
                      }
                   label_0667 :
                      uBuilder.d(tRUE.booleanValue());
                      b = k.b;
                      str1 = "KEY_ALARM_VIBRATE";
                      tRUE = Boolean.TRUE;
                      if (!u.S1(str1)) {
                         try{
                            uod2 = m0.d(tRUE.getClass());
                            if (a.g(uod2, m0.d(Boolean.TYPE))) {
                               tRUE = Boolean.valueOf(b.a().getBoolean(str1, true));
                            }else if(a.g(uod2, m0.d(str))){
                               str5 = (!tRUE instanceof String)? null: tRUE;
                               if (str5 == null) {
                                  str5 = "";
                               }
                               str6 = b.a().getString(str1, str5);
                               len = (str6 == null || !str6.length())? 1: 0;
                               if (!len) {
                                  if (str6 != null) {
                                  }else {
                                     throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                                  }
                               }
                            }else if(a.g(uod2, m0.d(Integer.TYPE))){
                               integer4 = (!tRUE instanceof Integer)? null: tRUE;
                               i3 = (integer4 != null)? integer4.intValue(): Integer.MIN_VALUE;
                               i1 = b.a().getInt(str1, i3);
                               if (i1 != Integer.MIN_VALUE) {
                                  str6 = Integer.valueOf(i1);
                               }
                            }else if(a.g(uod2, m0.d(Long.TYPE))){
                               longx1 = (!tRUE instanceof Long)? null: tRUE;
                               l1 = (longx1 != null)? longx1.longValue(): Long.MIN_VALUE;
                               l1 = b.a().getLong(str1, l1);
                               if (l1 - Long.MIN_VALUE) {
                                  str6 = Long.valueOf(l1);
                               }
                            }else if(a.g(uod2, m0.d(Float.TYPE))){
                               uFloat1 = (!tRUE instanceof Float)? null: tRUE;
                               f1 = (uFloat1 != null)? uFloat1.floatValue(): Float.MIN_VALUE;
                               floatx1 = b.a().getFloat(str1, f1);
                               if (floatx1 - 1) {
                                  str6 = Float.valueOf(floatx1);
                               }
                            }
                            str7 = str6;
                         }catch(java.lang.Exception e0){
                         }
                         if (u.S1(oobject)) {
                            b2 = true;
                         }else {
                            b2 = false;
                         }
                      }
                   label_076f :
                      uBuilder.e(tRUE.booleanValue());
                      GrowthTestAlarmLayoutKt$inflateAlarmLayout$2 $weekKeys = obj.$weekKeys;
                      len = $weekKeys.length;
                      int i2 = 0;
                      i3 = 0;
                      while (true) {
                         if (i2 < len) {
                            oobject = $weekKeys[i2];
                            i = i3 + 1;
                            ok = k.b;
                            Boolean fALSE = Boolean.FALSE;
                            b2 = (oobject == null || u.S1(oobject))? true: false;
                            if (!b2) {
                               try{
                                  d uod = m0.d(fALSE.getClass());
                                  if (a.g(uod, m0.d(Boolean.TYPE))) {
                                     fALSE = Boolean.valueOf(ok.a().getBoolean(oobject, false));
                                  }else if(a.g(uod, m0.d(str))){
                                     str4 = (!fALSE instanceof String)? null: fALSE;
                                     if (str4 == null) {
                                        str4 = "";
                                     }
                                     str4 = ok.a().getString(oobject, str4);
                                     b3 = (str4 == null || !str4.length())? true: false;
                                     if (!b3) {
                                        if (str4 != null) {
                                        }else {
                                           break ;
                                        }
                                     }
                                  }else if(a.g(uod, m0.d(Integer.TYPE))){
                                     Integer integer3 = (!fALSE instanceof Integer)? null: fALSE;
                                     i5 = (integer3 != null)? integer3.intValue(): Integer.MIN_VALUE;
                                     i5 = ok.a().getInt(oobject, i5);
                                     if (i5 != Integer.MIN_VALUE) {
                                        uBoolean = Integer.valueOf(i5);
                                     }
                                  }else if(a.g(uod, m0.d(Long.TYPE))){
                                     try{
                                        longx = (!fALSE instanceof Long)? null: fALSE;
                                        l = (longx != null)? longx.longValue(): Long.MIN_VALUE;
                                        l = ok.a().getLong(oobject, l);
                                        if (l - Long.MIN_VALUE) {
                                           fALSE = Long.valueOf(l);
                                        }
                                     }catch(java.lang.Exception e0){
                                        i4 = Long.MIN_VALUE;
                                     }
                                  }else if(a.g(uod, m0.d(Float.TYPE))){
                                     Float uFloat = (!fALSE instanceof Float)? null: fALSE;
                                     float f = (uFloat != null)? uFloat.floatValue(): Float.MIN_VALUE;
                                     floatx = ok.a().getFloat(oobject, f);
                                     if (floatx - 1) {
                                        fALSE = Float.valueOf(floatx);
                                     }
                                  }
                                  fALSE = str4;
                               }catch(java.lang.Exception e0){
                               }catch(java.lang.Exception e0){
                               }
                            }
                            i4 = Long.MIN_VALUE;
                         }else {
                            KwaiAlarm.e(uBuilder, null, 2, null);
                            return;
                         }
                      }
                      throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                   }catch(java.lang.Exception e0){
                   }
                }catch(java.lang.Exception e0){
                }
             }catch(java.lang.Exception e0){
             }
          }catch(java.lang.Exception e0){
          }
       }catch(java.lang.Exception e0){
       }
    }
}
