package a3.c$a;
import java.lang.Object;
import java.lang.String;
import java.io.File;
import android.database.sqlite.SQLiteDatabase;
import a3.b;
import b3.a;
import java.util.List;
import java.io.Closeable;
import java.util.Iterator;
import android.util.Pair;
import android.database.sqlite.SQLiteException;
import java.lang.StringBuilder;

public abstract class c$a	// class@000015
{
    public final int a;

    public void c$a(int p0){
       super();
       this.a = p0;
    }
    public final void a(String p0){
       try{
          if (!p0.equalsIgnoreCase(":memory:") && (p0.trim()).length()) {
             SQLiteDatabase.deleteDatabase(new File(p0));
          }
       label_001b :
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void b(b p0){
    }
    public void c(b p0){
       p0.getPath();
       if (!p0.isOpen()) {
          this.a(p0.getPath());
          return;
       }else {
          List list = null;
          try{
             list = p0.getAttachedDbs();
             try{
                p0.close();
             }catch(java.io.IOException e0){
             }
             if (e0 != null) {
                Iterator iterator = e0.iterator();
                while (iterator.hasNext()) {
                   this.a(iterator.next().second);
                }
             }else {
                this.a(p0.getPath());
             }
             return;
          }catch(android.database.sqlite.SQLiteException e0){
          }
       }
    }
    public abstract void d(b p0);
    public void e(b p0,int p1,int p2){
       throw new SQLiteException("Can\'t downgrade database from version "+p1+" to "+p2);
    }
    public void f(b p0){
    }
    public abstract void g(b p0,int p1,int p2);
}
