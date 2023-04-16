package e73.i;
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

public final class i implements g	// class@00269c
{
    public final LiveLiteFansGroupDataModel b;

    public void i(LiveLiteFansGroupDataModel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, i.class, "1")) {
       }else {
          b.W(LiveLiteLogTag.LITE_FANS_GROUP.appendTag(this.b.a), "report leave lite room error", p0);
          PatchProxy.onMethodExit(i.class, "1");
       }
       return;
    }
}
