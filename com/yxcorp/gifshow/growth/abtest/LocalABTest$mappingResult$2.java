package com.yxcorp.gifshow.growth.abtest.LocalABTest$mappingResult$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.abtest.LocalABTest;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.growth.abtest.LocalABTest$a;
import java.util.Map;
import wma.a;
import msd.l;
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
import java.lang.StringBuilder;
import o56.a;
import lnc.t0;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.List;

public final class LocalABTest$mappingResult$2 extends Lambda implements a	// class@0012e1
{
    public final LocalABTest this$0;

    public void LocalABTest$mappingResult$2(LocalABTest p0){
       this.this$0 = p0;
       super(0);
    }
    public final Object invoke(){
       int i;
       Integer integer;
       int i1;
       Object[] objArray1;
       Integer integer1;
       Integer integer2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       LocalABTest$mappingResult$2 obj = PatchProxy.apply(objArray, this, LocalABTest$mappingResult$2.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       if (obj.b == null) {
          Objects.requireNonNull(obj);
          LocalABTest$a uoa = LocalABTest$a.class;
          String str1 = "2";
          if (!PatchProxy.applyVoid(objArray, obj, LocalABTest.class, str1)) {
             LocalABTest a = obj.a;
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoid(objArray, a, uoa, str1)) {
                a.b().clear();
             }
             try{
                obj.c().invoke(obj.a);
                k b1 = k.b;
                str1 = "KEY_GROWTH_BUCKET_ID";
                i = -1;
                integer = Integer.valueOf(i);
                if (!u.S1(str1)) {
                   d uod = m0.d(integer.getClass());
                   boolean b2 = false;
                   if (a.g(uod, m0.d(Boolean.TYPE))) {
                      objArray1 = (!integer instanceof Boolean)? objArray: integer;
                      if (objArray1 != null) {
                         b2 = objArray1.booleanValue();
                      }
                      integer1 = Boolean.valueOf(b1.a().getBoolean(str1, b2));
                   }else if(a.g(uod, m0.d(String.class))){
                      objArray1 = (!integer instanceof String)? objArray: integer;
                      if (objArray1 == null) {
                         String str2 = "";
                      }
                      integer1 = b1.a().getString(str1, objArray1);
                      if (integer1 == null || !integer1.length()) {
                         b2 = true;
                      }
                      if (!b2) {
                         if (integer1 != null) {
                         }else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                         }
                      }
                   }else if(a.g(uod, m0.d(Integer.TYPE))){
                      i1 = b1.a().getInt(str1, integer.intValue());
                      if (i1 != Integer.MIN_VALUE) {
                         integer = Integer.valueOf(i1);
                      }
                   }else if(a.g(uod, m0.d(Long.TYPE))){
                      objArray1 = (!integer instanceof Long)? objArray: integer;
                      long l = (objArray1 != null)? objArray1.longValue(): Long.MIN_VALUE;
                      long longx = b1.a().getLong(str1, l);
                      if (longx - Long.MIN_VALUE) {
                         integer1 = Long.valueOf(longx);
                      }
                   }else if(a.g(uod, m0.d(Float.TYPE))){
                      objArray1 = (!integer instanceof Float)? objArray: integer;
                      float f = (objArray1 != null)? objArray1.floatValue(): Float.MIN_VALUE;
                      float floatx = b1.a().getFloat(str1, f);
                      if (floatx - 1) {
                         integer1 = Float.valueOf(floatx);
                      }
                   }
                   integer = integer1;
                }
             }catch(java.lang.Exception e0){
             }
          label_0149 :
             i1 = integer.intValue();
             if (i1 == i) {
                i1 = t0.a(obj.h()+a.a, obj.e());
             }
             LocalABTest a1 = obj.a;
             Objects.requireNonNull(a1);
             if (PatchProxy.isSupport(uoa)) {
                Map$Entry obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i1), a1, uoa, str);
                if (obj1 != patchProxyRe) {
                   objArray = obj1;
                }else {
                label_0183 :
                   Iterator iterator = a1.b().entrySet().iterator();
                   while (iterator.hasNext()) {
                      obj1 = iterator.next();
                      Object key = obj1.getKey();
                      if (obj1.getValue().contains(Integer.valueOf(i1))) {
                         objArray = key;
                         break ;
                      }
                   }
                }
             }else {
                goto label_0183 ;
             }
             if (objArray == null) {
                objArray = obj.b();
             }
             obj.b = objArray;
             obj.a();
          }
       }
       LocalABTest$mappingResult$2 tthis$0 = this.this$0;
       LocalABTest b = tthis$0.b;
       if (b == null) {
          b = tthis$0.b();
       }
       return b;
    }
}
