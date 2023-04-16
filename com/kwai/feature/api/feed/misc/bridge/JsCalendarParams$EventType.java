package com.kwai.feature.api.feed.misc.bridge.JsCalendarParams$EventType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class JsCalendarParams$EventType extends Enum	// class@000f4e
{
    public static final JsCalendarParams$EventType[] $VALUES;
    public static final JsCalendarParams$EventType ADD;
    public static final JsCalendarParams$EventType DELETE;
    public static final JsCalendarParams$EventType SEARCH;

    static {
       JsCalendarParams$EventType uEventType = new JsCalendarParams$EventType("ADD", 0);
       JsCalendarParams$EventType.ADD = uEventType;
       JsCalendarParams$EventType uEventType1 = new JsCalendarParams$EventType("SEARCH", 1);
       JsCalendarParams$EventType.SEARCH = uEventType1;
       JsCalendarParams$EventType uEventType2 = new JsCalendarParams$EventType("DELETE", 2);
       JsCalendarParams$EventType.DELETE = uEventType2;
       JsCalendarParams$EventType[] uEventTypeAr = new JsCalendarParams$EventType[]{uEventType,uEventType1,uEventType2};
       JsCalendarParams$EventType.$VALUES = uEventTypeAr;
    }
    public void JsCalendarParams$EventType(String p0,int p1){
       super(p0, p1);
    }
    public static JsCalendarParams$EventType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JsCalendarParams$EventType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(JsCalendarParams$EventType.class, p0);
    }
    public static JsCalendarParams$EventType[] values(){
       Object obj = PatchProxy.apply(null, null, JsCalendarParams$EventType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JsCalendarParams$EventType.$VALUES.clone();
    }
}
