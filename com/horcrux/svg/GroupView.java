package com.horcrux.svg.GroupView;
import com.horcrux.svg.RenderableView;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import java.util.Objects;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.horcrux.svg.VirtualView;
import com.horcrux.svg.SvgView;
import android.graphics.RectF;
import android.view.ViewGroup;
import android.view.View;
import com.horcrux.svg.MaskView;
import java.lang.String;
import android.graphics.Matrix;
import com.horcrux.svg.GlyphContext;
import android.graphics.Path;
import android.graphics.Region$Op;
import android.graphics.Path$Op;
import java.lang.Math;
import android.graphics.Region;
import com.facebook.react.bridge.ReadableMap;
import android.graphics.Rect;

public class GroupView extends RenderableView	// class@0005a8
{
    public ReadableMap mFont;
    public GlyphContext mGlyphContext;

    public void GroupView(ReactContext p0){
       super(p0);
    }
    public static Object requireNonNull(Object p0){
       Objects.requireNonNull(p0);
       return p0;
    }
    public void draw(Canvas p0,Paint p1,float p2){
       this.setupGlyphContext(p0);
       this.clip(p0, p1);
       this.drawGroup(p0, p1, p2);
    }
    public void drawGroup(Canvas p0,Paint p1,float p2){
       this.pushGlyphContext();
       SvgView svgView = this.getSvgView();
       RectF rectF = new RectF();
       int i = 0;
       while (i < this.getChildCount()) {
          View childAt = this.getChildAt(i);
          if (!childAt instanceof MaskView) {
             if (childAt instanceof VirtualView) {
                if (!("none").equals(childAt.mDisplay)) {
                   if (v4 = childAt instanceof RenderableView) {
                      childAt.mergeProperties(this);
                   }
                   int i1 = childAt.saveAndSetupCanvas(p0, this.mCTM);
                   float f = this.mOpacity * p2;
                   childAt.render(p0, p1, f);
                   RectF clientRect = childAt.getClientRect();
                   if (clientRect != null) {
                      rectF.union(clientRect);
                   }
                   childAt.restoreCanvas(p0, i1);
                   if (v4) {
                      childAt.resetProperties();
                   }
                   if (childAt.isResponsible()) {
                      svgView.enableTouchEvents();
                   }
                }
             }else if(childAt instanceof SvgView){
                childAt.drawChildren(p0);
                if (childAt.isResponsible()) {
                   svgView.enableTouchEvents();
                }
             }
          }
          i = i + 1;
       }
       this.setClientRect(rectF);
       this.popGlyphContext();
       return;
    }
    public void drawPath(Canvas p0,Paint p1,float p2){
       super.draw(p0, p1, p2);
    }
    public GlyphContext getGlyphContext(){
       return this.mGlyphContext;
    }
    public Path getPath(Canvas p0,Paint p1){
       VirtualView tmPath = this.mPath;
       if (tmPath != null) {
          return tmPath;
       }
       this.mPath = new Path();
       int i = 0;
       while (i < this.getChildCount()) {
          View childAt = this.getChildAt(i);
          if (!childAt instanceof MaskView && childAt instanceof VirtualView) {
             this.mPath.addPath(childAt.getPath(p0, p1), childAt.mMatrix);
          }
          i = i + 1;
       }
       return this.mPath;
    }
    public Path getPath(Canvas p0,Paint p1,Region$Op p2){
       Path path = new Path();
       Path$Op op = Path$Op.valueOf(p2.name());
       int i = 0;
       while (i < this.getChildCount()) {
          View childAt = this.getChildAt(i);
          if (!childAt instanceof MaskView && childAt instanceof VirtualView) {
             VirtualView mMatrix = childAt.mMatrix;
             Path path1 = (childAt instanceof GroupView)? childAt.getPath(p0, p1, p2): childAt.getPath(p0, p1);
             path1.transform(mMatrix);
             path.op(path1, op);
          }
          i = i + 1;
       }
       return path;
    }
    public GlyphContext getTextRootGlyphContext(){
       return GroupView.requireNonNull(this.getTextRoot()).getGlyphContext();
    }
    public int hitTest(float[] p0){
       int i3;
       if (this.mInvertible != null && this.mTransformInvertible != null) {
          float[] uofloatArray = new float[2];
          this.mInvMatrix.mapPoints(uofloatArray, p0);
          this.mInvTransform.mapPoints(uofloatArray);
          int i = 0;
          int i1 = Math.round(uofloatArray[i]);
          int i2 = Math.round(uofloatArray[1]);
          Path clipPath = this.getClipPath();
          if (clipPath != null) {
             if (this.mClipRegionPath != clipPath) {
                this.mClipRegionPath = clipPath;
                RectF rectF = new RectF();
                this.mClipBounds = rectF;
                clipPath.computeBounds(rectF, 1);
                this.mClipRegion = this.getRegion(clipPath, this.mClipBounds);
             }
             if (!this.mClipRegion.contains(i1, i2)) {
                return -1;
             }
          }
          i1 = this.getChildCount() - 1;
          while (true) {
             if (i1 >= 0) {
                View childAt = this.getChildAt(i1);
                if (childAt instanceof VirtualView) {
                   if (!childAt instanceof MaskView) {
                      View view = childAt;
                      i3 = view.hitTest(uofloatArray);
                      if (i3 != -1) {
                         if (!view.isResponsible() && i3 == childAt.getId()) {
                            i3 = this.getId();
                            break ;
                         }
                         break ;
                      }
                   }
                }else if(childAt instanceof SvgView){
                   int i4 = childAt.reactTagForTouch(uofloatArray[i], uofloatArray[1]);
                   if (i4 != childAt.getId()) {
                      return i4;
                   }
                }
                i1 = i1 - 1;
             }
          }
          return i3;
       }
    label_0095 :
       return -1;
    }
    public void popGlyphContext(){
       this.getTextRootGlyphContext().popContext();
    }
    public void pushGlyphContext(){
       this.getTextRootGlyphContext().pushContext(this, this.mFont);
    }
    public void resetProperties(){
       int i = 0;
       while (i < this.getChildCount()) {
          View childAt = this.getChildAt(i);
          if (childAt instanceof RenderableView) {
             childAt.resetProperties();
          }
          i = i + 1;
       }
       return;
    }
    public void saveDefinition(){
       if (this.mName != null) {
          this.getSvgView().defineTemplate(this, this.mName);
       }
       int i = 0;
       while (i < this.getChildCount()) {
          View childAt = this.getChildAt(i);
          if (childAt instanceof VirtualView) {
             childAt.saveDefinition();
          }
          i = i + 1;
       }
       return;
    }
    public void setFont(ReadableMap p0){
       this.mFont = p0;
       this.invalidate();
    }
    public void setupGlyphContext(Canvas p0){
       RectF rectF = new RectF(p0.getClipBounds());
       VirtualView tmMatrix = this.mMatrix;
       if (tmMatrix != null) {
          tmMatrix.mapRect(rectF);
       }
       tmMatrix = this.mTransform;
       if (tmMatrix != null) {
          tmMatrix.mapRect(rectF);
       }
       this.mGlyphContext = new GlyphContext(this.mScale, rectF.width(), rectF.height());
       return;
    }
}
