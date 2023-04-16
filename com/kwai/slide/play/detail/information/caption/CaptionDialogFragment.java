package com.kwai.slide.play.detail.information.caption.CaptionDialogFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseDialogFragment;
import com.kwai.slide.play.detail.information.caption.CaptionDialogFragment$c;
import nsd.u;
import com.kwai.slide.play.detail.information.caption.CaptionDialogFragment$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import com.kwai.slide.play.detail.information.caption.CaptionDialogFragment$d;
import android.content.DialogInterface$OnKeyListener;
import ag6.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import com.kwai.slide.play.detail.information.caption.CaptionDialogFragment$b;
import androidx.fragment.app.Fragment;
import java.lang.CharSequence;
import java.util.Objects;
import zq7.b;
import android.os.Build$VERSION;
import android.view.WindowManager$LayoutParams;
import zq7.a;

public final class CaptionDialogFragment extends BaseDialogFragment	// class@0017c3
{
    public CaptionDialogFragment$b p;
    public CharSequence q;
    public CharSequence r;
    public PresenterV2 s;
    public final CaptionDialogFragment$a t;
    public HashMap u;
    public static final CaptionDialogFragment$c v;

    static {
       CaptionDialogFragment.v = new CaptionDialogFragment$c(null);
    }
    public void CaptionDialogFragment(CaptionDialogFragment$a p0){
       a.p(p0, "captionDialogCallback");
       super();
       this.t = p0;
    }
    public boolean fh(){
       return false;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CaptionDialogFragment.class, "3")) {
          return;
       }
       super.onActivityCreated(p0);
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             window.setWindowAnimations(0);
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CaptionDialogFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.setStyle(1, R.style.arg_RES_7f11035d);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, CaptionDialogFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          dialog.setOnKeyListener(CaptionDialogFragment$d.b);
       }
       return a.c(p0, 0x7f0d078d, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, CaptionDialogFragment.class, "9")) {
          return;
       }
       super.onDestroyView();
       CaptionDialogFragment ts = this.s;
       if (ts != null) {
          ts.destroy();
       }
       if (!PatchProxy.applyVoid(null, this, CaptionDialogFragment.class, "11")) {
          ts = this.u;
          if (ts != null) {
             ts.clear();
          }
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, CaptionDialogFragment.class, "7")) {
          return;
       }
       super.onStart();
       this.th();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "4";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CaptionDialogFragment.class, str)) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       CaptionDialogFragment$b uob = CaptionDialogFragment$b.class;
       String str1 = "6";
       CaptionDialogFragment uCaptionDial = PatchProxy.apply(null, this, CaptionDialogFragment.class, str1);
       if (uCaptionDial != patchProxyRe) {
       }else {
          Bundle arguments = this.getArguments();
          a.m(arguments);
          CharSequence charSequence = arguments.getCharSequence("username", "");
          a.o(charSequence, "arguments!!.getCharSequence\(USERNAME, \"\"\)");
          this.q = charSequence;
          arguments = this.getArguments();
          a.m(arguments);
          charSequence = arguments.getCharSequence("caption", "");
          a.o(charSequence, "arguments!!.getCharSequence\(CAPTION, \"\"\)");
          this.r = charSequence;
          CaptionDialogFragment$b uob1 = new CaptionDialogFragment$b();
          this.p = uob1;
          CaptionDialogFragment tq = this.q;
          if (tq == null) {
             a.S("mUsername");
          }
          if (!PatchProxy.applyVoidOneRefs(tq, uob1, uob, str)) {
             a.p(tq, "<set-?>");
             uob1.c = tq;
          }
          uCaptionDial = this.p;
          if (uCaptionDial == null) {
             a.S("mCallerContext");
          }
          CaptionDialogFragment tr = this.r;
          if (tr == null) {
             a.S("mCaption");
          }
          Objects.requireNonNull(uCaptionDial);
          if (!PatchProxy.applyVoidOneRefs(tr, uCaptionDial, uob, str1)) {
             a.p(tr, "<set-?>");
             uCaptionDial.d = tr;
          }
          uCaptionDial = this.p;
          if (uCaptionDial == null) {
             a.S("mCallerContext");
          }
          Objects.requireNonNull(uCaptionDial);
          if (!PatchProxy.applyVoidOneRefs(this, uCaptionDial, uob, "2")) {
             a.p(this, "<set-?>");
             uCaptionDial.b = this;
          }
          uCaptionDial = this.p;
          if (uCaptionDial == null) {
             a.S("mCallerContext");
          }
       }
       this.p = uCaptionDial;
       String str2 = "5";
       PresenterV2 presenterV2 = PatchProxy.applyOneRefsWithListener(p0, this, CaptionDialogFragment.class, str2);
       if (presenterV2 != patchProxyRe) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new b(this.getDialog(), this.t));
          presenterV2.f(p0);
          PatchProxy.onMethodExit(CaptionDialogFragment.class, str2);
       }
       this.s = presenterV2;
       a.m(presenterV2);
       Object[] objArray = new Object[1];
       uCaptionDial = this.p;
       if (uCaptionDial == null) {
          a.S("mCallerContext");
       }
       objArray[0] = uCaptionDial;
       presenterV2.i(objArray);
       return;
    }
    public final void th(){
       if (PatchProxy.applyVoid(null, this, CaptionDialogFragment.class, "8")) {
          return;
       }
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          boolean b = true;
          dialog.setCancelable(b);
          dialog.setCanceledOnTouchOutside(b);
          if (Build$VERSION.SDK_INT >= 28) {
             a.o(dialog, "it");
             Window window = dialog.getWindow();
             if (window != null) {
                WindowManager$LayoutParams attributes = window.getAttributes();
                if (attributes != null) {
                   attributes.layoutInDisplayCutoutMode = b;
                }
             }
          }
          a.o(dialog, "it");
          Window window1 = dialog.getWindow();
          if (window1 != null) {
             a.e(window1, 0, 0);
          }
          window1 = dialog.getWindow();
          if (window1 != null) {
             window1.setDimAmount(0);
          }
          Window window2 = dialog.getWindow();
          if (window2 != null) {
             window2.setLayout(-1, -1);
          }
       }
       return;
    }
}
