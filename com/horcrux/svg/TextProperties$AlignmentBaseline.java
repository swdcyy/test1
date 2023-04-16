package com.horcrux.svg.TextProperties$AlignmentBaseline;
import java.lang.Enum;
import java.lang.String;
import java.util.HashMap;
import java.lang.Object;
import java.util.Map;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Class;

public final class TextProperties$AlignmentBaseline extends Enum	// class@000609
{
    public final String alignment;
    public static final TextProperties$AlignmentBaseline[] $VALUES;
    public static final TextProperties$AlignmentBaseline afterEdge;
    public static final Map alignmentToEnum;
    public static final TextProperties$AlignmentBaseline alphabetic;
    public static final TextProperties$AlignmentBaseline baseline;
    public static final TextProperties$AlignmentBaseline beforeEdge;
    public static final TextProperties$AlignmentBaseline bottom;
    public static final TextProperties$AlignmentBaseline center;
    public static final TextProperties$AlignmentBaseline central;
    public static final TextProperties$AlignmentBaseline hanging;
    public static final TextProperties$AlignmentBaseline ideographic;
    public static final TextProperties$AlignmentBaseline mathematical;
    public static final TextProperties$AlignmentBaseline middle;
    public static final TextProperties$AlignmentBaseline textAfterEdge;
    public static final TextProperties$AlignmentBaseline textBeforeEdge;
    public static final TextProperties$AlignmentBaseline textBottom;
    public static final TextProperties$AlignmentBaseline textTop;
    public static final TextProperties$AlignmentBaseline top;

