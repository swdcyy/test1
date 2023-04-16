package com.airbnb.lottie.ex.a;
import java.util.HashMap;
import java.lang.String;
import java.util.concurrent.Callable;
import a5.m;
import g5.f;
import java.lang.Object;
import java.util.Objects;
import androidx.collection.LruCache;
import a5.e;
import com.airbnb.lottie.ex.a$c;
import java.util.Map;
import com.airbnb.lottie.ex.a$a;
import a5.h;
import com.airbnb.lottie.ex.a$b;
import java.io.InputStream;
import a5.k;
import android.util.JsonReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Closeable;
import m5.f;
import l5.n;
import java.lang.Throwable;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipEntry;
import java.lang.CharSequence;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.lang.IllegalArgumentException;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Collection;
import a5.g;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public class a	// class@000da2
{
    public static final Map a;

    static {
       a.a = new HashMap();
    }
    public static m a(String p0,Callable p1){
       e uoe;
       Map a;
       if (p0 == null) {
          uoe = null;
       }else {
          f uof = f.a();
          Objects.requireNonNull(uof);
          uoe = uof.a.get(p0);
       }
       if (uoe != null) {
          return new m(new a$c(uoe));
       }else if(p0 != null){
          a = a.a;
          if (a.containsKey(p0)) {
             return a.get(p0);
          }
       }
       m om = new m(p1);
       om.b(new a$a(p0));
       om.a(new a$b(p0));
       a.a.put(p0, om);
       return om;
    }
    public static k b(InputStream p0,String p1){
       f.b(p0);
       return a.c(new JsonReader(new InputStreamReader(p0)), p1);
    }
    public static k c(JsonReader p0,String p1){
       return a.d(p0, p1, true);
    }
    public static k d(JsonReader p0,String p1,boolean p2){
       try{
          e uoe = n.a(p0);
          f.a().b(p1, uoe);
          k ok = new k(uoe);
          if (p2) {
             f.b(p0);
          }
          return ok;
       }catch(java.lang.Exception e3){
          k ok1 = new k(e3);
          if (p2) {
             f.b(p0);
          }
          return ok1;
       }
    }
    public static k e(ZipInputStream p0,String p1){
       f.b(p0);
       return a.f(p0, p1);
    }
    public static k f(ZipInputStream p0,String p1){
       Map$Entry uEntry;
       g og;
       try{
          HashMap hashMap = new HashMap();
          String str = null;
          e uoe = str;
          for (ZipEntry nextEntry = p0.getNextEntry(); nextEntry != null; nextEntry = p0.getNextEntry()) {
             if ((nextEntry.getName()).contains("__MACOSX")) {
                p0.closeEntry();
             }else if((nextEntry.getName()).contains(".json")){
                uoe = a.d(new JsonReader(new InputStreamReader(p0)), str, false).b();
             }else if((nextEntry.getName()).contains(".png")){
                String[] stringArray = (nextEntry.getName()).split("/");
                int i = stringArray.length - 1;
                hashMap.put(stringArray[i], BitmapFactory.decodeStream(p0));
             }else {
                p0.closeEntry();
             }
          }
          if (uoe == null) {
             return new k(new IllegalArgumentException("Unable to parse composition"));
          }
          Iterator iterator = hashMap.entrySet().iterator();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             String key = uEntry.getKey();
             Iterator iterator1 = uoe.g().values().iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   og = iterator1.next();
                   if (!(og.b()).equals(key)) {
                      continue ;
                   }
                }else {
                   og = str;
                }
                if (og != null) {
                   og.e(uEntry.getValue());
                }else {
                   continue ;
                }
             }
          }
          iterator = uoe.g().entrySet().iterator();
          while (true) {
             if (iterator.hasNext()) {
                uEntry = iterator.next();
                if (uEntry.getValue().a() == null) {
                   break ;
                }
             }else {
                f.a().b(p1, uoe);
                return new k(uoe);
             }
          }
          return new k(new IllegalStateException("There is no image for "+uEntry.getValue().b()));
       }catch(java.io.IOException e7){
          return new k(e7);
       }
    }
    public static String g(int p0){
       return "rawRes_"+p0;
    }
}
