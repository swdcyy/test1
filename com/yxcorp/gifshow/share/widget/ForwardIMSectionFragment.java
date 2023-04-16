package com.yxcorp.gifshow.share.widget.ForwardIMSectionFragment;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import com.yxcorp.gifshow.share.widget.ForwardIMSectionFragment$a;
import nsd.u;
import lnc.ea;
import java.lang.Class;
import mp7.e;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.widget.ForwardIMSectionFragment$b;
import yic.s0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import lnc.a1;
import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView$n;
import yic.s0$a;
import java.util.List;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import uo7.j0;
import uo7.i0;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import java.util.Collection;
import android.os.Bundle;
import com.yxcorp.gifshow.share.widget.slide.ForwardBottomSheetDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import com.yxcorp.gifshow.widget.adpter.topSheet.a;
import android.content.Context;
import androidx.fragment.app.Fragment;

public final class ForwardIMSectionFragment extends ForwardGridSectionFragment	// class@001ce5
{
    public boolean X0;
    public static final ForwardIMSectionFragment$a Y0;

    static {
       ForwardIMSectionFragment.Y0 = new ForwardIMSectionFragment$a(null);
       ea.b().c(ForwardIMSectionFragment.class);
    }
    public void ForwardIMSectionFragment(){
       super();
       this.X0 = true;
    }
    public void ForwardIMSectionFragment(u p0){
       super();
    }
    public boolean Eg(){
       return false;
    }
    public e Nh(){
       Object obj = PatchProxy.apply(null, this, ForwardIMSectionFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ForwardIMSectionFragment$b(this, s0.a.a(this.Lh(), a1.e(20.00f), a1.e(300.00f), 0x7f0a134d, (- a1.e(20.00f))));
    }
    public void dd(List p0){
       ArrayList uArrayList1;
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardIMSectionFragment.class, "3")) {
          return;
       }
       a.p(p0, "operationList");
       if (this.ai()) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             Object obj1 = obj;
             int i = 0;
             if (obj1.a().size() == 1) {
                if (obj1.a().size() == 1) {
                   int i1 = a.g(obj1.a().get(i).a().mElementType, "banner") ^ 1;
                   if (i1) {
                   label_005b :
                      i = 1;
                   }
                }
             }else {
                goto label_005b ;
             }
             if (i) {
                uArrayList.add(obj);
             }
          }
          uArrayList1 = uArrayList;
       }
       super.dd(uArrayList1);
       return;
    }
    public void onActivityCreated(Bundle p0){
       Window window;
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardIMSectionFragment.class, "2")) {
          return;
       }
       super.onActivityCreated(p0);
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          window = dialog.getWindow();
          if (window != null) {
             window.setDimAmount(0);
          }
       }
       dialog = this.getDialog();
       if (dialog != null) {
          dialog.setCanceledOnTouchOutside(false);
       }
       dialog = this.getDialog();
       if (dialog != null) {
          window = dialog.getWindow();
          if (window != null) {
             window.setWindowAnimations(R.style.arg_RES_7f1103dd);
          }
       }
       Dialog dialog1 = this.getDialog();
       if (dialog1 != null) {
          Window window1 = dialog1.getWindow();
          if (window1 != null) {
             window1.setGravity(49);
          }
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ForwardIMSectionFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.onCreateDialog(p0);
       return new a(this.getContext(), this.getTheme());
    }
}
