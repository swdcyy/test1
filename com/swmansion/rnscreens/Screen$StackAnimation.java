package com.swmansion.rnscreens.Screen$StackAnimation;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Screen$StackAnimation extends Enum	// class@000ca0
{
    public static final Screen$StackAnimation[] $VALUES;
    public static final Screen$StackAnimation DEFAULT;
    public static final Screen$StackAnimation FADE;
    public static final Screen$StackAnimation NONE;

    static {
       Screen$StackAnimation stackAnimati = new Screen$StackAnimation("DEFAULT", 0);
       Screen$StackAnimation.DEFAULT = stackAnimati;
       Screen$StackAnimation stackAnimati1 = new Screen$StackAnimation("NONE", 1);
       Screen$StackAnimation.NONE = stackAnimati1;
       Screen$StackAnimation stackAnimati2 = new Screen$StackAnimation("FADE", 2);
       Screen$StackAnimation.FADE = stackAnimati2;
       Screen$StackAnimation[] stackAnimati3 = new Screen$StackAnimation[]{stackAnimati,stackAnimati1,stackAnimati2};
       Screen$StackAnimation.$VALUES = stackAnimati3;
    }
    public void Screen$StackAnimation(String p0,int p1){
       super(p0, p1);
    }
    public static Screen$StackAnimation valueOf(String p0){
       return Enum.valueOf(Screen$StackAnimation.class, p0);
    }
    public static Screen$StackAnimation[] values(){
       return Screen$StackAnimation.$VALUES.clone();
    }
}
