package eub.i$f;
import io.reactivex.g;
import eub.i;
import g6c.c;
import java.lang.Object;
import brd.v;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import faa.a;
import q87.c;
import g6c.m;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import lq.i;
import java.util.Objects;
import r1c.h;
import t36.f;
import eub.l;
import eub.m;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b$a;
import eub.i$f$a;
import com.kuaishou.android.post.session.previewtasks.GraphTaskExecuteManager$b;
import java.lang.RuntimeException;

public final class i$f implements g	// class@002828
{
    public final i b;
    public final c c;

    public void i$f(i p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       h oh;
       f uof;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, i$f.class, "1")) {
          return;
       }
       a.p(p0, "it");
       Object[] objArray = new Object[0];
       a.D().w("EditPageNoUiPublishStageImpl", "upload", objArray);
       c uoc = this.c.b().b();
       m b = this.c.b().b;
       if (uoc == null) {
          throw new RuntimeException("EditPageNoUiPublishStageImpl encode error draft or result is null");
       }
       if (i.h()) {
          i.m().Z(uoc);
       }
       i$f tb = this.b;
       if (tb.f != null) {
          Objects.requireNonNull(tb);
          oh = PatchProxy.applyOneRefs(uoc, tb, oi, "12");
          if (oh != patchProxyRe) {
          }else {
             uof = new f();
             oh = new h(uof, 0);
             uof.d(new l());
          }
       }else {
          a.m(b);
          Objects.requireNonNull(tb);
          oh = PatchProxy.applyTwoRefs(uoc, b, tb, oi, "11");
          if (oh != patchProxyRe) {
          }else {
             uof = new f();
             oh = new h(uof, 0);
             uof.d(new m(tb, uoc, b));
          }
       }
       oh.a(new i$f$a(this, oh, p0));
       oh.d();
       oh.i();
       Object[] objArray1 = new Object[0];
       a.D().w("EditPageNoUiPublishStageImpl", "upload graph task start", objArray1);
       return;
    }
}
