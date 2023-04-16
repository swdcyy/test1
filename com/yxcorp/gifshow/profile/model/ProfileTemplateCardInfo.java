package com.yxcorp.gifshow.profile.model.ProfileTemplateCardInfo;
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
import ok.j$b;
import ok.j;

public class ProfileTemplateCardInfo implements Serializable	// class@0013b1
{
    public boolean mEnableMiddleCardManagement;
    public List mProfileTemplateCards;
    public int mTemplateCardShowType;
    public static final long serialVersionUID = 0x655d5cc7c830a6c7;

    public void ProfileTemplateCardInfo(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileTemplateCardInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof ProfileTemplateCardInfo) {
          return false;
       }
       if (this.mTemplateCardShowType != p0.mTemplateCardShowType || !k.a(this.mProfileTemplateCards, p0.mProfileTemplateCards)) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, ProfileTemplateCardInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(this.mTemplateCardShowType),this.mProfileTemplateCards};
       return k.b(obj);
    }
    public String toString(){
       j$b obj = PatchProxy.apply(null, this, ProfileTemplateCardInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = j.b(this);
       obj.a("mTemplateCardShowType", this.mTemplateCardShowType);
       obj.c("mProfileTemplateCards", this.mProfileTemplateCards);
       return obj.toString();
    }
}
