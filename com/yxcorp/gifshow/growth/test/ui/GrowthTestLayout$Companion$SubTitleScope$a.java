package com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope$a;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import vqa.k;
import pna.k;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import e17.i;
import com.kwai.robust.PatchProxyResult;
import zsd.u;
import vsd.d;
import nsd.m0;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;
import java.lang.NullPointerException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;

public final class GrowthTestLayout$Companion$SubTitleScope$a implements GrowthTestLayout$Companion$a	// class@00154d
{
    public final String b;

    public void GrowthTestLayout$Companion$SubTitleScope$a(String p0){
       this.b = p0;
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestLayout$Companion$SubTitleScope$a.class, "2")) {
          return;
       }
       k.b.c(this.b, p0);
       if (p0 != null) {
          i.d(R.style.arg_RES_7f110668, "保存成功: value = "+p0);
       }else {
          i.d(R.style.arg_RES_7f110668, "清除成功");
       }
       return;
    }
    public Object b(){
       Boolean tRUE;
       String str = String.class;
       Object[] objArray = null;
       k obj = PatchProxy.apply(objArray, this, GrowthTestLayout$Companion$SubTitleScope$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = k.b;
       GrowthTestLayout$Companion$SubTitleScope$a tb = this.b;
       int i = 1;
       d uod = (tb == null || u.S1(tb))? 1: null;
       if (!uod) {
          try{
             uod = m0.d(str);
             if (a.g(uod, m0.d(Boolean.TYPE))) {
                if (obj.a().getBoolean(tb, false)) {
                   tRUE = Boolean.TRUE;
                }
             }else if(a.g(uod, m0.d(str))){
                tRUE = obj.a().getString(tb, "");
                if (tRUE != null && tRUE.length()) {
                   i = 0;
                }
                if (!i) {
                   if (tRUE == null) {
                      throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                   }
                }
             }else if(a.g(uod, m0.d(Integer.TYPE))){
                int i1 = Integer.MIN_VALUE;
                int intx = obj.a().getInt(tb, i1);
                if (intx != i1) {
                   tRUE = Integer.valueOf(intx);
                }
             }else if(a.g(uod, m0.d(Long.TYPE))){
                long longx = obj.a().getLong(tb, Long.MIN_VALUE);
                if (longx - Long.MIN_VALUE) {
                   tRUE = Long.valueOf(longx);
                }
             }else if(a.g(uod, m0.d(Float.TYPE))){
                float floatx = obj.a().getFloat(tb, Float.MIN_VALUE);
                if (floatx - Float.MIN_VALUE) {
                   tRUE = Float.valueOf(floatx);
                }
             }
             objArray = tRUE;
          }catch(java.lang.Exception e0){
          }
       }
    label_00d3 :
       return objArray;
    }
}
