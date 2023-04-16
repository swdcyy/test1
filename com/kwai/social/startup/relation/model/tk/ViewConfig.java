package com.kwai.social.startup.relation.model.tk.ViewConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class ViewConfig implements Serializable	// class@0018bc
{
    public int portal;
    public String viewKeys;
    public static final long serialVersionUID = 0x6ced25855c4b4108;

    public void ViewConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ViewConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ViewConfig{portal=\'"+this.portal+'''+", viewKeys=\'"+this.viewKeys+'''+'}';
    }
}
