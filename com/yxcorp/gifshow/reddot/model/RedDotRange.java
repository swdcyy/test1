package com.yxcorp.gifshow.reddot.model.RedDotRange;
import java.io.Serializable;
import java.lang.Comparable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;
import java.lang.Number;
import java.lang.StringBuilder;

public final class RedDotRange implements Serializable, Comparable	// class@0017d4
{
    public int mEnd;
    public String mRangeType;
    public int mStart;
    public List mValues;
    public static final long serialVersionUID = 0x88fd86f34295e33d;

    public void RedDotRange(){
       super();
    }
    public static RedDotRange of(String p0,int p1,int p2){
       RedDotRange obj;
       if (PatchProxy.isSupport(RedDotRange.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, RedDotRange.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new RedDotRange();
       obj.mRangeType = p0;
       obj.mStart = p1;
       obj.mEnd = p2;
       return obj;
    }
    public int compareTo(RedDotRange p0){
       if (this.mStart < p0.mStart) {
          return -1;
       }
       if (this.mEnd > p0.mEnd) {
          return 1;
       }
       return 0;
    }
    public int compareTo(Object p0){
       return this.compareTo(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RedDotRange.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || RedDotRange.class != p0.getClass()) {
          return false;
       }
       if (this.mStart != p0.mStart || (this.mEnd != p0.mEnd || (!k.a(this.mRangeType, p0.mRangeType) || !k.a(this.mValues, p0.mValues)))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, RedDotRange.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mRangeType,Integer.valueOf(this.mStart),Integer.valueOf(this.mEnd),this.mValues};
       return k.b(obj);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RedDotRange.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RedDotRange{mRangeType=\'"+this.mRangeType+'''+", mStart="+this.mStart+", mEnd="+this.mEnd+'}';
    }
}
