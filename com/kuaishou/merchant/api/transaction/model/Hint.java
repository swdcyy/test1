package com.kuaishou.merchant.api.transaction.model.Hint;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class Hint	// class@00157c
{
    public final long mBubbleDuration;
    public final int mHintLevel;
    public final String mPromotionHint;

    public void Hint(){
       super(null, 0, 0, 7, null);
    }
    public void Hint(String p0,int p1,long p2){
       a.p(p0, "mPromotionHint");
       super();
       this.mPromotionHint = p0;
       this.mHintLevel = p1;
       this.mBubbleDuration = p2;
    }
    public void Hint(String p0,int p1,long p2,int p3,u p4){
       p0 = (p3 & 0x01)? "": null;
       if (p3 & 0x02) {
          p1 = 0;
       }
       if (p3 & 0x04) {
          p2 = 5000;
       }
       super(p0, p1, p2);
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Hint.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof Hint && (a.g(this.mPromotionHint, p0.mPromotionHint) && (this.mHintLevel == p0.mHintLevel && !this.mBubbleDuration - p0.mBubbleDuration)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Hint obj = PatchProxy.apply(null, this, Hint.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mPromotionHint;
       int i = (obj != null)? obj.hashCode(): 0;
       Hint tmBubbleDura = this.mBubbleDuration;
       return ((((i * 31) + this.mHintLevel) * 31) + (int)(tmBubbleDura ^ (tmBubbleDura >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Hint.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Hint\(mPromotionHint="+this.mPromotionHint+", mHintLevel="+this.mHintLevel+", mBubbleDuration="+this.mBubbleDuration+"\)";
    }
}
