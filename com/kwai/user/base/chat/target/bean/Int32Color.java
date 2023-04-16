package com.kwai.user.base.chat.target.bean.Int32Color;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import zf6.k;

public final class Int32Color implements Serializable	// class@001978
{
    public int mDark;
    public int mLight;
    public static final long serialVersionUID = 0xe506e61c3137c484;

    public void Int32Color(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Int32Color.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || Int32Color.class != p0.getClass()) {
          return false;
       }
       if (this.mLight != p0.mLight || this.mDark != p0.mDark) {
          b = false;
       }
       return b;
    }
    public int getColor(){
       Int32Color obj = PatchProxy.apply(null, this, Int32Color.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = (k.d())? this.mDark: this.mLight;
       return obj;
    }
    public boolean isValid(){
       boolean b = (this.mLight != null && this.mDark != null)? true: false;
       return b;
    }
}
