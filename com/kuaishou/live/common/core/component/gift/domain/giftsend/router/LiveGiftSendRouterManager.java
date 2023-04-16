package com.kuaishou.live.common.core.component.gift.domain.giftsend.router.LiveGiftSendRouterManager;
import com.kuaishou.live.common.core.component.gift.base.LifecycleManager;
import androidx.lifecycle.LifecycleOwner;
import vq5.d;
import z1.k;
import ih1.l;
import ah1.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.router.LiveGiftSendRouterManager$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import vq5.b;

public final class LiveGiftSendRouterManager extends LifecycleManager	// class@001257
{
    public final b c;
    public final d d;
    public final k e;
    public final l f;
    public final c g;

    public void LiveGiftSendRouterManager(LifecycleOwner p0,d p1,k p2,l p3,c p4){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "routerManager");
       a.p(p2, "anchorInfo");
       a.p(p3, "giftStoreRepo");
       a.p(p4, "giftMockMessageModel");
       super(p0);
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       LiveGiftSendRouterManager$a uoa = new LiveGiftSendRouterManager$a(this);
       this.c = uoa;
       if (PatchProxy.applyVoid(null, this, LiveGiftSendRouterManager.class, "2")) {
       }else {
          p1.t5("sendallgiftstoanchor", uoa);
       }
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       LiveGiftSendRouterManager liveGiftSend = LiveGiftSendRouterManager.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveGiftSend, "1")) {
          return;
       }
       a.p(p0, "owner");
       super.onDestroy(p0);
       if (!PatchProxy.applyVoid(null, this, liveGiftSend, "3")) {
          this.d.Z4("sendallgiftstoanchor");
       }
       return;
    }
}
