package com.yxcorp.gifshow.profile.presenter.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.profile.presenter.f$a;
import com.yxcorp.gifshow.profile.presenter.f$b;
import com.yxcorp.gifshow.profile.presenter.f$c;
import com.kuaishou.android.model.mix.PhotoMeta;
import tl8.d;
import xl8.d;
import y8c.a;
import brd.t;
import lnc.b9;
import i4c.f0;
import erd.g;
import crd.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import i4c.g0;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import o3c.b;
import com.yxcorp.gifshow.profile.http.c;

public class f extends PresenterV2	// class@001449
{
    public RecyclerFragment p;
    public b q;
    public c r;
    public QPhoto s;
    public f$c t;
    public boolean u;

    public void f(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       f ts = this.s;
       if (ts != null && ts.mEntity != null) {
          f$a uoa = new f$a(this, ts);
          this.t = uoa;
          uoa.a = new f$b(this, this.s);
          PhotoMeta photoMeta = this.s.mEntity.a(PhotoMeta.class);
          if (photoMeta != null) {
             this.X7(b9.d(photoMeta, this.p).subscribe(new f0(this)));
             this.X7(this.p.m().compose(c.c(this.p.m(), FragmentEvent.DESTROY)).subscribe(new g0(this)));
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.t8("PROFILE_COLLECTION_PAGE_LIST");
       this.r = this.t8("PROFILE_LIKED_PAGE_LIST");
       this.s = this.q8(QPhoto.class);
       return;
    }
}
