package com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import xl8.d;
import y8c.a;
import brd.t;
import r19.o;
import erd.g;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.android.model.mix.PhotoMeta;

public class g extends PresenterV2	// class@0016df
{
    public View p;
    public QPhoto q;
    public BaseFragment r;
    public PhotoMeta s;
    public b t;

    public void g(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       this.P8();
       b9.a(this.t);
       this.t = b9.d(this.s, this.r).subscribe(new o(this));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, g.class, "5")) {
          return;
       }
       b9.a(this.t);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       g tp = this.p;
       int i = (this.q.isMine() && !this.q.isPublic())? 0: 8;
       tp.setVisibility(i);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3a05);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       this.r = this.r8("DETAIL_FRAGMENT");
       this.s = this.q8(PhotoMeta.class);
       return;
    }
}
