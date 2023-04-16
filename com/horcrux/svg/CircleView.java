package com.horcrux.svg.CircleView;
import com.horcrux.svg.RenderableView;
import com.facebook.react.bridge.ReactContext;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.horcrux.svg.SVGLength;
import com.horcrux.svg.VirtualView;
import android.graphics.Path$Direction;
import com.facebook.react.bridge.Dynamic;

public class CircleView extends RenderableView	// class@00059d
{
    public SVGLength mCx;
    public SVGLength mCy;
    public SVGLength mR;

    public void CircleView(ReactContext p0){
       super(p0);
    }
    public Path getPath(Canvas p0,Paint p1){
       Path path = new Path();
       path.addCircle((float)this.relativeOnWidth(this.mCx), (float)this.relativeOnHeight(this.mCy), (float)this.relativeOnOther(this.mR), Path$Direction.CW);
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
    public void setR(Dynamic p0){
       this.mR = SVGLength.from(p0);
       this.invalidate();
    }
}
