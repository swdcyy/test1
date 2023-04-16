package com.kwai.component.photo.reduce.PhotoReduceReasonFragment;
import ml8.d;
import im8.g;
import androidx.fragment.app.KwaiDialogFragment;
import lnc.ea;
import java.lang.Class;
import yf5.k1;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.robust.PatchProxyResult;
import yf5.s1;
import java.util.Map;
import java.util.HashMap;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.kwai.component.photo.reduce.PhotoReduceReasonFragment$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.entity.QPhoto;
import android.os.Parcelable;
import android.graphics.Rect;
import com.kwai.component.photo.reduce.model.ReduceMode;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import yf5.l1;
import android.view.View$OnLayoutChangeListener;
import com.kwai.component.photo.reduce.PhotoReduceReasonFragment$a;
import android.view.View$OnTouchListener;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.photo.reduce.m;
import com.kwai.component.photo.reduce.e;
import java.lang.Number;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import com.kwai.component.photo.reduce.PhotoReduceReasonFragment$c;
import android.animation.Animator$AnimatorListener;
import ekd.i;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Objects;
import uh5.e;
import yf5.e2;
import java.lang.Boolean;
import androidx.fragment.app.c;

public class PhotoReduceReasonFragment extends KwaiDialogFragment implements d, g	// class@000ad7
{
    public boolean A;
    public View$OnClickListener B;
    public RecyclerView C;
    public int D;
    public QPhoto E;
    public int F;
    public boolean G;
    public View H;
    public View I;
    public View J;
    public View K;
    public View L;
    public int M;
    public final int N;
    public final int O;
    public final int P;
    public FrameLayout p;
    public View q;
    public Rect r;
    public Rect s;
    public PresenterV2 t;
    public View$OnClickListener u;
    public float v;
    public float w;
    public boolean x;
    public boolean y;
    public boolean z;
    public static final int Q;

