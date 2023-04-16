package com.yxcorp.gifshow.v3.editor.prettify.filter.m;
import o0c.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.editor.prettify.filter.m$a;
import com.yxcorp.gifshow.v3.editor.prettify.filter.m$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import usc.r;
import com.yxcorp.gifshow.v3.editor.prettify.filter.l;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import o0c.c;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import io.reactivex.subjects.PublishSubject;
import android.view.View;
import android.os.Bundle;

public class m extends PresenterV2 implements d	// class@00117c
{
    public i p;
    public BaseFragment q;
    public PublishSubject r;
    public EditDecorationContainerView s;
    public DecorationContainerView$e t;
    public h u;

    public void m(){
       super();
       this.t = new m$a(this);
       this.u = new m$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m.class, "2")) {
          return;
       }
       this.X7(this.r.subscribe(new r(this), l.b));
       this.s.d(this.t);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, m.class, "4")) {
          return;
       }
       this.s.M(this.t);
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, m.class, "3");
    }
    public void M3(){
       c.g(this);
    }
    public void W5(){
       c.b(this);
    }
    public void f5(){
       c.d(this);
    }
    public void f6(){
       c.a(this);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.p = this.r8("EDITOR_HELPER_CONTRACT");
       this.s = this.r8("DECORATION_CONTAINER_VIEW");
       this.r = this.r8("GENERATE_FILTER_FRAGMETN");
       return;
    }
    public void n4(){
       c.f(this);
    }
    public void q4(View p0,Bundle p1){
       c.j(this, p0, p1);
    }
    public void u3(){
       c.i(this);
    }
    public void v6(boolean p0){
       c.e(this, p0);
    }
    public void x5(){
       c.c(this);
    }
    public void y6(){
       c.h(this);
    }
}
