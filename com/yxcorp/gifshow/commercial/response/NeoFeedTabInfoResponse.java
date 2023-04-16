package com.yxcorp.gifshow.commercial.response.NeoFeedTabInfoResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.commercial.response.NeoFeedTabInfoResponse$a;
import nsd.u;
import com.yxcorp.gifshow.commercial.response.NeoFeedTabInfoData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class NeoFeedTabInfoResponse implements Serializable	// class@00115d
{
    public final NeoFeedTabInfoData mData;
    public static final NeoFeedTabInfoResponse$a Companion;
    public static final long serialVersionUID;

    static {
       NeoFeedTabInfoResponse.Companion = new NeoFeedTabInfoResponse$a(null);
    }
    public void NeoFeedTabInfoResponse(){
       super(null, 1, null);
    }
    public void NeoFeedTabInfoResponse(NeoFeedTabInfoData p0){
       super();
       this.mData = p0;
    }
    public void NeoFeedTabInfoResponse(NeoFeedTabInfoData p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = null;
       }
       super(p0);
       return;
    }
    public static NeoFeedTabInfoResponse copy$default(NeoFeedTabInfoResponse p0,NeoFeedTabInfoData p1,int p2,Object p3){
       NeoFeedTabInfoResponse mData;
       if (p2 & 0x01) {
          mData = p0.mData;
       }
       return p0.copy(mData);
    }
    public final NeoFeedTabInfoData component1(){
       return this.mData;
    }
    public final NeoFeedTabInfoResponse copy(NeoFeedTabInfoData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NeoFeedTabInfoResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new NeoFeedTabInfoResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NeoFeedTabInfoResponse.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof NeoFeedTabInfoResponse && a.g(this.mData, p0.mData))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       NeoFeedTabInfoResponse obj = PatchProxy.apply(null, this, NeoFeedTabInfoResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mData;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public final boolean isValid(){
       NeoFeedTabInfoResponse obj = PatchProxy.apply(null, this, NeoFeedTabInfoResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mData;
       boolean b = (obj != null && obj.isValid())? true: false;
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NeoFeedTabInfoResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NeoFeedTabInfoResponse\(mData="+this.mData+"\)";
    }
}
