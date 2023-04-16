package com.th3rdwave.safeareacontext.SafeAreaViewMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class SafeAreaViewMode extends Enum	// class@000f99
{
    public static final SafeAreaViewMode[] $VALUES;
    public static final SafeAreaViewMode MARGIN;
    public static final SafeAreaViewMode PADDING;

    static {
       SafeAreaViewMode safeAreaView = new SafeAreaViewMode("PADDING", 0);
       SafeAreaViewMode.PADDING = safeAreaView;
       SafeAreaViewMode safeAreaView1 = new SafeAreaViewMode("MARGIN", 1);
       SafeAreaViewMode.MARGIN = safeAreaView1;
       SafeAreaViewMode[] safeAreaView2 = new SafeAreaViewMode[]{safeAreaView,safeAreaView1};
       SafeAreaViewMode.$VALUES = safeAreaView2;
    }
    public void SafeAreaViewMode(String p0,int p1){
       super(p0, p1);
    }
    public static SafeAreaViewMode valueOf(String p0){
       return Enum.valueOf(SafeAreaViewMode.class, p0);
    }
    public static SafeAreaViewMode[] values(){
       return SafeAreaViewMode.$VALUES.clone();
    }
}
