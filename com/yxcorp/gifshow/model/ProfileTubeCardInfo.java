package com.yxcorp.gifshow.model.ProfileTubeCardInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;
import java.lang.Number;
import ok.j$b;
import ok.j;

public class ProfileTubeCardInfo implements Serializable	// class@001e82
{
    public List mProfileTubeCards;
    public static final long serialVersionUID = 0xd0d56eb5fa924bfc;

    public void ProfileTubeCardInfo(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileTubeCardInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ProfileTubeCardInfo) {
          return false;
       }
       return k.a(this.mProfileTubeCards, p0.mProfileTubeCards);
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, ProfileTubeCardInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mProfileTubeCards};
       return k.b(obj);
    }
    public String toString(){
       j$b obj = PatchProxy.apply(null, this, ProfileTubeCardInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = j.b(this);
       obj.c("tubeCards", this.mProfileTubeCards);
       return obj.toString();
    }
}
