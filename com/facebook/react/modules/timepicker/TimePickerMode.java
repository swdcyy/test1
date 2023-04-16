package com.facebook.react.modules.timepicker.TimePickerMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TimePickerMode extends Enum	// class@0012f6
{
    public static final TimePickerMode[] $VALUES;
    public static final TimePickerMode CLOCK;
    public static final TimePickerMode DEFAULT;
    public static final TimePickerMode SPINNER;

    static {
       TimePickerMode timePickerMo = new TimePickerMode("CLOCK", 0);
       TimePickerMode.CLOCK = timePickerMo;
       TimePickerMode timePickerMo1 = new TimePickerMode("SPINNER", 1);
       TimePickerMode.SPINNER = timePickerMo1;
       TimePickerMode timePickerMo2 = new TimePickerMode("DEFAULT", 2);
       TimePickerMode.DEFAULT = timePickerMo2;
       TimePickerMode[] timePickerMo3 = new TimePickerMode[]{timePickerMo,timePickerMo1,timePickerMo2};
       TimePickerMode.$VALUES = timePickerMo3;
    }
    public void TimePickerMode(String p0,int p1){
       super(p0, p1);
    }
    public static TimePickerMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TimePickerMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TimePickerMode.class, p0);
    }
    public static TimePickerMode[] values(){
       Object obj = PatchProxy.apply(null, null, TimePickerMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TimePickerMode.$VALUES.clone();
    }
}
