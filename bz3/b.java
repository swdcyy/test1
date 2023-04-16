package bz3.b;
import oy3.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ny3.b;
import com.kuaishou.merchant.home2.feed.model.CommodityCardFeed;
import java.util.Collection;
import ekd.q;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import java.lang.Double;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.app.Activity;
import com.yxcorp.utility.n;
import lnc.a1;
import java.util.List;
import com.kuaishou.merchant.home2.feed.model.LiveFeedCommodity;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import oy3.a;
import android.view.View;
import ekd.m1;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import ac.a;
import com.facebook.drawee.view.DraweeView;

public class b extends PresenterV2 implements b	// class@00045b
{
    public b p;
    public CommodityCardFeed q;
    public MerchantKwaiImageView r;

    public void b(){
       super();
    }
    public void E8(){
       b uob = b.class;
       if (PatchProxy.applyVoid(null, this, uob, "3")) {
          return;
       }
       b c = this.p.c;
       this.q = c;
       if (c != null && !q.f(c.mCommodityInfoList)) {
          BaseFeed mRatio = this.q.mRatio;
          if (mRatio - false <= 0) {
             mRatio = 0x3ff0000000000000;
          }
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Double.valueOf(mRatio), this, uob, "4")) {
             ViewGroup$LayoutParams layoutParams = this.r.getLayoutParams();
             int i = (n.k(this.getActivity()) - (a1.d(0x7f07031b) * 3)) / 2;
             layoutParams.width = i;
             layoutParams.height = (int)((double)i / mRatio);
          }
          LiveFeedCommodity liveFeedComm = this.q.mCommodityInfoList.get(0);
          if (liveFeedComm != null) {
             this.r.S(liveFeedComm.mImageUrls, liveFeedComm.mImageUrl);
          }
       }
    label_0075 :
       return;
    }
    public void G4(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       a.a(this);
       b tr = this.r;
       if (tr != null) {
          tr.i0();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a1511);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.q8(b.class);
       return;
    }
    public void p7(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       a.b(this);
       b tq = this.q;
       if (tq != null && !q.f(tq.mCommodityInfoList)) {
          tq = this.r;
          if (tq != null && tq.getController() == null) {
             LiveFeedCommodity liveFeedComm = this.q.mCommodityInfoList.get(0);
             if (liveFeedComm != null) {
                this.r.S(liveFeedComm.mImageUrls, liveFeedComm.mImageUrl);
             }
          }
       }
       return;
    }
}
