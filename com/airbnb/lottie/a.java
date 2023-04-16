package com.airbnb.lottie.a;
import java.util.HashMap;
import java.lang.String;
import java.util.concurrent.Callable;
import com.airbnb.lottie.LottieTask;
import p5.f;
import w4.e;
import com.airbnb.lottie.a$f;
import java.lang.Object;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import w4.g;
import w4.j;
import w4.f;
import android.content.Context;
import com.airbnb.lottie.a$b;
import com.airbnb.lottie.network.FileExtension;
import java.lang.StringBuilder;
import java.util.zip.ZipInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.Exception;
import com.airbnb.lottie.a$d;
import w4.m;
import android.util.JsonReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Closeable;
import v5.f;
import u5.n;
import java.lang.Throwable;
import com.airbnb.lottie.a$c;
import com.airbnb.lottie.a$a;
import com.airbnb.lottie.a$e;
import java.util.zip.ZipEntry;
import java.lang.CharSequence;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.lang.IllegalArgumentException;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Collection;
import w4.i;
import android.graphics.BitmapFactory$Options;
import android.util.Base64;
import java.lang.IllegalStateException;

public class a	// class@000d96
{
    public static final Map a;

    static {
       a.a = new HashMap();
    }
    public static LottieTask a(String p0,Callable p1){
       Map a;
       e uoe = (p0 == null)? null: f.c().b(p0);
       if (uoe != null) {
          return new LottieTask(new a$f(uoe));
       }else if(p0 != null){
          a = a.a;
          if (a.containsKey(p0)) {
             return a.get(p0);
          }
       }
       LottieTask lottieTask = new LottieTask(p1);
       if (p0 != null) {
          AtomicBoolean uAtomicBoole = new AtomicBoolean(false);
          lottieTask.addListener(new g(p0, uAtomicBoole));
          lottieTask.addFailureListener(new f(p0, uAtomicBoole));
          if (!uAtomicBoole.get()) {
             a.a.put(p0, lottieTask);
          }
       }
       return lottieTask;
    }
    public static LottieTask b(Context p0,String p1){
       return a.a(p1, new a$b(p0.getApplicationContext(), p1));
    }
    public static LottieTask c(String p0){
       LottieTask lottieTask;
       FileExtension uFileExtensi = FileExtension.forFile(p0);
       try{
          String str = "file_"+p0;
          lottieTask = (uFileExtensi == FileExtension.ZIP)? a.j(new ZipInputStream(new FileInputStream(p0)), str): a.d(new FileInputStream(p0), str);
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
          lottieTask = null;
       }
       return lottieTask;
    }
    public static LottieTask d(InputStream p0,String p1){
       return a.a(p1, new a$d(p0, p1));
    }
    public static m e(InputStream p0,String p1){
       f.b(p0);
       return a.f(new JsonReader(new InputStreamReader(p0)), p1);
    }
    public static m f(JsonReader p0,String p1){
       return a.g(p0, p1, true);
    }
    public static m g(JsonReader p0,String p1,boolean p2){
       try{
          e uoe = n.a(p0);
          f.c().d(p1, uoe);
          m om = new m(uoe);
          if (p2) {
             f.b(p0);
          }
          return om;
       }catch(java.lang.Exception e3){
          m om1 = new m(e3);
          if (p2) {
             f.b(p0);
          }
          return om1;
       }
    }
    public static LottieTask h(Context p0,int p1){
       return a.a(a.m(p1), new a$c(p0.getApplicationContext(), p1));
    }
    public static LottieTask i(Context p0,String p1){
       return a.a("url_"+p1, new a$a(p0, p1));
    }
    public static LottieTask j(ZipInputStream p0,String p1){
       return a.a(p1, new a$e(p0, p1));
    }
    public static m k(ZipInputStream p0,String p1){
       f.b(p0);
       return a.l(p0, p1);
    }
    public static m l(ZipInputStream p0,String p1){
       i oi;
       Map$Entry uEntry1;
       try{
          HashMap hashMap = new HashMap();
          ZipEntry nextEntry = p0.getNextEntry();
          String str = null;
          e uoe = str;
          int b = false;
          while (nextEntry != null) {
             if ((nextEntry.getName()).contains("__MACOSX")) {
                p0.closeEntry();
             }else if((nextEntry.getName()).contains(".json")){
                uoe = a.g(new JsonReader(new InputStreamReader(p0)), str, b).b();
             }else if((nextEntry.getName()).contains(".png") || (nextEntry.getName()).contains(".webp")){
                String[] stringArray = (nextEntry.getName()).split("/");
                b = stringArray.length - 1;
                hashMap.put(stringArray[b], BitmapFactory.decodeStream(p0));
             }else {
                p0.closeEntry();
             }
             nextEntry = p0.getNextEntry();
          }
          if (uoe == null) {
             return new m(new IllegalArgumentException("Unable to parse composition"));
          }
          Iterator iterator = hashMap.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             Iterator iterator1 = uoe.g().values().iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   oi = iterator1.next();
                   if (!(oi.c()).equals(key)) {
                      continue ;
                   }
                }else {
                   oi = str;
                }
                if (oi != null) {
                   oi.f(f.e(uEntry.getValue(), oi.e(), oi.d()));
                }else {
                   continue ;
                }
             }
          }
          if (hashMap.isEmpty()) {
             iterator = uoe.g().entrySet().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   i value = iterator.next().getValue();
                   if (value == null) {
                      break ;
                   }else {
                      String str1 = value.c();
                      BitmapFactory$Options options = new BitmapFactory$Options();
                      options.inScaled = true;
                      options.inDensity = 160;
                      if (str1.startsWith("data:") && str1.indexOf("base64,") > 0) {
                         int i = 44;
                         try{
                            i = str1.indexOf(i) + 1;
                            byte[] uobyteArray = Base64.decode(str1.substring(i), b);
                            value.f(BitmapFactory.decodeByteArray(uobyteArray, b, uobyteArray.length, options));
                         }catch(java.lang.IllegalArgumentException e0){
                            return str;
                         }
                      }
                   }
                }
             }
             return str;
          }
          iterator = uoe.g().entrySet().iterator();
          while (true) {
             if (iterator.hasNext()) {
                uEntry1 = iterator.next();
                if (uEntry1.getValue().a() == null) {
                }else {
                   continue ;
                }
             }else {
                f.c().d(p1, uoe);
                return new m(uoe);
             }
          }
          return new m(new IllegalStateException("There is no image for "+uEntry1.getValue().c()));
       }catch(java.io.IOException e10){
          return new m(e10);
       }
    }
    public static String m(int p0){
       return "rawRes_"+p0;
    }
}
