package com.kwai.feature.api.social.message.bridge.model.IMConfig;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class IMConfig implements Serializable	// class@001121
{
    public final String key;
    public final Object value;

    public void IMConfig(String p0,Object p1){
       super();
       this.key = p0;
       this.value = p1;
    }
    public static IMConfig copy$default(IMConfig p0,String p1,Object p2,int p3,Object p4){
       IMConfig key;
       if (p3 & 0x01) {
          key = p0.key;
       }
       if (p3 & 0x02) {
          p2 = p0.value;
       }
       return p0.copy(key, p2);
    }
    public final String component1(){
       return this.key;
    }
    public final Object component2(){
       return this.value;
    }
    public final IMConfig copy(String p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, IMConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new IMConfig(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IMConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof IMConfig && (a.g(this.key, p0.key) && a.g(this.value, p0.value)))) {
          return true;
       }
       return false;
    }
    public final String getKey(){
       return this.key;
    }
    public final Object getValue(){
       return this.value;
    }
    public int hashCode(){
       IMConfig obj = PatchProxy.apply(null, this, IMConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.key;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       IMConfig tvalue = this.value;
       if (tvalue != null) {
          i = tvalue.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, IMConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "IMConfig\(key="+this.key+", value="+this.value+"\)";
    }
}
