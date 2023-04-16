package pm7.i;
import java.lang.Thread$UncaughtExceptionHandler;
import pm7.h;
import java.lang.Object;
import java.lang.Thread;
import java.util.List;
import java.util.Iterator;
import java.lang.String;
import com.kwai.robust.Robust;
import android.content.Context;
import java.io.File;
import com.kwai.robust2.patchmanager.b;
import pm7.e;
import pm7.d;
import java.lang.StringBuilder;
import pm7.b;
import java.lang.Throwable;
import com.kwai.robust2.patchmanager.c;
import java.util.ArrayList;
import java.lang.CharSequence;
import java.lang.Iterable;
import android.text.TextUtils;
import ekd.a0;
import android.content.SharedPreferences;
import oe6.o;
import java.lang.System;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class i implements Thread$UncaughtExceptionHandler	// class@0021db
{
    public final Thread$UncaughtExceptionHandler a;
    public final h b;

    public void i(h p0){
       super();
       this.a = Thread.getDefaultUncaughtExceptionHandler();
       this.b = p0;
    }
    public static void a(h p0,List p1){
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          Robust.get().rollbackPatch(p0.b(), str);
          b.t(p0.e(), p0.f(), str);
          Object[] objArray = new Object[0];
          d.b().a("PatchCrashProtector", "cleanAllPatch OK, patchId:"+str, objArray);
       }
       return;
    }
    public void uncaughtException(Thread p0,Throwable p1){
       List list = c.a().b();
       if (this.b == null || list.size() <= 0) {
          this.a.uncaughtException(p0, p1);
          return;
       }else {
          String str = a0.c(TextUtils.join("_", list));
          String str1 = "PrevCrashTime_"+str;
          str = "CrashCount_"+str;
          SharedPreferences sharedPrefer = o.c(this.b.b(), "RobustCrashInfo", 0);
          long longx = sharedPrefer.getLong(str1, System.currentTimeMillis());
          int i = sharedPrefer.getInt(str, 0) + 1;
          if (i >= 5 || (i >= 2 && (System.currentTimeMillis() - longx) - 0x36ee80 < 0)) {
             i.a(this.b, list);
             g.b(sharedPrefer.edit().clear());
          }else {
             g.b(sharedPrefer.edit().putInt(str, i).putLong(str1, longx));
          }
          this.a.uncaughtException(p0, p1);
          return;
       }
    }
}
