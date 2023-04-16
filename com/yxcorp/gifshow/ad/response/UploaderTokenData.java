package com.yxcorp.gifshow.ad.response.UploaderTokenData;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.response.UploaderTokenData$a;
import nsd.u;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class UploaderTokenData implements Serializable	// class@0017f3
{
    public final List uploadEndpoints;
    public final String uploadToken;
    public static final UploaderTokenData$a Companion;
    public static final long serialVersionUID;

    static {
       UploaderTokenData.Companion = new UploaderTokenData$a(null);
    }
    public void UploaderTokenData(){
       super(null, null, 3, null);
    }
    public void UploaderTokenData(List p0,String p1){
       a.p(p0, "uploadEndpoints");
       a.p(p1, "uploadToken");
       super();
       this.uploadEndpoints = p0;
       this.uploadToken = p1;
    }
    public void UploaderTokenData(List p0,String p1,int p2,u p3){
       ArrayList uArrayList;
       if (p2 & 0x01) {
          uArrayList = new ArrayList();
       }
       if (p2 & 0x02) {
          p1 = "";
       }
       super(uArrayList, p1);
       return;
    }
    public static UploaderTokenData copy$default(UploaderTokenData p0,List p1,String p2,int p3,Object p4){
       UploaderTokenData uploadEndpoi;
       UploaderTokenData uploadToken;
       if (p3 & 0x01) {
          uploadEndpoi = p0.uploadEndpoints;
       }
       if (p3 & 0x02) {
          uploadToken = p0.uploadToken;
       }
       return p0.copy(uploadEndpoi, uploadToken);
    }
    public final List component1(){
       return this.uploadEndpoints;
    }
    public final String component2(){
       return this.uploadToken;
    }
    public final UploaderTokenData copy(List p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, UploaderTokenData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "uploadEndpoints");
       a.p(p1, "uploadToken");
       return new UploaderTokenData(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UploaderTokenData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UploaderTokenData && (a.g(this.uploadEndpoints, p0.uploadEndpoints) && a.g(this.uploadToken, p0.uploadToken)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       UploaderTokenData obj = PatchProxy.apply(null, this, UploaderTokenData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.uploadEndpoints;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       UploaderTokenData tuploadToken = this.uploadToken;
       if (tuploadToken != null) {
          i = tuploadToken.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UploaderTokenData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UploaderTokenData\(uploadEndpoints="+this.uploadEndpoints+", uploadToken="+this.uploadToken+"\)";
    }
}
