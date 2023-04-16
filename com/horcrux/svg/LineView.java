package com.horcrux.svg.LineView;
import com.horcrux.svg.RenderableView;
import com.facebook.react.bridge.ReactContext;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.horcrux.svg.SVGLength;
import com.horcrux.svg.VirtualView;
import com.facebook.react.bridge.Dynamic;

public class LineView extends RenderableView	// class@0005ab
{
    public SVGLength mX1;
    public SVGLength mX2;
    public SVGLength mY1;
    public SVGLength mY2;

    public void LineView(ReactContext p0){
       super(p0);
    }
    public Path getPath(Canvas p0,Paint p1){
       Path path = new Path();
       path.moveTo((float)this.relativeOnWidth(this.mX1), (float)this.relativeOnHeight(this.mY1));
       path.lineTo((float)this.relativeOnWidth(this.mX2), (float)this.relativeOnHeight(this.mY2));
       return path;
    }
    public void setX1(Dynamic p0){
       this.mX1 = SVGLength.from(p0);
       this.invalidate();
    }
    public void setX2(Dynamic p0){
       this.mX2 = SVGLength.from(p0);
       this.invalidate();
    }
    public void setY1(Dynamic p0){
       this.mY1 = SVGLength.from(p0);
       this.invalidate();
    }
    public void setY2(Dynamic p0){
       this.mY2 = SVGLength.from(p0);
       this.invalidate();
    }
}
