package com.horcrux.svg.FontData$AbsoluteFontWeight;
import com.horcrux.svg.TextProperties$FontWeight;
import java.lang.Object;
import com.horcrux.svg.FontData;
import java.lang.Enum;
import java.lang.Math;

public class FontData$AbsoluteFontWeight	// class@0005a3
{
    public static final TextProperties$FontWeight[] WEIGHTS;
    public static final int[] absoluteFontWeights;

    static {
       TextProperties$FontWeight[] uFontWeightA = new TextProperties$FontWeight[11];
       TextProperties$FontWeight w100 = TextProperties$FontWeight.w100;
       uFontWeightA[0] = w100;
       uFontWeightA[1] = w100;
       uFontWeightA[2] = TextProperties$FontWeight.w200;
       uFontWeightA[3] = TextProperties$FontWeight.w300;
       uFontWeightA[4] = TextProperties$FontWeight.Normal;
       uFontWeightA[5] = TextProperties$FontWeight.w500;
       uFontWeightA[6] = TextProperties$FontWeight.w600;
       uFontWeightA[7] = TextProperties$FontWeight.Bold;
       uFontWeightA[8] = TextProperties$FontWeight.w800;
       w100 = TextProperties$FontWeight.w900;
       uFontWeightA[9] = w100;
       uFontWeightA[10] = w100;
       FontData$AbsoluteFontWeight.WEIGHTS = uFontWeightA;
       FontData$AbsoluteFontWeight.absoluteFontWeights = new int[11]{400,700,'d',200,300,400,500,600,700,800,900};
    }
    public void FontData$AbsoluteFontWeight(){
       super();
    }
    public static int bolder(int p0){
       if (p0 < 350) {
          return 400;
       }
       if (p0 < 550) {
          return 700;
       }
       if (p0 < 900) {
          return 900;
       }
       return p0;
    }
    public static int from(TextProperties$FontWeight p0,FontData p1){
       if (p0 == TextProperties$FontWeight.Bolder) {
          return FontData$AbsoluteFontWeight.bolder(p1.absoluteFontWeight);
       }
       if (p0 == TextProperties$FontWeight.Lighter) {
          return FontData$AbsoluteFontWeight.lighter(p1.absoluteFontWeight);
       }
       return FontData$AbsoluteFontWeight.absoluteFontWeights[p0.ordinal()];
    }
    public static int lighter(int p0){
       int i = 100;
       if (p0 < i) {
          return p0;
       }
       if (p0 < 550) {
          return i;
       }
       if (p0 < 750) {
          return 400;
       }
       return 700;
    }
    public static TextProperties$FontWeight nearestFontWeight(int p0){
       return FontData$AbsoluteFontWeight.WEIGHTS[Math.round(((float)p0 / 100.00f))];
    }
}
