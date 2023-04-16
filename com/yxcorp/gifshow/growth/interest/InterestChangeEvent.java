package com.yxcorp.gifshow.growth.interest.InterestChangeEvent;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.interest.InterestChangeEvent$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class InterestChangeEvent implements Serializable	// class@0013ba
{
    public final String content;
    public final int type;
    public static final InterestChangeEvent$a Companion;
    public static final long serialVersionUID;

    static {
       InterestChangeEvent.Companion = new InterestChangeEvent$a(null);
    }
    public void InterestChangeEvent(int p0,String p1){
       a.p(p1, "content");
       super();
       this.type = p0;
       this.content = p1;
    }
    public static InterestChangeEvent copy$default(InterestChangeEvent p0,int p1,String p2,int p3,Object p4){
       InterestChangeEvent type;
       InterestChangeEvent content;
       if (p3 & 0x01) {
          type = p0.type;
       }
       if (p3 & 0x02) {
          content = p0.content;
       }
       return p0.copy(type, content);
    }
    public final int component1(){
       return this.type;
    }
    public final String component2(){
       return this.content;
    }
    public final InterestChangeEvent copy(int p0,String p1){
       if (PatchProxy.isSupport(InterestChangeEvent.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, InterestChangeEvent.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "content");
       return new InterestChangeEvent(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, InterestChangeEvent.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof InterestChangeEvent && (this.type == p0.type && a.g(this.content, p0.content)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, InterestChangeEvent.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.type * 31;
       InterestChangeEvent tcontent = this.content;
       int i1 = (tcontent != null)? tcontent.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, InterestChangeEvent.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "InterestChangeEvent\(type="+this.type+", content="+this.content+"\)";
    }
}
