package com.kuaishou.merchant.base.rmc.widget.ItemMarketingImageView$b;
import z1.a;
import com.kuaishou.merchant.base.rmc.widget.ItemMarketingImageView;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import com.kuaishou.merchant.base.rmc.widget.ItemMarketingImageView$a;
import com.kuaishou.merchant.api.core.model.live.shop.ItemMarketingImageInfo;
import zs3.g;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTextStyle;
import vr3.a;
import java.util.Objects;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import s0d.f;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import s0d.a;
import s0d.e;
import com.yxcorp.gifshow.image.KwaiImageView;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import pb.d;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;

public final class ItemMarketingImageView$b implements a	// class@001589
{
    public final ItemMarketingImageView a;

    public void ItemMarketingImageView$b(ItemMarketingImageView p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       ItemMarketingImageInfo itemMarketin;
       ShopItemMarketingComponentTextStyle style;
       int mHeight;
       if (PatchProxy.applyVoidOneRefs(p0, this, ItemMarketingImageView$b.class, "1")) {
       }else {
          Drawable uDrawable = null;
          if (p0 == null) {
             this.a.setVisibility(8);
             p0 = this.a.getMImageLoadFinish();
             if (p0 != null) {
                p0.a(uDrawable, this.a);
             }
          }else {
             int i = 0;
             this.a.setVisibility(i);
             ItemMarketingImageView d = this.a.d;
             if (d != null) {
                itemMarketin = d.e();
                if (itemMarketin != null) {
                   style = itemMarketin.getStyle();
                   if (style != null && (style.getMWidth() > 0 && style.getMHeight() > 0)) {
                      ItemMarketingImageView$b ta = this.a;
                      int mWidth = style.getMWidth();
                      mHeight = style.getMHeight();
                      Objects.requireNonNull(ta);
                      if (!PatchProxy.isSupport(ItemMarketingImageView.class) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(mWidth), Integer.valueOf(mHeight), ta, ItemMarketingImageView.class, "3") && (ta.getLayoutParams().width != mWidth || ta.getLayoutParams().height != mHeight))) {
                         ta.getLayoutParams().width = a1.e(((float)mWidth * 0x3f800000));
                         ta.getLayoutParams().height = a1.e(((float)mHeight * 0x3f800000));
                         ta.requestLayout();
                      }
                   }
                }
             }
             d = this.a.d;
             if (d != null) {
                itemMarketin = d.e();
                if (itemMarketin != null) {
                   String mUrl = itemMarketin.getMUrl();
                   if (mUrl != null) {
                      f uof = f.x();
                      CDNUrl uCDNUrl = new CDNUrl("", mUrl);
                      Objects.requireNonNull(uof);
                      d obj = PatchProxy.applyOneRefs(uCDNUrl, uof, f.class, "4");
                      if (obj != PatchProxyResult.class) {
                         uof = obj;
                      }else {
                         uof.j.add(uCDNUrl);
                      }
                      d = this.a.d;
                      if (d != null) {
                         itemMarketin = d.e();
                         if (itemMarketin != null) {
                            style = itemMarketin.getStyle();
                            if (style != null) {
                               mHeight = style.getMWidth();
                            label_00f0 :
                               ItemMarketingImageView d1 = this.a.d;
                               if (d1 != null) {
                                  ItemMarketingImageInfo itemMarketin1 = d1.e();
                                  if (itemMarketin1 != null) {
                                     ShopItemMarketingComponentTextStyle style1 = itemMarketin1.getStyle();
                                     if (style1 != null) {
                                        i = style1.getMHeight();
                                     }
                                  }
                               }
                               if (mHeight > 0 && i > 0) {
                                  uof.o(a1.e(((float)mHeight * 0x3f800000)), a1.e(((float)i * 0x3f800000)));
                               }
                               obj = ItemMarketingImageView.a(this.a).g0(uDrawable, uDrawable, uof.w());
                               KwaiImageView kwaiImageVie = ItemMarketingImageView.a(this.a);
                               if (obj != null) {
                                  obj.q(true);
                                  uDrawable = obj.e();
                               }
                               kwaiImageVie.setController(uDrawable);
                            label_0146 :
                               ItemMarketingImageView$a mImageLoadFi = this.a.getMImageLoadFinish();
                               if (mImageLoadFi != null) {
                                  mImageLoadFi.a(p0, this.a);
                               }
                            }
                         }
                      }
                      mHeight = 0;
                      goto label_00f0 ;
                   }
                }
             }
             ItemMarketingImageView.a(this.a).setImageDrawable(p0);
             goto label_0146 ;
          }
       }
       return;
    }
}
