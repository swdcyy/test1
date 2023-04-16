package com.kwai.emotionsdk.widget.EmojiPopupWindow;
import androidx.fragment.app.CommitSafeDialogFragment;
import com.kwai.emotionsdk.util.ActivityContext;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.View;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import android.view.WindowManager$LayoutParams;
import java.util.List;
import com.kwai.emotionsdk.widget.FrescoImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import jl5.d;
import java.lang.Integer;
import android.content.res.Configuration;
import android.content.res.Resources;
import u0.d;
import pd6.a;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import java.lang.IllegalArgumentException;

public class EmojiPopupWindow extends CommitSafeDialogFragment	// class@000dba
{
    public View b;
    public FrescoImageView c;
    public TextView d;
    public int e;
    public int f;
    public List g;
    public String h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;

    public void EmojiPopupWindow(){
       super();
       this.i = 0x7f11035d;
       this.j = n.A(ActivityContext.d().b());
    }
    public void Ug(){
       if (PatchProxy.applyVoid(null, this, EmojiPopupWindow.class, "7")) {
          return;
       }
       if (this.getDialog() != null) {
          this.getDialog().hide();
          this.b.setVisibility(8);
       }
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmojiPopupWindow.class, "3")) {
          return;
       }
       Dialog dialog = this.getDialog();
       super.onActivityCreated(p0);
       if (!this.getShowsDialog()) {
          return;
       }
       Window window = (dialog == null)? null: dialog.getWindow();
       if (window != null) {
          window.setWindowAnimations(R.style.arg_RES_7f1103a5);
          window.setLayout(-1, this.getActivity().getWindow().getDecorView().getHeight());
          WindowManager$LayoutParams attributes = window.getAttributes();
          attributes.width = -2;
          attributes.height = -2;
          attributes.flags = 40;
          attributes.gravity = 51;
          attributes.x = this.e;
          attributes.y = this.f;
          window.setAttributes(attributes);
          EmojiPopupWindow tc = this.c;
          if (tc != null) {
             tc.y(this.g);
          }
          tc = this.d;
          if (tc != null) {
             tc.setText(this.h);
          }
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EmojiPopupWindow.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.setCancelable(true);
       this.setStyle(true, this.i);
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.setCancelable(true);
       uDialog.setCanceledOnTouchOutside(true);
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Context context;
       int theme;
       Configuration uConfigurati;
       d uod1;
       d uod = d.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, EmojiPopupWindow.class, "2");
       if (p1 != patchProxyRe) {
          return p1;
       }
       if (this.k != null) {
          context = p0.getContext();
          theme = this.getTheme();
          if (PatchProxy.isSupport(uod)) {
             uod = PatchProxy.applyTwoRefs(context, Integer.valueOf(theme), null, uod, "2");
             if (uod != patchProxyRe) {
             label_0051 :
                p0 = p0.cloneInContext(uod);
             }
          }
          uConfigurati = new Configuration(context.getResources().getConfiguration());
          uConfigurati.uiMode = 32;
          uod1 = new d(context, theme);
          a.a(uod1, uConfigurati);
          uod = uod1;
          goto label_0051 ;
       }else if(this.l != null){
          context = p0.getContext();
          theme = this.getTheme();
          if (PatchProxy.isSupport(uod)) {
             uod = PatchProxy.applyTwoRefs(context, Integer.valueOf(theme), null, uod, "3");
             if (uod != patchProxyRe) {
             label_0091 :
                p0 = p0.cloneInContext(uod);
             }
          }
          uConfigurati = new Configuration(context.getResources().getConfiguration());
          uConfigurati.uiMode = 16;
          uod1 = new d(context, theme);
          a.a(uod1, uConfigurati);
          uod = uod1;
          goto label_0091 ;
       }
       View view = p0.inflate(R.layout.arg_RES_7f0d03da, null);
       this.b = view;
       this.c = view.findViewById(0x7f0a0cdd);
       this.d = this.b.findViewById(0x7f0a0cdf);
       return this.b;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmojiPopupWindow.class, "4")) {
          return;
       }
       super.onSaveInstanceState(p0);
       this.dismissAllowingStateLoss();
       return;
    }
    public void show(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EmojiPopupWindow.class, "5")) {
          return;
       }
       if (this.getDialog() != null) {
          this.getDialog().show();
       }
       if (this.isAdded() || p0.findFragmentByTag(p1) != null) {
          EmojiPopupWindow tb = this.b;
          if (tb != null && tb.getVisibility()) {
             this.b.setVisibility(0);
          }
          return;
       }else {
          try{
             p0.beginTransaction().u(this).m();
             super.show(p0, p1);
          }catch(java.lang.IllegalArgumentException e3){
             e3.printStackTrace();
          }
          return;
       }
    }
}
