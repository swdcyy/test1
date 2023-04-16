package com.kuaishou.merchant.container.base.b;
import ik0.e;
import com.kuaishou.merchant.container.base.MerchantKrnDialogFragment;
import java.lang.Object;
import ik0.g;
import com.kuaishou.krn.model.LaunchModel;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.sdk.switchconfig.a;
import java.util.List;
import java.util.ArrayList;
import java.lang.reflect.Type;
import java.util.Iterator;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import zt3.h;
import android.app.Activity;
import com.kuaishou.merchant.router.RouterConfig;
import us3.f;
import us3.g;
import com.kuaishou.merchant.router.b;

public class b implements e	// class@00162f
{
    public final MerchantKrnDialogFragment a;

    public void b(MerchantKrnDialogFragment p0){
       this.a = p0;
       super();
    }
    public boolean a(g p0,LaunchModel p1,String p2){
       boolean b;
       String this;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "1");
       if (p0 != patchProxyRe) {
          return p0.booleanValue();
       }
       b ta = this.a;
       Objects.requireNonNull(ta);
       p1 = PatchProxy.applyOneRefs(p2, ta, MerchantKrnDialogFragment.class, "25");
       b = true;
       if (p1 != patchProxyRe) {
          b = p1.booleanValue();
       }else {
          String str = "MerchantKrnDialogFragment";
          this = "url";
          a.t(MerchantCommonLogBiz.RN, str, "handleDegradeUrl", this, p2);
          if (!TextUtils.x(p2)) {
             p1 = PatchProxy.applyOneRefs(p2, null, MerchantKrnDialogFragment.class, "26");
             if (p1 != patchProxyRe) {
                b1 = p1.booleanValue();
             }else {
                List value = a.t().getValue("degradeWebUrlWhiteList", List.class, new ArrayList());
                if (value != null) {
                   Iterator iterator = value.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         String str1 = iterator.next();
                         if (!TextUtils.x(str1) && p2.startsWith(str1)) {
                            b1 = true;
                         }
                      }
                   }
                }
                b1 = false;
             }
             if (!b1) {
                a.t(MerchantCommonLogBiz.RN, str, "handleDegradeUrl: url not white list", this, p2);
             }else {
                b.r(ta.vh("routerToken", ""), ta.getActivity(), p2, null, null, new h(ta));
             }
          }
          b = false;
       }
       return b;
    }
}
