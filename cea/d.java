package cea.d;
import erd.g;
import cea.f;
import java.lang.Object;
import eda.l;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v40.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import n50.a;
import com.kuaishou.eve.kit.rerank.BizPage;
import e50.m;
import com.kwai.framework.model.feed.BaseFeed;

public final class d implements g	// class@0004e9
{
    public final f b;

    public void d(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, f.class, "6")) {
       }else {
          a.a.b("nasa on login "+p0.b);
          p0 = tb.s.getCurrentPhoto();
          if (p0 != null && p0.mEntity != null) {
             a.b.a(tb.r.b(), p0.mEntity, "login");
          }
       }
       return;
    }
}
