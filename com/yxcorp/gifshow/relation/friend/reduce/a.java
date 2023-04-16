package com.yxcorp.gifshow.relation.friend.reduce.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import uac.p;
import erd.r;
import uac.o;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class a extends PresenterV2	// class@0018ce
{
    public BaseFragment p;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.X7(this.p.m().filter(new p(this)).subscribe(new o(this), Functions.d()));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       return;
    }
}
