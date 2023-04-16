package o2.b;
import o2.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import o2.b$c;
import android.os.Looper;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import o2.b$a;
import p2.a;
import java.lang.IllegalStateException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import android.os.Bundle;
import o2.a$a;
import java.lang.Class;
import java.lang.reflect.Modifier;
import java.lang.IllegalArgumentException;
import java.lang.System;
import java.lang.Integer;

public class b extends a	// class@00274d
{
    public final LifecycleOwner a;
    public final b$c b;
    public static boolean c;

    public void b(LifecycleOwner p0,ViewModelStore p1){
       super();
       this.a = p0;
       this.b = b$c.q0(p1);
    }
    public void a(int p0){
       if (this.b.s0()) {
          throw new IllegalStateException("Called while creating a loader");
       }
       if (Looper.getMainLooper() != Looper.myLooper()) {
          throw new IllegalStateException("destroyLoader must be called on the main thread");
       }
       if (b.c) {
          StringBuilder str = "destroyLoader in "+this+" of "+p0;
       }
       b$a uoa = this.b.r0(p0);
       if (uoa != null) {
          uoa.q(true);
          this.b.v0(p0);
       }
       return;
    }
    public void b(String p0,FileDescriptor p1,PrintWriter p2,String[] p3){
       this.b.o0(p0, p1, p2, p3);
    }
    public a d(int p0){
       if (this.b.s0()) {
          throw new IllegalStateException("Called while creating a loader");
       }
       b$a uoa = this.b.r0(p0);
       a uoa1 = (uoa != null)? uoa.s(): null;
       return uoa1;
    }
    public a e(int p0,Bundle p1,a$a p2){
       if (this.b.s0()) {
          throw new IllegalStateException("Called while creating a loader");
       }
       if (Looper.getMainLooper() != Looper.myLooper()) {
          throw new IllegalStateException("initLoader must be called on the main thread");
       }
       b$a uoa = this.b.r0(p0);
       if (b.c) {
          "initLoader in "+this+": args="+p1;
       }
       if (uoa == null) {
          return this.h(p0, p1, p2, null);
       }else if(b.c){
          StringBuilder str = "  Re-using existing loader "+uoa;
       }
       return uoa.u(this.a, p2);
    }
    public void f(){
       this.b.t0();
    }
    public a g(int p0,Bundle p1,a$a p2){
       if (this.b.s0()) {
          throw new IllegalStateException("Called while creating a loader");
       }
       if (Looper.getMainLooper() != Looper.myLooper()) {
          throw new IllegalStateException("restartLoader must be called on the main thread");
       }
       if (b.c) {
          StringBuilder str = "restartLoader in "+this+": args="+p1;
       }
       b$a uoa = this.b.r0(p0);
       a uoa1 = null;
       if (uoa != null) {
          uoa1 = uoa.q(false);
       }
       return this.h(p0, p1, p2, uoa1);
    }
    public final a h(int p0,Bundle p1,a$a p2,a p3){
       a uoa = a.class;
       this.b.w0();
       a uoa1 = p2.b(p0, p1);
       if (uoa1 == null) {
          throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
       }
       if (uoa.isMemberClass() && !Modifier.isStatic(uoa.getModifiers())) {
          throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: "+uoa1);
       }
       b$a uoa2 = new b$a(p0, p1, uoa1, p3);
       if (b.c) {
          StringBuilder str = "  Created new loader "+uoa2;
       }
       this.b.u0(p0, uoa2);
       this.b.p0();
       return uoa2.u(this.a, p2);
    }
    public String toString(){
       Class class = this.a.getClass();
       return new StringBuilder(128)+"LoaderManager{"+Integer.toHexString(System.identityHashCode(this))+" in "+class.getSimpleName()+"{"+Integer.toHexString(System.identityHashCode(class))+"}}";
    }
}
