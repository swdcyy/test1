package com.yxcorp.gifshow.share.widget.ForwardGridSectionWithImPanelFragment;
import djc.y0;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionWithImPanelFragment$d;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionWithImPanelFragment$a;
import uo7.i0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import com.yxcorp.gifshow.share.im.ImSharePanelElement;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.kwai.feature.api.social.message.imshare.model.IMShareTarget;
import com.smile.gifmaker.mvps.utils.observable.ObservableList;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.kwai.sharelib.ui.SharePanelFragment;
import java.util.Objects;
import kotlin.jvm.internal.a;
import uo7.k0;
import uo7.j0;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import gic.i;
import io.reactivex.subjects.PublishSubject;
import mp7.e;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionWithImPanelFragment$c;
import java.util.Iterator;
import androidx.fragment.app.Fragment;
import zv5.f;
import androidx.fragment.app.FragmentActivity;
import android.os.IBinder;
import android.content.Context;
import com.yxcorp.utility.n;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.os.Bundle;
import com.yxcorp.gifshow.share.widget.slide.ForwardBottomSheetDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import o07.d$a;
import o07.d;
import djc.l0;
import android.view.View$OnClickListener;
import djc.k0;
import android.content.DialogInterface$OnKeyListener;
import android.content.res.Configuration;
import rkd.b;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionWithImPanelFragment$b;
import android.view.View$OnLayoutChangeListener;
import android.content.DialogInterface;
import lnc.g2;
import com.yxcorp.gifshow.share.widget.n;
import lnc.g2$a;

public class ForwardGridSectionWithImPanelFragment extends ForwardGridSectionFragment implements y0	// class@001ce2
{
    public g2 X0;
    public final ForwardGridSectionWithImPanelFragment$d Y0;
    public boolean Z0;
    public boolean a1;
    public Dialog b1;
    public final d$a c1;
    public static final int d1;

