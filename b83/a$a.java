package b83.a$a;
import z1.a;
import b83.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import w73.s$b;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.sidebar.b;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.bottombar.a;

public final class a$a implements a	// class@00036a
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       a$a uoa = a$a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uoa, "1")) {
          uoa = this.a;
          Objects.requireNonNull(uoa);
          a uoa1 = a.class;
          if (!PatchProxy.isSupport(uoa1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), uoa, uoa1, "6")) {
             LiveGiftTag lIVE_POPULAR = LiveGiftTag.LIVE_POPULARITY;
             lIVE_POPULAR.appendTag("PopularitySideBarHandler");
             LiveGiftTag liveGiftTag = lIVE_POPULAR;
             b.U(liveGiftTag, "changeGiftGuideShowArea", "isFolded", Boolean.valueOf(b), "mShouldShowPopularityTicketEntry", Boolean.valueOf(uoa.f), "liveLitePopularityTicketStatus", uoa.c);
             uoa1 = uoa.c;
             if (uoa1 != null) {
                if (b && uoa.f != null) {
                   uoa.a(uoa1);
                   b = uoa.a;
                   if (b != null) {
                      a.m(b);
                      b.s(false);
                   }
                }else if(!b){
                   b = uoa.b;
                   if (b != null) {
                      a.m(b);
                      b.m(false);
                   }
                   uoa.b();
                }
             }
          }
       }
       return;
    }
}
