package com.kuaishou.merchant.transaction.purchase.presenter.r$e;
import com.kuaishou.merchant.transaction.base.pay.OrderEventProcessor;
import android.app.Activity;
import com.kuaishou.merchant.transaction.purchase.presenter.r;
import java.lang.String;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.util.HashMap;
import com.yxcorp.retrofit.model.KwaiException;
import com.kuaishou.merchant.transaction.base.pay.model.OrderResultEventInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import njd.a;
import com.kuaishou.merchant.transaction.base.live.model.PurchaseCreateOrderUnionResponse;
import com.kuaishou.merchant.transaction.base.live.model.PurchaseCreateOrderUnionResponse$Data;
import java.util.Map;
import ekd.q;
import ue4.g;
import com.google.gson.JsonObject;

public class r$e extends OrderEventProcessor	// class@0009a1
{
    public WeakReference g;
    public HashMap h;

    public void r$e(Activity p0,r p1,String p2){
       super(new WeakReference(p0), p2);
       this.h = new HashMap();
       this.g = new WeakReference(p1);
    }
    public OrderResultEventInfo a(KwaiException p0){
       KwaiException obj = PatchProxy.applyOneRefs(p0, this, r$e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.mResponse;
       if (obj != null && obj.a() instanceof PurchaseCreateOrderUnionResponse) {
          PurchaseCreateOrderUnionResponse mData = p0.mResponse.a().mData;
          if (mData != null) {
             return mData.mEventInfo;
          }
       }
       return null;
    }
    public void b(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$e.class, "2")) {
          return;
       }
       r or = this.g.get();
       if (or == null) {
          return;
       }
       if (!q.h(p0)) {
          this.h.putAll(p0);
       }
       or.R8(false, 3, g.e(g.d(this.h)));
       return;
    }
}
