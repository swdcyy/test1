package a64.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import a64.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ks3.r$b;
import ks3.r;
import com.kuaishou.merchant.api.core.model.MerchantAudienceParams;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import java.lang.CharSequence;
import android.text.TextUtils;
import ks3.a0;
import y04.d;
import y04.c;
import brd.t;
import cjd.e;
import erd.o;
import a64.b;
import a64.f;
import erd.g;
import crd.b;
import a64.c;
import a64.e;
import io.reactivex.internal.functions.Functions;
import a64.d;

public class g extends PresenterV2	// class@000032
{
    public r p;
    public a0 q;
    public boolean r;
    public boolean s;
    public r$b t;

    public void g(){
       super();
       this.r = false;
       this.s = false;
       this.t = new a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       this.p.h(this.t);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       this.p.m(this.t);
       this.r = false;
       return;
    }
    public final Map P8(MerchantAudienceParams p0){
       String liveStreamId;
       MerchantAudienceParams obj = PatchProxy.applyOneRefs(p0, this, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.mQueryParamsMap;
       if (obj == null) {
          return new HashMap();
       }
       p0 = p0.mLiveStreamId;
       if (TextUtils.isEmpty(p0)) {
          liveStreamId = this.q.getLiveStreamId();
       }
       obj.put("liveStreamId", liveStreamId);
       return obj;
    }
    public final void R8(MerchantAudienceParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "9")) {
          return;
       }
       if (!TextUtils.isEmpty(p0.mCommodityId)) {
          MerchantAudienceParams mMerchantSou = p0.mMerchantSource;
          f uof = 5;
          int i = 4;
          d uod = (mMerchantSou != 1 && (mMerchantSou != i && (mMerchantSou == 6 || mMerchantSou == uof)))? 1: null;
          if (uod) {
             uod = c.a();
             MerchantAudienceParams mCommodityId = p0.mCommodityId;
             MerchantAudienceParams mSellerId = p0.mSellerId;
             p0 = p0.mMerchantSource;
             if (p0 == uof) {
                i = 3;
             }else if(p0 == 6){
                i = (p0 == 1 || p0 == i)? 1: 0;
             }
             this.X7(uod.r(mCommodityId, mSellerId, i).map(new e()).subscribe(new b(this), f.b));
          }
       }
       return;
    }
    public final void S8(MerchantAudienceParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "7")) {
          return;
       }
       this.X7(c.a().i(this.P8(p0)).map(new e()).subscribe(new c(this), e.b));
       return;
    }
    public final void V8(MerchantAudienceParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "6")) {
          return;
       }
       this.X7(c.a().q(this.P8(p0)).subscribe(Functions.d(), d.b));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_MERCHANT_AUDIENCE_BOTTOM_BAR_SERVICE");
       this.q = this.r8("LIVE_MERCHANT_CALLER_CONTEXT_SERVICE");
       return;
    }
}
