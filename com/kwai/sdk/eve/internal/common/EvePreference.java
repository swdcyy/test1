package com.kwai.sdk.eve.internal.common.EvePreference;
import en7.q;
import com.kwai.sdk.eve.internal.common.EvePreference$a;
import nsd.u;
import vm7.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.common.EvePreference$rawGson$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.content.Context;
import android.content.SharedPreferences;
import oe6.o;
import java.lang.RuntimeException;
import rn7.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import zsd.u;
import vsd.d;
import nsd.m0;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import com.google.gson.Gson;
import com.kwai.sdk.eve.internal.common.utils.DataKt;
import java.lang.Throwable;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import java.lang.IllegalArgumentException;
import java.util.List;
import com.kwai.sdk.eve.internal.common.EvePreference$b;
import java.lang.reflect.Type;
import el.a;
import java.util.Map;
import com.kwai.sdk.eve.internal.common.EvePreference$c;

public final class EvePreference extends q	// class@001471
{
    public final p a;
    public final SharedPreferences b;
    public static final EvePreference$a c;

    static {
       EvePreference.c = new EvePreference$a(null);
    }
    public void EvePreference(a p0){
       a.p(p0, "context");
       super();
       this.a = s.c(EvePreference$rawGson$2.INSTANCE);
       Context uContext = p0.a();
       if (uContext != null) {
          SharedPreferences sharedPrefer = o.c(uContext, "EveDefaultPreference", 0);
          if (sharedPrefer != null) {
             this.b = sharedPrefer;
             return;
          }
       }
       throw new RuntimeException();
    }
    public SharedPreferences a(){
       return this.b;
    }
    public final d c(){
       Boolean tRUE;
       String str = String.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, EvePreference.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "KEY_EVE_SERVER_PACKAGE_RESPONSE";
       if (u.S1(obj)) {
          throw new IllegalArgumentException("pref key is empty");
       }
       d uod = m0.d(str);
       if (a.g(uod, m0.d(Boolean.TYPE))) {
          if (this.a().getBoolean(obj, false)) {
             tRUE = Boolean.TRUE;
          label_00c5 :
             d uod1 = DataKt.a().h(tRUE, d.class);
             return uod1;
          }
       }else if(a.g(uod, m0.d(str))){
          tRUE = this.a().getString(obj, "");
          obj = (tRUE == null || !tRUE.length())? 1: null;
          if (!obj) {
             Objects.requireNonNull(tRUE, "null cannot be cast to non-null type kotlin.String");
             goto label_00c5 ;
          }
       }else if(a.g(uod, m0.d(Integer.TYPE))){
          int i = Integer.MIN_VALUE;
          int intx = this.a().getInt(obj, i);
          if (intx != i) {
             tRUE = Integer.valueOf(intx);
             goto label_00c5 ;
          }
       }else if(a.g(uod, m0.d(Long.TYPE))){
          long l = Long.MIN_VALUE;
          long longx = this.a().getLong(obj, l);
          if (longx - l) {
             tRUE = Long.valueOf(longx);
             goto label_00c5 ;
          }
       }else if(a.g(uod, m0.d(Float.TYPE))){
          float floatx = this.a().getFloat(obj, Float.MIN_VALUE);
          if (floatx - Float.MIN_VALUE) {
             tRUE = Float.valueOf(floatx);
             goto label_00c5 ;
          }
       }
       tRUE = objArray;
       goto label_00c5 ;
    }
    public final List d(){
       Boolean tRUE;
       String str = String.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, EvePreference.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "KEY_EVE_TASK_PACKAGE_LIST";
       if (u.S1(obj)) {
          throw new IllegalArgumentException("pref key is empty");
       }
       d uod = m0.d(str);
       if (a.g(uod, m0.d(Boolean.TYPE))) {
          if (this.a().getBoolean(obj, false)) {
             tRUE = Boolean.TRUE;
          label_00c5 :
             List list = DataKt.a().i(tRUE, new EvePreference$b().getType());
             return list;
          }
       }else if(a.g(uod, m0.d(str))){
          tRUE = this.a().getString(obj, "");
          obj = (tRUE == null || !tRUE.length())? 1: null;
          if (!obj) {
             Objects.requireNonNull(tRUE, "null cannot be cast to non-null type kotlin.String");
             goto label_00c5 ;
          }
       }else if(a.g(uod, m0.d(Integer.TYPE))){
          int i = Integer.MIN_VALUE;
          int intx = this.a().getInt(obj, i);
          if (intx != i) {
             tRUE = Integer.valueOf(intx);
             goto label_00c5 ;
          }
       }else if(a.g(uod, m0.d(Long.TYPE))){
          long l = Long.MIN_VALUE;
          long longx = this.a().getLong(obj, l);
          if (longx - l) {
             tRUE = Long.valueOf(longx);
             goto label_00c5 ;
          }
       }else if(a.g(uod, m0.d(Float.TYPE))){
          float floatx = this.a().getFloat(obj, Float.MIN_VALUE);
          if (floatx - Float.MIN_VALUE) {
             tRUE = Float.valueOf(floatx);
             goto label_00c5 ;
          }
       }
       tRUE = objArray;
       goto label_00c5 ;
    }
    public final Gson e(){
       Object obj = PatchProxy.apply(null, this, EvePreference.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final void f(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EvePreference.class, "7")) {
          return;
       }
       this.b("pack_state_by_version", this.e().r(p0, new EvePreference$c().getType()));
       return;
    }
}
