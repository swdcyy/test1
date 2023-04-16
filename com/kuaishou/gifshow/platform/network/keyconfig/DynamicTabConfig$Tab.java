package com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$Tab;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;
import java.lang.StringBuilder;

public final class DynamicTabConfig$Tab implements Serializable	// class@00085e
{
    public String mId;
    public String mType;
    public static final long serialVersionUID = 0x19c595720f50a942;

    public void DynamicTabConfig$Tab(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DynamicTabConfig$Tab.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || DynamicTabConfig$Tab.class != p0.getClass()) {
          return false;
       }
       if (!k.a(this.mId, p0.mId) || !k.a(this.mType, p0.mType)) {
          b = false;
       }
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DynamicTabConfig$Tab.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Tab{mId=\'"+this.mId+'''+", mType=\'"+this.mType+'''+'}';
    }
}
