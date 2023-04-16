package com.horcrux.svg.TextProperties$TextPathSpacing;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class TextProperties$TextPathSpacing extends Enum	// class@000614
{
    public static final TextProperties$TextPathSpacing[] $VALUES;
    public static final TextProperties$TextPathSpacing auto;
    public static final TextProperties$TextPathSpacing exact;

    static {
       TextProperties$TextPathSpacing textPathSpac = new TextProperties$TextPathSpacing("auto", 0);
       TextProperties$TextPathSpacing.auto = textPathSpac;
       TextProperties$TextPathSpacing textPathSpac1 = new TextProperties$TextPathSpacing("exact", 1);
       TextProperties$TextPathSpacing.exact = textPathSpac1;
       TextProperties$TextPathSpacing[] textPathSpac2 = new TextProperties$TextPathSpacing[]{textPathSpac,textPathSpac1};
       TextProperties$TextPathSpacing.$VALUES = textPathSpac2;
    }
    public void TextProperties$TextPathSpacing(String p0,int p1){
       super(p0, p1);
    }
    public static TextProperties$TextPathSpacing valueOf(String p0){
       return Enum.valueOf(TextProperties$TextPathSpacing.class, p0);
    }
    public static TextProperties$TextPathSpacing[] values(){
       return TextProperties$TextPathSpacing.$VALUES.clone();
    }
}
