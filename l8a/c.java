package l8a.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import l8a.c$a;
import l8a.c$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.feed.detail.router.biz.thanos.MerchantSlidePlayModel;
import android.net.Uri;
import ekd.w0;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.util.rx.RxBus;
import e6a.d;
import brd.t;
import t45.d;
import brd.z;
import l8a.b;
import erd.g;
import crd.b;
import qvb.f;
import l8a.a;
import qvb.q;
import qvb.a;

public class c extends PresenterV2	// class@002d63
{
    public a p;
    public MerchantSlidePlayModel q;
    public PhotoDetailParam r;
    public boolean s;
    public boolean t;
    public String u;
    public f v;
    public q w;

    public void c(){
       super();
       this.u = "";
       this.v = new c$a(this);
       this.w = new c$b(this);
    }
    public void E8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          this.s = ("1").equals(w0.a(this.q.mDataUrl, "initShowRightPhotoList"));
          this.u = TextUtils.k(w0.a(this.q.mDataUrl, "activityBizData"));
          String str = "bizLogParams";
          this.r.getDetailLogParam().addPageUrlParam(str, w0.a(this.q.mDataUrl, str));
       }
       this.X7(RxBus.f.f(d.class).observeOn(d.a).subscribe(new b(this)));
       this.p.c(this.v);
       this.v.h(this.w);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.p.a();
       this.v.f(this.w);
       this.s = false;
       this.t = false;
       this.u = "";
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.r8("MERCHANT_SLIDE_PLAY_SERVICE");
       this.q = this.r8("MERCHANT_SLIDE_PLAY_INTENT_URL");
       this.r = this.q8(PhotoDetailParam.class);
       return;
    }
}
