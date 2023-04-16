package com.yxcorp.gifshow.homepage.presenter.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import yta.o;
import erd.g;
import crd.b;
import eda.l;
import yta.n;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import android.view.View;
import com.yxcorp.gifshow.homepage.presenter.d;
import android.view.View$OnClickListener;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import im8.f;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kwai.component.photo.reduce.f;
import com.kwai.framework.model.channel.HotChannel;

public class e extends PresenterV2	// class@0017bf
{
    public View p;
    public RecyclerFragment q;
    public f r;
    public BaseFeed s;
    public PhotoMeta t;
    public f u;
    public HotChannel v;
    public final int w;
    public View x;

    public void e(int p0){
       super();
       this.w = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.X7(f.g(n.class, mAIN).subscribe(new o(this)));
       this.X7(f.g(l.class, mAIN).subscribe(new n(this)));
       if (!QCurrentUser.ME.isLogined() || r1.b3(this.s)) {
          this.R8();
       }else {
          this.P8();
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.x = this.m8();
       return;
    }
    public void H8(){
       PatchProxy.applyVoid(null, this, e.class, "5");
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, e.class, "6")) {
          return;
       }
       this.p.setOnClickListener(new d(this));
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, e.class, "7")) {
          return;
       }
       this.p.setOnClickListener(null);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a352f);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       this.r = this.x8("ADAPTER_POSITION");
       this.s = this.r8("feed");
       this.t = this.q8(PhotoMeta.class);
       this.u = this.s8(f.class);
       this.v = this.t8("feed_channel");
       return;
    }
}
