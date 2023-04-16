package d5b.a$c;
import com.yxcorp.gifshow.widget.m;
import d5b.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchFragment;
import kotlin.jvm.internal.a;
import a5b.h;
import a5b.h$a;
import io.reactivex.subjects.PublishSubject;
import b5b.b;

public final class a$c extends m	// class@00243b
{
    public final a c;

    public void a$c(a p0,boolean p1,long p2){
       this.c = p0;
       super(p1, p2);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
          return;
       }
       a$c tc = this.c;
       Objects.requireNonNull(tc);
       a uoa = PatchProxy.apply(null, tc, a.class, "4");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = tc.q;
          if (uoa == null) {
             a.S("magicSearchPanelFragment");
          }
       }
       uoa.Bh(h.e.a(""));
       this.c.S8().onNext(new b(true, false));
       return;
    }
}
