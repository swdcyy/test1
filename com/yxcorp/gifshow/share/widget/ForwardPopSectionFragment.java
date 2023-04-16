package com.yxcorp.gifshow.share.widget.ForwardPopSectionFragment;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import com.yxcorp.gifshow.share.widget.ForwardPopSectionFragment$a;
import nsd.u;
import mp7.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.widget.ForwardPopSectionFragment$b;
import yic.s0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import lnc.a1;
import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView$n;
import yic.s0$a;
import com.kwai.sharelib.model.ShareInitResponse$ShareTheme;
import kotlin.jvm.internal.a;
import com.kwai.sharelib.ui.SharePanelFragment;
import java.util.List;
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
import com.kwai.sharelib.model.ShareInitResponse$ThemeElement;

public final class ForwardPopSectionFragment extends ForwardGridSectionFragment	// class@001cf7
{
    public final int X0;
    public int Y0;
    public static final ForwardPopSectionFragment$a Z0;

    static {
       ForwardPopSectionFragment.Z0 = new ForwardPopSectionFragment$a(null);
    }
    public void ForwardPopSectionFragment(){
       super();
       this.X0 = 128;
       this.Y0 = 2;
    }
    public void ForwardPopSectionFragment(u p0){
       super();
    }
    public boolean Eg(){
       return false;
    }
    public e Nh(){
       Object obj = PatchProxy.apply(null, this, ForwardPopSectionFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ForwardPopSectionFragment$b(this, s0.a.a(this.Lh(), a1.e(20.00f), a1.e(336.00f), 0x7f0a134d, (- a1.e(11.00f))));
    }
    public void W8(ShareInitResponse$ShareTheme p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardPopSectionFragment.class, "3")) {
          return;
       }
       a.p(p0, "theme");
       this.Xh().Zg(p0);
       return;
    }
    public boolean ai(){
       boolean b = true;
       if (this.Y0 == b) {
       }else {
          b = false;
       }
       return b;
    }
    public void dd(List p0){
       ArrayList uArrayList1;
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardPopSectionFragment.class, "4")) {
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
       Dialog dialog1;
       Window window1;
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardPopSectionFragment.class, "1")) {
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
       if (this.ai()) {
          dialog = this.getDialog();
          if (dialog != null) {
             window = dialog.getWindow();
             if (window != null) {
                window.setWindowAnimations(R.style.arg_RES_7f1103dd);
             }
          }
          dialog1 = this.getDialog();
          if (dialog1 != null) {
             window1 = dialog1.getWindow();
             if (window1 != null) {
                window1.setGravity(49);
             }
          }
       }else {
          dialog = this.getDialog();
          if (dialog != null) {
             window = dialog.getWindow();
             if (window != null) {
                window.setWindowAnimations(R.style.arg_RES_7f1103dc);
             }
          }
          dialog1 = this.getDialog();
          if (dialog1 != null) {
             window1 = dialog1.getWindow();
             if (window1 != null) {
                window1.setGravity(81);
             }
          }
       }
    label_0075 :
       return;
    }
    public void show(){
       if (PatchProxy.applyVoid(null, this, ForwardPopSectionFragment.class, "2")) {
          return;
       }
       ShareInitResponse$ShareTheme mCancelButto = this.Xh().Vg().mCancelButton;
       if (mCancelButto != null) {
          mCancelButto.mBackgroundColour = null;
       }
       mCancelButto = this.Xh().Vg().mCancelButton;
       if (mCancelButto != null) {
          mCancelButto.mHighlightedBackgroundColour = null;
       }
       super.show();
       return;
    }
}
