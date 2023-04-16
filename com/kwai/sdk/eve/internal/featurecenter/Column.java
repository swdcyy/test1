package com.kwai.sdk.eve.internal.featurecenter.Column;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class Column	// class@0014c8
{
    public final boolean createIndex;
    public final String name;
    public final boolean primaryKey;
    public final String sqlDataType;

    public void Column(String p0,String p1,boolean p2,boolean p3){
       a.p(p0, "name");
       a.p(p1, "sqlDataType");
       super();
       this.name = p0;
       this.sqlDataType = p1;
       this.createIndex = p2;
       this.primaryKey = p3;
    }
    public void Column(String p0,String p1,boolean p2,boolean p3,int p4,u p5){
       if (p4 & 0x04) {
          p2 = false;
       }
       if (p4 & 0x08) {
          p3 = false;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public static Column copy$default(Column p0,String p1,String p2,boolean p3,boolean p4,int p5,Object p6){
       Column name;
       Column sqlDataType;
       Column createIndex;
       Column primaryKey;
       if (p5 & 0x01) {
          name = p0.name;
       }
       if (p5 & 0x02) {
          sqlDataType = p0.sqlDataType;
       }
       if (p5 & 0x04) {
          createIndex = p0.createIndex;
       }
       if (p5 & 0x08) {
          primaryKey = p0.primaryKey;
       }
       return p0.copy(name, sqlDataType, createIndex, primaryKey);
    }
    public final String component1$eve_core_release(){
       return this.name;
    }
    public final String component2$eve_core_release(){
       return this.sqlDataType;
    }
    public final boolean component3$eve_core_release(){
       return this.createIndex;
    }
    public final boolean component4$eve_core_release(){
       return this.primaryKey;
    }
    public final Column copy(String p0,String p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(Column.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, Column.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "name");
       a.p(p1, "sqlDataType");
       return new Column(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Column.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof Column && (a.g(this.name, p0.name) && (a.g(this.sqlDataType, p0.sqlDataType) && (this.createIndex == p0.createIndex && this.primaryKey == p0.primaryKey))))) {
          return true;
       }
       return false;
    }
    public final boolean getCreateIndex$eve_core_release(){
       return this.createIndex;
    }
    public final String getName$eve_core_release(){
       return this.name;
    }
    public final boolean getPrimaryKey$eve_core_release(){
       return this.primaryKey;
    }
    public final String getSqlDataType$eve_core_release(){
       return this.sqlDataType;
    }
    public int hashCode(){
       Column obj = PatchProxy.apply(null, this, Column.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.name;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       Column tsqlDataType = this.sqlDataType;
       if (tsqlDataType != null) {
          i = tsqlDataType.hashCode();
       }
       i1 = (i1 + i) * 31;
       Column tcreateIndex = this.createIndex;
       int i2 = 1;
       if (tcreateIndex != null) {
          tcreateIndex = 1;
       }
       i1 = (i1 + tcreateIndex) * 31;
       tcreateIndex = this.primaryKey;
       if (tcreateIndex == null) {
          i2 = tcreateIndex;
       }
       return (i1 + i2);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Column.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Column\(name="+this.name+", sqlDataType="+this.sqlDataType+", createIndex="+this.createIndex+", primaryKey="+this.primaryKey+"\)";
    }
}
