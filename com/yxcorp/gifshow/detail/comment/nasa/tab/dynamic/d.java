package com.yxcorp.gifshow.detail.comment.nasa.tab.dynamic.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.u1;
import com.yxcorp.gifshow.util.rx.RxBus;
import nk9.e;
import brd.t;
import ix9.d;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import ix9.c;
import js6.a;
import java.lang.Boolean;
import ix9.b;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.detail.comment.nasa.tab.dynamic.CommentRnContainerFragment;
import m56.f;
import m56.g;

public class d extends PresenterV2	// class@00138e
{
    public CommentRnContainerFragment p;

    public void d(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       u1.a(this);
       this.X7(RxBus.f.f(e.class).subscribe(new d(this)));
       this.X7(this.p.Vg().j().subscribe(new c(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       u1.b(this);
       return;
    }
    public final void P8(String p0,String p1){
       d uod = d.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uod, "7")) {
          return;
       }
       a.b.GO(p0, p1);
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(Boolean.TRUE, p1, this, uod, "8")) {
          Object[] objArray = new Object[0];
          b.C().s("CommentDynamicNativeJs", "Native->Js:"+p1, objArray);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.r8("COMMENT_DYNAMIC_CONTAINER_FRAGMENT");
       return;
    }
    public void onBackground(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       this.P8("commentWonderfulHideApp", "");
       return;
    }
    public void onForeground(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       this.P8("commentWonderfulShowApp", "");
       return;
    }
}
