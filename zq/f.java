package zq.f;
import er.m;
import java.lang.String;
import java.lang.Object;
import android.content.Context;
import androidx.room.RoomDatabase$JournalMode;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import java.lang.StringBuilder;
import tq.d;
import java.lang.Boolean;
import com.kuaishou.android.vader.persistent.LogRecordDatabase;
import com.kuaishou.android.vader.persistent.LogRecordDatabaseLite;
import androidx.room.RoomDatabase$a;
import androidx.room.c0;
import w2.c;
import androidx.room.RoomDatabase;
import tq.f;
import com.kuaishou.android.vader.persistent.a;
import ar.c;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kuaishou.android.vader.Channel;
import er.h;
import vq.d;
import er.j;
import er.i;
import tq.h;

public class f	// class@002961
{
    public m a;
    public String b;

    public void f(m p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static RoomDatabase$JournalMode a(Context p0,m p1){
       RoomDatabase$JournalMode obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = RoomDatabase$JournalMode.AUTOMATIC;
       if (f.g()) {
          obj = RoomDatabase$JournalMode.TRUNCATE;
          String absolutePath = p0.getDatabasePath(p1.c()).getAbsolutePath();
          File uFile = new File(absolutePath+"-shm");
          StringBuilder str = absolutePath;
          File uFile1 = new File(str+"-wal");
          boolean b = false;
          boolean b1 = (!uFile.exists() || (uFile.exists() && uFile.delete()))? true: false;
          if (!uFile1.exists() || (uFile1.exists() && uFile1.delete())) {
             b = true;
          }
          p1.d().b("force_delete_wal_files", "shm: "+b1+", wal: "+b);
       }
       return obj;
    }
    public static boolean g(){
       Object obj = PatchProxy.apply(null, null, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
    public LogRecordDatabase b(Context p0){
       RoomDatabase$JournalMode obj = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = f.a(p0, this.a);
       this.a.d().b("use_mode", "mode: "+obj);
       RoomDatabase$a uoa = c0.a(p0, LogRecordDatabaseLite.class, this.a.c());
       c[] uocArray = new c[]{LogRecordDatabase.n};
       uoa.b(uocArray);
       uoa.h(obj);
       return uoa.d();
    }
    public Map c(Context p0,f p1,a p2,c p3){
       f uof = this;
       HashMap obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       f a = uof.a;
       if (a != null) {
          Map map = a.a();
          if (map != null) {
             Iterator iterator = map.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                Channel key = uEntry.getKey();
                h value = uEntry.getValue();
                if (key != null && value != null) {
                   super(p0, p1, key, uof.a.d(), value.d(), p2, p3, value.c());
                   obj.put(key, this);
                }
             }
          }
       }
       return obj;
    }
    public String d(){
       return this.b;
    }
    public d e(){
       Object obj = PatchProxy.apply(null, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.d();
    }
    public m f(){
       return this.a;
    }
    public h h(){
       Object obj = PatchProxy.applyWithListener(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(f.class, "2");
       return this.a.e();
    }
}
