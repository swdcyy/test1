package az3.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ny3.b;
import com.kuaishou.merchant.home2.feed.model.LiveFeed;
import com.kuaishou.merchant.home2.feed.autoplay.MerchantAutoPlayHelper;
import az3.m$a;
import erd.g;
import crd.b;
import brd.t;
import com.kuaishou.bowl.core.component.a;
import android.app.Activity;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import xw3.e;
import xw3.c;
import my3.j;
import com.kuaishou.merchant.home2.feed.FeedChannelInfo;
import ly3.a;
import java.lang.Boolean;
import android.view.View;
import az3.n;
import android.view.View$OnClickListener;
import ekd.m1;
import az3.o;
import az3.p;
import java.lang.Integer;
import com.google.gson.JsonObject;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import java.lang.Number;
import xu4.e;
import az3.r;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import p74.a;
import o74.a;
import com.kuaishou.merchant.basic.util.f;
import io4.e;

public final class m extends PresenterV2	// class@0002e6
{
    public b p;
    public FeedChannelInfo q;
    public r r;
    public t s;
    public int t;
    public boolean u;
    public e v;
    public a w;

    public void m(){
       super();
       this.t = -1;
    }
    public void E8(){
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "2")) {
          return;
       }
       m tp = this.p;
       String str = "mFeedUiModel";
       if (tp == null) {
          a.S(str);
       }
       b c = tp.c;
       if (!c instanceof LiveFeed) {
          c = objArray;
       }
       b uob = c;
       if (uob != null) {
          if (MerchantAutoPlayHelper.d()) {
             tp = this.s;
             if (tp != null) {
                this.X7(tp.subscribe(new m$a(this)));
             }
          }
          tp = this.w;
          String str1 = 1;
          boolean b = (tp != null)? tp.isReportShowManual(): true;
          if (b) {
             Activity activity = this.getActivity();
             Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
             e uoe = e.q0(activity);
             m tq = this.q;
             String str2 = "mFeedChannelInfo";
             if (tq == null) {
                a.S(str2);
             }
             String str3 = e.s0(tq);
             m tq1 = this.q;
             if (tq1 == null) {
                a.S(str2);
             }
             tq = this.p;
             if (tq == null) {
                a.S(str);
             }
             j oj = new j(tq1, uob, tq.d, -1, this.t, this.u);
             uoe.y0(str3, v12);
          }else {
             tp = this.w;
             if (tp != null) {
                tp.putClientElementParams("isAutoPlay", Boolean.valueOf(this.u));
             }
             tp = this.p;
             if (tp == null) {
                a.S(str);
             }
             c = tp.d;
             if (c != null) {
                c.b(str1, this.t);
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, om, "3")) {
             this.m8().setOnClickListener(new n(this));
             View view = m1.f(this.m8(), R.id.frame_layout_commodity_area);
             if (view != null) {
                view.setOnClickListener(new o(this));
             }
             view = m1.f(this.m8(), R.id.author_bg);
             if (view != null) {
                view.setOnClickListener(new p(this));
             }
          }
       }
    label_00df :
       return;
    }
    public final void P8(View p0,int p1){
       m p1;
       Object obj = this;
       String obj1 = p0;
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(obj1, Integer.valueOf(p1), obj, om, "4")) {
          return;
       }
       m p = obj.p;
       String str = "mFeedUiModel";
       if (p == null) {
          a.S(str);
       }
       b c = p.c;
       if (!c instanceof LiveFeed) {
          c = null;
       }
       if (c != null) {
          JsonObject jsonObject = new JsonObject();
          p1 = obj.p;
          if (p1 == null) {
             a.S(str);
          }
          jsonObject.c0("refer_photo_id", p1.c.getId());
          p1 = obj.p;
          if (p1 == null) {
             a.S(str);
          }
          jsonObject.a0("refer_photo_type", Integer.valueOf(p1.c.mBizType));
          e.c(this.getActivity(), "list_memory", "merchant_home_agile_mall_tab_search_storage_key", jsonObject);
          m w = obj.w;
          boolean b = (w != null)? w.isReportClickManual(): true;
          if (b) {
             Activity activity = this.getActivity();
             Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
             e uoe = e.q0(activity);
             w = obj.q;
             String str1 = "mFeedChannelInfo";
             if (w == null) {
                a.S(str1);
             }
             String str2 = e.s0(w);
             m q = obj.q;
             if (q == null) {
                a.S(str1);
             }
             w = obj.p;
             if (w == null) {
                a.S(str);
             }
             j oj = new j(q, c, w.d, p1, obj.t, obj.u);
             uoe.v0(str2, v11);
          }else {
             w = obj.w;
             if (w != null) {
                w.putClientElementParams("isAutoPlay", Boolean.valueOf(obj.u));
             }
             w = obj.w;
             if (w != null) {
                w.reportClickEvent();
             }
             w = obj.p;
             if (w == null) {
                a.S(str);
             }
             b d = w.d;
             if (d != null) {
                d.b(false, obj.t);
             }
          }
          obj1.setTag(R.id.tag_view_refere, Integer.valueOf(232));
          if (!PatchProxy.applyVoidTwoRefs(c, obj1, obj, om, "5")) {
             if (c.mQPhoto != null) {
                if (!PatchProxy.applyVoidOneRefs(obj1, obj, om, "6")) {
                   om = obj.r;
                   if (om == null) {
                      a.S("mLiveSlidePlayService");
                   }
                   om.q3(obj1, obj.t);
                }
             }else if(PatchProxy.applyVoidOneRefs(c, obj, om, "7")){
                obj1 = c.getJumpUrl();
                int i = (obj1 == null || !obj1.length())? 1: 0;
                if (i) {
                   a.g(MerchantHomeLogBiz.Feed, "LiveFeedContentPresenter", "jump url is null");
                }else {
                   f.e(this.getActivity(), c.getJumpUrl());
                }
             }
          }
       }
    label_0137 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.p = this.q8(b.class);
       this.r = this.r8("MERCHANT_HOME_LIVE_SLIDE_PLAY_SERVICE");
       this.t = this.r8("ADAPTER_POSITION").intValue();
       this.s = this.t8("MERCHANT_AUTO_PLAY_OBSERVABLE");
       this.q = this.r8("MERCHANT_HOME_FEED_CHANNEL");
       this.v = this.t8("MERCHANT_HOME_FEED_STYLE");
       this.w = this.t8("MERCHANT_HOME_WIDGET_COMPONENT");
       return;
    }
}
