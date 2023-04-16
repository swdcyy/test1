package com.kuaishou.live.common.core.basic.widget.SingleSwitchPanel;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import java.lang.String;
import com.kuaishou.live.common.core.basic.widget.SingleSwitchPanel$a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import d61.y;
import va1.n0;
import java.lang.Math;
import lnc.a1;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.util.HashMap;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kwai.library.widget.button.SlipSwitchButton;
import ya1.l0;
import com.kwai.library.widget.button.SlipSwitchButton$a;

public final class SingleSwitchPanel extends LiveSafeDialogFragment	// class@000f34
{
    public final SingleSwitchPanel$a A;
    public HashMap B;
    public final String s;
    public AppCompatTextView t;
    public AppCompatTextView u;
    public AppCompatTextView v;
    public SlipSwitchButton w;
    public final String x;
    public final String y;
    public final String z;

    public void SingleSwitchPanel(String p0,String p1,String p2,SingleSwitchPanel$a p3){
       a.p(p0, "title");
       a.p(p1, "mainDescription");
       a.p(p2, "subDescription");
       super();
       this.x = p0;
       this.y = p1;
       this.z = p2;
       this.A = p3;
       this.s = "SingleSwitchPanel";
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SingleSwitchPanel.class, "4")) {
          return;
       }
       super.onActivityCreated(p0);
       if (!PatchProxy.applyVoid(null, this, SingleSwitchPanel.class, "7")) {
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             Window window = dialog.getWindow();
             if (window != null) {
                if (y.d(this.getActivity())) {
                   window.setLayout(Math.min(n0.f(), n0.e()), -1);
                }else {
                   window.setLayout(-1, a1.d(R.dimen.arg_RES_7f070965));
                }
             }
          }
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Window obj = PatchProxy.applyOneRefs(p0, this, SingleSwitchPanel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       a.o(uDialog, "super.onCreateDialog\(savedInstanceState\)");
       obj = uDialog.getWindow();
       if (obj != null) {
          obj.setBackgroundDrawableResource(0x106000d);
          obj.requestFeature(1);
          obj.setDimAmount(0);
          if (y.d(this.getActivity())) {
             obj.setWindowAnimations(R.style.arg_RES_7f1103e0);
             obj.setGravity(5);
          }else {
             obj.setWindowAnimations(R.style.arg_RES_7f1103d9);
             obj.setGravity(80);
          }
       }
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SingleSwitchPanel.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(p0, 0x7f0d0dc8, p1, false);
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, SingleSwitchPanel.class, "10")) {
       }else {
          SingleSwitchPanel tB = this.B;
          if (tB != null) {
             tB.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       View view;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SingleSwitchPanel.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       view = p0.findViewById(R.id.live_single_switch_panel_title);
       a.o(view, "view.findViewById\(R.id.l¡­ingle_switch_panel_title\)");
       this.t = view;
       if (view == null) {
          a.S("titleView");
       }
       view.setText(this.x);
       view = p0.findViewById(R.id.live_single_switch_panel_main_description);
       a.o(view, "view.findViewById\(R.id.l¡­h_panel_main_description\)");
       this.u = view;
       if (view == null) {
          a.S("mainDescriptionView");
       }
       view.setText(this.y);
       view = p0.findViewById(R.id.live_single_switch_panel_sub_description);
       a.o(view, "view.findViewById\(R.id.l¡­ch_panel_sub_description\)");
       this.v = view;
       if (view == null) {
          a.S("subDescriptionView");
       }
       view.setText(this.z);
       p0 = p0.findViewById(R.id.live_single_switch_panel_switch);
       a.o(p0, "view.findViewById\(R.id.l¡­ngle_switch_panel_switch\)");
       this.w = p0;
       if (!PatchProxy.applyVoid(null, this, SingleSwitchPanel.class, "8")) {
          SingleSwitchPanel tw = this.w;
          if (tw == null) {
             a.S("switch");
          }
          tw.setOnSwitchChangeListener2(new l0(this));
       }
       return;
    }
}
