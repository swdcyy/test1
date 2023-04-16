package bz3.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ny3.b;
import com.kuaishou.merchant.home2.feed.model.CommodityCardFeed;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kuaishou.merchant.home2.feed.model.LiveFeedCommodity;
import android.content.Context;
import com.yxcorp.utility.n;
import android.graphics.Typeface;
import java.lang.CharSequence;
import ot3.p0;
import android.widget.TextView;
import com.kuaishou.merchant.home2.feed.model.LiveFeedCommodity$CommodityTagInfo;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import ekd.m1;

public class d extends PresenterV2	// class@00045e
{
    public LiveFeedCommodity p;
    public b q;
    public TextView r;
    public TextView s;
    public TextView t;

    public void d(){
       super();
    }
    public void E8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       b c = this.q.c;
       if (c == null || q.f(c.mCommodityInfoList)) {
          this.P8();
          return;
       }else {
          this.p = c.mCommodityInfoList.get(0);
          if (!PatchProxy.applyVoid(objArray, this, uod, "4")) {
             uod = this.p;
             if (uod == null) {
                this.P8();
             }else {
                this.r.setText(p0.f(uod.mPrice, n.c(this.getContext(), 13.00f), n.c(this.getContext(), 20.00f), Typeface.DEFAULT_BOLD, 0, 1));
                LiveFeedCommodity mCommodityTa = this.p.mCommodityTagInfo;
                if (mCommodityTa == null || TextUtils.x(mCommodityTa.mCommodityTag)) {
                   this.s.setText("");
                   this.s.setVisibility(8);
                }else {
                   this.s.setText(this.p.mCommodityTagInfo.mCommodityTag);
                   this.s.setVisibility(0);
                }
                this.t.setText(this.p.mSalesDesc);
             }
          }
          return;
       }
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       this.r.setText("");
       this.t.setText("");
       this.s.setText("");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a4226);
       this.s = m1.f(p0, 0x7f0a4228);
       this.t = m1.f(p0, 0x7f0a4227);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.q = this.q8(b.class);
       return;
    }
}
