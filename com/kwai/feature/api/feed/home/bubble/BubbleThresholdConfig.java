package com.kwai.feature.api.feed.home.bubble.BubbleThresholdConfig;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class BubbleThresholdConfig	// class@000eee
{
    public List bubblePriorityIdList;
    public int globalLimit;
    public Map regionBusinessMap;
    public Map regionLimitMap;

    public void BubbleThresholdConfig(){
       super();
       this.globalLimit = 0;
       this.regionLimitMap = null;
       this.regionBusinessMap = null;
       this.bubblePriorityIdList = null;
    }
    public final int a(){
       return this.globalLimit;
    }
    public final Map b(){
       return this.regionLimitMap;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BubbleThresholdConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof BubbleThresholdConfig && (this.globalLimit == p0.globalLimit && (a.g(this.regionLimitMap, p0.regionLimitMap) && (a.g(this.regionBusinessMap, p0.regionBusinessMap) && a.g(this.bubblePriorityIdList, p0.bubblePriorityIdList)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, BubbleThresholdConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.globalLimit * 31;
       BubbleThresholdConfig tregionLimit = this.regionLimitMap;
       int i1 = 0;
       int i2 = (tregionLimit != null)? tregionLimit.hashCode(): 0;
       i = (i + i2) * 31;
       tregionLimit = this.regionBusinessMap;
       i2 = (tregionLimit != null)? tregionLimit.hashCode(): 0;
       i = (i + i2) * 31;
       tregionLimit = this.bubblePriorityIdList;
       if (tregionLimit != null) {
          i1 = tregionLimit.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, BubbleThresholdConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BubbleThresholdConfig\(globalLimit="+this.globalLimit+", regionLimitMap="+this.regionLimitMap+", regionBusinessMap="+this.regionBusinessMap+", bubblePriorityIdList="+this.bubblePriorityIdList+"\)";
    }
}
