package com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope$b;
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
import java.lang.Integer;
import vsd.d;
import nsd.m0;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;
import java.lang.NullPointerException;
import java.lang.Long;
import java.lang.Float;

public final class GrowthTestLayout$Companion$SubTitleScope$b implements GrowthTestLayout$Companion$a	// class@00154e
{
    public final String b;

    public void GrowthTestLayout$Companion$SubTitleScope$b(String p0){
       this.b = p0;
       super();
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestLayout$Companion$SubTitleScope$b.class, "2")) {
          return;
       }
       k.b.c(this.b, p0);
       if (p0 != null) {
          i.d(R.style.arg_RES_7f110668, "����ɹ�: value = "+p0);
       }else {
          i.d(R.style.arg_RES_7f110668, "����ɹ�");
       }
       return;
    }
    public Object b(){
       Boolean tRUE;
       Object[] objArray = null;
       k obj = PatchProxy.apply(objArray, this, GrowthTestLayout$Companion$SubTitleScope$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = k.b;
       GrowthTestLayout$Companion$SubTitleScope$b tb = this.b;
       Class uClass = 1;
       Integer integer = (tb == null || u.S1(tb))? 1: null;
       if (!integer) {
          try{
             d uod = m0.d(Integer.class);
             if (a.g(uod, m0.d(Boolean.TYPE))) {
                if (obj.a().getBoolean(tb, false)) {
                   tRUE = Boolean.TRUE;
                }
             }else if(a.g(uod, m0.d(String.class))){
                tRUE = obj.a().getString(tb, "");
                if (tRUE != null && tRUE.length()) {
                   uClass = 0;
                }
                if (!uClass) {
                   if (tRUE != null) {
                   }else {
                      throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                   }
                }
             }else if(a.g(uod, m0.d(Integer.TYPE))){
                int intx = obj.a().getInt(tb, Integer.MIN_VALUE);
                if (intx != Integer.MIN_VALUE) {
                   objArray = Integer.valueOf(intx);
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
    label_00d5 :
       return objArray;
    }
}