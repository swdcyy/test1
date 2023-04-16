package com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment$a;
import im8.g;
import java.lang.Object;
import java.lang.System;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.transaction.purchase.d0;
import java.util.Map;
import java.util.HashMap;

public class MerchantPurchaseFragment$a implements g	// class@0008f0
{
    public List A;
    public String B;
    public e0 C;
    public Fragment b;
    public a c;
    public PurchasePageParams d;
    public String e;
    public Map f;
    public ProductInfo g;
    public String h;
    public AddressInfo i;
    public UpgradeAddressGuideModel j;
    public PoiInfo k;
    public List l;
    public FollowingInfo m;
    public PaymentInfo n;
    public boolean o;
    public BottomTipInfo p;
    public String q;
    public String r;
    public int s;
    public boolean t;
    public CrossBorderInfo u;
    public AgreementInfoV2 v;
    public List w;
    public AnnouncementInfo x;
    public int y;
    public BuyButton z;

    public void MerchantPurchaseFragment$a(){
       super();
       this.B = String.valueOf(System.currentTimeMillis());
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantPurchaseFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, MerchantPurchaseFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(MerchantPurchaseFragment$a.class, new d0());
       }else {
          obj.put(MerchantPurchaseFragment$a.class, null);
       }
       return obj;
    }
}
