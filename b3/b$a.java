package b3.b$a;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import java.lang.String;
import b3.a;
import a3.c$a;
import b3.b$a$a;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import a3.b;

public class b$a extends SQLiteOpenHelper	// class@0002b4
{
    public final a[] b;
    public final c$a c;
    public boolean d;

    public void b$a(Context p0,String p1,a[] p2,c$a p3){
       super(p0, p1, null, p3.a, new b$a$a(p3, p2));
       this.c = p3;
       this.b = p2;
    }
    public static a c(a[] p0,SQLiteDatabase p1){
       object oobject = p0[0];
       if (oobject == null || !oobject.a(p1)) {
          p0[0] = new a(p1);
       }
       return p0[0];
    }
    public synchronized b a(){
       this.d = false;
       SQLiteDatabase readableData = this.getReadableDatabase();
       if (this.d == null) {
          return this.b(readableData);
       }
       this.close();
       return this.a();
    }
    public a b(SQLiteDatabase p0){
       return b$a.c(this.b, p0);
    }
    public synchronized void close(){
       super.close();
       this.b[0] = null;
    }
    public synchronized b e(){
       this.d = false;
       SQLiteDatabase writableData = this.getWritableDatabase();
       if (this.d == null) {
          return this.b(writableData);
       }
       this.close();
       return this.e();
    }
    public void onConfigure(SQLiteDatabase p0){
       this.c.b(this.b(p0));
    }
    public void onCreate(SQLiteDatabase p0){
       this.c.d(this.b(p0));
    }
    public void onDowngrade(SQLiteDatabase p0,int p1,int p2){
       this.d = true;
       this.c.e(this.b(p0), p1, p2);
    }
    public void onOpen(SQLiteDatabase p0){
       if (this.d == null) {
          this.c.f(this.b(p0));
       }
       return;
    }
    public void onUpgrade(SQLiteDatabase p0,int p1,int p2){
       this.d = true;
       this.c.g(this.b(p0), p1, p2);
    }
}
