package com.kwai.plugin.dva.repository.model.ActivityInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;

public class ActivityInfo	// class@001375
{
    public final String name;
    public final String process;
    public final int theme;

    public void ActivityInfo(String p0,int p1,String p2){
       super();
       this.name = p0;
       this.theme = p1;
       this.process = p2;
    }
    public String toString(){
       Object[] obj = PatchProxy.apply(null, this, ActivityInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[]{this.name,Integer.valueOf(this.theme),this.process};
       return String.format("{name=%s, theme=%d, process=%s}", obj);
    }
}
