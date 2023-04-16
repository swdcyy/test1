package com.kwai.video.ksuploaderkit.apicenter.ApiResponse;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.video.ksuploaderkit.apicenter.ApiResponse$EndPoint;
import ln.b$a;

public class ApiResponse implements Serializable	// class@00098d
{
    public List endpoints;
    public int fragmentIndex;
    public long fragmentPositionBytes;
    public boolean hadExisted;
    public boolean preferHTTP;
    public int result;
    public String tokenID;

    public void ApiResponse(){
       super();
       this.fragmentIndex = -1;
       this.fragmentPositionBytes = 0;
    }
    public List parseEndPoints(){
       ArrayList obj = PatchProxy.apply(null, this, ApiResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList(this.endpoints.size());
       ApiResponse tendpoints = this.endpoints;
       if (tendpoints != null) {
          Iterator iterator = tendpoints.iterator();
          while (iterator.hasNext()) {
             ApiResponse$EndPoint uEndPoint = iterator.next();
             obj.add(new b$a(uEndPoint.host, uEndPoint.port, uEndPoint.protocol));
          }
       }
       return obj;
    }
}
