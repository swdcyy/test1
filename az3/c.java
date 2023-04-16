package az3.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.home2.feed.model.LiveFeedCommodity;
import java.lang.CharSequence;
import android.widget.TextView;
import vw3.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.List;
import android.content.Context;
import lnc.a1;
import android.graphics.Typeface;
import ekd.d0;
import com.kuaishou.merchant.home2.feed.model.LiveFeedCommodity$CommodityTagInfo;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.home2.feed.model.LiveFeedCommodity$MarketingTagInfo;
import android.view.View;
import java.util.Collection;
import ekd.q;
import android.widget.ImageView;
import d04.h;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import ekd.m1;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import com.yxcorp.gifshow.widget.density.KwaiFixedSimpleDraweeView;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import java.lang.Integer;

public class c extends PresenterV2	// class@0002d9
{
    public LiveFeedCommodity p;
    public View q;
    public TextView r;
    public MerchantKwaiImageView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public MerchantKwaiImageView w;
    public int x;

    public void c(){
       super();
    }
    public void E8(){
       LiveFeedCommodity mCommodityTa;
       b uob;
       Drawable uDrawable;
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "3")) {
          return;
       }
       c tp = this.p;
       if (!PatchProxy.applyVoidOneRefs(tp, this, uoc, "5")) {
          this.v.setText(tp.mTitle);
       }
       tp = this.p;
       if (!PatchProxy.applyVoidOneRefs(tp, this, uoc, "6")) {
          mCommodityTa = tp.mImageUrls;
          if (mCommodityTa != null) {
             a.a.c(this.w, mCommodityTa);
          }
       }
       tp = this.p;
       if (!PatchProxy.applyVoidOneRefs(tp, this, uoc, "7")) {
          this.u.setText(tp.mPrice);
          this.u.setTypeface(d0.a("alte-din.ttf", a1.c()));
       }
       mCommodityTa = this.p.mCommodityTagInfo;
       int i = 0;
       if (!PatchProxy.applyVoidOneRefs(mCommodityTa, this, uoc, "9")) {
          if (mCommodityTa == null || TextUtils.x(mCommodityTa.mCommodityTag)) {
             this.t.setVisibility(8);
          }else if(PatchProxy.applyVoidOneRefs(mCommodityTa, this, uoc, "10")){
             if (mCommodityTa.mCommodityTagType == 2) {
                this.t.setVisibility(i);
                this.t.setText(mCommodityTa.mCommodityTag);
             }else {
                this.t.setVisibility(8);
             }
          }
       }
       mCommodityTa = this.p.mMarketingTagInfo;
       if (!PatchProxy.applyVoidOneRefs(mCommodityTa, this, uoc, "8")) {
          if (mCommodityTa == null || TextUtils.x(mCommodityTa.mTagName)) {
             this.q.setVisibility(8);
          }else {
             this.q.setVisibility(i);
             if (q.f(mCommodityTa.mIconUrls)) {
                this.s.setVisibility(8);
             }else {
                this.s.setVisibility(i);
                a.a.c(this.s, mCommodityTa.mIconUrls);
             }
             this.r.setText(mCommodityTa.mTagName);
             this.r.setTextColor(h.a(mCommodityTa.mTitleColor, -1));
             int i1 = 0x7f061d6c;
             if (this.x == 2) {
                uob = new b();
                uob.v(h.a(mCommodityTa.mBackgroundColor, a1.a(i1)));
                uob.g(KwaiRadiusStyles.BL2_BR2);
                uDrawable = uob.a();
             }else {
                uob = new b();
                uob.v(h.a(mCommodityTa.mBackgroundColor, a1.a(i1)));
                uob.g(KwaiRadiusStyles.TL4_BR4);
                uDrawable = uob.a();
             }
             this.q.setBackground(uDrawable);
          }
       }
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, c.class, "4");
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a3201);
       this.t = m1.f(p0, 0x7f0a08d5);
       this.q = m1.f(p0, 0x7f0a2a8b);
       this.r = m1.f(p0, 0x7f0a2a8c);
       this.s = m1.f(p0, 0x7f0a2a87);
       Barrier uBarrier = m1.f(p0, R.id.barrier);
       if (uBarrier != null) {
          uBarrier.setType(1);
          uBarrier.setReferencedIds(new int[2]{R.id.padding_view,0x7f0a2a87});
       }
       this.v = m1.f(p0, 0x7f0a08d9);
       MerchantKwaiImageView merchantKwai = m1.f(p0, R.id.commodity_photo);
       try{
          this.w = merchantKwai;
          b uob = new b();
          uob.v(a1.a(R.color.arg_RES_7f0601ad));
          merchantKwai.setPlaceHolderImage(uob.a());
       }catch(java.lang.Exception e4){
          a.l(MerchantHomeLogBiz.Feed, "LiveCommodityItemPresenterV2", "fail to setPlaceHolderImage", e4);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.r8("MERCHANT_HOME_COMMODITY_MODEL");
       this.x = this.r8("MERCHANT_HOME_COMMODITY_UI_STYLE").intValue();
       return;
    }
}
