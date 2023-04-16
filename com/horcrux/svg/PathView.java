package com.horcrux.svg.PathView;
import com.horcrux.svg.RenderableView;
import com.facebook.react.bridge.ReactContext;
import com.horcrux.svg.VirtualView;
import com.horcrux.svg.PathParser;
import android.graphics.Path;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.lang.String;

public class PathView extends RenderableView	// class@0005b1
{
    public Path mPath;

    public void PathView(ReactContext p0){
       super(p0);
       PathParser.mScale = this.mScale;
       this.mPath = new Path();
    }
    public Path getPath(Canvas p0,Paint p1){
       return this.mPath;
    }
    public void setD(String p0){
       this.mPath = PathParser.parse(p0);
       this.elements = PathParser.elements;
       this.invalidate();
    }
}
