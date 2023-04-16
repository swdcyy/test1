package com.yxcorp.gifshow.ad.download.intercept.InterceptConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;

public class InterceptConfig implements Serializable	// class@00175c
{
    public List applicationList;
    public List hostList;
    public String rom;
    public static final long serialVersionUID = 0xc624933555640ac4;

    public void InterceptConfig(){
       super();
    }
    public boolean isLegal(){
       boolean b;
       InterceptConfig obj = PatchProxy.apply(null, this, InterceptConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.hostList;
       if (obj == null || obj.size() <= 0) {
          obj = this.applicationList;
          if (obj == null || obj.size() <= 0) {
             b = false;
          label_002b :
             return b;
          }
       }
       b = true;
       goto label_002b ;
    }
}
