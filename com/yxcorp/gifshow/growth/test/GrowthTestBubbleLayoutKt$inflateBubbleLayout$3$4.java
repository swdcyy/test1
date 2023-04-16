package com.yxcorp.gifshow.growth.test.GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$4;
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
import e17.i;
import kotlin.Result;
import com.google.gson.JsonElement;
import com.google.gson.c;
import com.google.gson.JsonObject;
import java.lang.Throwable;
import qrd.j0;
import rn.e;
import zn.b;
import com.yxcorp.gifshow.growth.test.GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$4$a;
import qn.l;
import rn.b;
import com.yxcorp.gifshow.growth.test.GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$4$b;
import zn.a;
import rn.a;
import rn.e$a;

public final class GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$4 extends Lambda implements a	// class@0014e0
{
    public static final GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$4 INSTANCE;

    static {
       GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$4.INSTANCE = new GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$4();
    }
    public void GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$4(){
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       k b;
       String str1;
       String str2;
       String str3;
       int i;
       String str4;
       e$a a;
       int b1;
       Object[] objArray1;
       int b2;
       int intx;
       long l1;
       float floatx;
       Object[] objArray2;
       int b3;
       String str = String.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$4.class, "1")) {
          return;
       }
       try{
          b = k.b;
          str1 = "KEY_K_BUBBLE_TK_BUNDLE_ID";
          str2 = "";
          str3 = "null cannot be cast to non-null type kotlin.String";
          i = 1;
          if (!u.S1(str1)) {
             d uod2 = m0.d(str2.getClass());
             if (a.g(uod2, m0.d(Boolean.TYPE))) {
                objArray2 = (!str2 instanceof Boolean)? objArray: str2;
                b3 = (objArray2 != null)? objArray2.booleanValue(): false;
                str4 = Boolean.valueOf(b.a().getBoolean(str1, b3));
             }else if(a.g(uod2, m0.d(str))){
                str4 = b.a().getString(str1, str2);
                str1 = (str4 == null || !str4.length())? 1: null;
                if (!str1) {
                   if (str4 == null) {
                      throw new NullPointerException(str3);
                   }
                }
             }else if(a.g(uod2, m0.d(Integer.TYPE))){
                objArray2 = (!str2 instanceof Integer)? objArray: str2;
                b3 = (objArray2 != null)? objArray2.intValue(): Integer.MIN_VALUE;
                intx = b.a().getInt(str1, b3);
                if (intx != Integer.MIN_VALUE) {
                   str4 = Integer.valueOf(intx);
                }
             }else if(a.g(uod2, m0.d(Long.TYPE))){
                objArray2 = (!str2 instanceof Long)? objArray: str2;
                l1 = (objArray2 != null)? objArray2.longValue(): Long.MIN_VALUE;
                l1 = b.a().getLong(str1, l1);
                if (l1 - Long.MIN_VALUE) {
                   str4 = Long.valueOf(l1);
                }
             }else if(a.g(uod2, m0.d(Float.TYPE))){
                objArray2 = (!str2 instanceof Float)? objArray: str2;
                float f2 = (objArray2 != null)? objArray2.floatValue(): Float.MIN_VALUE;
                floatx = b.a().getFloat(str1, f2);
                if (floatx - 1) {
                   str4 = Float.valueOf(floatx);
                }
             }
             str2 = str4;
          }
       }catch(java.lang.Exception e0){
       }
    label_0118 :
       str4 = (!str2.length())? 1: null;
       if (str4) {
          i.d(R.style.arg_RES_7f110668, "«Î ‰»ÎbundleId");
          return;
       }else {
          try{
             b = k.b;
             str1 = "KEY_K_BUBBLE_TK_BUNDLE_VIEW_KEY";
             String str5 = "dialog";
             if (!u.S1(str1)) {
                d uod1 = m0.d(str5.getClass());
                if (a.g(uod1, m0.d(Boolean.TYPE))) {
                   objArray1 = (!str5 instanceof Boolean)? objArray: str5;
                   b2 = (objArray1 != null)? objArray1.booleanValue(): false;
                   str4 = Boolean.valueOf(b.a().getBoolean(str1, b2));
                }else if(a.g(uod1, m0.d(str))){
                   str4 = b.a().getString(str1, str5);
                   str1 = (str4 == null || !str4.length())? 1: null;
                   if (!str1) {
                      if (str4 == null) {
                         throw new NullPointerException(str3);
                      }
                   }
                }else if(a.g(uod1, m0.d(Integer.TYPE))){
                   objArray1 = (!str5 instanceof Integer)? objArray: str5;
                   b2 = (objArray1 != null)? objArray1.intValue(): Integer.MIN_VALUE;
                   intx = b.a().getInt(str1, b2);
                   if (intx != Integer.MIN_VALUE) {
                      str4 = Integer.valueOf(intx);
                   }
                }else if(a.g(uod1, m0.d(Long.TYPE))){
                   objArray1 = (!str5 instanceof Long)? objArray: str5;
                   l1 = (objArray1 != null)? objArray1.longValue(): Long.MIN_VALUE;
                   l1 = b.a().getLong(str1, l1);
                   if (l1 - Long.MIN_VALUE) {
                      str4 = Long.valueOf(l1);
                   }
                }else if(a.g(uod1, m0.d(Float.TYPE))){
                   objArray1 = (!str5 instanceof Float)? objArray: str5;
                   float f1 = (objArray1 != null)? objArray1.floatValue(): Float.MIN_VALUE;
                   floatx = b.a().getFloat(str1, f1);
                   if (floatx - 1) {
                      str4 = Float.valueOf(floatx);
                   }
                }
                str5 = str4;
             }
          label_022a :
             b = k.b;
             str1 = "KEY_K_BUBBLE_TK_BUNDLE_PARAMS";
             String str6 = "{}";
             if (!u.S1(str1)) {
                try{
                   d uod = m0.d(str6.getClass());
                   if (a.g(uod, m0.d(Boolean.TYPE))) {
                      Boolean uBoolean = (!str6 instanceof Boolean)? null: str6;
                      b1 = (uBoolean != null)? uBoolean.booleanValue(): false;
                      str = Boolean.valueOf(b.a().getBoolean(str1, b1));
                   }else if(a.g(uod, m0.d(str))){
                      str = b.a().getString(str1, str6);
                      if (str != null && str.length()) {
                         i = 0;
                      }
                      if (!i) {
                         if (str == null) {
                            throw new NullPointerException(str3);
                         }
                      }
                   }else if(a.g(uod, m0.d(Integer.TYPE))){
                      Integer integer = (!str6 instanceof Integer)? null: str6;
                      b1 = (integer != null)? integer.intValue(): Integer.MIN_VALUE;
                      b1 = b.a().getInt(str1, b1);
                      if (b1 != Integer.MIN_VALUE) {
                         str = Integer.valueOf(b1);
                      }
                   }else if(a.g(uod, m0.d(Long.TYPE))){
                      Long longx = (!str6 instanceof Long)? null: str6;
                      long l = (longx != null)? longx.longValue(): Long.MIN_VALUE;
                      long longx1 = b.a().getLong(str1, l);
                      if (longx1 - Long.MIN_VALUE) {
                         str = Long.valueOf(longx1);
                      }
                   }else if(a.g(uod, m0.d(Float.TYPE))){
                      Float uFloat = (!str6 instanceof Float)? null: str6;
                      float f = (uFloat != null)? uFloat.floatValue(): Float.MIN_VALUE;
                      f = b.a().getFloat(str1, f);
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
                b uob = new b(str2, jsonObject);
                uob.t(str5);
                uob.q(false);
                uob.k(new GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$4$a());
                uob.r(new GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$4$b());
                a uoa = a.a(uob);
                if (uoa != null) {
                   uoa.show();
                }
             }else {
                Throwable throwable = Result.exceptionOrNull-impl(jsonObject);
                if (throwable != null) {
                   str = throwable.getMessage();
                   if (str != null) {
                   label_0397 :
                      i.d(R.style.arg_RES_7f11066a, str);
                   }
                }
                str = "failed";
                goto label_0397 ;
             }
             return;
          }catch(java.lang.Exception e0){
          }
       }
    }
}
