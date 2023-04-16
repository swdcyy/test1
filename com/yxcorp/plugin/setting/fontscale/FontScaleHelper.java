package com.yxcorp.plugin.setting.fontscale.FontScaleHelper;
import com.yxcorp.plugin.setting.fontscale.FontScaleHelper$isExperimentFontScaleEnable$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import cw9.e;
import oe6.e;
import java.lang.Boolean;
import android.content.SharedPreferences;

public final class FontScaleHelper	// class@0008a4
{
    public static final float[] a;
    public static final int[] b;
    public static final p c;

    static {
       FontScaleHelper.a = new float[4]{0x3f638e39,0x3f800000,0x3f900000,0x3fa20000};
       FontScaleHelper.b = new int[4]{0x7f101049,0x7f10104b,0x7f101047,0x7f101044};
       FontScaleHelper.c = s.c(FontScaleHelper$isExperimentFontScaleEnable$2.INSTANCE);
    }
    public static final float a(){
       float f;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, FontScaleHelper.class, "4");
       if (obj != patchProxyRe) {
          return obj.floatValue();
       }
       obj = PatchProxy.apply(objArray, objArray, e.class, "10");
       if (obj != patchProxyRe) {
          f = obj.floatValue();
       }else {
          f = e.b;
          if (f <= 0) {
             f = e.b();
          }
       }
       float f1 = 0x3f800000;
       if (f - 0x3fa20000 >= 0) {
          f1 = 0x3fa20000;
       }else if(f - 0x3f900000 >= 0){
          f1 = 0x3f900000;
       }else if(f - f1 >= 0){
          f1 = 0x3f638e39;
       }
       return f1;
    }
    public static final int b(float p0){
       float[] a = FontScaleHelper.a;
       int len = a.length;
       int i = 0;
       while (true) {
          int i1 = -1;
          if (i < len) {
             int i2 = (!a[i] - p0)? 1: 0;
             if (i2) {
             label_0019 :
                if (i < 0) {
                   float[] a1 = FontScaleHelper.a;
                   int len1 = a1.length;
                   len = 0;
                   while (len < len1) {
                      i = (!a1[len] - 0x3f800000)? 1: 0;
                      if (i) {
                         i1 = len;
                         break ;
                      }
                      len = len + 1;
                   }
                   return i1;
                }else {
                   return i;
                }
             }else {
                i = i + 1;
             }
          }else {
             i = -1;
             goto label_0019 ;
          }
       }
    }
    public static final float c(){
       Object obj = PatchProxy.apply(null, null, FontScaleHelper.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float f = e.Q();
       if (f - (float)0 > 0) {
          return f;
       }
       return FontScaleHelper.a();
    }
    public static final boolean d(){
       Object obj = PatchProxy.apply(null, null, FontScaleHelper.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = FontScaleHelper.c.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean e(){
       Object obj = PatchProxy.apply(null, null, FontScaleHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (e.a.getBoolean("HasChangeFontScaleManual", b)) {
          return e.e();
       }
       if (e.e() || FontScaleHelper.d()) {
          b = true;
       }
       return b;
    }
}
