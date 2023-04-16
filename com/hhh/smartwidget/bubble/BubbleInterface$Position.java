package com.hhh.smartwidget.bubble.BubbleInterface$Position;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class BubbleInterface$Position extends Enum	// class@000577
{
    public static final BubbleInterface$Position[] $VALUES;
    public static final BubbleInterface$Position BOTTOM;
    public static final BubbleInterface$Position LEFT;
    public static final BubbleInterface$Position RIGHT;
    public static final BubbleInterface$Position TOP;

    static {
       BubbleInterface$Position position = new BubbleInterface$Position("LEFT", 0);
       BubbleInterface$Position.LEFT = position;
       BubbleInterface$Position position1 = new BubbleInterface$Position("TOP", 1);
       BubbleInterface$Position.TOP = position1;
       BubbleInterface$Position position2 = new BubbleInterface$Position("RIGHT", 2);
       BubbleInterface$Position.RIGHT = position2;
       BubbleInterface$Position position3 = new BubbleInterface$Position("BOTTOM", 3);
       BubbleInterface$Position.BOTTOM = position3;
       BubbleInterface$Position[] positionArra = new BubbleInterface$Position[]{position,position1,position2,position3};
       BubbleInterface$Position.$VALUES = positionArra;
    }
    public void BubbleInterface$Position(String p0,int p1){
       super(p0, p1);
    }
    public static BubbleInterface$Position valueOf(String p0){
       return Enum.valueOf(BubbleInterface$Position.class, p0);
    }
    public static BubbleInterface$Position[] values(){
       return BubbleInterface$Position.$VALUES.clone();
    }
}
