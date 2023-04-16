package androidx.room.d0;
import a3.c$a;
import androidx.room.t;
import androidx.room.d0$a;
import java.lang.String;
import a3.b;
import android.database.Cursor;
import androidx.room.d0$b;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.util.List;
import androidx.room.RoomDatabase$c;
import java.util.Iterator;
import java.lang.Object;
import w2.c;
import a3.a;
import a3.e;
import v2.n0;

public class d0 extends c$a	// class@00026d
{
    public t b;
    public final d0$a c;
    public final String d;
    public final String e;

    public void d0(t p0,d0$a p1,String p2,String p3){
       super(p1.a);
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public static boolean j(b p0){
       Cursor uCursor = p0.G("SELECT count\(*\) FROM sqlite_master WHERE name != \'android_metadata\'");
       int i = 0;
       if (uCursor.moveToFirst() && !uCursor.getInt(i)) {
          i = true;
       }
       uCursor.close();
       return i;
    }
    public static boolean k(b p0){
       Cursor uCursor = p0.G("SELECT 1 FROM sqlite_master WHERE type = \'table\' AND name=\'room_master_table\'");
       int i = 0;
       if (uCursor.moveToFirst() && uCursor.getInt(i)) {
          i = true;
       }
       uCursor.close();
       return i;
    }
    public void b(b p0){
    }
    public void d(b p0){
       this.c.a(p0);
       if (!d0.j(p0)) {
          d0$b uob = this.c.g(p0);
          if (uob.a == null) {
             throw new IllegalStateException("Pre-packaged database has an invalid schema: "+uob.b);
          }
       }
       this.l(p0);
       this.c.c(p0);
       return;
    }
    public void e(b p0,int p1,int p2){
       this.g(p0, p1, p2);
    }
    public void f(b p0){
       this.h(p0);
       this.c.d(p0);
       this.b = null;
    }
    public void g(b p0,int p1,int p2){
       d0 tb = this.b;
       if (tb != null) {
          List list = tb.d.c(p1, p2);
          if (list != null) {
             this.c.f(p0);
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                iterator.next().a(p0);
             }
             d0$b uob = this.c.g(p0);
             if (uob.a != null) {
                this.c.e(p0);
                this.l(p0);
                tb = 1;
             label_0053 :
                if (!tb) {
                   tb = this.b;
                   if (tb != null && !tb.a(p1, p2)) {
                      this.c.b(p0);
                      this.c.a(p0);
                   }else {
                      throw new IllegalStateException("A migration from "+p1+" to "+p2+" was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration\(Migration ...\) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
                   }
                }
                return;
             }else {
                throw new IllegalStateException("Migration didn\'t properly handle: "+uob.b);
             }
          }
       }
       tb = null;
       goto label_0053 ;
    }
    public final void h(b p0){
       if (d0.k(p0)) {
          String str = null;
          Cursor uCursor = p0.K1(new a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
          if (uCursor.moveToFirst()) {
             str = uCursor.getString(0);
          }
          uCursor.close();
          if (!(this.d).equals(str) && !(this.e).equals(str)) {
             throw new IllegalStateException("Room cannot verify the data integrity. Looks like you\'ve changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
          }
       }else {
          d0$b uob = this.c.g(p0);
          if (uob.a != null) {
             this.c.e(p0);
             this.l(p0);
          }else {
             throw new IllegalStateException("Pre-packaged database has an invalid schema: "+uob.b);
          }
       }
       return;
    }
    public final void i(b p0){
       p0.execSQL("CREATE TABLE IF NOT EXISTS room_master_table \(id INTEGER PRIMARY KEY,identity_hash TEXT\)");
    }
    public final void l(b p0){
       this.i(p0);
       p0.execSQL(n0.a(this.d));
    }
}
