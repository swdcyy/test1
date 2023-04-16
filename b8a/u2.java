package b8a.u2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b8a.u2$a;
import nsd.u;
import b8a.u2$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import kotlin.jvm.internal.a;
import vw5.a;
import tw5.g;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import b8a.u2$c;
import erd.g;
import crd.b;
import brd.t;
import b8a.u2$d;
import b8a.u2$e;
import b8a.u2$f;
import b8a.u2$g;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.feature.api.social.followSlide.model.FollowSlideRecoGuide;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.util.DateUtils;
import gv5.a;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import xx9.a;
import com.kwai.library.widget.popup.common.c$b;
import android.app.Activity;
import s4a.g;
import android.text.TextUtils$TruncateAt;
import b8a.u2$h;
import s4a.b;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import im8.f;
import java.lang.System;
import java.lang.Long;
import java.util.ArrayList;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;

public final class u2 extends PresenterV2	// class@000407
{
    public boolean A;
    public boolean B;
    public f C;
    public g D;
    public final a E;
    public t p;
    public t q;
    public BaseFragment r;
    public SlidePlayViewModel s;
    public QPhoto t;
    public a u;
    public a v;
    public PublishSubject w;
    public PublishSubject x;
    public t y;
    public g z;
    public static final u2$a F;

    static {
       u2.F = new u2$a(null);
    }
    public void u2(){
       super();
       this.E = new u2$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, u2.class, "2")) {
          return;
       }
       b uob = d.a(-680793205);
       a.o(uob, "PluginManager.get\(HomeLocalPlugin::class.java\)");
       this.D = uob.t30();
       u2 tr = this.r;
       String str = "mFragment";
       if (tr == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tr.requireParentFragment());
       a.o(slidePlayVie, "SlidePlayViewModel.get\(m¡­.requireParentFragment\(\)\)");
       this.s = slidePlayVie;
       if (slidePlayVie == null) {
          a.S("mSlidePlayViewModel");
       }
       u2 tr1 = this.r;
       if (tr1 == null) {
          a.S(str);
       }
       slidePlayVie.P(tr1, this.E);
       tr = this.q;
       if (tr == null) {
          a.S("mDetailPlayedProgressObservable");
       }
       this.X7(tr.subscribe(new u2$c(this)));
       tr = this.p;
       if (tr == null) {
          a.S("mDetailPlayedTimeDown");
       }
       this.X7(tr.subscribe(new u2$d(this)));
       tr = this.w;
       if (tr == null) {
          a.S("mCommentFragmentVisiblePublisher");
       }
       this.X7(tr.subscribe(new u2$e(this)));
       tr = this.x;
       if (tr == null) {
          a.S("mAiTextFragmentVisiblePublisher");
       }
       this.X7(tr.subscribe(new u2$f(this)));
       tr = this.y;
       if (tr == null) {
          a.S("mPreparePipModeObserver");
       }
       this.X7(tr.subscribe(new u2$g(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, u2.class, "3")) {
          return;
       }
       u2 ts = this.s;
       if (ts == null) {
          a.S("mSlidePlayViewModel");
       }
       u2 tr = this.r;
       if (tr == null) {
          a.S("mFragment");
       }
       ts.D(tr, this.E);
       return;
    }
    public final long P8(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, u2.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       FollowSlideRecoGuide uFollowSlide = this.V8(p0);
       long l = (uFollowSlide != null)? uFollowSlide.mShowInterval * (long)1000: -0.00f;
       u2 tu = this.u;
       if (tu == null) {
          a.S("mDetailPlayModule");
       }
       e player = tu.getPlayer();
       a.o(player, "mDetailPlayModule.player");
       long duration = player.getDuration();
       if (duration - l <= 0) {
          l = (long)((double)duration * 0x3fe3333333333333);
       }
       return l;
    }
    public final QPhoto R8(){
       Object[] objArray = null;
       u2 obj = PatchProxy.apply(objArray, this, u2.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       String str = "mSlidePlayViewModel";
       if (obj == null) {
          a.S(str);
       }
       List list = obj.e0();
       u2 ts = this.s;
       if (ts == null) {
          a.S(str);
       }
       int i = ts.a0();
       if (list.size() >= (i + 1)) {
          objArray = list.get(i);
       }
       return objArray;
    }
    public final int S8(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, u2.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             if (DateUtils.H(iterator.next().longValue())) {
                i = i + 1;
             }
          }
       }
       return i;
    }
    public final FollowSlideRecoGuide V8(QPhoto p0){
       FollowSlideRecoGuide uFollowSlide;
       Object obj = PatchProxy.applyOneRefs(p0, this, u2.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          p0 = p0.mEntity;
          if (p0 != null) {
             uFollowSlide = a.a.a(p0);
          label_001d :
             return uFollowSlide;
          }
       }
       uFollowSlide = null;
       goto label_001d ;
    }
    public final String W8(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, u2.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       FollowSlideRecoGuide uFollowSlide = this.V8(p0);
       if (uFollowSlide != null) {
          uFollowSlide = uFollowSlide.mToastReason;
          if (uFollowSlide != null) {
          label_001c :
             return uFollowSlide;
          }
       }
       String str = "";
       goto label_001c ;
    }
    public final long X8(QPhoto p0){
       long l;
       FollowSlideRecoGuide obj = PatchProxy.applyOneRefs(p0, this, u2.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       FollowSlideRecoGuide uFollowSlide = this.V8(p0);
       obj = (uFollowSlide != null)? uFollowSlide.mShowDuration: 5;
       return obj;
    }
    public final void Y8(QPhoto p0){
       int b;
       boolean b1;
       List list;
       u2 tt;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, u2.class, "5")) {
          return;
       }
       c$b obj = PatchProxy.applyOneRefs(p0, this, u2.class, "13");
       String str = null;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          FollowSlideRecoGuide uFollowSlide1 = this.V8(p0);
          if (uFollowSlide1 != null && uFollowSlide1.mRecoGuideHasShowed == null) {
             u2 ts = this.s;
             String str1 = "mSlidePlayViewModel";
             if (ts == null) {
                a.S(str1);
             }
             if (ts.C() && (!TextUtils.x(this.W8(p0)) && (this.A == null && this.B == null))) {
                ts = this.s;
                if (ts == null) {
                   a.S(str1);
                }
                List list1 = ts.I0();
                b = (list1 != null)? list1.size(): 0;
                if (b > 1) {
                   ts = this.s;
                   if (ts == null) {
                      a.S(str1);
                   }
                   b = ts.a0();
                   u2 ts1 = this.s;
                   if (ts1 == null) {
                      a.S(str1);
                   }
                   if (b != (ts1.Q() - 1)) {
                      ts = this.s;
                      if (ts == null) {
                         a.S(str1);
                      }
                      if (!ts.b1() - null) {
                         Object obj2 = PatchProxy.applyOneRefs(p0, this, u2.class, "14");
                         if (obj2 != patchProxyRe) {
                            b = obj2.booleanValue();
                         }else {
                            ts = this.D;
                            list1 = (ts != null)? ts.c(): null;
                            b = this.S8(list1);
                            tt = this.D;
                            int i = (tt != null)? tt.d(): 1;
                            if (b >= i) {
                               b = false;
                            }else {
                               b = true;
                            }
                         }
                         if (b) {
                            ts = this.v;
                            if (ts == null) {
                               a.S("mScreenCleanStatusCombination");
                            }
                            if (!ts.c()) {
                               b = true;
                            }
                         }
                      }
                   }
                }
             }
          }
       label_00c7 :
          b = false;
       }
       if (!b) {
          return;
       }else {
          Activity activity = this.getActivity();
          a.m(activity);
          obj = new c$b(activity);
          long l = this.X8(p0) * 1000;
          Object obj1 = PatchProxy.applyOneRefs(p0, this, u2.class, "7");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(this.X8(p0) - 1000 >= 0){
             str = 1;
          }
          b1 = str;
          g og = new g(obj, l, b1);
          this.z = og;
          og.e0(1);
          u2 tz = this.z;
          if (tz != null) {
             tz.d0(TextUtils$TruncateAt.END);
          }
          tz = this.z;
          if (tz != null) {
             tz.g0(this.W8(p0), R.raw.arg_RES_7f0f008a);
          }
          tz = this.z;
          if (tz != null) {
             tz.c0(new u2$h(this, p0));
          }
          if (!PatchProxy.applyVoidOneRefs(p0, this, u2.class, "11")) {
             ShowMetaData showMetaData = new ShowMetaData();
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "REGIONAL_FEATURE_CONTENT_POPUP";
             i3 oi3 = i3.f();
             oi3.d("text", this.W8(p0));
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             tt = this.t;
             if (tt == null) {
                a.S("mPhoto");
             }
             uContentPack.photoPackage = w1.f(tt.mEntity);
             showMetaData.setElementPackage(uElementPack);
             showMetaData.setContentPackage(uContentPack);
             u1.B0(showMetaData);
          }
          p0 = p0.mEntity;
          if (p0 != null) {
             FollowSlideRecoGuide uFollowSlide = a.a.a(p0);
             if (uFollowSlide != null) {
                uFollowSlide.mRecoGuideHasShowed = true;
             }
          }
          u2 tC = this.C;
          if (tC != null) {
             tC.set(Boolean.TRUE);
          }
          long l1 = System.currentTimeMillis();
          if (!PatchProxy.isSupport(u2.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l1), this, u2.class, "6")) {
             tC = this.D;
             if (tC != null) {
                list = tC.c();
                if (list != null) {
                label_01ac :
                   if (!this.S8(list)) {
                      list = new ArrayList();
                   }
                   list.add(Long.valueOf(l1));
                   tz = this.D;
                   if (tz != null) {
                      tz.b(list);
                   }
                }
             }
             list = new ArrayList();
             goto label_01ac ;
          }
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u2.class, "1")) {
          return;
       }
       Object obj = this.r8("DETAIL_PLAY_TIME_DOWN_OBSERVABLE");
       a.o(obj, "inject\(DetailAccessIds.D¡­LAY_TIME_DOWN_OBSERVABLE\)");
       this.p = obj;
       obj = this.r8("DETAIL_PLAY_PROGRESS_OBSERVABLE");
       a.o(obj, "inject\(DetailAccessIds.D¡­PLAY_PROGRESS_OBSERVABLE\)");
       this.q = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.r = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.t = obj;
       obj = this.q8(a.class);
       a.o(obj, "inject\(DetailPlayModule::class.java\)");
       this.u = obj;
       obj = this.r8("DETAIL_SLIDE_COMMENT_FRAGMENT_VISIBLE");
       a.o(obj, "inject\(AccessIds.DETAIL_¡­COMMENT_FRAGMENT_VISIBLE\)");
       this.w = obj;
       obj = this.r8("DETAIL_SLIDE_AI_TEXT_FRAGMENT_VISIBLE");
       a.o(obj, "inject\(AccessIds.DETAIL_¡­AI_TEXT_FRAGMENT_VISIBLE\)");
       this.x = obj;
       this.C = this.x8("DETAIL_HAS_SHOWN_GUIDE");
       obj = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       a.o(obj, "inject\(DetailAccessIds.DETAIL_SCREEN_CLEAN_STATUS\)");
       this.v = obj;
       obj = this.r8("PREPARE_PICTURE_IN_PICTURE_MODE_OBSERVER");
       a.o(obj, "inject\(AccessIds.PREPARE¡­IN_PICTURE_MODE_OBSERVER\)");
       this.y = obj;
       return;
    }
}
