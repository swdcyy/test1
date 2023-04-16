package com.horcrux.svg.TextProperties$TextPathMidLine;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class TextProperties$TextPathMidLine extends Enum	// class@000612
{
    public static final TextProperties$TextPathMidLine[] $VALUES;
    public static final TextProperties$TextPathMidLine sharp;
    public static final TextProperties$TextPathMidLine smooth;

    static {
       TextProperties$TextPathMidLine textPathMidL = new TextProperties$TextPathMidLine("sharp", 0);
       TextProperties$TextPathMidLine.sharp = textPathMidL;
       TextProperties$TextPathMidLine textPathMidL1 = new TextProperties$TextPathMidLine("smooth", 1);
       TextProperties$TextPathMidLine.smooth = textPathMidL1;
       TextProperties$TextPathMidLine[] textPathMidL2 = new TextProperties$TextPathMidLine[]{textPathMidL,textPathMidL1};
       TextProperties$TextPathMidLine.$VALUES = textPathMidL2;
    }
    public void TextProperties$TextPathMidLine(String p0,int p1){
       super(p0, p1);
    }
    public static TextProperties$TextPathMidLine valueOf(String p0){
       return Enum.valueOf(TextProperties$TextPathMidLine.class, p0);
    }
    public static TextProperties$TextPathMidLine[] values(){
       return TextProperties$TextPathMidLine.$VALUES.clone();
    }
}
