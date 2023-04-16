package com.kuaishou.bowl.data.center.network.ProtocolRequestBody;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import okhttp3.RequestBody;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.lang.reflect.Type;
import yz7.e;
import java.lang.StringBuilder;
import nv.c;
import okhttp3.MediaType;

public class ProtocolRequestBody implements Serializable	// class@0011f9
{
    public static final long serialVersionUID = 0xc77c2701365ed233;

    public void ProtocolRequestBody(){
       super();
    }
    public static RequestBody getRequestBody(List p0){
       ArrayList uArrayList;
       HashMap obj = PatchProxy.applyOneRefs(p0, null, ProtocolRequestBody.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0 == null) {
          uArrayList = new ArrayList();
       }
       obj.put("components", uArrayList);
       String str = "params="+e.g(obj, Map.class);
       c.f("RequestBody = "+str);
       return RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), str);
    }
}
