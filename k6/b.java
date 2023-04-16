package k6.b;
import java.lang.Runnable;
import java.lang.String;
import android.content.Context;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import k6.a$b;
import k6.a$a;
import u6.c;
import k6.a$a$a;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Throwable;

public final class b implements Runnable	// class@00248e
{
    public final String b;
    public final Context c;

    public void b(String p0,Context p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void run(){
       if (!TextUtils.isEmpty(this.b) && !a$b.b(this.c, this.b)) {
          return;
       }
       int i = 0;
       while (i < 4) {
          b tc = this.c;
          _monitor_enter(a$a.class);
          c.e("RecordPref", "stat peek");
          CharSequence uCharSequenc = null;
          if (tc == null) {
             _monitor_exit(a$a.class);
          }else {
             a$a$a uoa$a = a$a.c(tc);
             if (uoa$a.a.isEmpty()) {
                _monitor_exit(a$a.class);
             }else {
                _monitor_exit(a$a.class);
                uCharSequenc = uoa$a.a.entrySet().iterator().next().getValue();
             }
          }
          if (TextUtils.isEmpty(uCharSequenc) || !a$b.b(this.c, uCharSequenc)) {
             break ;
          }
          i = i + 1;
       }
       return;
    }
}
