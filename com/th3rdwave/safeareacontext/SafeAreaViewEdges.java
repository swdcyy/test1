package com.th3rdwave.safeareacontext.SafeAreaViewEdges;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class SafeAreaViewEdges extends Enum	// class@000f97
{
    public static final SafeAreaViewEdges[] $VALUES;
    public static final SafeAreaViewEdges BOTTOM;
    public static final SafeAreaViewEdges LEFT;
    public static final SafeAreaViewEdges RIGHT;
    public static final SafeAreaViewEdges TOP;

    static {
       SafeAreaViewEdges safeAreaView = new SafeAreaViewEdges("TOP", 0);
       SafeAreaViewEdges.TOP = safeAreaView;
       SafeAreaViewEdges safeAreaView1 = new SafeAreaViewEdges("RIGHT", 1);
       SafeAreaViewEdges.RIGHT = safeAreaView1;
       SafeAreaViewEdges safeAreaView2 = new SafeAreaViewEdges("BOTTOM", 2);
       SafeAreaViewEdges.BOTTOM = safeAreaView2;
       SafeAreaViewEdges safeAreaView3 = new SafeAreaViewEdges("LEFT", 3);
       SafeAreaViewEdges.LEFT = safeAreaView3;
       SafeAreaViewEdges[] safeAreaView4 = new SafeAreaViewEdges[]{safeAreaView,safeAreaView1,safeAreaView2,safeAreaView3};
       SafeAreaViewEdges.$VALUES = safeAreaView4;
    }
    public void SafeAreaViewEdges(String p0,int p1){
       super(p0, p1);
    }
    public static SafeAreaViewEdges valueOf(String p0){
       return Enum.valueOf(SafeAreaViewEdges.class, p0);
    }
    public static SafeAreaViewEdges[] values(){
       return SafeAreaViewEdges.$VALUES.clone();
    }
}
