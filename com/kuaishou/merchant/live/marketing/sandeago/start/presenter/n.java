package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.n;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import q64.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.n$a;
import com.kuaishou.merchant.live.marketing.sandeago.SandeagoPublish;
import java.lang.CharSequence;
import android.text.TextUtils;
import j14.c;
import java.util.Collection;
import ekd.q;
import u14.b;
import u14.a;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.List;
import brd.t;
import cjd.e;
import erd.o;
import q64.r;
import q64.s;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import q64.u;
import java.util.Map;
import java.util.HashMap;

public class n extends PresenterV2 implements g	// class@001a83
{
    public SandeagoPublish p;
    public SandeagoPublish q;
    public LiveMerchantBaseContext r;
    public n$b s;
    public boolean t;
    public String u;
    public String v;
    public b w;

    public void n(){
       super();
       this.s = new q(this);
       this.t = false;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, n.class, "2")) {
          return;
       }
       this.R8();
       this.u = "";
       this.v = "";
       return;
    }
    public final void P8(n$a p0){
       n on = n.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, on, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, on, "4") && TextUtils.isEmpty(this.p.mAuditId)) {
          on = this.q;
          this.p.mAuditId = (on != null && !TextUtils.isEmpty(on.mAuditId))? this.q.mAuditId: c.a();
       }
    label_003d :
       if (this.t != null && (TextUtils.equals(this.p.mImageUrl, this.u) && TextUtils.equals(this.p.getCategoryIds(), this.v))) {
          if (p0 != null) {
             p0.onSuccess();
          }
          return;
       }else if(!TextUtils.isEmpty(this.p.mImageUrl) && !q.f(this.p.mSelectCategoryList)){
          this.R8();
          on = this.p;
          this.w = a.a().a(this.r.getLiveStreamId(), QCurrentUser.me().getName(), on.mAuditId, on.mImageUrl, c.c(on.mSelectCategoryList), 98).map(new e()).subscribe(new r(this, p0), new s(this, p0));
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, n.class, "5")) {
          return;
       }
       n tw = this.w;
       if (tw != null && !tw.isDisposed()) {
          this.w.dispose();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new u();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, n.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(n.class, new u());
       }else {
          obj.put(n.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       this.p = this.r8("SANDEABIZ_PUBLISH");
       this.q = this.t8("SANDEABIZ_STORE_PUBLISH");
       this.r = this.r8("LIVE_BASE_CONTEXT");
       return;
    }
}
