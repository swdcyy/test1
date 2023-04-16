package com.kwai.feature.api.social.login.model.LoginPageStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LoginPageStatus extends Enum	// class@001114
{
    public static final LoginPageStatus[] $VALUES;
    public static final LoginPageStatus MAIL_ACCOUNT_INPUT;
    public static final LoginPageStatus PASSWORD_INPUT;
    public static final LoginPageStatus PHONE_ACCOUNT_INPUT;

    static {
       LoginPageStatus loginPageSta = new LoginPageStatus("PHONE_ACCOUNT_INPUT", 0);
       LoginPageStatus.PHONE_ACCOUNT_INPUT = loginPageSta;
       LoginPageStatus loginPageSta1 = new LoginPageStatus("MAIL_ACCOUNT_INPUT", 1);
       LoginPageStatus.MAIL_ACCOUNT_INPUT = loginPageSta1;
       LoginPageStatus loginPageSta2 = new LoginPageStatus("PASSWORD_INPUT", 2);
       LoginPageStatus.PASSWORD_INPUT = loginPageSta2;
       LoginPageStatus[] loginPageSta3 = new LoginPageStatus[]{loginPageSta,loginPageSta1,loginPageSta2};
       LoginPageStatus.$VALUES = loginPageSta3;
    }
    public void LoginPageStatus(String p0,int p1){
       super(p0, p1);
    }
    public static LoginPageStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LoginPageStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LoginPageStatus.class, p0);
    }
    public static LoginPageStatus[] values(){
       Object obj = PatchProxy.apply(null, null, LoginPageStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LoginPageStatus.$VALUES.clone();
    }
}
