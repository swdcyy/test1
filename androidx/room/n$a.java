package androidx.room.n$a;
import a3.b;
import androidx.room.a;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;
import android.content.ContentValues;
import java.lang.Integer;
import java.util.Locale;
import java.lang.Boolean;
import a3.e;
import android.os.CancellationSignal;
import android.database.Cursor;
import androidx.room.n$c;
import android.database.sqlite.SQLiteTransactionListener;
import androidx.room.b;
import z0.a;
import v2.k;
import a3.f;
import androidx.room.n$b;
import java.lang.UnsupportedOperationException;
import java.lang.IllegalStateException;
import v2.h;
import v2.l;
import java.util.List;
import androidx.room.d;
import androidx.room.l;
import androidx.room.m;
import androidx.room.e;
import androidx.room.f;
import androidx.room.g;
import androidx.room.h;
import androidx.room.i;
import androidx.room.j;
import androidx.room.c;
import v2.i;
import v2.a;
import v2.c;
import v2.b;
import v2.d;
import v2.g;
import v2.f;
import v2.e;
import v2.j;
import androidx.room.k;

public final class n$a implements b	// class@000967
{
    public final a b;

    public void n$a(a p0){
       super();
       this.b = p0;
    }
    public static Object A(int p0,b p1){
       p1.setMaxSqlCacheSize(p0);
       return null;
    }
    public static Long C(long p0,b p1){
       return Long.valueOf(p1.setMaximumSize(p0));
    }
    public static Object E(long p0,b p1){
       p1.setPageSize(p0);
       return null;
    }
    public static Object I(int p0,b p1){
       p1.setVersion(p0);
       return null;
    }
    public static Integer J(String p0,int p1,ContentValues p2,String p3,Object[] p4,b p5){
       return Integer.valueOf(p5.v3(p0, p1, p2, p3, p4));
    }
    public static Object a(String p0,Object[] p1,b p2){
       n$a.s(p0, p1, p2);
       return null;
    }
    public static Object b(boolean p0,b p1){
       n$a.y(p0, p1);
       return null;
    }
    public static Object c(Locale p0,b p1){
       n$a.z(p0, p1);
       return null;
    }
    public static Integer d(String p0,int p1,ContentValues p2,String p3,Object[] p4,b p5){
       return n$a.J(p0, p1, p2, p3, p4, p5);
    }
    public static Integer e(String p0,String p1,Object[] p2,b p3){
       return n$a.p(p0, p1, p2, p3);
    }
    public static Object f(long p0,b p1){
       n$a.E(p0, p1);
       return null;
    }
    public static Object g(String p0,b p1){
       n$a.r(p0, p1);
       return null;
    }
    public static Long h(long p0,b p1){
       return n$a.C(p0, p1);
    }
    public static Boolean i(int p0,b p1){
       return n$a.x(p0, p1);
    }
    public static Long j(String p0,int p1,ContentValues p2,b p3){
       return n$a.u(p0, p1, p2, p3);
    }
    public static Boolean k(b p0){
       return n$a.v(p0);
    }
    public static Object l(int p0,b p1){
       n$a.A(p0, p1);
       return null;
    }
    public static Object o(int p0,b p1){
       n$a.I(p0, p1);
       return null;
    }
    public static Integer p(String p0,String p1,Object[] p2,b p3){
       return Integer.valueOf(p3.c2(p0, p1, p2));
    }
    public static Object r(String p0,b p1){
       p1.execSQL(p0);
       return null;
    }
    public static Object s(String p0,Object[] p1,b p2){
       p2.execSQL(p0, p1);
       return null;
    }
    public static Long u(String p0,int p1,ContentValues p2,b p3){
       return Long.valueOf(p3.m0(p0, p1, p2));
    }
    public static Boolean v(b p0){
       return Boolean.valueOf(p0.isWriteAheadLoggingEnabled());
    }
    public static Boolean x(int p0,b p1){
       return Boolean.valueOf(p1.needUpgrade(p0));
    }
    public static Object y(boolean p0,b p1){
       p1.setForeignKeyConstraintsEnabled(p0);
       return null;
    }
    public static Object z(Locale p0,b p1){
       p1.setLocale(p0);
       return null;
    }
    public Cursor B1(e p0,CancellationSignal p1){
       return new n$c(this.b.e().B1(p0, p1), this.b);
    }
    public void B3(SQLiteTransactionListener p0){
       this.b.e().B3(p0);
    }
    public Cursor G(String p0){
       return new n$c(this.b.e().G(p0), this.b);
    }
    public void K(){
       this.b.c(b.a);
    }
    public Cursor K1(e p0){
       return new n$c(this.b.e().K1(p0), this.b);
    }
    public void beginTransaction(){
       this.b.e().beginTransaction();
    }
    public void beginTransactionNonExclusive(){
       this.b.e().beginTransactionNonExclusive();
    }
    public Cursor c0(String p0,Object[] p1){
       return new n$c(this.b.e().c0(p0, p1), this.b);
    }
    public int c2(String p0,String p1,Object[] p2){
       return this.b.c(new k(p0, p1, p2)).intValue();
    }
    public void close(){
       this.b.a();
    }
    public f compileStatement(String p0){
       return new n$b(p0, this.b);
    }
    public void disableWriteAheadLogging(){
       throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
    }
    public boolean enableWriteAheadLogging(){
       throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
    }
    public void endTransaction(){
       if (this.b.d() == null) {
          throw new IllegalStateException("End transaction called but delegateDb is null");
       }
       this.b.d().endTransaction();
       this.b.b();
       return;
    }
    public void execSQL(String p0){
       this.b.c(new h(p0));
    }
    public void execSQL(String p0,Object[] p1){
       this.b.c(new l(p0, p1));
    }
    public List getAttachedDbs(){
       return this.b.c(d.a);
    }
    public long getMaximumSize(){
       return this.b.c(l.a).longValue();
    }
    public long getPageSize(){
       return this.b.c(m.a).longValue();
    }
    public String getPath(){
       return this.b.c(e.a);
    }
    public int getVersion(){
       return this.b.c(f.a).intValue();
    }
    public boolean inTransaction(){
       if (this.b.d() == null) {
          return false;
       }
       return this.b.c(g.a).booleanValue();
    }
    public boolean isDatabaseIntegrityOk(){
       return this.b.c(h.a).booleanValue();
    }
    public boolean isDbLockedByCurrentThread(){
       if (this.b.d() == null) {
          return false;
       }
       return this.b.c(i.a).booleanValue();
    }
    public boolean isOpen(){
       b uob = this.b.d();
       if (uob == null) {
          return false;
       }
       return uob.isOpen();
    }
    public boolean isReadOnly(){
       return this.b.c(j.a).booleanValue();
    }
    public boolean isWriteAheadLoggingEnabled(){
       return this.b.c(c.a).booleanValue();
    }
    public long m0(String p0,int p1,ContentValues p2){
       return this.b.c(new i(p0, p1, p2)).longValue();
    }
    public boolean needUpgrade(int p0){
       return this.b.c(new a(p0)).booleanValue();
    }
    public void setForeignKeyConstraintsEnabled(boolean p0){
       this.b.c(new c(p0));
    }
    public void setLocale(Locale p0){
       this.b.c(new b(p0));
    }
    public void setMaxSqlCacheSize(int p0){
       this.b.c(new d(p0));
    }
    public long setMaximumSize(long p0){
       return this.b.c(new g(p0)).longValue();
    }
    public void setPageSize(long p0){
       this.b.c(new f(p0));
    }
    public void setTransactionSuccessful(){
       b uob = this.b.d();
       if (uob == null) {
          throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
       }
       uob.setTransactionSuccessful();
       return;
    }
    public void setVersion(int p0){
       this.b.c(new e(p0));
    }
    public void u1(SQLiteTransactionListener p0){
       this.b.e().u1(p0);
    }
    public int v3(String p0,int p1,ContentValues p2,String p3,Object[] p4){
       j oj = new j(p0, p1, p2, p3, p4);
       return this.b.c(v7).intValue();
    }
    public boolean yieldIfContendedSafely(){
       return this.b.c(k.a).booleanValue();
    }
    public boolean yieldIfContendedSafely(long p0){
       return this.b.c(k.a).booleanValue();
    }
}
