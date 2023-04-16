package com.kwai.framework.krn.bridges.model.calendar.a;
import java.lang.Object;
import android.content.Context;
import com.kwai.framework.krn.bridges.model.calendar.JsCalendarParams$CalendarEvent;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import android.content.ContentResolver;
import android.provider.CalendarContract$Calendars;
import android.net.Uri;
import android.database.Cursor;
import e86.a;
import java.lang.StringBuilder;
import q87.c;
import android.content.ContentValues;
import java.lang.Long;
import java.util.TimeZone;
import java.lang.Integer;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.kwai.framework.krn.bridges.model.calendar.a$a;
import java.lang.Enum;
import androidx.core.content.ContextCompat;
import android.provider.CalendarContract$Reminders;
import java.lang.Throwable;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import android.net.Uri$Builder;
import android.os.Build$VERSION;
import android.content.ContentUris;
import android.provider.CalendarContract$Events;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.text.ParseException;

public class a	// class@0015c3
{

    public void a(){
       super();
    }
    public static String a(Context p0,JsCalendarParams$CalendarEvent p1,String p2){
       long l;
       Object obj = p0;
       JsCalendarParams$CalendarEvent uCalendarEve = p1;
       a uoa = a.class;
       String obj1 = PatchProxy.applyThreeRefs(p0, p1, p2, null, a.class, "8");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = null;
       ContentValues obj2 = PatchProxy.applyOneRefs(obj, obj1, uoa, "5");
       StringBuilder str = null;
       if (obj2 != PatchProxyResult.class) {
          l = obj2.longValue();
       }else {
          Cursor obj3 = PatchProxy.applyOneRefs(obj, obj1, uoa, "6");
          if (obj3 != PatchProxyResult.class) {
             l = obj3.longValue();
          }else {
             obj3 = p0.getContentResolver().query(CalendarContract$Calendars.CONTENT_URI, null, null, null, null);
             l = -1;
             if (obj3 == null) {
                if (obj3 == null) {
                label_0069 :
                   if (l - str < 0) {
                      l = a.b(p0);
                   }
                }
             }else if(obj3.getCount() > 0){
                obj3.moveToFirst();
                l = (long)obj3.getInt(obj3.getColumnIndex("_id"));
             }
             obj3.close();
             goto label_0069 ;
          }
       }
       if (l - str <= 0) {
          return obj1;
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          a.C().s("CalendarUtils", "eventParams.mStartDay = "+uCalendarEve.mStartDay, objArray);
          objArray = new Object[i];
          a.C().s("CalendarUtils", "eventParams.mEndDay = "+uCalendarEve.mEndDay, objArray);
          objArray = new Object[i];
          a.C().s("CalendarUtils", "eventParams.mEventId = "+uCalendarEve.mEventId, objArray);
          obj2 = new ContentValues();
          obj2.put("title", uCalendarEve.mTitle);
          obj2.put("description", uCalendarEve.mNote);
          obj2.put("calendar_id", Long.valueOf(l));
          obj2.put("dtstart", Long.valueOf(uCalendarEve.mStartDay));
          obj2.put("dtend", Long.valueOf(uCalendarEve.mStartDay));
          obj2.put("eventTimezone", TimeZone.getDefault().getID());
          JsCalendarParams$CalendarEvent mHasAlarm = uCalendarEve.mHasAlarm;
          if (mHasAlarm > null) {
             obj2.put("hasAlarm", Integer.valueOf(mHasAlarm));
          }
          str = ";UNTIL=";
          l = Long.valueOf(uCalendarEve.mEndDay).longValue() + 0x5265c00;
          if (PatchProxy.isSupport(uoa)) {
             obj1 = PatchProxy.applyTwoRefs(Long.valueOf(l), "yyyyMMdd", obj1, uoa, "11");
             if (obj1 != PatchProxyResult.class) {
             label_0157 :
                obj1 = str+obj1+"T000000Z";
                int i1 = a$a.a[uCalendarEve.mType.ordinal()];
                if (i1 != 1) {
                   obj1 = (i1 != 2)? "FREQ=DAILY"+obj1: "FREQ=WEEKLY;WKST=SU;BYDAY=SA,SU"+obj1;
                }else {
                   obj1 = "FREQ=WEEKLY;WKST=SU;BYDAY=MO,TU,WE,TH,FR"+obj1;
                }
                Object[] objArray1 = new Object[i];
                a.C().s("CalendarUtils", "rule = "+obj1, objArray1);
                obj2.put("rrule", obj1);
                Uri uri = p0.getContentResolver().insert(Uri.parse(p2), obj2);
                if (uri == null) {
                   return "";
                }else {
                   long l1 = Long.parseLong(uri.getLastPathSegment());
                   ContentValues uContentValu = new ContentValues();
                   uContentValu.put("event_id", Long.valueOf(l1));
                   if (uCalendarEve.mHasAlarm > null) {
                      i = 1;
                   }
                   uContentValu.put("minutes", Integer.valueOf(i));
                   uContentValu.put("event_id", Long.valueOf(l1));
                   uContentValu.put("method", Integer.valueOf(1));
                   ContentResolver contentResol = p0.getContentResolver();
                   if (ContextCompat.checkSelfPermission(obj, "android.permission.WRITE_CALENDAR")) {
                      return "";
                   }else {
                      contentResol.insert(CalendarContract$Reminders.CONTENT_URI, uContentValu);
                      return String.valueOf(l1);
                   }
                }
             }
          }
          obj1 = new SimpleDateFormat("yyyyMMdd").format(new Date(l));
          goto label_0157 ;
       }
    }
    public static long b(Context p0){
       Uri uri;
       Uri obj = PatchProxy.applyOneRefs(p0, null, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       ContentValues uContentValu = new ContentValues();
       uContentValu.put("account_type", "LOCAL");
       uContentValu.put("name", "KyleC");
       uContentValu.put("account_name", "KYLE");
       uContentValu.put("calendar_displayName", "KYLE_ACCOUNT");
       uContentValu.put("calendar_color", Integer.valueOf(a.a().a().getResources().getColor(R.color.arg_RES_7f0605e0)));
       uContentValu.put("calendar_access_level", Integer.valueOf(700));
       uContentValu.put("visible", Integer.valueOf(1));
       uContentValu.put("calendar_timezone", TimeZone.getDefault().getID());
       uContentValu.put("canModifyTimeZone", Integer.valueOf(1));
       uContentValu.put("sync_events", Integer.valueOf(1));
       uContentValu.put("ownerAccount", "KYLE");
       uContentValu.put("canOrganizerRespond", Integer.valueOf(1));
       uContentValu.put("maxReminders", Integer.valueOf(8));
       uContentValu.put("allowedReminders", "0,1,2,3,4");
       uContentValu.put("allowedAvailability", "0,1,2");
       uContentValu.put("allowedAttendeeTypes", "0,1,2");
       obj = CalendarContract$Calendars.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", "KYLE").appendQueryParameter("account_type", "calendar_location").build();
       if (Build$VERSION.SDK_INT >= 23) {
          if (!p0.checkSelfPermission("android.permission.WRITE_CALENDAR")) {
             uri = p0.getContentResolver().insert(obj, uContentValu);
          }else {
             return -2;
          }
       }else {
          uri = p0.getContentResolver().insert(obj, uContentValu);
       }
       long l = (uri == null)? -1: ContentUris.parseId(uri);
       return l;
    }
    public static int c(Context p0,long p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), null, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return p0.getContentResolver().delete(ContentUris.withAppendedId(CalendarContract$Events.CONTENT_URI, p1), null, null);
    }
    public static boolean d(Context p0,String p1,String p2,long p3){
       Object[] obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Long.valueOf(p3), null, a.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.C().s("CalendarUtils", "eventId = "+p1, objArray);
       objArray = new Object[i];
       a.C().s("CalendarUtils", "checkTime = "+p3, objArray);
       Cursor uCursor = p0.getContentResolver().query(Uri.parse(p2), null, null, null, null);
       while (true) {
          if (uCursor != null && uCursor.moveToNext()) {
             if (TextUtils.n(uCursor.getString(uCursor.getColumnIndex("_id")), p1)) {
                String str = uCursor.getString(uCursor.getColumnIndex("rrule"));
                obj = new Object[i];
                a.C().s("CalendarUtils", "rule = "+str, obj);
                String[] stringArray = str.split(";");
                int len = stringArray.length;
                int i1 = 0;
                while (i1 < len) {
                   if (stringArray[i1] != null && (stringArray[i1]).contains("UNTIL=")) {
                      str = (stringArray[i1]).substring(6, 14);
                      i1 = "yyyyMMdd";
                      try{
                         SimpleDateFormat simpleDateFo = new SimpleDateFormat(i1);
                         if (p3 - simpleDateFo.parse(str).getTime() <= 0) {
                            i = true;
                         }
                      }catch(java.text.ParseException e11){
                         e11.printStackTrace();
                      }
                   }
                   i1++;
                }
             }
          }
       }
       return i;
    }
    public static int e(Context p0,long p1,long p2,String p3){
       Uri obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyFourRefs(p0, Long.valueOf(p1), Long.valueOf(p2), p3, null, a.class, "1");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       Object[] objArray = new Object[0];
       a.C().s("CalendarUtils", "eventID = "+p1, objArray);
       objArray = new Object[0];
       a.C().s("CalendarUtils", "newBeginTime = "+p2, objArray);
       obj = CalendarContract$Events.CONTENT_URI;
       ContentValues uContentValu = new ContentValues();
       uContentValu.put("dtstart", Long.valueOf(p2));
       uContentValu.put("dtend", Long.valueOf(p2));
       String str = String.valueOf(p1);
       String str1 = PatchProxy.applyThreeRefs(p0, p3, str, null, a.class, "2");
       if (str1 != patchProxyRe) {
       }else {
          Cursor uCursor = p0.getContentResolver().query(Uri.parse(p3), null, null, null, null);
          while (true) {
             if (uCursor.moveToNext()) {
                if (TextUtils.n(uCursor.getString(uCursor.getColumnIndex("_id")), str)) {
                   str1 = uCursor.getString(uCursor.getColumnIndex("rrule"));
                }
             }else {
                str1 = null;
             }
          }
       }
       Object[] objArray1 = new Object[0];
       a.C().s("CalendarUtils", "rule = "+str1, objArray1);
       if (!TextUtils.x(str1)) {
          uContentValu.put("rrule", str1);
       }
       String[] stringArray = new String[]{String.valueOf(p1)};
       return p0.getContentResolver().update(obj, uContentValu, "\(_id = ?\)", stringArray);
    }
}
