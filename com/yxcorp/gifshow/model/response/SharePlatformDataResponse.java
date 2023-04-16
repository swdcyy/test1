package com.yxcorp.gifshow.model.response.SharePlatformDataResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.Gson;

public class SharePlatformDataResponse implements Serializable	// class@001f62
{
    public String mBatchId;
    public String mShareId;
    public List mSharePlatformList;
    public static final long serialVersionUID = 0x37151b086116380f;

    public void SharePlatformDataResponse(){
       super();
    }
    public String toJson(){
       Object obj = PatchProxy.apply(null, this, SharePlatformDataResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Gson().q(this);
    }
}
