package com.yxcorp.gifshow.detail.fragments.milano.profile.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.fragments.milano.profile.b$a;
import com.yxcorp.gifshow.detail.fragments.milano.profile.b$b;
import com.yxcorp.gifshow.detail.fragments.milano.profile.b$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b$b;
import com.kwai.framework.player.core.b;
import z0a.c;
import erd.g;
import crd.b;
import brd.t;
import z0a.d;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.CDNUrl;
import p5a.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import io.reactivex.subjects.PublishSubject;

public class b extends PresenterV2	// class@001546
{
    public final b$b A;
    public BaseFragment p;
    public a q;
    public MilanoContainerEventBus r;
    public SlidePlayViewModel s;
    public boolean t;
    public PhotoDetailLogger u;
    public t v;
    public int w;
    public PublishSubject x;
    public final p y;
    public final a z;

    public void b(){
       super();
       this.y = new b$a(this);
       this.z = new b$b(this);
       this.A = new b$c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.p.getParentFragment());
       this.s = slidePlayVie;
       slidePlayVie.P(this.p, this.z);
       this.q.getPlayer().w(this.A);
       this.X7(this.x.subscribe(new c(this)));
       this.X7(this.v.subscribe(new d(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       this.q.getPlayer().O(this.A);
       return;
    }
    public final boolean P8(QPhoto p0){
       boolean b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uob, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       b = true;
       if (this.t != null && p0 != null) {
          Object obj1 = PatchProxy.applyOneRefs(p0, this, uob, "4");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(p0.isImageType()){
             CDNUrl[] uCDNUrlArray = b.b(p0);
             if (uCDNUrlArray == null || uCDNUrlArray.length <= 0) {
                b1 = false;
             }
          }
          b1 = true;
          if (!b1 && p0.isSinglePhoto()) {
          label_0047 :
             return b;
          }
       }
    label_0046 :
       b = false;
       goto label_0047 ;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_FRAGMENT");
       this.q = this.q8(a.class);
       this.r = this.q8(MilanoContainerEventBus.class);
       this.u = this.r8("DETAIL_LOGGER");
       this.v = this.r8("NO_AUDIO_SINGLE_PLAY_OBSERVABLE");
       this.x = this.r8("DETAIL_SLIDE_PHOTO_LIST_PAUSE_VIEW_CLICK");
       return;
    }
}
