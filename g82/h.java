package g82.h;
import erd.g;
import g82.v;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import java.util.Objects;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.fansgroup.utils.FansGroupKswitchUtil;
import l95.b;
import java.util.HashMap;
import java.util.Map;
import l95.c;

public final class h implements g	// class@002aa1
{
    public final v b;

    public void h(v p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.mLiveFansGroupInfo;
       boolean b = true;
       boolean b1 = false;
       boolean b2 = (p0 != null && p0.mHasFansGroupAuthority != null)? true: false;
       tb.r = b2;
       if (p0 == null || p0.mHasFansGroupV2Authority == null) {
          b = false;
       }
       tb.s = b;
       Object[] objArray = null;
       tb.Y = (p0 != null)? p0.mAutoActivePromptDialogInfo: objArray;
       tb.u9();
       if (!PatchProxy.applyVoid(objArray, tb, v.class, "47") && FansGroupKswitchUtil.b()) {
          p0 = new b(b1, "Entrance", "FETCH_USER_STATUS");
          p0.f(200);
          HashMap hashMap = new HashMap();
          hashMap.put("hasFansAuthority", String.valueOf(tb.r));
          hashMap.put("hasFansGroupV2Authority", String.valueOf(tb.s));
          p0.d(hashMap);
          c.a(p0);
       }
       return;
    }
}
