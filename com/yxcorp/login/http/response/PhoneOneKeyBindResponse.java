package com.yxcorp.login.http.response.PhoneOneKeyBindResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class PhoneOneKeyBindResponse implements Serializable	// class@001ad1
{
    public String mErrorMsg;
    public String mHostName;
    public String mMobile;
    public String mMobileCountryCode;
    public String mPhone;
    public String mResult;
    public static final long serialVersionUID = 0x79b8738a2e2cbfe6;

    public void PhoneOneKeyBindResponse(){
       super();
    }
    public String getErrorMsg(){
       return this.mErrorMsg;
    }
    public String getHostName(){
       return this.mHostName;
    }
    public String getMobile(){
       return this.mMobile;
    }
    public String getMobileCountryCode(){
       return this.mMobileCountryCode;
    }
    public String getPhone(){
       return this.mPhone;
    }
    public String getResult(){
       return this.mResult;
    }
    public void setErrorMsg(String p0){
       this.mErrorMsg = p0;
    }
    public void setHostName(String p0){
       this.mHostName = p0;
    }
    public void setMobile(String p0){
       this.mMobile = p0;
    }
    public void setMobileCountryCode(String p0){
       this.mMobileCountryCode = p0;
    }
    public void setPhone(String p0){
       this.mPhone = p0;
    }
    public void setResult(String p0){
       this.mResult = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PhoneOneKeyBindResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PhoneOneKeyBindResponse{mResult=\'"+this.mResult+'''+", mErrorMsg=\'"+this.mErrorMsg+'''+", mHostName=\'"+this.mHostName+'''+", mPhone=\'"+this.mPhone+'''+", mMobileCountryCode=\'"+this.mMobileCountryCode+'''+", mMobile=\'"+this.mMobile+'''+'}';
    }
}
