package com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpLoadingViewBinder$mApiErrorConsumer$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.purchase.l0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;

public final class MtpLoadingViewBinder$mApiErrorConsumer$2 extends Lambda implements a	// class@000924
{
    public final Fragment $fragment;

    public void MtpLoadingViewBinder$mApiErrorConsumer$2(Fragment p0){
       this.$fragment = p0;
       super(0);
    }
    public final l0 invoke(){
       Object obj = PatchProxy.apply(null, this, MtpLoadingViewBinder$mApiErrorConsumer$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new l0(this.$fragment.getActivity());
    }
    public Object invoke(){
       return this.invoke();
    }
}
