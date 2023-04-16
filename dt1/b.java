package dt1.b;
import dt1.b$a;
import nsd.u;
import msd.a;
import com.kuaishou.protobuf.livestream.nano.CohesionPkInfo;
import zs1.f;
import ps1.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import androidx.lifecycle.LiveData;

public final class b	// class@002015
{
    public b a;
    public final MutableLiveData b;
    public final LiveData c;
    public g d;
    public final a e;
    public final CohesionPkInfo f;
    public final f g;
    public final e h;
    public static final b$a i;

    static {
       b.i = new b$a(null);
    }
    public void b(a p0,CohesionPkInfo p1,f p2,e p3){
       a.p(p0, "pkId");
       a.p(p2, "sCMessageHandler");
       a.p(p3, "pkDelegate");
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
       MutableLiveData mutableLiveD = new MutableLiveData(Boolean.FALSE);
       this.b = mutableLiveD;
       this.c = mutableLiveD;
    }
    public final LiveData a(){
       return this.c;
    }
}
