package com.facebook.react.uimanager.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class b$a	// class@001339
{
    public double[] perspective;
    public double[] rotationDegrees;
    public double[] scale;
    public double[] skew;
    public double[] translation;

    public void b$a(){
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
    public static void resetArray(double[] p0){
       for (int i = 0; i < p0.length; i = i + 1) {
          p0[i] = 0;
       }
       return;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       b$a.resetArray(this.perspective);
       b$a.resetArray(this.scale);
       b$a.resetArray(this.skew);
       b$a.resetArray(this.translation);
       b$a.resetArray(this.rotationDegrees);
       return;
    }
}
