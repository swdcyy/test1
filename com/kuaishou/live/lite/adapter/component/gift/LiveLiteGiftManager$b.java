package com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager$b;
import o73.c;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import xp5.g;
import com.kwai.framework.model.user.UserInfo;
import n73.a;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import ni1.a;
import lj1.c;
import java.util.List;
import trd.t;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.SelectMode;
import java.util.Map;
import nsd.u;
import jm1.a;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import om1.e;
import mm1.c;
import mm1.e;

public final class LiveLiteGiftManager$b implements c	// class@001da0
{
    public final LiveLiteGiftManager a;

    public void LiveLiteGiftManager$b(LiveLiteGiftManager p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGiftManager$b.class, "1")) {
          return;
       }
       UserInfo userInfo = a.a(this.a.J.I());
       if (userInfo == null) {
          b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxManager][LiveGiftBottomBarManager]anchor is null");
          return;
       }else {
          a uoa = new a(new c(userInfo, t.k(userInfo)), 55, 0, null, 0, null, null, 124, null);
          this.a.d1.d(v12);
          return;
       }
    }
    public void b(int p0,String p1){
       LiveLiteGiftManager$b uob = LiveLiteGiftManager$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "2")) {
          return;
       }
       a.p(p1, "message");
       this.a.e1.yk(this.a.e1.o6()).f("PRE_SEND_GIFT").d("CLIENT_BOTTOM_BAR_GIFT_GUIDE_SHOW").g(p0).e(p1).a();
       return;
    }
    public void c(){
       PatchProxy.applyVoid(null, this, LiveLiteGiftManager$b.class, "4");
    }
    public void d(){
       PatchProxy.applyVoid(null, this, LiveLiteGiftManager$b.class, "3");
    }
}
