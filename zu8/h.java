package zu8.h;
import java.lang.Runnable;
import com.yxcorp.experiment.logger.a;
import java.lang.Object;
import java.util.Map;
import dv8.b;
import java.util.concurrent.ConcurrentHashMap;
import dv8.a;
import java.lang.String;
import android.content.SharedPreferences;
import java.util.UUID;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class h implements Runnable	// class@00297d
{
    public final a b;

    public void h(a p0){
       this.b = p0;
    }
    public final void run(){
       h tb = this.b;
       tb.a.putAll(tb.i.a());
       tb.c.putAll(tb.j.a());
       a k = tb.k;
       _monitor_enter(k);
       String str = k.a.getString("KEY_LOG_UUID", null);
       if (str == null) {
          str = UUID.randomUUID().toString();
          SharedPreferences$Editor uEditor = k.a.edit();
          uEditor.putString("KEY_LOG_UUID", str);
          g.a(uEditor);
       }
       _monitor_exit(k);
       tb.l = str;
       return;
    }
}
