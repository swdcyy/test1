package com.yxcorp.gifshow.ad.detail.presenter.player.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import d19.i;
import erd.g;
import crd.b;
import brd.t;
import io.reactivex.subjects.PublishSubject;
import de5.a;

public class g extends PresenterV2	// class@00167e
{
    public PublishSubject p;
    public a q;
    public QPhoto r;

    public void g(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       if (!this.r.isVideoType()) {
          return;
       }
       this.X7(this.p.subscribe(new i(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_PHOTO_UPDATED_EVENT");
       this.q = this.q8(a.class);
       this.r = this.q8(QPhoto.class);
       return;
    }
}
