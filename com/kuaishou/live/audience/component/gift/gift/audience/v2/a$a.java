package com.kuaishou.live.audience.component.gift.gift.audience.v2.a$a;
import erd.g;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.a;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.api.GiftPanelListResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Collection;
import ekd.q;
import com.yxcorp.utility.TextUtils;
import java.util.HashMap;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import ez0.h;
import java.util.Set;
import java.util.List;
import rm1.f;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Integer;

public class a$a implements g	// class@000afa
{
    public final String b;
    public final a c;

    public void a$a(a p0,String p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          a$a tc = this.c;
          a$a tb = this.b;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoidTwoRefs(p0, tb, tc, a.class, "15")) {
             b.Z(LiveLogTag.GIFT, "[GiftBoxDataSource][handleToAudienceGiftPanelListResponse]response:"+p0);
             tc.l = p0.mShouldHideGiftEntrance;
             if (!q.f(p0.mGiftPanelItems)) {
                tc.v(1, p0.mGiftToken);
                tc.h.put(TextUtils.E(tb), p0);
                b = false;
                tc.n.a(GiftTab.NormalGift, p0.mRecoGiftLlsid, b);
                tc.g.put(TextUtils.E(tb), p0.mGiftPanelItems);
                tc.k.clear();
                p0 = f.c(tc.i, b);
                if (!q.f(p0)) {
                   int i = p0.size();
                   for (; b < i; b = b + 1) {
                      tc.k.add(Integer.valueOf(p0.get(b).mId));
                   }
                }
             }
          }
       }
       return;
    }
}
