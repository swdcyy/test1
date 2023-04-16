package com.horcrux.svg.TextView;
import com.horcrux.svg.GroupView;
import com.facebook.react.bridge.ReactContext;
import com.horcrux.svg.TextProperties$TextLengthAdjust;
import com.horcrux.svg.VirtualView;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.horcrux.svg.TextProperties$AlignmentBaseline;
import android.view.ViewParent;
import android.view.ViewGroup;
import java.lang.String;
import android.graphics.Region$Op;
import java.lang.Double;
import android.view.View;
import com.horcrux.svg.GlyphContext;
import java.util.ArrayList;
import java.lang.Object;
import com.horcrux.svg.FontData;
import com.horcrux.svg.TextProperties$TextAnchor;
import com.horcrux.svg.TextPathView;
import com.horcrux.svg.TSpanView;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Dynamic;
import com.horcrux.svg.SVGLength;

public class TextView extends GroupView	// class@000616
{
    public double cachedAdvance;
    public TextProperties$AlignmentBaseline mAlignmentBaseline;
    public String mBaselineShift;
    public ArrayList mDeltaX;
    public ArrayList mDeltaY;
    public SVGLength mInlineSize;
    public TextProperties$TextLengthAdjust mLengthAdjust;
    public ArrayList mPositionX;
    public ArrayList mPositionY;
    public ArrayList mRotate;
    public SVGLength mTextLength;

