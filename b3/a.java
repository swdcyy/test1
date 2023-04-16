package b3.a;
import a3.b;
import java.lang.String;
import android.database.sqlite.SQLiteDatabase;
import java.lang.Object;
import a3.e;
import android.os.CancellationSignal;
import android.database.Cursor;
import b3.a$b;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.database.sqlite.SQLiteTransactionListener;
import a3.a;
import b3.a$a;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import a3.f;
import a3.d;
import b3.e;
import android.database.sqlite.SQLiteStatement;
import java.util.List;
import android.content.ContentValues;
import java.util.Locale;
import java.util.Set;
import java.util.Iterator;
import java.lang.IllegalArgumentException;

public class a implements b	// class@0002b2
{
    public final SQLiteDatabase b;
    public static final String[] c;
    public static final String[] d;

    static {
       String[] stringArray = new String[]{""," OR ROLLBACK "," OR ABORT "," OR FAIL "," OR IGNORE "," OR REPLACE "};
       a.c = stringArray;
       stringArray = new String[0];
       a.d = stringArray;
    }
    public void a(SQLiteDatabase p0){
       super();
       this.b = p0;
    }
    public Cursor B1(e p0,CancellationSignal p1){
       return this.b.rawQueryWithFactory(new a$b(this, p0), p0.c(), a.d, null, p1);
    }
    public void B3(SQLiteTransactionListener p0){
       this.b.beginTransactionWithListenerNonExclusive(p0);
    }
    public Cursor G(String p0){
       return this.K1(new a(p0));
    }
    public Cursor K1(e p0){
       return this.b.rawQueryWithFactory(new a$a(this, p0), p0.c(), a.d, null);
    }
    public boolean a(SQLiteDatabase p0){
       boolean b = (this.b == p0)? true: false;
       return b;
    }
    public void beginTransaction(){
       this.b.beginTransaction();
    }
    public void beginTransactionNonExclusive(){
       this.b.beginTransactionNonExclusive();
    }
    public Cursor c0(String p0,Object[] p1){
       return this.K1(new a(p0, p1));
    }
    public int c2(String p0,String p1,Object[] p2){
       StringBuilder str = "DELETE FROM "+p0;
       p0 = (TextUtils.isEmpty(p1))? "": " WHERE "+p1;
       f uof = this.compileStatement(str+p0);
       a.e(uof, p2);
       return uof.executeUpdateDelete();
    }
    public void close(){
       this.b.close();
    }
    public f compileStatement(String p0){
       return new e(this.b.compileStatement(p0));
    }
    public void disableWriteAheadLogging(){
       this.b.disableWriteAheadLogging();
    }
    public boolean enableWriteAheadLogging(){
       return this.b.enableWriteAheadLogging();
    }
    public void endTransaction(){
       this.b.endTransaction();
    }
    public void execSQL(String p0){
       this.b.execSQL(p0);
    }
    public void execSQL(String p0,Object[] p1){
       this.b.execSQL(p0, p1);
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
       return this.b.insertWithOnConflict(p0, null, p2, p1);
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
       this.b.setTransactionSuccessful();
    }
    public void setVersion(int p0){
       this.b.setVersion(p0);
    }
    public void u1(SQLiteTransactionListener p0){
       this.b.beginTransactionWithListener(p0);
    }
    public int v3(String p0,int p1,ContentValues p2,String p3,Object[] p4){
       if (p2 == null || !p2.size()) {
          throw new IllegalArgumentException("Empty values");
       }
       StringBuilder str = new StringBuilder(120)+"UPDATE "+a.c[p1]+p0+" SET ";
       int i = p2.size();
       p1 = (p4 == null)? i: p4.length + i;
       Object[] objArray = new Object[p1];
       int i1 = 0;
       Iterator iterator = p2.keySet().iterator();
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          String str2 = (i1 > 0)? ",": "";
          int i2 = i1 + 1;
          objArray[i1] = p2.get(str1);
          str = str+str2+str1+"=?";
          i1 = i2;
       }
       if (p4 != null) {
          for (int i3 = i; i3 < p1; i3++) {
             i1 = i3 - i;
             objArray[i3] = p4[i1];
          }
       }
       if (!TextUtils.isEmpty(p3)) {
          str = str+" WHERE "+p3;
       }
       f uof = this.compileStatement(str);
       a.e(uof, objArray);
       return uof.executeUpdateDelete();
    }
    public boolean yieldIfContendedSafely(){
       return this.b.yieldIfContendedSafely();
    }
    public boolean yieldIfContendedSafely(long p0){
       return this.b.yieldIfContendedSafely(p0);
    }
}
