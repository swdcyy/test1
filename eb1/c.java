package eb1.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public class c	// class@0020c9
{

    public void c(){
       super();
    }
    public static void a(long p0){
       Object[] objArray;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), null, uoc, "1")) {
          return;
       }
       long l = 1;
       long l1 = TimeUnit.DAYS.toSeconds(l);
       long l2 = TimeUnit.HOURS.toSeconds(l);
       long l3 = TimeUnit.MINUTES.toSeconds(l);
       long l4 = p0 / l1;
       if (l4 > 0) {
          if ((p0 % l1) > 0) {
             l4 = l4 + l;
          }
          objArray = new Object[]{Long.valueOf(l4)};
          i.d(R.style.arg_RES_7f11066a, String.format(a1.p(R.string.arg_RES_7f101e26), objArray));
       }else {
          l1 = p0 / l2;
          if (l1 > 0) {
             if ((p0 % l2) > 0) {
                l1 = l1 + l;
             }
             objArray = new Object[]{Long.valueOf(l1)};
             i.d(R.style.arg_RES_7f11066a, String.format(a1.p(R.string.arg_RES_7f101e27), objArray));
          }else {
             l1 = p0 / l3;
             if ((p0 % l3) > 0) {
                l1 = l1 + l;
             }
             objArray = new Object[]{Long.valueOf(l1)};
             i.d(R.style.arg_RES_7f11066a, String.format(a1.p(R.string.arg_RES_7f101e28), objArray));
          }
       }
       return;
    }
}
