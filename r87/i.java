package r87.i;
import java.util.HashMap;
import com.kwai.logger.KwaiLog;
import java.util.List;
import q87.b;
import java.util.Iterator;
import java.lang.Object;
import q87.g;
import java.lang.CharSequence;
import android.text.TextUtils;
import r87.h$b;
import java.lang.Math;
import r87.g;
import r87.h;
import java.lang.String;
import r87.h$a;
import java.util.Map;

public class i	// class@002320
{
    public static final Map a;

    static {
       i.a = new HashMap();
    }
    public static void a(){
       long l1;
       Iterator iterator = KwaiLog.a.e().iterator();
       while (iterator.hasNext()) {
          g og = iterator.next();
          if (TextUtils.isEmpty(og.a)) {
             continue ;
          }else {
             h$b uob = new h$b();
             uob.a = og.a;
             g c = og.c;
             uob.c = c;
             long l = c / 10;
             int i = 0x1400000;
             if (l - i > 0) {
                l1 = i;
             }else {
                long l2 = 0x100000;
                if (l - l2 < 0) {
                   long l3 = c / 3;
                   l = Math.min(l3, l2);
                }
                l1 = l;
             }
             uob.d = l1;
             g b = og.b;
             uob.b = b;
             h oh = new h(uob.a, b, uob.c, l1, null);
             i.a.put(og.a, new g(v4));
          }
       }
       return;
    }
}
