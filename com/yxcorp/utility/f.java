package com.yxcorp.utility.f;
import java.lang.Object;
import java.util.PriorityQueue;
import com.yxcorp.utility.e;
import java.util.Comparator;
import com.yxcorp.utility.f$a;
import android.os.Looper;
import com.yxcorp.utility.f$b;
import android.os.Handler;
import brd.t;
import java.util.concurrent.atomic.AtomicReference;
import ekd.u;
import io.reactivex.g;
import ekd.v;
import erd.a;

public class f	// class@0009c0
{
    public boolean a;
    public final Queue b;
    public final Handler c;

    public void f(){
       super();
       this.a = true;
       this.b = new PriorityQueue(5, e.b);
       this.c = new f$a(this, Looper.getMainLooper());
    }
    public void f(f$a p0){
       super();
       this.a = true;
       this.b = new PriorityQueue(5, e.b);
       this.c = new f$a(this, Looper.getMainLooper());
    }
    public static f d(){
       return f$b.a;
    }
    public void a(){
       this.a = true;
       this.c.removeMessages(true);
    }
    public synchronized t b(long p0,long p1){
       return this.c(p0, p1, 0);
    }
    public synchronized t c(long p0,long p1,long p2){
       AtomicReference uAtomicRefer = new AtomicReference();
       u ou = new u(this, p0, p1, p2, uAtomicRefer);
       return t.create(v10).doOnDispose(super(uAtomicRefer));
    }
    public synchronized t e(long p0){
       return this.c(0, 0, p0);
    }
}
