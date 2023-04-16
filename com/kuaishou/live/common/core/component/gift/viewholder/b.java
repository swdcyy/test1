package com.kuaishou.live.common.core.component.gift.viewholder.b;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.viewholder.b$a;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import xz6.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.viewholder.a;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kuaishou.live.common.core.component.gift.viewholder.b$c;
import android.widget.ImageView;
import hc.a;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import va1.b0;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftImageView;
import com.kuaishou.live.external.invoke.deserializer.gift.GiftPanelItemViewData;
import sm1.f;
import com.kuaishou.live.common.core.component.gift.viewholder.b$b;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Runnable;
import msd.l;
import com.kuaishou.live.common.core.basic.tools.l;
import java.lang.StringBuilder;

public final class b	// class@001337
{
    public b$c a;
    public final c0 b;

    public void b(){
       super();
       this.b = new b$a(this);
    }
    public void a(GiftPanelItem p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       if (p1 instanceof a) {
          p0 = p1.j();
          if (p0 != null && p0.hasDynamicIcon()) {
             View view = PatchProxy.apply(null, p1, a.class, "3");
             if (view != PatchProxyResult.class) {
             }else {
                view = p1.r.findViewByPosition(p1.r.c());
             }
             this.d(p0, view);
          }
       }else if(p0.hasDynamicIcon()){
          this.d(p0, p1.b);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b ta = this.a;
       if (ta == null) {
          return;
       }
       ta.a.setVisibility(0);
       this.a.b.setVisibility(4);
       b$c d = this.a.d;
       if (d != null) {
          d.stop();
          this.a.d.i(0);
       }
       this.a = null;
       return;
    }
    public boolean c(GiftPanelItem p0){
       boolean b;
       GiftPanelItem obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (p0 == null) {
          b.Z(LiveLogTag.GIFT, "play dynamic icon fail because giftPanelItem == null");
          return b;
       }else if(b0.a()){
          b.Z(LiveLogTag.GIFT, "play dynamic icon fail because landscape");
          return b;
       }else if(b.a(-404437045).g()){
          b.Z(LiveLogTag.GIFT, "play dynamic icon fail because isLowPhone");
          return b;
       }else {
          obj = p0.mCurrentSelectedAlbumPanelItem;
          if (obj != null) {
             return obj.hasDynamicIcon();
          }
          return p0.hasDynamicIcon();
       }
    }
    public final void d(GiftPanelItem p0,View p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "3")) {
          return;
       }
       if (p1 == null) {
          b.Z(LiveLogTag.GIFT, "play dynamic icon fail because view==null");
          return;
       }else {
          KwaiImageView kwaiImageVie = p1.findViewById(R.id.live_gift_item_gift_dynamic_image_view);
          LiveGiftImageView liveGiftImag = p1.findViewById(R.id.live_gift_item_gift_image_view);
          b = true;
          int i = 0;
          if (kwaiImageVie == null || liveGiftImag == null) {
             LiveLogTag gIFT = LiveLogTag.GIFT;
             StringBuilder str = "play dynamic icon fail because dynamicIconImageView==null";
             boolean b1 = (kwaiImageVie == null)? true: false;
             str = str+b1+"staticIconImageView==null";
             if (liveGiftImag != null) {
                b = false;
             }
             b.Z(gIFT, str+b);
             return;
          }else {
             this.b();
             this.a = new b$c(liveGiftImag, kwaiImageVie, p0, null);
             kwaiImageVie.setVisibility(i);
             l.d(kwaiImageVie, p0.mGiftPanelItemViewData.mDynamicGiftIconUrls, b, new f(this), new b$b(this, p0, liveGiftImag));
             return;
          }
       }
    }
}
