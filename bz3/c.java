package bz3.c;
import oy3.i;
import bz3.c$a;
import bz3.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import bz3.g;
import bz3.e;
import bz3.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kx3.a;
import ny3.b;
import com.kuaishou.merchant.home2.feed.model.CommodityCardFeed;
import android.view.View;
import android.view.View$OnClickListener;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import xw3.e;
import xw3.c;
import my3.f;
import com.kuaishou.merchant.home2.feed.FeedChannelInfo;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import java.lang.Integer;

public class c extends i	// class@00045d
{
    public b s;
    public int t;
    public FeedChannelInfo u;
    public CommodityCardFeed v;
    public final m w;

    public void c(){
       super();
       this.w = new c$a(this);
       this.S8(new b());
       this.S8(new g());
       this.S8(new e());
       this.S8(new d());
    }
    public void E8(){
       b c;
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       super.E8();
       c = this.s.c;
       this.v = c;
       if (c == null) {
          return;
       }
       this.m8().setOnClickListener(this.w);
       e.q0(this.getActivity()).y0(e.s0(this.u), new f(this.u, this.v, this.t));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       super.doBindView(p0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.s = this.q8(b.class);
       this.t = this.r8("ADAPTER_POSITION").intValue();
       this.u = this.r8("MERCHANT_HOME_FEED_CHANNEL");
       return;
    }
}
