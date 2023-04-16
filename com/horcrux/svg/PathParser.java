package com.horcrux.svg.PathParser;
import java.lang.Object;
import java.lang.Math;
import android.graphics.RectF;
import android.graphics.Path;
import com.horcrux.svg.PathElement;
import com.horcrux.svg.ElementType;
import com.horcrux.svg.Point;
import java.util.ArrayList;
import java.lang.Character;
import java.lang.String;
import java.lang.Error;
import java.lang.Integer;
import java.lang.Float;

public class PathParser	// class@0005b0
{
    public static ArrayList elements;
    public static int i;
    public static int l;
    public static Path mPath;
    public static boolean mPenDown;
    public static float mPenDownX;
    public static float mPenDownY;
    public static float mPenX;
    public static float mPenY;
    public static float mPivotX;
    public static float mPivotY;
    public static float mScale;
    public static String s;

    public void PathParser(){
       super();
    }
    public static void arc(float p0,float p1,float p2,boolean p3,boolean p4,float p5,float p6){
       PathParser.arcTo(p0, p1, p2, p3, p4, (p5 + PathParser.mPenX), (p6 + PathParser.mPenY));
    }
    public static void arcTo(float p0,float p1,float p2,boolean p3,boolean p4,float p5,float p6){
       float f1;
       int i = p3;
       int i1 = p4;
       float mPenX = PathParser.mPenX;
       float mPenY = PathParser.mPenY;
       float f = 0;
       if (!p1 - f) {
          f1 = (!p0 - f)? p6 - mPenY: p0;
       }else {
          f1 = p1;
       }
       f1 = Math.abs(f1);
       float f2 = (!p0 - f)? p5 - mPenX: p0;
       f2 = Math.abs(f2);
       if (f2 - f && (!f1 - f || (!p5 - mPenX && !p6 - mPenY))) {
          PathParser.lineTo(p5, p6);
          return;
       }else {
          float f3 = (float)Math.toRadians((double)p2);
          double d = (double)f3;
          float f4 = (float)Math.cos(d);
          float f5 = (float)Math.sin(d);
          float f6 = p5 - mPenX;
          float f7 = p6 - mPenY;
          float f8 = 2.00f;
          float f9 = ((f4 * f6) / f8) + ((f5 * f7) / f8);
          float f10 = - f5;
          float f11 = ((f10 * f6) / f8) + ((f4 * f7) / f8);
          float f12 = f2 * f2;
          float f13 = (f12 * f1) * f1;
          float f14 = ((f1 * f1) * f9) * f9;
          f12 = (f12 * f11) * f11;
          float f15 = (f13 - f12) - f14;
          if (f15 - f < 0) {
             f13 = f10;
             f9 = (float)Math.sqrt((double)(0x3f800000 - (f15 / f13)));
             f2 = f2 * f9;
             f1 = f1 * f9;
             f8 = f6 / 2.00f;
             f9 = f7 / 2.00f;
          }else {
             f13 = f10;
             f8 = (float)Math.sqrt((double)(f15 / (f12 + f14)));
             if (i == i1) {
                f8 = - f8;
             }
             f10 = (((- f8) * f11) * f2) / f1;
             f8 = ((f8 * f9) * f1) / f2;
             f11 = 2.00f;
             f8 = ((f4 * f10) - (f5 * f8)) + (f6 / f11);
             f9 = (f7 / f11) + ((f10 * f5) + (f8 * f4));
          }
          f10 = f4 / f2;
          f5 = f5 / f2;
          f11 = f13 / f1;
          f4 = f4 / f1;
          f = - f8;
          float f16 = - f9;
          p1 = f1;
          p0 = f2;
          f13 = f3;
          f1 = (float)Math.atan2((double)((f11 * f) + (f4 * f16)), (double)((f * f10) + (f16 * f5)));
          float f17 = f6 - f8;
          f = f7 - f9;
          f2 = (float)Math.atan2((double)((f11 * f17) + (f4 * f)), (double)((f10 * f17) + (f5 * f)));
          f17 = f8 + mPenX;
          f = f9 + mPenY;
          f6 = f6 + mPenX;
          f7 = f7 + mPenY;
          PathParser.setPenDown();
          PathParser.mPivotX = f6;
          PathParser.mPenX = f6;
          PathParser.mPivotY = f7;
          PathParser.mPenY = f7;
          if (p0 - p1 || f13) {
             PathParser.arcToBezier(f17, f, p0, p1, f1, f2, p4, f13);
          }else {
             mPenX = (float)Math.toDegrees((double)f1);
             f1 = 360.00f;
             mPenY = Math.abs(((mPenX - (float)Math.toDegrees((double)f2)) % f1));
             f2 = 0x43340000;
             if (p3) {
                if (mPenY - f2 < 0) {
                label_013b :
                   mPenY = f1 - mPenY;
                }
             }else if(mPenY - f2 > 0){
                goto label_013b ;
             }
             if (!p4) {
                mPenY = - mPenY;
             }
             f16 = PathParser.mScale;
             PathParser.mPath.arcTo(new RectF(((f17 - p0) * f16), ((f - p0) * f16), ((f17 + p0) * f16), ((f + p0) * f16)), mPenX, mPenY);
             Point[] pointArray = new Point[]{new Point((double)f6, (double)f7)};
             PathParser.elements.add(new PathElement(ElementType.kCGPathElementAddCurveToPoint, pointArray));
          }
          return;
       }
    }
    public static void arcToBezier(float p0,float p1,float p2,float p3,float p4,float p5,boolean p6,float p7){
       Point point;
       float f = p4;
       double d = (double)p7;
       float f1 = (float)Math.cos(d);
       float f2 = (float)Math.sin(d);
       float f3 = f1 * p2;
       float f4 = (- f2) * p3;
       f2 = f2 * p2;
       f1 = f1 * p3;
       float f5 = p5 - f;
       double d1 = 0x401921fb54442d18;
       double d2 = 0;
       if (f5 - d2 < 0 && p6) {
          d2 = (double)f5 + d1;
       }else if(f5 - d2 > 0 && !p6){
          d2 = (double)f5 - d1;
       }else {
       label_0033 :
          int i = (int)Math.ceil(Math.abs(PathParser.round(((double)f5 / 0x3ff921fb54442d18))));
          f5 = f5 / (float)i;
          float f6 = (float)(Math.tan((double)(f5 / 4.00f)) * 0x3ff5555555555555);
          d2 = (double)f;
          float f7 = (float)Math.cos(d2);
          float f8 = (float)Math.sin(d2);
          int i1 = 0;
          while (i1 < i) {
             float f9 = f6 * f8;
             f9 = f7 - f9;
             f7 = f7 * f6;
             f8 = f8 + f7;
             f = f + f5;
             double d3 = (double)f;
             f7 = (float)Math.cos(d3);
             float f10 = (float)Math.sin(d3);
             float f11 = f6 * f10;
             f11 = f11 + f7;
             float f12 = f6 * f7;
             f12 = f10 - f12;
             float f13 = f3 * f9;
             f13 = p0 + f13;
             float f14 = f4 * f8;
             f13 = f13 + f14;
             f9 = f9 * f2;
             f9 = p1 + f9;
             f8 = f8 * f1;
             f9 = f9 + f8;
             f8 = f3 * f11;
             f8 = p0 + f8;
             f14 = f4 * f12;
             f8 = f8 + f14;
             f11 = f11 * f2;
             f11 = p1 + f11;
             f12 = f12 * f1;
             f11 = f11 + f12;
             f12 = f3 * f7;
             f12 = p0 + f12;
             f14 = f4 * f10;
             f12 = f12 + f14;
             f14 = f2 * f7;
             f14 = p1 + f14;
             float f15 = f1 * f10;
             p3 = f;
             f = f14 + f15;
             f15 = PathParser.mScale;
             float f16 = f13 * f15;
             float f17 = f9 * f15;
             float f18 = f8 * f15;
             float f19 = f11 * f15;
             float f20 = f12 * f15;
             float f21 = f * f15;
             f15 = f16;
             f16 = f17;
             f17 = f18;
             f18 = f19;
             f19 = f20;
             PathParser.mPath.cubicTo(f15, f16, f17, f18, f19, f21);
             Point[] pointArray = new Point[]{point,new Point((double)f8, (double)f11),new Point((double)f12, (double)f)};
             d1 = (double)f13;
             f19 = f10;
             point = new Point(d1, (double)f9);
             PathParser.elements.add(new PathElement(ElementType.kCGPathElementAddCurveToPoint, pointArray));
             i1 = i1 + 1;
             i = i;
             f8 = f19;
          }
          return;
       }
       f5 = (float)d2;
       goto label_0033 ;
    }
    public static void close(){
       if (PathParser.mPenDown) {
          PathParser.mPenX = PathParser.mPenDownX;
          PathParser.mPenY = PathParser.mPenDownY;
          PathParser.mPenDown = false;
          PathParser.mPath.close();
          Point[] pointArray = new Point[]{new Point((double)PathParser.mPenX, (double)PathParser.mPenY)};
          PathParser.elements.add(new PathElement(ElementType.kCGPathElementCloseSubpath, pointArray));
       }
       return;
    }
    public static void cubicTo(float p0,float p1,float p2,float p3,float p4,float p5){
       PathParser.setPenDown();
       PathParser.mPenX = p4;
       PathParser.mPenY = p5;
       float mScale = PathParser.mScale;
       float f = p1 * mScale;
       float f1 = p2 * mScale;
       float f2 = p3 * mScale;
       float f3 = p4 * mScale;
       float f4 = p5 * mScale;
       float f5 = f;
       f = f1;
       f1 = f2;
       f2 = f3;
       PathParser.mPath.cubicTo((p0 * mScale), f5, f, f1, f2, f4);
       Point[] pointArray = new Point[]{new Point((double)p0, (double)p1),new Point((double)p2, (double)p3),new Point((double)p4, (double)p5)};
       PathParser.elements.add(new PathElement(ElementType.kCGPathElementAddCurveToPoint, pointArray));
    }
    public static void curve(float p0,float p1,float p2,float p3,float p4,float p5){
       float mPenX = PathParser.mPenX;
       float mPenY = PathParser.mPenY;
       PathParser.curveTo((p0 + mPenX), (p1 + mPenY), (p2 + mPenX), (p3 + mPenY), (p4 + mPenX), (p5 + mPenY));
    }
    public static void curveTo(float p0,float p1,float p2,float p3,float p4,float p5){
       PathParser.mPivotX = p2;
       PathParser.mPivotY = p3;
       PathParser.cubicTo(p0, p1, p2, p3, p4, p5);
    }
    public static boolean is_absolute(char p0){
       return Character.isUpperCase(p0);
    }
    public static boolean is_cmd(char p0){
       switch (p0){
           case 'A':
           case 'H':
           case 'L':
           case 'M':
           case 'Q':
           case 'S':
           case 'T':
           case 'V':
           case 'Z':
           case 'a':
           case 'c':
           case 'h':
           case 'l':
           case 'm':
           case 'q':
           case 's':
           case 't':
           case 'v':
           case 'z':
           case 'C':
           default:
             return false;
       }
       return true;
    }
    public static boolean is_number_start(char p0){
       boolean b = (p0 < '0' || (p0 > '9' && (p0 != '.' && (p0 == '-' || p0 == '+'))))? true: false;
       return b;
    }
    public static void line(float p0,float p1){
       PathParser.lineTo((p0 + PathParser.mPenX), (p1 + PathParser.mPenY));
    }
    public static void lineTo(float p0,float p1){
       PathParser.setPenDown();
       PathParser.mPenX = p0;
       PathParser.mPivotX = p0;
       PathParser.mPenY = p1;
       PathParser.mPivotY = p1;
       float mScale = PathParser.mScale;
       float f = p0 * mScale;
       PathParser.mPath.lineTo(f, (mScale * p1));
       Point[] pointArray = new Point[]{new Point((double)p0, (double)p1)};
       PathParser.elements.add(new PathElement(ElementType.kCGPathElementAddLineToPoint, pointArray));
    }
    public static void move(float p0,float p1){
       PathParser.moveTo((p0 + PathParser.mPenX), (p1 + PathParser.mPenY));
    }
    public static void moveTo(float p0,float p1){
       PathParser.mPenX = p0;
       PathParser.mPivotX = p0;
       PathParser.mPenDownX = p0;
       PathParser.mPenY = p1;
       PathParser.mPivotY = p1;
       PathParser.mPenDownY = p1;
       float mScale = PathParser.mScale;
       float f = p0 * mScale;
       PathParser.mPath.moveTo(f, (mScale * p1));
       Point[] pointArray = new Point[]{new Point((double)p0, (double)p1)};
       PathParser.elements.add(new PathElement(ElementType.kCGPathElementMoveToPoint, pointArray));
    }
    public static Path parse(String p0){
       PathParser.elements = new ArrayList();
       Path path = new Path();
       PathParser.mPath = path;
       if (p0 == null) {
          return path;
       }
       PathParser.l = p0.length();
       PathParser.s = p0;
       int i = 0;
       PathParser.i = i;
       float f = 0;
       PathParser.mPenX = f;
       PathParser.mPenY = f;
       PathParser.mPivotX = f;
       PathParser.mPivotY = f;
       PathParser.mPenDownX = f;
       PathParser.mPenDownY = f;
       PathParser.mPenDown = i;
       Object[] objArray = 32;
       int i1 = 32;
       while (PathParser.i < PathParser.l) {
          PathParser.skip_spaces();
          int i2 = PathParser.i;
          if (i2 >= PathParser.l) {
             break ;
          }else {
             int i3 = 1;
             boolean b = (i1 != objArray)? true: false;
             char c = (PathParser.s).charAt(i2);
             float f1 = 0.00f;
             String str = "Unexpected character \'%c\' \(i=%d, s=%s\)";
             float f2 = 0.00f;
             if (!b && (c == 'M' || c == 'm')) {
                if (PathParser.is_cmd(c)) {
                   i1 = PathParser.i + i3;
                   PathParser.i = i1;
                   i1 = c;
                }else if(PathParser.is_number_start(c) && b){
                   if (i1 != 'Z' && i1 != 'z') {
                      if (i1 == 'M' || i1 == 'm') {
                         i1 = (PathParser.is_absolute(i1))? 'L': 'l';
                         i2 = 1;
                      label_00a7 :
                         b = PathParser.is_absolute(i1);
                         switch (i1){
                             case 'A':
                               PathParser.arcTo(PathParser.parse_list_number(), PathParser.parse_list_number(), PathParser.parse_list_number(), PathParser.parse_flag(), PathParser.parse_flag(), PathParser.parse_list_number(), PathParser.parse_list_number());
                            label_0209 :
                               if (i2) {
                                  if (b) {
                                     i1 = 'M';
                                  }else {
                                     i1 = 'm';
                                  }
                               }
                               break;
                             case 'C':
                               PathParser.curveTo(PathParser.parse_list_number(), PathParser.parse_list_number(), PathParser.parse_list_number(), PathParser.parse_list_number(), PathParser.parse_list_number(), PathParser.parse_list_number());
                               goto label_0209 ;
                               break;
                             case 'H':
                               PathParser.lineTo(PathParser.parse_list_number(), PathParser.mPenY);
                               goto label_0209 ;
                               break;
                             case 'L':
                               PathParser.lineTo(PathParser.parse_list_number(), PathParser.parse_list_number());
                               goto label_0209 ;
                               break;
                             case 'M':
                               PathParser.moveTo(PathParser.parse_list_number(), PathParser.parse_list_number());
                               goto label_0209 ;
                               break;
                             case 'Q':
                               PathParser.quadraticBezierCurveTo(PathParser.parse_list_number(), PathParser.parse_list_number(), PathParser.parse_list_number(), PathParser.parse_list_number());
                               goto label_0209 ;
                               break;
                             case 'S':
                               PathParser.smoothCurveTo(PathParser.parse_list_number(), PathParser.parse_list_number(), PathParser.parse_list_number(), PathParser.parse_list_number());
                               goto label_0209 ;
                               break;
                             case 'T':
                               PathParser.smoothQuadraticBezierCurveTo(PathParser.parse_list_number(), PathParser.parse_list_number());
                               goto label_0209 ;
                               break;
                             case 'V':
                               PathParser.lineTo(PathParser.mPenX, PathParser.parse_list_number());
                               goto label_0209 ;
                               break;
                             case 'Z':
                             case 'z':
                               PathParser.close();
                               goto label_0209 ;
                               break;
                             case 'a':
                               PathParser.arc(PathParser.parse_list_number(), PathParser.parse_list_number(), PathParser.parse_list_number(), PathParser.parse_flag(), PathParser.parse_flag(), PathParser.parse_list_number(), PathParser.parse_list_number());
                               goto label_0209 ;
                               break;
                             case 'c':
                               PathParser.curve(PathParser.parse_list_number(), PathParser.parse_list_number(), PathParser.parse_list_number(), PathParser.parse_list_number(), PathParser.parse_list_number(), PathParser.parse_list_number());
                               goto label_0209 ;
                               break;
                             case 'h':
                               PathParser.line(PathParser.parse_list_number(), f);
                               goto label_0209 ;
                               break;
                             case 'l':
                               PathParser.line(PathParser.parse_list_number(), PathParser.parse_list_number());
                               goto label_0209 ;
                               break;
                             case 'm':
                               PathParser.move(PathParser.parse_list_number(), PathParser.parse_list_number());
                               goto label_0209 ;
                               break;
                             case 'q':
                               PathParser.quadraticBezierCurve(PathParser.parse_list_number(), PathParser.parse_list_number(), PathParser.parse_list_number(), PathParser.parse_list_number());
                               goto label_0209 ;
                               break;
                             case 's':
                               PathParser.smoothCurve(PathParser.parse_list_number(), PathParser.parse_list_number(), PathParser.parse_list_number(), PathParser.parse_list_number());
                               goto label_0209 ;
                               break;
                             case 't':
                               PathParser.smoothQuadraticBezierCurve(PathParser.parse_list_number(), PathParser.parse_list_number());
                               goto label_0209 ;
                               break;
                             case 'v':
                               PathParser.line(f, PathParser.parse_list_number());
                               goto label_0209 ;
                               break;
                             default:
                               objArray = new Object[f2];
                               objArray[i] = Character.valueOf(i1);
                               objArray[i3] = PathParser.s;
                               throw new Error(String.format("Unexpected comand \'%c\' \(s=%s\)", objArray));
                         }
                      }
                   }else {
                      objArray = new Object[i3];
                      objArray[i] = PathParser.s;
                      throw new Error(String.format("Unexpected number after \'z\' \(s=%s\)", objArray));
                   }
                }else {
                   objArray = new Object[f1];
                   objArray[i] = Character.valueOf(c);
                   objArray[i3] = Integer.valueOf(PathParser.i);
                   objArray[f2] = PathParser.s;
                   throw new Error(String.format(str, objArray));
                }
                i2 = 0;
                goto label_00a7 ;
             }else {
                objArray = new Object[f1];
                objArray[i] = Character.valueOf(c);
                objArray[i3] = Integer.valueOf(PathParser.i);
                objArray[f2] = PathParser.s;
                throw new Error(String.format(str, objArray));
             }
          }
       }
       return PathParser.mPath;
    }
    public static boolean parse_flag(){
       PathParser.skip_spaces();
       char c = (PathParser.s).charAt(PathParser.i);
       boolean b = false;
       int i = 49;
       if (c == '0' || c == i) {
          int i1 = PathParser.i + 1;
          PathParser.i = i1;
          if (i1 < PathParser.l && (PathParser.s).charAt(i1) == ',') {
             PathParser.i = PathParser.i + 1;
          }
          PathParser.skip_spaces();
          if (c == i) {
             b = true;
          }
          return b;
       }else {
          Object[] objArray = new Object[]{Character.valueOf(c),Integer.valueOf(PathParser.i),PathParser.s};
          throw new Error(String.format("Unexpected flag \'%c\' \(i=%d, s=%s\)", objArray));
       }
    }
    public static float parse_list_number(){
       if (PathParser.i != PathParser.l) {
          PathParser.skip_spaces();
          PathParser.parse_list_separator();
          return PathParser.parse_number();
       }else {
          Object[] objArray = new Object[]{PathParser.s};
          throw new Error(String.format("Unexpected end \(s=%s\)", objArray));
       }
    }
    public static void parse_list_separator(){
       int i = PathParser.i;
       if (i < PathParser.l && (PathParser.s).charAt(i) == ',') {
          PathParser.i = PathParser.i + 1;
       }
       return;
    }
    public static float parse_number(){
       int i4;
       Object[] objArray1;
       PathParser.skip_spaces();
       int i = PathParser.i;
       int i1 = 0;
       int i2 = 1;
       if (i != PathParser.l) {
          char c = (PathParser.s).charAt(i);
          int i3 = 43;
          boolean b = 45;
          if (c == b || c == i3) {
             i4 = PathParser.i + i2;
             PathParser.i = i4;
             c = (PathParser.s).charAt(i4);
          }
          int i5 = 46;
          if (c >= '0' && c <= '9') {
             PathParser.skip_digits();
             int i6 = PathParser.i;
             if (i6 < PathParser.l) {
                c = (PathParser.s).charAt(i6);
             }
          }else if(c == i5){
             objArray1 = new Object[]{Character.valueOf(c),Integer.valueOf(PathParser.i),PathParser.s};
             throw new Error(String.format("Invalid number formating character \'%c\' \(i=%d, s=%s\)", objArray1));
          }
          if (c == i5) {
             PathParser.i = PathParser.i + i2;
             PathParser.skip_digits();
             i5 = PathParser.i;
             if (i5 < PathParser.l) {
                c = (PathParser.s).charAt(i5);
             }
          }
          if (c == 'e' || c == 'E') {
             i4 = PathParser.i;
             if ((i4 + 1) < PathParser.l) {
                c = (PathParser.s).charAt((i4 + i2));
                if (c != 'm' && c != 'x') {
                   i4 = PathParser.i + i2;
                   PathParser.i = i4;
                   c = (PathParser.s).charAt(i4);
                   if (c == i3 || c == b) {
                      PathParser.i = PathParser.i + i2;
                      PathParser.skip_digits();
                   }else if(c >= '0' && c <= '9'){
                      PathParser.skip_digits();
                   }else {
                      objArray1 = new Object[]{Character.valueOf(c),Integer.valueOf(PathParser.i),PathParser.s};
                      throw new Error(String.format("Invalid number formating character \'%c\' \(i=%d, s=%s\)", objArray1));
                   }
                }
             }
          }
          String str = (PathParser.s).substring(i, PathParser.i);
          float f = Float.parseFloat(str);
          if (!Float.isInfinite(f) && !Float.isNaN(f)) {
             return f;
          }else {
             Object[] objArray = new Object[]{str,Integer.valueOf(i),Integer.valueOf(PathParser.i),PathParser.s};
             throw new Error(String.format("Invalid number \'%s\' \(start=%d, i=%d, s=%s\)", objArray));
          }
       }else {
          Object[] objArray2 = new Object[i2];
          objArray2[i1] = PathParser.s;
          throw new Error(String.format("Unexpected end \(s=%s\)", objArray2));
       }
    }
    public static void quadraticBezierCurve(float p0,float p1,float p2,float p3){
       float mPenX = PathParser.mPenX;
       float mPenY = PathParser.mPenY;
       PathParser.quadraticBezierCurveTo((p0 + mPenX), (p1 + mPenY), (p2 + mPenX), (p3 + mPenY));
    }
    public static void quadraticBezierCurveTo(float p0,float p1,float p2,float p3){
       PathParser.mPivotX = p0;
       PathParser.mPivotY = p1;
       p0 = p0 * 2.00f;
       p1 = p1 * 2.00f;
       PathParser.cubicTo(((PathParser.mPenX + p0) / 3.00f), ((PathParser.mPenY + p1) / 3.00f), ((p2 + p0) / 3.00f), ((p3 + p1) / 3.00f), p2, p3);
    }
    public static double round(double p0){
       double d = Math.pow(10.00f, 4.00f);
       return ((double)Math.round((p0 * d)) / d);
    }
    public static void setPenDown(){
       if (!PathParser.mPenDown) {
          PathParser.mPenDownX = PathParser.mPenX;
          PathParser.mPenDownY = PathParser.mPenY;
          PathParser.mPenDown = true;
       }
       return;
    }
    public static void skip_digits(){
       int i = PathParser.i;
       while (i < PathParser.l && Character.isDigit((PathParser.s).charAt(i))) {
          i = PathParser.i + 1;
          PathParser.i = i;
       }
       return;
    }
    public static void skip_spaces(){
       int i = PathParser.i;
       while (i < PathParser.l && Character.isWhitespace((PathParser.s).charAt(i))) {
          i = PathParser.i + 1;
          PathParser.i = i;
       }
       return;
    }
    public static void smoothCurve(float p0,float p1,float p2,float p3){
       float mPenX = PathParser.mPenX;
       float mPenY = PathParser.mPenY;
       PathParser.smoothCurveTo((p0 + mPenX), (p1 + mPenY), (p2 + mPenX), (p3 + mPenY));
    }
    public static void smoothCurveTo(float p0,float p1,float p2,float p3){
       PathParser.mPivotX = p0;
       PathParser.mPivotY = p1;
       PathParser.cubicTo(((PathParser.mPenX * 2.00f) - PathParser.mPivotX), ((PathParser.mPenY * 2.00f) - PathParser.mPivotY), p0, p1, p2, p3);
    }
    public static void smoothQuadraticBezierCurve(float p0,float p1){
       PathParser.smoothQuadraticBezierCurveTo((p0 + PathParser.mPenX), (p1 + PathParser.mPenY));
    }
    public static void smoothQuadraticBezierCurveTo(float p0,float p1){
       PathParser.quadraticBezierCurveTo(((PathParser.mPenX * 2.00f) - PathParser.mPivotX), ((PathParser.mPenY * 2.00f) - PathParser.mPivotY), p0, p1);
    }
}
