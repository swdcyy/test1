package com.kuaishou.live.core.show.redpacket.richcard.http.ExitRichCardResponseData;
import java.io.Serializable;
import com.kuaishou.live.core.show.redpacket.richcard.http.ExitRichCardResponseData$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ExitRichCardResponseData implements Serializable	// class@000f85
{
    public final int code;
    public final String msg;
    public static final ExitRichCardResponseData$a Companion;
    public static final long serialVersionUID;

    static {
       ExitRichCardResponseData.Companion = new ExitRichCardResponseData$a(null);
    }
    public void ExitRichCardResponseData(int p0,String p1){
       super();
       this.code = p0;
       this.msg = p1;
    }
    public static ExitRichCardResponseData copy$default(ExitRichCardResponseData p0,int p1,String p2,int p3,Object p4){
       ExitRichCardResponseData code;
       ExitRichCardResponseData msg;
       if (p3 & 0x01) {
          code = p0.code;
       }
       if (p3 & 0x02) {
          msg = p0.msg;
       }
       return p0.copy(code, msg);
    }
    public final int component1(){
       return this.code;
    }
    public final String component2(){
       return this.msg;
    }
    public final ExitRichCardResponseData copy(int p0,String p1){
       if (PatchProxy.isSupport(ExitRichCardResponseData.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, ExitRichCardResponseData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new ExitRichCardResponseData(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ExitRichCardResponseData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ExitRichCardResponseData && (this.code == p0.code && a.g(this.msg, p0.msg)))) {
          return true;
       }
       return false;
    }
    public final int getCode(){
       return this.code;
    }
    public final String getMsg(){
       return this.msg;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, ExitRichCardResponseData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.code * 31;
       ExitRichCardResponseData tmsg = this.msg;
       int i1 = (tmsg != null)? tmsg.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ExitRichCardResponseData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ExitRichCardResponseData\(code="+this.code+", msg="+this.msg+"\)";
    }
}
