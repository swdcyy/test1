package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.e;
import android.view.View$OnTouchListener;
import android.view.View$OnLongClickListener;
import hka.a;
import lnc.a1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.c;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import android.content.Context;
import ekd.l1;
import com.yxcorp.utility.n;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import ro5.a;
import uo5.a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.d;
import bz5.a$c;
import bz5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Float;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import i2b.a;
import android.view.ViewGroup;
import bz5.b$a;
import bz5.b$b;
import k6a.e;
import android.view.View$OnClickListener;
import bz5.b;
import android.view.ViewParent;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import k6a.d;
import android.view.MotionEvent;

public class e implements View$OnTouchListener, View$OnLongClickListener, a	// class@00175d
{
    public final BaseFragment b;
    public final SlidePlayViewModel c;
    public final c d;
    public SwipeLayout e;
    public QPhoto f;
    public ViewGroup g;
    public ViewGroup h;
    public a i;
    public int j;
    public boolean k;
    public float l;
    public static final int m;

    static {
       e.m = a1.d(0x7f070313);
    }
    public void e(BaseFragment p0,c p1){
       super();
       this.b = p0;
       this.d = p1;
       this.c = SlidePlayViewModel.B0(p0.getParentFragment());
       int i = (l1.a(p0.getContext()))? 0: n.A(p0.requireContext());
       this.j = i;
       this.e = w9.c(p0.requireActivity());
       return;
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, e.class, "1")) {
          return;
       }
       p0.setOnTouchListener(this);
       p0.setOnLongClickListener(this);
       PatchProxy.onMethodExit(e.class, "1");
       return;
    }
    public final void b(boolean p0){
       if (PatchProxy.isSupport2(e.class, "3") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, e.class, "3")) {
          return;
       }
       this.c.d(p0, 4);
       a.o(this.b, p0, 5);
       e te = this.e;
       if (te != null) {
          te.n(p0, 6);
       }
       a.c(this.b.requireActivity(), p0, 2);
       PatchProxy.onMethodExit(e.class, "3");
       return;
    }
    public boolean c(){
       Object obj = PatchProxy.applyWithListener(null, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.i == null || this.k == null) {
          PatchProxy.onMethodExit(e.class, "6");
          return b;
       }else {
          this.k = b;
          this.b(true);
          this.i.b(new d(this));
          PatchProxy.onMethodExit(e.class, "6");
          return true;
       }
    }
    public void d(QPhoto p0){
       this.f = p0;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.applyWithListener(null, this, e.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PatchProxy.onMethodExit(e.class, "10");
       return this.c();
    }
    public boolean onLongClick(View p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyOneRefsWithListener(p0, this, e.class, "8");
       if (p0 != patchProxyRe) {
          return p0.booleanValue();
       }
       e tl = this.l;
       if (!PatchProxy.isSupport2(e.class, "2") || !PatchProxy.applyVoidOneRefsWithListener(Float.valueOf(tl), this, e.class, "2")) {
          if (VisitorModeManager.f()) {
             PatchProxy.onMethodExit(e.class, "2");
          }else if(this.h == null){
             this.h = a.a(this.b.getContext(), 0x7f0d0fe0);
          }
          Object[] objArray = null;
          if (this.i == null) {
             String str = "7";
             a uoa = PatchProxy.applyWithListener(objArray, this, e.class, str);
             if (uoa != patchProxyRe) {
             }else {
                b$a uoa1 = new b$a();
                uoa1.a(new b$b(R.drawable.arg_RES_7f0806c4, 0x7f1036cd, new e(this)));
                uoa = new a(uoa1.b(), this.h);
                PatchProxy.onMethodExit(e.class, str);
             }
             this.i = uoa;
          }
          if (this.h.getParent() == null) {
             String str1 = "4";
             if (!PatchProxy.applyVoidWithListener(objArray, this, e.class, str1)) {
                if (this.g == null) {
                   this.g = this.b.requireActivity().findViewById(0x1020002);
                }
                this.g.addView(this.h, new FrameLayout$LayoutParams(-1, -1));
                PatchProxy.onMethodExit(e.class, str1);
             }
          }
          this.b(false);
          this.k = true;
          this.h.setOnClickListener(new d(this));
          this.i.c(tl, n.j(this.b.requireActivity()), n.k(this.b.requireActivity()), (this.j + e.m));
          PatchProxy.onMethodExit(e.class, "2");
       }
       PatchProxy.onMethodExit(e.class, "8");
       return true;
    }
    public boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefsWithListener(p0, p1, this, e.class, "9");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (!p1.getAction()) {
          this.l = p1.getRawY();
       }
       PatchProxy.onMethodExit(e.class, "9");
       return false;
    }
}
