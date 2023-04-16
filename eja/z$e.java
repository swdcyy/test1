package eja.z$e;
import erd.g;
import java.lang.Object;
import ja6.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import ja6.b$a;
import java.lang.CharSequence;
import android.text.TextUtils;
import wia.g;

public final class z$e implements g	// class@00270c
{
    public static final z$e b;

    static {
       z$e.b = new z$e();
    }
    public void z$e(){
       super();
    }
    public void accept(Object p0){
       b$a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, z$e.class, "1")) {
       }else {
          b c = p0.c;
          p0 = p0.a;
          a.o(p0, "it.mSubscribeItemList");
          p0 = p0.iterator();
          while (p0.hasNext()) {
             b$a uoa = p0.next();
             if (!TextUtils.equals(c, "PLC_FOLLOW_OUTSIDE")) {
                a = uoa.a;
                a.o(a, "item.mReservationId");
                g.d.e(a);
             }
             uoa = uoa.a;
             a.o(uoa, "item.mReservationId");
             g.d.d(uoa);
          }
       }
       return;
    }
}
