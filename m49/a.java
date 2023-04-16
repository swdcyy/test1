package m49.a;
import m49.a$a;
import nsd.u;
import android.app.Activity;
import java.lang.Object;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import m49.a$b;
import m49.b;
import java.util.Objects;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import m49.a$c;
import crd.b;

public final class a	// class@002dec
{
    public AdDataWrapper a;
    public a$b b;
    public Activity c;
    public static final a$a d;

    static {
       a.d = new a$a(null);
    }
    public void a(Activity p0){
       super();
       this.c = p0;
    }
    public final a a(AdDataWrapper p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "adDataWrapper");
       this.a = p0;
       return this;
    }
    public final Activity b(){
       return this.c;
    }
    public final AdDataWrapper c(){
       return this.a;
    }
    public final a$b d(){
       return this.b;
    }
    public final void e(){
       b a;
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a = b.a;
       Objects.requireNonNull(a);
       t ot = PatchProxy.applyOneRefs(this, a, b.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(this, "helper");
          ot = a.f(this, false);
       }
       ot.subscribe(Functions.d(), a$c.b);
       return;
    }
}
