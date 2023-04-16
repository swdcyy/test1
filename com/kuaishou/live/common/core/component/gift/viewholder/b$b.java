package com.kuaishou.live.common.core.component.gift.viewholder.b$b;
import msd.l;
import com.kuaishou.live.common.core.component.gift.viewholder.b;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftImageView;
import java.lang.Object;
import hc.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Void;
import com.kuaishou.live.common.core.component.gift.viewholder.b$c;
import com.kuaishou.live.external.invoke.deserializer.gift.GiftPanelItemViewData;
import java.util.Arrays;
import com.kuaishou.live.common.core.component.gift.viewholder.c;
import hc.b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class b$b implements l	// class@001335
{
    public final GiftPanelItem b;
    public final LiveGiftImageView c;
    public final b d;

    public void b$b(b p0,GiftPanelItem p1,LiveGiftImageView p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public Object invoke(Object p0){
       b obj = PatchProxy.applyOneRefs(p0, this, b$b.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = this.d.a;
          if (obj == null || !Arrays.equals(obj.c.mGiftPanelItemViewData.mDynamicGiftIconUrls, this.b.mGiftPanelItemViewData.mDynamicGiftIconUrls)) {
             b.Z(LiveLogTag.GIFT, "play dynamic icon fail because invalid CurrentLiveDynamicIconEntry");
          }else {
             this.d.a.d = p0;
             p0.l(new c(this));
             p0.start();
          }
          obj = null;
       }
       return obj;
    }
}
