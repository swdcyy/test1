package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.r$a;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.r$b;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.live.marketing.sandeago.SandeagoPublish;
import g9c.a;
import com.kuaishou.merchant.live.marketing.sandeago.model.SandeagoPropertyItemResponseModel;
import java.util.Map;
import java.util.HashMap;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class r$a implements r$b	// class@001a8b
{
    public final r a;

    public void r$a(r p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, r$a.class, "1")) {
          return;
       }
       r$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, r.class, "6")) {
          ta.p.mFilledProperties = null;
          ta.t.M0();
       }
       return;
    }
    public void b(SandeagoPropertyItemResponseModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$a.class, "3")) {
          return;
       }
       r$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, r.class, "8")) {
          SandeagoPublish mFilledPrope = ta.p.mFilledProperties;
          if (mFilledPrope != null && p0 != null) {
             mFilledPrope.remove(p0.mPropId);
          }
       }
       return;
    }
    public void c(SandeagoPropertyItemResponseModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$a.class, "2")) {
          return;
       }
       r$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, r.class, "7")) {
          r p = ta.p;
          if (p.mFilledProperties == null) {
             p.mFilledProperties = new HashMap();
          }
          SandeagoPropertyItemResponseModel sandeagoProp = ta.p.mFilledProperties.get(p0.mPropId);
          if (sandeagoProp != null) {
             sandeagoProp.mPropValue = p0.mPropValue;
          }else {
             ta.p.mFilledProperties.put(p0.mPropId, p0);
          }
       }
       return;
    }
    public SandeagoPropertyItemResponseModel d(String p0){
       SandeagoPublish obj = PatchProxy.applyOneRefs(p0, this, r$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0)) {
          obj = this.a.p.mFilledProperties;
          if (obj != null) {
             return obj.get(p0);
          }
       }
       return null;
    }
}
