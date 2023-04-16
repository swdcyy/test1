package androidx.room.RoomDatabase$a;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import androidx.room.RoomDatabase$JournalMode;
import androidx.room.RoomDatabase$c;
import androidx.room.RoomDatabase$b;
import java.util.ArrayList;
import w2.c;
import java.util.HashSet;
import java.lang.Integer;
import java.util.Set;
import androidx.room.RoomDatabase;
import java.util.concurrent.Executor;
import x0.a;
import java.util.Iterator;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import b3.c;
import androidx.room.a;
import java.util.concurrent.TimeUnit;
import v2.n;
import a3.c$c;
import v2.p0;
import java.io.File;
import java.util.concurrent.Callable;
import androidx.room.a0;
import androidx.room.RoomDatabase$e;
import androidx.room.t;
import java.util.List;
import androidx.room.RoomDatabase$d;
import androidx.room.c0;

public class RoomDatabase$a	// class@000262
{
    public final Class a;
    public final String b;
    public final Context c;
    public ArrayList d;
    public RoomDatabase$d e;
    public RoomDatabase$e f;
    public Executor g;
    public List h;
    public Executor i;
    public Executor j;
    public c$c k;
    public boolean l;
    public RoomDatabase$JournalMode m;
    public boolean n;
    public boolean o;
    public boolean p;
    public long q;
    public TimeUnit r;
    public final RoomDatabase$c s;
    public Set t;
    public Set u;
    public String v;
    public File w;
    public Callable x;

    public void RoomDatabase$a(Context p0,Class p1,String p2){
       super();
       this.q = -1;
       this.c = p0;
       this.a = p1;
       this.b = p2;
       this.m = RoomDatabase$JournalMode.AUTOMATIC;
       this.o = true;
       this.s = new RoomDatabase$c();
    }
    public RoomDatabase$a a(RoomDatabase$b p0){
       if (this.d == null) {
          this.d = new ArrayList();
       }
       this.d.add(p0);
       return this;
    }
    public RoomDatabase$a b(c[] p0){
       if (this.u == null) {
          this.u = new HashSet();
       }
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          this.u.add(Integer.valueOf(oobject.a));
          this.u.add(Integer.valueOf(oobject.b));
       }
       this.s.b(p0);
       return this;
    }
    public RoomDatabase$a c(){
       this.l = true;
       return this;
    }
    public RoomDatabase d(){
       c uoc;
       RoomDatabase$a w;
       RoomDatabase$a uoa = this;
       if (uoa.c == null) {
          throw new IllegalArgumentException("Cannot provide null context for the database.");
       }
       if (uoa.a == null) {
          throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
       }
       RoomDatabase$a i = uoa.i;
       if (i == null && uoa.j == null) {
          Executor uExecutor = a.e();
          uoa.j = uExecutor;
          uoa.i = uExecutor;
       }else if(i != null && uoa.j == null){
          uoa.j = i;
       }else if(i == null){
          i = uoa.j;
          if (i != null) {
             uoa.i = i;
          }
       }
       i = uoa.u;
       if (i != null && uoa.t != null) {
          Iterator iterator = i.iterator();
          while (true) {
             if (iterator.hasNext()) {
                Integer integer = iterator.next();
                if (uoa.t.contains(integer)) {
                label_004d :
                   throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration\(Migration... migrations\) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom\(int... startVersions\). Start version: "+integer);
                }
                continue ;
             }
          }
       }
       i = uoa.k;
       if (i == null) {
          uoc = new c();
       }
       RoomDatabase$a q = uoa.q;
       if (q - null > 0) {
          if (uoa.b != null) {
             uoc = new n(uoc, new a(q, uoa.r, uoa.j));
          }else {
             throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
          }
       }
       q = uoa.v;
       if (q == null && (uoa.w != null || uoa.x != null)) {
          if (uoa.b != null) {
             int i1 = 0;
             RoomDatabase$a uoa1 = 1;
             int i2 = (q == null)? 0: 1;
             w = uoa.w;
             int i3 = (w == null)? 0: 1;
             i2 = i2 + i3;
             RoomDatabase$a x = uoa.x;
             if (x != null) {
                i1 = 1;
             }
             if ((i2 + i1) == uoa1) {
                uoc = new p0(q, w, x, uoc);
             }else {
                throw new IllegalArgumentException("More than one of createFromAsset\(\), createFromInputStream\(\), and createFromFile\(\) were called on this Builder, but the database can only be created using one of the three configurations.");
             }
          }else {
             throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
          }
       }
       q = uoa.f;
       a0 uoa0 = (q != null)? new a0(uoc, q, uoa.g): uoc;
       q = uoa.c;
       w = q;
       RoomDatabase$JournalMode journalMode = uoa.m.resolve(q);
       t ot = new t(w, uoa.b, uoa0, uoa.s, uoa.d, uoa.l, journalMode, uoa.i, uoa.j, uoa.n, uoa.o, uoa.p, uoa.t, uoa.v, uoa.w, uoa.x, null, uoa.h);
       RoomDatabase roomDatabase = c0.b(uoa.a, "_Impl");
       roomDatabase.s(uoc);
       return roomDatabase;
    }
    public RoomDatabase$a e(){
       this.o = false;
       this.p = true;
       return this;
    }
    public RoomDatabase$a f(){
       this.o = true;
       this.p = true;
       return this;
    }
    public RoomDatabase$a g(c$c p0){
       this.k = p0;
       return this;
    }
    public RoomDatabase$a h(RoomDatabase$JournalMode p0){
       this.m = p0;
       return this;
    }
    public RoomDatabase$a i(Executor p0){
       this.i = p0;
       return this;
    }
}
