package o1.g;
import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;
import java.lang.String;
import android.content.res.Resources$Theme;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.content.res.Resources;
import o1.a;
import java.lang.UnsupportedOperationException;
import java.lang.StringBuilder;
import java.lang.Object;
import o1.b;
import android.util.AttributeSet;

public class g	// class@002746
{

    public static boolean a(TypedArray p0,XmlPullParser p1,String p2,int p3,boolean p4){
       if (!g.j(p1, p2)) {
          return p4;
       }
       return p0.getBoolean(p3, p4);
    }
    public static int b(TypedArray p0,XmlPullParser p1,String p2,int p3,int p4){
       if (!g.j(p1, p2)) {
          return p4;
       }
       return p0.getColor(p3, p4);
    }
    public static ColorStateList c(TypedArray p0,XmlPullParser p1,Resources$Theme p2,String p3,int p4){
       if (!g.j(p1, p3)) {
          return null;
       }
       TypedValue typedValue = new TypedValue();
       p0.getValue(p4, typedValue);
       TypedValue type = typedValue.type;
       if (type == 2) {
          throw new UnsupportedOperationException("Failed to resolve attribute at index "+p4+": "+typedValue);
       }
       if (type >= 28 && type <= 31) {
          return g.d(typedValue);
       }
       return a.c(p0.getResources(), p0.getResourceId(p4, 0), p2);
    }
    public static ColorStateList d(TypedValue p0){
       return ColorStateList.valueOf(p0.data);
    }
    public static b e(TypedArray p0,XmlPullParser p1,Resources$Theme p2,String p3,int p4,int p5){
       if (g.j(p1, p3)) {
          TypedValue typedValue = new TypedValue();
          p0.getValue(p4, typedValue);
          TypedValue type = typedValue.type;
          if (type >= 28 && type <= 31) {
             return b.b(typedValue.data);
          }else {
             b uob = b.g(p0.getResources(), p0.getResourceId(p4, 0), p2);
             if (uob != null) {
                return uob;
             }
          }
       }
       return b.b(p5);
    }
    public static float f(TypedArray p0,XmlPullParser p1,String p2,int p3,float p4){
       if (!g.j(p1, p2)) {
          return p4;
       }
       return p0.getFloat(p3, p4);
    }
    public static int g(TypedArray p0,XmlPullParser p1,String p2,int p3,int p4){
       if (!g.j(p1, p2)) {
          return p4;
       }
       return p0.getInt(p3, p4);
    }
    public static int h(TypedArray p0,XmlPullParser p1,String p2,int p3,int p4){
       if (!g.j(p1, p2)) {
          return p4;
       }
       return p0.getResourceId(p3, p4);
    }
    public static String i(TypedArray p0,XmlPullParser p1,String p2,int p3){
       if (!g.j(p1, p2)) {
          return null;
       }
       return p0.getString(p3);
    }
    public static boolean j(XmlPullParser p0,String p1){
       boolean b = (p0.getAttributeValue("http://schemas.android.com/apk/res/android", p1) != null)? true: false;
       return b;
    }
    public static TypedArray k(Resources p0,Resources$Theme p1,AttributeSet p2,int[] p3){
       if (p1 == null) {
          return p0.obtainAttributes(p2, p3);
       }
       return p1.obtainStyledAttributes(p2, p3, 0, 0);
    }
    public static TypedValue l(TypedArray p0,XmlPullParser p1,String p2,int p3){
       if (!g.j(p1, p2)) {
          return null;
       }
       return p0.peekValue(p3);
    }
}
