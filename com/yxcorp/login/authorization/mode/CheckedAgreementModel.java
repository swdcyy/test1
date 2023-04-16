package com.yxcorp.login.authorization.mode.CheckedAgreementModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Boolean;

public class CheckedAgreementModel implements Serializable	// class@001a39
{
    public String agreementId;
    public Boolean isChecked;
    public Boolean isNeed;
    public static final long serialVersionUID = 0x310b59cf5cd7f47d;

    public void CheckedAgreementModel(){
       super();
       Boolean fALSE = Boolean.FALSE;
       this.isNeed = fALSE;
       this.isChecked = fALSE;
    }
}
