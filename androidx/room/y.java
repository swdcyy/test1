package androidx.room.y;
import a3.b;
import androidx.room.RoomDatabase$e;
import java.util.concurrent.Executor;
import java.lang.Object;
import a3.e;
import v2.f0;
import java.lang.String;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import android.os.CancellationSignal;
import android.database.Cursor;
import a3.d;
import v2.c0;
import java.lang.Runnable;
import android.database.sqlite.SQLiteTransactionListener;
import v2.y;
import v2.e0;
import v2.b0;
import v2.z;
import v2.w;
import java.util.Arrays;
import java.util.Collection;
import v2.v;
import java.io.Closeable;
import a3.f;
import androidx.room.b0;
import v2.t;
import v2.d0;
import v2.u;
import android.content.ContentValues;
import java.util.Locale;
import v2.x;
import v2.a0;

public final class y implements b	// class@000982
{
    public final b b;
    public final RoomDatabase$e c;
    public final Executor d;

    public void y(b p0,RoomDatabase$e p1,Executor p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    private void A(e p0,f0 p1){
       this.c.a(p0.c(), p1.a());
    }
    private void C(e p0,f0 p1){
       this.c.a(p0.c(), p1.a());
    }
    private void E(){
       this.c.a("TRANSACTION SUCCESSFUL", Collections.emptyList());
    }
    public static void a(y p0){
       p0.u();
    }
    public static void b(y p0){
       p0.p();
    }
    public static void c(y p0){
       p0.E();
    }
    public static void d(y p0,String p1,List p2){
       p0.x(p1, p2);
    }
    public static void e(y p0){
       p0.s();
    }
    public static void f(y p0,String p1){
       p0.v(p1);
    }
    public static void g(y p0,e p1,f0 p2){
       p0.A(p1, p2);
    }
    public static void h(y p0,String p1){
       p0.y(p1);
    }
    public static void i(y p0,String p1,List p2){
       p0.z(p1, p2);
    }
    public static void j(y p0,e p1,f0 p2){
       p0.C(p1, p2);
    }
    public static void k(y p0){
       p0.o();
    }
    public static void l(y p0){
       p0.r();
    }
    private void o(){
       this.c.a("BEGIN EXCLUSIVE TRANSACTION", Collections.emptyList());
    }
    private void p(){
       this.c.a("BEGIN DEFERRED TRANSACTION", Collections.emptyList());
    }
    private void r(){
       this.c.a("BEGIN EXCLUSIVE TRANSACTION", Collections.emptyList());
    }
    private void s(){
       this.c.a("BEGIN DEFERRED TRANSACTION", Collections.emptyList());
    }
    private void u(){
       this.c.a("END TRANSACTION", Collections.emptyList());
    }
    private void v(String p0){
       this.c.a(p0, new ArrayList(0));
    }
    private void x(String p0,List p1){
       this.c.a(p0, p1);
    }
    private void y(String p0){
       this.c.a(p0, Collections.emptyList());
    }
    private void z(String p0,List p1){
       this.c.a(p0, p1);
    }
    public Cursor B1(e p0,CancellationSignal p1){
       f0 uof0 = new f0();
       p0.d(uof0);
       this.d.execute(new c0(this, p0, uof0));
       return this.b.K1(p0);
    }
    public void B3(SQLiteTransactionListener p0){
       this.d.execute(new y(this));
       this.b.B3(p0);
    }
    public Cursor G(String p0){
       this.d.execute(new e0(this, p0));
       return this.b.G(p0);
    }
    public Cursor K1(e p0){
       f0 uof0 = new f0();
       p0.d(uof0);
       this.d.execute(new b0(this, p0, uof0));
       return this.b.K1(p0);
    }
    public void beginTransaction(){
       this.d.execute(new z(this));
       this.b.beginTransaction();
    }
    public void beginTransactionNonExclusive(){
       this.d.execute(new w(this));
       this.b.beginTransactionNonExclusive();
    }
    public Cursor c0(String p0,Object[] p1){
       ArrayList uArrayList = new ArrayList();
       uArrayList.addAll(Arrays.asList(p1));
       this.d.execute(new v(this, p0, uArrayList));
       return this.b.c0(p0, p1);
    }
    public int c2(String p0,String p1,Object[] p2){
       return this.b.c2(p0, p1, p2);
    }
    public void close(){
       this.b.close();
    }
    public f compileStatement(String p0){
       return new b0(this.b.compileStatement(p0), this.c, p0, this.d);
    }
    public void disableWriteAheadLogging(){
       this.b.disableWriteAheadLogging();
    }
    public boolean enableWriteAheadLogging(){
       return this.b.enableWriteAheadLogging();
    }
    public void endTransaction(){
       this.d.execute(new t(this));
       this.b.endTransaction();
    }
    public void execSQL(String p0){
       this.d.execute(new d0(this, p0));
       this.b.execSQL(p0);
    }
    public void execSQL(String p0,Object[] p1){
       ArrayList uArrayList = new ArrayList();
       uArrayList.addAll(Arrays.asList(p1));
       this.d.execute(new u(this, p0, uArrayList));
       this.b.execSQL(p0, uArrayList.toArray());
    }
    public List getAttachedDbs(){
       return this.b.getAttachedDbs();
    }
    public long getMaximumSize(){
       return this.b.getMaximumSize();
    }
    public long getPageSize(){
       return this.b.getPageSize();
    }
    public String getPath(){
       return this.b.getPath();
    }
    public int getVersion(){
       return this.b.getVersion();
    }
    public boolean inTransaction(){
       return this.b.inTransaction();
    }
    public boolean isDatabaseIntegrityOk(){
       return this.b.isDatabaseIntegrityOk();
    }
    public boolean isDbLockedByCurrentThread(){
       return this.b.isDbLockedByCurrentThread();
    }
    public boolean isOpen(){
       return this.b.isOpen();
    }
    public boolean isReadOnly(){
       return this.b.isReadOnly();
    }
    public boolean isWriteAheadLoggingEnabled(){
       return this.b.isWriteAheadLoggingEnabled();
    }
    public long m0(String p0,int p1,ContentValues p2){
       return this.b.m0(p0, p1, p2);
    }
    public boolean needUpgrade(int p0){
       return this.b.needUpgrade(p0);
    }
    public void setForeignKeyConstraintsEnabled(boolean p0){
       this.b.setForeignKeyConstraintsEnabled(p0);
    }
    public void setLocale(Locale p0){
       this.b.setLocale(p0);
    }
    public void setMaxSqlCacheSize(int p0){
       this.b.setMaxSqlCacheSize(p0);
    }
    public long setMaximumSize(long p0){
       return this.b.setMaximumSize(p0);
    }
    public void setPageSize(long p0){
       this.b.setPageSize(p0);
    }
    public void setTransactionSuccessful(){
       this.d.execute(new x(this));
       this.b.setTransactionSuccessful();
    }
    public void setVersion(int p0){
       this.b.setVersion(p0);
    }
    public void u1(SQLiteTransactionListener p0){
       this.d.execute(new a0(this));
       this.b.u1(p0);
    }
    public int v3(String p0,int p1,ContentValues p2,String p3,Object[] p4){
       return this.b.v3(p0, p1, p2, p3, p4);
    }
    public boolean yieldIfContendedSafely(){
       return this.b.yieldIfContendedSafely();
    }
    public boolean yieldIfContendedSafely(long p0){
       return this.b.yieldIfContendedSafely(p0);
    }
}
