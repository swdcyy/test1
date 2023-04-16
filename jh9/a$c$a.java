package jh9.a$c$a;
import com.google.android.material.appbar.AppBarLayout$Behavior$a;
import jh9.a$c;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import jh9.a;

public final class a$c$a extends AppBarLayout$Behavior$a	// class@002acd
{
    public final a$c a;

    public void a$c$a(a$c p0){
       this.a = p0;
       super();
    }
    public boolean a(AppBarLayout p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "appBarLayout");
       a$c b = this.a.b;
       boolean b1 = (b.z != null || b.w != null)? true: false;
       return b1;
    }
}
