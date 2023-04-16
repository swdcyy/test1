package com.kwai.social.startup.relation.model.LoginTextStartupConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LoginTextStartupConfig implements Serializable	// class@0018b4
{
    public String mId;
    public String mLoginDesc;
    public String mLoginPromptText;
    public String mLoginSubjectText;
    public List mMatchBizTypes;
    public static final long serialVersionUID = 0x1fef26076db083c4;

    public void LoginTextStartupConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LoginTextStartupConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LoginTextStartupConfig{mId=\'"+this.mId+'''+", mMatchBizTypes=\'"+this.mMatchBizTypes+'''+", mLoginPromptText=\'"+this.mLoginPromptText+'''+", mLoginDesc=\'"+this.mLoginDesc+'''+", mLoginSubjectText=\'"+this.mLoginSubjectText+'''+'}';
    }
}
