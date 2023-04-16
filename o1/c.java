package o1.c;
import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;
import o1.c$a;
import org.xmlpull.v1.XmlPullParserException;
import java.lang.String;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.lang.Object;
import android.util.AttributeSet;
import android.util.Xml;
import ll8.c$b;
import o1.c$d;
import x1.d;
import o1.c$c;
import o1.c$b;
import android.util.Base64;

public class c	// class@00273b
{

    public static int a(TypedArray p0,int p1){
       return p0.getType(p1);
    }
    public static c$a b(XmlPullParser p0,Resources p1){
       int i;
       do {
          i = p0.next();
       } while (i != 2 && i != 1);
       if (i == 2) {
          return c.d(p0, p1);
       }
       throw new XmlPullParserException("No start tag found");
    }
    public static List c(Resources p0,int p1){
       if (!p1) {
          return Collections.emptyList();
       }
       TypedArray typedArray = p0.obtainTypedArray(p1);
       if (!typedArray.length()) {
          typedArray.recycle();
          return Collections.emptyList();
       }else {
          ArrayList uArrayList = new ArrayList();
          if (c.a(typedArray, 0) == 1) {
             p1 = 0;
             while (p1 < typedArray.length()) {
                int resourceId = typedArray.getResourceId(p1, 0);
                if (resourceId) {
                   uArrayList.add(c.h(p0.getStringArray(resourceId)));
                }
                p1++;
             }
          }else {
             uArrayList.add(c.h(p0.getStringArray(p1)));
          }
          typedArray.recycle();
          return uArrayList;
       }
    }
    public static c$a d(XmlPullParser p0,Resources p1){
       p0.require(2, null, "font-family");
       if ((p0.getName()).equals("font-family")) {
          return c.e(p0, p1);
       }
       c.g(p0);
       return null;
    }
    public static c$a e(XmlPullParser p0,Resources p1){
       TypedArray typedArray = p1.obtainAttributes(Xml.asAttributeSet(p0), c$b.R0);
       String str = typedArray.getString(0);
       String str1 = typedArray.getString(4);
       String str2 = typedArray.getString(5);
       int resourceId = typedArray.getResourceId(1, 0);
       int integer = typedArray.getInteger(2, 1);
       int integer1 = typedArray.getInteger(3, 500);
       String str3 = typedArray.getString(6);
       typedArray.recycle();
       if (str != null && (str1 != null && str2 != null)) {
          while (p0.next() != 3) {
             c.g(p0);
          }
          return new c$d(new d(str, str1, str2, c.c(p1, resourceId)), integer, integer1, str3);
       }else {
          ArrayList uArrayList = new ArrayList();
          while (p0.next() != 3) {
             if (p0.getEventType() != 2) {
                continue ;
             }else if((p0.getName()).equals("font")){
                uArrayList.add(c.f(p0, p1));
             }else {
                c.g(p0);
             }
          }
          if (uArrayList.isEmpty()) {
             return null;
          }
          c$c[] uocArray = new c$c[uArrayList.size()];
          return new c$b(uArrayList.toArray(uocArray));
       }
    }
    public static c$c f(XmlPullParser p0,Resources p1){
       TypedArray typedArray = p1.obtainAttributes(Xml.asAttributeSet(p0), c$b.S0);
       int i = 8;
       int b = true;
       if (typedArray.hasValue(i)) {
       }else {
          i = 1;
       }
       int intx = typedArray.getInt(i, 400);
       i = 6;
       if (!typedArray.hasValue(i)) {
          i = 2;
       }
       boolean b1 = (b == typedArray.getInt(i, 0))? true: false;
       i = 9;
       int i1 = 3;
       if (!typedArray.hasValue(i)) {
          i = 3;
       }
       b = 7;
       if (!typedArray.hasValue(b)) {
          b = 4;
       }
       String str = typedArray.getString(b);
       int intx1 = typedArray.getInt(i, 0);
       i = 5;
       if (!typedArray.hasValue(i)) {
          i = 0;
       }
       int resourceId = typedArray.getResourceId(i, 0);
       String str1 = typedArray.getString(i);
       typedArray.recycle();
       while (p0.next() != i1) {
          c.g(p0);
       }
       c$c uoc = new c$c(str1, intx, b1, str, intx1, resourceId);
       return p0;
    }
    public static void g(XmlPullParser p0){
       int i = 1;
       while (i > 0) {
          int i1 = p0.next();
          if (i1 != 2) {
             if (i1 != 3) {
                continue ;
             }else {
                i = i - 1;
             }
          }else {
             i = i + 1;
          }
       }
       return;
    }
    public static List h(String[] p0){
       ArrayList uArrayList = new ArrayList();
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          uArrayList.add(Base64.decode(p0[i], 0));
       }
       return uArrayList;
    }
}
