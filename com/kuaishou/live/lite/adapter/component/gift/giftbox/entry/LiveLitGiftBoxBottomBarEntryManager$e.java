package com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLitGiftBoxBottomBarEntryManager$e;
import qm1.c;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLitGiftBoxBottomBarEntryManager;
import java.lang.Object;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import p73.a;
import kotlin.jvm.internal.a;
import android.graphics.Bitmap;
import qm1.b;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper;
import com.kuaishou.live.common.core.component.gift.update.UpdatedGiftWrapper;
import java.util.List;
import cm1.a;
import com.yxcorp.gifshow.model.CDNUrl;

public final class LiveLitGiftBoxBottomBarEntryManager$e implements c	// class@001dbc
{
    public final LiveLitGiftBoxBottomBarEntryManager a;

    public void LiveLitGiftBoxBottomBarEntryManager$e(LiveLitGiftBoxBottomBarEntryManager p0){
       this.a = p0;
       super();
    }
    public ImageView a(){
       return null;
    }
    public KwaiImageView b(){
       View obj = PatchProxy.apply(null, this, LiveLitGiftBoxBottomBarEntryManager$e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.g.e().findViewById(R.id.live_gift_new_notify);
       a.o(obj, "giftBottomBarItem.getCon¡­.id.live_gift_new_notify\)");
       return obj;
    }
    public View c(){
       View obj = PatchProxy.apply(null, this, LiveLitGiftBoxBottomBarEntryManager$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.g.e().findViewById(R.id.live_gift_bottom_bar_icon);
       a.o(obj, "giftBottomBarItem.getCon¡­ive_gift_bottom_bar_icon\)");
       return obj;
    }
    public Bitmap d(){
       return b.a(this);
    }
    public LiveViewFlipper e(){
       View obj = PatchProxy.apply(null, this, LiveLitGiftBoxBottomBarEntryManager$e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.g.e().findViewById(R.id.live_gift_update_flipper);
       a.o(obj, "giftBottomBarItem.getCon¡­live_gift_update_flipper\)");
       return obj;
    }
    public Bitmap f(UpdatedGiftWrapper p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLitGiftBoxBottomBarEntryManager$e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "updatedGiftWrapper");
       return a.c(p0.getGiftIconUrls());
    }
    public CDNUrl[] g(){
       return b.b(this);
    }
}
