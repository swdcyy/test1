package com.kwai.sdk.eve.internal.statistics.CoverageStats$a;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.statistics.CoverageStats;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.sdk.eve.internal.common.EvePreference;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import java.lang.CharSequence;
import zsd.u;
import vsd.d;
import nsd.m0;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import com.google.gson.Gson;
import vm7.b;
import java.lang.reflect.Type;
import el.a;
import java.lang.Throwable;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import java.util.LinkedHashMap;
import java.lang.IllegalArgumentException;

public final class CoverageStats$a implements Runnable	// class@0015a8
{
    public final CoverageStats b;

    public void CoverageStats$a(CoverageStats p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Boolean tRUE;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CoverageStats$a.class, "1")) {
          return;
       }
       CoverageStats f = this.b.f;
       Objects.requireNonNull(f);
       String str = String.class;
       Map map = PatchProxy.apply(objArray, f, EvePreference.class, "6");
       if (map != PatchProxyResult.class) {
       }else {
          String str1 = "pack_state_by_version";
          if (!u.S1(str1)) {
             d uod = m0.d(str);
             if (a.g(uod, m0.d(Boolean.TYPE))) {
                if (f.a().getBoolean(str1, false)) {
                   tRUE = Boolean.TRUE;
                label_00d7 :
                   Map map1 = f.e().i(tRUE, new b().getType());
                   map = map1;
                }
             }else if(a.g(uod, m0.d(str))){
                tRUE = f.a().getString(str1, "");
                str1 = (tRUE == null || !tRUE.length())? 1: null;
                if (!str1) {
                   Objects.requireNonNull(tRUE, "null cannot be cast to non-null type kotlin.String");
                   goto label_00d7 ;
                }
             }else if(a.g(uod, m0.d(Integer.TYPE))){
                int i = Integer.MIN_VALUE;
                int intx = f.a().getInt(str1, i);
                if (intx != i) {
                   tRUE = Integer.valueOf(intx);
                   goto label_00d7 ;
                }
             }else if(a.g(uod, m0.d(Long.TYPE))){
                long longx = f.a().getLong(str1, Long.MIN_VALUE);
                if (longx - Long.MIN_VALUE) {
                   tRUE = Long.valueOf(longx);
                   goto label_00d7 ;
                }
             }else if(a.g(uod, m0.d(Float.TYPE))){
                float floatx = f.a().getFloat(str1, Float.MIN_VALUE);
                if (floatx - Float.MIN_VALUE) {
                   tRUE = Float.valueOf(floatx);
                   goto label_00d7 ;
                }
             }
             tRUE = objArray;
             goto label_00d7 ;
          }else {
             throw new IllegalArgumentException("pref key is empty");
          }
       }
       if (map != null) {
          this.b.a.putAll(map);
       }
       return;
    }
}
