package com.kwai.plugin.dva.feature.core.repository.config.FeatureDetails;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.plugin.dva.feature.core.repository.config.FeatureInfo;
import qrd.l1;
import java.lang.Number;
import java.lang.StringBuilder;

public final class FeatureDetails	// class@001327
{
    public final String appVersionName;
    public final String featureId;
    public Map innerNameToSplitMap;
    public List splitEntryFragments;
    public List splits;

    public void FeatureDetails(String p0,String p1,List p2,List p3){
       a.p(p0, "appVersionName");
       a.p(p1, "featureId");
       super();
       this.appVersionName = p0;
       this.featureId = p1;
       this.splitEntryFragments = p2;
       this.splits = p3;
    }
    public static FeatureDetails copy$default(FeatureDetails p0,String p1,String p2,List p3,List p4,int p5,Object p6){
       FeatureDetails appVersionNa;
       FeatureDetails uFeatureDeta;
       FeatureDetails splitEntryFr;
       FeatureDetails splits;
       if (p5 & 0x01) {
          appVersionNa = p0.appVersionName;
       }
       if (p5 & 0x02) {
          uFeatureDeta = p0.featureId;
       }
       if (p5 & 0x04) {
          splitEntryFr = p0.splitEntryFragments;
       }
       if (p5 & 0x08) {
          splits = p0.splits;
       }
       return p0.copy(appVersionNa, uFeatureDeta, splitEntryFr, splits);
    }
    public final String component1(){
       return this.appVersionName;
    }
    public final String component2(){
       return this.featureId;
    }
    public final List component3(){
       return this.splitEntryFragments;
    }
    public final List component4(){
       return this.splits;
    }
    public final FeatureDetails copy(String p0,String p1,List p2,List p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, FeatureDetails.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "appVersionName");
       a.p(p1, "featureId");
       return new FeatureDetails(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FeatureDetails.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof FeatureDetails) {
          return false;
       }
       if (!a.g(this.appVersionName, p0.appVersionName)) {
          return false;
       }
       if (!a.g(this.featureId, p0.featureId)) {
          return false;
       }
       if (!a.g(this.splitEntryFragments, p0.splitEntryFragments)) {
          return false;
       }
       if (!a.g(this.splits, p0.splits)) {
          return false;
       }
       return true;
    }
    public final String getAppVersionName(){
       return this.appVersionName;
    }
    public final String getFeatureId(){
       return this.featureId;
    }
    public final Map getInnerNameToSplitMap(){
       return this.innerNameToSplitMap;
    }
    public final Map getNameToSplitMap(){
       HashMap obj = PatchProxy.apply(null, this, FeatureDetails.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.innerNameToSplitMap == null) {
          _monitor_enter(this);
          if (this.getInnerNameToSplitMap() == null) {
             obj = new HashMap();
             List splits = this.getSplits();
             if (splits != null) {
                Iterator iterator = splits.iterator();
                while (iterator.hasNext()) {
                   FeatureInfo uFeatureInfo = iterator.next();
                   obj.put(uFeatureInfo.getSplitName(), uFeatureInfo);
                }
             }
             this.setInnerNameToSplitMap(obj);
          }
          _monitor_exit(this);
       }
       FeatureDetails tinnerNameTo = this.innerNameToSplitMap;
       a.m(tinnerNameTo);
       return tinnerNameTo;
    }
    public final List getSplitEntryFragments(){
       return this.splitEntryFragments;
    }
    public final List getSplits(){
       return this.splits;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, FeatureDetails.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (((this.appVersionName).hashCode() * 31) + (this.featureId).hashCode()) * 31;
       FeatureDetails tsplitEntryF = this.splitEntryFragments;
       int i1 = 0;
       int i2 = (tsplitEntryF == null)? 0: tsplitEntryF.hashCode();
       i = (i + i2) * 31;
       tsplitEntryF = this.splits;
       if (tsplitEntryF != null) {
          i1 = tsplitEntryF.hashCode();
       }
       return (i + i1);
    }
    public final void setInnerNameToSplitMap(Map p0){
       this.innerNameToSplitMap = p0;
    }
    public final void setSplitEntryFragments(List p0){
       this.splitEntryFragments = p0;
    }
    public final void setSplits(List p0){
       this.splits = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FeatureDetails.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FeatureDetails\(appVersionName="+this.appVersionName+", featureId="+this.featureId+", splitEntryFragments="+this.splitEntryFragments+", splits="+this.splits+')';
    }
}
