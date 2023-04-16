package e73.e;
import erd.g;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel;
import java.lang.Object;
import eda.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import brd.t;

public final class e implements g	// class@002696
{
    public final LiveLiteFansGroupDataModel b;

    public void e(LiveLiteFansGroupDataModel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else if(p0.d != null || p0.b != null){
          this.b.a();
          b.P(LiveLiteLogTag.LITE_FANS_GROUP.appendTag(this.b.a), "User switch account");
          LiveLiteFansGroupDataModel.d(this.b, true, false, false, false, 6, null);
       }
       return;
    }
}
