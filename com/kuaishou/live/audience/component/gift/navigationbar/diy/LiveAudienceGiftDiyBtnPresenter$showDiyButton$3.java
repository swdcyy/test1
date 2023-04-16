package com.kuaishou.live.audience.component.gift.navigationbar.diy.LiveAudienceGiftDiyBtnPresenter$showDiyButton$3;
import msd.p;
import kotlin.jvm.internal.Lambda;
import x01.a;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem$LiveGiftGroupBtnInfo;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import s51.c;
import mk1.b;
import mk1.h;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import mk1.w;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.LiveGiftGroupItemViewData;
import android.content.Context;
import java.util.Objects;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class LiveAudienceGiftDiyBtnPresenter$showDiyButton$3 extends Lambda implements p	// class@000b75
{
    public final a this$0;

    public void LiveAudienceGiftDiyBtnPresenter$showDiyButton$3(a p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(View p0,GiftPanelItem$LiveGiftGroupBtnInfo p1){
       String str1;
       Context uContext1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceGiftDiyBtnPresenter$showDiyButton$3.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "btnInfo");
       if (a.W8(this.this$0).P0(p1.mUrl)) {
          a d = this.this$0.D;
          if (d == null) {
             a.S("giftBoxParams");
          }
          a e = this.this$0.E;
          if (e == null) {
             a.S("callerContext");
          }
          GiftPanelItem giftPanelIte = w.j(d, e);
          Context uContext = null;
          giftPanelIte = (giftPanelIte != null)? giftPanelIte.mCurrentSelectedAlbumPanelItem: uContext;
          StringBuilder str = p1.mUrl+"&selectText=";
          if (giftPanelIte != null) {
             LiveGiftGroupItemViewData giftGroupIte = giftPanelIte.getGiftGroupItemViewData();
             if (giftGroupIte != null) {
                str1 = giftGroupIte.a();
                if (str1 != null) {
                label_0064 :
                   a.W8(this.this$0).r4(str+str1, uContext);
                   LiveAudienceGiftDiyBtnPresenter$showDiyButton$3 tthis$0 = this.this$0;
                   Objects.requireNonNull(tthis$0);
                   if (!PatchProxy.applyVoidOneRefs(p1, tthis$0, a.class, "8")) {
                      ClickMetaData uClickMetaDa = new ClickMetaData();
                      uClickMetaDa.setElementPackage(tthis$0.Y8(p1));
                      uClickMetaDa.setContentPackage(tthis$0.X8());
                      u1.B(uClickMetaDa);
                   }
                }
             }
          }
          str1 = "";
          goto label_0064 ;
       }
       return;
    }
}
