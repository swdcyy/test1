package o1.a;
import android.content.res.Resources;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources$Theme;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import android.content.res.XmlResourceParser;
import ll8.c$b;
import android.content.res.TypedArray;
import android.util.StateSet;
import o1.e;
import java.lang.System;
import android.graphics.Color;
import java.lang.Math;

public final class a	// class@002735
{

    public static ColorStateList a(Resources p0,XmlPullParser p1,Resources$Theme p2){
       int i;
       AttributeSet uAttributeSe = Xml.asAttributeSet(p1);
       do {
          i = p1.next();
       } while (i != 2 && i != 1);
       if (i == 2) {
          return a.b(p0, p1, uAttributeSe, p2);
       }
       throw new XmlPullParserException("No start tag found");
    }
    public static ColorStateList b(Resources p0,XmlPullParser p1,AttributeSet p2,Resources$Theme p3){
       String name = p1.getName();
       if (name.equals("selector")) {
          return a.d(p0, p1, p2, p3);
       }
       throw new XmlPullParserException(p1.getPositionDescription()+": invalid color state list tag "+name);
    }
    public static ColorStateList c(Resources p0,int p1,Resources$Theme p2){
       try{
          return a.a(p0, p0.getXml(p1), p2);
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public static ColorStateList d(Resources p0,XmlPullParser p1,AttributeSet p2,Resources$Theme p3){
       AttributeSet uAttributeSe = p2;
       int i = 1;
       int i1 = p1.getDepth() + i;
       int[][] ointArray = new int[][20];
       int[] ointArray1 = new int[20];
       int i2 = 0;
       int i3 = p1.next();
       while (i3 != i) {
          int depth = p1.getDepth();
          if (depth >= i1 || i3 != 3) {
             int[] ointArray2 = 2;
             if (i3 == ointArray2 && (depth > i1 || !(p1.getName()).equals("item"))) {
                int i4 = p3;
             }else {
                TypedArray typedArray = a.f(p0, p3, uAttributeSe, c$b.R);
                int color = typedArray.getColor(0, -65281);
                float f = 0x3f800000;
                if (typedArray.hasValue(i)) {
                   f = typedArray.getFloat(i, f);
                }else if(typedArray.hasValue(ointArray2)){
                   f = typedArray.getFloat(ointArray2, f);
                }
                typedArray.recycle();
                i3 = p2.getAttributeCount();
                ointArray2 = new int[i3];
                int i5 = 0;
                int i6 = 0;
                while (i5 < i3) {
                   int attributeNam = uAttributeSe.getAttributeNameResource(i5);
                   if (attributeNam != 0x10101a5 && (attributeNam != 0x101031f && attributeNam != 0x7f040107)) {
                      i = i6 + 1;
                      if (!uAttributeSe.getAttributeBooleanValue(i5, 0)) {
                         attributeNam = - attributeNam;
                      }
                      ointArray2[i6] = attributeNam;
                      i6 = i;
                   }
                label_0087 :
                   i5 = i5 + 1;
                   int[] ointArray3 = 1;
                }
                ointArray1 = e.a(ointArray1, i2, a.e(color, f));
                i2 = i2 + 1;
                ointArray = e.b(ointArray, i2, StateSet.trimStateSet(ointArray2, i6));
             }
             i = 1;
          }else {
             break ;
          }
       }
       int[] ointArray4 = new int[i2];
       int[][] ointArray5 = new int[][i2];
       System.arraycopy(ointArray1, 0, ointArray4, 0, i2);
       System.arraycopy(ointArray, 0, ointArray5, 0, i2);
       return new ColorStateList(ointArray5, ointArray4);
    }
    public static int e(int p0,float p1){
       return ((p0 & 0xffffff) | (Math.round(((float)Color.alpha(p0) * p1)) << 24));
    }
    public static TypedArray f(Resources p0,Resources$Theme p1,AttributeSet p2,int[] p3){
       TypedArray typedArray = (p1 == null)? p0.obtainAttributes(p2, p3): p1.obtainStyledAttributes(p2, p3, 0, 0);
       return typedArray;
    }
}
