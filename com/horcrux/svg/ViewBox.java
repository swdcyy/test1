package com.horcrux.svg.ViewBox;
import java.lang.Object;
import android.graphics.RectF;
import java.lang.String;
import android.graphics.Matrix;
import java.lang.Math;
import java.lang.CharSequence;

public class ViewBox	// class@000618
{

    public void ViewBox(){
       super();
    }
    public static Matrix getTransform(RectF p0,RectF p1,String p2,int p3){
       RectF rectF = p0;
       RectF rectF1 = p1;
       double d = (double)p0.width();
       double d1 = (double)p0.height();
       double d2 = (double)p1.width();
       double d3 = (double)p1.height();
       double d4 = d2 / d;
       double d5 = d;
       d = d3 / d1;
       double d6 = (double)rectF1.left - ((double)rectF.left * d4);
       double d7 = (double)rectF1.top - ((double)rectF.top * d);
       double d8 = d3;
       int i = p3;
       if (i == 2) {
          d3 = Math.min(d4, d);
          if (d3 - 0x3ff0000000000000 > 0) {
             d6 = d6 - (((d2 / d3) - d5) / 2.00f);
             d2 = (d8 / d3) - d1;
          }else {
             double d9 = 2.00f;
             d6 = d6 - ((d2 - (d5 * d3)) / d9);
             d2 = d8 - (d1 * d3);
          }
          d7 = d7 - (d2 / 2.00f);
          d = d3;
       }else {
          String str = "none";
          String str1 = p2;
          if (!str1.equals(str) && !i) {
             d4 = Math.min(d4, d);
          }else if(!str1.equals(str) && i == 1){
             d4 = Math.max(d4, d);
          }else if(str1.contains("xMid")){
             d6 = d6 + ((d2 - (d5 * d4)) / 2.00f);
          }
          if (str1.contains("xMax")) {
             d6 = d6 + (d2 - (d5 * d4));
          }
          if (str1.contains("YMid")) {
             d7 = d7 + ((d8 - (d1 * d)) / 2.00f);
          }
          if (str1.contains("YMax")) {
             d7 = d7 + (d8 - (d1 * d));
          }
          d3 = d4;
          d = d4;
          goto label_0082 ;
       }
       Matrix matrix = new Matrix();
       matrix.postTranslate((float)d6, (float)d7);
       matrix.preScale((float)d3, (float)d);
       return matrix;
    }
}
