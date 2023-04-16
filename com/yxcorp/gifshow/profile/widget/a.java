package com.yxcorp.gifshow.profile.widget.a;
import y8c.t;
import android.view.ViewGroup;
import com.trello.rxlifecycle3.components.support.RxFragment;
import java.lang.Object;
import a1.a;
import android.content.Context;
import brd.t;
import b6c.e;
import erd.g;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.Throwable;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.yxcorp.retrofit.model.KwaiException;
import b6c.b;
import android.view.View$OnClickListener;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.Boolean;
import mkc.b;
import b6c.c;
import a1.a$e;
import b6c.d;

public class a implements t	// class@001606
{
    public final ViewGroup a;
    public final a b;
    public View c;
    public View d;
    public View e;
    public boolean f;
    public int g;

    public void a(ViewGroup p0,RxFragment p1){
       super();
       this.g = 0;
       this.a = p0;
       this.b = new a(p0.getContext());
       p1.m().subscribe(new e(this));
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       this.a.setVisibility(8);
       a te = this.e;
       if (te != null) {
          te.setVisibility(8);
       }
       return;
    }
    public void b(View p0){
    }
    public final void c(View p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "4")) {
          return;
       }
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       CharSequence uCharSequenc = null;
       if (p1 instanceof KwaiException) {
          uCharSequenc = p1.mErrorMessage;
       }
       uoa.p(new b(this));
       if (!TextUtils.isEmpty(uCharSequenc)) {
          uoa.i(uCharSequenc);
       }
       uoa.a(p0);
       this.e(p0);
       ExceptionHandler.handleUserNotLoginFirstTimeAlert(p1, p0);
       return;
    }
    public void d(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.a();
       this.g = 1;
       a tc = this.c;
       if (tc != null) {
          this.e(tc);
       }else {
          this.b.b(b.d.a, this.a, new c(this));
       }
       return;
    }
    public final void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       this.a();
       this.a.setVisibility(0);
       if (this.a.indexOfChild(p0) < 0) {
          this.a.addView(p0);
       }
       p0.setVisibility(0);
       this.e = p0;
       return;
    }
    public void f(){
    }
    public void g(){
    }
    public void i(){
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       this.g = 0;
       this.a();
       return;
    }
    public void k(boolean p0,Throwable p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "3")) {
          return;
       }
       this.g = 2;
       a td = this.d;
       if (td != null) {
          this.c(td, p1);
       }else {
          this.b.b(b.g.a, this.a, new d(this, p1));
       }
       return;
    }
    public void p(){
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.g = 0;
       this.a();
       return;
    }
}
