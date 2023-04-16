package p1.e;
import android.os.Build$VERSION;
import p1.j;
import p1.i;
import p1.h;
import p1.g;
import p1.f;
import androidx.collection.LruCache;
import android.content.Context;
import android.graphics.Typeface;
import java.lang.IllegalArgumentException;
import java.lang.String;
import android.os.CancellationSignal;
import x1.f$b;
import p1.k;
import o1.c$a;
import android.content.res.Resources;
import o1.f$a;
import android.os.Handler;
import o1.c$d;
import p1.e$a;
import x1.d;
import x1.f$c;
import x1.f;
import o1.c$b;
import java.lang.Object;
import java.lang.StringBuilder;

public class e	// class@00289c
{
    public static final k a;
    public static final LruCache b;

    static {
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 29) {
          e.a = new j();
       }else if(sDK_INT >= 28){
          e.a = new i();
       }else if(sDK_INT >= 26){
          e.a = new h();
       }else if(sDK_INT >= 24 && g.l()){
          e.a = new g();
       }else {
          e.a = new f();
       }
       e.b = new LruCache(16);
    }
    public static Typeface a(Context p0,Typeface p1,int p2){
       if (p0 != null) {
          return Typeface.create(p1, p2);
       }
       throw new IllegalArgumentException("Context cannot be null");
    }
    public static Typeface b(Context p0,CancellationSignal p1,f$b[] p2,int p3){
       return e.a.c(p0, p1, p2, p3);
    }
    public static Typeface c(Context p0,c$a p1,Resources p2,int p3,int p4,f$a p5,Handler p6,boolean p7){
       boolean b;
       Typeface typeface1;
       if (p1 instanceof c$d) {
          Typeface typeface = e.g(p1.c());
          if (typeface != null) {
             if (p5 != null) {
                p5.b(typeface, p6);
             }
             return typeface;
          }else if(p7){
             if (!p1.a()) {
             label_0021 :
                b = true;
             label_0026 :
                int i = (p7)? p1.d(): -1;
                typeface1 = f.c(p0, p1.b(), p4, b, i, f$a.c(p6), new e$a(p5));
             }
          }else if(p5 == null){
             goto label_0021 ;
          }
          b = false;
          goto label_0026 ;
       }else {
          typeface1 = e.a.b(p0, p1, p2, p4);
          if (p5 != null) {
             if (typeface1 != null) {
                p5.b(typeface1, p6);
             }else {
                p5.a(-3, p6);
             }
          }
       }
       if (typeface1 != null) {
          e.b.put(e.e(p2, p3, p4), typeface1);
       }
       return typeface1;
    }
    public static Typeface d(Context p0,Resources p1,int p2,String p3,int p4){
       Typeface typeface = e.a.e(p0, p1, p2, p3, p4);
       if (typeface != null) {
          e.b.put(e.e(p1, p2, p4), typeface);
       }
       return typeface;
    }
    public static String e(Resources p0,int p1,int p2){
       return p0.getResourcePackageName(p1)+"-"+p1+"-"+p2;
    }
    public static Typeface f(Resources p0,int p1,int p2){
       return e.b.get(e.e(p0, p1, p2));
    }
    public static Typeface g(String p0){
       Typeface typeface = null;
       if (p0 != null && !p0.isEmpty()) {
          Typeface typeface1 = Typeface.create(p0, 0);
          Typeface typeface2 = Typeface.create(Typeface.DEFAULT, 0);
          if (typeface1 != null && !typeface1.equals(typeface2)) {
             typeface = typeface1;
          }
       }
       return typeface;
    }
}
