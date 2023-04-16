package l2a.a;
import mf5.v0$a;
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
import m2a.b;
import m2a.f;
import m2a.g;
import m2a.j;
import java.util.Arrays;

public class a extends v0$a	// class@002d45
{
    public final Activity a;
    public final BaseFragment b;
    public final PhotoDetailParam c;
    public final e d;

    public void a(Activity p0,BaseFragment p1,PhotoDetailParam p2,e p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public List a(){
       w0[] obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new w0[]{new b(this.a, this.b, this.c),new f(this.a, this.b, this.c, this.d),new g(this.a, this.b, this.c),new j(this.a, this.b, this.c)};
       return Arrays.asList(obj);
    }
}
