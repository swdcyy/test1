package com.horcrux.svg.TextProperties$Direction;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class TextProperties$Direction extends Enum	// class@00060a
{
    public static final TextProperties$Direction[] $VALUES;
    public static final TextProperties$Direction ltr;
    public static final TextProperties$Direction rtl;

    static {
       TextProperties$Direction uDirection = new TextProperties$Direction("ltr", 0);
       TextProperties$Direction.ltr = uDirection;
       TextProperties$Direction uDirection1 = new TextProperties$Direction("rtl", 1);
       TextProperties$Direction.rtl = uDirection1;
       TextProperties$Direction[] uDirectionAr = new TextProperties$Direction[]{uDirection,uDirection1};
       TextProperties$Direction.$VALUES = uDirectionAr;
    }
    public void TextProperties$Direction(String p0,int p1){
       super(p0, p1);
    }
    public static TextProperties$Direction valueOf(String p0){
       return Enum.valueOf(TextProperties$Direction.class, p0);
    }
    public static TextProperties$Direction[] values(){
       return TextProperties$Direction.$VALUES.clone();
    }
}
