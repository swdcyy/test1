package com.yxcorp.gifshow.matrix.MatrixBaseDialog$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.matrix.MatrixBaseDialog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.lib.BaseSpringDialogFragment;

public final class MatrixBaseDialog$c implements Runnable	// class@001cdb
{
    public final MatrixBaseDialog b;

    public void MatrixBaseDialog$c(MatrixBaseDialog p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, MatrixBaseDialog$c.class, "1")) {
          return;
       }
       this.b.dismissAllowingStateLoss();
       return;
    }
}
