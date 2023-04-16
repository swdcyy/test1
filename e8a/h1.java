package e8a.h1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e8a.h1$b;
import e8a.h1$c;
import e8a.h1$a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.String;
import kotlin.jvm.internal.a;
import de5.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import e8a.h1$d;
import erd.g;
import crd.b;
import brd.t;
import p5a.e;
import com.kwai.framework.player.core.b$b;
import com.kwai.framework.player.core.b;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import java.util.Set;
import java.lang.Integer;
import android.view.View;
import ekd.m1;
import android.view.ViewGroup;
import sd5.d;
import sd5.c;
import im8.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.y;
import im8.f;

public final class h1 extends PresenterV2	// class@0020b0
{
    public final h1$c A;
    public final h1$a B;
    public a p;
    public QPhoto q;
    public PhotoDetailParam r;
    public BaseFragment s;
    public t t;
    public y u;
    public f v;
    public d w;
    public SlidePlayViewModel x;
    public Bitmap y;
    public final b$b z;

    public void h1(){
       super();
       this.z = new h1$b(this);
       this.A = new h1$c(this);
       this.B = new h1$a(this);
    }
    public static final PhotoDetailParam P8(h1 p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mDetailParam");
       }
       return p0;
    }
    public static final a R8(h1 p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mPlayModule");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h1.class, "3")) {
          return;
       }
       h1 ts = this.s;
       String str = "mFragment";
       if (ts == null) {
          a.S(str);
       }
       Fragment parentFragme = ts.getParentFragment();
       a.m(parentFragme);
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(parentFragme);
       this.x = slidePlayVie;
       if (slidePlayVie != null) {
          h1 ts1 = this.s;
          if (ts1 == null) {
             a.S(str);
          }
          slidePlayVie.P(ts1, this.B);
       }
       ts = this.t;
       if (ts == null) {
          a.S("mSyncPlayerProgressObservable");
       }
       this.X7(ts.subscribe(new h1$d(this)));
       ts = this.p;
       if (ts == null) {
          a.S("mPlayModule");
       }
       ts.getPlayer().w(this.z);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h1.class, "4")) {
          return;
       }
       h1 tp = this.p;
       if (tp == null) {
          a.S("mPlayModule");
       }
       tp.getPlayer().O(this.z);
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, h1.class, "5")) {
          return;
       }
       h1 tq = this.q;
       String str = "mPhoto";
       if (tq == null) {
          a.S(str);
       }
       CommonMeta commonMeta = tq.getCommonMeta();
       if (commonMeta != null) {
          commonMeta.mIsSmallWindowDismissPhoto = false;
       }
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       commonMeta = tq.getCommonMeta();
       if (commonMeta != null) {
          commonMeta.mInitPauseFlags = null;
       }
       tq = this.r;
       if (tq == null) {
          a.S("mDetailParam");
       }
       DetailPlayConfig detailPlayCo = tq.getDetailPlayConfig();
       a.o(detailPlayCo, "mDetailParam.detailPlayConfig");
       detailPlayCo.getInitPauseFlags().remove(Integer.valueOf(1));
       this.y = null;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h1.class, "2")) {
          return;
       }
       ViewGroup viewGroup = m1.f(p0, R.id.texture_view_frame);
       if (viewGroup != null) {
          d uod = c.a(viewGroup);
          this.w = uod;
          a.m(uod);
          this.W7(uod);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h1.class, "1")) {
          return;
       }
       f obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.s = obj;
       obj = this.q8(a.class);
       a.o(obj, "inject\(DetailPlayModule::class.java\)");
       this.p = obj;
       obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.r = obj;
       obj = this.r8("PIP_MODE_SYNC_PLAYER_PROGRESS_OBSERVABLE");
       a.o(obj, "inject\(DetailAccessIds.P¡­AYER_PROGRESS_OBSERVABLE\)");
       this.t = obj;
       obj = this.r8("PIP_MODE_PLAY_INFO_LISTENER_OBSERVER");
       a.o(obj, "inject\(DetailAccessIds.P¡­Y_INFO_LISTENER_OBSERVER\)");
       this.u = obj;
       obj = this.x8("DETAIL_LOGGER");
       a.o(obj, "injectRef\(AccessIds.DETAIL_LOGGER\)");
       this.v = obj;
       return;
    }
}
