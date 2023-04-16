package com.yxcorp.gifshow.reddot.model.RedDotLogModelExtParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;
import java.lang.Number;
import fg6.a;
import com.google.gson.Gson;

public class RedDotLogModelExtParams implements Serializable	// class@0017d1
{
    public RedDotLogModelExtParams$SocialValue mSocialValue;
    public static final long serialVersionUID = 0x5fbc3d67293f414d;

    public void RedDotLogModelExtParams(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RedDotLogModelExtParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       return k.a(this.mSocialValue, p0.mSocialValue);
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, RedDotLogModelExtParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mSocialValue};
       return k.b(obj);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RedDotLogModelExtParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.q(this);
    }
}
