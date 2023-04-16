package com.kuaishou.merchant.live.cart.onsale.model.RightContent;
import java.io.Serializable;
import com.kuaishou.merchant.live.cart.onsale.model.RightContent$a;
import nsd.u;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class RightContent implements Serializable	// class@0019b7
{
    public String content;
    public List value;
    public static final RightContent$a Companion;
    public static final long serialVersionUID;

    static {
       RightContent.Companion = new RightContent$a(null);
    }
    public void RightContent(String p0,List p1){
       super();
       this.content = p0;
       this.value = p1;
    }
    public static RightContent copy$default(RightContent p0,String p1,List p2,int p3,Object p4){
       RightContent content;
       RightContent value;
       if (p3 & 0x01) {
          content = p0.content;
       }
       if (p3 & 0x02) {
          value = p0.value;
       }
       return p0.copy(content, value);
    }
    public final String component1(){
       return this.content;
    }
    public final List component2(){
       return this.value;
    }
    public final RightContent copy(String p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, RightContent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RightContent(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RightContent.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RightContent && (a.g(this.content, p0.content) && a.g(this.value, p0.value)))) {
          return true;
       }
       return false;
    }
    public final String getContent(){
       return this.content;
    }
    public final List getValue(){
       return this.value;
    }
    public int hashCode(){
       RightContent obj = PatchProxy.apply(null, this, RightContent.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.content;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       RightContent tvalue = this.value;
       if (tvalue != null) {
          i = tvalue.hashCode();
       }
       return (i1 + i);
    }
    public final void setContent(String p0){
       this.content = p0;
    }
    public final void setValue(List p0){
       this.value = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RightContent.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RightContent\(content="+this.content+", value="+this.value+"\)";
    }
}
