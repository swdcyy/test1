package ez0.g0$d;
import lf3.g;
import ez0.g0;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLiveGiftPanelRefresh;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import t02.a0;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import ry1.b;
import com.kuaishou.live.core.basic.model.LiveGiftPanelRefreshConfig;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.gift.p;
import jk1.f;
import lf3.f;

public final class g0$d implements g	// class@002246
{
    public final g0 b;

    public void g0$d(g0 p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       a0 x1;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, g0$d.class, str)) {
       }else if(p0 != null){
          g0$d tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, g0.class, str)) {
             x1 = tb.f.b3;
             a.o(x1, "livePlayCallerContext\n  ¡­dienceStatusObtainService");
             LiveTimeConsumingUserStatusResponse liveTimeCons = x1.d0();
             if (liveTimeCons != null) {
                liveTimeCons = liveTimeCons.mLiveGiftPanelRefresh;
                if (liveTimeCons != null) {
                   SCLiveGiftPanelRefresh refreshMode = p0.refreshMode;
                   if (refreshMode != null) {
                      liveTimeCons.mPanelRefreshMode = refreshMode;
                   }
                   b.c0(LiveLogTag.GIFT, "[GiftOpt][LiveAudienceGiftPanelUpdateManager][updateRefreshMode]", "refreshMode", Integer.valueOf(refreshMode));
                }
             }
          }
          if (p.c()) {
             this.b.b(p0);
          }else {
             SCLiveGiftPanelRefresh refreshTab = p0.refreshTab;
             str = 1;
             if (refreshTab == str || refreshTab == 99) {
                str = null;
             }
             if (!str) {
                x1 = this.b.f.x1;
                a.o(x1, "livePlayCallerContext.mLiveAudienceGiftBoxService");
                if (!x1.X3()) {
                }
             }else {
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
