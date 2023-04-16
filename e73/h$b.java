package e73.h$b;
import erd.g;
import e73.h;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class h$b implements g	// class@00269a
{
    public final h b;

    public void h$b(h p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$b.class, "1")) {
       }else {
          b.W(LiveLiteLogTag.LITE_FANS_GROUP.appendTag(this.b.b.a), "report enter lite room error", p0);
       }
       return;
    }
}
