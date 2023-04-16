package cea.g;
import wd5.p;
import cea.l;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import ff6.d;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class g implements p	// class@0004ec
{
    public final l a;

    public void g(l p0){
       this.a = p0;
    }
    public final void a(BaseFeed p0,PhotoDetailLogger p1){
       g ta = this.a;
       if (!ta.s.r()) {
          ta.r.j(p0);
          ta.r.a(0).subscribe(Functions.d(), Functions.d());
       }
       return;
    }
}
