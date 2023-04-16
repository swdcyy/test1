package com.horcrux.svg.TextPathView;
import com.horcrux.svg.TextView;
import com.facebook.react.bridge.ReactContext;
import com.horcrux.svg.TextProperties$TextPathMethod;
import com.horcrux.svg.TextProperties$TextPathSpacing;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.horcrux.svg.GroupView;
import com.horcrux.svg.TextProperties$TextPathMidLine;
import android.graphics.Path;
import com.horcrux.svg.TextProperties$TextPathSide;
import com.horcrux.svg.SVGLength;
import com.horcrux.svg.SvgView;
import com.horcrux.svg.VirtualView;
import java.lang.String;
import com.horcrux.svg.RenderableView;
import com.facebook.react.bridge.Dynamic;

public class TextPathView extends TextView	// class@000608
{
    public String mHref;
    public TextProperties$TextPathMethod mMethod;
    public TextProperties$TextPathMidLine mMidLine;
    public TextProperties$TextPathSide mSide;
    public TextProperties$TextPathSpacing mSpacing;
    public SVGLength mStartOffset;

    public void TextPathView(ReactContext p0){
       super(p0);
       this.mMethod = TextProperties$TextPathMethod.align;
       this.mSpacing = TextProperties$TextPathSpacing.exact;
    }
    public void draw(Canvas p0,Paint p1,float p2){
       this.drawGroup(p0, p1, p2);
    }
    public TextProperties$TextPathMethod getMethod(){
       return this.mMethod;
    }
    public TextProperties$TextPathMidLine getMidLine(){
       return this.mMidLine;
    }
    public Path getPath(Canvas p0,Paint p1){
       return this.getGroupPath(p0, p1);
    }
    public TextProperties$TextPathSide getSide(){
       return this.mSide;
    }
    public TextProperties$TextPathSpacing getSpacing(){
       return this.mSpacing;
    }
    public SVGLength getStartOffset(){
       return this.mStartOffset;
    }
    public Path getTextPath(Canvas p0,Paint p1){
       VirtualView definedTempl = this.getSvgView().getDefinedTemplate(this.mHref);
       if (!definedTempl instanceof RenderableView) {
          return null;
       }
       return definedTempl.getPath(p0, p1);
    }
    public void popGlyphContext(){
    }
    public void pushGlyphContext(){
    }
    public void setHref(String p0){
       this.mHref = p0;
       this.invalidate();
    }
    public void setMethod(String p0){
       this.mMethod = TextProperties$TextPathMethod.valueOf(p0);
       this.invalidate();
    }
    public void setSharp(String p0){
       this.mMidLine = TextProperties$TextPathMidLine.valueOf(p0);
       this.invalidate();
    }
    public void setSide(String p0){
       this.mSide = TextProperties$TextPathSide.valueOf(p0);
       this.invalidate();
    }
    public void setSpacing(String p0){
       this.mSpacing = TextProperties$TextPathSpacing.valueOf(p0);
       this.invalidate();
    }
    public void setStartOffset(Dynamic p0){
       this.mStartOffset = SVGLength.from(p0);
       this.invalidate();
    }
}
