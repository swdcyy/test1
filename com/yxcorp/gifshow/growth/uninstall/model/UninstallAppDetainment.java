package com.yxcorp.gifshow.growth.uninstall.model.UninstallAppDetainment;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class UninstallAppDetainment implements Serializable	// class@001585
{
    public String mIcon;
    public String mScheme;
    public String mText;
    public static final long serialVersionUID = 0x54a112e94fd2d9b;

    public void UninstallAppDetainment(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UninstallAppDetainment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UninstallAppDetainment{mIcon=\'"+this.mIcon+'''+", mText=\'"+this.mText+'''+", mScheme=\'"+this.mScheme+'''+'}';
    }
}
