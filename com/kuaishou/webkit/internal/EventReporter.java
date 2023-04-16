package com.kuaishou.webkit.internal.EventReporter;
import java.lang.Object;
import java.lang.String;
import org.json.JSONObject;
import java.util.ArrayList;
import com.kuaishou.webkit.internal.EventReporter$EventEntry;
import com.kuaishou.webkit.internal.EventReporter$Delegate;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Exception;
import com.kuaishou.webkit.internal.Logger;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class EventReporter	// class@001312
{
    public static EventReporter$Delegate sDelegate;
    public static final Object sLock;
    public static ArrayList sPendingEvents;

    static {
       EventReporter.sLock = new Object();
    }
    public void EventReporter(){
       super();
    }
    public static void addPendingEvent(String p0,JSONObject p1){
       if (EventReporter.sPendingEvents == null) {
          EventReporter.sPendingEvents = new ArrayList();
       }
       if (EventReporter.sPendingEvents.size() > 20) {
          return;
       }else {
          EventReporter.sPendingEvents.add(new EventReporter$EventEntry(p0, p1));
          return;
       }
    }
    public static EventReporter$Delegate getDelegate(){
       return EventReporter.sDelegate;
    }
    public static void onEvent(String p0,String p1,String p2){
       if (TextUtils.isEmpty(p1) || TextUtils.isEmpty(p2)) {
          EventReporter.onEvent(p0, null);
       }else {
          try{
             JSONObject jSONObject = new JSONObject();
             jSONObject.put(p1, p2);
             EventReporter.onEvent(p0, jSONObject);
          }catch(java.lang.Exception e1){
             e1.printStackTrace();
          }
       }
    }
    public static void onEvent(String p0,String p1,String p2,String p3,String p4){
       try{
          JSONObject jSONObject = new JSONObject();
          if (!TextUtils.isEmpty(p1) && !TextUtils.isEmpty(p2)) {
             jSONObject.put(p1, p2);
          }
          if (!TextUtils.isEmpty(p3) && !TextUtils.isEmpty(p4)) {
             jSONObject.put(p3, p4);
          }
          EventReporter.onEvent(p0, jSONObject);
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return;
    }
    public static void onEvent(String p0,JSONObject p1){
       String str;
       Object sLock = EventReporter.sLock;
       _monitor_enter(sLock);
       EventReporter$Delegate sDelegate = EventReporter.sDelegate;
       if (sDelegate != null) {
          sDelegate.onEvent(p0, p1);
       }else if(p1 != null){
          str = p1.toString();
       }else {
          str = "null";
       }
       Logger.d(p0, str);
       EventReporter.addPendingEvent(p0, p1);
       _monitor_exit(sLock);
       return;
    }
    public static void onEventWithValues(String p0,Map p1){
       try{
          if (p1 != null && !p1.isEmpty()) {
             JSONObject jSONObject = new JSONObject();
             Iterator iterator = p1.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                String key = uEntry.getKey();
                jSONObject.put(key, uEntry.getValue());
             }
             EventReporter.onEvent(p0, jSONObject);
          }
       label_0033 :
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static void runPendingEvents(){
       ArrayList sPendingEven = EventReporter.sPendingEvents;
       if (sPendingEven != null && !sPendingEven.isEmpty()) {
          Iterator iterator = EventReporter.sPendingEvents.iterator();
          while (iterator.hasNext()) {
             EventReporter$EventEntry uEventEntry = iterator.next();
             EventReporter.sDelegate.onEvent(uEventEntry.mKey, uEventEntry.mAttrs);
          }
          EventReporter.sPendingEvents.clear();
       }
       return;
    }
    public static void setDelegate(EventReporter$Delegate p0){
       Object sLock = EventReporter.sLock;
       _monitor_enter(sLock);
       EventReporter.sDelegate = p0;
       if (p0 != null) {
          EventReporter.runPendingEvents();
       }
       _monitor_exit(sLock);
       return;
    }
}
