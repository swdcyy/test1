package dx8.a;
import fw8.b;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import android.app.Application$ActivityLifecycleCallbacks;
import brd.t;
import t45.d;
import brd.z;
import dx8.a$a;
import erd.o;
import dx8.a$b;
import dx8.a$c;
import erd.g;
import crd.b;

public final class a extends b	// class@0020f3
{
    public c b;

    public void a(c p0){
       a.p(p0, "workspaceDraft");
       super();
       this.b = p0;
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "activity");
       a.b().unregisterActivityLifecycleCallbacks(this);
       t.just(this.b).observeOn(d.c).map(a$a.b).observeOn(d.a).subscribe(new a$b(this), a$c.b);
       return;
    }
}
