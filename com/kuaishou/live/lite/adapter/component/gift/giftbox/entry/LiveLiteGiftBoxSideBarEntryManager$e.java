package com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager$e;
import qm1.c;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager;
import java.lang.Object;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.sidebar.LiveLiteGiftBoxSideBarItem;
import android.view.View;
import kotlin.jvm.internal.a;
import android.graphics.Bitmap;
import java.util.Objects;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.sidebar.LiveLiteGiftBoxSideBarItem$ViewHolder;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper;
import com.kuaishou.live.common.core.component.gift.update.UpdatedGiftWrapper;
import java.util.List;
import cm1.a;
import com.yxcorp.gifshow.model.CDNUrl;
import q73.b;

public final class LiveLiteGiftBoxSideBarEntryManager$e implements c	// class@001dc6
{
    public final LiveLiteGiftBoxSideBarEntryManager a;

    public void LiveLiteGiftBoxSideBarEntryManager$e(LiveLiteGiftBoxSideBarEntryManager p0){
       this.a = p0;
       super();
    }
    public ImageView a(){
       return null;
    }
    public KwaiImageView b(){
       View obj = PatchProxy.apply(null, this, LiveLiteGiftBoxSideBarEntryManager$e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.b().m().findViewById(R.id.live_gift_new_notify);
       a.o(obj, "giftSideBarItem.getConta¡­.id.live_gift_new_notify\)");
       return obj;
    }
    public View c(){
       View obj = PatchProxy.apply(null, this, LiveLiteGiftBoxSideBarEntryManager$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.b().m().findViewById(R.id.live_gift_sidebar_icon);
       a.o(obj, "giftSideBarItem.getConta¡­d.live_gift_sidebar_icon\)");
       return obj;
    }
    public Bitmap d(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveLiteGiftBoxSideBarItem obj = PatchProxy.apply(objArray, this, LiveLiteGiftBoxSideBarEntryManager$e.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a.b();
       Objects.requireNonNull(obj);
       Object[] objArray1 = PatchProxy.apply(objArray, obj, LiveLiteGiftBoxSideBarItem.class, "9");
       if (objArray1 != patchProxyRe) {
       }else {
          LiveLiteGiftBoxSideBarItem b = obj.b;
          if (b != null) {
             objArray = b.g;
          }
          objArray1 = objArray;
       }
       return objArray1;
    }
    public LiveViewFlipper e(){
       View obj = PatchProxy.apply(null, this, LiveLiteGiftBoxSideBarEntryManager$e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.b().m().findViewById(R.id.live_gift_update_flipper);
       a.o(obj, "giftSideBarItem.getConta¡­live_gift_update_flipper\)");
       return obj;
    }
    public Bitmap f(UpdatedGiftWrapper p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteGiftBoxSideBarEntryManager$e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "updatedGiftWrapper");
       return a.c(p0.getGiftIconUrls());
    }
    public CDNUrl[] g(){
       b uob;
       CDNUrl[] uCDNUrlArray;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveLiteGiftBoxSideBarItem obj = PatchProxy.apply(objArray, this, LiveLiteGiftBoxSideBarEntryManager$e.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a.b();
       Objects.requireNonNull(obj);
       Object[] objArray1 = PatchProxy.apply(objArray, obj, LiveLiteGiftBoxSideBarItem.class, "8");
       if (objArray1 != patchProxyRe) {
       }else {
          LiveLiteGiftBoxSideBarItem b = obj.b;
          if (b != null) {
             if (b.f()) {
                uob = b.e();
                if (uob != null) {
                   uCDNUrlArray = uob.a();
                }
             }else {
                uob = b.e();
                if (uob != null) {
                   uCDNUrlArray = uob.b();
                }
             }
             objArray = uCDNUrlArray;
          }
       label_0046 :
          objArray1 = objArray;
       }
       return objArray1;
    }
}
