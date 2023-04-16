package com.kuaishou.merchant.transaction.purchase.presenter.c0$a;
import re4.f;
import com.kuaishou.merchant.transaction.purchase.presenter.c0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import em4.m;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.purchase.presenter.q0$b;
import em4.a;
import com.kuaishou.merchant.basic.model.AddressInfo;
import kc4.c$b;
import kc4.c$a;
import java.util.Objects;
import com.google.gson.JsonObject;
import java.lang.Long;
import java.lang.Number;

public class c0$a implements f	// class@000968
{
    public final c0 b;

    public void c0$a(c0 p0){
       this.b = p0;
       super();
    }
    public void A7(){
       if (PatchProxy.applyVoid(null, this, c0$a.class, "3")) {
          return;
       }
       c0$a tb = this.b;
       if (tb.v == null) {
          tb.v = true;
          m.u();
       }
       return;
    }
    public void Y6(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0$a.class, "2")) {
          return;
       }
       if (this.b.getActivity() != null) {
          c0$a tb = this.b;
          c0$a tb1 = this.b;
          tb.s.a(tb.getActivity(), p0, new q0$b(tb1.t, tb1.u));
       }
       return;
    }
    public void a1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c0$a.class, "1")) {
          return;
       }
       c0$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, c0.class, "2")) {
          JsonObject jsonObject = new JsonObject();
          c0 u = tb.u;
          AddressInfo mAddressId = (u != null)? u.mAddressId: 0;
          jsonObject.a0("addressId", Long.valueOf(mAddressId));
          tb.t.e5(1200, jsonObject);
       }
       return;
    }
    public void a2(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0$a.class, "4")) {
          return;
       }
       m.j(p0);
       return;
    }
}
