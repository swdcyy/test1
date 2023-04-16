package com.kuaishou.live.jsbridge.LiveJsCommandResultWithCode;
import java.io.Serializable;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsCommandResultWithCode implements Serializable	// class@001d1f
{
    public final Object data;
    public final String error;
    public final String errorMsg;
    public final Integer result;

    public void LiveJsCommandResultWithCode(Integer p0,Object p1,String p2,String p3){
       super();
       this.result = p0;
       this.data = p1;
       this.error = p2;
       this.errorMsg = p3;
    }
    public void LiveJsCommandResultWithCode(Integer p0,Object p1,String p2,String p3,int p4,u p5){
       if (p4 & 0x02) {
          p1 = null;
       }
       if (p4 & 0x04) {
          p2 = null;
       }
       if (p4 & 0x08) {
          p3 = null;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public static LiveJsCommandResultWithCode copy$default(LiveJsCommandResultWithCode p0,Integer p1,Object p2,String p3,String p4,int p5,Object p6){
       LiveJsCommandResultWithCode result;
       LiveJsCommandResultWithCode error;
       LiveJsCommandResultWithCode errorMsg;
       if (p5 & 0x01) {
          result = p0.result;
       }
       if (p5 & 0x02) {
          p2 = p0.data;
       }
       if (p5 & 0x04) {
          error = p0.error;
       }
       if (p5 & 0x08) {
          errorMsg = p0.errorMsg;
       }
       return p0.copy(result, p2, error, errorMsg);
    }
    public final Integer component1(){
       return this.result;
    }
    public final Object component2(){
       return this.data;
    }
    public final String component3(){
       return this.error;
    }
    public final String component4(){
       return this.errorMsg;
    }
    public final LiveJsCommandResultWithCode copy(Integer p0,Object p1,String p2,String p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, LiveJsCommandResultWithCode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveJsCommandResultWithCode(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsCommandResultWithCode.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsCommandResultWithCode && (a.g(this.result, p0.result) && (a.g(this.data, p0.data) && (a.g(this.error, p0.error) && a.g(this.errorMsg, p0.errorMsg)))))) {
          return true;
       }
       return false;
    }
    public final Object getData(){
       return this.data;
    }
    public final String getError(){
       return this.error;
    }
    public final String getErrorMsg(){
       return this.errorMsg;
    }
    public final Integer getResult(){
       return this.result;
    }
    public int hashCode(){
       LiveJsCommandResultWithCode obj = PatchProxy.apply(null, this, LiveJsCommandResultWithCode.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.result;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveJsCommandResultWithCode tdata = this.data;
       int i2 = (tdata != null)? tdata.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdata = this.error;
       i2 = (tdata != null)? tdata.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdata = this.errorMsg;
       if (tdata != null) {
          i = tdata.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsCommandResultWithCode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveJsCommandResultWithCode\(result="+this.result+", data="+this.data+", error="+this.error+", errorMsg="+this.errorMsg+"\)";
    }
}
