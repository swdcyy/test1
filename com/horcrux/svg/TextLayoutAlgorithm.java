package com.horcrux.svg.TextLayoutAlgorithm;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.StringBuilder;
import android.view.View;
import com.horcrux.svg.TextPathView;
import com.horcrux.svg.TSpanView;
import android.view.ViewGroup;
import java.lang.String;
import com.horcrux.svg.TextLayoutAlgorithm$LayoutInput;
import com.horcrux.svg.TextLayoutAlgorithm$CharacterInformation;
import android.graphics.PointF;
import com.horcrux.svg.TextLayoutAlgorithm$1CharacterPositioningResolver;
import java.lang.Float;
import com.horcrux.svg.TextLayoutAlgorithm$1TextLengthResolver;
import com.horcrux.svg.TextView;
import java.lang.Double;
import java.lang.Math;
import com.horcrux.svg.TextProperties$TextAnchor;
import com.horcrux.svg.TextProperties$Direction;
import com.horcrux.svg.TextLayoutAlgorithm$1;
import java.lang.Enum;
import android.graphics.PathMeasure;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.horcrux.svg.TextProperties$TextPathSide;
import com.horcrux.svg.SVGLength;

public class TextLayoutAlgorithm	// class@000607
{

    public void TextLayoutAlgorithm(){
       super();
    }
    public final void getSubTreeTypographicCharacterPositions(ArrayList p0,ArrayList p1,StringBuilder p2,View p3,TextPathView p4){
       int i = 0;
       if (p3 instanceof TSpanView) {
          TSpanView mContent = p3.mContent;
          if (mContent == null) {
             for (; i < p3.getChildCount(); i = i + 1) {
                this.getSubTreeTypographicCharacterPositions(p0, p1, p2, p3.getChildAt(i), p4);
             }
          }else {
             for (; i < mContent.length(); i = i + 1) {
                p1.add(p3);
                p0.add(p4);
             }
             p2+mContent;
          }
       }else if(p3 instanceof TextPathView){
          p4 = p3;
       }
       while (i < p4.getChildCount()) {
          this.getSubTreeTypographicCharacterPositions(p0, p1, p2, p4.getChildAt(i), p4);
          i = i + 1;
       }
       return;
    }
    public TextLayoutAlgorithm$CharacterInformation[] layoutText(TextLayoutAlgorithm$LayoutInput p0){
       int i1;
       double d;
       double d1;
       double d5;
       double uocharArray111;
       object oobject2;
       double d6;
       ArrayList uArrayList1;
       int i7;
       PointF pointF;
       object oobject5;
       Path path1;
       TextPathView textPathView1;
       float[] uofloatArray1;
       float[] uofloatArray2;
       PointF pointF1;
       PathMeasure pathMeasure1;
       TextLayoutAlgorithm textLayoutAl = this;
       TextLayoutAlgorithm$LayoutInput text = p0.text;
       StringBuilder str = "";
       ArrayList uArrayList = new ArrayList();
       this.getSubTreeTypographicCharacterPositions(uArrayList, new ArrayList(), str, text, null);
       char[] uocharArray = (str).toCharArray();
       boolean len = uocharArray.length;
       TextLayoutAlgorithm$CharacterInformation[] uCharacterIn = new TextLayoutAlgorithm$CharacterInformation[len];
       int b = false;
       for (int i = 0; i < len; i = i + 1) {
          uCharacterIn[i] = new TextLayoutAlgorithm$CharacterInformation(textLayoutAl, i, uocharArray[i]);
       }
       if (!len) {
          return uCharacterIn;
       }
       PointF[] pointFArray = new PointF[len];
       boolean TextLayoutAlgorithm$1CharacterPositioningResolver uocharArray1 = 0;
       float f = 0;
       while (uocharArray1 < len) {
          pointFArray[uocharArray1] = new PointF(f, f);
          uocharArray1++;
       }
       uocharArray1 = 0;
       boolean b1 = true;
       while (uocharArray1 < len) {
          uCharacterIn[uocharArray1].addressable = b1;
          uCharacterIn[uocharArray1].middle = b;
          object oobject = uCharacterIn[uocharArray1];
          if (uocharArray1) {
             b1 = false;
          }
          oobject.anchoredChunk = b1;
          if (uCharacterIn[uocharArray1].addressable != null && uCharacterIn[uocharArray1].middle == null) {
             pointFArray[uocharArray1].set(f, f);
          }else if(uocharArray1 > 0){
             i1 = uocharArray1 - 1;
             pointFArray[uocharArray1].set(pointFArray[i1]);
          }
          uocharArray1++;
       }
       String[] stringArray = new String[len];
       String[] stringArray1 = new String[len];
       String[] stringArray2 = new String[len];
       String[] stringArray3 = new String[len];
       stringArray3 = stringArray;
       stringArray2 = stringArray1;
       String[] stringArray4 = stringArray1;
       String[] stringArray5 = stringArray;
       uocharArray1 = new TextLayoutAlgorithm$1CharacterPositioningResolver(this, uCharacterIn, stringArray3, stringArray2, stringArray2, stringArray3);
       TextLayoutAlgorithm$CharacterInformation PointF uocharArray11 = new PointF(f, f);
       for (i = 0; i < len; i++) {
          String str1 = "";
          String str2 = "0";
          if ((stringArray5[i]).equals(str1)) {
             stringArray5[i] = str2;
          }
          if ((stringArray4[i]).equals(str1)) {
             stringArray4[i] = str2;
          }
          float f1 = uocharArray11.x + Float.parseFloat(stringArray5[i]);
          uocharArray11.x = f1;
          f1 = uocharArray11.y + Float.parseFloat(stringArray4[i]);
          uocharArray11.y = f1;
          float f2 = pointFArray[i].x + uocharArray11.x;
          uCharacterIn[i].x = (double)f2;
          f2 = pointFArray[i].y + f1;
          uCharacterIn[i].y = (double)f2;
       }
       new TextLayoutAlgorithm$1TextLengthResolver(textLayoutAl, uCharacterIn).resolveTextLength(text);
       uocharArray11.set(f, f);
       i = 1;
       while (i < len) {
          if (stringArray5[i] != null) {
             d = Double.parseDouble(stringArray5[i]) - uCharacterIn[i].x;
             uocharArray11.x = (float)d;
          }
          if (stringArray4[i] != null) {
             d = Double.parseDouble(stringArray4[i]) - uCharacterIn[i].y;
             uocharArray11.y = (float)d;
          }
          object oobject1 = uCharacterIn[i];
          d1 = oobject1.x + (double)uocharArray11.x;
          oobject1.x = d1;
          oobject1 = uCharacterIn[i];
          d1 = oobject1.y + (double)uocharArray11.y;
          oobject1.y = d1;
          if (uCharacterIn[i].middle != null && uCharacterIn[i].anchoredChunk != null) {
             uCharacterIn[i].anchoredChunk = b;
          }
          i++;
          if (i < len) {
             uCharacterIn[i].anchoredChunk = b1;
          }
       }
       int i2 = 0;
       double d2 = Double.POSITIVE_INFINITY;
       int i3 = 0;
       double d3 = Double.NEGATIVE_INFINITY;
       double d4 = Double.POSITIVE_INFINITY;
       int i4 = Double.NEGATIVE_INFINITY;
       while (i2 < len) {
          if (uCharacterIn[i2].addressable != null) {
             if (uCharacterIn[i2].anchoredChunk != null) {
                d4 = d2;
                d2 = Double.POSITIVE_INFINITY;
                d5 = Double.NEGATIVE_INFINITY;
             }else {
                d5 = d3;
                d3 = i4;
             }
             uocharArray11 = uCharacterIn[i2].x;
             d = uCharacterIn[i2].advance + uocharArray11;
             d2 = Math.min(d2, Math.min(uocharArray11, d));
             uocharArray111 = Math.max(d5, Math.max(uocharArray11, d));
             if (i2 > 0 && uCharacterIn[i2].anchoredChunk != null) {
                if (d4 - Double.POSITIVE_INFINITY) {
                label_01a1 :
                   TextProperties$TextAnchor start = TextProperties$TextAnchor.start;
                   int i5 = len - 1;
                   if (i2 == i5) {
                      d3 = uocharArray111;
                      d4 = d2;
                   }
                   TextLayoutAlgorithm$CharacterInformation x = uCharacterIn[i3].x;
                   b = TextLayoutAlgorithm$1.$SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[start.ordinal()];
                   if (b != 1) {
                      if (b != -0.00f) {
                         if (b == 3) {
                            x = x - d3;
                         }
                      }else {
                         d = d4 + d3;
                         d = d / 2.00f;
                         x = x - d;
                      }
                   }else {
                      x = x - d4;
                   }
                   i1 = (i2 == i5)? i2: i2 - 1;
                   while (i3 <= i1) {
                      oobject2 = uCharacterIn[i3];
                      d5 = oobject2.x + x;
                      oobject2.x = d5;
                      i3 = i3 + 1;
                   }
                   i3 = i2;
                label_01e1 :
                   i4 = d3;
                   d3 = uocharArray111;
                }
             }else {
                TextLayoutAlgorithm$CharacterInformation uCharacterIn1 = Double.POSITIVE_INFINITY;
             }
             b = len - 1;
             if (i2 == b) {
                goto label_01a1 ;
             }else {
                goto label_01e1 ;
             }
          }
          i2 = i2 + 1;
          b1 = 1;
       }
       uocharArray11 = new PointF(0, 0);
       PathMeasure pathMeasure = new PathMeasure();
       Canvas uCanvas = null;
       Path path = uCanvas;
       object oobject3 = null;
       object oobject4 = null;
       int i6 = 0;
       while (i6 < len) {
          TextPathView textPathView = uArrayList.get(i6);
          if (textPathView != null && uCharacterIn[i6].addressable != null) {
             path = textPathView.getTextPath(uCanvas, uCanvas);
             if (uCharacterIn[i6].middle == null) {
                textPathView.getSide();
                pathMeasure.setPath(path, false);
                d6 = (double)pathMeasure.getLength();
                uArrayList1 = uArrayList;
                i7 = len;
                pointF = uocharArray11;
                oobject5 = oobject4;
                path1 = path;
                textPathView1 = textPathView;
                double d7 = uCharacterIn[i6].advance / 2.00f;
                uocharArray111 = uCharacterIn[i6].x + d7;
                uocharArray111 = uocharArray111 + textPathView.getStartOffset().value;
                float[] uofloatArray = null;
                if (!pathMeasure.isClosed() && (uocharArray111 - uofloatArray < 0 || uocharArray111 - d6 > 0)) {
                   uCharacterIn[i6].hidden = true;
                }
                if (pathMeasure.isClosed()) {
                   int i8 = TextLayoutAlgorithm$1.$SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[TextProperties$TextAnchor.start.ordinal()];
                   if (i8 != 1) {
                      if (i8 != 2) {
                         if (i8 == 3) {
                            d5 = - d6;
                            if (uocharArray111 - d5 < 0 || uocharArray111 - uofloatArray > 0) {
                               uCharacterIn[i6].hidden = true;
                            }
                         }
                      }else {
                         d1 = - d6;
                         d1 = d1 / 2.00f;
                         if (uocharArray111 - d1 >= 0) {
                            d1 = d6 / 2.00f;
                            if (uocharArray111 - d1 <= 0) {
                            label_02b2 :
                               len = 1;
                            label_02b3 :
                               uocharArray111 = uocharArray111 % d6;
                               if (uCharacterIn[i6].hidden == null) {
                                  uofloatArray = new float[2];
                                  uofloatArray1 = new float[2];
                                  pathMeasure.getPosTan((float)uocharArray111, uofloatArray, uofloatArray1);
                                  uocharArray111 = Math.atan2((double)uofloatArray1[len], (double)uofloatArray1[0]) * 0x404ca5dc1a63c1f8;
                                  d1 = 90.00f + uocharArray111;
                                  Math.cos(d1);
                                  Math.sin(d1);
                                  oobject2 = uCharacterIn[i6];
                                  double d8 = oobject2.rotate + uocharArray111;
                                  oobject2.rotate = d8;
                               }
                            }
                         }
                         len = true;
                         uCharacterIn[i6].hidden = len;
                         goto label_02b3 ;
                      }
                   }else {
                      len = true;
                      if (uocharArray111 - uofloatArray < 0 || uocharArray111 - d6 > 0) {
                         uCharacterIn[i6].hidden = len;
                         goto label_02b3 ;
                      }else {
                         goto label_02b3 ;
                      }
                   }
                }else {
                   uArrayList = 3;
                   goto label_02b2 ;
                }
             }else {
                pointF = uocharArray11;
                oobject5 = oobject4;
                uArrayList1 = uArrayList;
                i7 = len;
                path1 = path;
                textPathView1 = textPathView;
                i = i6 - 1;
                uocharArray11.x = uCharacterIn[i].x;
                uocharArray11.y = uCharacterIn[i].y;
                uocharArray11.rotate = uCharacterIn[i].rotate;
             }
             path = path1;
             oobject3 = 1;
          }else {
             pointF = uocharArray11;
             oobject5 = oobject4;
             uArrayList1 = uArrayList;
             i7 = len;
             textPathView1 = textPathView;
             uArrayList = 3;
          }
          if (textPathView1 == null && uCharacterIn[i6].addressable != null) {
             if (oobject3 != null) {
                uocharArray1 = false;
                pathMeasure.setPath(path, uocharArray1);
                uofloatArray2 = new float[2];
                uofloatArray1 = null;
                pathMeasure.getPosTan(pathMeasure.getLength(), uofloatArray2, uofloatArray1);
                pointF1 = pointF;
                pointF1.set(uofloatArray2[uocharArray1], uofloatArray2[1]);
                oobject3 = null;
                oobject5 = 1;
             }else {
                pointF1 = pointF;
                oobject4 = null;
                len = 1;
             }
             if (oobject5 != null) {
                if (uCharacterIn[i6].anchoredChunk != null) {
                   pathMeasure1 = pathMeasure;
                   oobject5 = null;
                }else {
                   oobject2 = uCharacterIn[i6];
                   pathMeasure1 = pathMeasure;
                   d6 = oobject2.x + (double)pointF1.x;
                   oobject2.x = d6;
                   object uocharArray12 = uCharacterIn[i6];
                   double i9 = uocharArray12.y + (double)pointF1.y;
                   uocharArray12.y = i9;
                }
             }else {
                pathMeasure1 = pathMeasure;
             }
          }else {
             pathMeasure1 = pathMeasure;
             pointF1 = pointF;
             oobject4 = null;
             len = 1;
          }
          i6 = i6 + 1;
          uofloatArray2 = uofloatArray1;
          uocharArray11 = pointF1;
          pathMeasure = pathMeasure1;
          uArrayList = uArrayList1;
          len = i7;
          oobject4 = oobject5;
       }
       return uCharacterIn;
    }
}
