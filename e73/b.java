package e73.b;
import erd.g;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel;
import java.lang.Object;
import i95.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class b implements g	// class@002693
{
    public final LiveLiteFansGroupDataModel b;

    public void b(LiveLiteFansGroupDataModel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          List list = LiveLiteLogTag.LITE_FANS_GROUP.appendTag(this.b.a);
          p0 = (p0 != null)? p0.a(): null;
          b.S(list, "exit SuperFansGroup", "authorId", p0);
          LiveLiteFansGroupDataModel.u(this.b, false, false, 2, null);
       }
       return;
    }
}
