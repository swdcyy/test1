package com.horcrux.svg.TextProperties$TextDecoration;
import java.lang.Enum;
import java.lang.String;
import java.util.HashMap;
import java.lang.Object;
import java.util.Map;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Class;

public final class TextProperties$TextDecoration extends Enum	// class@00060f
{
    public final String decoration;
    public static final TextProperties$TextDecoration[] $VALUES;
    public static final TextProperties$TextDecoration Blink;
    public static final TextProperties$TextDecoration LineThrough;
    public static final TextProperties$TextDecoration None;
    public static final TextProperties$TextDecoration Overline;
    public static final TextProperties$TextDecoration Underline;
    public static final Map decorationToEnum;

    static {
       int i = 0;
       TextProperties$TextDecoration textDecorati = new TextProperties$TextDecoration("None", i, "none");
       TextProperties$TextDecoration.None = textDecorati;
       int i1 = 1;
       TextProperties$TextDecoration textDecorati1 = new TextProperties$TextDecoration("Underline", i1, "underline");
       TextProperties$TextDecoration.Underline = textDecorati1;
       TextProperties$TextDecoration textDecorati2 = new TextProperties$TextDecoration("Overline", 2, "overline");
       TextProperties$TextDecoration.Overline = textDecorati2;
       TextProperties$TextDecoration textDecorati3 = new TextProperties$TextDecoration("LineThrough", 3, "line-through");
       TextProperties$TextDecoration.LineThrough = textDecorati3;
       TextProperties$TextDecoration textDecorati4 = new TextProperties$TextDecoration("Blink", 4, "blink");
       TextProperties$TextDecoration.Blink = textDecorati4;
       TextProperties$TextDecoration[] textDecorati5 = new TextProperties$TextDecoration[]{textDecorati,textDecorati1,textDecorati2,textDecorati3,textDecorati4};
       TextProperties$TextDecoration.$VALUES = textDecorati5;
       TextProperties$TextDecoration.decorationToEnum = new HashMap();
       TextProperties$TextDecoration[] textDecorati6 = TextProperties$TextDecoration.values();
       int len = textDecorati6.length;
       for (; i < len; i = i + 1) {
          object oobject = textDecorati6[i];
          TextProperties$TextDecoration.decorationToEnum.put(oobject.decoration, oobject);
       }
    }
    public void TextProperties$TextDecoration(String p0,int p1,String p2){
       super(p0, p1);
       this.decoration = p2;
    }
    public static TextProperties$TextDecoration getEnum(String p0){
       Map decorationTo = TextProperties$TextDecoration.decorationToEnum;
       if (decorationTo.containsKey(p0)) {
          return decorationTo.get(p0);
       }
       throw new IllegalArgumentException("Unknown String Value: "+p0);
    }
    public static TextProperties$TextDecoration valueOf(String p0){
       return Enum.valueOf(TextProperties$TextDecoration.class, p0);
    }
    public static TextProperties$TextDecoration[] values(){
       return TextProperties$TextDecoration.$VALUES.clone();
    }
    public String toString(){
       return this.decoration;
    }
}
