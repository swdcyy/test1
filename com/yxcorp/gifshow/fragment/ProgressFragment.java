package com.yxcorp.gifshow.fragment.ProgressFragment;
import android.view.View$OnClickListener;
import androidx.fragment.app.KwaiDialogFragment;
import lnc.a1;
import lnc.ea;
import java.lang.Class;
import androidx.fragment.app.DialogFragment;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import androidx.fragment.app.Fragment;
import android.view.ViewGroup$LayoutParams;
import android.content.res.Resources;
import cw9.c;
import com.kwai.robust.PatchProxyResult;
import android.widget.ImageView;
import com.kwai.library.widget.refresh.path.LoadingStyle;
import java.lang.Boolean;
import com.yxcorp.gifshow.fragment.ProgressFragment$a;
import android.widget.TextView;
import java.lang.CharSequence;
import gka.v;
import java.lang.Runnable;
import ekd.k1;
import android.os.Build$VERSION;
import android.app.Dialog;
import android.view.Window;
import android.os.Handler;
import java.lang.Thread;
import android.os.Looper;
import com.yxcorp.gifshow.widget.SectorProgressView;
import gka.w;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnCancelListener;
import java.lang.ref.WeakReference;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import com.kwai.library.widget.refresh.path.PathLoadingView;
import android.text.TextUtils;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.Button;
import gka.x;
import android.view.ViewTreeObserver;
import gka.z;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import crd.b;
import lnc.b9;
import java.util.concurrent.TimeUnit;
import brd.t;
import gka.t;
import erd.r;
import gka.u;
import gka.s;
import erd.g;
import io.reactivex.internal.functions.Functions;
import android.view.WindowManager$LayoutParams;
import java.lang.Exception;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.Float;
import java.lang.StringBuilder;
import gka.y;

public class ProgressFragment extends KwaiDialogFragment implements View$OnClickListener	// class@001271
{
    public int A;
    public int B;
    public int C;
    public int D;
    public Dialog E;
    public DialogInterface$OnDismissListener F;
    public boolean G;
    public View$OnClickListener H;
    public View$OnClickListener I;
    public boolean J;
    public TextView K;
    public CharSequence L;
    public int M;
    public b N;
    public ProgressFragment$a O;
    public long P;
    public boolean Q;
    public LoadingStyle R;
    public float S;
    public float T;
    public PathLoadingView p;
    public SectorProgressView q;
    public TextView r;
    public Button s;
    public ImageView t;
    public WeakReference u;
    public CharSequence v;
    public int w;
    public CharSequence x;
    public int y;
    public int z;
    public static final int U;
    public static final int U0;
    public static final int V;
    public static final int W;
    public static final int X;
    public static final int Y;
    public static final int Z;