    static {
       TextProperties$AlignmentBaseline uAlignmentBa = new TextProperties$AlignmentBaseline("baseline", 0, "baseline");
       TextProperties$AlignmentBaseline.baseline = uAlignmentBa;
       TextProperties$AlignmentBaseline uAlignmentBa1 = new TextProperties$AlignmentBaseline("textBottom", 1, "text-bottom");
       TextProperties$AlignmentBaseline.textBottom = uAlignmentBa1;
       TextProperties$AlignmentBaseline uAlignmentBa2 = new TextProperties$AlignmentBaseline("alphabetic", 2, "alphabetic");
       TextProperties$AlignmentBaseline.alphabetic = uAlignmentBa2;
       TextProperties$AlignmentBaseline uAlignmentBa3 = new TextProperties$AlignmentBaseline("ideographic", 3, "ideographic");
       TextProperties$AlignmentBaseline.ideographic = uAlignmentBa3;
       TextProperties$AlignmentBaseline uAlignmentBa4 = new TextProperties$AlignmentBaseline("middle", 4, "middle");
       TextProperties$AlignmentBaseline.middle = uAlignmentBa4;
       TextProperties$AlignmentBaseline uAlignmentBa5 = new TextProperties$AlignmentBaseline("central", 5, "central");
       TextProperties$AlignmentBaseline.central = uAlignmentBa5;
       TextProperties$AlignmentBaseline uAlignmentBa6 = new TextProperties$AlignmentBaseline("mathematical", 6, "mathematical");
       TextProperties$AlignmentBaseline.mathematical = uAlignmentBa6;
       TextProperties$AlignmentBaseline uAlignmentBa7 = new TextProperties$AlignmentBaseline("textTop", 7, "text-top");
       TextProperties$AlignmentBaseline.textTop = uAlignmentBa7;
       TextProperties$AlignmentBaseline uAlignmentBa8 = new TextProperties$AlignmentBaseline("bottom", 8, "bottom");
       TextProperties$AlignmentBaseline.bottom = uAlignmentBa8;
       TextProperties$AlignmentBaseline uAlignmentBa9 = new TextProperties$AlignmentBaseline("center", 9, "center");
       TextProperties$AlignmentBaseline.center = uAlignmentBa9;
       TextProperties$AlignmentBaseline uAlignmentBa10 = new TextProperties$AlignmentBaseline("top", 10, "top");
       TextProperties$AlignmentBaseline.top = uAlignmentBa10;
       TextProperties$AlignmentBaseline uAlignmentBa11 = new TextProperties$AlignmentBaseline("textBeforeEdge", 11, "text-before-edge");
       TextProperties$AlignmentBaseline.textBeforeEdge = uAlignmentBa11;
       TextProperties$AlignmentBaseline uAlignmentBa12 = new TextProperties$AlignmentBaseline("textAfterEdge", 12, "text-after-edge");
       TextProperties$AlignmentBaseline.textAfterEdge = uAlignmentBa12;
       TextProperties$AlignmentBaseline uAlignmentBa13 = uAlignmentBa12;
       TextProperties$AlignmentBaseline uAlignmentBa14 = new TextProperties$AlignmentBaseline("beforeEdge", 13, "before-edge");
       TextProperties$AlignmentBaseline.beforeEdge = uAlignmentBa14;
       TextProperties$AlignmentBaseline uAlignmentBa15 = uAlignmentBa14;
       uAlignmentBa12 = new TextProperties$AlignmentBaseline("afterEdge", 14, "after-edge");
       TextProperties$AlignmentBaseline.afterEdge = uAlignmentBa12;
       TextProperties$AlignmentBaseline uAlignmentBa16 = uAlignmentBa12;
       uAlignmentBa14 = new TextProperties$AlignmentBaseline("hanging", 15, "hanging");
       TextProperties$AlignmentBaseline.hanging = uAlignmentBa14;
       TextProperties$AlignmentBaseline[] uAlignmentBa17 = new TextProperties$AlignmentBaseline[16];
       uAlignmentBa17[0] = uAlignmentBa;
       uAlignmentBa17[1] = uAlignmentBa1;
       uAlignmentBa17[2] = uAlignmentBa2;
       uAlignmentBa17[3] = uAlignmentBa3;
       uAlignmentBa17[4] = uAlignmentBa4;
       uAlignmentBa17[5] = uAlignmentBa5;
       uAlignmentBa17[6] = uAlignmentBa6;
       uAlignmentBa17[7] = uAlignmentBa7;
       uAlignmentBa17[8] = uAlignmentBa8;
       uAlignmentBa17[9] = uAlignmentBa9;
       uAlignmentBa17[10] = uAlignmentBa10;
       uAlignmentBa17[11] = uAlignmentBa11;
       uAlignmentBa17[12] = uAlignmentBa13;
       uAlignmentBa17[13] = uAlignmentBa15;
       uAlignmentBa17[14] = uAlignmentBa16;
       uAlignmentBa17[15] = uAlignmentBa14;
       TextProperties$AlignmentBaseline.$VALUES = uAlignmentBa17;
       TextProperties$AlignmentBaseline.alignmentToEnum = new HashMap();
       TextProperties$AlignmentBaseline[] uAlignmentBa18 = TextProperties$AlignmentBaseline.values();
       int len = uAlignmentBa18.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = uAlignmentBa18[i];
          TextProperties$AlignmentBaseline.alignmentToEnum.put(oobject.alignment, oobject);
       }
    }
    public void TextProperties$AlignmentBaseline(String p0,int p1,String p2){
       super(p0, p1);
       this.alignment = p2;
    }
    public static TextProperties$AlignmentBaseline getEnum(String p0){
       Map alignmentToE = TextProperties$AlignmentBaseline.alignmentToEnum;
       if (alignmentToE.containsKey(p0)) {
          return alignmentToE.get(p0);
       }
       throw new IllegalArgumentException("Unknown String Value: "+p0);
    }
    public static TextProperties$AlignmentBaseline valueOf(String p0){
       return Enum.valueOf(TextProperties$AlignmentBaseline.class, p0);
    }
    public static TextProperties$AlignmentBaseline[] values(){
       return TextProperties$AlignmentBaseline.$VALUES.clone();
    }
    public String toString(){
       return this.alignment;
    }
}
