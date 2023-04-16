package com.airbnb.lottie.model.content.ShapeStroke$LineCapType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import android.graphics.Paint$Cap;
import com.airbnb.lottie.model.content.ShapeStroke$a;

public final class ShapeStroke$LineCapType extends Enum	// class@000dca
{
    public static final ShapeStroke$LineCapType[] $VALUES;
    public static final ShapeStroke$LineCapType BUTT;
    public static final ShapeStroke$LineCapType ROUND;
    public static final ShapeStroke$LineCapType UNKNOWN;

    static {
       ShapeStroke$LineCapType lineCapType = new ShapeStroke$LineCapType("BUTT", 0);
       ShapeStroke$LineCapType.BUTT = lineCapType;
       ShapeStroke$LineCapType lineCapType1 = new ShapeStroke$LineCapType("ROUND", 1);
       ShapeStroke$LineCapType.ROUND = lineCapType1;
       ShapeStroke$LineCapType lineCapType2 = new ShapeStroke$LineCapType("UNKNOWN", 2);
       ShapeStroke$LineCapType.UNKNOWN = lineCapType2;
       ShapeStroke$LineCapType[] lineCapTypeA = new ShapeStroke$LineCapType[]{lineCapType,lineCapType1,lineCapType2};
       ShapeStroke$LineCapType.$VALUES = lineCapTypeA;
    }
    public void ShapeStroke$LineCapType(String p0,int p1){
       super(p0, p1);
    }
    public static ShapeStroke$LineCapType valueOf(String p0){
       return Enum.valueOf(ShapeStroke$LineCapType.class, p0);
    }
    public static ShapeStroke$LineCapType[] values(){
       return ShapeStroke$LineCapType.$VALUES.clone();
    }
    public Paint$Cap toPaintCap(){
       int i = ShapeStroke$a.a[this.ordinal()];
       if (i == 1) {
          return Paint$Cap.BUTT;
       }
       if (i != 2) {
          return Paint$Cap.SQUARE;
       }
       return Paint$Cap.ROUND;
    }
}
