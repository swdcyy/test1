package com.yxcorp.gifshow.ad.detail.presenter.log.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y09.k;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.ad.detail.presenter.log.d$a;
import im8.f;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.e0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.entity.QPhoto;
import k2b.u1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import mrd.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;

public class d extends PresenterV2	// class@001663
{
    public f p;
    public c q;
    public BaseFragment r;
    public PhotoDetailParam s;
    public QPhoto t;
    public boolean u;

    public void d(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.q.subscribe(new k(this));
       this.p.set(new d$a(this));
       return;
    }
    public void P8(ClientEvent$ElementPackage p0,ClientContent$ContentPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "3")) {
          return;
       }
       u1.B0(new ShowMetaData().setLogPage(this.r).setType(p0.type).setElementPackage(p0).setFeedLogCtx(this.t.getFeedLogCtx()).setContentPackage(p1));
       return;
    }
    public void R8(ClientEvent$ShowEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       u1.B0(new ShowMetaData().setLogPage(this.r).setFeedLogCtx(this.t.getFeedLogCtx()).setElementPackage(p0.elementPackage).setContentPackage(p0.contentPackage));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.x8("LOG_LISTENER");
       this.q = this.r8("DETAIL_ADJUST_EVENT");
       this.t = this.q8(QPhoto.class);
       this.r = this.r8("DETAIL_FRAGMENT");
       this.s = this.q8(PhotoDetailParam.class);
       return;
    }
}
