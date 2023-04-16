package com.kuaishou.merchant.home2.dynamic.microdetail.MerchantMicroDetailFragment$_callerContext$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.merchant.home2.dynamic.microdetail.MerchantMicroDetailFragment;
import iv.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;

public final class MerchantMicroDetailFragment$_callerContext$2 extends Lambda implements a	// class@00175a
{
    public final MerchantMicroDetailFragment this$0;

    public void MerchantMicroDetailFragment$_callerContext$2(MerchantMicroDetailFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public final a invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       MerchantMicroDetailFragment$_callerContext$2 obj = PatchProxy.apply(objArray, this, MerchantMicroDetailFragment$_callerContext$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       a uoa = PatchProxy.apply(objArray, obj, MerchantMicroDetailFragment.class, "6");
       if (uoa != patchProxyRe) {
       }else {
          uoa = new a();
          uoa.d("MERCHANT_HOME_ACTIVITY", obj.getActivity());
          uoa.d("FEED_FRAGMENT", obj);
       }
       return uoa;
    }
    public Object invoke(){
       return this.invoke();
    }
}
