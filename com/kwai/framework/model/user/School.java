package com.kwai.framework.model.user.School;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class School implements Serializable	// class@001729
{
    public boolean current;
    public final int schoolId;
    public final String schoolName;
    public final int schoolType;
    public final String tipsName;
    public final long updateTime;

    public void School(String p0,int p1,int p2,long p3,String p4,boolean p5){
       a.p(p0, "schoolName");
       super();
       this.schoolName = p0;
       this.schoolId = p1;
       this.schoolType = p2;
       this.updateTime = p3;
       this.tipsName = p4;
       this.current = p5;
    }
    public void School(String p0,int p1,int p2,long p3,String p4,boolean p5,int p6,u p7){
       int i = 0;
       int i1 = (p6 & 0x02)? 0: p1;
       int i2 = (p6 & 0x04)? 0: p2;
       int i3 = (p6 & 0x08)? 0: p3;
       int i4 = (p6 & 0x10)? 0: p4;
       if (!(p6 & 0x20)) {
          i = p5;
       }
       super(p0, i1, i2, i3, i4, i);
       return;
    }
    public static School copy$default(School p0,String p1,int p2,int p3,long p4,String p5,boolean p6,int p7,Object p8){
       School schoolName;
       School schoolId;
       School schoolType;
       School updateTime;
       School tipsName;
       School current;
       if (p7 & 0x01) {
          schoolName = p0.schoolName;
       }
       if (p7 & 0x02) {
          schoolId = p0.schoolId;
       }
       p8 = schoolId;
       if (p7 & 0x04) {
          schoolType = p0.schoolType;
       }
       School school = schoolType;
       if (p7 & 0x08) {
          updateTime = p0.updateTime;
       }
       School school1 = updateTime;
       if (p7 & 0x10) {
          tipsName = p0.tipsName;
       }
       School school2 = tipsName;
       if (p7 & 0x20) {
          current = p0.current;
       }
       return p0.copy(schoolName, p8, school, school1, school2, current);
    }
    public final String component1(){
       return this.schoolName;
    }
    public final int component2(){
       return this.schoolId;
    }
    public final int component3(){
       return this.schoolType;
    }
    public final long component4(){
       return this.updateTime;
    }
    public final String component5(){
       return this.tipsName;
    }
    public final boolean component6(){
       return this.current;
    }
    public final School copy(String p0,int p1,int p2,long p3,String p4,boolean p5){
       School obj;
       object oobject = p0;
       if (PatchProxy.isSupport(School.class)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),Integer.valueOf(p2),Long.valueOf(p3),p4,Boolean.valueOf(p5)};
          obj = PatchProxy.apply(objArray, this, School.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p0, "schoolName");
       obj = new School(p0, p1, p2, p3, p4, p5);
       return v9;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, School.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof School && (a.g(this.schoolName, p0.schoolName) && (this.schoolId == p0.schoolId && (this.schoolType == p0.schoolType && (!this.updateTime - p0.updateTime && (a.g(this.tipsName, p0.tipsName) && this.current == p0.current))))))) {
          return true;
       }
       return false;
    }
    public final boolean getCurrent(){
       return this.current;
    }
    public final int getSchoolId(){
       return this.schoolId;
    }
    public final String getSchoolName(){
       return this.schoolName;
    }
    public final int getSchoolType(){
       return this.schoolType;
    }
    public final String getTipsName(){
       return this.tipsName;
    }
    public final long getUpdateTime(){
       return this.updateTime;
    }
    public int hashCode(){
       School obj = PatchProxy.apply(null, this, School.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.schoolName;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       School tupdateTime = this.updateTime;
       i1 = ((((((i1 * 31) + this.schoolId) * 31) + this.schoolType) * 31) + (int)(tupdateTime ^ (tupdateTime >> 32))) * 31;
       tupdateTime = this.tipsName;
       if (tupdateTime != null) {
          i = tupdateTime.hashCode();
       }
       i1 = (i1 + i) * 31;
       School tcurrent = this.current;
       if (tcurrent != null) {
          tcurrent = 1;
       }
       return (i1 + tcurrent);
    }
    public final void setCurrent(boolean p0){
       this.current = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, School.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "School\(schoolName="+this.schoolName+", schoolId="+this.schoolId+", schoolType="+this.schoolType+", updateTime="+this.updateTime+", tipsName="+this.tipsName+", current="+this.current+"\)";
    }
}
