package e73.f;
import erd.g;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel;
import java.lang.Object;
import i95.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.google.protobuf.nano.MessageNano;
import lf3.g;

public final class f implements g	// class@002697
{
    public final LiveLiteFansGroupDataModel b;

    public void f(LiveLiteFansGroupDataModel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else {
          b.P(LiveLiteLogTag.LITE_FANS_GROUP.appendTag(this.b.a), "receive FansGroupSCMessageEvent");
          this.b.z.H4(p0.a);
       }
       return;
    }
}
