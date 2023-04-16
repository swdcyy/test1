package b8a.s2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b8a.s2$a;
import nsd.u;
import b8a.s2$c;
import b8a.s2$d;
import com.yxcorp.gifshow.homepage.SlidePlayNextGuideConfig;
import java.lang.String;
import kotlin.jvm.internal.a;
import s4a.g;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c$b;
import android.app.Activity;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import uw9.c;
import qvb.q;
import vy6.a;
import b8a.s2$e;
import erd.g;
import crd.b;
import brd.t;
import b8a.s2$f;
import b8a.s2$g;
import b8a.s2$h;
import b8a.s2$i;
import b8a.s2$j;
import b8a.s2$k;
import java.lang.Boolean;
import b8a.s2$b;
import java.lang.reflect.Type;
import el.a;
import java.util.List;
import java.lang.Long;
import java.lang.System;
import java.util.Iterator;
import java.lang.Iterable;
import uw9.v3;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.feed.BaseFeed;
import lnc.i3;
import java.lang.Integer;
import kzc.f;
import cg6.b;
import com.kwai.library.widget.popup.common.a;
import com.kwai.library.widget.popup.common.c;
import xx9.a;
import b8a.s2$l;
import s4a.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import b8a.t2;
import java.util.ArrayList;
import km8.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import f9a.b;
import k2b.u1;
import de5.a;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class s2 extends PresenterV2	// class@0003f2
{
    public PublishSubject A;
    public PublishSubject B;
    public a C;
    public t D;
    public String E;
    public String F;
    public String G;
    public boolean H;
    public boolean I;
    public boolean J;
    public String K;
    public final a L;
    public final q M;
    public String p;
    public t q;
    public t r;
    public a s;
    public PublishSubject t;
    public BaseFragment u;
    public SlidePlayViewModel v;
    public QPhoto w;
    public SlidePlayNextGuideConfig x;
    public g y;
    public PublishSubject z;
    public static final s2$a N;

    static {
       s2.N = new s2$a(null);
    }
    public void s2(){
       super();
       this.p = "mr";
       this.L = new s2$c(this);
       this.M = new s2$d(this);
    }
    public static final SlidePlayNextGuideConfig P8(s2 p0){
       p0 = p0.x;
       if (p0 == null) {
          a.S("mSlidePlayNextGuideConfig");
       }
       return p0;
    }
    public static final g R8(s2 p0){
       p0 = p0.y;
       if (p0 == null) {
          a.S("mSlidePlaySwitchNextGuidePopup");
       }
       return p0;
    }
    public void E8(){
       SlidePlayNextGuideConfig mSlideShareN;
       Object[] objArray1;
       s2 os2 = s2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, os2, "2")) {
          return;
       }
       Activity activity = this.getActivity();
       a.m(activity);
       c$b uob = new c$b(activity);
       if (NasaExperimentUtils.O().getMSlideShareNextGuideConfig() != null) {
          s2 tw = this.w;
          if (tw == null) {
             a.S("mPhoto");
          }
          CommonMeta commonMeta = tw.getCommonMeta();
          commonMeta = (commonMeta != null)? commonMeta.mSourcePhotoPage: objArray;
          if (a.g(commonMeta, this.p)) {
             mSlideShareN = NasaExperimentUtils.O().getMSlideShareNextGuideConfig();
             a.m(mSlideShareN);
          label_004d :
             this.x = mSlideShareN;
             s2 tx = this.x;
             if (tx == null) {
                a.S("mSlidePlayNextGuideConfig");
             }
             long l = tx.getMRetentionTime() * (long)1000;
             tx = this.x;
             if (tx == null) {
                a.S("mSlidePlayNextGuideConfig");
             }
             boolean b = (tx.getMRetentionTime() <= 0)? true: false;
             this.y = new g(uob, l, b);
             s2 tu = this.u;
             if (tu == null) {
                a.S("mFragment");
             }
             SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tu.requireParentFragment());
             a.o(slidePlayVie, "SlidePlayViewModel.get\(m¡­.requireParentFragment\(\)\)");
             this.v = slidePlayVie;
             if (slidePlayVie == null) {
                a.S("mSlidePlayViewModel");
             }
             s2 tw1 = this.w;
             if (tw1 == null) {
                a.S("mPhoto");
             }
             if (!slidePlayVie.R0(tw1)) {
                tu = this.v;
                if (tu == null) {
                   a.S("mSlidePlayViewModel");
                }
                if (!tu.I()) {
                label_00b6 :
                   tu = this.v;
                   if (tu == null) {
                      a.S("mSlidePlayViewModel");
                   }
                   tw1 = this.w;
                   if (tw1 == null) {
                      a.S("mPhoto");
                   }
                   if (tu.R0(tw1) != 1) {
                      tu = this.v;
                      if (tu == null) {
                         a.S("mSlidePlayViewModel");
                      }
                      tw1 = this.w;
                      if (tw1 == null) {
                         a.S("mPhoto");
                      }
                      if (tu.R0(tw1) <= 1) {
                         Object obj = PatchProxy.apply(objArray, this, os2, "12");
                         int i = (obj != PatchProxyResult.class)? obj.intValue(): c.r();
                         s2 tx1 = this.x;
                         if (tx1 == null) {
                            a.S("mSlidePlayNextGuideConfig");
                         }
                         if (i < tx1.mMaxShowNumber) {
                            this.V8();
                            os2 = this.v;
                            if (os2 == null) {
                               a.S("mSlidePlayViewModel");
                            }
                            os2.e(this.M);
                            os2 = this.v;
                            if (os2 == null) {
                               a.S("mSlidePlayViewModel");
                            }
                            tx1 = this.u;
                            if (tx1 == null) {
                               a.S("mFragment");
                            }
                            os2.P(tx1, this.L);
                            os2 = this.x;
                            if (os2 == null) {
                               a.S("mSlidePlayNextGuideConfig");
                            }
                            if (os2.getMStartTime()) {
                               os2 = this.t;
                               if (os2 == null) {
                                  a.S("mDetailPlayedCount");
                               }
                               this.X7(os2.subscribe(new s2$e(this)));
                               os2 = this.r;
                               if (os2 == null) {
                                  a.S("mDetailPlayedProgress");
                               }
                               this.X7(os2.subscribe(new s2$f(this)));
                            }else {
                               os2 = this.q;
                               if (os2 == null) {
                                  a.S("mDetailPlayedTimeDown");
                               }
                               this.X7(os2.subscribe(new s2$g(this)));
                            }
                            os2 = this.z;
                            if (os2 == null) {
                               a.S("mCommentFragmentVisiblePublisher");
                            }
                            this.X7(os2.subscribe(new s2$h(this)));
                            os2 = this.A;
                            if (os2 == null) {
                               a.S("mAiTextFragmentVisiblePublisher");
                            }
                            this.X7(os2.subscribe(new s2$i(this)));
                            os2 = this.B;
                            if (os2 == null) {
                               a.S("mSurveyShowEvent");
                            }
                            this.X7(os2.subscribe(new s2$j(this)));
                            os2 = this.D;
                            if (os2 == null) {
                               a.S("mPreparePipModeObserver");
                            }
                            this.X7(os2.subscribe(new s2$k(this)));
                         }
                      }
                   }
                }
             }else {
                goto label_00b6 ;
             }
          label_01c3 :
             return;
          }
       }
       mSlideShareN = NasaExperimentUtils.O();
       goto label_004d ;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, s2.class, "13")) {
          return;
       }
       s2 tv = this.v;
       if (tv == null) {
          a.S("mSlidePlayViewModel");
       }
       tv.b(this.M);
       return;
    }
    public final boolean S8(){
       s2 obj1;
       int i;
       Iterator obj2;
       boolean b1;
       boolean b2;
       s2 tv1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       s2 os2 = s2.class;
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, this, os2, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = c.s(new s2$b().getType());
       boolean b = true;
       if (this.J == null) {
          long l = 0x5265c00;
          if (PatchProxy.isSupport(os2)) {
             obj1 = PatchProxy.applyTwoRefs(obj, Long.valueOf(l), this, os2, "11");
             if (obj1 != patchProxyRe) {
                i = obj1.intValue();
             }else {
             label_0043 :
                long l2 = System.currentTimeMillis();
                if (obj != null) {
                   obj2 = obj.iterator();
                   int i1 = 0;
                   while (obj2.hasNext()) {
                      long l3 = l2 - obj2.next().longValue();
                      if (l3 - l < 0) {
                         i1 = i1 + 1;
                      }
                   }
                   i = i1;
                }else {
                   i = 0;
                }
             }
          }else {
             goto label_0043 ;
          }
          s2 tx = this.x;
          if (tx == null) {
             a.S("mSlidePlayNextGuideConfig");
          }
          if (i < tx.mMaxShowNumberOfPerDay) {
             long l1 = 0xea60;
             obj1 = this.x;
             if (obj1 == null) {
                a.S("mSlidePlayNextGuideConfig");
             }
             l1 = l1 * (long)obj1.mShowOnceMinInterval;
             if (PatchProxy.isSupport(os2)) {
                obj2 = PatchProxy.applyTwoRefs(obj, Long.valueOf(l1), this, os2, "10");
                if (obj2 != patchProxyRe) {
                   b1 = obj2.booleanValue();
                }else if(obj == null || obj.isEmpty()){
                   l = System.currentTimeMillis() - obj.get((obj.size() - b)).longValue();
                   if (!l1) {
                      l1 = 0x36ee80;
                   }
                   if (l - l1 < 0) {
                      b1 = false;
                   }
                }
             label_00ce :
                b1 = true;
             }else {
                goto label_00a1 ;
             }
             if (b1) {
                s2 tv = this.v;
                if (tv == null) {
                   a.S("mSlidePlayViewModel");
                }
                if (!tv.I()) {
                label_0126 :
                   tv1 = this.v;
                   if (tv1 == null) {
                      a.S("mSlidePlayViewModel");
                   }
                   if (tv1.C() && (!TextUtils.x(this.E) && (this.H == null && (this.I == null && !this.X8())))) {
                   label_014b :
                      return b;
                   }
                }
             }
          }
       label_00de :
          Object obj3 = PatchProxy.apply(objArray, this, os2, "9");
          if (obj3 != patchProxyRe) {
             b2 = obj3.booleanValue();
          }else {
             tv1 = this.v;
             if (tv1 == null) {
                a.S("mSlidePlayViewModel");
             }
             os2 = this.w;
             if (os2 == null) {
                a.S("mPhoto");
             }
             if (tv1.R0(os2) == b) {
                tv1 = this.v;
                if (tv1 == null) {
                   a.S("mSlidePlayViewModel");
                }
                v3 ov3 = tv1.M0();
                if (ov3 != null && ov3.K == b) {
                   tv1 = this.v;
                   if (tv1 == null) {
                      a.S("mSlidePlayViewModel");
                   }
                   if (tv1.a0() == b) {
                      b2 = true;
                   }
                }
             }
          label_0123 :
             b2 = false;
          }
          if (b2) {
             goto label_0126 ;
          }
       }
    label_014a :
       b = false;
       goto label_014b ;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, s2.class, "7")) {
          return;
       }
       s2 tv = this.v;
       String str = "mSlidePlayViewModel";
       if (tv == null) {
          a.S(str);
       }
       s2 tv1 = this.v;
       if (tv1 == null) {
          a.S(str);
       }
       s2 tw = this.w;
       if (tw == null) {
          a.S("mPhoto");
       }
       QPhoto qPhoto = tv.n((tv1.R0(tw) + 1));
       if (qPhoto != null) {
          a.o(qPhoto, "it");
          if (qPhoto.getEntity() != null) {
             this.K = qPhoto.getPhotoId();
             this.E = qPhoto.recommendHintText();
             this.F = qPhoto.recommendHintTextSourceId();
             this.G = qPhoto.recommendHintTextSourceType();
          }
       }
       return;
    }
    public final i3 W8(){
       i3 obj = PatchProxy.apply(null, this, s2.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       s2 tv = this.v;
       if (tv == null) {
          a.S("mSlidePlayViewModel");
       }
       s2 tw = this.w;
       if (tw == null) {
          a.S("mPhoto");
       }
       obj.c("bubble_index", Integer.valueOf((tv.R0(tw) + 1)));
       obj.d("text", this.E);
       tv = this.K;
       if (tv == null) {
          String str = "";
       }
       obj.d("next_photo_id", tv);
       obj.d("text_id", this.F);
       obj.d("exposed_type", this.G);
       a.o(obj, "params");
       return obj;
    }
    public final boolean X8(){
       f obj = PatchProxy.apply(null, this, s2.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = b.c();
       if (obj != null) {
          a uoa = obj.i();
          if (uoa != null) {
             Activity activity = this.getActivity();
             a.m(activity);
             List list = uoa.i(activity);
             if (list != null) {
                a.o(list, "list");
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   c uoc = iterator.next();
                   a.o(uoc, "it");
                   if (uoc.K()) {
                      return true;
                   }
                }
             }
          }
       }
       return false;
    }
    public final void Y8(){
       SharedPreferences a;
       s2 os2 = s2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, os2, "3")) {
          return;
       }
       s2 tC = this.C;
       if (tC == null) {
          a.S("mScreenCleanStatusCombination");
       }
       if (tC.c()) {
          return;
       }else {
          tC = this.y;
          String str = "mSlidePlaySwitchNextGuidePopup";
          if (tC == null) {
             a.S(str);
          }
          tC.f0(this.E);
          tC = this.y;
          if (tC == null) {
             a.S(str);
          }
          tC.c0(new s2$l(this));
          tC = this.v;
          str = "mSlidePlayViewModel";
          if (tC == null) {
             a.S(str);
          }
          s2 tw = this.w;
          if (tw == null) {
             a.S("mPhoto");
          }
          if (!tC.R0(tw)) {
             tC = this.v;
             if (tC == null) {
                a.S(str);
             }
             v3 ov3 = tC.M0();
             if (ov3 != null) {
                ov3.K = true;
             }
             a = c.a;
             SharedPreferences$Editor uEditor = a.edit();
             uEditor.putInt("slideV2GuideShowCount", (c.r() + true));
             g.a(uEditor);
             long l = System.currentTimeMillis();
             if (!PatchProxy.isSupport(os2) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), this, os2, "14")) {
                List list = c.s(new t2().getType());
                if (list == null) {
                   list = new ArrayList();
                }
                if (list.size() < 100) {
                   list.add(Long.valueOf(l));
                }else {
                   list.remove(0);
                   list.add(Long.valueOf(l));
                }
                SharedPreferences$Editor uEditor1 = a.edit();
                uEditor1.putString("slideV2GuideShowTime", b.e(list));
                g.a(uEditor1);
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, os2, "4")) {
             ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             tC = this.w;
             if (tC == null) {
                a.S("mPhoto");
             }
             uElementPack.params = this.W8().e();
             uElementPack.action2 = "GUIDE_BUBBLE";
             showEvent.contentPackage = b.a(tC);
             showEvent.elementPackage = uElementPack;
             u1.g0(showEvent);
          }
          this.J = true;
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s2.class, "1")) {
          return;
       }
       Object obj = this.r8("DETAIL_PLAY_TIME_DOWN_OBSERVABLE");
       a.o(obj, "inject\(DetailAccessIds.D¡­LAY_TIME_DOWN_OBSERVABLE\)");
       this.q = obj;
       obj = this.r8("DETAIL_PLAY_PROGRESS_OBSERVABLE");
       a.o(obj, "inject\(DetailAccessIds.D¡­PLAY_PROGRESS_OBSERVABLE\)");
       this.r = obj;
       obj = this.q8(a.class);
       a.o(obj, "inject\(DetailPlayModule::class.java\)");
       this.s = obj;
       obj = this.r8("DETAIL_PLAY_END_COUNT_OBSERVABLE");
       a.o(obj, "inject\(DetailAccessIds.D¡­LAY_END_COUNT_OBSERVABLE\)");
       this.t = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.u = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.w = obj;
       obj = this.r8("DETAIL_SLIDE_COMMENT_FRAGMENT_VISIBLE");
       a.o(obj, "inject\(AccessIds.DETAIL_¡­COMMENT_FRAGMENT_VISIBLE\)");
       this.z = obj;
       obj = this.r8("DETAIL_SLIDE_AI_TEXT_FRAGMENT_VISIBLE");
       a.o(obj, "inject\(AccessIds.DETAIL_¡­AI_TEXT_FRAGMENT_VISIBLE\)");
       this.A = obj;
       obj = this.r8("SURVEY_SHOW_EVENT");
       a.o(obj, "inject\(AccessIds.SURVEY_SHOW_EVENT\)");
       this.B = obj;
       obj = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       a.o(obj, "inject\(DetailAccessIds.DETAIL_SCREEN_CLEAN_STATUS\)");
       this.C = obj;
       obj = this.r8("PREPARE_PICTURE_IN_PICTURE_MODE_OBSERVER");
       a.o(obj, "inject\(AccessIds.PREPARE¡­IN_PICTURE_MODE_OBSERVER\)");
       this.D = obj;
       return;
    }
}
