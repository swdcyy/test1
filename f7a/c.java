package f7a.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f7a.c$a;
import nsd.u;
import java.util.concurrent.atomic.AtomicReference;
import f7a.c$c;
import f7a.c$b;
import f7a.c$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import f7a.c$e;
import erd.g;
import crd.b;
import brd.t;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import android.app.Activity;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import android.view.View;
import ekd.c;
import com.kwai.component.tabs.panel.a;
import com.yxcorp.utility.Log;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import z1.k;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.lang.Boolean;
import rf5.u;
import ro5.a;
import uo5.a;
import joc.a0;
import ge5.d;
import joc.z;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import im8.f;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import de5.a;
import brd.y;

public final class c extends PresenterV2	// class@0022e0
{
    public SwipeLayout A;
    public d B;
    public a C;
    public final AtomicReference D;
    public boolean E;
    public final c$c F;
    public final t0 G;
    public final c$d H;
    public PublishSubject p;
    public y q;
    public BaseFragment r;
    public QPhoto s;
    public a t;
    public List u;
    public SlidePlayViewModel v;
    public f w;
    public PublishSubject x;
    public MilanoContainerEventBus y;
    public u z;
    public static final c$a I;

    static {
       c.I = new c$a(null);
    }
    public void c(){
       super();
       this.D = new AtomicReference();
       this.F = new c$c(this);
       this.G = new c$b(this);
       this.H = new c$d(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       c tp = this.p;
       if (tp == null) {
          a.S("mShowAiTextDialogPublisher");
       }
       this.X7(tp.subscribe(new c$e(this)));
       tp = this.r;
       String str = "mFragment";
       if (tp == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tp.getParentFragment());
       a.o(slidePlayVie, "SlidePlayViewModel.get\(mFragment.parentFragment\)");
       this.v = slidePlayVie;
       if (slidePlayVie == null) {
          a.S("mSlidePlayViewModel");
       }
       c tr = this.r;
       if (tr == null) {
          a.S(str);
       }
       slidePlayVie.P(tr, this.F);
       tp = this.u;
       if (tp == null) {
          a.S("mAnimationListeners");
       }
       tp.add(this.G);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.A = w9.c(this.getActivity());
       Activity activity = this.getActivity();
       if (activity != null) {
          View view = activity.findViewById(R.id.ai_text_container);
          if (view != null) {
             c.c(view, "ai_text");
          }
       }
       return;
    }
    public void J8(){
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "4")) {
          return;
       }
       c tu = this.u;
       if (tu == null) {
          a.S("mAnimationListeners");
       }
       tu.remove(this.G);
       if (!PatchProxy.applyVoid(null, this, uoc, "8")) {
          this.D.set(null);
          uoc = this.C;
          if (uoc != null && uoc.d()) {
             uoc.j(false);
          }
          this.C = null;
       }
       return;
    }
    public final void P8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "9")) {
          return;
       }
       Log.g("SlideAiTextP", "close AiTextPanel");
       c tC = this.C;
       a.m(tC);
       tC.j(true);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "QUIT_VIDEOTOTEXT";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("quit_type", p0);
       if (this.D.get() != null) {
          jsonObject.a0("depth", this.D.get().get());
       }
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       c ts = this.s;
       if (ts == null) {
          a.S("mPhoto");
       }
       uContentPack.photoPackage = w1.f(ts.getEntity());
       c tr = this.r;
       if (tr == null) {
          a.S("mFragment");
       }
       u1.M("", tr, 1, uElementPack, uContentPack, null);
       return;
    }
    public final void R8(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "12")) {
          return;
       }
       uoc = this.v;
       if (uoc == null) {
          a.S("mSlidePlayViewModel");
       }
       uoc.d(p0, 27);
       uoc = this.z;
       if (uoc != null) {
          uoc.F(p0, 2);
       }
       uoc = this.r;
       if (uoc == null) {
          a.S("mFragment");
       }
       a.o(uoc, p0, 6);
       uoc = this.A;
       if (uoc != null) {
          uoc.n(p0, 27);
       }
       a.c(this.getActivity(), p0, 22);
       uoc = this.B;
       if (uoc != null) {
          a0 uoa0 = uoc.b();
          if (uoa0 != null) {
             if (p0) {
                uoa0.g(27);
             }else {
                uoa0.a(27);
             }
          }
       }
       uoc = this.C;
       if (uoc != null) {
          uoc.l((p0 ^ 0x01));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       f obj = this.r8("SLIDE_PLAY_SHOW_AI_TEXT_DIALOG");
       a.o(obj, "inject\(AccessIds.SLIDE_PLAY_SHOW_AI_TEXT_DIALOG\)");
       this.p = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.r = obj;
       obj = this.x8("DETAIL_LOGGER");
       a.o(obj, "injectRef\(AccessIds.DETAIL_LOGGER\)");
       this.w = obj;
       Object obj1 = this.r8("DETAIL_SLIDE_AI_TEXT_FRAGMENT_VISIBLE");
       a.o(obj1, "inject\(AccessIds.DETAIL_¡­AI_TEXT_FRAGMENT_VISIBLE\)");
       this.x = obj1;
       this.y = this.s8(MilanoContainerEventBus.class);
       obj1 = this.r8("SLIDE_PLAY_AI_TEXT_PANEL_STATE_LISTENER_LIST");
       a.o(obj1, "inject\(AccessIds.SLIDE_P¡­ANEL_STATE_LISTENER_LIST\)");
       this.u = obj1;
       obj1 = this.q8(QPhoto.class);
       a.o(obj1, "inject\(QPhoto::class.java\)");
       this.s = obj1;
       obj1 = this.q8(a.class);
       a.o(obj1, "inject\(DetailPlayModule::class.java\)");
       this.t = obj1;
       this.z = this.q8(u.class);
       this.B = this.t8("PHOTO_ROOTVIEW_TOUCH_MANAGER");
       this.q = this.t8("ENABLE_PICTURE_IN_PICTURE_MODE_OBSERVER");
       return;
    }
}
