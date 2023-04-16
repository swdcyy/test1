package o1.d;
import o1.d$a;
import android.content.res.Resources;
import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import android.content.res.Resources$Theme;
import android.graphics.Shader;
import java.lang.String;
import java.lang.Object;
import ll8.c$b;
import android.content.res.TypedArray;
import o1.g;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.SweepGradient;
import android.graphics.RadialGradient;
import org.xmlpull.v1.XmlPullParserException;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Float;
import java.util.List;

public final class d	// class@00273d
{

    public static d$a a(d$a p0,int p1,int p2,boolean p3,int p4){
       if (p0 != null) {
          return p0;
       }
       if (p3) {
          return new d$a(p1, p4, p2);
       }
       return new d$a(p1, p2);
    }
    public static Shader b(Resources p0,XmlPullParser p1,AttributeSet p2,Resources$Theme p3){
       XmlPullParser xmlPullParse = p1;
       String name = p1.getName();
       if (!name.equals("gradient")) {
          throw new XmlPullParserException(p1.getPositionDescription()+": invalid gradient color tag "+name);
       }
       TypedArray typedArray = g.k(p0, p3, p2, c$b.Y0);
       float f = g.f(typedArray, xmlPullParse, "startX", 8, 0);
       float f1 = g.f(typedArray, xmlPullParse, "startY", 9, 0);
       float f2 = g.f(typedArray, xmlPullParse, "endX", 10, 0);
       float f3 = g.f(typedArray, xmlPullParse, "endY", 11, 0);
       float f4 = g.f(typedArray, xmlPullParse, "centerY", 4, 0);
       int i = g.g(typedArray, xmlPullParse, "type", 2, 0);
       int i1 = g.g(typedArray, xmlPullParse, "tileMode", 6, 0);
       float f5 = g.f(typedArray, xmlPullParse, "centerX", 3, 0);
       float f6 = g.f(typedArray, xmlPullParse, "gradientRadius", 5, 0);
       typedArray.recycle();
       d$a uoa = d.a(d.c(p0, p1, p2, p3), g.b(typedArray, xmlPullParse, "startColor", 0, 0), g.b(typedArray, xmlPullParse, "endColor", 1, 0), g.j(xmlPullParse, "centerColor"), g.b(typedArray, xmlPullParse, "centerColor", 7, 0));
       if (i != 1) {
          if (i == 2) {
             return new SweepGradient(f5, f4, uoa.a, uoa.b);
          }
          LinearGradient linearGradie = new LinearGradient(f, f1, f2, f3, uoa.a, uoa.b, d.d(i1));
          return typedArray;
       }else {
          float f7 = f5;
          if (f6 <= 0) {
             throw new XmlPullParserException("<gradient> tag requires \'gradientRadius\' attribute with radial type");
          }
          RadialGradient radialGradie = new RadialGradient(f7, f4, f6, uoa.a, uoa.b, d.d(i1));
          return typedArray;
       }
    }
    public static d$a c(Resources p0,XmlPullParser p1,AttributeSet p2,Resources$Theme p3){
       int i = p1.getDepth() + 1;
       int i1 = 20;
       ArrayList uArrayList = new ArrayList(i1);
       ArrayList uArrayList1 = new ArrayList(i1);
       while (true) {
          i1 = p1.next();
          if (i1 != 1) {
             int depth = p1.getDepth();
             if (depth >= i || i1 != 3) {
                if (i1 == 2 && (depth > i || !(p1.getName()).equals("item"))) {
                   continue ;
                }else {
                   TypedArray typedArray = g.k(p0, p3, p2, c$b.Z0);
                   depth = 0;
                   boolean b = typedArray.hasValue(1);
                   if (!typedArray.hasValue(depth) || !b) {
                      throw new XmlPullParserException(p1.getPositionDescription()+": <item> tag requires a \'color\' attribute and a \'offset\' attribute!");
                   }
                   typedArray.recycle();
                   uArrayList1.add(Integer.valueOf(typedArray.getColor(depth, depth)));
                   uArrayList.add(Float.valueOf(typedArray.getFloat(1, 0)));
                }
             }else if(uArrayList1.size() > 0){
                return new d$a(uArrayList1, uArrayList);
             }else {
                break ;
             }
          }else {
             goto label_007d ;
          }
       }
       return null;
    }
    public static Shader$TileMode d(int p0){
       if (p0 == 1) {
          return Shader$TileMode.REPEAT;
       }
       if (p0 != 2) {
          return Shader$TileMode.CLAMP;
       }
       return Shader$TileMode.MIRROR;
    }
}
