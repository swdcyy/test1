package com.kuaishou.live.sm.LiveServiceInstantiateException;
import java.lang.RuntimeException;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveServiceInstantiateException extends RuntimeException	// class@000f8c
{
    public final Class mClazz;
    public final boolean mFromDependencies;

    public void LiveServiceInstantiateException(Class p0,boolean p1){
       super();
       this.mClazz = p0;
       this.mFromDependencies = p1;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveServiceInstantiateException.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mFromDependencies != null) {
          return "LiveServiceInstantiateException：获取 Service 失败！请检查是否正确配置了 Service 依赖关系："+this.mClazz.getSimpleName();
       }
       return "LiveServiceInstantiateException：创建 Service 失败！请检查是否正确配置了 Service："+this.mClazz.getSimpleName();
    }
}
