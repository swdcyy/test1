package o8a.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b1a.o;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.System;
import java.util.LinkedHashSet;
import b9a.b;
import java.util.ArrayList;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus$d;
import o8a.c$a;
import o8a.c$b;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import e0a.j;
import com.yxcorp.gifshow.entity.QPhoto;
import sy6.a;
import android.app.Activity;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import lnc.a1;
import android.view.View;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.b;
import o8a.c$c;
import android.view.View$OnClickListener;
import usd.q;
import o8a.c$d;
import java.lang.Long;
import java.lang.Runnable;
import ekd.k1;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import u8a.q;
import java.lang.Boolean;
import hf5.b;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import android.view.ViewPropertyAnimator;
import org.greenrobot.eventbus.a;
import e6a.b;
import d6a.f;
import io.reactivex.subjects.PublishSubject;
import k2b.e0;
import hf5.g;

public abstract class c extends PresenterV2	// class@0032d0
{
    public long A;
    public final Set B;
    public boolean C;
    public final b D;
    public List E;
    public final MilanoContainerEventBus$d F;
    public q G;
    public boolean H;
    public final c$a I;
    public final c$b J;
    public final o K;
    public final String p;
    public a q;
    public MilanoContainerEventBus r;
    public e0 s;
    public g t;
    public b u;
    public QPhoto v;
    public List w;
    public View x;
    public SwipeLayout y;
    public boolean z;

    public void c(o p0){
       a.p(p0, "param");
       super();
       this.K = p0;
       this.p = "NasaSerialBaseBottomBarPresenter";
       this.A = System.currentTimeMillis();
       this.B = new LinkedHashSet();
       this.D = new b();
       this.E = new ArrayList();
       this.F = new MilanoContainerEventBus$d();
       this.I = new c$a(this);
       this.J = new c$b(this);
    }
    public static final List P8(c p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("mPopedSerialIds");
       }
       return p0;
    }
    public void E8(){
       c tF;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "16")) {
          return;
       }
       this.b9();
       if (j.f()) {
          tF = this.F;
          c tq = this.q;
          if (tq == null) {
             a.S("mSlidePlayViewModel");
          }
          tF.a = tq.getCurrentPhoto();
          this.E.add(this.J);
       }
       this.y = w9.c(this.getActivity());
       tF = this.x;
       String str = "mSimilarPhotoBottomBarView";
       if (tF == null) {
          a.S(str);
       }
       tF.setBackgroundColor(a1.a(R.color.arg_RES_7f0606b3));
       Activity activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          objArray.i3(this.I);
       }
       tF = this.x;
       if (tF == null) {
          a.S(str);
       }
       tF.setOnClickListener(new c$c(this));
       long l = q.o(0, (((long)150 + this.A) - System.currentTimeMillis()));
       c$d uod = new c$d(this, l);
       k1.p(uod, Long.valueOf(l));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "17")) {
          return;
       }
       Activity activity = this.getActivity();
       if (!activity instanceof GifshowActivity) {
          activity = objArray;
       }
       if (activity != null) {
          activity.s3(this.I);
       }
       c tG = this.G;
       if (tG != null) {
          Activity activity1 = this.getActivity();
          Objects.requireNonNull(activity1, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
          tG.Dd(activity1);
       }
       this.G = objArray;
       this.E.remove(this.J);
       return;
    }
    public final void R8(boolean p0,View p1){
       c ty;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoc, "19")) {
          return;
       }
       uoc = this.y;
       if (uoc != null) {
          uoc.n(p0, 18);
       }
       if (p1 != null) {
          if (p0) {
             if (this.H != null) {
                ty = this.y;
                if (ty != null) {
                   ty.l(p1);
                }
             }
             ty = false;
          }else if(this.H == null){
             ty = this.y;
             if (ty != null) {
                ty.a(p1);
             }
          }
          ty = true;
          this.H = ty;
       }
       return;
    }
    public final b S8(){
       c obj = PatchProxy.apply(null, this, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.u;
       if (obj == null) {
          a.S("mFeedMilanoProtocol");
       }
       return obj;
    }
    public final MilanoContainerEventBus V8(){
       c obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("mMilanoContainerEventBus");
       }
       return obj;
    }
    public final q W8(){
       return this.G;
    }
    public final View X8(){
       c obj = PatchProxy.apply(null, this, c.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.x;
       if (obj == null) {
          a.S("mSimilarPhotoBottomBarView");
       }
       return obj;
    }
    public final a Y8(){
       c obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("mSlidePlayViewModel");
       }
       return obj;
    }
    public final o Z8(){
       return this.K;
    }
    public abstract void a9();
    public abstract void b9();
    public final void c9(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "20")) {
          return;
       }
       float f = (p0)? 0: 0x3f800000;
       uoc = this.x;
       if (uoc == null) {
          a.S("mSimilarPhotoBottomBarView");
       }
       uoc.animate().alpha(f).setDuration(200).start();
       return;
    }
    public abstract void d9();
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "15")) {
          return;
       }
       this.a9();
       return;
    }
    public final void e9(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "21")) {
          return;
       }
       if (p0 != null) {
          this.h9(p0);
          a.d().k(new b(f.c(this.K.m), p0, this.K.r));
          c tr = this.r;
          if (tr == null) {
             a.S("mMilanoContainerEventBus");
          }
          tr.C.onNext(p0);
       }
       return;
    }
    public abstract void h9(QPhoto p0);
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       Object obj = this.q8(e0.class);
       a.o(obj, "inject\(ILogPage::class.java\)");
       this.s = obj;
       obj = this.q8(a.class);
       a.o(obj, "inject\(ISlidePlayProvider::class.java\)");
       this.q = obj;
       obj = this.q8(g.class);
       a.o(obj, "inject\(ScreenMilanoProtocol::class.java\)");
       this.t = obj;
       obj = this.q8(b.class);
       a.o(obj, "inject\(FeedMilanoProtocol::class.java\)");
       this.u = obj;
       obj = this.q8(MilanoContainerEventBus.class);
       a.o(obj, "inject\(MilanoContainerEventBus::class.java\)");
       this.r = obj;
       return;
    }
}
