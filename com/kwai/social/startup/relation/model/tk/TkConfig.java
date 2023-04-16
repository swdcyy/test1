package com.kwai.social.startup.relation.model.tk.TkConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.util.List;
import com.kwai.social.startup.relation.model.tk.ViewConfig;

public class TkConfig implements Serializable	// class@0018bb
{
    public String bundleId;
    public String scene;
    public List viewConfig;
    public static final long serialVersionUID = 0x9db4da1fcf14dd7d;

    public void TkConfig(){
       super();
    }
    public String getViewConfigString(){
       StringBuilder obj = PatchProxy.apply(null, this, TkConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       Iterator iterator = this.viewConfig.iterator();
       while (iterator.hasNext()) {
          obj = obj+iterator.next().toString();
       }
       return obj;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TkConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TkConfig{scene=\'"+this.scene+'''+", bundleId=\'"+this.bundleId+'''+", viewConfig="+this.getViewConfigString()+'}';
    }
}
