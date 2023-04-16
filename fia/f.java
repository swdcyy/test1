package fia.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fia.f$a;
import nsd.u;
import java.util.ArrayList;
import fia.f$c;
import fia.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import cia.w;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import lnc.a1;
import android.view.ViewGroup;
import java.util.Objects;
import java.util.List;
import java.util.Set;
import androidx.viewpager.widget.ViewPager$i;
import tw6.e;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import qrd.p;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import fia.g;
import android.animation.Animator$AnimatorListener;
import qrd.l1;
import android.animation.ValueAnimator;
import fia.h;
import fia.i;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import brd.t;
import fia.f$d;
import erd.g;
import fia.f$e;
import erd.r;
import fia.f$f;
import erd.o;
import fia.f$g;
import fia.f$h;
import kga.c;
import crd.b;
import dha.i;
import fia.f$i;
import fia.f$j;
import fia.f$k;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import fia.f$l;
import fia.f$m;
import com.yxcorp.gifshow.entity.QPhoto;
import bia.d;
import xl8.b;
import bia.g;
import bia.k;
import bia.j;
import cha.a;
import java.lang.Number;

public class f extends PresenterV2	// class@00290a
{
    public ViewStubInflater2 A;
    public f B;
    public i C;
    public ValueAnimator D;
    public ObjectAnimator E;
    public ObjectAnimator F;
    public ObjectAnimator G;
    public View H;
    public List I;
    public int J;
    public int K;
    public boolean L;
    public final e M;
    public final ViewPager$i N;
    public w p;
    public b q;
    public b r;
    public b s;
    public b t;
    public a u;
    public d v;
    public j w;
    public g x;
    public int y;
    public NasaBizParam z;
    public static final f$a O;

