package com.horcrux.svg.GlyphContext;
import java.lang.Object;
import java.util.ArrayList;
import com.horcrux.svg.FontData;
import com.horcrux.svg.SVGLength;
import java.lang.Integer;
import com.horcrux.svg.GroupView;
import com.horcrux.svg.VirtualView;
import com.horcrux.svg.PropHelper;
import java.lang.Math;
import com.facebook.react.bridge.ReadableMap;
import com.horcrux.svg.TextView;

public class GlyphContext	// class@0005a6
{
    public double mDX;
    public int mDXIndex;
    public final ArrayList mDXIndices;
    public SVGLength[] mDXs;
    public final ArrayList mDXsContext;
    public int mDXsIndex;
    public final ArrayList mDXsIndices;
    public double mDY;
    public int mDYIndex;
    public final ArrayList mDYIndices;
    public SVGLength[] mDYs;
    public final ArrayList mDYsContext;
    public int mDYsIndex;
    public final ArrayList mDYsIndices;
    public final ArrayList mFontContext;
    public double mFontSize;
    public final float mHeight;
    public int mRIndex;
    public final ArrayList mRIndices;
    public double[] mRs;
    public final ArrayList mRsContext;
    public int mRsIndex;
    public final ArrayList mRsIndices;
    public final float mScale;
    public int mTop;
    public final float mWidth;
    public double mX;
    public int mXIndex;
    public final ArrayList mXIndices;
    public SVGLength[] mXs;
    public final ArrayList mXsContext;
    public int mXsIndex;
    public final ArrayList mXsIndices;
    public double mY;
    public int mYIndex;
    public final ArrayList mYIndices;
    public SVGLength[] mYs;
    public final ArrayList mYsContext;
    public int mYsIndex;
    public final ArrayList mYsIndices;
    public FontData topFont;

