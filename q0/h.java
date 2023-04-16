package q0.h;
import android.content.res.Resources;
import android.os.Build$VERSION;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Object;
import java.util.Map;
import android.util.LongSparseArray;

public class h	// class@002945
{
    public static Field a;
    public static boolean b;
    public static Class c;
    public static boolean d;
    public static Field e;
    public static boolean f;
    public static Field g;
    public static boolean h;

    public static void a(Resources p0){
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 28) {
          return;
       }
       if (sDK_INT >= 24) {
          h.d(p0);
       }else if(sDK_INT >= 23){
          h.c(p0);
       }else {
          h.b(p0);
       }
       return;
    }
    public static void b(Resources p0){
       Field a;
       Map map;
       if (!h.b) {
          boolean b = true;
          try{
             Field declaredFiel = Resources.class.getDeclaredField("mDrawableCache");
             h.a = declaredFiel;
             declaredFiel.setAccessible(b);
             h.b = e0;
          }catch(java.lang.NoSuchFieldException e0){
          }
       }
    }
    public static void c(Resources p0){
       Object obj;
       if (!h.b) {
          boolean b = true;
          try{
             Field declaredFiel = Resources.class.getDeclaredField("mDrawableCache");
             h.a = declaredFiel;
             declaredFiel.setAccessible(b);
             h.b = e0;
          }catch(java.lang.NoSuchFieldException e0){
          }
       }
    }
    public static void d(Resources p0){
       Object obj;
       if (!h.h) {
          try{
             Field declaredFiel = Resources.class.getDeclaredField("mResourcesImpl");
             h.g = declaredFiel;
             declaredFiel.setAccessible(true);
             h.h = true;
          }catch(java.lang.NoSuchFieldException e0){
          }
       }
    }
    public static void e(Object p0){
       Class c;
       Field declaredFiel;
       LongSparseArray longSparseAr;
       boolean b = true;
       if (!h.d) {
          try{
             h.c = Class.forName("android.content.res.ThemedResourceCache");
             h.d = b;
          }catch(java.lang.ClassNotFoundException e0){
          }
       }
    }
}
