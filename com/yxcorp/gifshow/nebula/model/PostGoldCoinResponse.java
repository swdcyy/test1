package com.yxcorp.gifshow.nebula.model.PostGoldCoinResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.nebula.model.PostGoldCoinResponse$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PostGoldCoinResponse implements Serializable	// class@002151
{
    public final int amount;
    public final boolean hasRemaining;
    public static final PostGoldCoinResponse$a Companion;
    public static final long serialVersionUID;

    static {
       PostGoldCoinResponse.Companion = new PostGoldCoinResponse$a(null);
    }
    public void PostGoldCoinResponse(){
       super(0, 0, 3, null);
    }
    public void PostGoldCoinResponse(int p0,boolean p1){
       super();
       this.amount = p0;
       this.hasRemaining = p1;
    }
    public void PostGoldCoinResponse(int p0,boolean p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = 0;
       }
       if (p2 & 0x02) {
          p1 = false;
       }
       super(p0, p1);
       return;
    }
    public static PostGoldCoinResponse copy$default(PostGoldCoinResponse p0,int p1,boolean p2,int p3,Object p4){
       PostGoldCoinResponse amount;
       PostGoldCoinResponse hasRemaining;
       if (p3 & 0x01) {
          amount = p0.amount;
       }
       if (p3 & 0x02) {
          hasRemaining = p0.hasRemaining;
       }
       return p0.copy(amount, hasRemaining);
    }
    public final int component1(){
       return this.amount;
    }
    public final boolean component2(){
       return this.hasRemaining;
    }
    public final PostGoldCoinResponse copy(int p0,boolean p1){
       if (PatchProxy.isSupport(PostGoldCoinResponse.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, PostGoldCoinResponse.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new PostGoldCoinResponse(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof PostGoldCoinResponse && (this.amount == p0.amount && this.hasRemaining == p0.hasRemaining))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, PostGoldCoinResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.amount * 31;
       PostGoldCoinResponse thasRemainin = this.hasRemaining;
       if (thasRemainin != null) {
          thasRemainin = 1;
       }
       return (i + thasRemainin);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PostGoldCoinResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PostGoldCoinResponse\(amount="+this.amount+", hasRemaining="+this.hasRemaining+"\)";
    }
}
