package com.kwai.social.startup.relation.model.LoginDialogPojo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LoginDialogPojo implements Serializable	// class@0018b3
{
    public String mAttractText;
    public List mAttractTextInfos;
    public LoginDialogPojo$BgPicUrls mBgPicUrls;
    public static final long serialVersionUID = 0xd22a68e1ee3539a;

    public void LoginDialogPojo(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LoginDialogPojo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LoginDialogPojo{mAttractText=\'"+this.mAttractText+'''+", mBgPicUrls="+this.mBgPicUrls+", mAttractTextInfos="+this.mAttractTextInfos+'}';
    }
}
