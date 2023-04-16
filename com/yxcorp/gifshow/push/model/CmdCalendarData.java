package com.yxcorp.gifshow.push.model.CmdCalendarData;
import java.lang.String;
import java.util.List;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class CmdCalendarData	// class@001683
{
    public final int bizId;
    public final boolean deleteAll;
    public final List deleteIds;
    public final List insertEvent;
    public final String pushBack;

    public void CmdCalendarData(){
       super(null, 0, null, false, null, 31, null);
    }
    public void CmdCalendarData(String p0,int p1,List p2,boolean p3,List p4){
       a.p(p0, "pushBack");
       a.p(p2, "deleteIds");
       a.p(p4, "insertEvent");
       super();
       this.pushBack = p0;
       this.bizId = p1;
       this.deleteIds = p2;
       this.deleteAll = p3;
       this.insertEvent = p4;
    }
    public void CmdCalendarData(String p0,int p1,List p2,boolean p3,List p4,int p5,u p6){
       ArrayList uArrayList;
       ArrayList uArrayList2;
       if (p5 & 0x01) {
          p0 = "";
       }
       int i = 0;
       int i1 = (p5 & 0x02)? 0: p1;
       if (p5 & 0x04) {
          uArrayList = new ArrayList();
       }
       ArrayList uArrayList1 = uArrayList;
       if (!(p5 & 0x08)) {
          i = p3;
       }
       if (p5 & 0x10) {
          uArrayList2 = new ArrayList();
       }
       super(p0, i1, uArrayList1, i, uArrayList2);
       return;
    }
    public static CmdCalendarData copy$default(CmdCalendarData p0,String p1,int p2,List p3,boolean p4,List p5,int p6,Object p7){
       CmdCalendarData pushBack;
       CmdCalendarData bizId;
       CmdCalendarData deleteIds;
       CmdCalendarData deleteAll;
       CmdCalendarData insertEvent;
       if (p6 & 0x01) {
          pushBack = p0.pushBack;
       }
       if (p6 & 0x02) {
          bizId = p0.bizId;
       }
       p7 = bizId;
       if (p6 & 0x04) {
          deleteIds = p0.deleteIds;
       }
       CmdCalendarData uCmdCalendar = deleteIds;
       if (p6 & 0x08) {
          deleteAll = p0.deleteAll;
       }
       CmdCalendarData uCmdCalendar1 = deleteAll;
       if (p6 & 0x10) {
          insertEvent = p0.insertEvent;
       }
       return p0.copy(pushBack, p7, uCmdCalendar, uCmdCalendar1, insertEvent);
    }
    public final String component1(){
       return this.pushBack;
    }
    public final int component2(){
       return this.bizId;
    }
    public final List component3(){
       return this.deleteIds;
    }
    public final boolean component4(){
       return this.deleteAll;
    }
    public final List component5(){
       return this.insertEvent;
    }
    public final CmdCalendarData copy(String p0,int p1,List p2,boolean p3,List p4){
       Object obj;
       CmdCalendarData uCmdCalendar = CmdCalendarData.class;
       if (PatchProxy.isSupport(uCmdCalendar)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,Boolean.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, this, uCmdCalendar, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "pushBack");
       a.p(p2, "deleteIds");
       a.p(p4, "insertEvent");
       CmdCalendarData uCmdCalendar1 = new CmdCalendarData(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CmdCalendarData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CmdCalendarData && (a.g(this.pushBack, p0.pushBack) && (this.bizId == p0.bizId && (a.g(this.deleteIds, p0.deleteIds) && (this.deleteAll == p0.deleteAll && a.g(this.insertEvent, p0.insertEvent))))))) {
          return true;
       }
       return false;
    }
    public final int getBizId(){
       return this.bizId;
    }
    public final boolean getDeleteAll(){
       return this.deleteAll;
    }
    public final List getDeleteIds(){
       return this.deleteIds;
    }
    public final List getInsertEvent(){
       return this.insertEvent;
    }
    public final String getPushBack(){
       return this.pushBack;
    }
    public int hashCode(){
       CmdCalendarData obj = PatchProxy.apply(null, this, CmdCalendarData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.pushBack;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.bizId) * 31;
       CmdCalendarData tdeleteIds = this.deleteIds;
       int i2 = (tdeleteIds != null)? tdeleteIds.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdeleteIds = this.deleteAll;
       if (tdeleteIds != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tdeleteIds = this.insertEvent;
       if (tdeleteIds != null) {
          i = tdeleteIds.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CmdCalendarData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CmdCalendarData\(pushBack="+this.pushBack+", bizId="+this.bizId+", deleteIds="+this.deleteIds+", deleteAll="+this.deleteAll+", insertEvent="+this.insertEvent+"\)";
    }
}
