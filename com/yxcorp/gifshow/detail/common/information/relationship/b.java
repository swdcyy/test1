package com.yxcorp.gifshow.detail.common.information.relationship.b;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import rp7.a;
import jh5.a;
import rq7.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import er7.e;
import java.lang.Boolean;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.User;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import wy9.a;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import qp7.b;
import com.kuaishou.android.model.mix.PhotoMeta;
import brd.w;
import com.yxcorp.gifshow.detail.common.information.relationship.a;
import erd.o;
import wy9.b;
import qp7.d;
import er7.d;
import qp7.c;
import er7.a;

public abstract class b extends DispatchBaseElement	// class@001453
{
    public QPhoto t;
    public BaseFragment u;

    public void b(a p0,a p1){
       super(p0, p1);
    }
    public a f0(a p0){
       e uoe = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e(p0);
       }
       return uoe;
    }
    public void j0(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "1")) {
          return;
       }
       b tt = this.t;
       if (tt != null) {
          uob = this.u;
          if (uob != null) {
             tt.startSyncWithActivity(uob.m());
             g e = Functions.e;
             this.j(this.t.getUser().observable().subscribe(new a(this), e));
             if (this.t.getPhotoMeta() != null) {
                this.j(t.concat(t.just(this.t.getPhotoMeta()), this.t.getPhotoMeta().observable()).distinctUntilChanged(a.b).skip(1).subscribe(new b(this), e));
             }
          }
       }
       if (!this.o0()) {
          this.b0();
       }
       this.n0();
       return;
    }
    public abstract void n0();
    public abstract boolean o0();
    public d q(){
       d uod = PatchProxy.apply(null, this, b.class, "4");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = new d();
       }
       return uod;
    }
    public c r(){
       a uoa = PatchProxy.apply(null, this, b.class, "2");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       return uoa;
    }
}
