package com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class DrawableCreator$Shape extends Enum	// class@0009e0
{
    public int value;
    public static final DrawableCreator$Shape[] $VALUES;
    public static final DrawableCreator$Shape Line;
    public static final DrawableCreator$Shape Oval;
    public static final DrawableCreator$Shape Rectangle;
    public static final DrawableCreator$Shape Ring;

    static {
       DrawableCreator$Shape shape = new DrawableCreator$Shape("Rectangle", 0, 0);
       DrawableCreator$Shape.Rectangle = shape;
       DrawableCreator$Shape shape1 = new DrawableCreator$Shape("Oval", 1, 1);
       DrawableCreator$Shape.Oval = shape1;
       DrawableCreator$Shape shape2 = new DrawableCreator$Shape("Line", 2, 2);
       DrawableCreator$Shape.Line = shape2;
       DrawableCreator$Shape shape3 = new DrawableCreator$Shape("Ring", 3, 3);
       DrawableCreator$Shape.Ring = shape3;
       DrawableCreator$Shape[] shapeArray = new DrawableCreator$Shape[]{shape,shape1,shape2,shape3};
       DrawableCreator$Shape.$VALUES = shapeArray;
    }
    public void DrawableCreator$Shape(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static DrawableCreator$Shape valueOf(String p0){
       return Enum.valueOf(DrawableCreator$Shape.class, p0);
    }
    public static DrawableCreator$Shape[] values(){
       return DrawableCreator$Shape.$VALUES.clone();
    }
}
