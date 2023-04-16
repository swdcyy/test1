package com.kwai.framework.model.user.ProfileTabModel$AdBusinessTabInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;
import java.lang.Number;
import java.lang.Integer;

public class ProfileTabModel$AdBusinessTabInfo implements Serializable	// class@001716
{
    public String mName;
    public String mPageId;
    public String mSubName;
    public int mType;
    public static final long serialVersionUID = 0xe888bcd98b6bacba;

    public void ProfileTabModel$AdBusinessTabInfo(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileTabModel$AdBusinessTabInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.mType != p0.mType || !k.a(this.mPageId, p0.mPageId)) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, ProfileTabModel$AdBusinessTabInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mPageId,Integer.valueOf(this.mType)};
       return k.b(obj);
    }
}
