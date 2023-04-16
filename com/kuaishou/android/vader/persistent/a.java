package com.kuaishou.android.vader.persistent.a;
import tq.d;
import com.kuaishou.android.vader.persistent.LogRecordDatabase;
import tq.h;
import java.lang.Object;
import java.util.concurrent.LinkedBlockingQueue;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import xq.c;
import java.lang.Exception;
import android.database.sqlite.SQLiteAbortException;
import android.database.sqlite.SQLiteTableLockedException;
import android.database.sqlite.SQLiteReadOnlyDatabaseException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatatypeMismatchException;
import android.database.sqlite.SQLiteMisuseException;
import android.database.sqlite.SQLiteBindOrColumnIndexOutOfRangeException;
import android.database.sqlite.SQLiteDoneException;
import com.kuaishou.android.vader.persistent.DBAction;
import java.util.concurrent.Future;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xq.b;
import com.kuaishou.android.vader.persistent.a$b;
import java.lang.Runnable;
import com.kuaishou.android.vader.persistent.a$c;
import java.util.concurrent.Callable;
import br.b;
import java.util.List;
import android.database.sqlite.SQLiteException;
import fr.a;
import java.util.Iterator;
import com.kuaishou.android.vader.persistent.LogRecord;
import com.kuaishou.android.vader.Channel;
import java.lang.Integer;
import java.util.ArrayList;
import com.kuaishou.android.vader.persistent.DBAction$Type;
import java.util.Objects;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import com.kuaishou.android.vader.persistent.a$d;
import com.kuaishou.android.vader.persistent.a$a;

public class a	// class@000723
{
    public final LinkedBlockingQueue a;
    public final ExecutorService b;
    public final d c;
    public LogRecordDatabase d;
    public h e;