    static {
       f.O = new f$a(null);
    }
    public void f(){
       super();
       this.I = new ArrayList();
       this.J = -1;
       this.K = -1;
       this.M = new f$c(this);
       this.N = new f$b(this);
    }
    public void E8(){
       f tA;
       SlidePlayViewModel slidePlayVie;
       g a;
       SlidePlayViewModel slidePlayVie1;
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "25")) {
          return;
       }
       if (this.P8()) {
          tA = this.A;
          if (tA == null) {
             a.S("mNasaCommentStubInflater");
          }
          View view = tA.b(R.id.bottom_comment_layout);
          a.o(view, "mNasaCommentStubInflater¡­id.bottom_comment_layout\)");
          this.H = view;
       }
       tA = this.z;
       String str = "mNasaBizParam";
       if (tA == null) {
          a.S(str);
       }
       NasaSlideParam nasaSlidePar = tA.getNasaSlideParam();
       int i = 1;
       if (nasaSlidePar != null && nasaSlidePar.isFollowNasaDetail() == i) {
          tA = this.p;
          if (tA == null) {
             a.S("mFollowSlideInjectAdapter");
          }
          slidePlayVie = tA.O();
          if (slidePlayVie != null) {
             VerticalViewPager verticalView = slidePlayVie.s2();
             if (verticalView != null) {
                verticalView.setBackgroundColor(a1.a(R.color.arg_RES_7f0619b1));
             }
          }
       }
    label_005e :
       tA = this.p;
       if (tA == null) {
          a.S("mFollowSlideInjectAdapter");
       }
       f tB = this.B;
       if (tB == null) {
          a.S("mSwipeProfileInterceptorWrapper");
       }
       Objects.requireNonNull(tA);
       if (!PatchProxy.applyVoidOneRefs(tB, tA, w.class, "7")) {
          w k = tA.k;
          if (k != null) {
             k.add(tB);
          }else if(tA.f != null){
             tA.m.add(tB);
          }
       }
       tA = this.p;
       if (tA == null) {
          a.S("mFollowSlideInjectAdapter");
       }
       slidePlayVie = tA.O();
       if (slidePlayVie != null) {
          slidePlayVie.i(this.N);
       }
       tA = this.p;
       if (tA == null) {
          a.S("mFollowSlideInjectAdapter");
       }
       slidePlayVie = tA.O();
       if (slidePlayVie != null) {
          slidePlayVie.c0(this.M);
       }
       if (this.K == -1) {
          tA = this.z;
          if (tA == null) {
             a.S(str);
          }
          nasaSlidePar = tA.getNasaSlideParam();
          boolean i1 = (nasaSlidePar != null && nasaSlidePar.isFollowNasaDetail() == i)? this.y + n.A(a.B): this.y;
          this.K = i1;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          FollowConfigUtil uFollowConfi = FollowConfigUtil.class;
          String obj = PatchProxy.apply(objArray, objArray, uFollowConfi, "47");
          if (obj != patchProxyRe) {
             i1 = obj.booleanValue();
          }else {
             FollowConfigUtil z = FollowConfigUtil.z;
             Objects.requireNonNull(z);
             Boolean uBoolean = PatchProxy.apply(objArray, z, uFollowConfi, "2");
             if (uBoolean == patchProxyRe) {
                uBoolean = FollowConfigUtil.b.getValue();
             }
             if (uBoolean.booleanValue() && FollowConfigUtil.i()) {
                i1 = true;
             }else {
                i1 = false;
             }
          }
          if (i1) {
             this.K = this.K + a1.e(0x41f00000);
          }
          if (!PatchProxy.applyVoid(objArray, this, uof, "28")) {
             uof = this.p;
             if (uof == null) {
                a.S("mFollowSlideInjectAdapter");
             }
             slidePlayVie1 = uof.O();
             if (slidePlayVie1 != null) {
                objArray = slidePlayVie1.s2();
             }
             float[] uofloatArray = new float[i];
             uofloatArray[0] = (float)this.K;
             ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(objArray, View.TRANSLATION_Y, uofloatArray);
             String str1 = "this";
             a.o(objectAnimat, str1);
             long l = 300;
             objectAnimat.setDuration(l);
             objectAnimat.setInterpolator(new AccelerateDecelerateInterpolator());
             objectAnimat.addListener(new g(this));
             a.o(objectAnimat, "ObjectAnimator.ofFloat\(m¡­\n        }\n      }\)\n    }");
             this.E = objectAnimat;
             ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
             a.o(valueAnimato, str1);
             valueAnimato.setDuration(l);
             valueAnimato.setInterpolator(new AccelerateDecelerateInterpolator());
             valueAnimato.addListener(new h(this));
             valueAnimato.addUpdateListener(new i(this));
             a.o(valueAnimato, "ValueAnimator.ofFloat\(1f¡­t\(\) * value\n      }\n    }");
             this.D = valueAnimato;
             if (this.P8()) {
                uof = this.H;
                obj = "mBottomCommentParent";
                if (uof == null) {
                   a.S(obj);
                }
                float[] uofloatArray1 = new float[i];
                uofloatArray1[0] = (float)this.K;
                objectAnimat = ObjectAnimator.ofFloat(uof, View.TRANSLATION_Y, uofloatArray1);
                a.o(objectAnimat, str1);
                objectAnimat.setDuration(l);
                objectAnimat.setInterpolator(new AccelerateDecelerateInterpolator());
                a.o(objectAnimat, "ObjectAnimator.ofFloat\(m¡­ateInterpolator\(\)\n      }");
                this.G = objectAnimat;
                uof = this.H;
                if (uof == null) {
                   a.S(obj);
                }
                float[] uofloatArray2 = new float[i];
                uofloatArray2[0] = 0;
                objectAnimat = ObjectAnimator.ofFloat(uof, View.TRANSLATION_Y, uofloatArray2);
                a.o(objectAnimat, str1);
                objectAnimat.setDuration(l);
                objectAnimat.setInterpolator(new AccelerateDecelerateInterpolator());
                a.o(objectAnimat, "ObjectAnimator.ofFloat\(m¡­ateInterpolator\(\)\n      }");
                this.F = objectAnimat;
             }
          }
       }
    label_01ef :
       a = c.a;
       this.X7(this.Y8().doOnNext(new f$d(this)).filter(f$e.b).map(f$f.b).doOnNext(new f$g(this)).subscribe(new f$h(this), a));
       uof = this.C;
       if (uof == null) {
          a.S("mUserFollowState");
       }
       this.X7(uof.b().filter(f$i.b).filter(new f$j(this)).map(f$k.b).distinctUntilChanged().delay(100, TimeUnit.MILLISECONDS, d.c).observeOn(d.a).subscribe(new f$l(this), a));
       if (this.L != null) {
          this.L = false;
          uof = this.p;
          if (uof == null) {
             a.S("mFollowSlideInjectAdapter");
          }
          slidePlayVie1 = uof.O();
          if (slidePlayVie1 != null) {
             slidePlayVie1.W(false);
          }
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, f.class, "21")) {
          return;
       }
       this.C = new i();
       this.B = new f$m(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "30")) {
          return;
       }
       f tp = this.p;
       String str = "mFollowSlideInjectAdapter";
       if (tp == null) {
          a.S(str);
       }
       f tB = this.B;
       if (tB == null) {
          a.S("mSwipeProfileInterceptorWrapper");
       }
       Objects.requireNonNull(tp);
       if (!PatchProxy.applyVoidOneRefs(tB, tp, w.class, "8")) {
          w k = tp.k;
          if (k != null) {
             k.remove(tB);
          }else {
             tp.m.remove(tB);
          }
       }
       tp = this.p;
       if (tp == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = tp.O();
       if (slidePlayVie != null) {
          slidePlayVie.g(this.N);
       }
       tp = this.p;
       if (tp == null) {
          a.S(str);
       }
       slidePlayVie = tp.O();
       if (slidePlayVie != null) {
          slidePlayVie.d0(this.M);
       }
       return;
    }
    public final boolean P8(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       Object obj = PatchProxy.apply(null, this, uof, "22");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!FollowConfigUtil.i()) {
          Object obj1 = PatchProxy.apply(null, this, uof, "23");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             f tp = this.p;
             if (tp == null) {
                a.S("mFollowSlideInjectAdapter");
             }
             SlidePlayViewModel slidePlayVie = tp.O();
             if (slidePlayVie != null && slidePlayVie.G0(slidePlayVie.M(slidePlayVie.getCurrentPhoto())) == 41) {
                b1 = true;
             }else {
                b1 = false;
             }
          }
          if (!b1) {
          label_0051 :
             return b;
          }
       }
       b = false;
       goto label_0051 ;
    }
    public final w R8(){
       f obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("mFollowSlideInjectAdapter");
       }
       return obj;
    }
    public final d S8(){
       f obj = PatchProxy.apply(null, this, f.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj == null) {
          a.S("mLiveTipsEntranceState");
       }
       return obj;
    }
    public final b V8(){
       f obj = PatchProxy.apply(null, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("mPymiContainerVisibleObservableData");
       }
       return obj;
    }
    public final g W8(){
       f obj = PatchProxy.apply(null, this, f.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.x;
       if (obj == null) {
          a.S("mSwipeProfileState");
       }
       return obj;
    }
    public final boolean X8(){
       boolean b;
       f obj = PatchProxy.apply(null, this, f.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p;
       if (obj == null) {
          a.S("mFollowSlideInjectAdapter");
       }
       SlidePlayViewModel slidePlayVie = obj.O();
       a.m(slidePlayVie);
       a.o(slidePlayVie, "mFollowSlideInjectAdapter.slidePlayViewModel!!");
       if (k.a(slidePlayVie)) {
          obj = this.z;
          if (obj == null) {
             a.S("mNasaBizParam");
          }
          if (obj.getNasaSlideParam().mEnableLiveSlidePlay != null) {
             b = true;
          label_0043 :
             return b;
          }
       }
       b = false;
       goto label_0043 ;
    }
    public t Y8(){
       f obj = PatchProxy.apply(null, this, f.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("mPymiTipsShowResponseObservableData");
       }
       return obj.observable();
    }
    public final void Z8(){
       f tv;
       if (PatchProxy.applyVoid(null, this, f.class, "20")) {
          return;
       }
       boolean b = true;
       String str = "mFollowViewPagerState";
       String str1 = "mLiveTipsEntranceState";
       if (!this.X8()) {
          tv = this.v;
          if (tv == null) {
             a.S(str1);
          }
          if (tv.b() <= 0) {
             tv = this.v;
             if (tv == null) {
                a.S(str1);
             }
             tv.e(false);
          }else {
             tv = this.v;
             if (tv == null) {
                a.S(str1);
             }
             f tw = this.w;
             if (tw == null) {
                a.S("mFollowScreenState");
             }
             if (tw.b()) {
                tw = this.u;
                if (tw == null) {
                   a.S(str);
                }
                if (tw.b()) {
                label_0055 :
                   tv.e(b);
                }
             }
             b = false;
             goto label_0055 ;
          }
       }else {
          tv = this.u;
          if (tv == null) {
             a.S(str);
          }
          this.L = tv.b() ^ b;
          tv = this.v;
          if (tv == null) {
             a.S(str1);
          }
          tv.e(false);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       Object obj = this.r8("PYMI_RESPONSE_DATA");
       a.o(obj, "inject\(FollowAccessIds.PYMI_RESPONSE_DATA\)");
       this.q = obj;
       obj = this.r8("PYMI_CONTAINER_VISIBLE");
       a.o(obj, "inject\(FollowAccessIds.PYMI_CONTAINER_VISIBLE\)");
       this.r = obj;
       this.s = this.t8("PYMI_CONTAINER_EXPAND");
       this.t = this.t8("PYMI_CONTAINER_COLLAPSE");
       obj = this.r8("NIRVANA_FOLLOW_VIEW_PAGER_STATE");
       a.o(obj, "inject\(FollowAccessIds.N¡­_FOLLOW_VIEW_PAGER_STATE\)");
       this.u = obj;
       obj = this.r8("NIRVANA_FOLLOW_LIVE_TIPS_ENTRANCE_STATE");
       a.o(obj, "inject\(FollowAccessIds.N¡­LIVE_TIPS_ENTRANCE_STATE\)");
       this.v = obj;
       obj = this.r8("NIRVANA_FOLLOW_SCREEN_STATE");
       a.o(obj, "inject\(FollowAccessIds.N¡­VANA_FOLLOW_SCREEN_STATE\)");
       this.w = obj;
       obj = this.r8("NIRVANA_SWIPE_PROFILE");
       a.o(obj, "inject\(FollowAccessIds.NIRVANA_SWIPE_PROFILE\)");
       this.x = obj;
       obj = this.r8("NIRVANA_VIEWPAGER_TRANSLATION_Y_OFFSET");
       a.o(obj, "inject\(FollowAccessIds.N¡­GER_TRANSLATION_Y_OFFSET\)");
       this.y = obj.intValue();
       obj = this.q8(NasaBizParam.class);
       a.o(obj, "inject\(NasaBizParam::class.java\)");
       this.z = obj;
       obj = this.r8("NASA_BOTTOM_COMMENT_VIEW_STUB");
       a.o(obj, "inject\(AccessIds.NASA_BOTTOM_COMMENT_VIEW_STUB\)");
       this.A = obj;
       obj = this.q8(w.class);
       a.o(obj, "inject\(FollowSlideInjectAdapter::class.java\)");
       this.p = obj;
       return;
    }
}
