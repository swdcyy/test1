package com.yxcorp.gifshow.bottom.sheet.f;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import qa9.q;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import ekd.e0;
import java.lang.RuntimeException;
import android.view.View;
import java.lang.Boolean;
import android.view.ViewParent;
import crd.b;
import crd.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.bottom.sheet.BottomSheetParams;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import android.os.Parcelable;
import org.parceler.b;
import lnc.b9;
import androidx.fragment.app.c;
import androidx.fragment.app.b;
import android.content.Context;
import java.lang.ClassLoader;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.bottom.sheet.a;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.bottom.sheet.c;
import android.view.View$OnTouchListener;
import qa9.a;
import android.view.View$OnClickListener;
import com.google.android.material.bottomsheet.BottomSheetMultiChildBehavior;
import qa9.c;
import com.google.android.material.bottomsheet.BottomSheetMultiChildBehavior$a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import ekd.k1;
import com.yxcorp.gifshow.bottom.sheet.f$a;
import com.google.android.material.bottomsheet.BottomSheetBehavior$c;
import brd.t;
import t45.d;
import brd.z;
import qa9.b;
import erd.g;
import com.yxcorp.gifshow.bottom.sheet.e;
import z1.a;

public final class f	// class@001c68
{
    public final Fragment a;
    public final q b;
    public String c;
    public BottomSheetParams d;
    public BottomSheetBehavior e;
    public a f;
    public b g;
    public Runnable h;
    public a i;
    public int j;

    public void f(Fragment p0){
       super();
       this.c = "Unknown";
       this.j = 0;
       this.a = p0;
       this.b = new q(this);
    }
    public static void d(String p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, f.class, "14")) {
          return;
       }
       if (p1.length > 0) {
          String.format(p0, p1);
       }
       return;
    }
    public static void e(Throwable p0,String p1,Object[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, f.class, "15")) {
          return;
       }
       f.d(p1, p2);
       if (!e0.a) {
          return;
       }
       throw new RuntimeException("Error happened ", p0);
    }
    public static void j(View p0,boolean p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uof, "11")) {
          return;
       }
       if (p0.getParent() instanceof View) {
          p0 = p0.getParent();
          int i = (p1)? 0: 8;
          p0.setVisibility(i);
       }
       return;
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "8")) {
          return;
       }
       if (this.f == null) {
          this.f = new a();
       }
       this.f.c(p0);
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "7")) {
          return;
       }
       f th = this.h;
       if (th != null) {
          th.run();
          this.h = objArray;
          Object[] objArray1 = new Object[]{this.c};
          f.d("Container[%1$s] is destroyed.", objArray1);
       }
       return;
    }
    public BottomSheetParams c(){
       BottomSheetParams obj = PatchProxy.apply(null, this, f.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          String str = "args-bs-params";
          obj = (this.a.getArguments() != null)? b.a(this.a.getArguments().getParcelable(str)): null;
          this.d = obj;
          if (obj == null) {
             this.d = BottomSheetParams.ofStateless();
             Object[] objArray = new Object[]{"BottomSheets",str};
             f.e(null, "Fragment[%1$s] should set %2$s argument", objArray);
          }
       }
       return this.d;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       this.i(false);
       this.b();
       b9.a(this.f);
       this.f = null;
       b9.a(this.g);
       this.g = null;
       return;
    }
    public void g(View p0){
       boolean b;
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uof, "1")) {
          return;
       }
       FrameLayout obj = PatchProxy.applyOneRefs(p0, this, uof, "12");
       int i = 0x7f0a051e;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          uof = this.a;
          Bundle arguments = (uof.getArguments() != null)? uof.getArguments(): Bundle.EMPTY;
          Bundle bundle = arguments.getBundle("args-bs-content-args");
          String str = arguments.getString("args-bs-content-tag", "Unknown");
          this.c = str;
          Object[] objArray = new Object[true];
          objArray[0] = str;
          f.d("Container[%1$s] is created, and content is to be created", objArray);
          Fragment uFragment = uof.getChildFragmentManager().getFragmentFactory().a(p0.getContext().getClassLoader(), arguments.getString("args-bs-content-name", ""));
          if (bundle == Bundle.EMPTY) {
             bundle = new Bundle();
          }
          uFragment.setArguments(bundle);
          e uoe = uof.getChildFragmentManager().beginTransaction();
          uoe.w(i, uFragment, this.c);
          uoe.x(new a(this));
          uoe.m();
          b = true;
       }
       if (!b) {
          return;
       }else {
          BottomSheetParams uBottomSheet = this.c();
          obj = p0.findViewById(i);
          ViewGroup$LayoutParams layoutParams = obj.getLayoutParams();
          BottomSheetParams mContentHeig = uBottomSheet.mContentHeight;
          if (layoutParams.height != mContentHeig) {
             layoutParams.height = mContentHeig;
             obj.setLayoutParams(layoutParams);
          }
          obj.setOnTouchListener(c.b);
          View view = p0.findViewById(R.id.bs_background);
          view.setBackgroundColor(uBottomSheet.mBackgroundColor);
          if (uBottomSheet.mOutsideCancelable != null) {
             view.setOnClickListener(new a(this));
          }
          boolean b1 = (uBottomSheet.mBackgroundColor != null)? true: false;
          if (b1) {
             view.setAlpha(0);
          }
          BottomSheetMultiChildBehavior uBottomSheet1 = BottomSheetMultiChildBehavior.from(obj);
          this.e = uBottomSheet1;
          uBottomSheet1.setDragDisable(this.c().mDragDisable);
          this.e.setHidePanelCallback(new c(this, uBottomSheet));
          this.e.setHideable(true);
          this.e.setSkipCollapsed(true);
          this.e.setState(5);
          f$a uoa = new f$a(this, k1.i(), b1, view, uBottomSheet);
          this.e.setBottomSheetCallback(uBottomSheet1);
          f.j(p0, true);
          z a = d.a;
          this.a(this.b.f().observeOn(a).subscribe(new b(this, p0)));
          t ot = this.b.e().observeOn(a);
          this.a(ot.subscribe(new e(this, p0)));
          return;
       }
    }
    public void h(BottomSheetParams p0,String p1,Class p2,Bundle p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, f.class, "9")) {
          return;
       }
       Bundle arguments = this.a.getArguments();
       if (arguments == null) {
          arguments = new Bundle();
          this.a.setArguments(arguments);
       }
       arguments.putString("args-bs-content-tag", p1);
       arguments.putString("args-bs-content-name", p2.getName());
       if (p3 == null) {
          p3 = Bundle.EMPTY;
       }
       arguments.putBundle("args-bs-content-args", p3);
       arguments.putParcelable("args-bs-params", b.c(p0));
       return;
    }
    public final void i(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "6")) {
          return;
       }
       uof = this.i;
       if (uof != null) {
          uof.accept(Boolean.valueOf((p0 & this.c().mBackPressCancelable)));
       }
       return;
    }
}
