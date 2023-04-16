package androidx.room.w$a;
import java.lang.Runnable;
import androidx.room.w;
import java.lang.Object;
import java.util.Set;
import java.util.HashSet;
import a3.a;
import java.lang.String;
import a3.e;
import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.lang.Integer;
import a3.f;
import java.util.concurrent.locks.Lock;
import androidx.room.a;
import java.util.concurrent.atomic.AtomicBoolean;
import a3.c;
import a3.b;
import java.util.Iterator;
import y0.b;
import y0.b$e;
import java.util.Map$Entry;
import androidx.room.w$d;

public class w$a implements Runnable	// class@000275
{
    public final w b;

    public void w$a(w p0){
       this.b = p0;
       super();
    }
    public final Set a(){
       HashSet hashSet = new HashSet();
       Cursor uCursor = this.b.e.A(new a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
       while (uCursor.moveToNext()) {
          hashSet.add(Integer.valueOf(uCursor.getInt(0)));
       }
       uCursor.close();
       if (!hashSet.isEmpty()) {
          this.b.h.executeUpdateDelete();
       }
       return hashSet;
    }
    public void run(){
       w d;
       Set set;
       Lock lock = this.b.e.l();
       lock.lock();
       try{
          int i = 0;
          if (!this.b.f()) {
             lock.unlock();
             d = this.b.d;
             if (d != null) {
                d.b();
             }
             return;
          }else if(!this.b.f.compareAndSet(true, false)){
             lock.unlock();
             d = this.b.d;
             if (d != null) {
                d.b();
             }
             return;
          }else if(this.b.e.r()){
             lock.unlock();
             d = this.b.d;
             if (d != null) {
                d.b();
             }
             return;
          }else {
             try{
                w e = this.b.e;
                if (e.g != null) {
                   b uob = e.n().e0();
                   uob.beginTransactionNonExclusive();
                   set = this.a();
                   uob.setTransactionSuccessful();
                   uob.endTransaction();
                }else {
                   set = this.a();
                }
                lock.unlock();
                d = this.b.d;
                if (d != null) {
                }
             }catch( e0){
             }
             if (!i.isEmpty()) {
                d = this.b.k;
                _monitor_enter(d);
                Iterator iterator = this.b.k.iterator();
                Iterator iterator1 = iterator;
                while (iterator1.hasNext()) {
                   iterator1.next().getValue().a(i);
                }
                _monitor_exit(d);
             }
          }
       label_009d :
          if (i != null && !i.isEmpty()) {
             goto label_00a5 ;
          }
          return;
       }catch(java.lang.IllegalStateException e0){
          e0.unlock();
          d = this.b.d;
          if (d != null) {
          }else {
             goto label_009d ;
          }
       }catch(android.database.sqlite.SQLiteException e0){
       }
       d.b();
       goto label_009d ;
    }
}
