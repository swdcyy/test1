package az3.b;
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
import az3.a;
import android.view.View$OnLayoutChangeListener;
import android.view.View;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import ekd.m1;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public class b extends PresenterV2	// class@0002d8
{
    public LiveFeedCommodity p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public View v;
    public View w;
    public MerchantKwaiImageView x;

    public void b(){
       super();
    }
    public void E8(){
       LiveFeedCommodity mCommodityTa1;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       b tp = this.p;
       if (!PatchProxy.applyVoidOneRefs(tp, this, uob, "5")) {
          this.u.setText(tp.mTitle);
       }
       tp = this.p;
       if (!PatchProxy.applyVoidOneRefs(tp, this, uob, "6")) {
          mCommodityTa1 = tp.mImageUrls;
          if (mCommodityTa1 != null) {
             a.a.c(this.x, mCommodityTa1);
          }
       }
       tp = this.p;
       if (!PatchProxy.applyVoidOneRefs(tp, this, uob, "7")) {
          this.t.setText(tp.mPrice);
          this.t.setTypeface(d0.a("alte-din.ttf", a1.c()));
       }
       tp = this.p;
       if (!PatchProxy.applyVoidOneRefs(tp, this, uob, "8")) {
          LiveFeedCommodity mCommodityTa = tp.mCommodityTagInfo;
          if (mCommodityTa == null || TextUtils.x(mCommodityTa.mCommodityTag)) {
             this.r.setVisibility(8);
             this.s.setVisibility(8);
          }else {
             mCommodityTa1 = tp.mCommodityTagInfo;
             if (!PatchProxy.applyVoidOneRefs(mCommodityTa1, this, uob, "9")) {
                LiveFeedCommodity$CommodityTagInfo mCommodityTa2 = mCommodityTa1.mCommodityTagType;
                if (mCommodityTa2 == null) {
                   uob = this.r;
                   this.q = uob;
                   uob.setVisibility(0);
                   this.s.setVisibility(8);
                   this.q.setText(mCommodityTa1.mCommodityTag);
                }else if(mCommodityTa2 == 1){
                   uob = this.s;
                   this.q = uob;
                   uob.setVisibility(0);
                   this.r.setVisibility(8);
                   this.q.setText(mCommodityTa1.mCommodityTag);
                }else {
                   this.q = objArray;
                   this.r.setVisibility(8);
                   this.s.setVisibility(8);
                }
             }
          }
       }
       this.v.addOnLayoutChangeListener(new a(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.v.removeOnLayoutChangeListener(new a(this));
       return;
    }
    public void P8(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(b.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, b.class, "10")) {
             return;
          }
       }
       b tq = this.q;
       if (tq != null) {
          ViewGroup$MarginLayoutParams layoutParams = tq.getLayoutParams();
          if (!this.q.getVisibility() && (this.q.getRight() + layoutParams.rightMargin) > this.w.getRight()) {
             this.q.setVisibility(8);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a3201);
       this.v = m1.f(p0, 0x7f0a08b2);
       this.w = m1.f(p0, 0x7f0a08b1);
       this.r = m1.f(p0, 0x7f0a08d5);
       this.s = m1.f(p0, 0x7f0a08d6);
       this.u = m1.f(p0, 0x7f0a08d9);
       MerchantKwaiImageView merchantKwai = m1.f(p0, R.id.commodity_photo);
       this.x = merchantKwai;
       merchantKwai.setPlaceHolderImage(R.drawable.arg_RES_7f081760);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("MERCHANT_HOME_COMMODITY_MODEL");
       return;
    }
}
