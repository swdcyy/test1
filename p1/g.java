package p1.g;
import p1.k;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.lang.Integer;
import java.util.List;
import java.lang.Boolean;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.reflect.Array;
import android.graphics.Typeface;
import android.content.Context;
import o1.c$b;
import android.content.res.Resources;
import o1.c$c;
import p1.l;
import android.os.CancellationSignal;
import x1.f$b;
import androidx.collection.SimpleArrayMap;
import android.net.Uri;

public class g extends k	// class@00289e
{
    public static final Class b;
    public static final Constructor c;
    public static final Method d;
    public static final Method e;

    static {
       Class uClass;
       Class tYPE;
       Method method1;
       Method method2;
       Method method = null;
       try{
          uClass = Class.forName("android.graphics.FontFamily");
          Class[] uClassArray = new Class[0];
          Class[] uClassArray1 = new Class[]{ByteBuffer.class,tYPE,List.class,tYPE,Boolean.TYPE};
          tYPE = Integer.TYPE;
          method1 = uClass.getMethod("addFontWeightStyle", uClassArray1);
          Class[] uClassArray2 = new Class[]{Array.newInstance(uClass, 1).getClass()};
          method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", uClassArray2);
          Constructor uConstructor = uClass.getConstructor(uClassArray);
       }catch(java.lang.ClassNotFoundException e0){
          uClass = e0;
          method2 = uClass;
          method1 = method2;
       }catch(java.lang.NoSuchMethodException e0){
       }
       g.c = e0;
       g.b = uClass;
       g.d = method1;
       g.e = method2;
    }
    public void g(){
       super();
    }
    public static boolean j(Object p0,ByteBuffer p1,int p2,int p3,boolean p4){
       int i = 0;
       try{
          Object[] objArray = new Object[]{p1,Integer.valueOf(p2),null,Integer.valueOf(p3),Boolean.valueOf(p4)};
          return g.d.invoke(p0, objArray).booleanValue();
       }catch(java.lang.IllegalAccessException e0){
          return e0;
       }catch(java.lang.reflect.InvocationTargetException e0){
       }
    }
    public static Typeface k(Object p0){
       Object obj = null;
       try{
          Object obj1 = Array.newInstance(g.b, 1);
          Array.set(obj1, 0, p0);
          Object[] objArray = new Object[]{obj1};
          return g.e.invoke(obj, objArray);
       }catch(java.lang.IllegalAccessException e0){
          return e0;
       }catch(java.lang.reflect.InvocationTargetException e0){
       }
    }
    public static boolean l(){
       boolean b = (g.d != null)? true: false;
       return b;
    }
    public static Object m(){
       try{
          Object[] objArray = new Object[0];
          return g.c.newInstance(objArray);
       }catch(java.lang.IllegalAccessException e0){
          return null;
       }catch(java.lang.InstantiationException e0){
       }catch(java.lang.reflect.InvocationTargetException e0){
       }
    }
    public Typeface b(Context p0,c$b p1,Resources p2,int p3){
       Object obj = g.m();
       if (obj == null) {
          return null;
       }
       c$c[] uocArray = p1.a();
       int len = uocArray.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return g.k(obj);
          }
          object oobject = uocArray[i];
          ByteBuffer uByteBuffer = l.b(p0, p2, oobject.b());
          if (uByteBuffer == null) {
             break ;
          }else if(!g.j(obj, uByteBuffer, oobject.c(), oobject.e(), oobject.f())){
             return null;
          }else {
             i = i + 1;
          }
       }
       return null;
    }
    public Typeface c(Context p0,CancellationSignal p1,f$b[] p2,int p3){
       Object obj = g.m();
       if (obj == null) {
          return null;
       }
       SimpleArrayMap simpleArrayM = new SimpleArrayMap();
       int len = p2.length;
       int i = 0;
       while (true) {
          if (i < len) {
             object oobject = p2[i];
             Uri uri = oobject.d();
             ByteBuffer uByteBuffer = simpleArrayM.get(uri);
             if (uByteBuffer == null) {
                uByteBuffer = l.f(p0, p1, uri);
                simpleArrayM.put(uri, uByteBuffer);
             }
             if (uByteBuffer == null) {
                break ;
             }else if(!g.j(obj, uByteBuffer, oobject.c(), oobject.e(), oobject.f())){
                return null;
             }else {
                i = i + 1;
             }
          }else {
             Typeface typeface = g.k(obj);
             if (typeface == null) {
                return null;
             }
             return Typeface.create(typeface, p3);
          }
       }
       return null;
    }
}
