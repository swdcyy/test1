package com.kuaishou.merchant.transaction.purchase.model.AgreementInfoV2;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.merchant.transaction.purchase.model.AgreementInfoV2$AgreementModule;
import java.util.Collection;
import ekd.q;

public class AgreementInfoV2 implements Serializable	// class@00093f
{
    public AgreementInfoV2$AgreementModule mDefaultAgreement;
    public boolean mHasCheckStateChangedByUser;
    public AgreementInfoV2$AgreementModule mMandatoryAgreement;
    public boolean mMandatoryChecked;
    public PayAgreement mOuterAgreement;
    public boolean mShowRequiredByServer;
    public static final long serialVersionUID = 0x56ac252f0b1589f5;

    public void AgreementInfoV2(){
       super();
    }
    public boolean hasMandatoryAgreement(){
       boolean b;
       AgreementInfoV2 obj = PatchProxy.apply(null, this, AgreementInfoV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.mShowRequiredByServer != null) {
          obj = this.mMandatoryAgreement;
          if (obj != null && !q.f(obj.mAgreementList)) {
          label_0028 :
             b = true;
          label_002b :
             return b;
          }
       }
       if (this.mOuterAgreement != null) {
          goto label_0028 ;
       }else {
          b = false;
          goto label_002b ;
       }
    }
}