    public void a(d p0,LogRecordDatabase p1,h p2){
       super();
       this.e = p2;
       this.c = p0;
       this.d = p1;
       this.a = new LinkedBlockingQueue();
       this.b = c.a("logPersistor");
    }
    public static String i(Exception p0){
       if (p0 instanceof SQLiteAbortException) {
          return "SQLITE_ABORT";
       }
       if (p0 instanceof SQLiteTableLockedException) {
          return "SQLITE_LOCKED";
       }
       if (p0 instanceof SQLiteReadOnlyDatabaseException) {
          return "SQLITE_READONLY";
       }
       if (p0 instanceof SQLiteDiskIOException) {
          return "SQLITE_IOERR";
       }
       if (p0 instanceof SQLiteDatabaseCorruptException) {
          return "SQLITE_CORRUPT";
       }
       if (p0 instanceof SQLiteFullException) {
          return "SQLITE_FULL";
       }
       if (p0 instanceof SQLiteCantOpenDatabaseException) {
          return "SQLITE_CANTOPEN";
       }
       if (p0 instanceof SQLiteBlobTooBigException) {
          return "SQLITE_TOOBIG";
       }
       if (p0 instanceof SQLiteConstraintException) {
          return "SQLITE_CONSTRAINT";
       }
       if (p0 instanceof SQLiteDatatypeMismatchException) {
          return "SQLITE_MISMATCH";
       }
       if (p0 instanceof SQLiteMisuseException) {
          return "SQLITE_MISUSE";
       }
       if (p0 instanceof SQLiteBindOrColumnIndexOutOfRangeException) {
          return "SQLITE_RANGE";
       }
       if (p0 instanceof SQLiteDoneException) {
          return "SQLITE_DONE";
       }
       return "other";
    }
    public synchronized Future a(DBAction p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.offer(p0);
       return this.b.submit(new b(this.c, new a$b(this)));
    }
    public synchronized Future b(DBAction p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.offer(p0);
       return this.b.submit(new a$c(this));
    }
    public final void c(DBAction p0){
       a td;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
          return;
       }
       boolean b = false;
       int i = 2;
       try{
          td = this.d;
          if (td != null) {
             td.E().d(p0.a());
          }
       }catch(android.database.sqlite.SQLiteException e1){
          this.c.a(e1);
          if (this.e.c()) {
             this.c.logCustomEvent("V2_VADER_DB_ERROR", a.b(String.valueOf(i), a.i(e1), e1.getMessage(), "batch"));
          }
          b = true;
       }
       if (!b) {
          return;
       }else {
          Iterator iterator = p0.a().iterator();
          while (iterator.hasNext()) {
             LogRecord logRecord = iterator.next();
             try{
                td = this.d;
                if (td != null) {
                   td.E().i(logRecord);
                }
             }catch(android.database.sqlite.SQLiteException e1){
                this.c.a(e1);
                if (this.e.c()) {
                   this.c.logCustomEvent("V2_VADER_DB_ERROR", a.b(String.valueOf(i), a.i(e1), e1.getMessage(), "single"));
                   goto label_0050 ;
                }else {
                   goto label_0050 ;
                }
             }
          }
          return;
       }
    }
    public List d(Channel p0,int p1,int p2,int p3){
       a obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, a.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          obj = this.d;
          if (obj != null) {
             return obj.E().e(p0, p1, p2, p3);
          }else {
             return new ArrayList();
          }
       }catch(android.database.sqlite.SQLiteException e10){
          this.c.a(e10);
          if (this.e.c()) {
             this.c.logCustomEvent("V2_VADER_DB_ERROR", a.b(String.valueOf(4), a.i(e10), e10.getMessage(), String.valueOf(p0.getValue())));
          }
          return new ArrayList();
       }
    }
    public final void e(DBAction p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       p0.a().size();
       Objects.toString(p0.b());
       if (p0.b() == DBAction$Type.Add) {
          this.c(p0);
       }else if(p0.b() == DBAction$Type.Delete){
          this.f(p0);
       }else {
          throw new IllegalArgumentException("Unknown DBAction type : "+p0.b());
       }
       return;
    }
    public final void f(DBAction p0){
       a td;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "10")) {
          return;
       }
       boolean b = false;
       int i = 3;
       try{
          td = this.d;
          if (td != null) {
             td.E().a(p0.a());
          }
       }catch(android.database.sqlite.SQLiteException e1){
          if (this.e.c()) {
             this.c.logCustomEvent("V2_VADER_DB_ERROR", a.b(String.valueOf(i), a.i(e1), e1.getMessage(), "batch"));
          }
          this.c.a(e1);
          b = true;
       }
       if (!b) {
          return;
       }else {
          Iterator iterator = p0.a().iterator();
          while (iterator.hasNext()) {
             LogRecord logRecord = iterator.next();
             try{
                td = this.d;
                if (td != null) {
                   td.E().o(logRecord);
                }
             }catch(android.database.sqlite.SQLiteException e1){
                if (this.e.c()) {
                   this.c.logCustomEvent("V2_VADER_DB_ERROR", a.b(String.valueOf(i), a.i(e1), e1.getMessage(), "single"));
                }
                this.c.a(e1);
                goto label_0050 ;
             }
          }
          return;
       }
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       DBAction uDBAction = this.a.poll();
       while (uDBAction != null && uDBAction.b() != DBAction$Type.Sentinel) {
          int i = 0;
          DBAction uDBAction1 = this.a.peek();
          while (uDBAction1 != null && uDBAction.c(uDBAction1)) {
             this.a.poll();
             i = i + 1;
             if (i > 10) {
                break ;
             }
          }
          this.e(uDBAction);
       }
       return;
    }
    public synchronized Future h(Channel p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, a.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.a.offer(new DBAction(new ArrayList(), DBAction$Type.Sentinel));
       a$d uod = new a$d(this, p0, p1, p2, p3);
       return this.b.submit(v7);
    }
    public synchronized Future j(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.submit(new b(this.c, new a$a(this)));
    }
}
