package eja.z$c;
import erd.g;
import java.lang.Object;
import ja6.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import wia.g;
import kotlin.jvm.internal.a;

public final class z$c implements g	// class@00270a
{
    public static final z$c b;

    static {
       z$c.b = new z$c();
    }
    public void z$c(){
       super();
    }
    public void accept(Object p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, z$c.class, "1")) {
       }else if(!TextUtils.equals(p0.d, "PLC_FOLLOW_OUTSIDE") || TextUtils.equals(p0.c, "DETAIL")){
          a = p0.a;
          a.o(a, "liveUpdateEvent.mReservationId");
          g.d.e(a);
       }
       p0 = p0.a;
       a.o(p0, "liveUpdateEvent.mReservationId");
       g.d.d(p0);
       return;
    }
}
