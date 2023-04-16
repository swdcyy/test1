package com.kuaishou.merchant.container.mixhalf.a;
import cb4.e;
import com.kuaishou.merchant.container.mixhalf.a$a;
import java.lang.Object;
import cb4.d;
import com.kuaishou.merchant.router.base.RouterRequest;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import ma4.e;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import java.lang.StringBuilder;
import android.net.Uri;
import p74.a;
import o74.a;
import com.kuaishou.merchant.router.RouterConfig;
import java.util.HashMap;
import java.util.Map;
import us3.c;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ks3.f0;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import ks3.t;
import com.kuaishou.merchant.router.b;
import com.kuaishou.merchant.container.mixhalf.LiveMerchantHalfMixRnH5ContainerFragment;
import com.kuaishou.merchant.container.mixhalf.LiveMerchantHalfMixRnH5ContainerFragment$b;
import com.kuaishou.merchant.container.mixhalf.LiveMerchantHalfMixRnH5ContainerFragment$a;
import eu3.a;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import eu3.b;
import android.content.DialogInterface$OnShowListener;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;

public class a implements e	// class@001648
{
    public a$a a;

    public void a(a$a p0){
       super();
       this.a = p0;
    }
    public boolean a(){
       return d.a(this);
    }
    public boolean b(RouterRequest p0){
       c uoc;
       a$a a;
       String str1;
       a$a b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RouterConfig obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       if (d.a(-1103669376).M3(p0)) {
          a.s(MerchantCommonLogBiz.ROUTER, "HalfMixRnH5RouterHandler", "µØ¥∞π‹øÿ¿πΩÿ¥¶¿Ì:"+p0.d());
          return true;
       }else {
          obj = p0.c();
          HashMap hashMap = new HashMap();
          if (obj != null) {
             Map map = obj.c();
             String str = "KEY_HALF_CONTAINER_CALLBACK";
             uoc = (map.containsKey(str) && map.get(str) instanceof c)? map.get(str): null;
             Iterator iterator = map.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                Object value = uEntry.getValue();
                if (value != null && !TextUtils.n(uEntry.getKey(), str)) {
                   hashMap.put(uEntry.getKey(), value.toString());
                }
             }
          }else {
             uoc = null;
          }
          a ta = this.a;
          if (ta != null) {
             a = ta.a;
             if (a != null) {
                hashMap.put("liveId", a.J4());
                str1 = this.a.a.I4();
             }else {
                str1 = "";
             }
             b = this.a.b;
             if (b != null) {
                hashMap.put("routerToken", b.a().getMerchantSessionId());
             }
          }else {
             str1 = b.e();
          }
          hashMap.put("pageId", str1);
          str1 = p0.d().toString();
          LiveMerchantHalfMixRnH5ContainerFragment liveMerchant = PatchProxy.applyTwoRefs(str1, hashMap, null, LiveMerchantHalfMixRnH5ContainerFragment.class, "1");
          if (liveMerchant != patchProxyRe) {
          }else {
             liveMerchant = new LiveMerchantHalfMixRnH5ContainerFragment();
             LiveMerchantHalfMixRnH5ContainerFragment$b uob = new LiveMerchantHalfMixRnH5ContainerFragment$b(null);
             uob.a = str1;
             uob.b = hashMap;
             liveMerchant.D = uob;
          }
          if (uoc != null) {
             liveMerchant.k0(new a(uoc));
             liveMerchant.ph(new b(uoc));
          }
          liveMerchant.Cb(p0.a().getSupportFragmentManager(), p0.d().toString());
          return true;
       }
    }
    public String getName(){
       return d.b(this);
    }
}
