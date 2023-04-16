package com.yxcorp.gifshow.growth.test.GrowthTestBubbleLayoutKt$inflateBubbleLayout$4$4;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import java.lang.String;
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
import kotlin.Result;
import com.google.gson.JsonElement;
import com.google.gson.c;
import com.google.gson.JsonObject;
import java.lang.Throwable;
import qrd.j0;
import rn.e;
import vn.d;
import com.yxcorp.gifshow.growth.test.GrowthTestBubbleLayoutKt$inflateBubbleLayout$4$4$a;
import qn.l;
import rn.b;
import rn.a;
import rn.e$a;
import e17.i;

public final class GrowthTestBubbleLayoutKt$inflateBubbleLayout$4$4 extends Lambda implements a	// class@0014e6
{
    public static final GrowthTestBubbleLayoutKt$inflateBubbleLayout$4$4 INSTANCE;

    static {
       GrowthTestBubbleLayoutKt$inflateBubbleLayout$4$4.INSTANCE = new GrowthTestBubbleLayoutKt$inflateBubbleLayout$4$4();
    }
    public void GrowthTestBubbleLayoutKt$inflateBubbleLayout$4$4(){
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       String str1;
       String str2;
       String str3;
       int i;
       String str4;
       k b1;
       String str5;
       int i1;
       e$a a;
       int b2;
       Object[] objArray1;
       int b3;
       long l1;
       Object[] objArray2;
       int b4;
       String str = String.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GrowthTestBubbleLayoutKt$inflateBubbleLayout$4$4.class, "1")) {
          return;
       }
       try{
          k b = k.b;
          str1 = "KEY_K_BUBBLE_KRN_BUNDLE_ID";
          str2 = "";
          str3 = "null cannot be cast to non-null type kotlin.String";
          i = 1;
          if (!u.S1(str1)) {
             d uod3 = m0.d(str2.getClass());
             if (a.g(uod3, m0.d(Boolean.TYPE))) {
                objArray2 = (!str2 instanceof Boolean)? objArray: str2;
                b4 = (objArray2 != null)? objArray2.booleanValue(): false;
                str4 = Boolean.valueOf(b.a().getBoolean(str1, b4));
             }else if(a.g(uod3, m0.d(str))){
                str4 = b.a().getString(str1, str2);
                b1 = (str4 == null || !str4.length())? 1: null;
                if (!b1) {
                   if (str4 != null) {
                   }else {
                      throw new NullPointerException(str3);
                   }
                }
             }else if(a.g(uod3, m0.d(Integer.TYPE))){
                objArray2 = (!str2 instanceof Integer)? objArray: str2;
                b4 = (objArray2 != null)? objArray2.intValue(): Integer.MIN_VALUE;
                int intx = b.a().getInt(str1, b4);
                if (intx != Integer.MIN_VALUE) {
                   str4 = Integer.valueOf(intx);
                }
             }else if(a.g(uod3, m0.d(Long.TYPE))){
                objArray2 = (!str2 instanceof Long)? objArray: str2;
                l1 = (objArray2 != null)? objArray2.longValue(): Long.MIN_VALUE;
                l1 = b.a().getLong(str1, l1);
                if (l1 - Long.MIN_VALUE) {
                   str4 = Long.valueOf(l1);
                }
             }else if(a.g(uod3, m0.d(Float.TYPE))){
                objArray2 = (!str2 instanceof Float)? objArray: str2;
                float f2 = (objArray2 != null)? objArray2.floatValue(): Float.MIN_VALUE;
                float floatx1 = b.a().getFloat(str1, f2);
                if (floatx1 - 1) {
                   str4 = Float.valueOf(floatx1);
                }
             }
          }
          str4 = str2;
       }catch(java.lang.Exception e0){
       }
       try{
          b1 = k.b;
          str5 = "KEY_K_BUBBLE_KRN_COMPONENTNAME";
          if (!u.S1(str5)) {
             d uod2 = m0.d(str2.getClass());
             if (a.g(uod2, m0.d(Boolean.TYPE))) {
                objArray1 = (!str2 instanceof Boolean)? objArray: str2;
                b3 = (objArray1 != null)? objArray1.booleanValue(): false;
                str1 = Boolean.valueOf(b1.a().getBoolean(str5, b3));
             }else if(a.g(uod2, m0.d(str))){
                str1 = b1.a().getString(str5, str2);
                str5 = (str1 == null || !str1.length())? 1: null;
                if (!str5) {
                   if (str1 == null) {
                      throw new NullPointerException(str3);
                   }
                }
             }else if(a.g(uod2, m0.d(Integer.TYPE))){
                objArray1 = (!str2 instanceof Integer)? objArray: str2;
                b3 = (objArray1 != null)? objArray1.intValue(): Integer.MIN_VALUE;
                i1 = b1.a().getInt(str5, b3);
                if (i1 != Integer.MIN_VALUE) {
                   str1 = Integer.valueOf(i1);
                }
             }else if(a.g(uod2, m0.d(Long.TYPE))){
                objArray1 = (!str2 instanceof Long)? objArray: str2;
                l1 = (objArray1 != null)? objArray1.longValue(): Long.MIN_VALUE;
                l1 = b1.a().getLong(str5, l1);
                if (l1 - Long.MIN_VALUE) {
                   str1 = Long.valueOf(l1);
                }
             }else if(a.g(uod2, m0.d(Float.TYPE))){
                objArray1 = (!str2 instanceof Float)? objArray: str2;
                float f1 = (objArray1 != null)? objArray1.floatValue(): Float.MIN_VALUE;
                float floatx = b1.a().getFloat(str5, f1);
                if (floatx - 1) {
                   str1 = Float.valueOf(floatx);
                }
             }
             str2 = str1;
          }
       }catch(java.lang.Exception e0){
       }
    label_0212 :
       i1 = (!str4.length())? 1: 0;
       if (!i1) {
          b1 = (!str2.length())? 1: null;
          if (!b1) {
             b1 = k.b;
             str5 = "KEY_K_BUBBLE_KRN_BUNDLE_PARAMS";
             String str6 = "{}";
             if (!u.S1(str5)) {
                try{
                   d uod1 = m0.d(str6.getClass());
                   if (a.g(uod1, m0.d(Boolean.TYPE))) {
                      Boolean uBoolean = (!str6 instanceof Boolean)? null: str6;
                      b2 = (uBoolean != null)? uBoolean.booleanValue(): false;
                      str = Boolean.valueOf(b1.a().getBoolean(str5, b2));
                   }else if(a.g(uod1, m0.d(str))){
                      str = b1.a().getString(str5, str6);
                      if (str != null && str.length()) {
                         i = 0;
                      }
                      if (!i) {
                         if (str == null) {
                            throw new NullPointerException(str3);
                         }
                      }
                   }else if(a.g(uod1, m0.d(Integer.TYPE))){
                      Integer integer = (!str6 instanceof Integer)? null: str6;
                      b2 = (integer != null)? integer.intValue(): Integer.MIN_VALUE;
                      b2 = b1.a().getInt(str5, b2);
                      if (b2 != Integer.MIN_VALUE) {
                         str = Integer.valueOf(b2);
                      }
                   }else if(a.g(uod1, m0.d(Long.TYPE))){
                      Long longx = (!str6 instanceof Long)? null: str6;
                      long l = (longx != null)? longx.longValue(): Long.MIN_VALUE;
                      long longx1 = b1.a().getLong(str5, l);
                      if (longx1 - Long.MIN_VALUE) {
                         str = Long.valueOf(longx1);
                      }
                   }else if(a.g(uod1, m0.d(Float.TYPE))){
                      Float uFloat = (!str6 instanceof Float)? null: str6;
                      float f = (uFloat != null)? uFloat.floatValue(): Float.MIN_VALUE;
                      f = b1.a().getFloat(str5, f);
                      if (f - 1) {
                         str = Float.valueOf(f);
                      }
                   }
                   str6 = str;
                }catch(java.lang.Exception e0){
                }
             }
          label_0326 :
             JsonElement jsonElement = c.d(str6);
             a.o(jsonElement, "JsonParser.parseString\(this\)");
             JsonObject jsonObject = Result.constructor-impl(jsonElement.r());
             if (Result.isSuccess-impl(jsonObject)) {
                a = e.a;
                JsonObject jsonObject1 = new JsonObject();
                if (Result.isFailure-impl(jsonObject)) {
                   jsonObject = jsonObject1;
                }
                a.o(jsonObject, "getOrDefault\(JsonObject\(\)\)");
                d uod = new d(str4, str2, jsonObject);
                uod.s = false;
                uod.k(new GrowthTestBubbleLayoutKt$inflateBubbleLayout$4$4$a());
                a uoa = a.a(uod);
                if (uoa != null) {
                   uoa.show();
                }
             }else {
                Throwable throwable = Result.exceptionOrNull-impl(jsonObject);
                if (throwable != null) {
                   str = throwable.getMessage();
                   if (str != null) {
                   label_038b :
                      i.d(R.style.arg_RES_7f110668, str);
                   }
                }
                str = "failed";
                goto label_038b ;
             }
             return;
          }
       }
       i.d(R.style.arg_RES_7f11066a, "«Î ‰»ÎbundleId | componentName");
       return;
    }
}
