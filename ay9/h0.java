package ay9.h0;
import ay9.q;
import com.yxcorp.gifshow.activity.GifshowActivity;
import jh5.a;
import ay9.j0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import i8a.g;
import qp7.x0;
import qp7.b;
import com.kwai.slide.play.detail.information.caption.l;
import android.text.SpannableStringBuilder;
import e8a.d;
import qp7.d;
import com.kwai.robust.PatchProxyResult;
import com.kwai.slide.play.detail.information.caption.j;
import i8a.j;
import java.util.Objects;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vw6.e;
import xw6.a;
import vw6.b;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.StringBuilder;
import i8a.a;
import ay9.d0;
import ay9.c0;
import tyc.s4$a;
import ay9.b0;
import com.yxcorp.gifshow.label.tag.hashtag.PhotoCommonHashTagHelper$a;
import b89.a$b;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.b;
import brd.t;
import i8a.d;
import erd.o;
import ay9.f0;
import erd.g;
import crd.b;
import ay9.h0$a;
import qp7.b1;
import i8a.f;
import java.lang.Runnable;
import t45.c;
import android.os.SystemClock;
import java.util.HashMap;
import qp7.t0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import msd.a;
import java.util.Map;
import ay9.e0;
import lnc.c3$a;
import lnc.c3;
import java.util.List;
import com.kuaishou.android.model.mix.TagItem;
import com.yxcorp.gifshow.rich.RichTextTagUtil;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.l0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Long;
import i8a.b;
import java.lang.Exception;

public class h0 extends q	// class@0002f9
{
    public g L;
    public final j0 M;
    public static final int N;

    public void h0(GifshowActivity p0,a p1){
       super(p0, p1);
       this.M = new j0();
    }
    public void m0(boolean p0){
       h0 oh0 = h0.class;
       if (PatchProxy.isSupport(oh0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh0, "8")) {
          return;
       }
       h0 tL = this.L;
       g og = null;
       if (tL != null) {
          tL.m();
          this.L = og;
       }
       this.E().p(og, og);
       tL = this.M;
       tL.c = -1;
       tL.d = false;
       return;
    }
    public d p0(){
       return this.L;
    }
    public d q(){
       j oj = PatchProxy.apply(null, this, h0.class, "1");
       if (oj != PatchProxyResult.class) {
       }else {
          oj = new j();
       }
       return oj;
    }
    public void s0(){
       d0 a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h0.class, "2")) {
          return;
       }
       q tA = this.A;
       j oj = j.class;
       Objects.requireNonNull(tA);
       q obj = PatchProxy.applyOneRefs(oj, tA, SlidePlayViewModel.class, "84");
       if (obj != patchProxyRe) {
       }else {
          SlidePlayViewModel h = tA.h;
          Objects.requireNonNull(h);
          obj = PatchProxy.applyOneRefs(oj, h, a.class, "28");
          if (obj != patchProxyRe) {
          }else {
             a t = h.t;
             Objects.requireNonNull(t);
             obj = PatchProxy.applyOneRefs(oj, t, b.class, "3");
             if (obj == patchProxyRe) {
                a.p(oj, "tClass");
                Iterator iterator = t.c.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      obj = iterator.next();
                      if (!a.g(obj.getClass(), oj)) {
                         continue ;
                      }
                   }else {
                      obj = objArray;
                   }
                   if (!obj instanceof e) {
                      obj = objArray;
                   }
                }
             }
          }
       }
       g og = obj.f(this.v);
       this.L = og;
       h0 tM = this.M;
       obj = this.v;
       Objects.requireNonNull(tM);
       if (!PatchProxy.applyVoidTwoRefs(obj, og, tM, j0.class, "1")) {
          tM.b = obj;
          tM.a = og;
          if (og.r() != 3) {
             a.c("CaptionShownChecker", obj, "当前页卡已经创建，但是caption还没有准备好！！！，状态:"+og.r());
          }
       }
       h0 tL = this.L;
       a = d0.a;
       c0 uoc0 = new c0(this);
       s4$a uoa = this.o0();
       b0 uob0 = new b0(this);
       Objects.requireNonNull(tL);
       if (!PatchProxy.applyVoidFourRefs(a, uoc0, uoa, uob0, tL, g.class, "1")) {
          tL.a(a, uoc0, uoa);
          tL.u = uob0;
       }
       tL = this.L;
       Objects.requireNonNull(tL);
       t ot = PatchProxy.apply(objArray, tL, g.class, "6");
       if (ot != patchProxyRe) {
       }else {
          ot = tL.q.flatMap(d.b);
       }
       this.j(ot.subscribe(new f0(this)));
       this.i(new h0$a(this));
       return;
    }
    public void x0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h0.class, "4")) {
          return;
       }
       h0 tL = this.L;
       Objects.requireNonNull(tL);
       if (!PatchProxy.applyVoid(objArray, tL, g.class, "4")) {
          c.a(new f(tL));
       }
       return;
    }
    public void y0(){
       if (PatchProxy.applyVoid(null, this, h0.class, "6")) {
          return;
       }
       try{
          if (this.p0() != null) {
             this.p0().i();
          label_0019 :
             long l = SystemClock.elapsedRealtime();
             HashMap hashMap = new HashMap();
             if (this.H().R() != null) {
                hashMap.putAll(this.H().R().invoke());
             }
             hashMap.put("tag_area", "FEED_LEFT_CORNER");
             c3.c(this.x, new e0(this, hashMap));
             Iterator iterator = this.y.iterator();
             while (iterator.hasNext()) {
                String str = RichTextTagUtil.a(iterator.next().mTag);
                if (!TextUtils.x(str)) {
                   u1.u0(3, l0.c(""), l0.b(str));
                }
             }
             long l1 = SystemClock.elapsedRealtime() - l;
             a uoa = a.class;
             if (!PatchProxy.isSupport(uoa) || (!PatchProxy.applyVoidOneRefs(Long.valueOf(l1), null, uoa, "5") && a.a)) {
                c.a(new b(l1));
             }
          }else {
             goto label_0019 ;
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
}