    static {
       ProgressFragment.U = a1.e(8.00f);
       ProgressFragment.V = a1.e(8.00f);
       ProgressFragment.W = a1.e(100.00f);
       ProgressFragment.X = a1.e(8.00f);
       ProgressFragment.Y = a1.e(10.00f);
       ProgressFragment.Z = a1.e(20.00f);
       ProgressFragment.U0 = a1.e(4.00f);
       ea.b().c(ProgressFragment.class);
    }
    public void ProgressFragment(){
       super();
       this.P = -1;
       this.setCancelable(true);
    }
    public void Ah(int p0,int p1){
       if (PatchProxy.isSupport(ProgressFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ProgressFragment.class, "33")) {
          return;
       }
       View view = this.getView();
       if (view == null) {
          return;
       }
       view.setLayoutParams(new ViewGroup$LayoutParams(c.b(this.getResources(), p0), c.b(this.getResources(), p1)));
       return;
    }
    public ProgressFragment Bh(View$OnClickListener p0){
       ProgressFragment obj = PatchProxy.applyOneRefs(p0, this, ProgressFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.I = p0;
       obj = this.t;
       if (obj != null) {
          obj.setOnClickListener(p0);
       }
       return this;
    }
    public ProgressFragment Ch(int p0){
       this.z = p0;
       return this;
    }
    public void Dh(LoadingStyle p0){
       this.R = p0;
    }
    public ProgressFragment Eh(int p0,int p1){
       this.A = p0;
       this.B = p1;
       return this;
    }
    public ProgressFragment Fh(int p0,int p1,boolean p2){
       if (PatchProxy.isSupport(ProgressFragment.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, ProgressFragment.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.Eh(p0, p1);
       if (p2) {
          this.Oh(p0, p1);
       }
       return this;
    }
    public void Gh(boolean p0){
       this.Q = p0;
    }
    public void Hh(long p0,ProgressFragment$a p1){
       this.P = p0;
       this.O = p1;
    }
    public ProgressFragment Ih(int p0){
       ProgressFragment obj;
       if (PatchProxy.isSupport(ProgressFragment.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ProgressFragment.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v = null;
       this.w = p0;
       obj = this.r;
       if (obj != null) {
          obj.setText(p0);
       }
       return this;
    }
    public ProgressFragment Jh(CharSequence p0){
       ProgressFragment obj = PatchProxy.applyOneRefs(p0, this, ProgressFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v = p0;
       this.w = 0;
       obj = this.r;
       if (obj != null) {
          obj.setText(p0);
       }
       return this;
    }
    public void Kh(boolean p0){
       this.J = p0;
    }
    public void Lh(){
       if (PatchProxy.applyVoid(null, this, ProgressFragment.class, "36")) {
          return;
       }
       ProgressFragment tt = this.t;
       if (tt != null && tt.getVisibility()) {
          k1.o(new v(this));
       }
       return;
    }
    public final void Mh(boolean p0){
       if (PatchProxy.isSupport(ProgressFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ProgressFragment.class, "22")) {
          return;
       }
       if (Build$VERSION.SDK_INT < 31 && !("S").equals(Build$VERSION.CODENAME)) {
          return;
       }
       Dialog dialog = this.getDialog();
       if (dialog == null || (dialog.getWindow() != null && dialog.getWindow().getDecorView() != null)) {
          View decorView = dialog.getWindow().getDecorView();
          int i = (p0)? 0: 8;
          decorView.setVisibility(i);
       }
    label_0050 :
       return;
    }
    public void Nh(int p0){
       if (PatchProxy.isSupport(ProgressFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ProgressFragment.class, "23")) {
          return;
       }
       this.Oh(p0, this.B);
       return;
    }
    public void Oh(int p0,int p1){
       if (PatchProxy.isSupport(ProgressFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ProgressFragment.class, "24")) {
          return;
       }
       ProgressFragment tq = this.q;
       if (tq != null && (!tq.getVisibility() && (PatchProxy.isSupport(ProgressFragment.class) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ProgressFragment.class, "25") && p1 > 0)))) {
          tq = this.q;
          if (tq != null) {
             Handler handler = tq.getHandler();
             if (handler != null) {
                float f = ((float)p0 * 0x3f800000) / (float)p1;
                String str = this.th(f);
                if (!Thread.currentThread().getId() - handler.getLooper().getThread().getId()) {
                   this.q.setPercent((f * 100.00f));
                   this.r.setText(str);
                }else {
                   this.q.post(new w(this, f, str));
                }
             }
          }
       }
       return;
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, ProgressFragment.class, "27")) {
          return;
       }
       super.dismissAllowingStateLoss();
       this.sh();
       return;
    }
    public void k0(DialogInterface$OnDismissListener p0){
       this.F = p0;
    }
    public void oh(DialogInterface$OnCancelListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProgressFragment.class, "29")) {
          return;
       }
       WeakReference weakReferenc = (p0 == null)? null: new WeakReference(p0);
       this.u = weakReferenc;
       return;
    }
    public void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProgressFragment.class, "30")) {
          return;
       }
       super.onCancel(p0);
       ProgressFragment tu = this.u;
       DialogInterface$OnCancelListener onCancelList = (tu == null)? null: tu.get();
       if (onCancelList != null) {
          onCancelList.onCancel(p0);
       }
       return;
    }
    public void onClick(View p0){
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProgressFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.setStyle(1, R.style.arg_RES_7f11035f);
       Dialog uDialog = super.onCreateDialog(p0);
       this.E = uDialog;
       uDialog.setCanceledOnTouchOutside(this.G);
       return this.E;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       ProgressFragment tt;
       TextView textView;
       ProgressFragment tS;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ProgressFragment.class, "14");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       boolean b = false;
       View view = a.g(p0, R.layout.arg_RES_7f0d1281, p1, b);
       if (!PatchProxy.applyVoidOneRefs(view, this, ProgressFragment.class, "15")) {
          String str = 8;
          if (!PatchProxy.applyVoidOneRefs(view, this, ProgressFragment.class, "20")) {
             this.p = view.findViewById(0x7f0a32db);
             this.q = view.findViewById(0x7f0a37ff);
             tt = this.R;
             if (tt != null) {
                this.p.setLoadingStyle(tt);
             }
             if (this.B > null) {
                this.q.setVisibility(b);
                this.p.setVisibility(str);
                this.getDialog().setCanceledOnTouchOutside(this.isCancelable());
             }else {
                this.q.setVisibility(str);
                this.p.setVisibility(b);
                if (!PatchProxy.applyVoid(null, this, ProgressFragment.class, "37")) {
                   tt = this.p;
                   if (tt != null) {
                      tt.k();
                   }
                }
             }
          }
       label_008a :
          String str1 = 1;
          int i = 0;
          if (!PatchProxy.applyVoidOneRefs(view, this, ProgressFragment.class, "19")) {
             textView = view.findViewById(R.id.label);
             this.r = textView;
             tS = this.T;
             if (tS - i) {
                textView.setTextSize(str1, tS);
             }
             tt = this.w;
             if (tt == null) {
                this.r.setText(this.v);
             }else {
                this.r.setText(tt);
             }
             if (TextUtils.isEmpty(this.v) && this.w == null) {
                this.r.setVisibility(str);
             }
          }
       label_00cd :
          if (!PatchProxy.applyVoidOneRefs(view, this, ProgressFragment.class, "18")) {
             textView = view.findViewById(R.id.description);
             this.K = textView;
             tS = this.S;
             if (tS - i) {
                textView.setTextSize(str1, tS);
             }
             this.M = this.r.getLayoutParams().topMargin;
             if (!TextUtils.isEmpty(this.L)) {
                this.yh(this.L);
             }
          }
          if (!PatchProxy.applyVoidOneRefs(view, this, ProgressFragment.class, "17")) {
             Button uButton = view.findViewById(R.id.button);
             this.s = uButton;
             if (uButton != null) {
                uButton.setOnClickListener(this.H);
                if (!TextUtils.isEmpty(this.x) || this.y != null) {
                   this.s.setVisibility(b);
                   tt = this.y;
                   if (tt == null) {
                      this.s.setText(this.x);
                   }else {
                      this.s.setText(tt);
                   }
                }else {
                   this.s.setVisibility(str);
                }
             }
             tt = this.s;
             int i1 = 0x7f070268;
             if (tt != null && !tt.getVisibility()) {
                view.setMinimumWidth(c.b(this.getResources(), i1));
                view.setMinimumHeight(c.b(this.getResources(), R.dimen.arg_RES_7f07027b));
             }else {
                view.setMinimumWidth(c.b(this.getResources(), i1));
                view.setMinimumHeight(c.b(this.getResources(), i1));
             }
          }
          if (!PatchProxy.applyVoidOneRefs(view, this, ProgressFragment.class, "16")) {
             ImageView imageView = view.findViewById(R.id.img_close);
             this.t = imageView;
             if (imageView != null) {
                imageView.setOnClickListener(this.I);
                view.post(new x(this, view));
                if (this.J != null || this.z > null) {
                   view.setMinimumHeight(ProgressFragment.W);
                   view.setPadding(ProgressFragment.Y, ProgressFragment.X, ProgressFragment.Y, ProgressFragment.Z);
                   view.requestLayout();
                   this.t.setImageResource(this.z);
                   tt = this.t;
                   if (this.J == null) {
                      b = 4;
                   }
                   tt.setVisibility(b);
                }
             }
          }
          if (!PatchProxy.applyVoidOneRefs(view, this, ProgressFragment.class, "40") && this.Q != null) {
             view.getViewTreeObserver().addOnGlobalLayoutListener(new z(this, view));
          }
       }
    label_01f5 :
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ProgressFragment.class, "12")) {
          return;
       }
       super.onDestroy();
       b9.a(this.N);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, ProgressFragment.class, "28")) {
          return;
       }
       super.onDestroyView();
       if (!PatchProxy.applyVoid(null, this, ProgressFragment.class, "38")) {
          ProgressFragment tp = this.p;
          if (tp != null) {
             tp.a();
          }
       }
       this.p = null;
       this.q = null;
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProgressFragment.class, "13")) {
          return;
       }
       super.onDismiss(p0);
       ProgressFragment tF = this.F;
       if (tF != null) {
          tF.onDismiss(p0);
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, ProgressFragment.class, "11")) {
          return;
       }
       this.Mh(false);
       super.onPause();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, ProgressFragment.class, "10")) {
          return;
       }
       super.onResume();
       boolean b = true;
       this.Mh(b);
       View view = this.getView();
       if (!PatchProxy.applyVoidOneRefs(view, this, ProgressFragment.class, "21") && view != null) {
          ProgressFragment progressFrag = (this.C > view.getMinimumWidth())? 1: null;
          if (this.D <= view.getMinimumHeight()) {
             b = false;
          }
          if (progressFrag || b) {
             ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
             if (layoutParams != null) {
                if (progressFrag) {
                   view.setMinimumWidth(this.C);
                   layoutParams.width = this.C;
                }
                if (b) {
                   view.setMinimumHeight(this.D);
                   layoutParams.height = this.D;
                }
                view.setLayoutParams(layoutParams);
             }
          }
       }
    label_0060 :
       b9.a(this.N);
       ProgressFragment tP = this.P;
       if (tP - null > 0) {
          this.N = t.timer(tP, TimeUnit.MILLISECONDS).filter(new t(this)).filter(new u(this)).subscribe(new s(this), Functions.d());
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, ProgressFragment.class, "9")) {
          return;
       }
       try{
          super.onStart();
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             Window window = dialog.getWindow();
             if (window != null) {
                WindowManager$LayoutParams attributes = window.getAttributes();
                attributes.dimAmount = 0;
                window.setAttributes(attributes);
             }
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          this.dismiss();
          ExceptionHandler.handleCaughtException(e0);
       }
       return;
    }
    public void sh(){
       if (PatchProxy.applyVoid(null, this, ProgressFragment.class, "39")) {
          return;
       }
       b9.a(this.N);
       this.O = null;
       this.P = -1;
       return;
    }
    public final String th(float p0){
       ProgressFragment obj;
       String str;
       if (PatchProxy.isSupport(ProgressFragment.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, ProgressFragment.class, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = (int)(p0 * 100.00f);
       obj = this.w;
       if (obj == null && this.v != null) {
          str = this.v.toString()+i+"%";
       }else if(obj != null){
          str = this.getString(this.w)+i+"%";
       }else {
          str = i+"%";
       }
       return str;
    }
    public int uh(){
       return this.A;
    }
    public ProgressFragment vh(int p0){
       ProgressFragment obj;
       if (PatchProxy.isSupport(ProgressFragment.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ProgressFragment.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.x = null;
       this.y = p0;
       obj = this.s;
       if (obj != null) {
          obj.setText(p0);
       }
       return this;
    }
    public ProgressFragment wh(CharSequence p0){
       ProgressFragment obj = PatchProxy.applyOneRefs(p0, this, ProgressFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.x = p0;
       this.y = 0;
       obj = this.s;
       if (obj != null) {
          obj.setText(p0);
       }
       return this;
    }
    public ProgressFragment xh(View$OnClickListener p0){
       ProgressFragment obj = PatchProxy.applyOneRefs(p0, this, ProgressFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.H = p0;
       obj = this.s;
       if (obj != null) {
          obj.setOnClickListener(p0);
       }
       return this;
    }
    public ProgressFragment yh(CharSequence p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProgressFragment.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.L = p0;
       if (this.K != null) {
          k1.o(new y(this, p0));
       }
       return this;
    }
    public void zh(boolean p0){
       if (PatchProxy.isSupport(ProgressFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ProgressFragment.class, "31")) {
          return;
       }
       this.G = p0;
       ProgressFragment tE = this.E;
       if (tE != null) {
          tE.setCanceledOnTouchOutside(p0);
       }
       return;
    }
}
