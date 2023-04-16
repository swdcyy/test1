package com.yxcorp.gifshow.growth.abtest.LocalABTest;
import com.yxcorp.gifshow.growth.abtest.LocalABTest$b;
import nsd.u;
import com.yxcorp.gifshow.growth.abtest.LocalABTest$Companion$all$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.yxcorp.gifshow.growth.abtest.LocalABTest$a;
import com.yxcorp.gifshow.growth.abtest.LocalABTest$mappingResult$2;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.SystemUtil;
import java.lang.Boolean;
import vqa.k;
import java.lang.CharSequence;
import zsd.u;
import vsd.d;
import nsd.m0;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;
import pna.k;
import java.lang.NullPointerException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import java.lang.Number;
import msd.l;
import com.kwai.robust.PatchProxyResult;

public abstract class LocalABTest	// class@0012e2
{
    public final LocalABTest$a a;
    public Object b;
    public final String c;
    public final String d;
    public final p e;
    public static final p f;
    public static final LocalABTest$b g;

    static {
       LocalABTest.g = new LocalABTest$b(null);
       LocalABTest.f = s.c(LocalABTest$Companion$all$2.INSTANCE);
    }
    public void LocalABTest(){
       super();
       this.a = new LocalABTest$a();
       this.c = "";
       this.d = "";
       this.e = s.c(new LocalABTest$mappingResult$2(this));
    }
    public final void a(){
       String str2;
       Class uClass;
       Boolean tRUE;
       d uod;
       Object[] objArray1;
       int i2;
       long l;
       long longx;
       float f;
       Integer integer1;
       Long longx2;
       Float uFloat1;
       String str = String.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LocalABTest.class, "3")) {
          return;
       }
       if (SystemUtil.K()) {
          k obj = this.b();
          String str1 = "";
          int i = Integer.MIN_VALUE;
          int i1 = 1;
          boolean b = false;
          if (obj instanceof Boolean) {
             obj = k.b;
             str2 = this.f();
             Boolean fALSE = Boolean.FALSE;
             uClass = (str2 == null || u.S1(str2))? 1: null;
             if (!uClass) {
                try{
                   uod = m0.d(fALSE.getClass());
                   if (a.g(uod, m0.d(Boolean.TYPE))) {
                      fALSE = Boolean.valueOf(obj.a().getBoolean(str2, b));
                   }else if(a.g(uod, m0.d(str))){
                      objArray1 = (!fALSE instanceof String)? objArray: fALSE;
                      if (objArray1 != null) {
                         str1 = objArray1;
                      }
                      str = obj.a().getString(str2, str1);
                      if (str != null && str.length()) {
                         i1 = 0;
                      }
                      if (!i1) {
                         if (str != null) {
                         }else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                         }
                      }
                   }else if(a.g(uod, m0.d(Integer.TYPE))){
                      objArray1 = (!fALSE instanceof Integer)? objArray: fALSE;
                      i2 = (objArray1 != null)? objArray1.intValue(): Integer.MIN_VALUE;
                      i2 = obj.a().getInt(str2, i2);
                      if (i2 != i) {
                         tRUE = Integer.valueOf(i2);
                      }
                   }else if(a.g(uod, m0.d(Long.TYPE))){
                      objArray1 = (!fALSE instanceof Long)? objArray: fALSE;
                      l = (objArray1 != null)? objArray1.longValue(): Long.MIN_VALUE;
                      longx = obj.a().getLong(str2, l);
                      if (longx - Long.MIN_VALUE) {
                         tRUE = Long.valueOf(longx);
                      }
                   }else if(a.g(uod, m0.d(Float.TYPE))){
                      objArray1 = (!fALSE instanceof Float)? objArray: fALSE;
                      f = (objArray1 != null)? objArray1.floatValue(): Float.MIN_VALUE;
                      f = obj.a().getFloat(str2, f);
                      if (f - Float.MIN_VALUE) {
                         tRUE = Float.valueOf(f);
                      }
                   }
                   fALSE = str;
                }catch(java.lang.Exception e0){
                }
             }
          label_0128 :
             if (fALSE.booleanValue()) {
                tRUE = Boolean.TRUE;
                if (tRUE instanceof Object) {
                   objArray = tRUE;
                }
                this.b = objArray;
             }
          }else if(obj instanceof String){
             obj = k.b;
             str2 = this.f();
             Class uClass1 = (str2 == null || u.S1(str2))? 1: null;
             if (!uClass1) {
                d uod1 = m0.d(str1.getClass());
                if (a.g(uod1, m0.d(Boolean.TYPE))) {
                   objArray1 = (!str1 instanceof Boolean)? objArray: str1;
                   i2 = (objArray1 != null)? objArray1.booleanValue(): false;
                   str = Boolean.valueOf(obj.a().getBoolean(str2, i2));
                }else if(a.g(uod1, m0.d(str))){
                   str = obj.a().getString(str2, str1);
                   String str3 = (str == null || !str.length())? 1: null;
                   if (!str3) {
                      if (str == null) {
                         throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                      }
                   }
                }else if(a.g(uod1, m0.d(Integer.TYPE))){
                   objArray1 = (!str1 instanceof Integer)? objArray: str1;
                   i2 = (objArray1 != null)? objArray1.intValue(): Integer.MIN_VALUE;
                   i2 = obj.a().getInt(str2, i2);
                   if (i2 != i) {
                      str = Integer.valueOf(i2);
                   }
                }else if(a.g(uod1, m0.d(Long.TYPE))){
                   objArray1 = (!str1 instanceof Long)? objArray: str1;
                   long l1 = (objArray1 != null)? objArray1.longValue(): Long.MIN_VALUE;
                   longx = obj.a().getLong(str2, l1);
                   if (longx - Long.MIN_VALUE) {
                      str = Long.valueOf(longx);
                   }
                }else if(a.g(uod1, m0.d(Float.TYPE))){
                   objArray1 = (!str1 instanceof Float)? objArray: str1;
                   f = (objArray1 != null)? objArray1.floatValue(): Float.MIN_VALUE;
                   f = obj.a().getFloat(str2, f);
                   if (f - Float.MIN_VALUE) {
                      str = Float.valueOf(f);
                   }
                }
                str1 = str;
             }
          label_0246 :
             if (str1.length() <= 0) {
                i1 = 0;
             }
             if (i1) {
                if (str1 instanceof Object) {
                   objArray = str1;
                }
                this.b = objArray;
             }
          }else if(obj instanceof Integer){
             obj = k.b;
             str2 = this.f();
             Integer integer = Integer.valueOf(i);
             uClass = (str2 == null || u.S1(str2))? 1: null;
             if (!uClass) {
                uod = m0.d(integer.getClass());
                if (a.g(uod, m0.d(Boolean.TYPE))) {
                   objArray1 = (!integer instanceof Boolean)? objArray: integer;
                   if (objArray1 != null) {
                      b = objArray1.booleanValue();
                   }
                   integer1 = Boolean.valueOf(obj.a().getBoolean(str2, b));
                }else if(a.g(uod, m0.d(str))){
                   objArray1 = (!integer instanceof String)? objArray: integer;
                   if (objArray1 != null) {
                      str1 = objArray1;
                   }
                   str = obj.a().getString(str2, str1);
                   if (str != null && str.length()) {
                      i1 = 0;
                   }
                   if (!i1) {
                      if (str != null) {
                      }else {
                         throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                      }
                   }
                }else if(a.g(uod, m0.d(Integer.TYPE))){
                   i2 = obj.a().getInt(str2, integer.intValue());
                   if (i2 != i) {
                      integer = Integer.valueOf(i2);
                   }
                }else if(a.g(uod, m0.d(Long.TYPE))){
                   objArray1 = (!integer instanceof Long)? objArray: integer;
                   l = (objArray1 != null)? objArray1.longValue(): Long.MIN_VALUE;
                   longx = obj.a().getLong(str2, l);
                   if (longx - Long.MIN_VALUE) {
                      integer1 = Long.valueOf(longx);
                   }
                }else if(a.g(uod, m0.d(Float.TYPE))){
                   objArray1 = (!integer instanceof Float)? objArray: integer;
                   f = (objArray1 != null)? objArray1.floatValue(): Float.MIN_VALUE;
                   f = obj.a().getFloat(str2, f);
                   if (f - Float.MIN_VALUE) {
                      integer1 = Float.valueOf(f);
                   }
                }
                integer = integer1;
             }
          label_0365 :
             i2 = integer.intValue();
             if (i2 != i) {
                integer1 = Integer.valueOf(i2);
                if (integer1 instanceof Object) {
                   objArray = integer1;
                }
                this.b = objArray;
             }
          }else if(obj instanceof Long){
             obj = k.b;
             str2 = this.f();
             Long longx1 = Long.valueOf(Long.MIN_VALUE);
             uClass = (str2 == null || u.S1(str2))? 1: null;
             if (!uClass) {
                uod = m0.d(longx1.getClass());
                if (a.g(uod, m0.d(Boolean.TYPE))) {
                   objArray1 = (!longx1 instanceof Boolean)? objArray: longx1;
                   if (objArray1 != null) {
                      b = objArray1.booleanValue();
                   }
                   longx2 = Boolean.valueOf(obj.a().getBoolean(str2, b));
                }else if(a.g(uod, m0.d(str))){
                   objArray1 = (!longx1 instanceof String)? objArray: longx1;
                   if (objArray1 != null) {
                      str1 = objArray1;
                   }
                   str = obj.a().getString(str2, str1);
                   if (str != null && str.length()) {
                      i1 = 0;
                   }
                   if (!i1) {
                      if (str != null) {
                      }else {
                         throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                      }
                   }
                }else if(a.g(uod, m0.d(Integer.TYPE))){
                   objArray1 = (!longx1 instanceof Integer)? objArray: longx1;
                   i2 = (objArray1 != null)? objArray1.intValue(): Integer.MIN_VALUE;
                   i2 = obj.a().getInt(str2, i2);
                   if (i2 != i) {
                      longx2 = Integer.valueOf(i2);
                   }
                }else if(a.g(uod, m0.d(Long.TYPE))){
                   longx = obj.a().getLong(str2, longx1.longValue());
                   if (longx - Long.MIN_VALUE) {
                      longx1 = Long.valueOf(longx);
                   }
                }else if(a.g(uod, m0.d(Float.TYPE))){
                   objArray1 = (!longx1 instanceof Float)? objArray: longx1;
                   f = (objArray1 != null)? objArray1.floatValue(): Float.MIN_VALUE;
                   f = obj.a().getFloat(str2, f);
                   if (f - Float.MIN_VALUE) {
                      longx2 = Float.valueOf(f);
                   }
                }
                longx1 = longx2;
             }
          label_0483 :
             longx = longx1.longValue();
             if (longx - Long.MIN_VALUE) {
                longx2 = Long.valueOf(longx);
                if (longx2 instanceof Object) {
                   objArray = longx2;
                }
                this.b = objArray;
             }
          }else if(obj instanceof Float){
             obj = k.b;
             str2 = this.f();
             Float uFloat = Float.valueOf(Float.MIN_VALUE);
             uClass = (str2 == null || u.S1(str2))? 1: null;
             if (!uClass) {
                uod = m0.d(uFloat.getClass());
                if (a.g(uod, m0.d(Boolean.TYPE))) {
                   objArray1 = (!uFloat instanceof Boolean)? objArray: uFloat;
                   if (objArray1 != null) {
                      b = objArray1.booleanValue();
                   }
                   uFloat1 = Boolean.valueOf(obj.a().getBoolean(str2, b));
                }else if(a.g(uod, m0.d(str))){
                   objArray1 = (!uFloat instanceof String)? objArray: uFloat;
                   if (objArray1 != null) {
                      str1 = objArray1;
                   }
                   str = obj.a().getString(str2, str1);
                   if (str != null && str.length()) {
                      i1 = 0;
                   }
                   if (!i1) {
                      if (str != null) {
                      }else {
                         throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                      }
                   }
                }else if(a.g(uod, m0.d(Integer.TYPE))){
                   objArray1 = (!uFloat instanceof Integer)? objArray: uFloat;
                   i2 = (objArray1 != null)? objArray1.intValue(): Integer.MIN_VALUE;
                   i2 = obj.a().getInt(str2, i2);
                   if (i2 != i) {
                      uFloat1 = Integer.valueOf(i2);
                   }
                }else if(a.g(uod, m0.d(Long.TYPE))){
                   objArray1 = (!uFloat instanceof Long)? objArray: uFloat;
                   long l2 = (objArray1 != null)? objArray1.longValue(): Long.MIN_VALUE;
                   longx = obj.a().getLong(str2, l2);
                   if (longx - Long.MIN_VALUE) {
                      uFloat1 = Long.valueOf(longx);
                   }
                }else if(a.g(uod, m0.d(Float.TYPE))){
                   f = obj.a().getFloat(str2, uFloat.floatValue());
                   if (f - Float.MIN_VALUE) {
                      uFloat = Float.valueOf(f);
                   }
                }
                uFloat = uFloat1;
             }
          label_05a2 :
             f = uFloat.floatValue();
             if (f - Float.MIN_VALUE) {
                uFloat1 = Float.valueOf(f);
                if (uFloat1 instanceof Object) {
                   objArray = uFloat1;
                }
                this.b = objArray;
             }
          }
       }
    }
    public abstract Object b();
    public abstract l c();
    public final Object d(){
       Object obj = PatchProxy.apply(null, this, LocalABTest.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public abstract int e();
    public String f(){
       return this.c;
    }
    public String g(){
       return this.d;
    }
    public abstract String h();
}
