package com.kuaishou.merchant.transaction.purchase.model.AgreementInfoV2$AgreementModule;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class AgreementInfoV2$AgreementModule implements Serializable	// class@00093e
{
    public List mAgreementList;
    public String mExtraAgreementDesc;
    public String mPrefix;
    public static final long serialVersionUID = 0xca20d6717c24cf20;

    public void AgreementInfoV2$AgreementModule(){
       super();
    }
    public static AgreementInfoV2$AgreementModule of(String p0,List p1){
       AgreementInfoV2$AgreementModule obj = PatchProxy.applyTwoRefs(p0, p1, null, AgreementInfoV2$AgreementModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new AgreementInfoV2$AgreementModule();
       obj.mPrefix = p0;
       obj.mAgreementList = p1;
       return obj;
    }
}
