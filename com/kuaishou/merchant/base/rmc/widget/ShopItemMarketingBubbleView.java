package com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingBubbleView;
import at3.b;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import android.widget.TextView;
import zs3.e;
import at3.a;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemComponentBubble;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import vr3.a;
import java.util.Objects;

public final class ShopItemMarketingBubbleView extends FrameLayout implements b	// class@00158b
{
    public TextView b;
    public HashMap c;

    public void ShopItemMarketingBubbleView(Context p0){
       super(p0);
       if (PatchProxy.applyVoid(null, this, ShopItemMarketingBubbleView.class, "2")) {
       }else {
          this.b = a.b(this.getContext(), 0x7f0d08aa, this).findViewById(0x7f0a058f);
       }
       return;
    }
    public e getItemMarketingViewModel(){
       return a.a(this);
    }
    public void release(){
       PatchProxy.applyVoid(null, this, ShopItemMarketingBubbleView.class, "4");
    }
    public final void setBubbleInfo(ShopItemComponentBubble p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingBubbleView.class, "3")) {
          return;
       }
       ShopItemMarketingBubbleView tb = this.b;
       if (tb == null) {
          a.S("tvBubbleTip");
       }
       tb.setText(p0.mText);
       return;
    }
    public void setBusinessType(int p0){
       a.b(this, p0);
    }
    public void setItemMarketingViewModel(e p0){
       a.c(this, p0);
    }
    public void setRowIndex(int p0){
       a.d(this, p0);
    }
    public void setShopItemMarketingComponentInfo(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingBubbleView.class, "1")) {
          return;
       }
       Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kuaishou.merchant.api.core.model.live.shop.ShopItemComponentBubble");
       this.setBubbleInfo(p0);
       return;
    }
}
