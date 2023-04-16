package com.yxcorp.gifshow.v3.editor.cover.d1$a;
import ooc.r0;
import com.yxcorp.gifshow.v3.editor.cover.d1;
import java.lang.Object;
import ooc.q0;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import android.view.View;
import android.os.Bundle;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import uwc.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.concurrent.atomic.AtomicBoolean;
import crd.b;
import java.util.List;
import com.yxcorp.gifshow.v3.previewer.EditorBasePreviewFragment;
import r1c.h;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class d1$a implements r0	// class@000e55
{
    public final d1 b;

    public void d1$a(d1 p0){
       this.b = p0;
       super();
    }
    public void Z(){
       q0.q(this);
    }
    public void b(c p0){
       q0.j(this, p0);
    }
    public void c(View p0,Bundle p1,BaseEditorFragment p2){
       q0.p(this, p0, p1, p2);
    }
    public void d(a p0){
       q0.o(this, p0);
    }
    public void d0(){
       q0.g(this);
    }
    public void e(boolean p0){
       d1$a uoa = d1$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       a uoa1 = a.D();
       StringBuilder str = "next step: mFinalRequestGenerateCover="+this.b.y+", generateCoverDisposable=";
       boolean b = (this.b.C != null)? true: false;
       Object[] objArray = new Object[0];
       uoa1.w("PhotosGenerateCoverPresenter", str+b, objArray);
       this.b.z.set(true);
       if (!this.b.y.get()) {
          d1$a tb = this.b;
          d1 c = tb.C;
          if (c != null) {
             tb.C = null;
             tb.x.set(0);
             if (!c.isDisposed()) {
                c.dispose();
             }
          }
       }
       return;
    }
    public List f(){
       return q0.c(this);
    }
    public void g(int p0){
       q0.i(this, p0);
    }
    public void h(EditorBasePreviewFragment p0,c p1){
       q0.m(this, p0, p1);
    }
    public void i(){
       q0.l(this);
    }
    public List j(h p0,boolean p1){
       return q0.b(this, p0, p1);
    }
    public void m(LayoutInflater p0,ViewGroup p1,Bundle p2,View p3,BaseEditorFragment p4){
       q0.n(this, p0, p1, p2, p3, p4);
    }
    public void onActivityDestroy(){
       q0.f(this);
    }
    public void onActivityResume(){
       q0.h(this);
    }
    public void p(boolean p0){
       q0.k(this, p0);
    }
    public void s(Bundle p0){
       q0.e(this, p0);
    }
    public void u(boolean p0,String p1){
       q0.d(this, p0, p1);
    }
}
