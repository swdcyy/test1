package com.horcrux.svg.PropHelper;
import java.lang.Object;
import com.horcrux.svg.SVGLength;
import com.horcrux.svg.PropHelper$1;
import java.lang.Enum;
import java.lang.String;
import java.lang.Double;
import java.util.Objects;
import com.facebook.react.bridge.ReadableArray;

public class PropHelper	// class@0005b5
{

    public void PropHelper(){
       super();
    }
    public static double fromRelative(SVGLength p0,double p1,double p2,double p3,double p4){
       double d;
       if (p0 == null) {
          return p2;
       }
       SVGLength value = p0.value;
       switch (PropHelper$1.$SwitchMap$com$horcrux$svg$SVGLength$UnitType[p0.unit.ordinal()]){
           case 1:
           case 2:
             p4 = 0x3ff0000000000000;
          label_003b :
             value = value * p4;
             break;
           case 3:
             d = (value / 100.00f) * p1;
             break;
           case 4:
             goto label_003b ;
           case 5:
             p4 = p4 / 2.00f;
             goto label_003b ;
             break;
           case 6:
             p4 = 35.43f;
             goto label_003b ;
             break;
           case 7:
             p4 = 3.54f;
             goto label_003b ;
             break;
           case 8:
             p4 = 90.00f;
             goto label_003b ;
             break;
           case 9:
             p4 = 0x3ff4000000000000;
             goto label_003b ;
             break;
           case 10:
             p4 = 15.00f;
             goto label_003b ;
             break;
           default:
             d = value * p3;
       }
       return (d + p2);
    }
    public static double fromRelative(String p0,double p1,double p2,double p3){
       double d;
       p0 = p0.trim();
       int i = p0.length();
       int i1 = i - 1;
       if (!i || p0.equals("normal")) {
          return 0;
       }
       if (p0.codePointAt(i1) == 37) {
          return ((Double.valueOf(p0.substring(0, i1)).doubleValue() / 100.00f) * p1);
       }
       int i2 = i - 2;
       if (i2 > 0) {
          String str = p0.substring(i2);
          Objects.requireNonNull(str);
          int i3 = -1;
          switch (str.hashCode()){
              case 3178:
                if (str.equals("cm")) {
                   i3 = 0;
                }
                break;
              case 3240:
                if (str.equals("em")) {
                   i3 = 1;
                }
                break;
              case 3365:
                if (str.equals("in")) {
                   i3 = 2;
                }
                break;
              case 3488:
                if (str.equals("mm")) {
                   i3 = 3;
                }
                break;
              case 3571:
                if (str.equals("pc")) {
                   i3 = 4;
                }
                break;
              case 3588:
                if (str.equals("pt")) {
                   i3 = 5;
                }
                break;
              case 3592:
                if (str.equals("px")) {
                   i3 = 6;
                }
                break;
              default:
          }
          switch (i3){
              case 0:
                p3 = 35.43f;
              case 1:
             label_00ab :
                i = i2;
                break;
              case 2:
                p3 = 90.00f;
                goto label_00ab ;
                break;
              case 3:
                p3 = 3.54f;
                goto label_00ab ;
                break;
              case 4:
                p3 = 15.00f;
                goto label_00ab ;
                break;
              case 5:
                p3 = 0x3ff4000000000000;
                goto label_00ab ;
                break;
              case 6:
                i = i2;
             label_0098 :
                p3 = 0x3ff0000000000000;
                break;
              default:
                goto label_0098 ;
          }
          d = Double.valueOf(p0.substring(0, i)).doubleValue() * p3;
       }else {
          d = Double.valueOf(p0).doubleValue();
       }
       return (d * p2);
    }
    public static int toMatrixData(ReadableArray p0,float[] p1,float p2){
       int i = p0.size();
       if (i != 6) {
          return i;
       }
       p1[0] = (float)p0.getDouble(0);
       p1[1] = (float)p0.getDouble(2);
       p1[2] = (float)p0.getDouble(4) * p2;
       p1[3] = (float)p0.getDouble(1);
       p1[4] = (float)p0.getDouble(3);
       p1[5] = (float)p0.getDouble(5) * p2;
       return 6;
    }
}
