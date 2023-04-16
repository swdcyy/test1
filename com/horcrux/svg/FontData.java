package com.horcrux.svg.FontData;
import java.lang.Object;
import com.horcrux.svg.TextProperties$FontStyle;
import com.horcrux.svg.TextProperties$FontWeight;
import com.horcrux.svg.TextProperties$FontVariantLigatures;
import com.horcrux.svg.TextProperties$TextAnchor;
import com.horcrux.svg.TextProperties$TextDecoration;
import com.facebook.react.bridge.ReadableMap;
import java.lang.String;
import com.facebook.react.bridge.ReadableType;
import com.horcrux.svg.FontData$AbsoluteFontWeight;
import java.lang.Double;
import java.lang.Math;
import com.horcrux.svg.PropHelper;

public class FontData	// class@0005a4
{
    public int absoluteFontWeight;
    public final ReadableMap fontData;
    public final String fontFamily;
    public final String fontFeatureSettings;
    public final double fontSize;
    public final TextProperties$FontStyle fontStyle;
    public final TextProperties$FontVariantLigatures fontVariantLigatures;
    public final String fontVariationSettings;
    public TextProperties$FontWeight fontWeight;
    public final double kerning;
    public final double letterSpacing;
    public final boolean manualKerning;
    public final TextProperties$TextAnchor textAnchor;
    public final TextProperties$TextDecoration textDecoration;
    public final double wordSpacing;
    public static final FontData Defaults;

    static {
       FontData.Defaults = new FontData();
    }
    public void FontData(){
       super();
       this.fontData = null;
       this.fontFamily = "";
       this.fontStyle = TextProperties$FontStyle.normal;
       this.fontWeight = TextProperties$FontWeight.Normal;
       this.absoluteFontWeight = 400;
       this.fontFeatureSettings = "";
       this.fontVariationSettings = "";
       this.fontVariantLigatures = TextProperties$FontVariantLigatures.normal;
       this.textAnchor = TextProperties$TextAnchor.start;
       this.textDecoration = TextProperties$TextDecoration.None;
       this.manualKerning = false;
       this.kerning = 0;
       this.fontSize = 12.00f;
       this.wordSpacing = 0;
       this.letterSpacing = 0;
    }
    public void FontData(ReadableMap p0,FontData p1,double p2){
       TextProperties$TextDecoration str5;
       int str5;
       super();
       FontData fontSize = p1.fontSize;
       this.fontSize = (p0.hasKey("fontSize"))? this.toAbsolute(p0, "fontSize", 0x3ff0000000000000, fontSize, fontSize): fontSize;
       String str = "fontWeight";
       if (p0.hasKey(str)) {
          if (p0.getType(str) == ReadableType.Number) {
             this.handleNumericWeight(p1, p0.getDouble(str));
          }else {
             str = p0.getString(str);
             if (TextProperties$FontWeight.hasEnum(str)) {
                str5 = FontData$AbsoluteFontWeight.from(TextProperties$FontWeight.get(str), p1);
                this.absoluteFontWeight = str5;
                this.fontWeight = FontData$AbsoluteFontWeight.nearestFontWeight(str5);
             }else if(str != null){
                this.handleNumericWeight(p1, Double.parseDouble(str));
             }else {
                this.setInheritedWeight(p1);
             }
          }
       }else {
          this.setInheritedWeight(p1);
       }
       str = "fontData";
       ReadableMap str1 = (p0.hasKey(str))? p0.getMap(str): p1.fontData;
       this.fontData = str1;
       str = "fontFamily";
       str = (p0.hasKey(str))? p0.getString(str): p1.fontFamily;
       this.fontFamily = str;
       str = "fontStyle";
       TextProperties$FontStyle str2 = (p0.hasKey(str))? TextProperties$FontStyle.valueOf(p0.getString(str)): p1.fontStyle;
       this.fontStyle = str2;
       str = "fontFeatureSettings";
       str = (p0.hasKey(str))? p0.getString(str): p1.fontFeatureSettings;
       this.fontFeatureSettings = str;
       str = "fontVariationSettings";
       str = (p0.hasKey(str))? p0.getString(str): p1.fontVariationSettings;
       this.fontVariationSettings = str;
       str = "fontVariantLigatures";
       TextProperties$FontVariantLigatures str3 = (p0.hasKey(str))? TextProperties$FontVariantLigatures.valueOf(p0.getString(str)): p1.fontVariantLigatures;
       this.fontVariantLigatures = str3;
       str = "textAnchor";
       TextProperties$TextAnchor str4 = (p0.hasKey(str))? TextProperties$TextAnchor.valueOf(p0.getString(str)): p1.textAnchor;
       this.textAnchor = str4;
       str = "textDecoration";
       str5 = (p0.hasKey(str))? TextProperties$TextDecoration.getEnum(p0.getString(str)): p1.textDecoration;
       this.textDecoration = str5;
       str5 = p0.hasKey("kerning");
       boolean b = (str5 || p1.manualKerning != null)? true: false;
       this.manualKerning = b;
       FontData double str51 = (str5)? this.toAbsolute(p0, "kerning", p2, this.fontSize, 0): p1.kerning;
       this.kerning = str51;
       str51 = (p0.hasKey("wordSpacing"))? this.toAbsolute(p0, "wordSpacing", p2, this.fontSize, 0): p1.wordSpacing;
       this.wordSpacing = str51;
       double d = (p0.hasKey("letterSpacing"))? this.toAbsolute(p0, "letterSpacing", p2, this.fontSize, 0): p1.letterSpacing;
       this.letterSpacing = d;
       return;
    }
    public final void handleNumericWeight(FontData p0,double p1){
       long l = Math.round(p1);
       if (l - 1 >= 0 && l - 1000 <= 0) {
          int i = (int)l;
          this.absoluteFontWeight = i;
          this.fontWeight = FontData$AbsoluteFontWeight.nearestFontWeight(i);
       }else {
          this.setInheritedWeight(p0);
       }
       return;
    }
    public final void setInheritedWeight(FontData p0){
       this.absoluteFontWeight = p0.absoluteFontWeight;
       this.fontWeight = p0.fontWeight;
    }
    public final double toAbsolute(ReadableMap p0,String p1,double p2,double p3,double p4){
       if (p0.getType(p1) == ReadableType.Number) {
          return p0.getDouble(p1);
       }
       return PropHelper.fromRelative(p0.getString(p1), p4, p2, p3);
    }
}
