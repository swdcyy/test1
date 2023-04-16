package com.kwai.component.photo.detail.slide.cocreate.utils.CoCreateSelectUserInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Number;

public class CoCreateSelectUserInfo implements Serializable	// class@000a4b
{
    public User mUser;
    public int roleType;
    public static final long serialVersionUID = 0x5160277dff2a3fbc;

    public void CoCreateSelectUserInfo(){
       super();
    }
    public void CoCreateSelectUserInfo(User p0,int p1){
       super();
       this.mUser = p0;
       this.roleType = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CoCreateSelectUserInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       return Objects.equals(this.mUser, p0.mUser);
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, CoCreateSelectUserInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mUser};
       return Objects.hash(obj);
    }
}
