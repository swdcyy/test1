package com.kwai.social.startup.relation.model.LoginDialogPojo$BgPicUrls;
import java.io.Serializable;
import com.kwai.social.startup.relation.model.LoginDialogPojo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;

public class LoginDialogPojo$BgPicUrls implements Serializable	// class@0018b1
{
    public List mLoginBgUrls;
    public List mPopupLoginBgUrls;
    public final LoginDialogPojo this$0;
    public static final long serialVersionUID = 0xe27135f897b8aeae;

    public void LoginDialogPojo$BgPicUrls(LoginDialogPojo p0){
       this.this$0 = p0;
       super();
    }
    public boolean isLoginBgUrlExist(){
       LoginDialogPojo$BgPicUrls obj = PatchProxy.apply(null, this, LoginDialogPojo$BgPicUrls.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mLoginBgUrls;
       boolean b = (obj != null && !obj.isEmpty())? true: false;
       return b;
    }
    public boolean isPopupLoginBgUrlExist(){
       LoginDialogPojo$BgPicUrls obj = PatchProxy.apply(null, this, LoginDialogPojo$BgPicUrls.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mPopupLoginBgUrls;
       boolean b = (obj != null && !obj.isEmpty())? true: false;
       return b;
    }
}
