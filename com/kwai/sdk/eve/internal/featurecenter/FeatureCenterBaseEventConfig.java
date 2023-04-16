package com.kwai.sdk.eve.internal.featurecenter.FeatureCenterBaseEventConfig;
import java.lang.Class;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.StringBuilder;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public final class FeatureCenterBaseEventConfig	// class@0014e5
{
    public final String columnPrefix;
    public final Class eventClass;
    public final List indexColumns;
    public final String primaryKey;
    public final String tableName;

    public void FeatureCenterBaseEventConfig(Class p0,String p1,String p2,List p3,String p4){
       a.p(p0, "eventClass");
       a.p(p1, "tableName");
       a.p(p2, "columnPrefix");
       a.p(p3, "indexColumns");
       a.p(p4, "primaryKey");
       super();
       this.eventClass = p0;
       this.tableName = p1;
       this.columnPrefix = p2;
       this.indexColumns = p3;
       this.primaryKey = p4;
    }
    public void FeatureCenterBaseEventConfig(Class p0,String p1,String p2,List p3,String p4,int p5,u p6){
       if (p5 & 0x02) {
          p1 = p0.getSimpleName();
          a.o(p1, "eventClass.simpleName");
       }
       String str = p1;
       if (p5 & 0x04) {
          p2 = p0.getSimpleName()+'_';
       }
       String str1 = p2;
       if (p5 & 0x08) {
          p3 = CollectionsKt__CollectionsKt.E();
       }
       List list = p3;
       if (p5 & 0x10) {
          p4 = "";
       }
       super(p0, str, str1, list, p4);
       return;
    }
    public static FeatureCenterBaseEventConfig copy$default(FeatureCenterBaseEventConfig p0,Class p1,String p2,String p3,List p4,String p5,int p6,Object p7){
       FeatureCenterBaseEventConfig eventClass;
       FeatureCenterBaseEventConfig tableName;
       FeatureCenterBaseEventConfig columnPrefix;
       FeatureCenterBaseEventConfig indexColumns;
       FeatureCenterBaseEventConfig primaryKey;
       if (p6 & 0x01) {
          eventClass = p0.eventClass;
       }
       if (p6 & 0x02) {
          tableName = p0.tableName;
       }
       p7 = tableName;
       if (p6 & 0x04) {
          columnPrefix = p0.columnPrefix;
       }
       FeatureCenterBaseEventConfig uFeatureCent = columnPrefix;
       if (p6 & 0x08) {
          indexColumns = p0.indexColumns;
       }
       FeatureCenterBaseEventConfig uFeatureCent1 = indexColumns;
       if (p6 & 0x10) {
          primaryKey = p0.primaryKey;
       }
       return p0.copy(eventClass, p7, uFeatureCent, uFeatureCent1, primaryKey);
    }
    public final Class component1(){
       return this.eventClass;
    }
    public final String component2(){
       return this.tableName;
    }
    public final String component3(){
       return this.columnPrefix;
    }
    public final List component4(){
       return this.indexColumns;
    }
    public final String component5(){
       return this.primaryKey;
    }
    public final FeatureCenterBaseEventConfig copy(Class p0,String p1,String p2,List p3,String p4){
       Object obj;
       FeatureCenterBaseEventConfig uFeatureCent = FeatureCenterBaseEventConfig.class;
       if (PatchProxy.isSupport(uFeatureCent)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, uFeatureCent, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "eventClass");
       a.p(p1, "tableName");
       a.p(p2, "columnPrefix");
       a.p(p3, "indexColumns");
       a.p(p4, "primaryKey");
       FeatureCenterBaseEventConfig uFeatureCent1 = new FeatureCenterBaseEventConfig(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FeatureCenterBaseEventConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof FeatureCenterBaseEventConfig && (a.g(this.eventClass, p0.eventClass) && (a.g(this.tableName, p0.tableName) && (a.g(this.columnPrefix, p0.columnPrefix) && (a.g(this.indexColumns, p0.indexColumns) && a.g(this.primaryKey, p0.primaryKey))))))) {
          return true;
       }
       return false;
    }
    public final String getColumnPrefix(){
       return this.columnPrefix;
    }
    public final Class getEventClass(){
       return this.eventClass;
    }
    public final List getIndexColumns(){
       return this.indexColumns;
    }
    public final String getPrimaryKey(){
       return this.primaryKey;
    }
    public final String getTableName(){
       return this.tableName;
    }
    public int hashCode(){
       FeatureCenterBaseEventConfig obj = PatchProxy.apply(null, this, FeatureCenterBaseEventConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.eventClass;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       FeatureCenterBaseEventConfig ttableName = this.tableName;
       int i2 = (ttableName != null)? ttableName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttableName = this.columnPrefix;
       i2 = (ttableName != null)? ttableName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttableName = this.indexColumns;
       i2 = (ttableName != null)? ttableName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttableName = this.primaryKey;
       if (ttableName != null) {
          i = ttableName.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FeatureCenterBaseEventConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FeatureCenterBaseEventConfig\(eventClass="+this.eventClass+", tableName="+this.tableName+", columnPrefix="+this.columnPrefix+", indexColumns="+this.indexColumns+", primaryKey="+this.primaryKey+"\)";
    }
}
