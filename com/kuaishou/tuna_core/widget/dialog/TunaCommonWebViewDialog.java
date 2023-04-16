package com.kuaishou.tuna_core.widget.dialog.TunaCommonWebViewDialog;
import lnc.g2$a;
import com.yxcorp.gifshow.recycler.fragment.BaseDialogFragment;
import com.kuaishou.tuna_core.widget.dialog.TunaCommonWebViewDialog$a;
import nsd.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.tuna_core.widget.dialog.presenter.TunaWebViewDialogPresenter;
import s05.b;
import s05.a;
import android.os.Bundle;
import androidx.fragment.app.KwaiDialogFragment;
import java.io.Serializable;
import com.kuaishou.tuna_core.widget.dialog.model.TunaWebDialogModel;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.WindowManager$LayoutParams;
import lnc.a1;
import lnc.g2;

public final class TunaCommonWebViewDialog extends BaseDialogFragment implements g2$a	// class@001139
{
    public g2 p;
    public TunaWebDialogModel q;
    public static final TunaCommonWebViewDialog$a r;

    static {
       TunaCommonWebViewDialog.r = new TunaCommonWebViewDialog$a(null);
    }
    public void TunaCommonWebViewDialog(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, TunaCommonWebViewDialog.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new TunaWebViewDialogPresenter());
       obj.U7(new b());
       obj.U7(new a());
       PatchProxy.onMethodExit(TunaCommonWebViewDialog.class, "3");
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaCommonWebViewDialog.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.q = this.Zg("KEY_ARG_WEB_DIALOG_MODEL");
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, TunaCommonWebViewDialog.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "inflater");
       super.onCreateView(p0, p1, p2);
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             window.setBackgroundDrawable(new ColorDrawable(0));
          }
       }
       return p0.inflate(0x7f0d1642, p1);
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TunaCommonWebViewDialog.class, "4")) {
          return;
       }
       super.onStart();
       if (!PatchProxy.applyVoid(objArray, this, TunaCommonWebViewDialog.class, "7")) {
          TunaCommonWebViewDialog tq = this.q;
          if (tq != null) {
             Dialog dialog = this.getDialog();
             if (dialog != null) {
                a.o(dialog, "dialog ?: return");
                dialog.setCancelable(true);
                dialog.setCanceledOnTouchOutside(true);
                Window window = dialog.getWindow();
                if (window != null) {
                   objArray = window.getAttributes();
                }
                if (objArray != null) {
                   objArray.gravity = 17;
                   TunaCommonWebViewDialog tq1 = this.q;
                   float f = (tq1 != null && tq1.mDialogStyle == 2)? (float)tq.mHeight + 172.00f: (float)tq.mHeight;
                   objArray.height = a1.e(f);
                   objArray.width = a1.e((float)tq.mWidth);
                   Window window1 = dialog.getWindow();
                   if (window1 != null) {
                      window1.setAttributes(objArray);
                   }
                }
             }
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TunaCommonWebViewDialog.class, "5")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoid(null, this, TunaCommonWebViewDialog.class, "6")) {
          if (this.p == null) {
             this.p = new g2(this, this);
          }
          TunaCommonWebViewDialog tp = this.p;
          if (tp != null) {
             Object[] objArray = new Object[]{this.q,this};
             tp.b(objArray);
          }
       }
       return;
    }
}
