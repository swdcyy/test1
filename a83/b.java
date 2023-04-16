package a83.b;
import jj1.a;
import a83.a;
import java.lang.String;
import w73.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import a83.a$b;
import yg1.f;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.lang.StringBuilder;
import java.lang.Boolean;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import z1.k;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import l66.c;
import dda.k;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.models.Gift;
import m66.a;

public final class b implements a	// class@000081
{
    public final a a;
    public final String b;
    public final a c;

    public void b(a p0,String p1,a p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.a.m.c();
       return;
    }
    public void b(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "response");
       b.c0(LiveGiftTag.LIVE_GIFT_GUIDE, this.b+"-onSendGiftResult", "isSuccess", Boolean.valueOf(p0.e()));
       b ta = this.a;
       b tc = this.c;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidTwoRefs(p0, tc, ta, a.class, "11") && p0.e()) {
          LiveStreamFeed liveStreamFe = ta.f.get();
          if (liveStreamFe != null) {
             c.a().b(new k(liveStreamFe, tc.a, 1));
          }
       }
       return;
    }
}
