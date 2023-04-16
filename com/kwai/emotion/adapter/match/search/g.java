package com.kwai.emotion.adapter.match.search.g;
import qvb.q;
import android.view.ViewStub;
import com.kwai.emotion.adapter.match.search.e;
import g9c.d;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qvb.a;
import e17.i;
import android.view.View;
import com.kwai.library.widget.specific.misc.LoadingView;
import android.content.Context;
import java.lang.CharSequence;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import zj5.v;
import android.view.View$OnClickListener;
import qvb.p;

public class g implements q	// class@000d6e
{
    public View b;
    public LoadingView c;
    public View d;
    public View e;
    public LoadingView f;
    public ViewStub g;
    public e h;
    public d i;

    public void g(ViewStub p0,e p1,d p2){
       super();
       this.g = p0;
       this.h = p1;
       this.i = p2;
    }
    public void M1(boolean p0,Throwable p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, og, "4")) {
          return;
       }
       if (p0 && !this.h.isEmpty()) {
          this.h.clear();
       }
       this.b();
       boolean b = false;
       if (p0) {
          this.e(true);
       }else {
          this.e(b);
          i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
       }
       this.f(b);
       this.d(b);
       og = this.b;
       if (!p0) {
          b = 8;
       }
       og.setVisibility(b);
       return;
    }
    public void Z1(boolean p0,boolean p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, og, "2")) {
          return;
       }
       p1 = true;
       if (p0) {
          this.f(p1);
          this.d(false);
          this.e(false);
          this.b.setVisibility(false);
       }else {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, og, "8")) {
             if (this.f == null) {
                LoadingView loadingView = new LoadingView(this.g.getContext(), 0x7f110210);
                this.f = loadingView;
                loadingView.g(p1, objArray);
                this.i.M0(this.f, new ViewGroup$LayoutParams(-2, -1));
             }
             this.c(this.f, p1);
          }
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, g.class, "9")) {
          return;
       }
       this.c(this.f, false);
       return;
    }
    public final void c(LoadingView p0,boolean p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, og, "10")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       int i = 0;
       while (i < p0.getChildCount()) {
          View childAt = p0.getChildAt(i);
          if (childAt != null) {
             int i1 = (p1)? 0: 8;
             childAt.setVisibility(i1);
          }
          i = i + 1;
       }
       return;
    }
    public final void d(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "6")) {
          return;
       }
       if (this.b == null) {
          this.g.setLayoutResource(R.layout.arg_RES_7f0d13ba);
          this.b = this.g.inflate();
       }
       if (this.d == null) {
          this.d = this.b.findViewById(0x7f0a0d34);
       }
       og = this.d;
       int i = (p0)? 0: 8;
       og.setVisibility(i);
       return;
    }
    public final void e(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "7")) {
          return;
       }
       if (this.b == null) {
          this.g.setLayoutResource(R.layout.arg_RES_7f0d13ba);
          this.b = this.g.inflate();
       }
       if (this.e == null) {
          View view = this.b.findViewById(R.id.error);
          this.e = view;
          view.setOnClickListener(new v(this));
       }
       og = this.e;
       int i = (p0)? 0: 8;
       og.setVisibility(i);
       return;
    }
    public final void f(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "5")) {
          return;
       }
       if (this.b == null) {
          this.g.setLayoutResource(R.layout.arg_RES_7f0d13ba);
          this.b = this.g.inflate();
       }
       if (this.c == null) {
          LoadingView loadingView = this.b.findViewById(R.id.loading_view);
          this.c = loadingView;
          loadingView.g(true, null);
       }
       this.c(this.c, p0);
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "1")) {
          return;
       }
       this.d(this.h.isEmpty());
       p0 = false;
       this.f(p0);
       this.e(p0);
       og = this.b;
       if (!this.h.isEmpty()) {
          int i = 8;
       }
       og.setVisibility(p0);
       return;
    }
    public void v2(boolean p0,boolean p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, og, "3")) {
          return;
       }
       this.b();
       this.d(this.h.isEmpty());
       p0 = false;
       this.f(p0);
       this.e(p0);
       g tb = this.b;
       if (!this.h.isEmpty()) {
          int i = 8;
       }
       tb.setVisibility(p0);
       return;
    }
}
