package d4c.v;
import com.yxcorp.gifshow.music.utils.kottor.KPresenterV2;
import com.kwai.feature.post.api.music.data.MusicSource;
import tkd.b;
import tkd.d;
import kob.r;
import d4c.v$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.widget.RelativeLayout$LayoutParams;
import androidx.fragment.app.Fragment;
import z5c.o2;
import uh5.e;
import brd.t;
import j5c.c;
import d4c.p;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d4c.o;
import c4c.a;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView;
import d4c.u;
import d4c.s;
import d4c.q;
import d4c.n;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;
import d4c.m;
import android.view.View;
import d4c.c;
import lnc.b9;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.library.widget.viewpager.RecyclerViewPager$c;
import com.kwai.library.widget.viewpager.RecyclerViewPager;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.widget.CollectAnimationView;
import ekd.m1;
import android.widget.ProgressBar;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;
import com.kwai.framework.model.user.User;

public final class v extends KPresenterV2	// class@0020e0
{
    public User A;
    public e0 B;
    public f0 C;
    public final r D;
    public a E;
    public Music F;
    public MusicSource G;
    public b H;
    public b I;
    public b J;
    public final RecyclerViewPager$c K;
    public ViewGroup q;
    public ViewGroup r;
    public RecyclerViewPager s;
    public CollectAnimationView t;
    public ProgressBar u;
    public View v;
    public View w;
    public PublishSubject x;
    public BaseFragment y;
    public c z;

    public void v(MusicSource p0){
       super();
       this.D = d.a(-1687636538);
       this.K = new v$a(this);
       this.G = p0;
    }
    public void E8(){
       v ov = v.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ov, "3")) {
          return;
       }
       RelativeLayout$LayoutParams layoutParams = this.q.getLayoutParams();
       layoutParams.addRule(12);
       if (o2.c(this.y)) {
          layoutParams.bottomMargin = e.c();
       }
       this.X7(this.z.e().subscribe(new p(this)));
       this.q.setLayoutParams(layoutParams);
       if (!PatchProxy.applyVoid(objArray, this, ov, "5")) {
          v tx = this.x;
          if (tx != null) {
             this.X7(tx.subscribe(new o(this)));
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, ov, "7")) {
          a uoa = new a();
          this.E = uoa;
          uoa.g = this.B;
          this.s.setItemAnimator(objArray);
          this.X8();
       }
       if (!PatchProxy.applyVoid(objArray, this, ov, "6")) {
          this.P8(this.D.Lk().subscribe(new u(this)));
          this.P8(this.D.rx().subscribe(new s(this)));
          this.P8(this.D.Pp().subscribe(new q(this)));
       }
       if (!PatchProxy.applyVoid(objArray, this, ov, "10")) {
          this.t.setOnClickListener(new n(this));
          this.t.setVisibility(0);
          this.v.setOnClickListener(new m(this));
          this.w.setOnClickListener(new c(this));
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, v.class, "17")) {
          return;
       }
       b9.a(this.H);
       b9.a(this.I);
       b9.a(this.J);
       return;
    }
    public void W8(int p0){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ov, "4")) {
          return;
       }
       if (this.r.getVisibility() != p0) {
          this.r.setVisibility(p0);
       }
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, v.class, "8")) {
          return;
       }
       v ts = this.s;
       if (ts != null) {
          v tE = this.E;
          if (tE != null) {
             ts.setAdapter(tE);
             this.s.x(this.K);
          }
       }
       return;
    }
    public final void Y8(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "9")) {
          return;
       }
       if (this.F == p0) {
          if (p0.isOffline()) {
             this.t.h();
          }else {
             this.t.setFavoriteState(p0.isFavorited());
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "1")) {
          return;
       }
       ViewGroup viewGroup = m1.f(p0, R.id.piped_music_pannel);
       this.q = viewGroup;
       this.s = m1.f(viewGroup, 0x7f0a34e4);
       this.t = m1.f(this.q, 0x7f0a07c8);
       v tq = this.q;
       this.r = tq;
       this.w = m1.f(tq, 0x7f0a08fb);
       this.u = m1.f(this.q, 0x7f0a32db);
       this.v = m1.f(this.q, 0x7f0a0773);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v.class, "2")) {
          return;
       }
       this.y = this.r8("PROFILE_FRAGMENT");
       this.x = this.t8("PIPED_MUSIC_PANEL_SUBJECT");
       this.z = this.r8("PROFILE_LOAD_STATE");
       this.A = this.q8(User.class);
       return;
    }
}
