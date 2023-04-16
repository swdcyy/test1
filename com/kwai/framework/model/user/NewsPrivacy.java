package com.kwai.framework.model.user.NewsPrivacy;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Integer;
import ab.d;

public class NewsPrivacy implements Serializable	// class@00170a
{
    public int mBandedUserCount;
    public int mNewsPrivacyType;
    public static final long serialVersionUID = 0xa70a18fa23a7d694;

    public void NewsPrivacy(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NewsPrivacy.class, "1");
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
       if (this.mNewsPrivacyType != p0.mNewsPrivacyType || this.mBandedUserCount != p0.mBandedUserCount) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, NewsPrivacy.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(this.mNewsPrivacyType),Integer.valueOf(this.mBandedUserCount)};
       return d.b(obj);
    }
}
