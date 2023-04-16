package com.yxcorp.gifshow.push.model.CmdCalendarEvent;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class CmdCalendarEvent	// class@001684
{
    public final String calendarId;
    public final long endTimeMillis;
    public final boolean isAllDay;
    public final String mode;
    public final String remark;
    public final List remindMinuteList;
    public final long startTimeMillis;
    public final String title;

    public void CmdCalendarEvent(String p0,boolean p1,long p2,long p3,List p4,String p5,String p6,String p7){
       a.p(p0, "title");
       a.p(p4, "remindMinuteList");
       a.p(p5, "mode");
       a.p(p6, "remark");
       a.p(p7, "calendarId");
       super();
       this.title = p0;
       this.isAllDay = p1;
       this.startTimeMillis = p2;
       this.endTimeMillis = p3;
       this.remindMinuteList = p4;
       this.mode = p5;
       this.remark = p6;
       this.calendarId = p7;
    }
    public void CmdCalendarEvent(String p0,boolean p1,long p2,long p3,List p4,String p5,String p6,String p7,int p8,u p9){
       int i = p8;
       String str = (i & 0x01)? "": p0;
       boolean b = (i & 0x02)? false: p1;
       int i1 = 0;
       int i2 = (i & 0x04)? i1: p2;
       int i3 = (i & 0x08)? i1: p3;
       ArrayList uArrayList = (i & 0x10)? new ArrayList(): p4;
       String str1 = (i & 0x20)? "NOTICE": p5;
       String str2 = (i & 0x0080)? "": p7;
       super(str, b, i2, i3, uArrayList, str1, p6, str2);
       return;
    }
    public static CmdCalendarEvent copy$default(CmdCalendarEvent p0,String p1,boolean p2,long p3,long p4,List p5,String p6,String p7,String p8,int p9,Object p10){
       CmdCalendarEvent uCmdCalendar = p0;
       int i = p9;
       CmdCalendarEvent title = (i & 0x01)? uCmdCalendar.title: p1;
       CmdCalendarEvent isAllDay = (i & 0x02)? uCmdCalendar.isAllDay: p2;
       CmdCalendarEvent startTimeMil = (i & 0x04)? uCmdCalendar.startTimeMillis: p3;
       CmdCalendarEvent endTimeMilli = (i & 0x08)? uCmdCalendar.endTimeMillis: p4;
       CmdCalendarEvent remindMinute = (i & 0x10)? uCmdCalendar.remindMinuteList: p5;
       CmdCalendarEvent mode = (i & 0x20)? uCmdCalendar.mode: p6;
       CmdCalendarEvent remark = (i & 0x40)? uCmdCalendar.remark: p7;
       CmdCalendarEvent calendarId = (i & 0x0080)? uCmdCalendar.calendarId: p8;
       return p0.copy(title, isAllDay, startTimeMil, endTimeMilli, remindMinute, mode, remark, calendarId);
    }
    public final String component1(){
       return this.title;
    }
    public final boolean component2(){
       return this.isAllDay;
    }
    public final long component3(){
       return this.startTimeMillis;
    }
    public final long component4(){
       return this.endTimeMillis;
    }
    public final List component5(){
       return this.remindMinuteList;
    }
    public final String component6(){
       return this.mode;
    }
    public final String component7(){
       return this.remark;
    }
    public final String component8(){
       return this.calendarId;
    }
    public final CmdCalendarEvent copy(String p0,boolean p1,long p2,long p3,List p4,String p5,String p6,String p7){
       object oobject = p0;
       object oobject1 = p4;
       object oobject2 = p5;
       object oobject3 = p6;
       object oobject4 = p7;
       CmdCalendarEvent uCmdCalendar = CmdCalendarEvent.class;
       if (PatchProxy.isSupport(uCmdCalendar)) {
          Object[] objArray = new Object[]{oobject,Boolean.valueOf(p1),Long.valueOf(p2),Long.valueOf(p3),oobject1,oobject2,oobject3,oobject4};
          Object obj = PatchProxy.apply(objArray, this, uCmdCalendar, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p0, "title");
       a.p(oobject1, "remindMinuteList");
       a.p(oobject2, "mode");
       a.p(oobject3, "remark");
       a.p(oobject4, "calendarId");
       uCmdCalendar = new CmdCalendarEvent(p0, p1, p2, p3, p4, p5, p6, p7);
       return v12;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CmdCalendarEvent.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CmdCalendarEvent && (a.g(this.title, p0.title) && (this.isAllDay == p0.isAllDay && (!this.startTimeMillis - p0.startTimeMillis && (!this.endTimeMillis - p0.endTimeMillis && (a.g(this.remindMinuteList, p0.remindMinuteList) && (a.g(this.mode, p0.mode) && (a.g(this.remark, p0.remark) && a.g(this.calendarId, p0.calendarId)))))))))) {
          return true;
       }
       return false;
    }
    public final String getCalendarId(){
       return this.calendarId;
    }
    public final long getEndTimeMillis(){
       return this.endTimeMillis;
    }
    public final String getMode(){
       return this.mode;
    }
    public final String getRemark(){
       return this.remark;
    }
    public final List getRemindMinuteList(){
       return this.remindMinuteList;
    }
    public final long getStartTimeMillis(){
       return this.startTimeMillis;
    }
    public final String getTitle(){
       return this.title;
    }
    public final boolean hasAlarm(){
       Object obj = PatchProxy.apply(null, this, CmdCalendarEvent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.g(this.mode, "RING");
    }
    public int hashCode(){
       CmdCalendarEvent obj = PatchProxy.apply(null, this, CmdCalendarEvent.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.title;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       CmdCalendarEvent tisAllDay = this.isAllDay;
       if (tisAllDay != null) {
          tisAllDay = 1;
       }
       tisAllDay = this.startTimeMillis;
       tisAllDay = this.endTimeMillis;
       i1 = (((((i1 + tisAllDay) * 31) + (int)(tisAllDay ^ (tisAllDay >> 32))) * 31) + (int)(tisAllDay ^ (tisAllDay >> 32))) * 31;
       tisAllDay = this.remindMinuteList;
       int i2 = (tisAllDay != null)? tisAllDay.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tisAllDay = this.mode;
       i2 = (tisAllDay != null)? tisAllDay.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tisAllDay = this.remark;
       i2 = (tisAllDay != null)? tisAllDay.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tisAllDay = this.calendarId;
       if (tisAllDay != null) {
          i = tisAllDay.hashCode();
       }
       return (i1 + i);
    }
    public final boolean isAllDay(){
       return this.isAllDay;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CmdCalendarEvent.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CmdCalendarEvent\(title="+this.title+", isAllDay="+this.isAllDay+", startTimeMillis="+this.startTimeMillis+", endTimeMillis="+this.endTimeMillis+", remindMinuteList="+this.remindMinuteList+", mode="+this.mode+", remark="+this.remark+", calendarId="+this.calendarId+"\)";
    }
}
