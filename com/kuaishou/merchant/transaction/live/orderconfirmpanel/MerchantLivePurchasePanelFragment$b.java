package com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment$b;
import im8.g;
import java.lang.Object;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import kk4.e;
import kk4.i;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import java.lang.System;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.a0;
import java.util.Map;
import java.util.HashMap;

public class MerchantLivePurchasePanelFragment$b implements g	// class@0007e4
{
    public String A;
    public int B;
    public boolean C;
    public boolean D;
    public String E;
    public int F;
    public String G;
    public String H;
    public int I;
    public String J;
    public String K;
    public String L;
    public String M;
    public long N;
    public long O;
    public String P;
    public String Q;
    public boolean R;
    public HashMap S;
    public String T;
    public MerchantLivePurchasePanelFragment b;
    public MerchantLivePurchasePanelResponse c;
    public c d;
    public e e;
    public LiveMerchantBaseContext f;
    public e g;
    public k h;
    public i i;
    public DefaultObservable j;
    public boolean k;
    public boolean l;
    public DefaultObservable m;
    public boolean n;
    public a o;
    public int p;
    public OrderConfirmCommodity q;
    public MerchantLivePurchasePanelFragment r;
    public boolean s;
    public k t;
    public String u;
    public d v;
    public Map w;
    public String x;
    public String y;
    public String z;

    public void MerchantLivePurchasePanelFragment$b(){
       super();
       this.c = new MerchantLivePurchasePanelResponse();
       this.e = new e();
       this.i = new i();
       this.j = new DefaultObservable();
       this.k = false;
       this.l = false;
       this.m = new DefaultObservable();
       this.s = false;
       this.u = String.valueOf(System.currentTimeMillis());
       this.C = true;
       this.D = false;
       this.E = "";
       this.G = "";
       this.H = "";
       this.I = 0;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantLivePurchasePanelFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new a0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, MerchantLivePurchasePanelFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(MerchantLivePurchasePanelFragment$b.class, new a0());
       }else {
          obj.put(MerchantLivePurchasePanelFragment$b.class, null);
       }
       return obj;
    }
}
