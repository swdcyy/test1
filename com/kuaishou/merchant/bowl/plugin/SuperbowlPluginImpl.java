package com.kuaishou.merchant.bowl.plugin.SuperbowlPluginImpl;
import vx4.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.cover.Link;
import com.kuaishou.merchant.pagedy.a;
import fv.e;
import java.util.Map;
import java.lang.StringBuilder;
import nv.c;
import java.util.ArrayList;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.merchant.bowl.plugin.SuperbowlPluginImpl$Config;
import com.kuaishou.merchant.bowl.plugin.SuperbowlPluginImpl$a;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.pagedy.request.a$a;
import com.kuaishou.pagedy.request.a;
import java.util.List;
import com.kuaishou.merchant.bowl.BundlePreloadUtil;
import tx4.f;

public class SuperbowlPluginImpl implements j	// class@001611
{
    public static String b = "merchantHomeSideBarPrefetch";

    public void SuperbowlPluginImpl(){
       super();
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, SuperbowlPluginImpl.class, "5")) {
          return;
       }
       Link.h().e();
       return;
    }
    public void JX(){
       if (PatchProxy.applyVoid(null, this, SuperbowlPluginImpl.class, "3")) {
          return;
       }
       a.b();
       return;
    }
    public void Tx(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SuperbowlPluginImpl.class, "6")) {
          return;
       }
       Link.h().g(e.b(p0, 0));
       return;
    }
    public void ic(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SuperbowlPluginImpl.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       c.f("preRequest = "+p0.toString());
       this.JX();
       ArrayList uArrayList = new ArrayList();
       SuperbowlPluginImpl$Config value = a.t().getValue(SuperbowlPluginImpl.b, SuperbowlPluginImpl$Config.class, new SuperbowlPluginImpl$Config(null));
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          Map value1 = uEntry.getValue();
          if (!TextUtils.x(key)) {
             a$a uoa = new a$a();
             uoa.g(key);
             uoa.f(value1);
             uoa.e("MERCHANT_BUYER_MALL");
             uoa.c(value.mEffectiveDuration);
             uoa.i(true);
             uArrayList.add(uoa.a());
          }
       }
       if (!uArrayList.isEmpty()) {
          a.d(uArrayList);
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public void nf(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SuperbowlPluginImpl.class, "1")) {
          return;
       }
       BundlePreloadUtil.c(p0);
       return;
    }
    public void pv(String p0,f p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SuperbowlPluginImpl.class, "2")) {
          return;
       }
       BundlePreloadUtil.b(p0, p1);
       return;
    }
}
