package ena.i;
import ena.i$a;
import ena.i$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import java.lang.CharSequence;
import com.kwai.framework.abtest.f;
import com.yxcorp.utility.SystemUtil;
import vqa.k;
import zsd.u;
import vsd.d;
import nsd.m0;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;
import pna.k;
import java.lang.NullPointerException;
import java.lang.Long;
import java.lang.Float;

public final class i	// class@00277f
{
    public static final GrowthTestLayout$Companion$a a;
    public static final GrowthTestLayout$Companion$a b;

    static {
       i.a = new i$a();
       i.b = new i$b();
    }
    public static final boolean a(int p0){
       String obj1;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       Object obj = null;
       if (PatchProxy.isSupport(oi)) {
          obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, oi, "1");
          if (obj1 != patchProxyRe) {
             return obj1.booleanValue();
          }
       }
       boolean b = true;
       if (i.b(p0)) {
          return b;
       }else {
          obj1 = "";
          if (p0 != b) {
             if (p0 != 2) {
                if (p0 == 4) {
                   obj1 = "pushClean";
                }
             }else {
                obj1 = "settingClean";
             }
          }
          if (PatchProxy.isSupport(oi)) {
             Object obj2 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, oi, "3");
             if (obj2 != patchProxyRe) {
                b1 = obj2.booleanValue();
             }else if(p0 & a.t().a("growthAppCleanerEnableFlag", 7)){
                b1 = true;
             }else {
                b1 = false;
             }
          }else {
             goto label_0050 ;
          }
          if (b1) {
             b1 = (!obj1.length())? true: false;
             if (b1 || f.a(obj1)) {
             label_0076 :
                return b;
             }
          }
          b = false;
          goto label_0076 ;
       }
    }
    public static final boolean b(int p0){
       String obj;
       String str;
       int i;
       Boolean uBoolean1;
       i oi = i.class;
       Boolean uBoolean = null;
       if (PatchProxy.isSupport(oi)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), uBoolean, oi, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (SystemUtil.K()) {
          obj = "";
          if (p0 != 1) {
             if (p0 != 2) {
                str = (p0 != 4)? obj: "KEY_CLEANER_NOTIFICATION";
             }else {
                str = "KEY_CLEANER_SETTING";
             }
          }else {
             str = "KEY_CLEANER_LONG_CLICK";
          }
          k b = k.b;
          Boolean fALSE = Boolean.FALSE;
          if (!u.S1(str)) {
             try{
                d uod = m0.d(fALSE.getClass());
                if (a.g(uod, m0.d(Boolean.TYPE))) {
                   fALSE = Boolean.valueOf(b.a().getBoolean(str, false));
                }else if(a.g(uod, m0.d(String.class))){
                   if (fALSE instanceof String) {
                      uBoolean = fALSE;
                   }
                   if (uBoolean != null) {
                      obj = uBoolean;
                   }
                   str = b.a().getString(str, obj);
                   obj = (str == null || !str.length())? 1: null;
                   if (!obj) {
                      if (str != null) {
                      }else {
                         throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                      }
                   }
                }else if(a.g(uod, m0.d(Integer.TYPE))){
                   if (fALSE instanceof Integer) {
                      uBoolean = fALSE;
                   }
                   i = (uBoolean != null)? uBoolean.intValue(): Integer.MIN_VALUE;
                   str = b.a().getInt(str, i);
                   if (str != Integer.MIN_VALUE) {
                      uBoolean1 = Integer.valueOf(str);
                   }
                }else if(a.g(uod, m0.d(Long.TYPE))){
                   if (fALSE instanceof Long) {
                      uBoolean = fALSE;
                   }
                   long l = (uBoolean != null)? uBoolean.longValue(): Long.MIN_VALUE;
                   l = b.a().getLong(str, l);
                   if (l - Long.MIN_VALUE) {
                      uBoolean1 = Long.valueOf(l);
                   }
                }else if(a.g(uod, m0.d(Float.TYPE))){
                   if (fALSE instanceof Float) {
                      uBoolean = fALSE;
                   }
                   obj = 1;
                   float f = (uBoolean != null)? uBoolean.floatValue(): Float.MIN_VALUE;
                   float floatx = b.a().getFloat(str, f);
                   if (floatx - obj) {
                      uBoolean1 = Float.valueOf(floatx);
                   }
                }
                fALSE = str;
             }catch(java.lang.Exception e0){
             }
          }
       }
       return false;
    }
}
