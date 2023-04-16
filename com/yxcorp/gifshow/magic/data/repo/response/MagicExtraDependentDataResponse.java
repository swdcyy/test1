package com.yxcorp.gifshow.magic.data.repo.response.MagicExtraDependentDataResponse;
import java.io.Serializable;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MagicExtraDependentDataResponse implements Serializable	// class@001b93
{
    public final List data;

    public void MagicExtraDependentDataResponse(List p0){
       super();
       this.data = p0;
    }
    public static MagicExtraDependentDataResponse copy$default(MagicExtraDependentDataResponse p0,List p1,int p2,Object p3){
       MagicExtraDependentDataResponse data;
       if (p2 & 0x01) {
          data = p0.data;
       }
       return p0.copy(data);
    }
    public final List component1(){
       return this.data;
    }
    public final MagicExtraDependentDataResponse copy(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MagicExtraDependentDataResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MagicExtraDependentDataResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MagicExtraDependentDataResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MagicExtraDependentDataResponse && a.g(this.data, p0.data))) {
          return true;
       }
       return false;
    }
    public final List getData(){
       return this.data;
    }
    public int hashCode(){
       MagicExtraDependentDataResponse obj = PatchProxy.apply(null, this, MagicExtraDependentDataResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.data;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MagicExtraDependentDataResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MagicExtraDependentDataResponse\(data="+this.data+"\)";
    }
}
