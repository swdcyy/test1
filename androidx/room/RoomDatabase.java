package androidx.room.RoomDatabase;
import java.lang.Object;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.lang.ThreadLocal;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import androidx.room.w;
import a3.b;
import android.os.Looper;
import java.lang.Thread;
import a3.e;
import android.database.Cursor;
import android.os.CancellationSignal;
import a3.c;
import java.lang.Class;
import v2.o;
import java.lang.IllegalStateException;
import java.lang.String;
import v2.l0;
import z0.a;
import androidx.room.a;
import java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock;
import java.util.concurrent.locks.Lock;
import a3.f;
import androidx.room.t;
import v2.m0;
import java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock;
import java.util.concurrent.Executor;
import androidx.room.g0;
import androidx.room.n;
import androidx.room.RoomDatabase$JournalMode;
import v2.r0;
import android.content.Context;
import java.util.BitSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.List;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public abstract class RoomDatabase	// class@000267
{
    public b a;
    public Executor b;
    public Executor c;
    public c d;
    public final w e;
    public boolean f;
    public boolean g;
    public List h;
    public final ReentrantReadWriteLock i;
    public a j;
    public final ThreadLocal k;
    public final Map l;
    public final Map m;

    public void RoomDatabase(){
       super();
       this.i = new ReentrantReadWriteLock();
       this.k = new ThreadLocal();
       this.l = Collections.synchronizedMap(new HashMap());
       this.e = this.i();
       this.m = new HashMap();
    }
    public static Object a(RoomDatabase p0,b p1){
       p0.y(p1);
       return null;
    }
    public static Object b(RoomDatabase p0,b p1){
       p0.z(p1);
       return null;
    }
    public static boolean w(){
       boolean b = (Looper.getMainLooper().getThread() == Thread.currentThread())? true: false;
       return b;
    }
    private Object y(b p0){
       this.t();
       return null;
    }
    private Object z(b p0){
       this.u();
       return null;
    }
    public Cursor A(e p0){
       return this.B(p0, null);
    }
    public Cursor B(e p0,CancellationSignal p1){
       this.c();
       this.d();
       if (p1 != null) {
          return this.d.e0().B1(p0, p1);
       }
       return this.d.e0().K1(p0);
    }
    public void C(){
       this.d.e0().setTransactionSuccessful();
    }
    public final Object D(Class p0,c p1){
       if (p0.isInstance(p1)) {
          return p1;
       }
       if (p1 instanceof o) {
          return this.D(p0, p1.getDelegate());
       }
       return null;
    }
    public void c(){
       if (this.f != null) {
          return;
       }
       if (!RoomDatabase.w()) {
          return;
       }
       throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }
    public void d(){
       if (this.r() || this.k.get() == null) {
          return;
       }
       throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }
    public void e(){
       this.c();
       RoomDatabase tj = this.j;
       if (tj == null) {
          this.t();
       }else {
          tj.c(new l0(this));
       }
       return;
    }
    public abstract void f();
    public void g(){
       if (this.x()) {
          ReentrantReadWriteLock$WriteLock writeLock = this.i.writeLock();
          writeLock.lock();
          this.e.p();
          this.d.close();
          writeLock.unlock();
       }
       return;
    }
    public f h(String p0){
       this.c();
       this.d();
       return this.d.e0().compileStatement(p0);
    }
    public abstract w i();
    public abstract c j(t p0);
    public void k(){
       RoomDatabase tj = this.j;
       if (tj == null) {
          this.u();
       }else {
          tj.c(new m0(this));
       }
       return;
    }
    public Lock l(){
       return this.i.readLock();
    }
    public w m(){
       return this.e;
    }
    public c n(){
       return this.d;
    }
    public Executor o(){
       return this.b;
    }
    public Map p(){
       return Collections.emptyMap();
    }
    public Executor q(){
       return this.c;
    }
    public boolean r(){
       return this.d.e0().inTransaction();
    }
    public void s(t p0){
       c uoc = this.j(p0);
       this.d = uoc;
       g0 og0 = this.D(g0.class, uoc);
       if (og0 != null) {
          og0.c(p0);
       }
       n on = this.D(n.class, this.d);
       if (on != null) {
          a uoa = on.a();
          this.j = uoa;
          this.e.m(uoa);
       }
       int i = 1;
       int b = (p0.i == RoomDatabase$JournalMode.WRITE_AHEAD_LOGGING)? true: false;
       this.d.setWriteAheadLoggingEnabled(b);
       this.h = p0.e;
       this.b = p0.j;
       this.c = new r0(p0.k);
       this.f = p0.h;
       this.g = b;
       if (p0.l != null) {
          this.e.n(p0.b, p0.c);
       }
       BitSet uBitSet = new BitSet();
       Iterator iterator = this.p().entrySet().iterator();
       while (true) {
          if (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             Class key = uEntry.getKey();
             Iterator iterator1 = uEntry.getValue().iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   Class uClass = iterator1.next();
                   int i1 = p0.g.size() - i;
                   while (true) {
                      if (i1 >= 0) {
                         if (uClass.isAssignableFrom(p0.g.get(i1).getClass())) {
                            uBitSet.set(i1);
                         label_00b7 :
                            if (i1 >= 0) {
                               this.m.put(uClass, p0.g.get(i1));
                            }else {
                               break ;
                            }
                         }else {
                            i1 = i1 - 1;
                         }
                      }else {
                         i1 = -1;
                         goto label_00b7 ;
                      }
                   }
                   throw new IllegalArgumentException("A required type converter \("+uClass+"\) for "+key.getCanonicalName()+" is missing in the database configuration.");
                }else {
                   continue ;
                }
             }
          }else {
             b = p0.g.size() - i;
             while (true) {
                if (b < 0) {
                   return;
                }
                if (uBitSet.get(b)) {
                   b = b - 1;
                }else {
                   break ;
                }
             }
             throw new IllegalArgumentException("Unexpected type converter "+p0.g.get(b)+". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
          }
       }
    }
    public final void t(){
       this.c();
       b uob = this.d.e0();
       this.e.s(uob);
       if (uob.isWriteAheadLoggingEnabled()) {
          uob.beginTransactionNonExclusive();
       }else {
          uob.beginTransaction();
       }
       return;
    }
    public final void u(){
       this.d.e0().endTransaction();
       if (!this.r()) {
          this.e.j();
       }
       return;
    }
    public void v(b p0){
       this.e.g(p0);
    }
    public boolean x(){
       RoomDatabase tj = this.j;
       if (tj != null) {
          return tj.g();
       }
       tj = this.a;
       boolean b = (tj != null && tj.isOpen())? true: false;
       return b;
    }
}
