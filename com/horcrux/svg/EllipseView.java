package com.horcrux.svg.EllipseView;
import com.horcrux.svg.RenderableView;
import com.facebook.react.bridge.ReactContext;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.horcrux.svg.SVGLength;
import com.horcrux.svg.VirtualView;
import android.graphics.RectF;
import android.graphics.Path$Direction;
import com.facebook.react.bridge.Dynamic;

public class EllipseView extends RenderableView	// class@0005a2
{
    public SVGLength mCx;
    public SVGLength mCy;
    public SVGLength mRx;
    public SVGLength mRy;

    public void EllipseView(ReactContext p0){
       super(p0);
    }
    public Path getPath(Canvas p0,Paint p1){
       Path path = new Path();
       double d = this.relativeOnWidth(this.mCx);
       double d1 = this.relativeOnHeight(this.mCy);
       double d2 = this.relativeOnWidth(this.mRx);
       double d3 = this.relativeOnHeight(this.mRy);
       path.addOval(new RectF((float)(d - d2), (float)(d1 - d3), (float)(d + d2), (float)(d1 + d3)), Path$Direction.CW);
       return path;
    }
    public void setCx(Dynamic p0){
       this.mCx = SVGLength.from(p0);
       this.invalidate();
    }
    public void setCy(Dynamic p0){
       this.mCy = SVGLength.from(p0);
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
}
