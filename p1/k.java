package p1.k;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import p1.k$c;
import java.lang.Math;
import android.graphics.Typeface;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Number;
import o1.c$b;
import java.lang.Long;
import android.content.Context;
import android.content.res.Resources;
import o1.c$c;
import p1.e;
import android.os.CancellationSignal;
import x1.f$b;
import android.content.ContentResolver;
import android.net.Uri;
import java.io.InputStream;
import java.io.Closeable;
import p1.l;
import java.io.File;
import p1.k$b;
import p1.k$a;

public class k	// class@0028a5
{
    public ConcurrentHashMap a;

    public void k(){
       super();
       this.a = new ConcurrentHashMap();
    }
    public static Object g(Object[] p0,int p1,k$c p2){
       int i = (!(p1 & 0x01))? 400: 700;
       p1 = (p1 & 0x02)? 1: 0;
       object oobject = null;
       int i1 = Integer.MAX_VALUE;
       int len = p0.length;
       int i2 = 0;
       while (i2 < len) {
          object oobject1 = p0[i2];
          int i3 = p2.a(oobject1) - i;
          i3 = Math.abs(i3) * 2;
          int i4 = (p2.b(oobject1) == p1)? 0: 1;
          i3 = i3 + i4;
          if (oobject == null || i1 > i3) {
             oobject = oobject1;
             i1 = i3;
          }
          i2 = i2 + 1;
       }
       return oobject;
    }
    public static long i(Typeface p0){
       long l = 0;
       if (p0 == null) {
          return l;
       }
       try{
          Field declaredFiel = Typeface.class.getDeclaredField("native_instance");
          declaredFiel.setAccessible(true);
          l = declaredFiel.get(p0).longValue();
          return e0;
       }catch(java.lang.NoSuchFieldException e0){
       }catch(java.lang.IllegalAccessException e0){
       }
    }
    public final void a(Typeface p0,c$b p1){
       long l = k.i(p0);
       if (l) {
          this.a.put(Long.valueOf(l), p1);
       }
       return;
    }
    public Typeface b(Context p0,c$b p1,Resources p2,int p3){
       c$c uoc = this.f(p1, p3);
       if (uoc == null) {
          return null;
       }
       Typeface typeface = e.d(p0, p2, uoc.b(), uoc.a(), p3);
       this.a(typeface, p1);
       return typeface;
    }
    public Typeface c(Context p0,CancellationSignal p1,f$b[] p2,int p3){
       Closeable uCloseable;
       if (p2.length < 1) {
          return null;
       }
       f$b uob = this.h(p2, p3);
       try{
          InputStream inputStream = p0.getContentResolver().openInputStream(uob.d());
          try{
             l.a(inputStream);
             return this.d(p0, inputStream);
          }catch(java.io.IOException e0){
             l.a(uCloseable);
             return e0;
          }
       }catch(java.io.IOException e0){
          uCloseable = e0;
          goto label_0027 ;
       }
    }
    public Typeface d(Context p0,InputStream p1){
       File uFile = l.e(p0);
       if (uFile == null) {
          return null;
       }
       try{
          if (!l.d(uFile, p1)) {
             uFile.delete();
             return null;
          }else {
             uFile.delete();
             return Typeface.createFromFile(uFile.getPath());
          }
       }catch(java.lang.RuntimeException e0){
          uFile.delete();
          return e0;
       }
    }
    public Typeface e(Context p0,Resources p1,int p2,String p3,int p4){
       File uFile = l.e(p0);
       if (uFile == null) {
          return null;
       }
       try{
          if (!l.c(uFile, p1, p2)) {
             uFile.delete();
             return null;
          }else {
             uFile.delete();
             return Typeface.createFromFile(uFile.getPath());
          }
       }catch(java.lang.RuntimeException e0){
          uFile.delete();
          return null;
       }
    }
    public final c$c f(c$b p0,int p1){
       return k.g(p0.a(), p1, new k$b(this));
    }
    public f$b h(f$b[] p0,int p1){
       return k.g(p0, p1, new k$a(this));
    }
}
