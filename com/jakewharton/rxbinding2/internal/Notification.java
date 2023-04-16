package com.jakewharton.rxbinding2.internal.Notification;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Notification extends Enum	// class@0006d3
{
    public static final Notification[] $VALUES;
    public static final Notification INSTANCE;

    static {
       Notification notification = new Notification("INSTANCE", 0);
       Notification.INSTANCE = notification;
       Notification[] notification1 = new Notification[]{notification};
       Notification.$VALUES = notification1;
    }
    public void Notification(String p0,int p1){
       super(p0, p1);
    }
    public static Notification valueOf(String p0){
       return Enum.valueOf(Notification.class, p0);
    }
    public static Notification[] values(){
       return Notification.$VALUES.clone();
    }
}
