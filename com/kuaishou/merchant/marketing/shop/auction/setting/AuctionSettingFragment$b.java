package com.kuaishou.merchant.marketing.shop.auction.setting.AuctionSettingFragment$b;
import im8.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import mrd.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.marketing.shop.auction.setting.f;
import java.util.Map;
import java.util.HashMap;

public class AuctionSettingFragment$b implements g	// class@001bb4
{
    public PublishSubject b;
    public a c;
    public BaseFragment d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;

    public void AuctionSettingFragment$b(){
       super();
       this.b = PublishSubject.g();
       this.c = a.g();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AuctionSettingFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, AuctionSettingFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(AuctionSettingFragment$b.class, new f());
       }else {
          obj.put(AuctionSettingFragment$b.class, null);
       }
       return obj;
    }
}
