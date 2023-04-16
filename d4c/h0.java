package d4c.h0;
import com.yxcorp.gifshow.music.utils.kottor.KPresenterV2;
import com.yxcorp.gifshow.common_music_player.MusicListPlayerView;
import d4c.h0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s1c.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.trello.rxlifecycle3.components.support.RxFragment;
import d4c.d0;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import j5c.c;
import d4c.c0;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import qm9.a0;
import tkd.b;
import tkd.d;
import kob.r;
import java.lang.Integer;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.framework.model.user.User;

public final class h0 extends KPresenterV2	// class@0020d0
{
    public a0 A;
    public MusicListPlayerView q;
    public BaseFragment r;
    public boolean s;
    public boolean t;
    public PublishSubject u;
    public FragmentCompositeLifecycleState v;
    public c w;
    public User x;
    public a y;
    public r z;

    public void h0(MusicListPlayerView p0){
       super();
       this.A = new h0$a(this);
       this.q = p0;
    }
    public void E8(){
       h0 oh0 = h0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh0, "3")) {
          return;
       }
       h0 ty = this.y;
       this.u = ty.h;
       this.w = ty.e;
       this.v = new FragmentCompositeLifecycleState(this.r);
       if (!PatchProxy.applyVoid(objArray, this, oh0, "5")) {
          oh0 = this.u;
          if (oh0 != null) {
             this.X7(oh0.subscribe(new d0(this)));
          }
       }
       this.X7(this.w.e().subscribe(new c0(this)));
       oh0 = this.q;
       if (oh0 != null) {
          oh0.f(ImmutableMap.of("tab_name", "music"), objArray);
          this.q.setMusicPanelEventListener(this.A);
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "2")) {
          return;
       }
       this.z = d.a(-1687636538);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "7")) {
          return;
       }
       h0 tq = this.q;
       if (tq != null) {
          tq.e();
       }
       return;
    }
    public void W8(int p0){
       h0 oh0 = h0.class;
       if (PatchProxy.isSupport(oh0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh0, "4")) {
          return;
       }
       oh0 = this.q;
       if (oh0 != null && oh0.getVisibility() != p0) {
          this.q.setVisibility(p0);
       }
       boolean b = (!p0)? true: false;
       this.s = b;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "1")) {
          return;
       }
       this.r = this.t8("FRAGMENT");
       this.y = this.q8(a.class);
       this.x = this.r8("PROFILE_PAGE_USER");
       return;
    }
}
