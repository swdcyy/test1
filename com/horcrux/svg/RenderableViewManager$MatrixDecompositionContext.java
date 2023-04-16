package com.horcrux.svg.RenderableViewManager$MatrixDecompositionContext;
import com.facebook.react.uimanager.b$a;

public class RenderableViewManager$MatrixDecompositionContext extends b$a	// class@0005d9
{
    public final double[] perspective;
    public final double[] rotationDegrees;
    public final double[] scale;
    public final double[] skew;
    public final double[] translation;

    public void RenderableViewManager$MatrixDecompositionContext(){
       super();
       double[] uodoubleArra = new double[4];
       this.perspective = uodoubleArra;
       double[] uodoubleArra1 = new double[3];
       this.scale = uodoubleArra1;
       uodoubleArra1 = new double[3];
       this.skew = uodoubleArra1;
       uodoubleArra1 = new double[3];
       this.translation = uodoubleArra1;
       uodoubleArra = new double[3];
       this.rotationDegrees = uodoubleArra;
    }
}
