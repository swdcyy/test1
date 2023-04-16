package p2.a;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.System;
import java.lang.Integer;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p2.a$b;
import java.lang.IllegalStateException;
import java.lang.IllegalArgumentException;

public class a	// class@0028ab
{
    public int a;
    public a$b b;
    public a$a c;
    public Context d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    public void a(Context p0){
       super();
       this.e = false;
       this.f = false;
       this.g = true;
       this.h = false;
       this.i = false;
       this.d = p0.getApplicationContext();
    }
    public void a(){
       this.f = true;
    }
    public String b(Object p0){
       StringBuilder str = new StringBuilder(64);
       if (p0 == null) {
          str = str+"null";
       }else {
          p0 = p0.getClass();
          str = str+p0.getSimpleName()+"{"+Integer.toHexString(System.identityHashCode(p0))+"}";
       }
       return str;
    }
    public void c(String p0,FileDescriptor p1,PrintWriter p2,String[] p3){
       p2.print(p0);
       p2.print("mId=");
       p2.print(this.a);
       p2.print(" mListener=");
       p2.println(this.b);
       if (this.e == null && (this.h != null || this.i != null)) {
          p2.print(p0);
          p2.print("mStarted=");
          p2.print(this.e);
          p2.print(" mContentChanged=");
          p2.print(this.h);
          p2.print(" mProcessingChange=");
          p2.println(this.i);
       }
       if (this.f != null || this.g != null) {
          p2.print(p0);
          p2.print("mAbandoned=");
          p2.print(this.f);
          p2.print(" mReset=");
          p2.println(this.g);
       }
       return;
    }
    public void d(int p0,a$b p1){
       if (this.b != null) {
          throw new IllegalStateException("There is already a listener registered");
       }
       this.b = p1;
       this.a = p0;
       return;
    }
    public void e(){
       this.g = true;
       this.e = false;
       this.f = false;
       this.h = false;
       this.i = false;
    }
    public final void f(){
       this.e = true;
       this.g = false;
       this.f = false;
    }
    public void g(){
       this.e = false;
    }
    public void h(a$b p0){
       a tb = this.b;
       if (tb == null) {
          throw new IllegalStateException("No listener register");
       }
       if (tb != p0) {
          throw new IllegalArgumentException("Attempting to unregister the wrong listener");
       }
       this.b = null;
       return;
    }
    public String toString(){
       return new StringBuilder(64)+a.class.getSimpleName()+"{"+Integer.toHexString(System.identityHashCode(a.class))+" id="+this.a+"}";
    }
}
