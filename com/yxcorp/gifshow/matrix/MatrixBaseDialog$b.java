package com.yxcorp.gifshow.matrix.MatrixBaseDialog$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.matrix.MatrixBaseDialog;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.lib.BaseSpringDialogFragment;

public final class MatrixBaseDialog$b implements View$OnClickListener	// class@001cda
{
    public final MatrixBaseDialog b;

    public void MatrixBaseDialog$b(MatrixBaseDialog p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MatrixBaseDialog$b.class, "1")) {
          return;
       }
       this.b.fh(2);
       this.b.dismissAllowingStateLoss();
       return;
    }
}
