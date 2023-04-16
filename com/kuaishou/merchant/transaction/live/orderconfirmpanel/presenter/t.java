package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nk4.l1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kuaishou.merchant.transaction.base.sku.SkuInfo;
import com.kuaishou.merchant.transaction.base.sku.c$a;
import com.kuaishou.merchant.transaction.base.sku.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.merchant.transaction.base.util.TransactionPreloadConfigHelper$PagePreLoadConfig;
import com.kuaishou.merchant.transaction.base.util.TransactionPreloadConfigHelper;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import sk4.e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import mk4.a;
import android.util.LruCache;
import java.lang.ref.SoftReference;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.merchant.api.core.model.Commodity;
import android.view.View;
import ekd.m1;
import lnc.a1;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.t$a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import kk4.g;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.OrderConfirmCommodity;

public class t extends PresenterV2	// class@000841
{
    public KwaiImageView p;
    public MerchantLivePurchasePanelResponse q;
    public c r;
    public OrderConfirmCommodity s;
    public List t;
    public c$a u;

    public void t(){
       super();
       this.u = new l1(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, t.class, "3")) {
          return;
       }
       this.R8(this.q.mSelectedSku);
       this.r.i(this.u);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, t.class, "4")) {
          return;
       }
       this.r.p(this.u);
       return;
    }
    public final void P8(){
       boolean b;
       t ot = t.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ot, "6")) {
          return;
       }
       String obj = PatchProxy.apply(objArray, this, ot, "7");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          t ot1 = null;
          if (TransactionPreloadConfigHelper.a().mEnableImagePreload != null && !q.f(this.t)) {
             obj = e.a(this.t.get(ot1));
             if (!TextUtils.x(obj)) {
                SoftReference softReferenc = a.b.a().get(obj);
                if (softReferenc != null && softReferenc.get() != null) {
                   Drawable uDrawable = softReferenc.get();
                   if (uDrawable instanceof BitmapDrawable) {
                      Drawable uDrawable1 = uDrawable;
                      if (uDrawable1.getBitmap() != null && !uDrawable1.getBitmap().isRecycled()) {
                         this.p.setImageDrawable(uDrawable);
                         b = true;
                      }
                   }
                }
             }
          }
          b = false;
       }
       if (b) {
          return;
       }else if(!q.f(this.t)){
          a$a uoa = a.d();
          uoa.b(":ks-features:ft-merchant:merchant-transaction:live");
          uoa.d(ImageSource.ICON);
          this.p.S(this.t, uoa.a());
       }
       return;
    }
    public final void R8(SkuInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "5")) {
          return;
       }
       if (p0 != null && p0.isValidSku()) {
          if (q.f(p0.mImageUrls)) {
             p0.mImageUrls = this.s.mImageUrls;
          }
          if (!q.f(p0.mImageUrls)) {
             this.t = p0.mImageUrls;
             this.P8();
          }
       }else if(!q.f(this.s.mImageUrls)){
          this.t = this.s.mImageUrls;
          this.P8();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
          return;
       }
       KwaiImageView kwaiImageVie = m1.f(p0, R.id.audience_order_confirm_commodity_image);
       this.p = kwaiImageVie;
       kwaiImageVie.l0(true, a1.d(R.dimen.arg_RES_7f070344), a1.d(R.dimen.arg_RES_7f070344));
       this.p.setOnClickListener(new t$a(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t.class, "2")) {
          return;
       }
       this.r = this.r8("LIVE_AUDIENCE_SKU_MANAGER");
       this.q = this.q8(MerchantLivePurchasePanelResponse.class);
       this.s = this.q8(g.class).b;
       return;
    }
}
