package bz3.e;
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
import android.view.ViewGroup;
import com.kuaishou.merchant.basic.widget.AutoFitRowsView;
import android.content.Context;
import com.yxcorp.utility.n;
import java.util.Iterator;
import com.kuaishou.merchant.api.core.model.Commodity$IconLabel;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import xm4.a;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import bld.b;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import lnc.a1;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatTextView;

public class e extends PresenterV2	// class@00045f
{
    public LiveFeedCommodity p;
    public b q;
    public AutoFitRowsView r;

    public void e(){
       super();
    }
    public void E8(){
       e uoe = e.class;
       if (PatchProxy.applyVoid(null, this, uoe, "3")) {
          return;
       }
       b c = this.q.c;
       if (c == null || q.f(c.mCommodityInfoList)) {
          this.r.removeAllViews();
          this.r.setVisibility(8);
          return;
       }else {
          this.p = c.mCommodityInfoList.get(0);
          if (!PatchProxy.applyVoid(null, this, uoe, "4")) {
             e tp = this.p;
             if (tp == null || q.f(tp.mItemCardTagInfoList)) {
                this.r.removeAllViews();
                this.r.setVisibility(8);
             }else {
                this.r.setVisibility(0);
                this.r.setMaxLines(1);
                this.r.removeAllViews();
                this.r.setHorizontalSpace(n.c(this.getContext(), 4.00f));
                Iterator iterator = this.p.mItemCardTagInfoList.iterator();
                while (iterator.hasNext()) {
                   Commodity$IconLabel iconLabel = iterator.next();
                   View view = PatchProxy.applyOneRefs(iconLabel, this, uoe, "5");
                   if (view != PatchProxyResult.class) {
                   }else if(iconLabel == null){
                      if (!TextUtils.x(iconLabel.mPrefix) && !TextUtils.x(iconLabel.mContent)) {
                         view = a.f(this.r, R.layout.arg_RES_7f0d081a, 0);
                         m1.f(view, R.id.tv_tag_coupon_type).setText(iconLabel.mPrefix);
                         m1.f(view, R.id.tv_tag_coupon_content).setText(iconLabel.mContent);
                      }else if(!TextUtils.x(iconLabel.mContent)){
                         view = new SelectShapeTextView(this.getContext());
                         view.setText(iconLabel.mContent);
                         b uob = new b();
                         uob.s(DrawableCreator$Shape.Rectangle);
                         uob.g(KwaiRadiusStyles.R2);
                         uob.w(a1.a(R.color.arg_RES_7f061de6));
                         uob.v(a1.a(R.color.arg_RES_7f0620c7));
                         uob.x(0x3f000000);
                         view.setBackgroundDrawable(uob.a());
                         view.setTextColor(a1.a(R.color.arg_RES_7f061de6));
                         view.setTextSize(0, (float)n.c(this.getContext(), 10.00f));
                         view.setPadding(n.c(this.getContext(), 3.00f), n.c(this.getContext(), 0x3f800000), n.c(this.getContext(), 3.00f), n.c(this.getContext(), 0x3f800000));
                         view.setGravity(17);
                         view.setIncludeFontPadding(0);
                      }
                   }
                   view = null;
                   if (view != null) {
                      this.r.addView(view);
                   }
                }
                if (this.r.getChildCount() <= 0) {
                   this.r.setVisibility(8);
                }
             }
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a092d);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.q = this.q8(b.class);
       return;
    }
}
