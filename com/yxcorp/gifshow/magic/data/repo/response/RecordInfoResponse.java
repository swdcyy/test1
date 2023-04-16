package com.yxcorp.gifshow.magic.data.repo.response.RecordInfoResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class RecordInfoResponse implements Serializable	// class@001b9d
{
    public String mDataId;
    public String mResult;
    public static final long serialVersionUID = 0xf4b371047710b260;

    public void RecordInfoResponse(){
       super();
    }
    public String getDataId(){
       return this.mDataId;
    }
    public String getResult(){
       return this.mResult;
    }
    public void setDataId(String p0){
       this.mDataId = p0;
    }
    public void setResult(String p0){
       this.mResult = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RecordInfoResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RecordInfoResponse{mResult=\'"+this.mResult+'''+", mDataId=\'"+this.mDataId+'''+'}';
    }
}
