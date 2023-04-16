package gx8.a;
import hkd.d;
import com.yxcorp.utility.m;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Long;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.content.ContentValues;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.lang.Throwable;

public class a extends d	// class@002515
{
    public List b;
    public m c;

    public void a(m p0,List p1){
       super();
       this.b = p1;
       this.c = p0;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       if (this.c != null && !this.b.isEmpty()) {
          Iterator iterator = this.b.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             a tc = this.c;
             _monitor_enter(tc);
             int i = 0;
             tc.f();
             String[] stringArray = new String[]{"value"};
             String[] stringArray1 = new String[2];
             stringArray1[i] = String.valueOf(Long.parseLong(QCurrentUser.me().getId()));
             int i1 = 1;
             stringArray1[i1] = str;
             Cursor uCursor = tc.e.query(tc.c, stringArray, "groupid = ? and value = ? ", stringArray1, null, null, null);
             if (uCursor != null && uCursor.moveToNext()) {
                uCursor.close();
                tc.a();
                _monitor_exit(tc);
             }else if(uCursor != null){
                uCursor.close();
             }
             tc.a();
             _monitor_exit(tc);
             i1 = 0;
             if (!i1) {
                tc = this.c;
                _monitor_enter(tc);
                ContentValues uContentValu = new ContentValues();
                uContentValu.put("groupid", Long.valueOf(Long.parseLong(QCurrentUser.me().getId())));
                uContentValu.put("value", str);
                uContentValu.put("isDelayedLog", Integer.valueOf(i));
                tc.f();
                long l = tc.e.insert(tc.c, null, uContentValu);
                if (l - -1) {
                   tc.a();
                   _monitor_exit(tc);
                }else {
                   Log.d("StorageUtil", "addData failed \(value="+str+"\) "+l);
                   tc.a();
                   _monitor_exit(tc);
                }
             }
          }
       }
       return;
    }
}
