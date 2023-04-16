package com.kwai.plugin.dva.feature.core.repository.config.FeatureInfo;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import java.util.ArrayList;
import com.kwai.plugin.dva.feature.core.repository.config.LibData;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.plugin.dva.feature.core.repository.config.ApkData;
import java.lang.RuntimeException;
import com.kwai.plugin.dva.util.CpuAbiUtils;
import java.lang.Number;
import java.lang.StringBuilder;

public final class FeatureInfo	// class@001328
{
    public final List apkData;
    public final String applicationName;
    public final boolean bothAssetAndCDN;
    public final boolean builtIn;
    public final List dependencies;
    public final int dexNumber;
    public final List libData;
    public final int minSdkVersion;
    public final boolean onDemand;
    public List primaryApkDataList;
    public LibData primaryLibData;
    public final String splitName;
    public final String version;
    public final List workProcesses;

    public void FeatureInfo(List p0,String p1,boolean p2,List p3,int p4,List p5,int p6,boolean p7,boolean p8,String p9,String p10,List p11){
       a.p(p1, "applicationName");
       a.p(p9, "splitName");
       a.p(p10, "version");
       super();
       this.apkData = p0;
       this.applicationName = p1;
       this.builtIn = p2;
       this.dependencies = p3;
       this.dexNumber = p4;
       this.libData = p5;
       this.minSdkVersion = p6;
       this.onDemand = p7;
       this.bothAssetAndCDN = p8;
       this.splitName = p9;
       this.version = p10;
       this.workProcesses = p11;
    }
    public static FeatureInfo copy$default(FeatureInfo p0,List p1,String p2,boolean p3,List p4,int p5,List p6,int p7,boolean p8,boolean p9,String p10,String p11,List p12,int p13,Object p14){
       FeatureInfo uFeatureInfo = p0;
       int i = p13;
       FeatureInfo apkData = (i & 0x01)? uFeatureInfo.apkData: p1;
       FeatureInfo applicationN = (i & 0x02)? uFeatureInfo.applicationName: p2;
       FeatureInfo builtIn = (i & 0x04)? uFeatureInfo.builtIn: p3;
       FeatureInfo dependencies = (i & 0x08)? uFeatureInfo.dependencies: p4;
       FeatureInfo dexNumber = (i & 0x10)? uFeatureInfo.dexNumber: p5;
       FeatureInfo libData = (i & 0x20)? uFeatureInfo.libData: p6;
       FeatureInfo minSdkVersio = (i & 0x40)? uFeatureInfo.minSdkVersion: p7;
       FeatureInfo onDemand = (i & 0x0080)? uFeatureInfo.onDemand: p8;
       FeatureInfo bothAssetAnd = (i & 0x0100)? uFeatureInfo.bothAssetAndCDN: p9;
       FeatureInfo splitName = (i & 0x0200)? uFeatureInfo.splitName: p10;
       FeatureInfo version = (i & 0x0400)? uFeatureInfo.version: p11;
       FeatureInfo workProcesse = (i & 0x0800)? uFeatureInfo.workProcesses: p12;
       return p0.copy(apkData, applicationN, builtIn, dependencies, dexNumber, libData, minSdkVersio, onDemand, bothAssetAnd, splitName, version, workProcesse);
    }
    public final List component1(){
       return this.apkData;
    }
    public final String component10(){
       return this.splitName;
    }
    public final String component11(){
       return this.version;
    }
    public final List component12(){
       return this.workProcesses;
    }
    public final String component2(){
       return this.applicationName;
    }
    public final boolean component3(){
       return this.builtIn;
    }
    public final List component4(){
       return this.dependencies;
    }
    public final int component5(){
       return this.dexNumber;
    }
    public final List component6(){
       return this.libData;
    }
    public final int component7(){
       return this.minSdkVersion;
    }
    public final boolean component8(){
       return this.onDemand;
    }
    public final boolean component9(){
       return this.bothAssetAndCDN;
    }
    public final FeatureInfo copy(List p0,String p1,boolean p2,List p3,int p4,List p5,int p6,boolean p7,boolean p8,String p9,String p10,List p11){
       object oobject = p1;
       object oobject1 = p9;
       object oobject2 = p10;
       FeatureInfo uFeatureInfo = FeatureInfo.class;
       if (PatchProxy.isSupport(uFeatureInfo)) {
          Object[] objArray = new Object[12];
          objArray[0] = p0;
          objArray[1] = oobject;
          objArray[2] = Boolean.valueOf(p2);
          objArray[3] = p3;
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = p5;
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Boolean.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = oobject1;
          objArray[10] = oobject2;
          objArray[11] = p11;
          Object obj = PatchProxy.apply(objArray, this, uFeatureInfo, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "applicationName");
       a.p(oobject1, "splitName");
       a.p(oobject2, "version");
       uFeatureInfo = new FeatureInfo(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
       return v14;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FeatureInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof FeatureInfo) {
          return false;
       }
       if (!a.g(this.apkData, p0.apkData)) {
          return false;
       }
       if (!a.g(this.applicationName, p0.applicationName)) {
          return false;
       }
       if (this.builtIn != p0.builtIn) {
          return false;
       }
       if (!a.g(this.dependencies, p0.dependencies)) {
          return false;
       }
       if (this.dexNumber != p0.dexNumber) {
          return false;
       }
       if (!a.g(this.libData, p0.libData)) {
          return false;
       }
       if (this.minSdkVersion != p0.minSdkVersion) {
          return false;
       }
       if (this.onDemand != p0.onDemand) {
          return false;
       }
       if (this.bothAssetAndCDN != p0.bothAssetAndCDN) {
          return false;
       }
       if (!a.g(this.splitName, p0.splitName)) {
          return false;
       }
       if (!a.g(this.version, p0.version)) {
          return false;
       }
       if (!a.g(this.workProcesses, p0.workProcesses)) {
          return false;
       }
       return true;
    }
    public final List getApkDataList(Context p0){
       List primaryApkDa;
       FeatureInfo obj = PatchProxy.applyOneRefs(p0, this, FeatureInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       obj = this.primaryApkDataList;
       if (obj != null) {
          return obj;
       }
       this.primaryApkDataList = new ArrayList();
       LibData primaryLibDa = this.getPrimaryLibData(p0);
       obj = this.apkData;
       if (obj != null) {
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             ApkData uApkData = iterator.next();
             if (a.g(uApkData.getAbi(), "master")) {
                primaryApkDa = this.getPrimaryApkDataList();
                if (primaryApkDa != null) {
                   primaryApkDa.add(uApkData);
                }
             }
             if (primaryLibDa != null && a.g(primaryLibDa.getAbi(), uApkData.getAbi())) {
                primaryApkDa = this.getPrimaryApkDataList();
                if (primaryApkDa == null) {
                   continue ;
                }
             }
             primaryApkDa.add(uApkData);
          }
       }
       if (primaryLibDa != null) {
          obj = this.primaryApkDataList;
          RuntimeException runtimeExcep = (obj == null)? null: obj.size();
          if (runtimeExcep <= 1) {
             throw new RuntimeException(a.C("Unable to find split config apk for abi", primaryLibDa.getAbi()));
          }
       }
       return this.primaryApkDataList;
    }
    public final String getApplicationName(){
       return this.applicationName;
    }
    public final boolean getBothAssetAndCDN(){
       return this.bothAssetAndCDN;
    }
    public final boolean getBuiltIn(){
       return this.builtIn;
    }
    public final List getDependencies(){
       return this.dependencies;
    }
    public final int getDexNumber(){
       return this.dexNumber;
    }
    public final List getLibData(){
       return this.libData;
    }
    public final int getMinSdkVersion(){
       return this.minSdkVersion;
    }
    public final boolean getOnDemand(){
       return this.onDemand;
    }
    public final List getPrimaryApkDataList(){
       return this.primaryApkDataList;
    }
    public final LibData getPrimaryLibData(){
       return this.primaryLibData;
    }
    public final LibData getPrimaryLibData(Context p0){
       FeatureInfo obj = PatchProxy.applyOneRefs(p0, this, FeatureInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       obj = this.primaryLibData;
       if (obj != null) {
          return obj;
       }
       if (this.libData == null) {
          return null;
       }
       String str = CpuAbiUtils.a(p0);
       Iterator iterator = this.libData.iterator();
       while (iterator.hasNext()) {
          LibData libData = iterator.next();
          if (a.g(libData.getAbi(), str)) {
             this.setPrimaryLibData(libData);
          }
       }
       return this.primaryLibData;
    }
    public final String getSplitName(){
       return this.splitName;
    }
    public final String getVersion(){
       return this.version;
    }
    public final List getWorkProcesses(){
       return this.workProcesses;
    }
    public int hashCode(){
       FeatureInfo obj = PatchProxy.apply(null, this, FeatureInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.apkData;
       int i = 0;
       int i1 = (obj == null)? 0: obj.hashCode();
       i1 = ((i1 * 31) + (this.applicationName).hashCode()) * 31;
       FeatureInfo tbuiltIn = this.builtIn;
       int i2 = 1;
       if (tbuiltIn != null) {
          tbuiltIn = 1;
       }
       i1 = (i1 + tbuiltIn) * 31;
       tbuiltIn = this.dependencies;
       int i3 = (tbuiltIn == null)? 0: tbuiltIn.hashCode();
       i1 = (((i1 + i3) * 31) + this.dexNumber) * 31;
       tbuiltIn = this.libData;
       i3 = (tbuiltIn == null)? 0: tbuiltIn.hashCode();
       i1 = (((i1 + i3) * 31) + this.minSdkVersion) * 31;
       tbuiltIn = this.onDemand;
       if (tbuiltIn != null) {
          i3 = 1;
       }
       i1 = (i1 + i3) * 31;
       tbuiltIn = this.bothAssetAndCDN;
       if (tbuiltIn == null) {
          i2 = tbuiltIn;
       }
       i1 = (((((i1 + i2) * 31) + (this.splitName).hashCode()) * 31) + (this.version).hashCode()) * 31;
       tbuiltIn = this.workProcesses;
       if (tbuiltIn != null) {
          i = tbuiltIn.hashCode();
       }
       return (i1 + i);
    }
    public final void setPrimaryApkDataList(List p0){
       this.primaryApkDataList = p0;
    }
    public final void setPrimaryLibData(LibData p0){
       this.primaryLibData = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FeatureInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FeatureInfo\(apkData="+this.apkData+", applicationName="+this.applicationName+", builtIn="+this.builtIn+", dependencies="+this.dependencies+", dexNumber="+this.dexNumber+", libData="+this.libData+", minSdkVersion="+this.minSdkVersion+", onDemand="+this.onDemand+", bothAssetAndCDN="+this.bothAssetAndCDN+", splitName="+this.splitName+", version="+this.version+", workProcesses="+this.workProcesses+')';
    }
}
