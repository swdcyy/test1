package com.yxcorp.gifshow.ad.response.TvcResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.response.TvcResponse$a;
import nsd.u;
import com.yxcorp.gifshow.ad.response.TvcFeedData;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class TvcResponse implements Serializable	// class@0017ee
{
    public final TvcFeedData data;
    public final String llsid;
    public static final TvcResponse$a Companion;
    public static final long serialVersionUID;

    static {
       TvcResponse.Companion = new TvcResponse$a(null);
    }
    public void TvcResponse(TvcFeedData p0,String p1){
       super();
       this.data = p0;
       this.llsid = p1;
    }
    public static TvcResponse copy$default(TvcResponse p0,TvcFeedData p1,String p2,int p3,Object p4){
       TvcResponse data;
       TvcResponse llsid;
       if (p3 & 0x01) {
          data = p0.data;
       }
       if (p3 & 0x02) {
          llsid = p0.llsid;
       }
       return p0.copy(data, llsid);
    }
    public final TvcFeedData component1(){
       return this.data;
    }
    public final String component2(){
       return this.llsid;
    }
    public final TvcResponse copy(TvcFeedData p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, TvcResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TvcResponse(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TvcResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof TvcResponse && (a.g(this.data, p0.data) && a.g(this.llsid, p0.llsid)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       TvcResponse obj = PatchProxy.apply(null, this, TvcResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.data;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       TvcResponse tllsid = this.llsid;
       if (tllsid != null) {
          i = tllsid.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TvcResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TvcResponse\(data="+this.data+", llsid="+this.llsid+"\)";
    }
}
