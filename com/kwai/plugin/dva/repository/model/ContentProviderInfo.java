package com.kwai.plugin.dva.repository.model.ContentProviderInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class ContentProviderInfo	// class@001378
{
    public final String authorities;
    public final boolean multiprocess;
    public final String name;
    public final String process;

    public void ContentProviderInfo(String p0,String p1,String p2,boolean p3){
       super();
       this.name = p0;
       this.authorities = p1;
       this.multiprocess = p3;
       this.process = p2;
    }
    public String toString(){
       Object[] obj = PatchProxy.apply(null, this, ContentProviderInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[]{this.name,this.authorities,this.process,Boolean.valueOf(this.multiprocess)};
       return String.format("{name=%s, authorities=%s, process=%s multiprocess=%b}", obj);
    }
}
