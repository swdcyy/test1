package by9.h;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import by9.h$a;
import nsd.u;
import com.yxcorp.gifshow.activity.GifshowActivity;
import jh5.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import xq7.d;
import java.util.Objects;
import rp7.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import qp7.a;
import v6a.m0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qp7.b;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import qp7.c;
import ar7.q;
import uw9.l0;
import by9.a;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import ar7.r;
import java.lang.Boolean;
import by9.h$e;
import qp7.b1;
import com.kuaishou.android.model.mix.CoCreateInfo;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.android.model.mix.CoCreateInfo$CoCreateMember;
import lu7.f;
import qp7.x0;
import by9.h$b;
import io.reactivex.internal.functions.Functions;
import crd.b;
import erd.g;
import brd.t;
import by9.h$c;
import by9.h$d;
import qp7.d;
import ar7.n;

public final class h extends DispatchBaseElement	// class@00051f
{
    public QPhoto t;
    public BaseFragment u;
    public PublishSubject v;
    public final GifshowActivity w;
    public static final h$a x;

    static {
       h.x = new h$a(null);
    }
    public void h(GifshowActivity p0,a p1){
       a.p(p0, "activity");
       Objects.requireNonNull(d.J);
       super(d.k, p1);
       this.w = p0;
    }
    public static final BaseFragment n0(h p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public static final QPhoto o0(h p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public void P(a p0){
       a b1;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, h.class, "1")) {
       }else {
          a.p(p0, "callerContext");
          super.P(p0);
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          a.o(mPhoto, "callerContext.mPhotoDetailParam.mPhoto");
          this.t = mPhoto;
          a b = p0.b;
          a.o(b, "callerContext.mFragment");
          this.u = b;
          if (!PatchProxy.applyVoidOneRefsWithListener(p0, this, h.class, "6")) {
             q oq = this.A();
             m0 v = p0.v;
             a uoa = null;
             if (v != null) {
                l0 f2 = v.F2;
                if (f2 != null) {
                   b1 = f2.b;
                label_0045 :
                   oq.d = b1;
                   if (v != null) {
                      l0 f21 = v.F2;
                      if (f21 != null) {
                         uoa = f21.c;
                      }
                   }
                   this.v = uoa;
                   PatchProxy.onMethodExit(h.class, "6");
                }
             }
             b1 = uoa;
             goto label_0045 ;
          }
          PatchProxy.onMethodExit(h.class, "1");
       }
       return;
    }
    public a f0(a p0){
       r or = PatchProxy.applyOneRefs(p0, this, h.class, "5");
       if (or != PatchProxyResult.class) {
       }else {
          or = new r(p0);
       }
       return or;
    }
    public void j0(boolean p0){
       h oh = h.class;
       String str = "2";
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, str)) {
          return;
       }
       this.i(new h$e(this));
       h tt = this.t;
       if (tt == null) {
          a.S("mPhoto");
       }
       CoCreateInfo coCreateInfo = tt.getCoCreateInfo();
       if (coCreateInfo != null) {
          this.c0();
          Iterator iterator = coCreateInfo.mMembers.iterator();
          while (iterator.hasNext()) {
             CoCreateInfo$CoCreateMember uCoCreateMem = iterator.next();
             uCoCreateMem.mAliasName = f.b(String.valueOf(uCoCreateMem.mUserId), uCoCreateMem.mUserName);
          }
          this.E().g(coCreateInfo);
          q oq = this.A();
          h$b uob = new h$b(this);
          g e = Functions.e;
          a.o(e, "Functions.ERROR_CONSUMER");
          Objects.requireNonNull(oq);
          b uob1 = PatchProxy.applyTwoRefs(uob, e, oq, q.class, str);
          if (uob1 != PatchProxyResult.class) {
          }else {
             a.p(uob, "onNext");
             a.p(e, "onError");
             uob1 = oq.a.subscribe(uob, e);
             a.o(uob1, "itemClickSubject.subscribe\(onNext, onError\)");
          }
          this.j(uob1);
          oq = this.A();
          h$c uoc = new h$c(this);
          a.o(e, "Functions.ERROR_CONSUMER");
          Objects.requireNonNull(oq);
          uob1 = PatchProxy.applyTwoRefs(uoc, e, oq, q.class, "4");
          if (uob1 != PatchProxyResult.class) {
          }else {
             a.p(uoc, "onNext");
             a.p(e, "onError");
             uob1 = oq.b.subscribe(uoc, e);
             a.o(uob1, "moreClickSubject.subscribe\(onNext, onError\)");
          }
          this.j(uob1);
          oq = this.A();
          h$d uod = new h$d(coCreateInfo, this);
          a.o(e, "Functions.ERROR_CONSUMER");
          Objects.requireNonNull(oq);
          b uob2 = PatchProxy.applyTwoRefs(uod, e, oq, q.class, "6");
          if (uob2 != PatchProxyResult.class) {
          }else {
             a.p(uod, "onNext");
             a.p(e, "onError");
             uob2 = oq.c.subscribe(uod, e);
             a.o(uob2, "widthChangeSubject.subscribe\(onNext, onError\)");
          }
          this.j(uob2);
       }else {
          this.b0();
       }
       return;
    }
    public d q(){
       n on = PatchProxy.apply(null, this, h.class, "3");
       if (on != PatchProxyResult.class) {
       }else {
          on = new n();
       }
       return on;
    }
    public c r(){
       q oq = PatchProxy.apply(null, this, h.class, "4");
       if (oq != PatchProxyResult.class) {
       }else {
          oq = new q();
       }
       return oq;
    }
}