    public void GlyphContext(float p0,float p1,float p2){
       GlyphContext glyphContext = this;
       super();
       ArrayList uArrayList = new ArrayList();
       glyphContext.mFontContext = uArrayList;
       ArrayList uArrayList1 = new ArrayList();
       glyphContext.mXsContext = uArrayList1;
       ArrayList uArrayList2 = new ArrayList();
       glyphContext.mYsContext = uArrayList2;
       ArrayList uArrayList3 = new ArrayList();
       glyphContext.mDXsContext = uArrayList3;
       ArrayList uArrayList4 = new ArrayList();
       glyphContext.mDYsContext = uArrayList4;
       ArrayList uArrayList5 = new ArrayList();
       glyphContext.mRsContext = uArrayList5;
       ArrayList uArrayList6 = new ArrayList();
       glyphContext.mXIndices = uArrayList6;
       ArrayList uArrayList7 = new ArrayList();
       glyphContext.mYIndices = uArrayList7;
       ArrayList uArrayList8 = new ArrayList();
       glyphContext.mDXIndices = uArrayList8;
       ArrayList uArrayList9 = new ArrayList();
       glyphContext.mDYIndices = uArrayList9;
       ArrayList uArrayList10 = new ArrayList();
       glyphContext.mRIndices = uArrayList10;
       glyphContext.mXsIndices = new ArrayList();
       glyphContext.mYsIndices = new ArrayList();
       glyphContext.mDXsIndices = new ArrayList();
       glyphContext.mDYsIndices = new ArrayList();
       glyphContext.mRsIndices = new ArrayList();
       glyphContext.mFontSize = 12.00f;
       glyphContext.topFont = FontData.Defaults;
       SVGLength[] sVGLengthArr = new SVGLength[0];
       glyphContext.mXs = sVGLengthArr;
       SVGLength[] sVGLengthArr1 = new SVGLength[0];
       glyphContext.mYs = sVGLengthArr1;
       sVGLengthArr1 = new SVGLength[0];
       glyphContext.mDXs = sVGLengthArr1;
       sVGLengthArr1 = new SVGLength[0];
       glyphContext.mDYs = sVGLengthArr1;
       double[] uodoubleArra = new double[]{0};
       glyphContext.mRs = uodoubleArra;
       glyphContext.mXIndex = -1;
       glyphContext.mYIndex = -1;
       glyphContext.mDXIndex = -1;
       glyphContext.mDYIndex = -1;
       glyphContext.mRIndex = -1;
       glyphContext.mScale = p0;
       glyphContext.mWidth = p1;
       glyphContext.mHeight = p2;
       uArrayList1.add(sVGLengthArr);
       uArrayList2.add(glyphContext.mYs);
       uArrayList3.add(glyphContext.mDXs);
       uArrayList4.add(glyphContext.mDYs);
       uArrayList5.add(glyphContext.mRs);
       uArrayList6.add(Integer.valueOf(glyphContext.mXIndex));
       uArrayList7.add(Integer.valueOf(glyphContext.mYIndex));
       uArrayList8.add(Integer.valueOf(glyphContext.mDXIndex));
       uArrayList9.add(Integer.valueOf(glyphContext.mDYIndex));
       uArrayList10.add(Integer.valueOf(glyphContext.mRIndex));
       uArrayList.add(glyphContext.topFont);
       this.pushIndices();
    }
    public static void incrementIndices(ArrayList p0,int p1){
       while (p1 >= 0) {
          int i = p0.get(p1).intValue() + 1;
          p0.set(p1, Integer.valueOf(i));
          p1--;
       }
       return;
    }
    public final double[] getDoubleArrayFromReadableArray(ArrayList p0){
       int i = p0.size();
       double[] uodoubleArra = new double[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          uodoubleArra[i1] = p0.get(i1).value;
       }
       return uodoubleArra;
    }
    public FontData getFont(){
       return this.topFont;
    }
    public double getFontSize(){
       return this.mFontSize;
    }
    public float getHeight(){
       return this.mHeight;
    }
    public final SVGLength[] getStringArrayFromReadableArray(ArrayList p0){
       int i = p0.size();
       SVGLength[] sVGLengthArr = new SVGLength[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          sVGLengthArr[i1] = p0.get(i1);
       }
       return sVGLengthArr;
    }
    public final FontData getTopOrParentFont(GroupView p0){
       FontData font;
       if (this.mTop > null) {
          return this.topFont;
       }
       p0 = p0.getParentTextRoot();
       while (true) {
          if (p0 == null) {
             return FontData.Defaults;
          }
          font = p0.getGlyphContext().getFont();
          if (font != FontData.Defaults) {
             break ;
          }else {
             p0 = p0.getParentTextRoot();
          }
       }
       return font;
    }
    public float getWidth(){
       return this.mWidth;
    }
    public double nextDeltaX(){
       GlyphContext.incrementIndices(this.mDXIndices, this.mDXsIndex);
       int i = this.mDXIndex + 1;
       GlyphContext tmDXs = this.mDXs;
       if (i < tmDXs.length) {
          this.mDXIndex = i;
          this.mDX = this.mDX + PropHelper.fromRelative(tmDXs[i], (double)this.mWidth, 0, (double)this.mScale, this.mFontSize);
       }
       return this.mDX;
    }
    public double nextDeltaY(){
       GlyphContext.incrementIndices(this.mDYIndices, this.mDYsIndex);
       int i = this.mDYIndex + 1;
       GlyphContext tmDYs = this.mDYs;
       if (i < tmDYs.length) {
          this.mDYIndex = i;
          this.mDY = this.mDY + PropHelper.fromRelative(tmDYs[i], (double)this.mHeight, 0, (double)this.mScale, this.mFontSize);
       }
       return this.mDY;
    }
    public double nextRotation(){
       GlyphContext.incrementIndices(this.mRIndices, this.mRsIndex);
       int i = Math.min((this.mRIndex + 1), (this.mRs.length - 1));
       this.mRIndex = i;
       return this.mRs[i];
    }
    public double nextX(double p0){
       GlyphContext.incrementIndices(this.mXIndices, this.mXsIndex);
       int i = this.mXIndex + 1;
       GlyphContext tmXs = this.mXs;
       if (i < tmXs.length) {
          this.mDX = 0;
          this.mXIndex = i;
          this.mX = PropHelper.fromRelative(tmXs[i], (double)this.mWidth, 0, (double)this.mScale, this.mFontSize);
       }
       double d = this.mX + p0;
       this.mX = d;
       return d;
    }
    public double nextY(){
       GlyphContext.incrementIndices(this.mYIndices, this.mYsIndex);
       int i = this.mYIndex + 1;
       GlyphContext tmYs = this.mYs;
       if (i < tmYs.length) {
          this.mDY = 0;
          this.mYIndex = i;
          this.mY = PropHelper.fromRelative(tmYs[i], (double)this.mHeight, 0, (double)this.mScale, this.mFontSize);
       }
       return this.mY;
    }
    public void popContext(){
       this.mFontContext.remove(this.mTop);
       this.mXsIndices.remove(this.mTop);
       this.mYsIndices.remove(this.mTop);
       this.mDXsIndices.remove(this.mTop);
       this.mDYsIndices.remove(this.mTop);
       this.mRsIndices.remove(this.mTop);
       int i = this.mTop - 1;
       this.mTop = i;
       GlyphContext tmXsIndex = this.mXsIndex;
       GlyphContext tmYsIndex = this.mYsIndex;
       GlyphContext tmDXsIndex = this.mDXsIndex;
       GlyphContext tmDYsIndex = this.mDYsIndex;
       GlyphContext tmRsIndex = this.mRsIndex;
       this.topFont = this.mFontContext.get(i);
       this.mXsIndex = this.mXsIndices.get(this.mTop).intValue();
       this.mYsIndex = this.mYsIndices.get(this.mTop).intValue();
       this.mDXsIndex = this.mDXsIndices.get(this.mTop).intValue();
       this.mDYsIndex = this.mDYsIndices.get(this.mTop).intValue();
       this.mRsIndex = this.mRsIndices.get(this.mTop).intValue();
       if (tmXsIndex != this.mXsIndex) {
          this.mXsContext.remove(tmXsIndex);
          this.mXs = this.mXsContext.get(this.mXsIndex);
          this.mXIndex = this.mXIndices.get(this.mXsIndex).intValue();
       }
       if (tmYsIndex != this.mYsIndex) {
          this.mYsContext.remove(tmYsIndex);
          this.mYs = this.mYsContext.get(this.mYsIndex);
          this.mYIndex = this.mYIndices.get(this.mYsIndex).intValue();
       }
       if (tmDXsIndex != this.mDXsIndex) {
          this.mDXsContext.remove(tmDXsIndex);
          this.mDXs = this.mDXsContext.get(this.mDXsIndex);
          this.mDXIndex = this.mDXIndices.get(this.mDXsIndex).intValue();
       }
       if (tmDYsIndex != this.mDYsIndex) {
          this.mDYsContext.remove(tmDYsIndex);
          this.mDYs = this.mDYsContext.get(this.mDYsIndex);
          this.mDYIndex = this.mDYIndices.get(this.mDYsIndex).intValue();
       }
       if (tmRsIndex != this.mRsIndex) {
          this.mRsContext.remove(tmRsIndex);
          this.mRs = this.mRsContext.get(this.mRsIndex);
          this.mRIndex = this.mRIndices.get(this.mRsIndex).intValue();
       }
       return;
    }
    public void pushContext(GroupView p0,ReadableMap p1){
       this.pushNodeAndFont(p0, p1);
       this.pushIndices();
    }
    public void pushContext(boolean p0,TextView p1,ReadableMap p2,ArrayList p3,ArrayList p4,ArrayList p5,ArrayList p6,ArrayList p7){
       SVGLength[] stringArrayF;
       if (p0) {
          this.reset();
       }
       this.pushNodeAndFont(p1, p2);
       int i = -1;
       if (p3 != null && p3.size()) {
          this.mXsIndex = this.mXsIndex + 1;
          this.mXIndex = i;
          this.mXIndices.add(Integer.valueOf(i));
          stringArrayF = this.getStringArrayFromReadableArray(p3);
          this.mXs = stringArrayF;
          this.mXsContext.add(stringArrayF);
       }
       if (p4 != null && p4.size()) {
          this.mYsIndex = this.mYsIndex + 1;
          this.mYIndex = i;
          this.mYIndices.add(Integer.valueOf(i));
          stringArrayF = this.getStringArrayFromReadableArray(p4);
          this.mYs = stringArrayF;
          this.mYsContext.add(stringArrayF);
       }
       if (p5 != null && p5.size()) {
          this.mDXsIndex = this.mDXsIndex + 1;
          this.mDXIndex = i;
          this.mDXIndices.add(Integer.valueOf(i));
          stringArrayF = this.getStringArrayFromReadableArray(p5);
          this.mDXs = stringArrayF;
          this.mDXsContext.add(stringArrayF);
       }
       if (p6 != null && p6.size()) {
          this.mDYsIndex = this.mDYsIndex + 1;
          this.mDYIndex = i;
          this.mDYIndices.add(Integer.valueOf(i));
          stringArrayF = this.getStringArrayFromReadableArray(p6);
          this.mDYs = stringArrayF;
          this.mDYsContext.add(stringArrayF);
       }
       if (p7 != null && p7.size()) {
          this.mRsIndex = this.mRsIndex + 1;
          this.mRIndex = i;
          this.mRIndices.add(Integer.valueOf(i));
          double[] doubleArrayF = this.getDoubleArrayFromReadableArray(p7);
          this.mRs = doubleArrayF;
          this.mRsContext.add(doubleArrayF);
       }
       this.pushIndices();
       return;
    }
    public final void pushIndices(){
       this.mXsIndices.add(Integer.valueOf(this.mXsIndex));
       this.mYsIndices.add(Integer.valueOf(this.mYsIndex));
       this.mDXsIndices.add(Integer.valueOf(this.mDXsIndex));
       this.mDYsIndices.add(Integer.valueOf(this.mDYsIndex));
       this.mRsIndices.add(Integer.valueOf(this.mRsIndex));
    }
    public final void pushNodeAndFont(GroupView p0,ReadableMap p1){
       FontData topOrParentF = this.getTopOrParentFont(p0);
       this.mTop = this.mTop + 1;
       if (p1 == null) {
          this.mFontContext.add(topOrParentF);
          return;
       }else {
          FontData uFontData = new FontData(p1, topOrParentF, (double)this.mScale);
          this.mFontSize = uFontData.fontSize;
          this.mFontContext.add(uFontData);
          this.topFont = uFontData;
          return;
       }
    }
    public final void reset(){
       this.mRsIndex = 0;
       this.mDYsIndex = 0;
       this.mDXsIndex = 0;
       this.mYsIndex = 0;
       this.mXsIndex = 0;
       this.mRIndex = -1;
       this.mDYIndex = -1;
       this.mDXIndex = -1;
       this.mYIndex = -1;
       this.mXIndex = -1;
       this.mDY = 0;
       this.mDX = 0;
       this.mY = 0;
       this.mX = 0;
    }
}
