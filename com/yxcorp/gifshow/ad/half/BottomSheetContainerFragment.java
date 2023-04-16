package com.yxcorp.gifshow.ad.half.BottomSheetContainerFragment;
import t29.d;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.yxcorp.gifshow.ad.half.BottomSheetContainerFragment$c;
import com.yxcorp.gifshow.ad.half.BottomSheetContainerFragment$a;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.View;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.ad.half.AdBottomSheetBehavior;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.ad.half.BottomSheetContainerFragment$b;
import android.os.Bundle;
import android.view.Window;
import java.lang.Integer;
import java.lang.Math;
import java.lang.ref.WeakReference;
import com.yxcorp.gifshow.ad.half.AdBottomSheetBehavior$b;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.ad.half.b;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.lang.Number;
import ag6.a;
import nsd.u;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import qrd.l1;
import java.util.HashMap;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;

public final class BottomSheetContainerFragment extends AppCompatDialogFragment implements d	// class@001780
{
    public boolean b;
    public Fragment c;
    public BottomSheetContainerFragment$a d;
    public AdBottomSheetBehavior e;
    public BottomSheetContainerFragment$b f;
    public final AdBottomSheetBehavior$b g;
    public HashMap h;

    public void BottomSheetContainerFragment(){
       super();
       this.g = new BottomSheetContainerFragment$c(this);
    }
    public static final BottomSheetContainerFragment$a Ug(BottomSheetContainerFragment p0){
       p0 = p0.d;
       if (p0 == null) {
          a.S("mContainerConfig");
       }
       return p0;
    }
    public final void Vg(boolean p0){
       BottomSheetContainerFragment te;
       AdBottomSheetBehavior a;
       if (PatchProxy.isSupport(BottomSheetContainerFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BottomSheetContainerFragment.class, "11")) {
          return;
       }
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          FrameLayout uFrameLayout = dialog.findViewById(R.id.design_bottom_sheet);
          if (uFrameLayout != null) {
             if (!p0) {
                te = this.e;
                a = (te != null)? te.a: null;
                if (!a.g(a, Boolean.FALSE)) {
                   this.b = true;
                }
             }
             ViewGroup$LayoutParams layoutParams = uFrameLayout.getLayoutParams();
             BottomSheetContainerFragment td = this.d;
             if (td == null) {
                a.S("mContainerConfig");
             }
             layoutParams.height = td.a();
             te = this.e;
             if (te != null) {
                te.setStateInternal(4);
             }
             uFrameLayout.requestLayout();
          }
       }
       return;
    }
    public final void Wg(BottomSheetContainerFragment$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomSheetContainerFragment.class, "2")) {
          return;
       }
       a.p(p0, "containerConfig");
       this.d = p0;
       return;
    }
    public final void Xg(BottomSheetContainerFragment$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomSheetContainerFragment.class, "1")) {
          return;
       }
       a.p(p0, "content");
       this.f = p0;
       return;
    }
    public void onActivityCreated(Bundle p0){
       Window window;
       BottomSheetContainerFragment td1;
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomSheetContainerFragment.class, "7")) {
          return;
       }
       super.onActivityCreated(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, BottomSheetContainerFragment.class, "8")) {
          BottomSheetContainerFragment td = this.d;
          String str = "mContainerConfig";
          if (td == null) {
             a.S(str);
          }
          this.setCancelable(td.f);
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             window = dialog.getWindow();
             if (window != null) {
                td1 = this.d;
                if (td1 == null) {
                   a.S(str);
                }
                window.setDimAmount(td1.b);
             }
          }
          dialog = this.getDialog();
          if (dialog != null) {
             window = dialog.getWindow();
             if (window != null) {
                window.setWindowAnimations(R.style.arg_RES_7f110330);
             }
          }
          dialog = this.getDialog();
          if (dialog != null) {
             objArray = dialog.findViewById(0x7f0a0a9d);
          }
          if (objArray != null) {
             int i = 0;
             objArray.setBackgroundColor(i);
             ViewGroup$LayoutParams layoutParams = objArray.getLayoutParams();
             BottomSheetContainerFragment td2 = this.d;
             if (td2 == null) {
                a.S(str);
             }
             layoutParams.height = td2.a();
             AdBottomSheetBehavior uAdBottomShe = AdBottomSheetBehavior.g(objArray);
             this.e = uAdBottomShe;
             if (uAdBottomShe != null) {
                td1 = this.d;
                if (td1 == null) {
                   a.S(str);
                }
                BottomSheetContainerFragment$a c = td1.c;
                if (!PatchProxy.isSupport(AdBottomSheetBehavior.class) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(c), uAdBottomShe, AdBottomSheetBehavior.class, "16") && (!PatchProxy.isSupport(AdBottomSheetBehavior.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(c), Boolean.FALSE, uAdBottomShe, AdBottomSheetBehavior.class, "17")))) {
                   if (c == -1) {
                      if (uAdBottomShe.g == null) {
                         uAdBottomShe.g = true;
                      label_00d0 :
                         i = 1;
                      }
                   }else if(uAdBottomShe.g != null || uAdBottomShe.f != c){
                      uAdBottomShe.g = i;
                      uAdBottomShe.f = Math.max(i, c);
                      goto label_00d0 ;
                   }
                   if (i && (PatchProxy.isSupport(AdBottomSheetBehavior.class) && (!PatchProxy.applyVoidOneRefs(Boolean.FALSE, uAdBottomShe, AdBottomSheetBehavior.class, "18") && uAdBottomShe.y != null))) {
                      uAdBottomShe.calculateCollapsedOffset();
                      if (uAdBottomShe.q == 4) {
                         View view = uAdBottomShe.y.get();
                         if (view != null) {
                            view.requestLayout();
                         }
                      }
                   }
                }
             }
          label_00fd :
             td = this.e;
             if (td != null) {
                td.d(this.g);
             }
          }
          td = this.f;
          if (td != null) {
             td.Ib(2);
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomSheetContainerFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       this.setStyle(0, this.getTheme());
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       p0 = PatchProxy.applyOneRefs(p0, this, BottomSheetContainerFragment.class, "4");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       Context context = this.getContext();
       a.m(context);
       return new b(context, this.getTheme());
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int i;
       BottomSheetContainerFragment tf1;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, BottomSheetContainerFragment.class, "5");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       BottomSheetContainerFragment tf = this.f;
       c uoc = null;
       boolean b = false;
       if (tf != null) {
          Integer integer = Integer.valueOf(tf.G6());
          Context uContext = (integer.intValue() > 0)? 1: null;
          if (!uContext) {
             integer = uoc;
          }
          if (integer != null) {
             i = integer.intValue();
          label_003d :
             View view = a.c(LayoutInflater.from(this.getContext()), i, p1, b);
             if (this.d == null) {
                BottomSheetContainerFragment$a uoa = new BottomSheetContainerFragment$a(0, 0, 0, 0, false, false, false, 127, null);
                this.d = this.d;
             }
             if (this.c == null) {
                tf1 = this.f;
                if (tf1 != null) {
                   Fragment uFragment = tf1.R1();
                   if (uFragment != null) {
                      e uoe = this.getChildFragmentManager().beginTransaction();
                      uoe.f(R.id.fragment_container, uFragment);
                      uoe.o();
                      uoc = uFragment;
                   }
                }
                this.c = uoc;
             }
             tf1 = this.f;
             if (tf1 != null) {
                tf1.jb(this);
             }
             a.o(view, "view");
             return view;
          }
       }
       i = 0x7f0d0040;
       goto label_003d ;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, BottomSheetContainerFragment.class, "13")) {
       }else {
          BottomSheetContainerFragment th = this.h;
          if (th != null) {
             th.clear();
          }
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, BottomSheetContainerFragment.class, "9")) {
          return;
       }
       super.onPause();
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             window.setWindowAnimations(0);
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BottomSheetContainerFragment.class, "6")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       BottomSheetContainerFragment td = this.d;
       String str = "mContainerConfig";
       if (td == null) {
          a.S(str);
       }
       if (td.c() > 0) {
          GradientDrawable gradientDraw = new GradientDrawable();
          BottomSheetContainerFragment td1 = this.d;
          if (td1 == null) {
             a.S(str);
          }
          float f = (float)td1.c();
          float[] uofloatArray = new float[]{f,f,f,f,0,0,0,0};
          gradientDraw.setCornerRadii(uofloatArray);
          gradientDraw.setColor(-1);
          p0 = p0.findViewById(R.id.rootView);
          a.o(p0, "view.findViewById<View>\(R.id.rootView\)");
          p0.setBackground(gradientDraw);
       }else {
          p0.findViewById(R.id.rootView).setBackgroundColor(-1);
       }
       return;
    }
    public void y4(){
       if (PatchProxy.applyVoid(null, this, BottomSheetContainerFragment.class, "10")) {
          return;
       }
       BottomSheetContainerFragment td = this.d;
       String str = "mContainerConfig";
       if (td == null) {
          a.S(str);
       }
       if (td.b()) {
          return;
       }else {
          td = this.d;
          if (td == null) {
             a.S(str);
          }
          td.e = true;
          this.Vg(false);
          return;
       }
    }
}
