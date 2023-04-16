package com.kwai.plugin.dva.repository.model.ServiceInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class ServiceInfo	// class@00137c
{
    public final String name;
    public final String process;

    public void ServiceInfo(String p0,String p1){
       super();
       this.name = p0;
       this.process = p1;
    }
    public String toString(){
       Object[] obj = PatchProxy.apply(null, this, ServiceInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[]{this.name,this.process};
       return String.format("{name=%s, process=%s}", obj);
    }
}
