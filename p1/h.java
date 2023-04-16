package p1.h;
import p1.f;
import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.Object;
import android.content.Context;
import o1.c$b;
import android.content.res.Resources;
import android.graphics.Typeface;
import o1.c$c;
import java.lang.String;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import x1.f$b;
import p1.k;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.graphics.Typeface$Builder;
import java.io.FileDescriptor;
import java.lang.Throwable;
import java.util.Map;
import p1.l;
import java.nio.ByteBuffer;
import java.lang.reflect.Array;
import java.lang.Integer;
import android.content.res.AssetManager;
import java.lang.Boolean;

public class h extends f	// class@00289f
{
    public final Class g;
    public final Constructor h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;

    public void h(){
       Constructor uConstructor;
       Method method;
       Method method1;
       Method method2;
       Method method3;
       Method method4;
       super();
       try{
          int i = 0;
          Class uClass = this.x();
          uConstructor = this.y(uClass);
          method = this.u(uClass);
          method1 = this.v(uClass);
          method2 = this.z(uClass);
          method3 = this.t(uClass);
          Class uClass1 = uClass;
          method4 = this.w(uClass);
          Class uClass2 = uClass1;
       }catch(java.lang.ClassNotFoundException e0){
          method4 = e0;
          uConstructor = method4;
          method = uConstructor;
          method1 = method;
          method2 = method1;
          method3 = method2;
       }catch(java.lang.NoSuchMethodException e0){
       }
       this.g = e0;
       this.h = uConstructor;
       this.i = method;
       this.j = method1;
       this.k = method2;
       this.l = method3;
       this.m = method4;
       return;
    }
    private Object n(){
       try{
          Object[] objArray = new Object[0];
          return this.h.newInstance(objArray);
       }catch(java.lang.IllegalAccessException e0){
          return null;
       }catch(java.lang.InstantiationException e0){
       }catch(java.lang.reflect.InvocationTargetException e0){
       }
    }
    public Typeface b(Context p0,c$b p1,Resources p2,int p3){
       if (!this.s()) {
          return super.b(p0, p1, p2, p3);
       }
       p2 = this.n();
       if (p2 == null) {
          return null;
       }
       c$c[] uocArray = p1.a();
       int len = uocArray.length;
       int i = 0;
       while (true) {
          if (i < len) {
             object oobject = uocArray[i];
             String str = oobject.a();
             int i1 = oobject.c();
             int i2 = oobject.e();
             boolean b = oobject.f();
             if (!this.p(p0, p2, str, i1, i2, b, FontVariationAxis.fromFontVariationSettings(oobject.d()))) {
                break ;
             }else {
                i = i + 1;
             }
          }else if(!this.r(p2)){
             return null;
          }else {
             return this.k(p2);
          }
       }
       this.o(p2);
       return null;
    }
    public Typeface c(Context p0,CancellationSignal p1,f$b[] p2,int p3){
       if (p2.length < 1) {
          return null;
       }
       if (!this.s()) {
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
                parcelFileDe.close();
                return new Typeface$Builder(parcelFileDe.getFileDescriptor()).setWeight(uob.e()).setItalic(uob.f()).build();
             }
          }catch(java.io.IOException e0){
             return null;
          }
       }else {
          Map map = l.h(p0, p2, p1);
          p1 = this.n();
          if (p1 == null) {
             return null;
          }
          int len = p2.length;
          int i = 0;
          int i1 = 0;
          while (true) {
             if (i1 < len) {
                object oobject = p2[i1];
                ByteBuffer uByteBuffer = map.get(oobject.d());
                if (uByteBuffer != null) {
                   if (!this.q(p1, uByteBuffer, oobject.c(), oobject.e(), oobject.f())) {
                      break ;
                   }else {
                      i = 1;
                   }
                }
                i1 = i1 + 1;
             }else if(i == null){
                this.o(p1);
                return null;
             }else if(!this.r(p1)){
                return null;
             }else {
                Typeface typeface = this.k(p1);
                if (typeface == null) {
                   return null;
                }
                return Typeface.create(typeface, p3);
             }
          }
          this.o(p1);
          return null;
       }
    }
    public Typeface e(Context p0,Resources p1,int p2,String p3,int p4){
       if (!this.s()) {
          return super.e(p0, p1, p2, p3, p4);
       }
       p1 = this.n();
       if (p1 == null) {
          return null;
       }
       if (!this.p(p0, p1, p3, 0, -1, -1, null)) {
          this.o(p1);
          return null;
       }else if(!this.r(p1)){
          return null;
       }else {
          return this.k(p1);
       }
    }
    public Typeface k(Object p0){
       Object obj = null;
       try{
          Object obj1 = Array.newInstance(this.g, 1);
          Array.set(obj1, 0, p0);
          Object[] objArray = new Object[]{obj1,Integer.valueOf(-1),Integer.valueOf(-1)};
          return this.m.invoke(obj, objArray);
       }catch(java.lang.IllegalAccessException e0){
          return e0;
       }catch(java.lang.reflect.InvocationTargetException e0){
       }
    }
    public final void o(Object p0){
       try{
          Object[] objArray = new Object[0];
          this.l.invoke(p0, objArray);
          return;
       }catch(java.lang.IllegalAccessException e0){
       }catch(java.lang.reflect.InvocationTargetException e0){
       }
    }
    public final boolean p(Context p0,Object p1,String p2,int p3,int p4,int p5,FontVariationAxis[] p6){
       int i = 0;
       try{
          Object[] objArray = new Object[]{p0.getAssets(),p2,Integer.valueOf(i),Boolean.FALSE,Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),p6};
          return this.i.invoke(p1, objArray).booleanValue();
       }catch(java.lang.IllegalAccessException e0){
          return e0;
       }catch(java.lang.reflect.InvocationTargetException e0){
       }
    }
    public final boolean q(Object p0,ByteBuffer p1,int p2,int p3,int p4){
       int i = 0;
       try{
          Object[] objArray = new Object[]{p1,Integer.valueOf(p2),null,Integer.valueOf(p3),Integer.valueOf(p4)};
          return this.j.invoke(p0, objArray).booleanValue();
       }catch(java.lang.IllegalAccessException e0){
          return e0;
       }catch(java.lang.reflect.InvocationTargetException e0){
       }
    }
    public final boolean r(Object p0){
       int i = 0;
       try{
          Object[] objArray = new Object[i];
          return this.k.invoke(p0, objArray).booleanValue();
       }catch(java.lang.IllegalAccessException e0){
          return e0;
       }catch(java.lang.reflect.InvocationTargetException e0){
       }
    }
    public final boolean s(){
       boolean b = (this.i != null)? true: false;
       return b;
    }
    public Method t(Class p0){
       Class[] uClassArray = new Class[0];
       return p0.getMethod("abortCreation", uClassArray);
    }
    public Method u(Class p0){
       Class tYPE;
       Class[] uClassArray = new Class[]{AssetManager.class,String.class,tYPE,Boolean.TYPE,tYPE,tYPE,tYPE,FontVariationAxis[].class};
       tYPE = Integer.TYPE;
       return p0.getMethod("addFontFromAssetManager", uClassArray);
    }
    public Method v(Class p0){
       Class tYPE;
       Class[] uClassArray = new Class[]{ByteBuffer.class,tYPE,FontVariationAxis[].class,tYPE,tYPE};
       tYPE = Integer.TYPE;
       return p0.getMethod("addFontFromBuffer", uClassArray);
    }
    public Method w(Class p0){
       Class[] uClassArray = new Class[]{Array.newInstance(p0, 1).getClass(),p0,p0};
       p0 = Integer.TYPE;
       Method declaredMeth = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", uClassArray);
       declaredMeth.setAccessible(1);
       return declaredMeth;
    }
    public Class x(){
       return Class.forName("android.graphics.FontFamily");
    }
    public Constructor y(Class p0){
       Class[] uClassArray = new Class[0];
       return p0.getConstructor(uClassArray);
    }
    public Method z(Class p0){
       Class[] uClassArray = new Class[0];
       return p0.getMethod("freeze", uClassArray);
    }
}
