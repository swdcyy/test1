package com.kwai.sdk.eve.internal.featurecenter.TableControl;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class TableControl	// class@0014f1
{
    public final int maxRows;
    public final long timeIntervalS;

    public void TableControl(){
       super(0, 0, 3, null);
    }
    public void TableControl(int p0,long p1){
       super();
       this.maxRows = p0;
       this.timeIntervalS = p1;
    }
    public void TableControl(int p0,long p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = 0x186a0;
       }
       if (p2 & 0x02) {
          p1 = 0x93a80;
       }
       super(p0, p1);
       return;
    }
    public static TableControl copy$default(TableControl p0,int p1,long p2,int p3,Object p4){
       TableControl maxRows;
       TableControl timeInterval;
       if (p3 & 0x01) {
          maxRows = p0.maxRows;
       }
       if (p3 & 0x02) {
          timeInterval = p0.timeIntervalS;
       }
       return p0.copy(maxRows, timeInterval);
    }
    public final int component1(){
       return this.maxRows;
    }
    public final long component2(){
       return this.timeIntervalS;
    }
    public final TableControl copy(int p0,long p1){
       TableControl tableControl = TableControl.class;
       if (PatchProxy.isSupport(tableControl)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, tableControl, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new TableControl(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof TableControl && (this.maxRows == p0.maxRows && !this.timeIntervalS - p0.timeIntervalS))) {
          return true;
       }
       return false;
    }
    public final int getMaxRows(){
       return this.maxRows;
    }
    public final long getTimeIntervalS(){
       return this.timeIntervalS;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, TableControl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       TableControl ttimeInterva = this.timeIntervalS;
       return ((this.maxRows * 31) + (int)(ttimeInterva ^ (ttimeInterva >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TableControl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TableControl\(maxRows="+this.maxRows+", timeIntervalS="+this.timeIntervalS+"\)";
    }
}
