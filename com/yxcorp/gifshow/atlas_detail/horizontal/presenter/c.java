package com.yxcorp.gifshow.atlas_detail.horizontal.presenter.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k99.l;
import erd.g;
import crd.b;
import brd.t;
import im8.f;
import com.yxcorp.gifshow.entity.QPhoto;

public class c extends PresenterV2	// class@001bc1
{
    public t p;
    public f q;
    public f r;
    public QPhoto s;

    public void c(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.X7(this.p.subscribe(new l(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_PAGE_VISIBLE_OBSERVABLE");
       this.q = this.x8("DETAIL_COMMENT_RECYCLER_VIEW");
       this.r = this.x8("DETAIL_HEADER_RECYCLER_VIEW");
       this.s = this.q8(QPhoto.class);
       return;
    }
}
