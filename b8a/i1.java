package b8a.i1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import rd5.e;
import b8a.i1$b;
import b8a.i1$c;
import b8a.i1$a;
import de5.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import p5a.e;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import ekd.y0;
import java.lang.Long;
import brd.y;
import com.yxcorp.gifshow.util.rx.RxBus;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class i1 extends PresenterV2	// class@0003b2
{
    public final a A;
    public a p;
    public PublishSubject q;
    public y r;
    public y s;
    public BaseFragment t;
    public int u;
    public SlidePlayViewModel v;
    public y0 w;
    public final e x;
    public final IMediaPlayer$OnInfoListener y;
    public final b$b z;

    public void i1(){
       super();
       this.x = new e();
       this.y = new i1$b(this);
       this.z = new i1$c(this);
       this.A = new i1$a(this);
    }
    public static final a P8(i1 p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mDetailPlayModule");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i1.class, "2")) {
          return;
       }
       i1 tp = this.p;
       if (tp == null) {
          a.S("mDetailPlayModule");
       }
       e player = tp.getPlayer();
       if (player != null) {
          player.addOnInfoListener(this.y);
       }
       tp = this.t;
       String str = "mFragment";
       if (tp == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tp.requireParentFragment());
       a.o(slidePlayVie, "SlidePlayViewModel.get\(m¡­.requireParentFragment\(\)\)");
       this.v = slidePlayVie;
       if (slidePlayVie == null) {
          a.S("mSlidePlayViewModel");
       }
       i1 tt = this.t;
       if (tt == null) {
          a.S(str);
       }
       slidePlayVie.P(tt, this.A);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i1.class, "3")) {
          return;
       }
       i1 tp = this.p;
       if (tp == null) {
          a.S("mDetailPlayModule");
       }
       e player = tp.getPlayer();
       if (player != null) {
          player.removeOnInfoListener(this.y);
       }
       this.u = 0;
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, i1.class, "5")) {
          return;
       }
       i1 tw = this.w;
       if (tw != null && tw.c() == true) {
          tw = this.p;
          if (tw == null) {
             a.S("mDetailPlayModule");
          }
          e player = tw.getPlayer();
          String str = "mDetailPlayModule.player";
          a.o(player, str);
          long currentPosit = player.getCurrentPosition();
          tw = this.p;
          if (tw == null) {
             a.S("mDetailPlayModule");
          }
          player = tw.getPlayer();
          a.o(player, str);
          long duration = player.getDuration();
          if (!duration - null) {
             return;
          }else {
             i1 tr = this.r;
             if (tr == null) {
                a.S("mDetailPlayedTimeDown");
             }
             tr.onNext(Long.valueOf((duration - currentPosit)));
             tr = this.s;
             if (tr == null) {
                a.S("mDetailPlayedProgress");
             }
             tr.onNext(Long.valueOf(currentPosit));
             tr = this.x;
             tr.b = duration;
             tr.a = currentPosit;
             RxBus.f.b(tr);
          }
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, i1.class, "6")) {
          return;
       }
       i1 tw = this.w;
       if (tw != null) {
          tw.d();
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, i1.class, "7")) {
          return;
       }
       i1 tw = this.w;
       if (tw != null) {
          tw.e();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i1.class, "1")) {
          return;
       }
       Object obj = this.q8(a.class);
       a.o(obj, "inject\(DetailPlayModule::class.java\)");
       this.p = obj;
       obj = this.r8("DETAIL_PLAY_END_COUNT_OBSERVER");
       a.o(obj, "inject\(DetailAccessIds.D¡­_PLAY_END_COUNT_OBSERVER\)");
       this.q = obj;
       obj = this.r8("DETAIL_PLAY_TIME_DOWN_OBSERVER");
       a.o(obj, "inject\(DetailAccessIds.D¡­_PLAY_TIME_DOWN_OBSERVER\)");
       this.r = obj;
       obj = this.r8("DETAIL_PLAY_PROGRESS_OBSERVER");
       a.o(obj, "inject\(DetailAccessIds.D¡­L_PLAY_PROGRESS_OBSERVER\)");
       this.s = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.t = obj;
       return;
    }
}
