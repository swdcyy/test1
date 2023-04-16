package cea.a;
import wd5.p;
import cea.f;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import e50.g;
import com.kuaishou.eve.kit.rerank.BizPage;
import e50.m;
import java.lang.String;
import v40.b;

public final class a implements p	// class@0004e6
{
    public final f a;

    public void a(f p0){
       this.a = p0;
    }
    public final void a(BaseFeed p0,PhotoDetailLogger p1){
       a ta = this.a;
       if (!ta.s.r()) {
          ta.r.k(p0, p1);
          Object[] objArray = new Object[]{ta.r.b().getTaskId()};
          b.b(String.format("custom_infer_%s", objArray), "DEFAULT");
       }
       return;
    }
}
