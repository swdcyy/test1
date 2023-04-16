package com.kuaishou.live.lite.adapter.component.gift.popularity.LiveLitePopularityTicketManager$2;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.lite.adapter.component.gift.popularity.LiveLitePopularityTicketManager;
import java.lang.Object;
import java.lang.String;
import w73.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import w73.s$b;
import w73.a;
import b83.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveLitePopularityTicketManager$2 implements Model$a	// class@001ded
{
    public final LiveLitePopularityTicketManager b;

    public void LiveLitePopularityTicketManager$2(LiveLitePopularityTicketManager p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       boolean b;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveLitePopularityTicketManager$2.class, "1")) {
       }else {
          a.p(p0, "source");
          b.P(LiveGiftTag.LIVE_POPULARITY.appendTag("LiveLitePopularityTicketManager"), "popularityTicketModel callback, source: "+p0+", oldValue: "+p1+','+" newValue:"+p2);
          b = false;
          if (p1 != null && p2 != null) {
             LiveLitePopularityTicketManager$2 tb = this.b;
             Objects.requireNonNull(tb);
             Object obj = PatchProxy.applyTwoRefs(p1, p2, tb, LiveLitePopularityTicketManager.class, "2");
             boolean b1 = true;
             if (obj != PatchProxyResult.class) {
                b1 = obj.booleanValue();
             }else if(p1 instanceof s$b && (p2 instanceof s$b && (a.g(p1.a().a, p2.a().a) ^ b1))){
                b1 = false;
             }
             if (!b1) {
             label_0093 :
                LiveLitePopularityTicketManager$2 tb1 = this.b;
                tb1.b(tb1.c.a(), p2);
             }
          }
       label_008c :
          this.b.f.d(b);
          goto label_0093 ;
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveLitePopularityTicketManager$2.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
       }
       return;
    }
}
