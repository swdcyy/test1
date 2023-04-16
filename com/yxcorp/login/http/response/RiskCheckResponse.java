package com.yxcorp.login.http.response.RiskCheckResponse;
import java.io.Serializable;
import java.lang.Object;

public class RiskCheckResponse implements Serializable	// class@001ad6
{
    public boolean isCheckResult;
    public String mAuthToken;
    public int mResult;
    public String mZtUnionVerifyUrl;
    public static final long serialVersionUID = 0x3544f8df2715dc1e;

    public void RiskCheckResponse(){
       super();
       this.isCheckResult = false;
    }
}
