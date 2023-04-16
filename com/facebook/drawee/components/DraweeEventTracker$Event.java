package com.facebook.drawee.components.DraweeEventTracker$Event;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class DraweeEventTracker$Event extends Enum	// class@001080
{
    public static final DraweeEventTracker$Event[] $VALUES;
    public static final DraweeEventTracker$Event ON_ACTIVITY_START;
    public static final DraweeEventTracker$Event ON_ACTIVITY_STOP;
    public static final DraweeEventTracker$Event ON_ATTACH_CONTROLLER;
    public static final DraweeEventTracker$Event ON_CLEAR_CONTROLLER;
    public static final DraweeEventTracker$Event ON_CLEAR_HIERARCHY;
    public static final DraweeEventTracker$Event ON_CLEAR_OLD_CONTROLLER;
    public static final DraweeEventTracker$Event ON_DATASOURCE_FAILURE;
    public static final DraweeEventTracker$Event ON_DATASOURCE_FAILURE_INT;
    public static final DraweeEventTracker$Event ON_DATASOURCE_RESULT;
    public static final DraweeEventTracker$Event ON_DATASOURCE_RESULT_INT;
    public static final DraweeEventTracker$Event ON_DATASOURCE_SUBMIT;
    public static final DraweeEventTracker$Event ON_DETACH_CONTROLLER;
    public static final DraweeEventTracker$Event ON_DRAWABLE_HIDE;
    public static final DraweeEventTracker$Event ON_DRAWABLE_SHOW;
    public static final DraweeEventTracker$Event ON_HOLDER_ATTACH;
    public static final DraweeEventTracker$Event ON_HOLDER_DETACH;
    public static final DraweeEventTracker$Event ON_INIT_CONTROLLER;
    public static final DraweeEventTracker$Event ON_RELEASE_CONTROLLER;
    public static final DraweeEventTracker$Event ON_RUN_CLEAR_CONTROLLER;
    public static final DraweeEventTracker$Event ON_SAME_CONTROLLER_SKIPPED;
    public static final DraweeEventTracker$Event ON_SCHEDULE_CLEAR_CONTROLLER;
    public static final DraweeEventTracker$Event ON_SET_CONTROLLER;
    public static final DraweeEventTracker$Event ON_SET_HIERARCHY;
    public static final DraweeEventTracker$Event ON_SUBMIT_CACHE_HIT;

    static {
       DraweeEventTracker$Event uEvent = new DraweeEventTracker$Event("ON_SET_HIERARCHY", 0);
       DraweeEventTracker$Event.ON_SET_HIERARCHY = uEvent;
       DraweeEventTracker$Event uEvent1 = new DraweeEventTracker$Event("ON_CLEAR_HIERARCHY", 1);
       DraweeEventTracker$Event.ON_CLEAR_HIERARCHY = uEvent1;
       DraweeEventTracker$Event uEvent2 = new DraweeEventTracker$Event("ON_SET_CONTROLLER", 2);
       DraweeEventTracker$Event.ON_SET_CONTROLLER = uEvent2;
       DraweeEventTracker$Event uEvent3 = new DraweeEventTracker$Event("ON_CLEAR_OLD_CONTROLLER", 3);
       DraweeEventTracker$Event.ON_CLEAR_OLD_CONTROLLER = uEvent3;
       DraweeEventTracker$Event uEvent4 = new DraweeEventTracker$Event("ON_CLEAR_CONTROLLER", 4);
       DraweeEventTracker$Event.ON_CLEAR_CONTROLLER = uEvent4;
       DraweeEventTracker$Event uEvent5 = new DraweeEventTracker$Event("ON_INIT_CONTROLLER", 5);
       DraweeEventTracker$Event.ON_INIT_CONTROLLER = uEvent5;
       DraweeEventTracker$Event uEvent6 = new DraweeEventTracker$Event("ON_ATTACH_CONTROLLER", 6);
       DraweeEventTracker$Event.ON_ATTACH_CONTROLLER = uEvent6;
       DraweeEventTracker$Event uEvent7 = new DraweeEventTracker$Event("ON_DETACH_CONTROLLER", 7);
       DraweeEventTracker$Event.ON_DETACH_CONTROLLER = uEvent7;
       DraweeEventTracker$Event uEvent8 = new DraweeEventTracker$Event("ON_RELEASE_CONTROLLER", 8);
       DraweeEventTracker$Event.ON_RELEASE_CONTROLLER = uEvent8;
       DraweeEventTracker$Event uEvent9 = new DraweeEventTracker$Event("ON_DATASOURCE_SUBMIT", 9);
       DraweeEventTracker$Event.ON_DATASOURCE_SUBMIT = uEvent9;
       DraweeEventTracker$Event uEvent10 = new DraweeEventTracker$Event("ON_DATASOURCE_RESULT", 10);
       DraweeEventTracker$Event.ON_DATASOURCE_RESULT = uEvent10;
       DraweeEventTracker$Event uEvent11 = new DraweeEventTracker$Event("ON_DATASOURCE_RESULT_INT", 11);
       DraweeEventTracker$Event.ON_DATASOURCE_RESULT_INT = uEvent11;
       DraweeEventTracker$Event uEvent12 = new DraweeEventTracker$Event("ON_DATASOURCE_FAILURE", 12);
       DraweeEventTracker$Event.ON_DATASOURCE_FAILURE = uEvent12;
       DraweeEventTracker$Event uEvent13 = new DraweeEventTracker$Event("ON_DATASOURCE_FAILURE_INT", 13);
       DraweeEventTracker$Event.ON_DATASOURCE_FAILURE_INT = uEvent13;
       DraweeEventTracker$Event uEvent14 = uEvent13;
       DraweeEventTracker$Event uEvent15 = new DraweeEventTracker$Event("ON_HOLDER_ATTACH", 14);
       DraweeEventTracker$Event.ON_HOLDER_ATTACH = uEvent15;
       DraweeEventTracker$Event uEvent16 = uEvent15;
       DraweeEventTracker$Event uEvent17 = new DraweeEventTracker$Event("ON_HOLDER_DETACH", 15);
       DraweeEventTracker$Event.ON_HOLDER_DETACH = uEvent17;
       DraweeEventTracker$Event uEvent18 = uEvent17;
       uEvent13 = new DraweeEventTracker$Event("ON_DRAWABLE_SHOW", 16);
       DraweeEventTracker$Event.ON_DRAWABLE_SHOW = uEvent13;
       DraweeEventTracker$Event uEvent19 = uEvent13;
       uEvent15 = new DraweeEventTracker$Event("ON_DRAWABLE_HIDE", 17);
       DraweeEventTracker$Event.ON_DRAWABLE_HIDE = uEvent15;
       DraweeEventTracker$Event uEvent20 = uEvent15;
       uEvent17 = new DraweeEventTracker$Event("ON_ACTIVITY_START", 18);
       DraweeEventTracker$Event.ON_ACTIVITY_START = uEvent17;
       DraweeEventTracker$Event uEvent21 = uEvent17;
       uEvent13 = new DraweeEventTracker$Event("ON_ACTIVITY_STOP", 19);
       DraweeEventTracker$Event.ON_ACTIVITY_STOP = uEvent13;
       DraweeEventTracker$Event uEvent22 = uEvent13;
       uEvent15 = new DraweeEventTracker$Event("ON_RUN_CLEAR_CONTROLLER", 20);
       DraweeEventTracker$Event.ON_RUN_CLEAR_CONTROLLER = uEvent15;
       DraweeEventTracker$Event uEvent23 = uEvent15;
       uEvent17 = new DraweeEventTracker$Event("ON_SCHEDULE_CLEAR_CONTROLLER", 21);
       DraweeEventTracker$Event.ON_SCHEDULE_CLEAR_CONTROLLER = uEvent17;
       DraweeEventTracker$Event uEvent24 = uEvent17;
       uEvent13 = new DraweeEventTracker$Event("ON_SAME_CONTROLLER_SKIPPED", 22);
       DraweeEventTracker$Event.ON_SAME_CONTROLLER_SKIPPED = uEvent13;
       DraweeEventTracker$Event uEvent25 = uEvent13;
       uEvent17 = new DraweeEventTracker$Event("ON_SUBMIT_CACHE_HIT", 23);
       DraweeEventTracker$Event.ON_SUBMIT_CACHE_HIT = uEvent17;
       DraweeEventTracker$Event[] uEventArray = new DraweeEventTracker$Event[24];
       uEventArray[0] = uEvent;
       uEventArray[1] = uEvent1;
       uEventArray[2] = uEvent2;
       uEventArray[3] = uEvent3;
       uEventArray[4] = uEvent4;
       uEventArray[5] = uEvent5;
       uEventArray[6] = uEvent6;
       uEventArray[7] = uEvent7;
       uEventArray[8] = uEvent8;
       uEventArray[9] = uEvent9;
       uEventArray[10] = uEvent10;
       uEventArray[11] = uEvent11;
       uEventArray[12] = uEvent12;
       uEventArray[13] = uEvent14;
       uEventArray[14] = uEvent16;
       uEventArray[15] = uEvent18;
       uEventArray[16] = uEvent19;
       uEventArray[17] = uEvent20;
       uEventArray[18] = uEvent21;
       uEventArray[19] = uEvent22;
       uEventArray[20] = uEvent23;
       uEventArray[21] = uEvent24;
       uEventArray[22] = uEvent25;
       uEventArray[23] = uEvent17;
       DraweeEventTracker$Event.$VALUES = uEventArray;
    }
    public void DraweeEventTracker$Event(String p0,int p1){
       super(p0, p1);
    }
    public static DraweeEventTracker$Event valueOf(String p0){
       return Enum.valueOf(DraweeEventTracker$Event.class, p0);
    }
    public static DraweeEventTracker$Event[] values(){
       return DraweeEventTracker$Event.$VALUES.clone();
    }
}
