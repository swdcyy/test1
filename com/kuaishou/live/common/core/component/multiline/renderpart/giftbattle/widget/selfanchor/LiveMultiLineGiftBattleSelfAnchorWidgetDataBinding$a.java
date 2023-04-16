package com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.selfanchor.LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.selfanchor.LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding;
import java.lang.Object;
import pq1.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import pq1.g;
import com.kuaishou.live.common.core.basic.widget.LiveWishListItemView;
import pq1.a;
import android.widget.FrameLayout;
import ya1.n0;
import java.lang.Integer;
import com.kuaishou.live.common.core.basic.widget.LiveWishListStyle;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public final class LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding$a implements Observer	// class@001581
{
    public final LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding b;

    public void LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding$a(LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       Integer integer;
       LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding a;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding$a.class, str)) {
       }else {
          LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding$a tb = this.b;
          a.o(p0, "wishListUIInfo");
          Objects.requireNonNull(tb);
          LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding liveMultiLin = LiveMultiLineGiftBattleSelfAnchorWidgetDataBinding.class;
          if (!PatchProxy.applyVoidOneRefs(p0, tb, liveMultiLin, str)) {
             tb.a.setWishListParam(p0.b());
             if (p0.a() != null && !PatchProxy.applyVoidOneRefs(p0, tb, liveMultiLin, "2")) {
                if (p0.a() != null) {
                   tb.a.setVisibility(0);
                   a uoa = p0.a();
                   n0 on0 = null;
                   if (uoa != null) {
                      n0 on01 = uoa.b();
                      if (on01 != null) {
                         integer = Integer.valueOf(on01.b());
                      label_0060 :
                         if (integer != null) {
                            uoa = p0.a();
                            if (uoa != null) {
                               on01 = uoa.b();
                               if (on01 != null && on01.b() == -1) {
                               label_007d :
                                  tb.a.setWishListStyle(LiveWishListStyle.GIFT);
                               label_0084 :
                                  a = tb.a;
                                  a uoa1 = p0.a();
                                  if (uoa1 != null) {
                                     on0 = uoa1.b();
                                  }
                                  a.d(on0, 0);
                                  if (tb.a.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
                                     ViewGroup$LayoutParams layoutParams = tb.a.getLayoutParams();
                                     Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                     layoutParams.setMargins(p0.b().b(), 0, 0, p0.b().b());
                                  }
                               }
                            }
                            tb.a.setWishListStyle(LiveWishListStyle.RANK);
                            goto label_0084 ;
                         }else {
                            goto label_007d ;
                         }
                      }
                   }
                   integer = on0;
                   goto label_0060 ;
                }else {
                   tb.a.setVisibility(8);
                }
             }
          }
       }
       return;
    }
}
