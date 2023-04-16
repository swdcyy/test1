package e73.l;
import z1.a;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class l implements a	// class@00269f
{
    public final LiveLiteFansGroupPresenter a;

    public void l(LiveLiteFansGroupPresenter p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
       }else {
          this.a.h9();
       }
       return;
    }
}
