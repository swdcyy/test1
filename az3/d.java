package az3.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ny3.b;
import com.kuaishou.merchant.home2.feed.model.LiveFeed;
import com.kuaishou.merchant.home2.feed.model.LiveFeedCommodity;
import android.widget.FrameLayout;
import android.view.View;
import wkd.b;
import ex3.c;
import android.content.Context;
import android.view.ViewGroup;
import ekd.m1;
import java.util.List;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.utility.n;
import az3.b;
import az3.c;
import im8.c;
import java.lang.Integer;
import java.util.ArrayList;
import ekd.j;

public class d extends PresenterV2	// class@0002da
{
    public b p;
    public FrameLayout q;
    public LiveFeed r;

    public void d(){
       super();
    }
    public void E8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       b c = this.p.c;
       this.r = c;
       int i = 8;
       if (c == null || c.getCommodity() == null) {
          this.q.setVisibility(i);
          return;
       }else {
          this.q.setVisibility(0);
          this.q.removeAllViews();
          View view = PatchProxy.apply(objArray, this, uod, "4");
          if (view != patchProxyRe) {
          }else {
             LiveFeed mCommodityUI1 = this.r.mCommodityUIStyle;
             int i1 = -343507015;
             if (mCommodityUI1 == null) {
                view = b.a(i1).a(this.q.getContext(), this.q, R.layout.arg_RES_7f0d0f06);
             }else if(mCommodityUI1 == 1){
                view = b.a(i1).a(this.q.getContext(), this.q, R.layout.arg_RES_7f0d0f07);
             }else {
                view = b.a(i1).a(this.q.getContext(), this.q, R.layout.arg_RES_7f0d0f05);
                if (view == null) {
                   view = objArray;
                }else {
                   View view1 = m1.f(view, R.id.commodity_card_bg);
                   view1.getLayoutParams().width = (this.r.mCommodityInfoList.size() > 1)? n.c(view1.getContext(), 189.00f): n.c(view1.getContext(), 193.00f);
                }
             }
          }
          if (view == null) {
             this.q.setVisibility(i);
          }else {
             String str = "5";
             b uob = PatchProxy.applyWithListener(objArray, this, uod, str);
             if (uob != patchProxyRe) {
             }else {
                LiveFeed mCommodityUI = this.r.mCommodityUIStyle;
                if (mCommodityUI == null) {
                   uob = new b();
                   PatchProxy.onMethodExit(uod, str);
                }else if(mCommodityUI == 1){
                   uob = new c();
                   PatchProxy.onMethodExit(uod, str);
                }else {
                   uob = new c();
                   PatchProxy.onMethodExit(uod, str);
                }
             }
             uob.f(view);
             ArrayList uArrayList = PatchProxy.apply(objArray, this, uod, "6");
             if (uArrayList != patchProxyRe) {
             }else {
                Object[] objArray1 = new Object[]{new c("MERCHANT_HOME_COMMODITY_MODEL", this.r.getCommodity()),new c("MERCHANT_HOME_COMMODITY_UI_STYLE", Integer.valueOf(this.r.mCommodityUIStyle))};
                uArrayList = j.a(objArray1);
             }
             uob.i(uArrayList.toArray());
             this.q.addView(view);
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a0ffb);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.q8(b.class);
       return;
    }
}
