package com.kwai.user.base.chat.target.bean.WhatsUpButton;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Long;
import java.util.Objects;

public class WhatsUpButton implements Serializable	// class@001980
{
    public long mDeadline;
    public int mStatus;
    public static final long serialVersionUID = 0x4673f2e2dd036413;

    public void WhatsUpButton(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WhatsUpButton.class, "1");
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
       if (this.mStatus != p0.mStatus || this.mDeadline - p0.mDeadline) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, WhatsUpButton.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(this.mStatus),Long.valueOf(this.mDeadline)};
       return Objects.hash(obj);
    }
}
