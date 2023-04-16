package com.yxcorp.gifshow.detail.slideplay.presenter.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.ArrayList;
import com.yxcorp.gifshow.detail.slideplay.presenter.b$a;
import com.yxcorp.gifshow.detail.slideplay.presenter.b$b;
import com.yxcorp.gifshow.detail.slideplay.presenter.b$c;
import com.yxcorp.gifshow.detail.slideplay.presenter.b$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import uc6.c;
import sd5.d;
import android.view.View;
import vy6.a;
import java.util.List;
import jta.c;
import r7a.f;
import e7a.k;
import erd.g;
import crd.b;
import xx9.a;
import com.yxcorp.gifshow.entity.QPhoto;
import kp.r1;
import ln6.b;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.detail.slideplay.presenter.a;
import com.gifshow.tuna.player.poi.e;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import ekd.m1;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup;
import sd5.c;
import im8.a;
import brd.t;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import uw9.u3;

public class b extends PresenterV2	// class@001840
{
    public f A;
    public a B;
    public SlidePlayViewModel C;
    public BaseFragment D;
    public a E;
    public u3 F;
    public b G;
    public List H;
    public boolean I;
    public final a J;
    public final c K;
    public final t0 L;
    public final ViewPager$i M;
    public FrameLayout p;
    public FrameLayout q;
    public View r;
    public View s;
    public View t;
    public View u;
    public KwaiImageView v;
    public d w;
    public QPhoto x;
    public t y;
    public List z;

    public void b(){
       super();
       this.H = new ArrayList();
       this.J = new b$a(this);
       this.K = new b$b(this);
       this.L = new b$c(this);
       this.M = new b$d(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.C = SlidePlayViewModel.B0(this.D.getParentFragment());
       this.u = this.w.N().m();
       b tC = this.C;
       if (tC != null) {
          tC.P(this.D, this.J);
       }else {
          tC = this.z;
          if (tC != null) {
             tC.add(this.J);
          }
       }
       this.A.a(this.K);
       this.H.add(this.L);
       this.X7(this.B.h(new k(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       this.A.c(this.K);
       this.H.remove(this.L);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       int interactStic = this.x.getInteractStickerType();
       if (interactStic && (r1.A2(this.x) || this.I != null)) {
          Object[] objArray = new Object[0];
          o.C().w("SlidePlayInteractStickerStickerPresenter", "不展示交互贴纸:"+interactStic+"---"+r1.A2(this.x), objArray);
          return;
       }else {
          this.I = true;
          this.G = y6.s(b.class, LoadPolicy.SILENT_IF_DOWNLOADED).G(d.a).R(new a(this, interactStic), e.b);
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a30f6);
       this.q = m1.f(p0, 0x7f0a3e7f);
       this.r = m1.f(p0, 0x7f0a153b);
       this.v = m1.f(p0, 0x7f0a319f);
       this.s = m1.f(p0, 0x7f0a1135);
       this.t = m1.f(p0, 0x7f0a1123);
       d uod = c.a(m1.f(p0, R.id.texture_view_frame));
       this.w = uod;
       this.W7(uod);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.x = this.q8(QPhoto.class);
       this.y = this.r8("DETAIL_PROCESS_EVENT");
       this.z = this.t8("DETAIL_ATTACH_LISTENERS");
       this.A = this.r8("NASA_SIDEBAR_STATUS");
       this.D = this.r8("DETAIL_FRAGMENT");
       this.F = this.q8(u3.class);
       this.B = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       this.H = this.r8("SLIDE_PLAY_COMMENT_PANEL_STATE_LISTENER_LIST");
       return;
    }
}
