package com.yxcorp.widget.selector.drawable.DrawableCreator$Gradient;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class DrawableCreator$Gradient extends Enum	// class@0009df
{
    public int value;
    public static final DrawableCreator$Gradient[] $VALUES;
    public static final DrawableCreator$Gradient Linear;
    public static final DrawableCreator$Gradient Radial;
    public static final DrawableCreator$Gradient Sweep;

    static {
       DrawableCreator$Gradient gradient = new DrawableCreator$Gradient("Linear", 0, 0);
       DrawableCreator$Gradient.Linear = gradient;
       DrawableCreator$Gradient gradient1 = new DrawableCreator$Gradient("Radial", 1, 1);
       DrawableCreator$Gradient.Radial = gradient1;
       DrawableCreator$Gradient gradient2 = new DrawableCreator$Gradient("Sweep", 2, 2);
       DrawableCreator$Gradient.Sweep = gradient2;
       DrawableCreator$Gradient[] gradientArra = new DrawableCreator$Gradient[]{gradient,gradient1,gradient2};
       DrawableCreator$Gradient.$VALUES = gradientArra;
    }
    public void DrawableCreator$Gradient(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static DrawableCreator$Gradient valueOf(String p0){
       return Enum.valueOf(DrawableCreator$Gradient.class, p0);
    }
    public static DrawableCreator$Gradient[] values(){
       return DrawableCreator$Gradient.$VALUES.clone();
    }
}
