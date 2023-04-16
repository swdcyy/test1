package com.horcrux.svg.SVGLength;
import java.lang.Object;
import com.horcrux.svg.SVGLength$UnitType;
import java.lang.String;
import java.lang.Double;
import java.util.Objects;
import com.facebook.react.bridge.Dynamic;
import java.util.ArrayList;
import com.horcrux.svg.SVGLength$1;
import com.facebook.react.bridge.ReadableType;
import java.lang.Enum;
import com.facebook.react.bridge.ReadableArray;

public class SVGLength	// class@0005f2
{
    public final SVGLength$UnitType unit;
    public final double value;

    public void SVGLength(){
       super();
       this.value = 0;
       this.unit = SVGLength$UnitType.UNKNOWN;
    }
    public void SVGLength(double p0){
       super();
       this.value = p0;
       this.unit = SVGLength$UnitType.NUMBER;
    }
    public void SVGLength(String p0){
       super();
       p0 = p0.trim();
       int i = p0.length();
       int i1 = i - 1;
       if (!i || p0.equals("normal")) {
          this.unit = SVGLength$UnitType.UNKNOWN;
          this.value = 0;
       }else if(p0.codePointAt(i1) == 37){
          this.unit = SVGLength$UnitType.PERCENTAGE;
          this.value = Double.valueOf(p0.substring(0, i1)).doubleValue();
       }else {
          i1 = i - 2;
          if (i1 > 0) {
             String str = p0.substring(i1);
             Objects.requireNonNull(str);
             int i2 = -1;
             switch (str.hashCode()){
                 case 3178:
                   if (str.equals("cm")) {
                      i2 = 0;
                   }
                   break;
                 case 3240:
                   if (str.equals("em")) {
                      i2 = 1;
                   }
                   break;
                 case 3251:
                   if (str.equals("ex")) {
                      i2 = 2;
                   }
                   break;
                 case 3365:
                   if (str.equals("in")) {
                      i2 = 3;
                   }
                   break;
                 case 3488:
                   if (str.equals("mm")) {
                      i2 = 4;
                   }
                   break;
                 case 3571:
                   if (str.equals("pc")) {
                      i2 = 5;
                   }
                   break;
                 case 3588:
                   if (str.equals("pt")) {
                      i2 = 6;
                   }
                   break;
                 case 3592:
                   if (str.equals("px")) {
                      i2 = 7;
                   }
                   break;
                 default:
             }
             switch (i2){
                 case 0:
                   this.unit = SVGLength$UnitType.CM;
                label_00d1 :
                   i = i1;
                   break;
                 case 1:
                   this.unit = SVGLength$UnitType.EMS;
                   goto label_00d1 ;
                   break;
                 case 2:
                   this.unit = SVGLength$UnitType.EXS;
                   goto label_00d1 ;
                   break;
                 case 3:
                   this.unit = SVGLength$UnitType.IN;
                   goto label_00d1 ;
                   break;
                 case 4:
                   this.unit = SVGLength$UnitType.MM;
                   goto label_00d1 ;
                   break;
                 case 5:
                   this.unit = SVGLength$UnitType.PC;
                   goto label_00d1 ;
                   break;
                 case 6:
                   this.unit = SVGLength$UnitType.PT;
                   goto label_00d1 ;
                   break;
                 case 7:
                   this.unit = SVGLength$UnitType.NUMBER;
                   goto label_00d1 ;
                   break;
                 default:
                   this.unit = SVGLength$UnitType.NUMBER;
             }
             this.value = Double.valueOf(p0.substring(0, i)).doubleValue();
          }else {
             this.unit = SVGLength$UnitType.NUMBER;
             this.value = Double.valueOf(p0).doubleValue();
          }
       }
       return;
    }
    public static ArrayList arrayFrom(Dynamic p0){
       ArrayList uArrayList1;
       int i = SVGLength$1.$SwitchMap$com$facebook$react$bridge$ReadableType[p0.getType().ordinal()];
       int i1 = 1;
       if (i != i1) {
          if (i != 2) {
             if (i != 3) {
                return null;
             }
             ReadableArray readableArra = p0.asArray();
             i = readableArra.size();
             ArrayList uArrayList = new ArrayList(i);
             for (int i2 = 0; i2 < i; i2 = i2 + 1) {
                uArrayList.add(SVGLength.from(readableArra.getDynamic(i2)));
             }
             return uArrayList;
          }else {
             uArrayList1 = new ArrayList(i1);
             uArrayList1.add(new SVGLength(p0.asString()));
             return uArrayList1;
          }
       }else {
          uArrayList1 = new ArrayList(i1);
          uArrayList1.add(new SVGLength(p0.asDouble()));
          return uArrayList1;
       }
    }
    public static SVGLength from(Dynamic p0){
       int i = SVGLength$1.$SwitchMap$com$facebook$react$bridge$ReadableType[p0.getType().ordinal()];
       if (i == Double.MIN_VALUE) {
          return new SVGLength(p0.asDouble());
       }
       if (i != 2) {
          return new SVGLength();
       }
       return new SVGLength(p0.asString());
    }
    public static String toString(Dynamic p0){
       int i = SVGLength$1.$SwitchMap$com$facebook$react$bridge$ReadableType[p0.getType().ordinal()];
       if (i == 1) {
          return String.valueOf(p0.asDouble());
       }
       if (i != 2) {
          return null;
       }
       return p0.asString();
    }
}
