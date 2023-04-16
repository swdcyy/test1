package e73.h;
import erd.g;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g73.a;
import va1.f;
import xp5.g;
import com.yxcorp.utility.TextUtils;
import brd.t;
import e73.h$a;
import bp6.a;
import e73.h$b;
import crd.b;

public final class h implements g	// class@00269b
{
    public final LiveLiteFansGroupDataModel b;

    public void h(LiveLiteFansGroupDataModel p0){
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       p0 = f.a(a.class);
       LiveLiteFansGroupDataModel j = this.b.j;
       String liveStreamId = (j != null)? j.getLiveStreamId(): null;
       p0.a(TextUtils.k(liveStreamId), this.b.b()).doOnSubscribe(new h$a(this)).subscribe(new a(), new h$b(this));
       return;
    }
}
