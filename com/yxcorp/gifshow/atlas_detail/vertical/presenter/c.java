package com.yxcorp.gifshow.atlas_detail.vertical.presenter.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.yxcorp.gifshow.entity.QPhoto;
import n99.d;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.b;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import im8.f;

public class c extends PresenterV2	// class@001bdd
{
    public QPhoto p;
    public BaseFragment q;
    public f r;

    public void c(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.X7(this.p.observePostChange().subscribe(new d(this), b.b));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.r8("DETAIL_FRAGMENT");
       this.r = this.x8("DETAIL_COMMENT_RECYCLER_VIEW");
       return;
    }
}
