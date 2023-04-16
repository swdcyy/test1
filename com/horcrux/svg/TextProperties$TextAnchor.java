package com.horcrux.svg.TextProperties$TextAnchor;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class TextProperties$TextAnchor extends Enum	// class@00060e
{
    public static final TextProperties$TextAnchor[] $VALUES;
    public static final TextProperties$TextAnchor end;
    public static final TextProperties$TextAnchor middle;
    public static final TextProperties$TextAnchor start;

    static {
       TextProperties$TextAnchor textAnchor = new TextProperties$TextAnchor("start", 0);
       TextProperties$TextAnchor.start = textAnchor;
       TextProperties$TextAnchor textAnchor1 = new TextProperties$TextAnchor("middle", 1);
       TextProperties$TextAnchor.middle = textAnchor1;
       TextProperties$TextAnchor textAnchor2 = new TextProperties$TextAnchor("end", 2);
       TextProperties$TextAnchor.end = textAnchor2;
       TextProperties$TextAnchor[] textAnchorAr = new TextProperties$TextAnchor[]{textAnchor,textAnchor1,textAnchor2};
       TextProperties$TextAnchor.$VALUES = textAnchorAr;
    }
    public void TextProperties$TextAnchor(String p0,int p1){
       super(p0, p1);
    }
    public static TextProperties$TextAnchor valueOf(String p0){
       return Enum.valueOf(TextProperties$TextAnchor.class, p0);
    }
    public static TextProperties$TextAnchor[] values(){
       return TextProperties$TextAnchor.$VALUES.clone();
    }
}
