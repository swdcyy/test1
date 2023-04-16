package com.yxcorp.gifshow.matrix.MatrixBaseDialog$d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.matrix.MatrixBaseDialog;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.kwai.android.common.bean.Channel;
import kotlin.Pair;
import qrd.r0;
import com.kwai.android.register.processor.manager.CurrentProcessorManager;
import com.kwai.lib.BaseSpringDialogFragment;

public final class MatrixBaseDialog$d implements View$OnClickListener	// class@001cdc
{
    public final MatrixBaseDialog b;

    public void MatrixBaseDialog$d(MatrixBaseDialog p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MatrixBaseDialog$d.class, "1")) {
          return;
       }
       this.b.fh(1);
       MatrixBaseDialog$d uod = (this.b.g.length() > 0)? 1: null;
       if (uod) {
          uod = this.b;
          Pair[] pairArray = new Pair[]{r0.a("push_style", String.valueOf(this.b.f))};
          CurrentProcessorManager.clickNotification(uod.g, uod.ah(), 1, pairArray);
       }
       this.b.dismissAllowingStateLoss();
       return;
    }
}
