package com.loc.dm;
import java.lang.Object;
import android.util.LongSparseArray;
import com.loc.dm$a;
import java.lang.Math;
import java.util.List;
import java.util.Iterator;
import com.loc.dl;
import android.os.SystemClock;

public final class dm	// class@0013e7
{
    public LongSparseArray a;
    public LongSparseArray b;
    public LongSparseArray c;
    public LongSparseArray d;
    public Object e;
    public Object f;
    public static dm g;
    public static Object h;

    static {
       dm.h = new Object();
    }
    public void dm(){
       super();
       this.e = new Object();
       this.f = new Object();
       this.a = new LongSparseArray();
       this.b = new LongSparseArray();
       this.c = new LongSparseArray();
       this.d = new LongSparseArray();
    }
    public static dm a(){
       if (dm.g == null) {
          Object h = dm.h;
          _monitor_enter(h);
          if (dm.g == null) {
             dm.g = new dm();
          }
          _monitor_exit(h);
       }
       return dm.g;
    }
    public static short a(LongSparseArray p0,long p1){
       _monitor_enter(p0);
       dm$a uoa = p0.get(p1);
       if (uoa == null) {
          _monitor_exit(p0);
          return 0;
       }else {
          short s = (short)(int)Math.max(1, Math.min(0x7fff, ((dm.b() - uoa.b) / 1000)));
          if (uoa.c == null) {
             s = (short)(- s);
          }
          _monitor_exit(p0);
          return s;
       }
    }
    public static void a(List p0,LongSparseArray p1,LongSparseArray p2){
       long l = dm.b();
       Iterator iterator = p0.iterator();
       if (!p1.size()) {
          while (iterator.hasNext()) {
             dl uodl = iterator.next();
             dm$a uoa = new dm$a(0);
             uoa.a = uodl.b();
             uoa.b = l;
             uoa.c = false;
             p2.put(uodl.a(), uoa);
          }
          return;
       }else {
          while (iterator.hasNext()) {
             dl uodl1 = iterator.next();
             long l1 = uodl1.a();
             dm$a uoa1 = p1.get(l1);
             if (uoa1 == null) {
                uoa1 = new dm$a(0);
             }else if(uoa1.a != uodl1.b()){
             label_0065 :
                p2.put(l1, uoa1);
             }
             uoa1.a = uodl1.b();
             uoa1.b = l;
             uoa1.c = true;
             goto label_0065 ;
          }
          return;
       }
    }
    public static long b(){
       return SystemClock.elapsedRealtime();
    }
    public final short a(long p0){
       return dm.a(this.a, p0);
    }
    public final void a(List p0){
       if (p0.isEmpty()) {
          return;
       }
       dm te = this.e;
       _monitor_enter(te);
       dm.a(p0, this.a, this.b);
       dm ta = this.a;
       this.a = this.b;
       this.b = ta;
       ta.clear();
       _monitor_exit(te);
       return;
    }
    public final short b(long p0){
       return dm.a(this.c, p0);
    }
    public final void b(List p0){
       if (p0.isEmpty()) {
          return;
       }
       dm tf = this.f;
       _monitor_enter(tf);
       dm.a(p0, this.c, this.d);
       dm tc = this.c;
       this.c = this.d;
       this.d = tc;
       tc.clear();
       _monitor_exit(tf);
       return;
    }
}
