package androidx.room.w;
import java.lang.String;
import androidx.room.RoomDatabase;
import java.util.Map;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import y0.b;
import androidx.room.w$a;
import androidx.room.w$b;
import java.util.HashMap;
import v2.r;
import java.util.Locale;
import java.lang.Integer;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Collections;
import java.lang.StringBuilder;
import a3.b;
import androidx.room.w$c;
import java.lang.IllegalArgumentException;
import androidx.room.w$d;
import androidx.room.w$e;
import java.util.concurrent.Callable;
import androidx.lifecycle.LiveData;
import a3.c;
import a3.f;
import y0.b$e;
import androidx.room.a;
import java.util.concurrent.Executor;
import java.lang.Runnable;
import java.util.HashSet;
import java.util.Collection;
import v2.s;
import android.content.Context;
import androidx.room.x;
import java.util.concurrent.locks.Lock;

public class w	// class@00027a
{
    public final HashMap a;
    public final String[] b;
    public Map c;
    public a d;
    public final RoomDatabase e;
    public AtomicBoolean f;
    public boolean g;
    public f h;
    public w$b i;
    public final r j;
    public final b k;
    public x l;
    public Runnable m;
    public static final String[] n;

    static {
       String[] stringArray = new String[]{"UPDATE","DELETE","INSERT"};
       w.n = stringArray;
    }
    public void w(RoomDatabase p0,Map p1,Map p2,String[] p3){
       String str;
       super();
       this.d = null;
       boolean b = false;
       this.f = new AtomicBoolean(b);
       this.g = b;
       this.k = new b();
       this.m = new w$a(this);
       this.e = p0;
       this.i = new w$b(p3.length);
       this.a = new HashMap();
       this.c = p2;
       this.j = new r(p0);
       int len = p3.length;
       String[] stringArray = new String[len];
       this.b = stringArray;
       while (b < len) {
          Locale uS = Locale.US;
          str = (p3[b]).toLowerCase(uS);
          this.a.put(str, Integer.valueOf(b));
          String str1 = p1.get(p3[b]);
          if (str1 != null) {
             str[b] = str1.toLowerCase(uS);
          }else {
             this.b[b] = str;
          }
          b = b + 1;
       }
       Iterator iterator = p1.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Locale uS1 = Locale.US;
          str = (uEntry.getValue()).toLowerCase(uS1);
          if (this.a.containsKey(str)) {
             w ta = this.a;
             ta.put((uEntry.getKey()).toLowerCase(uS1), ta.get(str));
          }
       }
       return;
    }
    public void w(RoomDatabase p0,String[] p1){
       super(p0, new HashMap(), Collections.emptyMap(), p1);
    }
    public static void c(StringBuilder p0,String p1,String p2){
       p0+"`"+"room_table_modification_trigger_"+p1+"_"+p2+"`";
    }
    public static void d(b p0){
       if (p0.isWriteAheadLoggingEnabled()) {
          p0.beginTransactionNonExclusive();
       }else {
          p0.beginTransaction();
       }
       return;
    }
    public void a(w$c p0){
       String[] stringArray = this.l(p0.a);
       int[] ointArray = new int[stringArray.length];
       int len = stringArray.length;
       int i = 0;
       while (true) {
          if (i < len) {
             Integer integer = this.a.get((stringArray[i]).toLowerCase(Locale.US));
             if (integer != null) {
                ointArray[i] = integer.intValue();
                i = i + 1;
             }else {
                throw new IllegalArgumentException("There is no table with name "+stringArray[i]);
             }
          }else {
             w tk = this.k;
             _monitor_enter(tk);
             _monitor_exit(tk);
             if (this.k.p(p0, new w$d(p0, ointArray, stringArray)) == null && this.i.b(ointArray)) {
                this.r();
                break ;
             }
             break ;
          }
       }
       return;
    }
    public void b(w$c p0){
       this.a(new w$e(this, p0));
    }
    public LiveData e(String[] p0,boolean p1,Callable p2){
       return this.j.a(this.t(p0), p1, p2);
    }
    public boolean f(){
       if (!this.e.x()) {
          return false;
       }
       if (this.g == null) {
          this.e.n().e0();
       }
       if (this.g == null) {
          return false;
       }else {
          return true;
       }
    }
    public void g(b p0){
       _monitor_enter(this);
       if (this.g != null) {
          _monitor_exit(this);
          return;
       }else {
          p0.execSQL("PRAGMA temp_store = MEMORY;");
          p0.execSQL("PRAGMA recursive_triggers=\'ON\';");
          p0.execSQL("CREATE TEMP TABLE room_table_modification_log\(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0\)");
          this.s(p0);
          this.h = p0.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
          this.g = true;
          _monitor_exit(this);
          return;
       }
    }
    public void h(String[] p0){
       w tk = this.k;
       _monitor_enter(tk);
       Iterator iterator = this.k.iterator();
       Iterator iterator1 = iterator;
       while (iterator1.hasNext()) {
          Map$Entry uEntry = iterator1.next();
          if (!uEntry.getKey().a()) {
             uEntry.getValue().b(p0);
          }
       }
       _monitor_exit(tk);
       return;
    }
    public void i(){
       _monitor_enter(this);
       this.g = false;
       this.i.e();
       _monitor_exit(this);
    }
    public void j(){
       if (this.f.compareAndSet(false, true)) {
          w td = this.d;
          if (td != null) {
             td.e();
          }
          this.e.o().execute(this.m);
       }
       return;
    }
    public void k(w$c p0){
       w tk = this.k;
       _monitor_enter(tk);
       w$d uod = this.k.q(p0);
       _monitor_exit(tk);
       if (uod != null && this.i.c(uod.a)) {
          this.r();
       }
       return;
    }
    public final String[] l(String[] p0){
       HashSet hashSet = new HashSet();
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          String str = oobject.toLowerCase(Locale.US);
          if (this.c.containsKey(str)) {
             hashSet.addAll(this.c.get(str));
          }else {
             hashSet.add(oobject);
          }
          i = i + 1;
       }
       p0 = new String[hashSet.size()];
       return hashSet.toArray(p0);
    }
    public void m(a p0){
       this.d = p0;
       p0.h(new s(this));
    }
    public void n(Context p0,String p1){
       this.l = new x(p0, p1, this, this.e.o());
    }
    public final void o(b p0,int p1){
       p0.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES\("+p1+", 0\)");
       object oobject = this.b[p1];
       StringBuilder str = "";
       String[] n = w.n;
       int len = n.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject1 = n[i];
          str.setLength(0);
          str = str+"CREATE TEMP TRIGGER IF NOT EXISTS ";
          w.c(str, oobject, oobject1);
          str = str+" AFTER "+oobject1;
          p0.execSQL(str+" ON `"+oobject+"` BEGIN UPDATE "+"room_table_modification_log"+" SET "+"invalidated"+" = 1"+" WHERE "+"table_id"+" = "+p1+" AND "+"invalidated"+" = 0"+"; END");
       }
       return;
    }
    public void p(){
       w tl = this.l;
       if (tl != null) {
          tl.a();
          this.l = null;
       }
       return;
    }
    public final void q(b p0,int p1){
       object oobject = this.b[p1];
       StringBuilder str = "";
       String[] n = w.n;
       int len = n.length;
       for (int i = 0; i < len; i = i + 1) {
          str.setLength(0);
          str = str+"DROP TRIGGER IF EXISTS ";
          w.c(str, oobject, n[i]);
          p0.execSQL(str);
       }
       return;
    }
    public void r(){
       if (!this.e.x()) {
          return;
       }
       this.s(this.e.n().e0());
       return;
    }
    public void s(b p0){
       if (p0.inTransaction()) {
          return;
       }
       try{
          Lock lock = this.e.l();
          lock.lock();
          int[] ointArray = this.i.a();
          while (ointArray != null) {
             int len = ointArray.length;
             w.d(p0);
             int i = 0;
             while (i < len) {
                int i1 = ointArray[i];
                if (i1 != 1) {
                   if (i1 == 2) {
                      this.q(p0, i);
                   }
                }else {
                   this.o(p0, i);
                }
                i = i + 1;
             }
             p0.setTransactionSuccessful();
             p0.endTransaction();
             w ti = this.i;
             try{
                ti.d();
                lock.unlock();
             }catch(java.lang.IllegalStateException e0){
             label_004f :
                return;
             }catch(android.database.sqlite.SQLiteException e0){
             }
          }
          lock.unlock();
          return;
       }catch(java.lang.IllegalStateException e0){
       }catch(android.database.sqlite.SQLiteException e0){
       }
    }
    public final String[] t(String[] p0){
       object oobject;
       p0 = this.l(p0);
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return p0;
          }
          oobject = p0[i];
          if (this.a.containsKey(oobject.toLowerCase(Locale.US))) {
             i = i + 1;
          }else {
             break ;
          }
       }
       throw new IllegalArgumentException("There is no table with name "+oobject);
    }
}
