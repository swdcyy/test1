package com.kwai.framework.config.DiffInfoJsonStore;
import gb6.d;
import com.kwai.framework.config.DiffInfoJsonStore$a;
import nsd.u;
import java.lang.Object;
import com.kwai.framework.config.DiffInfoJsonStore$sp$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import java.lang.String;
import com.google.gson.JsonObject;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;
import java.lang.Long;
import java.lang.Boolean;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Number;
import zsd.d;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.Reader;
import com.google.gson.JsonElement;
import com.google.gson.c;
import java.lang.NullPointerException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.utility.Log;

public abstract class DiffInfoJsonStore implements d	// class@0014fa
{
    public final p a;
    public final String b;
    public static final DiffInfoJsonStore$a c;

    static {
       DiffInfoJsonStore.c = new DiffInfoJsonStore$a(null);
    }
    public void DiffInfoJsonStore(){
       super();
       this.a = s.c(new DiffInfoJsonStore$sp$2(this));
       this.b = this.getClass().getSimpleName();
    }
    public JsonObject a(){
       Object obj = PatchProxy.apply(null, this, DiffInfoJsonStore.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h("full_data");
    }
    public String b(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, DiffInfoJsonStore.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "def");
       obj = this.j().getString("diff_info", p0);
       if (obj != null) {
          p0 = obj;
       }
       return p0;
    }
    public boolean c(long p0){
       DiffInfoJsonStore uDiffInfoJso = DiffInfoJsonStore.class;
       if (PatchProxy.isSupport(uDiffInfoJso)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uDiffInfoJso, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return g.b(this.j().edit().putLong("ts", p0));
    }
    public JsonObject d(){
       Object obj = PatchProxy.apply(null, this, DiffInfoJsonStore.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h("diff_info");
    }
    public boolean e(JsonObject p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DiffInfoJsonStore.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.k("diff_info", p0);
    }
    public boolean f(JsonObject p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DiffInfoJsonStore.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.k("full_data", p0);
    }
    public long g(long p0){
       DiffInfoJsonStore uDiffInfoJso = DiffInfoJsonStore.class;
       if (PatchProxy.isSupport(uDiffInfoJso)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uDiffInfoJso, "8");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return this.j().getLong("ts", p0);
    }
    public final JsonObject h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DiffInfoJsonStore.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "name");
       p0 = this.j().getString(p0, null);
       Charset uCharset = (p0 == null || !p0.length())? 1: null;
       if (uCharset) {
          return null;
       }else {
          uCharset = d.a;
          if (p0 != null) {
             byte[] bytes = p0.getBytes(uCharset);
             a.o(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
             ByteArrayInputStream uByteArrayIn = new ByteArrayInputStream(bytes);
             JsonElement jsonElement = c.c(new InputStreamReader(uByteArrayIn, uCharset));
             a.o(jsonElement, "JsonParser.parseReader\(j¡­teInputStream\(\).reader\(\)\)");
             return jsonElement.r();
          }else {
             throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
          }
       }
    }
    public abstract String i();
    public final SharedPreferences j(){
       Object obj = PatchProxy.apply(null, this, DiffInfoJsonStore.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final boolean k(String p0,JsonObject p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DiffInfoJsonStore.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "name");
       if (p1 == null) {
          this.j().edit().remove(p0);
       }else {
          g.b(this.j().edit().putString(p0, p1.toString()));
       }
       return true;
    }
}
