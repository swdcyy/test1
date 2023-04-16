package com.yxcorp.gifshow.activity.share.presenter.c3;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import crd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.activity.BasePostActivity;
import com.yxcorp.gifshow.util.rx.RxBus;
import rw8.a;
import brd.t;
import t45.d;
import brd.z;
import zw8.y5;
import com.yxcorp.gifshow.activity.share.presenter.b3;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.encode.EncodeRequest;

public class c3 extends PresenterV2	// class@0013d4
{
    public BasePostActivity p;
    public c q;
    public EditorSdk2V2$VideoEditorProject r;
    public EncodeRequest s;
    public e t;
    public a u;
    public boolean v;

    public void c3(){
       super();
       this.u = new a();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c3.class, "2")) {
          return;
       }
       BasePostActivity activity = this.getActivity();
       this.p = activity;
       if (activity == null) {
          return;
       }
       this.u.c(RxBus.f.f(a.class).subscribeOn(d.c).observeOn(d.a).subscribe(new y5(this), b3.b));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c3.class, "3")) {
          return;
       }
       if (!this.u.isDisposed()) {
          this.u.dispose();
          this.u = null;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c3.class, "1")) {
          return;
       }
       this.q = this.t8("WORKSPACE");
       this.s = this.t8("SHARE_ENCODE_REQUEST");
       return;
    }
}
