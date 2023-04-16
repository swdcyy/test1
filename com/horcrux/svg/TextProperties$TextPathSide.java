package com.horcrux.svg.TextProperties$TextPathSide;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class TextProperties$TextPathSide extends Enum	// class@000613
{
    public static final TextProperties$TextPathSide[] $VALUES;
    public static final TextProperties$TextPathSide left;
    public static final TextProperties$TextPathSide right;

    static {
       TextProperties$TextPathSide textPathSide = new TextProperties$TextPathSide("left", 0);
       TextProperties$TextPathSide.left = textPathSide;
       TextProperties$TextPathSide textPathSide1 = new TextProperties$TextPathSide("right", 1);
       TextProperties$TextPathSide.right = textPathSide1;
       TextProperties$TextPathSide[] textPathSide2 = new TextProperties$TextPathSide[]{textPathSide,textPathSide1};
       TextProperties$TextPathSide.$VALUES = textPathSide2;
    }
    public void TextProperties$TextPathSide(String p0,int p1){
       super(p0, p1);
    }
    public static TextProperties$TextPathSide valueOf(String p0){
       return Enum.valueOf(TextProperties$TextPathSide.class, p0);
    }
    public static TextProperties$TextPathSide[] values(){
       return TextProperties$TextPathSide.$VALUES.clone();
    }
}