    public void ForwardGridSectionWithImPanelFragment(){
       super();
       this.Y0 = new ForwardGridSectionWithImPanelFragment$d();
       this.Z0 = false;
       this.c1 = new ForwardGridSectionWithImPanelFragment$a(this);
    }
    public static boolean ji(i0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ForwardGridSectionWithImPanelFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.a() instanceof ImSharePanelElement && p0.a().isRtcRunning()) {
          return true;
       }
       return false;
    }
    public void Bc(List p0,i0 p1){
       int i;
       int i2;
       int i3;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ForwardGridSectionWithImPanelFragment.class, "13")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       IMShareTarget iMShareTarge = p0.get(0);
       if (this.Y0.d.contains(iMShareTarge)) {
          this.Y0.d.remove(iMShareTarge);
          if (q.f(this.Y0.d)) {
             this.ii();
          }
       }else {
          int i6 = 9;
          if (this.Y0.d.size() >= i6) {
             i.d(R.style.arg_RES_7f11066a, a1.r(R.string.arg_RES_7f10052b, String.valueOf(i6)));
             return;
          }else {
             this.Y0.d.add(iMShareTarge);
          }
       }
       if (p1 != null) {
          SharePanelFragment sharePanelFr = this.Xh();
          Objects.requireNonNull(sharePanelFr);
          if (!PatchProxy.applyVoidOneRefs(p1, sharePanelFr, SharePanelFragment.class, "15")) {
             a.p(p1, "updateOp");
             if (p1 instanceof k0) {
                p1 = p1.b();
             }
             i = sharePanelFr.h.size() - 1;
             if (i >= 0) {
                int i1 = 0;
                i2 = -1;
                i3 = -1;
                j0 oj0 = sharePanelFr.h.get(i1);
                int i4 = oj0.a().size() - 1;
                while (i4 >= 0) {
                   int i5 = 0;
                   i0 oi0 = oj0.a().get(i5);
                   while (oi0 instanceof k0) {
                      oi0 = oi0.b();
                      break ;
                      i5 = i5 + 1;
                   }
                   if (oi0.equals(p1)) {
                      i2 = i1;
                      i3 = i5;
                   }else if(i5 != i4){
                      goto label_00c1 ;
                   }else if(i1 != i){
                      i1 = i1 + 1;
                   }
                }
             }else {
                i2 = -1;
                i3 = -1;
             }
             if (i2 != -1 && i3 != -1) {
                sharePanelFr = sharePanelFr.c;
                LinearLayoutManager linearLayout = null;
                RecyclerView$LayoutManager layoutManage = (sharePanelFr != null)? sharePanelFr.getLayoutManager(): linearLayout;
                if (layoutManage instanceof LinearLayoutManager) {
                   linearLayout = layoutManage;
                }
                if (linearLayout != null) {
                   View view = linearLayout.findViewByPosition(i2);
                   if (view != null) {
                      RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
                      if (recyclerView != null) {
                         RecyclerView$Adapter adapter = recyclerView.getAdapter();
                         if (adapter != null) {
                            adapter.l0(i3);
                         }
                      }
                   }
                }
             }
          }
       }
    label_00fe :
       return;
    }
    public boolean Hb(){
       return this.Y0.b;
    }
    public void M4(List p0,i p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ForwardGridSectionWithImPanelFragment.class, "11")) {
          return;
       }
       this.Z0 = true;
       this.Y0.d.clear();
       this.Bc(p0, null);
       this.ki();
       this.Y0.h.onNext(p1);
       return;
    }
    public e Nh(){
       Object obj = PatchProxy.apply(null, this, ForwardGridSectionWithImPanelFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ForwardGridSectionWithImPanelFragment$c(this, this);
    }
    public boolean Ob(){
       return this.Z0;
    }
    public List Rd(){
       return this.Y0.d;
    }
    public int Vh(){
       return 0x7f0d0496;
    }
    public void dd(List p0){
       boolean b1;
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionWithImPanelFragment.class, "2")) {
          return;
       }
       ForwardGridSectionWithImPanelFragment tY0 = this.Y0;
       boolean b = true;
       if (p0.size() == 3) {
          ShareInitResponse$SharePanelElement obj = PatchProxy.applyOneRefs(p0, this, ForwardGridSectionWithImPanelFragment.class, "3");
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else {
             List list = p0.get(0).a();
             if (!q.f(list)) {
                Iterator iterator1 = list.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      if (iterator1.next().a() instanceof ImSharePanelElement) {
                         continue ;
                      }
                   }else {
                      b1 = true;
                      break ;
                   }
                }
             }
             b1 = false;
          }
          if (b1) {
          label_0059 :
             tY0.b = b;
             if (!PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionWithImPanelFragment.class, "4") && this.Y0.b != null) {
                Iterator iterator = p0.get(0).a().iterator();
                while (iterator.hasNext()) {
                   obj = iterator.next().a();
                   if (obj instanceof ImSharePanelElement) {
                      obj.mAutoHidePanelWhenClicked = obj.isMoreBtn();
                   }
                }
             }
             super.dd(p0);
             return;
          }
       }
       b = false;
       goto label_0059 ;
    }
    public void di(){
       if (PatchProxy.applyVoid(null, this, ForwardGridSectionWithImPanelFragment.class, "17")) {
          return;
       }
       this.P = 1;
       this.ii();
       return;
    }
    public String ff(){
       return this.Y0.k;
    }
    public final void hi(){
       if (PatchProxy.applyVoid(null, this, ForwardGridSectionWithImPanelFragment.class, "5")) {
          return;
       }
       this.Z0 = false;
       this.Xh().getView().findViewById(R.id.forward_im_panel).setVisibility(8);
       this.ki();
       this.Y0.d.clear();
       ForwardGridSectionWithImPanelFragment$d g = this.Y0.g;
       if (g != null) {
          g.onCancel();
       }
       return;
    }
    public final void ii(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ForwardGridSectionWithImPanelFragment.class, "9")) {
          return;
       }
       if (this.a1 != null) {
          if (!PatchProxy.applyVoid(objArray, this, ForwardGridSectionWithImPanelFragment.class, "6")) {
             n.E(this.getActivity(), this.Xh().getView().findViewById(R.id.forward_im_panel).findViewById(R.id.editor).getWindowToken());
          }
          this.hi();
       }else if(this.Z0 != null){
          this.hi();
       }else {
          this.dismiss();
       }
       return;
    }
    public final void ki(){
       if (PatchProxy.applyVoid(null, this, ForwardGridSectionWithImPanelFragment.class, "12")) {
          return;
       }
       RecyclerView recyclerView = this.Xh().h0();
       if (recyclerView == null) {
          return;
       }
       RecyclerView$ViewHolder viewHolder = recyclerView.findViewHolderForAdapterPosition(0);
       if (viewHolder == null) {
          return;
       }
       recyclerView = viewHolder.itemView.findViewById(R.id.recyclerView);
       if (recyclerView == null) {
          return;
       }
       RecyclerView$Adapter adapter = recyclerView.getAdapter();
       if (adapter == null) {
          return;
       }
       adapter.k0();
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionWithImPanelFragment.class, "7")) {
          return;
       }
       super.onActivityCreated(p0);
       Dialog dialog = this.getDialog();
       this.b1 = dialog;
       Object[] objArray = null;
       Window window = (dialog != null)? dialog.getWindow(): objArray;
       if (window != null) {
          window.setSoftInputMode(18);
          d.b(window, this.c1);
       }
       if (!PatchProxy.applyVoid(objArray, this, ForwardGridSectionWithImPanelFragment.class, "8")) {
          ForwardGridSectionWithImPanelFragment tb1 = this.b1;
          if (tb1 != null) {
             tb1.findViewById(R.id.touch_outside).setOnClickListener(new l0(this));
             this.b1.setOnKeyListener(new k0(this));
          }
       }
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionWithImPanelFragment.class, "20")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (b.g()) {
          ForwardGridSectionWithImPanelFragment tb1 = this.b1;
          if (tb1 != null && tb1.getWindow() != null) {
             d.c(this.b1.getWindow(), this.c1);
          }
          tb1 = this.b1;
          if (tb1 != null && (tb1.getWindow() != null && this.b1.getWindow().getDecorView() != null)) {
             this.b1.getWindow().getDecorView().addOnLayoutChangeListener(new ForwardGridSectionWithImPanelFragment$b(this));
          }
       }
    label_0051 :
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ForwardGridSectionWithImPanelFragment.class, "18")) {
          return;
       }
       super.onDestroy();
       this.b1 = null;
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionWithImPanelFragment.class, "19")) {
          return;
       }
       this.Z0 = false;
       this.ki();
       ForwardGridSectionWithImPanelFragment tb1 = this.b1;
       if (tb1 != null && tb1.getWindow() != null) {
          d.c(this.b1.getWindow(), this.c1);
       }
       super.onDismiss(p0);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ForwardGridSectionWithImPanelFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoid(null, this, ForwardGridSectionWithImPanelFragment.class, "10")) {
          this.X0 = new g2(this, n.b);
          p0.e = this.Xh();
          ForwardGridSectionWithImPanelFragment tY0 = this.Y0;
          tY0.f = this;
          this.X0.b(tY0);
       }
       return;
    }
}
