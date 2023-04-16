package cj4.a;
import id4.a;
import cj4.a$b;
import nsd.u;
import cj4.a$a;
import cj4.e;
import hd4.e;
import hd4.d;
import androidx.fragment.app.Fragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cj4.b;

public final class a extends a	// class@00047a
{
    public static final a f;
    public static final Class g;
    public static final a$b h;

    static {
       a.h = new a$b(null);
       a.f = a$a.a;
       a.g = e.class;
    }
    public void a(){
       super(new e());
    }
    public int m(){
       return 0x7f0d07ac;
    }
    public PresenterV2 q(Fragment p0){
       b uob = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b(p0);
       }
       return uob;
    }
}
