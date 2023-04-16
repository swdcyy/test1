package ob6.u;
import gb6.d;
import java.lang.Object;
import ob6.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import al0.a;
import com.yxcorp.utility.Log;
import e66.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import android.os.Trace;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.io.FilesKt__FileReadWriteKt;
import java.lang.Boolean;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.c;
import java.lang.Long;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Number;
import zk.d;
import com.kwai.framework.model.Stag$Factory;
import zk.j;
import com.kwai.framework.network.Stag$Factory;
import ekd.e0;
import android.content.Context;
import android.content.res.Resources;
import java.io.InputStream;
import isd.a;
import java.io.InputStreamReader;
import java.io.ByteArrayInputStream;
import java.io.Reader;
import java.io.Closeable;
import isd.b;
import java.lang.Exception;

public final class u implements d	// class@001ffc
{
    public static h a;
    public static Gson b;
    public static boolean c;
    public static final u d;

    static {
       u.d = new u();
    }
    public void u(){
       super();
    }
    public static synchronized final h i(){
       h oh = h.class;
       _monitor_enter(u.class);
       Object[] objArray = null;
       h obj = PatchProxy.apply(objArray, objArray, u.class, "1");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(u.class);
          return obj;
       }else {
          obj = u.a;
          if (obj != null) {
             _monitor_exit(u.class);
             return obj;
          }else {
             String str = u.k();
             boolean b = true;
             String str1 = (str == null || !str.length())? 1: null;
             if (str1) {
                u.c = b;
                if (a.b() >= 3) {
                   Log.g("KeyConfigStore", "read from old sp");
                   str = a.a.getString("KeyConfig", "");
                   if (str != null && str != "") {
                      objArray = b.a(str, oh);
                   }
                   u.a = objArray;
                }
                if (u.a == null) {
                   u.a = u.d.l();
                }
             }else {
                Trace.beginSection("KeyConfigStore#parseFromJson\(\)");
                oh = u.d.h().h(str, oh);
                u.a = oh;
                Trace.endSection();
             }
             oh = u.a;
             a.m(oh);
             _monitor_exit(u.class);
             return oh;
          }
       }
    }
    public static synchronized final String k(){
       _monitor_enter(u.class);
       Object[] objArray = null;
       File obj = PatchProxy.apply(objArray, objArray, u.class, "10");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(u.class);
          return obj;
       }else {
          Trace.beginSection("KeyConfigStore#readConfigFile\(\)");
          obj = u.d.j();
          if (obj != null) {
             if (!obj.exists()) {
                Object[] objArray1 = objArray;
             }
             if (obj != null) {
                objArray = FilesKt__FileReadWriteKt.z(obj, objArray, 1, objArray);
             }
          }
          Trace.endSection();
          _monitor_exit(u.class);
          return objArray;
       }
    }
    public static final boolean m(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, u.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       File uFile = u.d.j();
       if (uFile == null) {
          return false;
       }
       FilesKt__FileReadWriteKt.G(uFile, p0, null, 2, null);
       return true;
    }
    public JsonObject a(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, u.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = u.k();
       if (obj != null) {
          String str = (obj.length() > 0)? 1: null;
          if (str) {
             JsonElement jsonElement = c.d(obj);
             a.o(jsonElement, "JsonParser.parseString\(it\)");
             objArray = jsonElement.r();
          }
       }
       return objArray;
    }
    public String b(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, u.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "def");
       obj = a.b();
       if (obj != null) {
          p0 = obj;
       }
       return p0;
    }
    public boolean c(long p0){
       SharedPreferences$Editor obj;
       u ou = u.class;
       if (PatchProxy.isSupport(ou)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, ou, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = a.a.edit();
       obj.putLong("KeyConfigTS", p0);
       g.a(obj);
       return true;
    }
    public JsonObject d(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, u.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.b();
       if (obj != null) {
          String str = (obj.length() > 0)? 1: null;
          if (str) {
             JsonElement jsonElement = c.d(obj);
             a.o(jsonElement, "JsonParser.parseString\(it\)");
             objArray = jsonElement.r();
          }
       }
       return objArray;
    }
    public boolean e(JsonObject p0){
       String str;
       SharedPreferences$Editor obj = PatchProxy.applyOneRefs(p0, this, u.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          str = p0.toString();
          if (str != null) {
          label_001e :
             obj = a.a.edit();
             obj.putString("KeyConfigDiffInfo", str);
             g.a(obj);
             return true;
          }
       }
       str = "";
       goto label_001e ;
    }
    public boolean f(JsonObject p0){
       String str;
       Object obj = PatchProxy.applyOneRefs(p0, this, u.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          str = p0.toString();
          if (str != null) {
          label_001e :
             a.o(str, "jsonObject?.toString\(\) ?: \"\"");
             u.m(str);
             return true;
          }
       }
       str = "";
       goto label_001e ;
    }
    public long g(long p0){
       u ou = u.class;
       if (PatchProxy.isSupport(ou)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, ou, "8");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return a.a.getLong("KeyConfigTS", 0);
    }
    public synchronized final Gson h(){
       d obj = PatchProxy.apply(null, this, u.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (u.b == null) {
          Trace.beginSection("KeyConfigStore#createGson\(\)");
          obj = new d();
          obj.p = true;
          obj.j();
          obj.g(new Stag$Factory());
          obj.g(new Stag$Factory());
          u.b = obj.b();
          Trace.endSection();
       }
       Gson b = u.b;
       a.m(b);
       return b;
    }
    public final File j(){
       Context obj = PatchProxy.apply(null, this, u.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e0.b;
       a.o(obj, "GlobalConfig.CONTEXT");
       return new File(obj.getFilesDir(), "key_config.json");
    }
    public final h l(){
       Object[] objArray = null;
       Context obj = PatchProxy.apply(objArray, this, u.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e0.b;
       try{
          a.o(obj, "context");
          InputStream inputStream = obj.getResources().openRawResource(R.raw.arg_RES_7f0f0030);
          a.o(inputStream, "it");
          byte[] uobyteArray = a.p(inputStream);
          byte[] uobyteArray1 = new byte[uobyteArray.length];
          int len = uobyteArray.length;
          for (int i = 0; i < len; i = i + 1) {
             int i1 = uobyteArray[i] ^ 0x2b;
             uobyteArray1[i] = (byte)i1;
          }
          Object obj1 = u.d.h().f(new InputStreamReader(new ByteArrayInputStream(uobyteArray1)), h.class);
          a.o(obj1, "getGson\(\).fromJson\(\n    ¡­fig::class.java\n        \)");
          b.a(inputStream, objArray);
          return obj1;
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          if (!e0.a) {
             return new h();
          }
          throw e0;
       }
    }
}
