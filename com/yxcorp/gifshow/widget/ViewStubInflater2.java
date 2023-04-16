package com.yxcorp.gifshow.widget.ViewStubInflater2;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.util.SparseArray;
import java.lang.Boolean;
import android.view.ViewStub;
import java.lang.StringBuilder;
import android.view.ViewParent;
import a2.i0;
import lnc.bb;
import com.yxcorp.gifshow.widget.ViewStubInflater2$ViewStubNotFoundException;
import java.lang.IllegalArgumentException;

public class ViewStubInflater2	// class@0018ea
{
    public final int a;
    public final int b;
    public int c;
    public View d;
    public ViewStub e;
    public View f;
    public SparseArray g;

    public void ViewStubInflater2(int p0){
       super();
       this.a = p0;
       this.b = 0;
    }
    public void ViewStubInflater2(int p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public View a(){
       return this.f;
    }
    public View b(int p0){
       View obj;
       ViewStubInflater2 viewStubInfl = ViewStubInflater2.class;
       if (PatchProxy.isSupport(viewStubInfl)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, viewStubInfl, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.g == null) {
          this.g = new SparseArray();
       }
       obj = this.g.get(p0);
       if (obj == null) {
          this.h();
          obj = this.f.findViewById(p0);
          this.g.put(p0, obj);
       }
       return obj;
    }
    public boolean c(){
       ViewStubInflater2 obj = PatchProxy.apply(null, this, ViewStubInflater2.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.f;
       boolean b = false;
       if (obj == null) {
          return b;
       }
       if (!obj.getVisibility()) {
          b = true;
       }
       return b;
    }
    public void d(View p0){
       this.d = p0;
    }
    public void e(int p0){
       this.c = p0;
    }
    public void f(int p0,boolean p1){
       ViewStubInflater2 viewStubInfl = ViewStubInflater2.class;
       if (PatchProxy.isSupport(viewStubInfl) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, viewStubInfl, "3")) {
          return;
       }
       if (p1) {
          this.b(p0).setVisibility(0);
       }else {
          ViewStubInflater2 tg = this.g;
          if (tg != null) {
             View view = tg.get(p0);
             if (view != null) {
                view.setVisibility(8);
             }
          }
       }
       return;
    }
    public void g(boolean p0){
       ViewStubInflater2 viewStubInfl = ViewStubInflater2.class;
       if (PatchProxy.isSupport(viewStubInfl) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, viewStubInfl, "2")) {
          return;
       }
       if (p0) {
          this.h();
          this.f.setVisibility(0);
       }else {
          ViewStubInflater2 tf = this.f;
          if (tf != null) {
             tf.setVisibility(8);
          }
       }
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, ViewStubInflater2.class, "5")) {
          return;
       }
       if (this.f == null) {
          ViewStubInflater2 td = this.d;
          if (td != null) {
             ViewStubInflater2 tb = this.b;
             if (tb != null) {
                View view = td.findViewById(tb);
                if (view != null) {
                   this.f = view;
                   return;
                }
             }
             if (this.e == null) {
                ViewStub viewStub = this.d.findViewById(this.a);
                this.e = viewStub;
                if (viewStub == null) {
                   StringBuilder str = "parent:";
                   String name = (this.d.getParent() != null)? this.d.getParent().getClass().getName(): "null";
                   str = str+name+";"+"attachToWin:"+i0.X(this.d)+";"+"viewTree:";
                   bb.a(this.d, str);
                   throw new ViewStubInflater2$ViewStubNotFoundException("ViewStubId="+this.a+","+str);
                }
             }
             if (this.e.getParent() != null) {
                td = this.c;
                if (td != null) {
                   this.e.setLayoutResource(td);
                }
                td = this.b;
                if (td != null) {
                   this.e.setInflatedId(td);
                }
                this.f = this.e.inflate();
             }
          }else {
             throw new IllegalArgumentException("RootView must not be null");
          }
       }
       return;
    }
}
