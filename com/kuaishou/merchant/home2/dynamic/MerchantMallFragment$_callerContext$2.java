package com.kuaishou.merchant.home2.dynamic.MerchantMallFragment$_callerContext$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.merchant.home2.dynamic.MerchantMallFragment;
import iv.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.lang.Integer;
import java.lang.Boolean;
import lx3.k$a;
import lx3.k;

public final class MerchantMallFragment$_callerContext$2 extends Lambda implements a	// class@00170d
{
    public final MerchantMallFragment this$0;

    public void MerchantMallFragment$_callerContext$2(MerchantMallFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public final a invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       MerchantMallFragment$_callerContext$2 obj = PatchProxy.apply(objArray, this, MerchantMallFragment$_callerContext$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       a uoa = PatchProxy.apply(objArray, obj, MerchantMallFragment.class, "18");
       if (uoa != patchProxyRe) {
       }else {
          uoa = new a();
          uoa.d("MERCHANT_HOME_ACTIVITY", obj.getActivity());
          uoa.d("FRAGMENT", obj);
          uoa.d("MERCHANT_BUYER_FRAGMENT_HIDDEN_OBSERVABLE", obj.G);
          uoa.d("FEED_FRAGMENT", obj);
          uoa.d("MERCHANT_HOME_MAGNET_POSITION", Integer.valueOf(0));
          uoa.d("MAGNET_NOT_FIRST_REQUEST", Boolean.valueOf(obj.E));
          uoa.d("MERCHANT_AUTO_PLAY_MANAGER", obj.C);
          uoa.d("MERCHANT_HOME_MULTI_TAB_SERVICE", obj.B);
          uoa.d("KEY_REFRESH_STATUS_LISTENER", obj.N);
          uoa.d("KEY_MULTI_TAB_LIFECYCLE_CALLBACK", obj.B.b());
          uoa.d("MERCHANT_HOME_LIVE_SOURCE_TYPE", Integer.valueOf(311));
          uoa.d("MERCHANT_BUYER_TAB_SELECTED", obj.L);
          uoa.d("MERCHANT_BUYER_TAB_SELECTED_FOR_PAGE_REFRESH", obj.K);
          uoa.d("MERCHANT_MALL_TAB_SELECTED_STATE", obj.M);
       }
       return uoa;
    }
    public Object invoke(){
       return this.invoke();
    }
}
