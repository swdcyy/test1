package com.horcrux.svg.TextProperties$FontStyle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class TextProperties$FontStyle extends Enum	// class@00060b
{
    public static final TextProperties$FontStyle[] $VALUES;
    public static final TextProperties$FontStyle italic;
    public static final TextProperties$FontStyle normal;
    public static final TextProperties$FontStyle oblique;

    static {
       TextProperties$FontStyle uFontStyle = new TextProperties$FontStyle("normal", 0);
       TextProperties$FontStyle.normal = uFontStyle;
       TextProperties$FontStyle uFontStyle1 = new TextProperties$FontStyle("italic", 1);
       TextProperties$FontStyle.italic = uFontStyle1;
       TextProperties$FontStyle uFontStyle2 = new TextProperties$FontStyle("oblique", 2);
       TextProperties$FontStyle.oblique = uFontStyle2;
       TextProperties$FontStyle[] uFontStyleAr = new TextProperties$FontStyle[]{uFontStyle,uFontStyle1,uFontStyle2};
       TextProperties$FontStyle.$VALUES = uFontStyleAr;
    }
    public void TextProperties$FontStyle(String p0,int p1){
       super(p0, p1);
    }
    public static TextProperties$FontStyle valueOf(String p0){
       return Enum.valueOf(TextProperties$FontStyle.class, p0);
    }
    public static TextProperties$FontStyle[] values(){
       return TextProperties$FontStyle.$VALUES.clone();
    }
}
