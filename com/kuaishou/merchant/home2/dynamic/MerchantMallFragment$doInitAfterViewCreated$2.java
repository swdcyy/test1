package com.kuaishou.merchant.home2.dynamic.MerchantMallFragment$doInitAfterViewCreated$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.merchant.home2.dynamic.MerchantMallFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.Boolean;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;

public final class MerchantMallFragment$doInitAfterViewCreated$2 extends FunctionReferenceImpl implements l	// class@001712
{

    public void MerchantMallFragment$doInitAfterViewCreated$2(MerchantMallFragment p0){
       super(1, p0, MerchantMallFragment.class, "setupIsNotFirstRequest", "setupIsNotFirstRequest\(Z\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(MerchantMallFragment$doInitAfterViewCreated$2.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MerchantMallFragment$doInitAfterViewCreated$2.class, "1")) {
          return;
       }
       this.receiver.nh(p0);
       return;
    }
}
