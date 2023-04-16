package a3.b;
import java.io.Closeable;
import a3.e;
import android.os.CancellationSignal;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import java.lang.String;
import java.lang.Object;
import a3.f;
import java.util.List;
import android.content.ContentValues;
import java.util.Locale;

public interface abstract b implements Closeable	// class@000014
{

    Cursor B1(e p0,CancellationSignal p1);
    void B3(SQLiteTransactionListener p0);
    Cursor G(String p0);
    Cursor K1(e p0);
    void beginTransaction();
    void beginTransactionNonExclusive();
    Cursor c0(String p0,Object[] p1);
    int c2(String p0,String p1,Object[] p2);
    f compileStatement(String p0);
    void disableWriteAheadLogging();
    boolean enableWriteAheadLogging();
    void endTransaction();
    void execSQL(String p0);
    void execSQL(String p0,Object[] p1);
    List getAttachedDbs();
    long getMaximumSize();
    long getPageSize();
    String getPath();
    int getVersion();
    boolean inTransaction();
    boolean isDatabaseIntegrityOk();
    boolean isDbLockedByCurrentThread();
    boolean isOpen();
    boolean isReadOnly();
    boolean isWriteAheadLoggingEnabled();
    long m0(String p0,int p1,ContentValues p2);
    boolean needUpgrade(int p0);
    void setForeignKeyConstraintsEnabled(boolean p0);
    void setLocale(Locale p0);
    void setMaxSqlCacheSize(int p0);
    long setMaximumSize(long p0);
    void setPageSize(long p0);
    void setTransactionSuccessful();
    void setVersion(int p0);
    void u1(SQLiteTransactionListener p0);
    int v3(String p0,int p1,ContentValues p2,String p3,Object[] p4);
    boolean yieldIfContendedSafely();
    boolean yieldIfContendedSafely(long p0);
}
