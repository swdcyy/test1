package com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$Strategy;
import java.io.Serializable;
import java.lang.Comparable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Boolean;
import ok.k;
import java.lang.StringBuilder;

public final class DynamicTabConfig$Strategy implements Serializable, Comparable	// class@00085d
{
    public List mConditions;
    public DynamicTabConfig$Tab mContainer;
    public int mIndex;
    public int mPriority;
    public int mStrategy;
    public DynamicTabConfig$Tab mTarget;
    public static final long serialVersionUID = 0xdf9c9c5e82607126;

    public void DynamicTabConfig$Strategy(){
       super();
    }
    public int compareTo(DynamicTabConfig$Strategy p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DynamicTabConfig$Strategy.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Integer.compare(this.mPriority, p0.mPriority);
    }
    public int compareTo(Object p0){
       return this.compareTo(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DynamicTabConfig$Strategy.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || DynamicTabConfig$Strategy.class != p0.getClass()) {
          return false;
       }
       if (this.mStrategy != p0.mStrategy || (this.mIndex != p0.mIndex || (this.mPriority != p0.mPriority || (!k.a(this.mTarget, p0.mTarget) || (!k.a(this.mContainer, p0.mContainer) || !k.a(this.mConditions, p0.mConditions)))))) {
          b = false;
       }
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DynamicTabConfig$Strategy.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Strategy{mStrategy=\'"+this.mStrategy+'''+", mIndex="+this.mIndex+", mTarget="+this.mTarget+", mContainer="+this.mContainer+", mConditions="+this.mConditions+", mPriority="+this.mPriority+'}';
    }
}
