package com.kuaishou.merchant.live.basic.sharetoken.b;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.live.basic.sharetoken.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.api.core.model.MerchantAudienceParams;
import as3.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import p74.a;
import o74.a;
import y04.d;
import y04.c;
import brd.t;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import d24.a;
import com.kuaishou.merchant.live.basic.sharetoken.a;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import d24.d;
import java.util.Map;
import java.util.HashMap;

public class b extends PresenterV2 implements g	// class@0018ce
{
    public a p;
    public v q;
    public String r;

    public void b(){
       super();
       this.q = new b$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       if (this.p.d() == null) {
          return;
       }
       MerchantAudienceParams mShareToken = this.p.d().mShareToken;
       if (TextUtils.isEmpty(mShareToken)) {
          a.s(MerchantLiveLogBiz.SHARE_TOKEN, "LiveMerchantAudienceShareTokenPresenter", "merchant share token is null");
          return;
       }else {
          this.X7(c.a().j(mShareToken).observeOn(d.a).map(new e()).subscribe(new a(this), a.b));
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.r = null;
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new d());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_MERCHANT_PLAY_CALLER_CONTEXT");
       return;
    }
}
