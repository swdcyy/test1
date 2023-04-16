package com.facebook.react.modules.datepicker.DatePickerMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DatePickerMode extends Enum	// class@0012a5
{
    public static final DatePickerMode[] $VALUES;
    public static final DatePickerMode CALENDAR;
    public static final DatePickerMode DEFAULT;
    public static final DatePickerMode SPINNER;

    static {
       DatePickerMode uDatePickerM = new DatePickerMode("CALENDAR", 0);
       DatePickerMode.CALENDAR = uDatePickerM;
       DatePickerMode uDatePickerM1 = new DatePickerMode("SPINNER", 1);
       DatePickerMode.SPINNER = uDatePickerM1;
       DatePickerMode uDatePickerM2 = new DatePickerMode("DEFAULT", 2);
       DatePickerMode.DEFAULT = uDatePickerM2;
       DatePickerMode[] uDatePickerM3 = new DatePickerMode[]{uDatePickerM,uDatePickerM1,uDatePickerM2};
       DatePickerMode.$VALUES = uDatePickerM3;
    }
    public void DatePickerMode(String p0,int p1){
       super(p0, p1);
    }
    public static DatePickerMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DatePickerMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DatePickerMode.class, p0);
    }
    public static DatePickerMode[] values(){
       Object obj = PatchProxy.apply(null, null, DatePickerMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DatePickerMode.$VALUES.clone();
    }
}
