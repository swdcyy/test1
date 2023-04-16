package com.facebook.jni.a$a;
import java.lang.Thread;
import java.lang.String;
import com.facebook.jni.a;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import com.facebook.jni.a$b;
import com.facebook.jni.a$d;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import com.facebook.jni.a$c;

public final class a$a extends Thread	// class@001161
{

    public void a$a(String p0){
       super(p0);
    }
    public void run(){
       a$b andSet;
       a$b a;
       try{
          a$b uob = a.c.remove();
          uob.a();
          while (uob.b != null) {
             andSet = uob.a;
             andSet.b = uob.b;
             uob.b.a = andSet;
          }
          for (andSet = a.b.a.getAndSet(null); andSet != null; andSet = a) {
             a = andSet.a;
             a$c a1 = a.a.a;
             andSet.a = a1.a;
             a1.a = andSet;
             andSet.a.b = andSet;
             andSet.b = a1;
          }
       }catch(java.lang.InterruptedException e0){
       }
    }
}