    public void TextView(ReactContext p0){
       super(p0);
       this.mInlineSize = null;
       this.mTextLength = null;
       this.mBaselineShift = null;
       this.mLengthAdjust = TextProperties$TextLengthAdjust.spacing;
       this.cachedAdvance = Double.NaN;
    }
    public void clearCache(){
       this.cachedAdvance = Double.NaN;
       super.clearCache();
    }
    public void draw(Canvas p0,Paint p1,float p2){
       this.setupGlyphContext(p0);
       this.clip(p0, p1);
       this.getGroupPath(p0, p1);
       this.pushGlyphContext();
       this.drawGroup(p0, p1, p2);
       this.popGlyphContext();
    }
    public TextProperties$AlignmentBaseline getAlignmentBaseline(){
       if (this.mAlignmentBaseline == null) {
          ViewParent parent = this.getParent();
          while (true) {
             if (parent != null) {
                if (parent instanceof TextView) {
                   TextView mAlignmentBa = parent.mAlignmentBaseline;
                   if (mAlignmentBa != null) {
                      this.mAlignmentBaseline = mAlignmentBa;
                      return mAlignmentBa;
                   }
                }
                parent = parent.getParent();
             }
          }
       }
       if (this.mAlignmentBaseline == null) {
          this.mAlignmentBaseline = TextProperties$AlignmentBaseline.baseline;
       }
       return this.mAlignmentBaseline;
    }
    public String getBaselineShift(){
       if (this.mBaselineShift == null) {
          for (ViewParent parent = this.getParent(); parent != null; parent = parent.getParent()) {
             if (parent instanceof TextView) {
                TextView mBaselineShi = parent.mBaselineShift;
                if (mBaselineShi != null) {
                   this.mBaselineShift = mBaselineShi;
                   return mBaselineShi;
                }
             }
          }
       }
       return this.mBaselineShift;
    }
    public Path getGroupPath(Canvas p0,Paint p1){
       VirtualView tmPath = this.mPath;
       if (tmPath != null) {
          return tmPath;
       }
       this.pushGlyphContext();
       this.mPath = super.getPath(p0, p1);
       this.popGlyphContext();
       return this.mPath;
    }
    public Path getPath(Canvas p0,Paint p1){
       VirtualView tmPath = this.mPath;
       if (tmPath != null) {
          return tmPath;
       }
       this.setupGlyphContext(p0);
       return this.getGroupPath(p0, p1);
    }
    public Path getPath(Canvas p0,Paint p1,Region$Op p2){
       return this.getPath(p0, p1);
    }
    public double getSubtreeTextChunksTotalAdvance(Paint p0){
       if (!Double.isNaN(this.cachedAdvance)) {
          return this.cachedAdvance;
       }
       double d = 0;
       int i = 0;
       while (i < this.getChildCount()) {
          View childAt = this.getChildAt(i);
          if (childAt instanceof TextView) {
             d = d + childAt.getSubtreeTextChunksTotalAdvance(p0);
          }
          i = i + 1;
       }
       this.cachedAdvance = d;
       return d;
    }
    public TextView getTextAnchorRoot(){
       GlyphContext mFontContext = this.getTextRootGlyphContext().mFontContext;
       ViewParent parent = this.getParent();
       TextView textView = this;
       for (int i = mFontContext.size() - 1; i < 0 || (!parent instanceof TextView || (mFontContext.get(i).textAnchor != TextProperties$TextAnchor.start && textView.mPositionX == null)); i = i - 1) {
          textView = parent;
          parent = textView.getParent();
       }
       return textView;
    }
    public TextView getTextContainer(){
       ViewParent parent = this.getParent();
       TextView textView = this;
       while (parent instanceof TextView) {
          textView = parent;
          parent = textView.getParent();
       }
       return textView;
    }
    public void invalidate(){
       if (this.mPath == null) {
          return;
       }
       super.invalidate();
       this.getTextContainer().clearChildCache();
       return;
    }
    public void pushGlyphContext(){
       boolean b = (!this instanceof TextPathView && !this instanceof TSpanView)? true: false;
       this.getTextRootGlyphContext().pushContext(b, this, this.mFont, this.mPositionX, this.mPositionY, this.mDeltaX, this.mDeltaY, this.mRotate);
       return;
    }
    public void setBaselineShift(Dynamic p0){
       this.mBaselineShift = SVGLength.toString(p0);
       this.invalidate();
    }
    public void setDeltaX(Dynamic p0){
       this.mDeltaX = SVGLength.arrayFrom(p0);
       this.invalidate();
    }
    public void setDeltaY(Dynamic p0){
       this.mDeltaY = SVGLength.arrayFrom(p0);
       this.invalidate();
    }
    public void setInlineSize(Dynamic p0){
       this.mInlineSize = SVGLength.from(p0);
       this.invalidate();
    }
    public void setLengthAdjust(String p0){
       this.mLengthAdjust = TextProperties$TextLengthAdjust.valueOf(p0);
       this.invalidate();
    }
    public void setMethod(String p0){
       this.mAlignmentBaseline = TextProperties$AlignmentBaseline.getEnum(p0);
       this.invalidate();
    }
    public void setPositionX(Dynamic p0){
       this.mPositionX = SVGLength.arrayFrom(p0);
       this.invalidate();
    }
    public void setPositionY(Dynamic p0){
       this.mPositionY = SVGLength.arrayFrom(p0);
       this.invalidate();
    }
    public void setRotate(Dynamic p0){
       this.mRotate = SVGLength.arrayFrom(p0);
       this.invalidate();
    }
    public void setTextLength(Dynamic p0){
       this.mTextLength = SVGLength.from(p0);
       this.invalidate();
    }
    public void setVerticalAlign(String p0){
       if (p0 != null) {
          p0 = p0.trim();
          int i = p0.lastIndexOf(32);
          try{
             this.mAlignmentBaseline = TextProperties$AlignmentBaseline.getEnum(p0.substring(i));
          }catch(java.lang.IllegalArgumentException e0){
             this.mAlignmentBaseline = TextProperties$AlignmentBaseline.baseline;
          }
          int i1 = 0;
          try{
             this.mBaselineShift = p0.substring(i1, i);
          }catch(java.lang.IndexOutOfBoundsException e0){
             this.mBaselineShift = e0;
          }
       }else {
          this.mAlignmentBaseline = TextProperties$AlignmentBaseline.baseline;
          this.mBaselineShift = null;
       }
    }
}
