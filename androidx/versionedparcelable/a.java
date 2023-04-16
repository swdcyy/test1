package androidx.versionedparcelable.a;
import androidx.collection.ArrayMap;
import java.lang.Object;
import android.os.Bundle;
import java.lang.CharSequence;
import android.os.Parcelable;
import java.lang.String;
import android.os.IBinder;
import android.os.IInterface;
import g3.c;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;
import java.lang.StringBuilder;
import androidx.collection.SimpleArrayMap;
import java.lang.Package;
import java.lang.ClassLoader;
import java.lang.System;

public abstract class a	// class@0009fe
{
    public final ArrayMap a;
    public final ArrayMap b;
    public final ArrayMap c;

    public void a(ArrayMap p0,ArrayMap p1,ArrayMap p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public abstract void A(int p0);
    public abstract void B(boolean p0);
    public void C(boolean p0,int p1){
       this.A(p1);
       this.B(p0);
    }
    public abstract void D(Bundle p0);
    public abstract void E(byte[] p0);
    public void F(byte[] p0,int p1){
       this.A(p1);
       this.E(p0);
    }
    public abstract void G(byte[] p0,int p1,int p2);
    public abstract void H(CharSequence p0);
    public void I(CharSequence p0,int p1){
       this.A(p1);
       this.H(p0);
    }
    public abstract void J(double p0);
    public abstract void K(float p0);
    public abstract void L(int p0);
    public void M(int p0,int p1){
       this.A(p1);
       this.L(p0);
    }
    public abstract void N(long p0);
    public abstract void O(Parcelable p0);
    public void P(Parcelable p0,int p1){
       this.A(p1);
       this.O(p0);
    }
    public abstract void Q(String p0);
    public void R(String p0,int p1){
       this.A(p1);
       this.Q(p0);
    }
    public abstract void S(IBinder p0);
    public abstract void T(IInterface p0);
    public void U(c p0,a p1){
       try{
          Object[] objArray = new Object[]{p0,p1};
          this.e(p0.getClass()).invoke(null, objArray);
          return;
       }catch(java.lang.IllegalAccessException e5){
          throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e5);
       }catch(java.lang.reflect.InvocationTargetException e5){
          if (e5.getCause() instanceof RuntimeException) {
             throw e5.getCause();
          }
          throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
       }catch(java.lang.NoSuchMethodException e5){
          throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e5);
       }catch(java.lang.ClassNotFoundException e5){
          throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
       }
    }
    public void V(c p0){
       if (p0 == null) {
          this.Q(null);
          return;
       }else {
          this.X(p0);
          a uoa = this.b();
          this.U(p0, uoa);
          uoa.a();
          return;
       }
    }
    public void W(c p0,int p1){
       this.A(p1);
       this.V(p0);
    }
    public final void X(c p0){
       try{
          this.Q(this.c(p0.getClass()).getName());
          return;
       }catch(java.lang.ClassNotFoundException e0){
          throw new RuntimeException(p0.getClass().getSimpleName()+" does not have a Parcelizer", e0);
       }
    }
    public abstract void a();
    public abstract a b();
    public final Class c(Class p0){
       Class uClass = this.c.get(p0.getName());
       if (uClass == null) {
          Object[] objArray = new Object[]{p0.getPackage().getName(),p0.getSimpleName()};
          uClass = Class.forName(String.format("%s.%sParcelizer", objArray), 0, p0.getClassLoader());
          this.c.put(p0.getName(), uClass);
       }
       return uClass;
    }
    public final Method d(String p0){
       a uoa = a.class;
       Method method = this.a.get(p0);
       if (method == null) {
          System.currentTimeMillis();
          Class[] uClassArray = new Class[true];
          uClassArray[0] = uoa;
          method = Class.forName(p0, true, uoa.getClassLoader()).getDeclaredMethod("read", uClassArray);
          this.a.put(p0, method);
       }
       return method;
    }
    public final Method e(Class p0){
       Method method = this.b.get(p0.getName());
       if (method == null) {
          System.currentTimeMillis();
          Class[] uClassArray = new Class[]{p0,a.class};
          method = this.c(p0).getDeclaredMethod("write", uClassArray);
          this.b.put(p0.getName(), method);
       }
       return method;
    }
    public abstract boolean f();
    public boolean g(boolean p0,int p1){
       if (!this.n(p1)) {
          return p0;
       }
       return this.f();
    }
    public abstract Bundle h();
    public abstract byte[] i();
    public byte[] j(byte[] p0,int p1){
       if (!this.n(p1)) {
          return p0;
       }
       return this.i();
    }
    public abstract CharSequence k();
    public CharSequence l(CharSequence p0,int p1){
       if (!this.n(p1)) {
          return p0;
       }
       return this.k();
    }
    public abstract double m();
    public abstract boolean n(int p0);
    public abstract float o();
    public c p(String p0,a p1){
       try{
          Object[] objArray = new Object[]{p1};
          return this.d(p0).invoke(null, objArray);
       }catch(java.lang.IllegalAccessException e4){
          throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e4);
       }catch(java.lang.reflect.InvocationTargetException e4){
          if (e4.getCause() instanceof RuntimeException) {
             throw e4.getCause();
          }
          throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
       }catch(java.lang.NoSuchMethodException e4){
          throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
       }catch(java.lang.ClassNotFoundException e4){
          throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
       }
    }
    public abstract int q();
    public int r(int p0,int p1){
       if (!this.n(p1)) {
          return p0;
       }
       return this.q();
    }
    public abstract long s();
    public abstract Parcelable t();
    public Parcelable u(Parcelable p0,int p1){
       if (!this.n(p1)) {
          return p0;
       }
       return this.t();
    }
    public abstract String v();
    public String w(String p0,int p1){
       if (!this.n(p1)) {
          return p0;
       }
       return this.v();
    }
    public abstract IBinder x();
    public c y(){
       String str = this.v();
       if (str == null) {
          return null;
       }
       return this.p(str, this.b());
    }
    public c z(c p0,int p1){
       if (!this.n(p1)) {
          return p0;
       }
       return this.y();
    }
}
