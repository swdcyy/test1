package com.horcrux.svg.RectView;
import com.horcrux.svg.RenderableView;
import com.facebook.react.bridge.ReactContext;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.horcrux.svg.SVGLength;
import com.horcrux.svg.VirtualView;
import android.graphics.Path$Direction;
import com.facebook.react.bridge.Dynamic;

public class RectView extends RenderableView	// class@0005bc
{
    public SVGLength mH;
    public SVGLength mRx;
    public SVGLength mRy;
    public SVGLength mW;
    public SVGLength mX;
    public SVGLength mY;

    public void RectView(ReactContext p0){
       super(p0);
    }
    public Path getPath(Canvas p0,Paint p1){
       double d4;
       double d5;
       RectView rectView = this;
       Path path = new Path();
       double d = rectView.relativeOnWidth(rectView.mX);
       double d1 = rectView.relativeOnHeight(rectView.mY);
       double d2 = rectView.relativeOnWidth(rectView.mW);
       double d3 = rectView.relativeOnHeight(rectView.mH);
       RectView mRx = rectView.mRx;
       if (mRx != null || rectView.mRy != null) {
          if (mRx == null) {
             d4 = rectView.relativeOnHeight(rectView.mRy);
          }else if(rectView.mRy == null){
             d4 = rectView.relativeOnWidth(mRx);
          }else {
             d4 = rectView.relativeOnWidth(mRx);
             d5 = rectView.relativeOnHeight(rectView.mRy);
          label_005a :
             double d6 = 2.00f;
             double d7 = d2 / d6;
             if (d4 - d7 > 0) {
                d4 = d7;
             }
             d6 = d3 / d6;
             if (d5 - d6 > 0) {
                d5 = d6;
             }
             path.addRoundRect((float)d, (float)d1, (float)(d + d2), (float)(d1 + d3), (float)d4, (float)d5, Path$Direction.CW);
          }
          d5 = d4;
          goto label_005a ;
       }else {
          path.addRect((float)d, (float)d1, (float)(d + d2), (float)(d1 + d3), Path$Direction.CW);
          path.close();
       }
       return path;
    }
    public void setHeight(Dynamic p0){
       this.mH = SVGLength.from(p0);
       this.invalidate();
    }
    public void setRx(Dynamic p0){
       this.mRx = SVGLength.from(p0);
       this.invalidate();
    }
    public void setRy(Dynamic p0){
       this.mRy = SVGLength.from(p0);
       this.invalidate();
    }
    public void setWidth(Dynamic p0){
       this.mW = SVGLength.from(p0);
       this.invalidate();
    }
    public void setX(Dynamic p0){
       this.mX = SVGLength.from(p0);
       this.invalidate();
    }
    public void setY(Dynamic p0){
       this.mY = SVGLength.from(p0);
       this.invalidate();
    }
}
