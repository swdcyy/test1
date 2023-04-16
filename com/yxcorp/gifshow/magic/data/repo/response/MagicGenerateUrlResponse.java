package com.yxcorp.gifshow.magic.data.repo.response.MagicGenerateUrlResponse;
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

public final class MagicGenerateUrlResponse implements Serializable	// class@001b98
{
    public final List resUrl;

    public void MagicGenerateUrlResponse(List p0){
       super();
       this.resUrl = p0;
    }
    public static MagicGenerateUrlResponse copy$default(MagicGenerateUrlResponse p0,List p1,int p2,Object p3){
       MagicGenerateUrlResponse resUrl;
       if (p2 & 0x01) {
          resUrl = p0.resUrl;
       }
       return p0.copy(resUrl);
    }
    public final List component1(){
       return this.resUrl;
    }
    public final MagicGenerateUrlResponse copy(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MagicGenerateUrlResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MagicGenerateUrlResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MagicGenerateUrlResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MagicGenerateUrlResponse && a.g(this.resUrl, p0.resUrl))) {
          return true;
       }
       return false;
    }
    public final List getResUrl(){
       return this.resUrl;
    }
    public int hashCode(){
       MagicGenerateUrlResponse obj = PatchProxy.apply(null, this, MagicGenerateUrlResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.resUrl;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MagicGenerateUrlResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MagicGenerateUrlResponse\(resUrl="+this.resUrl+"\)";
    }
}
