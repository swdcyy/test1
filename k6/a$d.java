package k6.a$d;
import android.content.Context;
import java.lang.String;
import s6.a;
import u6.g;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Long;

public final class a$d	// class@00248b
{

    public static synchronized long a(Context p0,String p1){
       _monitor_enter(a$d.class);
       String str = g.b(null, p0, p1, null);
       long l = (!TextUtils.isEmpty(str))? Long.parseLong(str): 0;
       l = l + 1;
       g.c(null, p0, p1, Long.toString(l));
       _monitor_exit(a$d.class);
       return l;
    }
}
