package com.kuaishou.krn.instance.JsExecutorConfig;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.krn.instance.BaseJsExecutorType$Type;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import ok.k;
import java.lang.StringBuilder;

public class JsExecutorConfig implements Serializable	// class@0008bc
{
    public boolean mIsForceUsed;
    public BaseJsExecutorType$Type mType;
    public static final long serialVersionUID = 0x75e5b71995db4c12;

    public void JsExecutorConfig(){
       super();
       this.mType = BaseJsExecutorType$Type.V8_JIT;
       this.mIsForceUsed = false;
    }
    public void JsExecutorConfig(BaseJsExecutorType$Type p0,boolean p1){
       super();
       this.mType = BaseJsExecutorType$Type.V8_JIT;
       this.mIsForceUsed = false;
       this.mType = p0;
       this.mIsForceUsed = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsExecutorConfig.class, "1");
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
       if (this.mIsForceUsed != p0.mIsForceUsed || this.mType != p0.mType) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, JsExecutorConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mType,Boolean.valueOf(this.mIsForceUsed)};
       return k.b(obj);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsExecutorConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsExecutorConfig{mType="+this.mType+", mIsForceUsed="+this.mIsForceUsed+'}';
    }
}
