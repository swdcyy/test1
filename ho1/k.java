package ho1.k;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Number;
import android.widget.TextView;
import ho1.l;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import java.util.Locale;
import ekd.n0;
import java.util.Iterator;
import ho1.l$b;

public class k	// class@00275d
{

    public void k(){
       super();
    }
    public static long a(int p0,List p1,boolean p2){
       String obj;
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(k.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), null, k.class, "1");
          if (obj != patchProxyRe) {
             return obj.longValue();
          }
       }
       if (p1.isEmpty()) {
          return -1;
       }else {
          obj = l.b(p1.get(0));
          if (TextUtils.x(obj)) {
             return -1;
          }else if(!obj.contains("w") && (!obj.contains("k") && (obj.contains("m") || obj.contains("Íò")))){
             return -1;
          }else if(obj.isEmpty()){
             l = 0;
          }else {
             l = Long.parseLong(obj);
          }
          long l1 = (long)p0 + l;
          Object obj1 = PatchProxy.apply(null, null, k.class, "3");
          boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): (n0.d(Locale.getDefault().getCountry())).equals("cn");
          if (b) {
             if (l1 - 0x2710 >= 0) {
                k.b(TextUtils.N(l1), l1, p1, p2);
             }else {
                k.b(String.valueOf(l1), l1, p1, p2);
             }
          }else if(l1 - 1000 >= 0){
             k.b(TextUtils.N(l1), l1, p1, p2);
          }else {
             k.b(String.valueOf(l1), l1, p1, p2);
          }
          return l1;
       }
    }
    public static void b(String p0,long p1,List p2,boolean p3){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), p2, Boolean.valueOf(p3), null, k.class, "2")) {
          return;
       }
       int i = (p3)? 0x7f081347: 0;
       Iterator iterator = p2.iterator();
       while (iterator.hasNext()) {
          l.d(iterator.next(), p1, p0, false, i, p1, false, null);
       }
       return;
    }
}
