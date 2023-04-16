package com.kwai.sdk.eve.internal.featurecenter.Relation;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class Relation	// class@0014f0
{
    public final String accessoryColumnName;
    public final Class eventClass;
    public final String eventField;

    public void Relation(Class p0,String p1,String p2){
       a.p(p0, "eventClass");
       a.p(p1, "eventField");
       a.p(p2, "accessoryColumnName");
       super();
       this.eventClass = p0;
       this.eventField = p1;
       this.accessoryColumnName = p2;
    }
    public static Relation copy$default(Relation p0,Class p1,String p2,String p3,int p4,Object p5){
       Relation eventClass;
       Relation eventField;
       Relation accessoryCol;
       if (p4 & 0x01) {
          eventClass = p0.eventClass;
       }
       if (p4 & 0x02) {
          eventField = p0.eventField;
       }
       if (p4 & 0x04) {
          accessoryCol = p0.accessoryColumnName;
       }
       return p0.copy(eventClass, eventField, accessoryCol);
    }
    public final Class component1(){
       return this.eventClass;
    }
    public final String component2(){
       return this.eventField;
    }
    public final String component3(){
       return this.accessoryColumnName;
    }
    public final Relation copy(Class p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, Relation.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "eventClass");
       a.p(p1, "eventField");
       a.p(p2, "accessoryColumnName");
       return new Relation(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Relation.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof Relation && (a.g(this.eventClass, p0.eventClass) && (a.g(this.eventField, p0.eventField) && a.g(this.accessoryColumnName, p0.accessoryColumnName))))) {
          return true;
       }
       return false;
    }
    public final String getAccessoryColumnName(){
       return this.accessoryColumnName;
    }
    public final Class getEventClass(){
       return this.eventClass;
    }
    public final String getEventField(){
       return this.eventField;
    }
    public int hashCode(){
       Relation obj = PatchProxy.apply(null, this, Relation.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.eventClass;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       Relation teventField = this.eventField;
       int i2 = (teventField != null)? teventField.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       teventField = this.accessoryColumnName;
       if (teventField != null) {
          i = teventField.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Relation.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Relation\(eventClass="+this.eventClass+", eventField="+this.eventField+", accessoryColumnName="+this.accessoryColumnName+"\)";
    }
}
