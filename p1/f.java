package p1.f;
import p1.k;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.reflect.Method;
import java.lang.RuntimeException;
import java.lang.Throwable;
import android.graphics.Typeface;
import java.lang.Class;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import android.content.Context;
import o1.c$b;
import android.content.res.Resources;
import o1.c$c;
import java.io.File;
import p1.l;
import android.os.CancellationSignal;
import x1.f$b;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileInputStream;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.lang.StringBuilder;
import android.system.Os;
import android.system.StructStat;
import android.system.OsConstants;

public class f extends k	// class@00289d
{
    public static Class b;
    public static Constructor c;
    public static Method d;
    public static Method e;
    public static boolean f;

    public void f(){
       super();
    }
    public static boolean j(Object p0,String p1,int p2,boolean p3){
       try{
          f.m();
          Object[] objArray = new Object[]{p1,Integer.valueOf(p2),Boolean.valueOf(p3)};
          return f.d.invoke(p0, objArray).booleanValue();
       }catch(java.lang.IllegalAccessException e3){
       }catch(java.lang.reflect.InvocationTargetException e3){
       }
       throw new RuntimeException(e3);
    }
    public static Typeface k(Object p0){
       try{
          f.m();
          Object obj = Array.newInstance(f.b, 1);
          Array.set(obj, 0, p0);
          Object[] objArray = new Object[]{obj};
          return f.e.invoke(null, objArray);
       }catch(java.lang.IllegalAccessException e4){
       }catch(java.lang.reflect.InvocationTargetException e4){
       }
       throw new RuntimeException(e4);
    }
    public static void m(){
       Class uClass;
       Method method1;
       Method method2;
       Constructor uConstructor;
       if (f.f) {
          return;
       }
       boolean b = true;
       f.f = b;
       Method method = null;
       try{
          uClass = Class.forName("android.graphics.FontFamily");
          Class[] uClassArray = new Class[0];
          Class[] uClassArray1 = new Class[]{String.class,Integer.TYPE,Boolean.TYPE};
          method1 = uClass.getMethod("addFontWeightStyle", uClassArray1);
          Class[] uClassArray2 = new Class[b];
          uClassArray2[0] = Array.newInstance(uClass, b).getClass();
          method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", uClassArray2);
          uConstructor = uClass.getConstructor(uClassArray);
       }catch(java.lang.ClassNotFoundException e0){
          method2 = uConstructor;
          uClass = method2;
          method1 = uClass;
       }catch(java.lang.NoSuchMethodException e0){
       }
       f.c = uConstructor;
       f.b = uClass;
       f.d = method1;
       f.e = method2;
       return;
    }
    public static Object n(){
       try{
          f.m();
          Object[] objArray = new Object[0];
          return f.c.newInstance(objArray);
       }catch(java.lang.IllegalAccessException e0){
       }catch(java.lang.InstantiationException e0){
       }catch(java.lang.reflect.InvocationTargetException e0){
       }
       throw new RuntimeException(e0);
    }
    public Typeface b(Context p0,c$b p1,Resources p2,int p3){
       Object obj = f.n();
       c$c[] uocArray = p1.a();
       int len = uocArray.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return f.k(obj);
          }
          object oobject = uocArray[i];
          File uFile = l.e(p0);
          if (uFile == null) {
             break ;
          }else if(!l.c(uFile, p2, oobject.b())){
             uFile.delete();
             return null;
          }else if(!f.j(obj, uFile.getPath(), oobject.e(), oobject.f())){
             uFile.delete();
             return null;
          }else {
             uFile.delete();
             i = i + 1;
          }
       }
       return null;
    }
    public Typeface c(Context p0,CancellationSignal p1,f$b[] p2,int p3){
       if (p2.length < 1) {
          return null;
       }
       f$b uob = this.h(p2, p3);
       ContentResolver contentResol = p0.getContentResolver();
       try{
          ParcelFileDescriptor parcelFileDe = contentResol.openFileDescriptor(uob.d(), "r", p1);
          if (parcelFileDe == null) {
             if (parcelFileDe != null) {
                parcelFileDe.close();
             }
             return null;
          }else {
             File uFile = this.l(parcelFileDe);
             if (uFile == null || !uFile.canRead()) {
                FileInputStream uFileInputSt = new FileInputStream(parcelFileDe.getFileDescriptor());
                uFileInputSt.close();
                parcelFileDe.close();
                return this.d(p0, uFileInputSt);
             }else {
                parcelFileDe.close();
                return Typeface.createFromFile(uFile);
             }
          }
       }catch(java.io.IOException e0){
          return null;
       }
    }
    public final File l(ParcelFileDescriptor p0){
       try{
          String str = Os.readlink("/proc/self/fd/"+p0.getFd());
          if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
             return new File(str);
          }
          return null;
       }catch(android.system.ErrnoException e0){
       }
    }
}
