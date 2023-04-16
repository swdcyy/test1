package bz3.g;
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
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.j;
import android.widget.TextView;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kuaishou.merchant.api.core.model.Commodity$IconLabel;
import brd.t;
import com.kuaishou.merchant.basic.util.d;
import bz3.f;
import erd.g;
import crd.b;
import android.view.View;
import ekd.m1;

public class g extends PresenterV2	// class@000461
{
    public LiveFeedCommodity p;
    public b q;
    public TextView r;

    public void g(){
       super();
    }
    public void E8(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "3")) {
          return;
       }
       b c = this.q.c;
       if (c != null && !q.f(c.mCommodityInfoList)) {
          this.p = c.mCommodityInfoList.get(0);
          if (!PatchProxy.applyVoid(objArray, this, og, "4")) {
             og = this.p;
             if (og == null || TextUtils.x(og.mTitle)) {
                this.r.setText("");
             }else if(j.h(this.p.mTitleIconList)){
                this.r.setText(this.p.mTitle);
             }else {
                this.X7(d.h(this.p.mTitleIconList, (float)n.c(this.getContext(), 14.00f)).subscribe(new f(this)));
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a411f);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.q = this.q8(b.class);
       return;
    }
}
