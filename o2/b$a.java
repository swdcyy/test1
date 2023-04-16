package o2.b$a;
import p2.a$b;
import androidx.lifecycle.MutableLiveData;
import android.os.Bundle;
import p2.a;
import java.lang.Object;
import o2.b;
import java.lang.StringBuilder;
import java.lang.String;
import android.os.Looper;
import java.util.Objects;
import androidx.lifecycle.Observer;
import o2.b$b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LifecycleOwner;
import java.lang.System;
import java.lang.Integer;
import java.lang.Class;
import o2.a$a;

public class b$a extends MutableLiveData implements a$b	// class@002749
{
    public final int b;
    public final Bundle c;
    public final a d;
    public LifecycleOwner e;
    public b$b f;
    public a g;

    public void b$a(int p0,Bundle p1,a p2,a p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.g = p3;
       p2.d(p0, this);
    }
    public void g(a p0,Object p1){
       if (b.c) {
          StringBuilder str = "onLoadComplete: "+this;
       }
       if (Looper.myLooper() == Looper.getMainLooper()) {
          this.setValue(p1);
       }else {
          this.postValue(p1);
       }
       return;
    }
    public void onActive(){
       if (b.c) {
          StringBuilder str = "  Starting: "+this;
       }
       this.d.f();
       return;
    }
    public void onInactive(){
       if (b.c) {
          StringBuilder str = "  Stopping: "+this;
       }
       this.d.g();
       return;
    }
    public a q(boolean p0){
       if (b.c) {
          StringBuilder str = "  Destroying: "+this;
       }
       Objects.requireNonNull(this.d);
       this.d.a();
       b$a tf = this.f;
       if (tf != null) {
          this.removeObserver(tf);
          if (p0) {
             tf.c();
          }
       }
       this.d.h(this);
       if (tf == null || (!tf.b() || p0)) {
          this.d.e();
          return this.g;
       }else {
          return this.d;
       }
    }
    public void r(String p0,FileDescriptor p1,PrintWriter p2,String[] p3){
       p2.print(p0);
       p2.print("mId=");
       p2.print(this.b);
       p2.print(" mArgs=");
       p2.println(this.c);
       p2.print(p0);
       p2.print("mLoader=");
       p2.println(this.d);
       this.d.c(p0+"  ", p1, p2, p3);
       if (this.f != null) {
          p2.print(p0);
          p2.print("mCallbacks=");
          p2.println(this.f);
          this.f.a(p0+"  ", p2);
       }
       p2.print(p0);
       p2.print("mData=");
       p2.println(this.s().b(this.getValue()));
       p2.print(p0);
       p2.print("mStarted=");
       p2.println(this.hasActiveObservers());
       return;
    }
    public void removeObserver(Observer p0){
       super.removeObserver(p0);
       this.e = null;
       this.f = null;
    }
    public a s(){
       return this.d;
    }
    public void setValue(Object p0){
       super.setValue(p0);
       p0 = this.g;
       if (p0 != null) {
          p0.e();
          this.g = null;
       }
       return;
    }
    public void t(){
       b$a te = this.e;
       b$a tf = this.f;
       if (te != null && tf != null) {
          super.removeObserver(tf);
          this.observe(te, tf);
       }
       return;
    }
    public String toString(){
       Class class = this.d.getClass();
       return new StringBuilder(64)+"LoaderInfo{"+Integer.toHexString(System.identityHashCode(this))+" #"+this.b+" : "+class.getSimpleName()+"{"+Integer.toHexString(System.identityHashCode(class))+"}}";
    }
    public a u(LifecycleOwner p0,a$a p1){
       b$b uob = new b$b(this.d, p1);
       this.observe(p0, uob);
       b$a tf = this.f;
       if (tf != null) {
          this.removeObserver(tf);
       }
       this.e = p0;
       this.f = uob;
       return this.d;
    }
}
