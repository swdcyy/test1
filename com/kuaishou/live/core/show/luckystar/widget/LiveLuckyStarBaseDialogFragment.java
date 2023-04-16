package com.kuaishou.live.core.show.luckystar.widget.LiveLuckyStarBaseDialogFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseDialogFragment;
import android.content.DialogInterface$OnDismissListener;
import android.os.Bundle;
import android.app.Dialog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.DialogFragment;
import kc2.b;
import android.content.DialogInterface$OnShowListener;
import androidx.fragment.app.KwaiDialogFragment;
import kc2.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import d61.h;
import java.lang.Integer;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.content.res.Configuration;
import java.lang.Math;
import u0.d;
import pd6.a;
import i2b.a;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import lnc.a1;
import com.yxcorp.utility.n;
import com.kuaishou.live.core.show.luckystar.widget.LiveLuckyStarBaseDialogFragment$a;
import android.view.View$OnTouchListener;

public abstract class LiveLuckyStarBaseDialogFragment extends BaseDialogFragment	// class@000d0f
{
    public DialogInterface$OnDismissListener p;
    public DialogInterface$OnShowListener q;
    public static final int r;

    public void LiveLuckyStarBaseDialogFragment(){
       super();
    }
    public abstract int getLayoutResId();
    public void k0(DialogInterface$OnDismissListener p0){
       this.p = p0;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLuckyStarBaseDialogFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.setCancelable(true);
       this.setStyle(true, R.style.arg_RES_7f110359);
       super.ph(new b(this));
       super.k0(new a(this));
       return super.onCreateDialog(p0);
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View view;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveLuckyStarBaseDialogFragment.class, "1");
       if (p2 != patchProxyRe) {
          return p2;
       }
       int layoutResId = this.getLayoutResId();
       int theme = this.getTheme();
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          view = PatchProxy.applyFourRefs(p0, Integer.valueOf(layoutResId), p1, Integer.valueOf(theme), null, h.class, "10");
          if (view != patchProxyRe) {
          label_00d1 :
             return view;
          }
       }
       Context context = p0.getContext();
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyTwoRefs(context, Integer.valueOf(theme), null, oh, "9");
          if (obj != patchProxyRe) {
             context = obj;
          }else {
          label_0059 :
             DisplayMetrics uDisplayMetr = c.c(context.getResources());
             if (Math.min(context.getResources().getConfiguration().screenHeightDp, context.getResources().getConfiguration().screenWidthDp) < 320) {
                float f = 0x43cf0000 / (float)Math.min(context.getResources().getConfiguration().screenHeightDp, context.getResources().getConfiguration().screenWidthDp);
                Configuration uConfigurati = new Configuration(context.getResources().getConfiguration());
                int i = (int)((float)uConfigurati.screenWidthDp * f);
                uConfigurati.screenWidthDp = i;
                uConfigurati.screenHeightDp = (int)((float)i * f);
                uConfigurati.densityDpi = (int)((uDisplayMetr.density / f) * 160.00f);
                d uod = new d(context, theme);
                a.a(uod, uConfigurati);
                context = uod;
             }
          }
       }else {
          goto label_0059 ;
       }
       view = a.g(p0.cloneInContext(context), layoutResId, p1, false);
       goto label_00d1 ;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, LiveLuckyStarBaseDialogFragment.class, "3")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       if (dialog == null) {
          return;
       }
       Window window = dialog.getWindow();
       if (window == null) {
          return;
       }
       if (a1.i(this.getActivity())) {
          n.C(this.getActivity());
       }
       if (this.uh()) {
          window.getDecorView().setOnTouchListener(new LiveLuckyStarBaseDialogFragment$a(this));
       }
       window.setDimAmount(0.20f);
       int i = (this.getActivity() == null)? -1: this.getActivity().getRequestedOrientation();
       FragmentActivity uFragmentAct = (!i || i == 6)? 1: null;
       if (uFragmentAct) {
          window.setLayout(-1, -1);
       }else {
          window.setLayout(-1, (n.j(this.getActivity()) - n.A(this.getContext())));
       }
       return;
    }
    public void ph(DialogInterface$OnShowListener p0){
       this.q = p0;
    }
    public abstract View th(View p0);
    public boolean uh(){
       return true;
    }
}