    static {
       ea.b().c(PhotoReduceReasonFragment.class);
    }
    public void PhotoReduceReasonFragment(){
       super();
       this.z = true;
       this.B = new k1(this);
       this.N = n.c(a.b(), 15.00f);
       this.O = n.c(a.b(), 10.00f);
       this.P = n.A(a.b());
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, PhotoReduceReasonFragment.class, "7")) {
          return;
       }
       this.th();
       return;
    }
    public void dismissAllowingStateLoss(){
       if (PatchProxy.applyVoid(null, this, PhotoReduceReasonFragment.class, "8")) {
          return;
       }
       this.th();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoReduceReasonFragment.class, "1")) {
          return;
       }
       this.L = m1.f(p0, 0x7f0a3f10);
       this.C = m1.f(p0, 0x7f0a34da);
       this.I = m1.f(p0, 0x7f0a023c);
       this.J = m1.f(p0, 0x7f0a0b73);
       this.H = m1.f(p0, 0x7f0a0240);
       this.K = m1.f(p0, 0x7f0a3f22);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoReduceReasonFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new s1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, PhotoReduceReasonFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(PhotoReduceReasonFragment.class, new s1());
       }else {
          obj.put(PhotoReduceReasonFragment.class, null);
       }
       return obj;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoReduceReasonFragment.class, "6")) {
          return;
       }
       this.M = n.j(this.getActivity());
       Dialog dialog = this.getDialog();
       super.onActivityCreated(p0);
       if (this.getShowsDialog() && (dialog != null && dialog.getWindow() != null)) {
          Window window = dialog.getWindow();
          window.setWindowAnimations(R.style.arg_RES_7f1103a5);
          window.setLayout(-1, this.getActivity().getWindow().getDecorView().getHeight());
          this.p.getViewTreeObserver().addOnGlobalLayoutListener(new PhotoReduceReasonFragment$b(this));
       }
    label_0056 :
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoReduceReasonFragment.class, "4")) {
          return;
       }
       super.onCreate(p0);
       if (this.getArguments() != null) {
          this.E = SerializableHook.getSerializable(this.getArguments(), "photo");
          this.D = this.getArguments().getInt("source", 0);
          this.F = this.getArguments().getInt("position");
          this.r = this.getArguments().getParcelable("anchor_location");
          this.y = this.getArguments().getBoolean("is_long_click");
          this.s = this.getArguments().getParcelable("source_location");
          this.G = this.getArguments().getBoolean("source_channel");
          ReduceMode parcelable = this.getArguments().getParcelable("reduce_mode");
          if (parcelable != null) {
             this.z = parcelable.mCanShowLongTip;
             this.A = parcelable.mIsActualMode;
          }
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoReduceReasonFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.setCancelable(true);
       this.setStyle(true, R.style.arg_RES_7f11035b);
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.setCancelable(true);
       uDialog.setCanceledOnTouchOutside(true);
       return uDialog;
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PhotoReduceReasonFragment.class, "5");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       FrameLayout uFrameLayout = new FrameLayout(this.getContext());
       this.p = uFrameLayout;
       View view = PatchProxy.applyTwoRefs(p0, uFrameLayout, this, PhotoReduceReasonFragment.class, "9");
       if (view != PatchProxyResult.class) {
       }else {
          view = a.g(p0, R.layout.arg_RES_7f0d1132, uFrameLayout, 0);
          this.doBindView(view);
          view.addOnLayoutChangeListener(new l1(this));
       }
       this.q = view;
       this.p.addView(view);
       this.p.setOnTouchListener(new PhotoReduceReasonFragment$a(this));
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(null, this, PhotoReduceReasonFragment.class, "10");
       if (presenterV2 != PatchProxyResult.class) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new m(0));
          presenterV2.U7(new e());
          PatchProxy.onMethodExit(PhotoReduceReasonFragment.class, "10");
       }
       this.t = presenterV2;
       presenterV2.f(this.q);
       Object[] objArray = new Object[]{this};
       this.t.i(objArray);
       return this.p;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, PhotoReduceReasonFragment.class, "11")) {
          return;
       }
       super.onDestroyView();
       this.t.destroy();
       return;
    }
    public int sh(){
       Object obj = PatchProxy.apply(null, this, PhotoReduceReasonFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (this.C.getChildCount() <= 0) {
          return i;
       }
       return (this.C.getChildAt(i).getHeight() + this.C.getLayoutParams().topMargin);
    }
    public final void th(){
       if (PatchProxy.applyVoid(null, this, PhotoReduceReasonFragment.class, "18")) {
          return;
       }
       if (this.x != null) {
          return;
       }
       this.x = true;
       PhotoReduceReasonFragment tq = this.q;
       tq.setPivotX(this.v);
       tq.setPivotY(this.w);
       float[] uofloatArray = new float[true];
       uofloatArray[0] = 0;
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(tq, "alpha", uofloatArray);
       objectAnimat.setInterpolator(new LinearInterpolator());
       float[] uofloatArray1 = new float[true];
       uofloatArray1[0] = 0x3f000000;
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(tq, "scaleX", uofloatArray1);
       objectAnimat1.setInterpolator(new AnticipateOvershootInterpolator(0x3f4ccccd));
       float[] uofloatArray2 = new float[true];
       uofloatArray2[0] = 0x3f000000;
       ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(tq, "scaleY", uofloatArray2);
       objectAnimat2.setInterpolator(new AnticipateOvershootInterpolator(0x3f4ccccd));
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.setDuration(200);
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.addListener(new PhotoReduceReasonFragment$c(this));
       uAnimatorSet.start();
       return;
    }
    public void uh(){
       int i2;
       PhotoReduceReasonFragment ts;
       PhotoReduceReasonFragment tM;
       View view;
       PhotoReduceReasonFragment photoReduceR1;
       int i4;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PhotoReduceReasonFragment.class, "13")) {
          return;
       }
       float f = 0;
       int i = 4;
       int i1 = 0x7f0a3f6a;
       PhotoReduceReasonFragment photoReduceR = 1;
       float f1 = 0;
       if (this.y != null) {
          if (!PatchProxy.applyVoid(objArray, this, PhotoReduceReasonFragment.class, "15")) {
             i2 = (this.J.getHeight() + this.H.getHeight()) + this.I.getHeight();
             ts = this.s;
             if (ts == null) {
                ts = new Rect();
             }
             tM = this.M;
             if (i.e(this.getActivity())) {
                tM = tM - this.P;
             }
             Objects.requireNonNull(this.getActivity());
             view = this.getActivity().findViewById(i1);
             i1 = (view != null)? view.getHeight(): 0;
             Rect top = ts.top;
             PhotoReduceReasonFragment tP = this.P;
             int i3 = i1 + tP;
             if (top < i3) {
                i3 = (i3 + ts.bottom) / 2;
             }else if(top >= i3){
                Rect bottom = ts.bottom;
                if (bottom <= tM) {
                   i3 = (top + bottom) / 2;
                }
             }
             i3 = ((top + tM) + tP) / 2;
             photoReduceR1 = (((((tP + i2) + this.N) + i1) + this.sh()) > i3)? 1: null;
             if (this.H.getVisibility() == i || this.I.getVisibility() == i) {
                if (this.I.getVisibility() != i) {
                   photoReduceR = null;
                }
                photoReduceR1 = photoReduceR;
             }
             if (photoReduceR1 != null) {
                photoReduceR = this.P;
             }else {
                i3 = i3 - i2;
                photoReduceR = this.P;
             }
             i3 = i3 - photoReduceR;
             if (e.e()) {
                i3 = i3 - e.c();
             }
             this.q.setTranslationY((float)i3);
             photoReduceR = (photoReduceR1 != null)? this.H: this.I;
             PhotoReduceReasonFragment tI = (photoReduceR1 != null)? this.I: this.H;
             photoReduceR.setX((float)(((ts.left + ts.right) / 2) - (photoReduceR.getWidth() / 2)));
             tI.setVisibility(i);
             this.v = photoReduceR.getX() + (float)(photoReduceR.getWidth() / 2);
             if (photoReduceR1 == null) {
                f = (float)i2;
             }
             this.w = f;
          }
       }else if(PatchProxy.applyVoid(objArray, this, PhotoReduceReasonFragment.class, "14")){
          i2 = (this.J.getHeight() + this.H.getHeight()) + this.I.getHeight();
          ts = this.r;
          if (ts == null) {
             Rect rect = new Rect();
          }
          PhotoReduceReasonFragment photoReduceR2 = ts;
          ts = this.M;
          if (i.e(this.getActivity())) {
             i4 = ts - this.P;
          }
          Objects.requireNonNull(this.getActivity());
          view = this.getActivity().findViewById(i1);
          i1 = (view != null)? view.getHeight(): 0;
          photoReduceR1 = (((((this.P + i2) + this.N) + i1) + this.sh()) > photoReduceR2.top)? 1: null;
          if (this.H.getVisibility() == i || this.I.getVisibility() == i) {
             photoReduceR1 = (this.I.getVisibility() == i)? 1: null;
          }
       label_0183 :
          int i5 = (photoReduceR1 != null)? (photoReduceR2.bottom - this.P) + n.c(a.b(), 0x3f800000): (photoReduceR2.top - i2) - this.P;
          tM = this.N;
          if (i5 < tM) {
             i5 = tM;
          }
          if (((this.q.getHeight() + i5) + this.N) > i4) {
             i5 = (i4 - this.q.getHeight()) - this.N;
          }
          boolean b = ((photoReduceR2.right * 2) < n.k(this.getActivity()))? true: false;
          this.q.setTranslationY((float)(i5 - this.K.getMeasuredHeight()));
          ts = (photoReduceR1 != null)? this.H: this.I;
          photoReduceR = (photoReduceR1 != null)? this.I: this.H;
          e2.a(this.J, ts, photoReduceR, this.A, b, photoReduceR2, this.O);
          if (!PatchProxy.isSupport(PhotoReduceReasonFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(photoReduceR1), this, PhotoReduceReasonFragment.class, "16")) {
             if (this.z == null) {
                this.L.setVisibility(i);
                this.K.setVisibility(i);
             }else if(photoReduceR1 != null){
                this.L.setVisibility(f1);
                this.K.setVisibility(i);
             }else {
                this.L.setVisibility(i);
                this.K.setVisibility(f1);
             }
          }
          this.v = ts.getX() + (float)(ts.getWidth() / 2);
          if (photoReduceR1 == null) {
             f = (float)i2;
          }
          this.w = f;
       }
       return;
    }
    public void vh(){
       if (PatchProxy.applyVoid(null, this, PhotoReduceReasonFragment.class, "20")) {
          return;
       }
       try{
          if (this.getFragmentManager() != null) {
             super.dismissAllowingStateLoss();
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
