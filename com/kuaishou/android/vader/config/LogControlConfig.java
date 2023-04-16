package com.kuaishou.android.vader.config.LogControlConfig;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class LogControlConfig	// class@000712
{
    public List rules;

    public void LogControlConfig(){
       super();
       this.rules = new ArrayList();
    }
    public List getRules(){
       ArrayList uArrayList;
       LogControlConfig obj = PatchProxy.apply(null, this, LogControlConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.rules;
       if (obj == null) {
          uArrayList = new ArrayList();
       }
       return uArrayList;
    }
}
