package bz3.c$a;
import com.yxcorp.gifshow.widget.m;
import bz3.c;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import p74.a;
import o74.a;
import com.google.gson.JsonObject;
import ny3.b;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import java.lang.Integer;
import java.lang.Number;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import xu4.e;
import androidx.fragment.app.FragmentActivity;
import xw3.e;
import xw3.c;
import my3.f;
import com.kuaishou.merchant.home2.feed.FeedChannelInfo;
import com.kuaishou.merchant.home2.feed.model.CommodityCardFeed;
import com.kuaishou.merchant.basic.util.f;

public class c$a extends m	// class@00045c
{
    public final c c;

    public void c$a(c p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       if (this.c.v == null) {
          a.h(MerchantHomeLogBiz.Feed, "CommodityCardFeedLogger", "fail to jump", "feed", null);
          return;
       }else {
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("refer_photo_id", this.c.s.c.getId());
          jsonObject.a0("refer_photo_type", Integer.valueOf(this.c.s.c.mBizType));
          e.c(this.c.getActivity(), "list_memory", "merchant_home_agile_mall_tab_search_storage_key", jsonObject);
          c$a tc = this.c;
          e.q0(this.c.getActivity()).v0(e.s0(this.c.u), new f(tc.u, tc.v, tc.t));
          f.g(this.c.getActivity(), MerchantHomeLogBiz.Feed, this.c.v.mJumpUrl);
          return;
       }
    }
}
