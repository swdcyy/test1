package com.gifshow.kanim.b;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import java.util.concurrent.Callable;
import bh.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import dh.a;
import bh.i;
import com.gifshow.kanim.b$a;
import java.util.Map;
import com.gifshow.kanim.b$b;
import bh.n;
import com.gifshow.kanim.b$c;
import android.content.Context;
import com.gifshow.kanim.b$e;
import bh.e;
import java.util.zip.ZipInputStream;
import android.content.res.AssetManager;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.lang.Throwable;
import java.lang.Boolean;
import okio.n;
import okio.l;
import okio.d;
import com.gifshow.kanim.parser.moshi.JsonReader;
import java.io.Closeable;
import ih.c;
import fh.b;
import java.lang.StringBuilder;
import com.gifshow.kanim.b$d;
import com.gifshow.kanim.network.f;
import bh.a;
import java.util.zip.ZipEntry;
import java.lang.CharSequence;
import java.lang.IllegalArgumentException;

public class b	// class@0015ba
{
    public static final Map a;
    public static final byte[] b;

    static {
       b.a = new HashMap();
       b.b = new byte[4]{'P','K',0x03,0x04};
    }
    public void b(){
       super();
    }
    public static g a(String p0,Callable p1){
       i oi = null;
       Map obj = PatchProxy.applyTwoRefs(p0, p1, oi, b.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          oi = a.b().a(p0);
       }
       if (oi != null) {
          return new g(new b$a(oi));
       }else if(p0 != null){
          obj = b.a;
          if (obj.containsKey(p0)) {
             return obj.get(p0);
          }
       }
       g og = new g(p1);
       if (p0 != null) {
          og.b(new b$b(p0));
          og.a(new b$c(p0));
          b.a.put(p0, og);
       }
       return og;
    }
    public static g b(Context p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(p2, new b$e(p0.getApplicationContext(), p1, p2));
    }
    public static e c(Context p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          if (p1.endsWith(".zip")) {
             return b.i(new ZipInputStream(SplitAssetHelper.open(p0.getAssets(), p1)), p2);
          }
          return b.d(SplitAssetHelper.open(p0.getAssets(), p1), p2);
       }catch(java.io.IOException e6){
          return new e(e6);
       }
    }
    public static e d(InputStream p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       JsonReader obj = PatchProxy.applyTwoRefs(p0, p1, null, uob, "20");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.TRUE, null, b.class, "21");
          if (obj != patchProxyRe) {
          label_0049 :
             return obj;
          }
       }
       obj = JsonReader.r(l.d(l.k(p0)));
       Object obj1 = PatchProxy.applyTwoRefs(obj, p1, null, uob, "25");
       e uoe = (obj1 != patchProxyRe)? obj1: b.e(obj, p1, true);
       c.a(p0);
       goto label_0049 ;
    }
    public static e e(JsonReader p0,String p1,boolean p2){
       i obj;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, b.class, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          obj = b.a(p0);
          if (p1 != null) {
             a.b().c(p1, obj);
          }
          e uoe1 = new e(obj);
          if (p2) {
             c.a(p0);
          }
          return uoe1;
       }catch(java.lang.Exception e8){
          e uoe = new e(e8);
          if (p2) {
             c.a(p0);
          }
          return uoe;
       }
    }
    public static g f(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.g(p0, p1, "url_"+p1);
    }
    public static g g(Context p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(p2, new b$d(p0, p1, p2));
    }
    public static e h(Context p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       e uoe = a.b(p0).a(p1, p2);
       if (p2 != null && uoe.b() != null) {
          a.b().c(p2, uoe.b());
       }
       return uoe;
    }
    public static e i(ZipInputStream p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c.a(p0);
       return b.j(p0, p1);
    }
    public static e j(ZipInputStream p0,String p1){
       HashMap obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new HashMap();
          Object obj1 = null;
          for (ZipEntry nextEntry = p0.getNextEntry(); nextEntry != null; nextEntry = p0.getNextEntry()) {
             if ((nextEntry.getName()).contains("__MACOSX")) {
                p0.closeEntry();
             }else if((nextEntry.getName()).equalsIgnoreCase("manifest.json")){
                p0.closeEntry();
             }else if((nextEntry.getName()).contains(".json")){
                obj1 = b.e(JsonReader.r(l.d(l.k(p0))), null, false).b();
             }else {
                p0.closeEntry();
             }
          }
          if (obj1 == null) {
             return new e(new IllegalArgumentException("Unable to parse composition"));
          }
          if (p1 != null) {
             a.b().c(p1, obj1);
          }
          return new e(obj1);
       }catch(java.io.IOException e5){
          return new e(e5);
       }
    }
}
