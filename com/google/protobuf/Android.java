package com.google.protobuf.Android;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Android	// class@0003aa
{
    public static final boolean IS_ROBOLECTRIC;
    public static final Class MEMORY_CLASS;

    static {
       Android.MEMORY_CLASS = Android.getClassForName("libcore.io.Memory");
       boolean b = (Android.getClassForName("org.robolectric.Robolectric") != null)? true: false;
       Android.IS_ROBOLECTRIC = b;
    }
    public void Android(){
       super();
    }
    public static Class getClassForName(String p0){
       return Class.forName(p0);
    }
    public static Class getMemoryClass(){
       return Android.MEMORY_CLASS;
    }
    public static boolean isOnAndroidDevice(){
       boolean b = (Android.MEMORY_CLASS != null && !Android.IS_ROBOLECTRIC)? true: false;
       return b;
    }
}
