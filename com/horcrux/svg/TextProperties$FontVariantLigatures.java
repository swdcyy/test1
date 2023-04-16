package com.horcrux.svg.TextProperties$FontVariantLigatures;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class TextProperties$FontVariantLigatures extends Enum	// class@00060c
{
    public static final TextProperties$FontVariantLigatures[] $VALUES;
    public static final TextProperties$FontVariantLigatures none;
    public static final TextProperties$FontVariantLigatures normal;

    static {
       TextProperties$FontVariantLigatures uFontVariant = new TextProperties$FontVariantLigatures("normal", 0);
       TextProperties$FontVariantLigatures.normal = uFontVariant;
       TextProperties$FontVariantLigatures uFontVariant1 = new TextProperties$FontVariantLigatures("none", 1);
       TextProperties$FontVariantLigatures.none = uFontVariant1;
       TextProperties$FontVariantLigatures[] uFontVariant2 = new TextProperties$FontVariantLigatures[]{uFontVariant,uFontVariant1};
       TextProperties$FontVariantLigatures.$VALUES = uFontVariant2;
    }
    public void TextProperties$FontVariantLigatures(String p0,int p1){
       super(p0, p1);
    }
    public static TextProperties$FontVariantLigatures valueOf(String p0){
       return Enum.valueOf(TextProperties$FontVariantLigatures.class, p0);
    }
    public static TextProperties$FontVariantLigatures[] values(){
       return TextProperties$FontVariantLigatures.$VALUES.clone();
    }
}
