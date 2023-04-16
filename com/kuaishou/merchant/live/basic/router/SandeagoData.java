package com.kuaishou.merchant.live.basic.router.SandeagoData;
import java.io.Serializable;
import com.kuaishou.merchant.live.basic.router.SandeagoData$a;
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

public final class SandeagoData implements Serializable	// class@0018bf
{
    public String mId;
    public int mStock;
    public static final SandeagoData$a Companion;
    public static final long serialVersionUID;

    static {
       SandeagoData.Companion = new SandeagoData$a(null);
    }
    public void SandeagoData(String p0,int p1){
       super();
       this.mId = p0;
       this.mStock = p1;
    }
    public static SandeagoData copy$default(SandeagoData p0,String p1,int p2,int p3,Object p4){
       SandeagoData mId;
       SandeagoData mStock;
       if (p3 & 0x01) {
          mId = p0.mId;
       }
       if (p3 & 0x02) {
          mStock = p0.mStock;
       }
       return p0.copy(mId, mStock);
    }
    public final String component1(){
       return this.mId;
    }
    public final int component2(){
       return this.mStock;
    }
    public final SandeagoData copy(String p0,int p1){
       if (PatchProxy.isSupport(SandeagoData.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, SandeagoData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new SandeagoData(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SandeagoData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SandeagoData && (a.g(this.mId, p0.mId) && this.mStock == p0.mStock))) {
          return true;
       }
       return false;
    }
    public final String getMId(){
       return this.mId;
    }
    public final int getMStock(){
       return this.mStock;
    }
    public int hashCode(){
       SandeagoData obj = PatchProxy.apply(null, this, SandeagoData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mId;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((i * 31) + this.mStock);
    }
    public final void setMId(String p0){
       this.mId = p0;
    }
    public final void setMStock(int p0){
       this.mStock = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SandeagoData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SandeagoData\(mId="+this.mId+", mStock="+this.mStock+"\)";
    }
}
