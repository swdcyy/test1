package com.yxcorp.gifshow.featured.detail.featured.presenter.p;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zda.i1;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import androidx.fragment.app.Fragment;
import qo5.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;

public class p extends PresenterV2	// class@000f8b
{
    public BaseFragment p;
    public PublishSubject q;

    public void p(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p.class, "2")) {
          return;
       }
       this.X7(this.q.subscribe(new i1(this), Functions.e));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, p.class, "3")) {
          return;
       }
       a.d(this.p, true);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("LONG_ATLAS_OPEN_STATE_CHANGE_OBSERVABLE");
       return;
    }
}
