package com.horcrux.svg.TextProperties$TextLengthAdjust;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class TextProperties$TextLengthAdjust extends Enum	// class@000610
{
    public static final TextProperties$TextLengthAdjust[] $VALUES;
    public static final TextProperties$TextLengthAdjust spacing;
    public static final TextProperties$TextLengthAdjust spacingAndGlyphs;

    static {
       TextProperties$TextLengthAdjust textLengthAd = new TextProperties$TextLengthAdjust("spacing", 0);
       TextProperties$TextLengthAdjust.spacing = textLengthAd;
       TextProperties$TextLengthAdjust textLengthAd1 = new TextProperties$TextLengthAdjust("spacingAndGlyphs", 1);
       TextProperties$TextLengthAdjust.spacingAndGlyphs = textLengthAd1;
       TextProperties$TextLengthAdjust[] textLengthAd2 = new TextProperties$TextLengthAdjust[]{textLengthAd,textLengthAd1};
       TextProperties$TextLengthAdjust.$VALUES = textLengthAd2;
    }
    public void TextProperties$TextLengthAdjust(String p0,int p1){
       super(p0, p1);
    }
    public static TextProperties$TextLengthAdjust valueOf(String p0){
       return Enum.valueOf(TextProperties$TextLengthAdjust.class, p0);
    }
    public static TextProperties$TextLengthAdjust[] values(){
       return TextProperties$TextLengthAdjust.$VALUES.clone();
    }
}
