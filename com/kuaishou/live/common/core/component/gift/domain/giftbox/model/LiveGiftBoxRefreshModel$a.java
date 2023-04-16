package com.kuaishou.live.common.core.component.gift.domain.giftbox.model.LiveGiftBoxRefreshModel$a;
import lf3.g;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.model.LiveGiftBoxRefreshModel;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLiveGiftPanelRefresh;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import z1.k;
import com.kuaishou.live.core.basic.model.LiveGiftPanelRefreshConfig;
import java.lang.Integer;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import ni1.b;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import lf3.f;

public final class LiveGiftBoxRefreshModel$a implements g	// class@001205
{
    public final LiveGiftBoxRefreshModel b;

    public void LiveGiftBoxRefreshModel$a(LiveGiftBoxRefreshModel p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxRefreshModel$a.class, str)) {
       }else {
          LiveGiftBoxRefreshModel$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveGiftBoxRefreshModel.class, str)) {
             if (p0 == null) {
                b.Z(LiveLogTag.GIFT_BOX, "[LiveLiteGiftRefreshModel][handleGiftPanelUpdateMessage], msg == null");
             }else {
                LiveGiftPanelRefreshConfig liveGiftPane = tb.m.get();
                if (liveGiftPane != null) {
                   SCLiveGiftPanelRefresh refreshMode = p0.refreshMode;
                   if (refreshMode != null) {
                      liveGiftPane.mPanelRefreshMode = refreshMode;
                   }
                   b.c0(LiveLogTag.GIFT_BOX, "[LiveLiteGiftRefreshModel][handleGiftPanelUpdateMessage]", "update refreshMode", Integer.valueOf(refreshMode));
                }
                QCurrentUser qCurrentUser = QCurrentUser.me();
                a.o(qCurrentUser, "QCurrentUser.me\(\)");
                if (!qCurrentUser.isLogined()) {
                   b.Z(LiveLogTag.GIFT_BOX, "[LiveLiteGiftRefreshModel][handleGiftPanelUpdateMessage], not login");
                }else {
                   tb.d("[LiveGiftRefreshModel][longConnect]", new b("NormalGift", p0.enableRefreshPanelUi));
                }
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
