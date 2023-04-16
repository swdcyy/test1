package az3.q;
import oy3.i;
import az3.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import oy3.g;
import oy3.h;
import az3.d;
import az3.k;
import az3.l;
import com.kuaishou.merchant.home2.feed.autoplay.MerchantAutoPlayHelper;
import ox3.h;
import az3.e;

public final class q extends i	// class@0002ea
{

    public void q(){
       super();
       this.S8(new m());
       this.S8(new g());
       this.S8(new h());
       this.S8(new d());
       this.S8(new k());
       this.S8(new l());
       PresenterV2 presenterV2 = MerchantAutoPlayHelper.b.c();
       if (presenterV2 != null) {
          this.S8(presenterV2);
       }
       presenterV2 = h.a.b();
       if (presenterV2 != null) {
          this.S8(presenterV2);
       }
       this.S8(new e());
       return;
    }
    public int P8(){
       return 0x7f0a0913;
    }
}
