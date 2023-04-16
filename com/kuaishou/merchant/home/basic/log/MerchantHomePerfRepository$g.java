package com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$g;
import z1.a;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;

public final class MerchantHomePerfRepository$g implements a	// class@0016c5
{
    public final MerchantHomePerfRepository a;

    public void MerchantHomePerfRepository$g(MerchantHomePerfRepository p0){
       this.a = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHomePerfRepository$g.class, "1")) {
          return;
       }
       MerchantHomePerfRepository$g ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, MerchantHomePerfRepository.class, "25")) {
          int i = (ta.a != null && (ta.b != null && ta.C != null))? 1: 0;
          if (i) {
             if (ta.m > 0 && ta.u <= 0) {
                ta.e();
             }
          }else if(ta.p > 0 && ta.u <= 0){
             ta.e();
          }
       }
    label_004d :
       return;
    }
}
