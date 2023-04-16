package com.yxcorp.gifshow.ad.response.UploaderTokenResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.response.UploaderTokenResponse$a;
import nsd.u;
import com.yxcorp.gifshow.ad.response.UploaderTokenData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class UploaderTokenResponse implements Serializable	// class@0017f5
{
    public final UploaderTokenData data;
    public static final UploaderTokenResponse$a Companion;
    public static final long serialVersionUID;

    static {
       UploaderTokenResponse.Companion = new UploaderTokenResponse$a(null);
    }
    public void UploaderTokenResponse(){
       super(null, 1, null);
    }
    public void UploaderTokenResponse(UploaderTokenData p0){
       a.p(p0, "data");
       super();
       this.data = p0;
    }
    public void UploaderTokenResponse(UploaderTokenData p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = new UploaderTokenData(null, null, 3, null);
       }
       super(p0);
       return;
    }
    public static UploaderTokenResponse copy$default(UploaderTokenResponse p0,UploaderTokenData p1,int p2,Object p3){
       UploaderTokenResponse data;
       if (p2 & 0x01) {
          data = p0.data;
       }
       return p0.copy(data);
    }
    public final UploaderTokenData component1(){
       return this.data;
    }
    public final UploaderTokenResponse copy(UploaderTokenData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UploaderTokenResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "data");
       return new UploaderTokenResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UploaderTokenResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UploaderTokenResponse && a.g(this.data, p0.data))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       UploaderTokenResponse obj = PatchProxy.apply(null, this, UploaderTokenResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.data;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UploaderTokenResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UploaderTokenResponse\(data="+this.data+"\)";
    }
}
