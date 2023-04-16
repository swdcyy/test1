package com.kwai.framework.model.user.UserVerifiedDetail;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;
import java.lang.Integer;
import ab.d;

public class UserVerifiedDetail implements Serializable	// class@000be8
{
    public String mDescription;
    public int mIconType;
    public boolean mIsMusician;
    public int mType;
    public static final long serialVersionUID = 0x8a8fd02132c61c8b;

    public void UserVerifiedDetail(){
       super();
       this.mType = 0;
       this.mIconType = 1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserVerifiedDetail.class, "1");
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
       if (this.mType != p0.mType || (this.mIconType != p0.mIconType || (this.mIsMusician != p0.mIsMusician || !TextUtils.equals(this.mDescription, p0.mDescription)))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, UserVerifiedDetail.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(this.mType),this.mDescription,Integer.valueOf(this.mIconType),Boolean.valueOf(this.mIsMusician)};
       return d.b(obj);
    }
}
