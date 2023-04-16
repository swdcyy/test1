package com.horcrux.svg.TextProperties$TextPathMethod;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class TextProperties$TextPathMethod extends Enum	// class@000611
{
    public static final TextProperties$TextPathMethod[] $VALUES;
    public static final TextProperties$TextPathMethod align;
    public static final TextProperties$TextPathMethod stretch;

    static {
       TextProperties$TextPathMethod textPathMeth = new TextProperties$TextPathMethod("align", 0);
       TextProperties$TextPathMethod.align = textPathMeth;
       TextProperties$TextPathMethod textPathMeth1 = new TextProperties$TextPathMethod("stretch", 1);
       TextProperties$TextPathMethod.stretch = textPathMeth1;
       TextProperties$TextPathMethod[] textPathMeth2 = new TextProperties$TextPathMethod[]{textPathMeth,textPathMeth1};
       TextProperties$TextPathMethod.$VALUES = textPathMeth2;
    }
    public void TextProperties$TextPathMethod(String p0,int p1){
       super(p0, p1);
    }
    public static TextProperties$TextPathMethod valueOf(String p0){
       return Enum.valueOf(TextProperties$TextPathMethod.class, p0);
    }
    public static TextProperties$TextPathMethod[] values(){
       return TextProperties$TextPathMethod.$VALUES.clone();
    }
}
