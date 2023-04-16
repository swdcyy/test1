package l19.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import l19.d$a;
import l19.d$b;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.PlayEndControlPresenter;
import e09.a;
import b09.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import mxb.c;
import n49.s;
import android.app.Activity;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import ge5.d;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import im8.f;
import p5a.e;
import de5.a;
import l19.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import java.lang.Boolean;
import rf5.u;
import ro5.a;
import uo5.a;
import joc.q;
import a09.b;
import android.graphics.Bitmap;
import com.kwai.framework.player.ui.impl.PlayerKitContentFrame;
import rd5.i;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.screenclean.ScreenCleanController;
import com.kuaishou.commercial.q;
import msd.a;
import android.view.View;
import ekd.m1;
import com.kwai.framework.player.ui.impl.KwaiContentFrame;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class d extends PresenterV2	// class@002c76
{
    public SwipeLayout A;
    public l B;
    public boolean C;
    public boolean D;
    public final a E;
    public c F;
    public d p;
    public KwaiContentFrame q;
    public QPhoto r;
    public a s;
    public PublishSubject t;
    public f u;
    public f v;
    public List w;
    public f x;
    public BaseFragment y;
    public u z;

    public void d(){
       super();
       this.C = false;
       this.D = false;
       this.E = new d$a(this);
       this.F = new d$b(this);
       this.U7(new PlayEndControlPresenter());
       this.U7(new a());
       this.U7(new h());
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       if (!c.W(k.B(this.r)) && !s.I(this.r)) {
          return;
       }
       this.D = false;
       this.A = w9.c(this.getActivity());
       d tp = this.p;
       if (tp != null) {
          this.B = tp.e;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.y.getParentFragment());
       if (slidePlayVie != null) {
          slidePlayVie.P(this.y, this.E);
       }else {
          tp = this.w;
          if (tp != null) {
             tp.add(this.E);
          }
       }
       this.v.set(this.F);
       this.s.getPlayer().addOnInfoListener(new a(this));
       return;
    }
    public final void P8(boolean p0){
       d tB;
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "7")) {
          return;
       }
       int i = 5;
       this.z.F(p0, i);
       a.o(this.y, p0, i);
       uod = this.A;
       if (uod != null) {
          uod.n(p0, 6);
       }
       a.c(this.getActivity(), p0, 2);
       if (p0) {
          tB = this.B;
          if (tB != null) {
             tB.e(2);
          }
       }else {
          tB = this.B;
          if (tB != null) {
             tB.a(2);
          }
       }
       return;
    }
    public void R8(boolean p0,boolean p1,b p2){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, this, d.class, "5")) {
          return;
       }
       if (p2 == null) {
          return;
       }
       if (p0) {
          if (!PatchProxy.applyVoid(null, this, uod, "6")) {
             uod = this.q;
             if (uod != null) {
                this.t.onNext(i.b(uod.C(), false));
             }
          }
          p2.a();
          this.P8(false);
          this.D = true;
       }else if(this.D != null){
          p2.c();
          this.P8(true);
       }
       d tx = this.x;
       if (tx != null && tx.get() != null) {
          if (p0) {
             this.x.get().d(false, 8, q.b);
          }else if(!p1){
             this.x.get().e(false, q.b);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3120);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.r = this.q8(QPhoto.class);
       this.s = this.q8(a.class);
       this.t = this.r8("DETAIL_POSTER_EVENT");
       this.u = this.w8("PHOTO_PLAY_END_CONTROLLER");
       this.v = this.x8("PHOTO_PLAY_END_CLICK_LISTENER");
       this.w = this.t8("DETAIL_ATTACH_LISTENERS");
       this.x = this.x8("thanos_playend_clean_controller");
       this.y = this.r8("DETAIL_FRAGMENT");
       this.z = this.q8(u.class);
       this.p = this.t8("PHOTO_ROOTVIEW_TOUCH_MANAGER");
       return;
    }
}
