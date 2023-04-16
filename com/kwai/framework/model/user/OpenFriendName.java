package com.kwai.framework.model.user.OpenFriendName;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ka6.b;

public class OpenFriendName implements Serializable, a	// class@00170b
{
    public QUserContactName mContactName;
    public String mMobileHash;
    public String mOpenUserName;
    public String mThirdPartyName;
    public int mType;
    public static final long serialVersionUID = 0x7f6cc3505c89a589;

    public void OpenFriendName(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, OpenFriendName.class, "1")) {
          return;
       }
       b.b().c(this, OpenFriendName.class);
       return;
    }
}
