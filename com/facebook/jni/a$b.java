package com.facebook.jni.a$b;
import java.lang.ref.PhantomReference;
import com.facebook.jni.a;
import java.lang.Object;
import java.lang.ref.ReferenceQueue;
import com.facebook.jni.a$a;
import com.facebook.jni.a$d;
import java.util.concurrent.atomic.AtomicReference;

public abstract class a$b extends PhantomReference	// class@001162
{
    public a$b a;
    public a$b b;

    public void a$b(){
       super(null, a.c);
    }
    public void a$b(a$a p0){
       super(null, a.c);
    }
    public void a$b(Object p0){
       a$b uob;
       super(p0, a.c);
       p0 = a.b;
       do {
          uob = p0.a.get();
          this.a = uob;
       } while (p0.a.compareAndSet(uob, this));
       return;
    }
    public abstract void a();
}
