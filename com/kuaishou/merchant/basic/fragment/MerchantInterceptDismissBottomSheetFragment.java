package com.kuaishou.merchant.basic.fragment.MerchantInterceptDismissBottomSheetFragment;
import com.kuaishou.merchant.basic.fragment.MerchantBottomSheetFragment;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import java.lang.Object;
import java.lang.ref.WeakReference;
import bt3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import android.os.Bundle;
import android.app.Dialog;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.DialogFragment;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import qt3.i;
import android.content.Context;
import androidx.fragment.app.Fragment;
import ht3.h;
import qt3.i$a;
import ht3.g;
import android.content.DialogInterface$OnKeyListener;

public abstract class MerchantInterceptDismissBottomSheetFragment extends MerchantBottomSheetFragment	// class@0015b7
{
    public List B;
    public static final int C;

    public void MerchantInterceptDismissBottomSheetFragment(){
       super();
       this.B = new ArrayList();
    }
    public boolean Kh(int p0){
       if (q.f(this.B)) {
          return false;
       }
       Iterator iterator = this.B.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          a uoa = iterator.next().get();
          if (uoa != null && uoa.E3(p0)) {
             break ;
          }
       }
       return true;
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, MerchantInterceptDismissBottomSheetFragment.class, "2")) {
          return;
       }
       if (this.Kh(1)) {
          return;
       }
       super.dismiss();
       return;
    }
    public void dismissAllowingStateLoss(){
       if (PatchProxy.applyVoid(null, this, MerchantInterceptDismissBottomSheetFragment.class, "3")) {
          return;
       }
       if (this.Kh(1)) {
          return;
       }
       super.dismissAllowingStateLoss();
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       p0 = PatchProxy.applyOneRefs(p0, this, MerchantInterceptDismissBottomSheetFragment.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       boolean b = true;
       this.setCancelable(b);
       int i = (this.sh())? 1: 2;
       this.setStyle(i, this.u);
       i oi = new i(this.getContext(), this.getTheme());
       oi.setCanceledOnTouchOutside(b);
       oi.d(new h(this));
       oi.setOnKeyListener(new g(this));
       return oi;
    }
}
