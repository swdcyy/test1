package com.airbnb.lottie.ex.model.content.ShapeStroke$LineJoinType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import android.graphics.Paint$Join;
import com.airbnb.lottie.ex.model.content.ShapeStroke$a;

public final class ShapeStroke$LineJoinType extends Enum	// class@000db1
{
    public static final ShapeStroke$LineJoinType[] $VALUES;
    public static final ShapeStroke$LineJoinType BEVEL;
    public static final ShapeStroke$LineJoinType MITER;
    public static final ShapeStroke$LineJoinType ROUND;

    static {
       ShapeStroke$LineJoinType lineJoinType = new ShapeStroke$LineJoinType("MITER", 0);
       ShapeStroke$LineJoinType.MITER = lineJoinType;
       ShapeStroke$LineJoinType lineJoinType1 = new ShapeStroke$LineJoinType("ROUND", 1);
       ShapeStroke$LineJoinType.ROUND = lineJoinType1;
       ShapeStroke$LineJoinType lineJoinType2 = new ShapeStroke$LineJoinType("BEVEL", 2);
       ShapeStroke$LineJoinType.BEVEL = lineJoinType2;
       ShapeStroke$LineJoinType[] lineJoinType3 = new ShapeStroke$LineJoinType[]{lineJoinType,lineJoinType1,lineJoinType2};
       ShapeStroke$LineJoinType.$VALUES = lineJoinType3;
    }
    public void ShapeStroke$LineJoinType(String p0,int p1){
       super(p0, p1);
    }
    public static ShapeStroke$LineJoinType valueOf(String p0){
       return Enum.valueOf(ShapeStroke$LineJoinType.class, p0);
    }
    public static ShapeStroke$LineJoinType[] values(){
       return ShapeStroke$LineJoinType.$VALUES.clone();
    }
    public Paint$Join toPaintJoin(){
       int i = ShapeStroke$a.b[this.ordinal()];
       if (i == 1) {
          return Paint$Join.BEVEL;
       }
       if (i == 2) {
          return Paint$Join.MITER;
       }
       if (i != 3) {
          return null;
       }
       return Paint$Join.ROUND;
    }
}
