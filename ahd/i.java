package ahd.i;
import n3d.a;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import b66.k;

public final class i implements a	// class@00003d
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, i.class, "1")) {
          return;
       }
       if (p0 == 352) {
          k.a(RequestTiming.DEFAULT);
       }
       return;
    }
}
