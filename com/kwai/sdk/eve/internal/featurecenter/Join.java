package com.kwai.sdk.eve.internal.featurecenter.Join;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class Join	// class@0014ef
{
    public final String columnName1;
    public final String columnName2;
    public final String tableName1;
    public final String tableName2;

    public void Join(String p0,String p1,String p2,String p3){
       a.p(p0, "tableName1");
       a.p(p1, "columnName1");
       a.p(p2, "tableName2");
       a.p(p3, "columnName2");
       super();
       this.tableName1 = p0;
       this.columnName1 = p1;
       this.tableName2 = p2;
       this.columnName2 = p3;
    }
    public static Join copy$default(Join p0,String p1,String p2,String p3,String p4,int p5,Object p6){
       Join tableName1;
       Join columnName1;
       Join tableName2;
       Join columnName2;
       if (p5 & 0x01) {
          tableName1 = p0.tableName1;
       }
       if (p5 & 0x02) {
          columnName1 = p0.columnName1;
       }
       if (p5 & 0x04) {
          tableName2 = p0.tableName2;
       }
       if (p5 & 0x08) {
          columnName2 = p0.columnName2;
       }
       return p0.copy(tableName1, columnName1, tableName2, columnName2);
    }
    public final String component1(){
       return this.tableName1;
    }
    public final String component2(){
       return this.columnName1;
    }
    public final String component3(){
       return this.tableName2;
    }
    public final String component4(){
       return this.columnName2;
    }
    public final Join copy(String p0,String p1,String p2,String p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, Join.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "tableName1");
       a.p(p1, "columnName1");
       a.p(p2, "tableName2");
       a.p(p3, "columnName2");
       return new Join(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Join.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof Join && (a.g(this.tableName1, p0.tableName1) && (a.g(this.columnName1, p0.columnName1) && (a.g(this.tableName2, p0.tableName2) && a.g(this.columnName2, p0.columnName2)))))) {
          return true;
       }
       return false;
    }
    public final String getColumnName1(){
       return this.columnName1;
    }
    public final String getColumnName2(){
       return this.columnName2;
    }
    public final String getTableName1(){
       return this.tableName1;
    }
    public final String getTableName2(){
       return this.tableName2;
    }
    public int hashCode(){
       Join obj = PatchProxy.apply(null, this, Join.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.tableName1;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       Join tcolumnName1 = this.columnName1;
       int i2 = (tcolumnName1 != null)? tcolumnName1.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcolumnName1 = this.tableName2;
       i2 = (tcolumnName1 != null)? tcolumnName1.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tcolumnName1 = this.columnName2;
       if (tcolumnName1 != null) {
          i = tcolumnName1.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Join.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Join\(tableName1="+this.tableName1+", columnName1="+this.columnName1+", tableName2="+this.tableName2+", columnName2="+this.columnName2+"\)";
    }
}
