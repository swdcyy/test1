package com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicRequest;
import java.io.Serializable;
import java.lang.String;
import com.google.gson.JsonObject;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class MagicRequest implements Serializable	// class@000e2e
{
    public final String magicFaceId;
    public final JsonObject requestData;
    public final int requestType;
    public final String seqId;

    public void MagicRequest(int p0,String p1,JsonObject p2,String p3){
       super();
       this.requestType = p0;
       this.seqId = p1;
       this.requestData = p2;
       this.magicFaceId = p3;
    }
    public void MagicRequest(int p0,String p1,JsonObject p2,String p3,int p4,u p5){
       if (p4 & 0x02) {
          p1 = "";
       }
       super(p0, p1, p2, p3);
       return;
    }
    public final String getMagicFaceId(){
       return this.magicFaceId;
    }
    public final JsonObject getRequestData(){
       return this.requestData;
    }
    public final int getRequestType(){
       return this.requestType;
    }
    public final String getSeqId(){
       return this.seqId;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MagicRequest.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MagicRequest\(requestType="+this.requestType+", seqId="+this.seqId+", requestData="+this.requestData+", magicFaceId="+this.magicFaceId+')';
    }
}
