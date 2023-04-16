package com.kwai.user.base.chat.target.bean.UserPendant;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;

public final class UserPendant implements Serializable	// class@00197c
{
    public String mActionUrl;
    public String mIconUrl;
    public String mSubTitle;
    public static final long serialVersionUID = 0xb2a379abe26175ea;

    public void UserPendant(String p0,String p1,String p2){
       super();
       this.mIconUrl = p0;
       this.mSubTitle = p1;
       this.mActionUrl = p2;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserPendant.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || UserPendant.class != p0.getClass()) {
          return false;
       }
       if (!Objects.equals(this.mIconUrl, p0.mIconUrl) || (!Objects.equals(this.mSubTitle, p0.mSubTitle) || !Objects.equals(this.mActionUrl, p0.mActionUrl))) {
          b = false;
       }
       return b;
    }
}
