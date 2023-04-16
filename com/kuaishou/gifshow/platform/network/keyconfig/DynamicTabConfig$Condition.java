package com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$Condition;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;
import java.lang.StringBuilder;

public final class DynamicTabConfig$Condition implements Serializable	// class@00085a
{
    public DynamicTabConfig$Tab mBeExecuted;
    public int mCondition;
    public DynamicTabConfig$Tab mExecutor;
    public int mIndex;
    public static final long serialVersionUID = 0xf690f8a724a458de;

    public void DynamicTabConfig$Condition(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DynamicTabConfig$Condition.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || DynamicTabConfig$Condition.class != p0.getClass()) {
          return false;
       }
       if (this.mCondition != p0.mCondition || (this.mIndex != p0.mIndex || (!k.a(this.mExecutor, p0.mExecutor) || !k.a(this.mBeExecuted, p0.mBeExecuted)))) {
          b = false;
       }
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DynamicTabConfig$Condition.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Condition{mCondition=\'"+this.mCondition+'''+", mExecutor="+this.mExecutor+", mBeExecuted=\'"+this.mBeExecuted+'''+", mIndex="+this.mIndex+'}';
    }
}
