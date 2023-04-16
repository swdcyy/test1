package bn2.b$a;
import bn2.b$b;
import bn2.b;
import java.lang.Object;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.HashMap;
import cn2.i;
import java.util.Map;
import va1.s0;
import com.kuaishou.live.core.show.wish.LiveAudienceWishRoomKrnDialogPresenter$b;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public class b$a implements b$b	// class@000419
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       b l = this.a.L;
       boolean b = (l.mLiveActivityTaskInfo != null && l.mLiveSourceType == 274)? true: false;
       return b;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       b$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, b.class, "6") && !TextUtils.x(p0)) {
          HashMap hashMap = new HashMap();
          String str = i.b();
          if (!TextUtils.x(str)) {
             hashMap.put("location", str);
          }
          ta.M.a(s0.a(p0, hashMap), false);
          b.P(LiveLogTag.LIVE_WISH_ROOM.appendTag("LiveAudienceWishRoomTaskPresenter"), "showWishTaskFinishDialog");
       }
       return;
    }
}
