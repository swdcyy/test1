package e73.g;
import erd.g;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class g implements g	// class@002698
{
    public final LiveLiteFansGroupDataModel b;

    public void g(LiveLiteFansGroupDataModel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          b.y(LiveLiteLogTag.LITE_FANS_GROUP.appendTag(this.b.a), "report enter lite room unexpected error", p0);
       }
       return;
    }
}
