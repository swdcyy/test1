package com.kwai.framework.model.user.QUserContactName;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class QUserContactName implements Serializable	// class@00171f
{
    public String mIv;
    public String mMobileHash;
    public String mName;
    public String mResult;
    public static final long serialVersionUID = 0x9cfee7d1aa4e8641;

    public void QUserContactName(){
       super();
       this.mResult = null;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, QUserContactName.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ContactName{mName=\'"+this.mName+'''+", mMobileHash=\'"+this.mMobileHash+'''+", mResult=\'"+this.mResult+'''+'}';
    }
}
