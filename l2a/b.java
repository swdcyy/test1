package l2a.b;
import mf5.s0$a;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import d6a.e;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mf5.w0;
import lf5.c;
import m2a.k;
import m2a.l;
import m2a.h;
import m2a.i;
import m2a.g;
import m2a.f;
import m2a.a;
import java.util.Arrays;

public class b extends s0$a	// class@002d46
{
    public final Activity a;
    public final BaseFragment b;
    public final PhotoDetailParam c;
    public final e d;

    public void b(Activity p0,BaseFragment p1,PhotoDetailParam p2,e p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public List a(){
       w0[] obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new w0[]{new c(),new k(this.a, this.c),new l(this.a),new h(this.a, this.b, this.c, this.d),new i(this.c),new g(this.a, this.b, this.c),new f(this.a, this.b, this.c, this.d),new a(this.a, this.c, this.d)};
       return Arrays.asList(obj);
    }
}
