package ixd.c;
import ixd.a;
import java.lang.Object;
import org.sqlite.database.sqlite.SQLiteDatabase;
import java.lang.String;
import java.util.List;
import org.sqlite.database.sqlite.SQLiteClosable;
import java.util.Iterator;
import android.util.Pair;
import java.io.File;
import java.lang.Exception;

public final class c implements a	// class@001526
{

    public void c(){
       super();
    }
    public void a(SQLiteDatabase p0){
       p0.getPath();
       if (SQLiteDatabase.hasCodec()) {
          return;
       }
       if (!p0.isOpen()) {
          this.b(p0.getPath());
          return;
       }else {
          List list = null;
          try{
             list = p0.getAttachedDbs();
             try{
                p0.close();
             }catch(org.sqlite.database.sqlite.SQLiteException e0){
             }
             if (e0 != null) {
                Iterator iterator = e0.iterator();
                while (iterator.hasNext()) {
                   this.b(iterator.next().second);
                }
             }else {
                this.b(p0.getPath());
             }
             return;
          }catch(org.sqlite.database.sqlite.SQLiteException e0){
          }
       }
    }
    public final void b(String p0){
       if (!p0.equalsIgnoreCase(":memory:") && (p0.trim()).length()) {
          try{
             SQLiteDatabase.deleteDatabase(new File(p0));
          }catch(java.lang.Exception e2){
             e2.getMessage();
          }
       }
    }
}
