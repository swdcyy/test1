package com.swmansion.rnscreens.Screen$StackPresentation;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Screen$StackPresentation extends Enum	// class@000ca1
{
    public static final Screen$StackPresentation[] $VALUES;
    public static final Screen$StackPresentation MODAL;
    public static final Screen$StackPresentation PUSH;
    public static final Screen$StackPresentation TRANSPARENT_MODAL;

    static {
       Screen$StackPresentation stackPresent = new Screen$StackPresentation("PUSH", 0);
       Screen$StackPresentation.PUSH = stackPresent;
       Screen$StackPresentation stackPresent1 = new Screen$StackPresentation("MODAL", 1);
       Screen$StackPresentation.MODAL = stackPresent1;
       Screen$StackPresentation stackPresent2 = new Screen$StackPresentation("TRANSPARENT_MODAL", 2);
       Screen$StackPresentation.TRANSPARENT_MODAL = stackPresent2;
       Screen$StackPresentation[] stackPresent3 = new Screen$StackPresentation[]{stackPresent,stackPresent1,stackPresent2};
       Screen$StackPresentation.$VALUES = stackPresent3;
    }
    public void Screen$StackPresentation(String p0,int p1){
       super(p0, p1);
    }
    public static Screen$StackPresentation valueOf(String p0){
       return Enum.valueOf(Screen$StackPresentation.class, p0);
    }
    public static Screen$StackPresentation[] values(){
       return Screen$StackPresentation.$VALUES.clone();
    }
}
