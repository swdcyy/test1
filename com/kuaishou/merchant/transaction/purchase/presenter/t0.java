package com.kuaishou.merchant.transaction.purchase.presenter.t0;
import oj0.a;
import com.kuaishou.merchant.transaction.purchase.presenter.u0;
import java.lang.Object;
import java.util.Map;
import java.util.Objects;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import java.lang.String;
import p74.a;
import o74.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.c;
import com.google.gson.JsonObject;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import um4.h2;
import java.lang.Runnable;

public final class t0 implements a	// class@0009a9
{
    public final u0 b;

    public void t0(u0 p0){
       this.b = p0;
    }
    public final void W(Map p0){
       t0 tb = this.b;
       Objects.requireNonNull(tb);
       a.s(MerchantTransactionLogBiz.PURCHASE, "RNPanelPresenter", "receive EVENT_RESELECT, value "+p0);
       if (p0 == null) {
       }else {
          p0 = p0.get("MerchantPurchaseReselectData");
          if (p0 instanceof Map) {
             JsonObject jsonObject = null;
             try{
                jsonObject = c.d(new Gson().q(p0)).r();
             }catch(java.lang.Exception e0){
                a.s(MerchantTransactionLogBiz.PURCHASE, "RNPanelPresenter", "KRN bridge EVENT_RESELECT value invalid");
             }
             if (jsonObject != null && e0.getActivity() != null) {
                e0.getActivity().runOnUiThread(new h2(e0, jsonObject));
             }
          }
       }
       return;
    }
}
