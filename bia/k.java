package bia.k;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.Object;
import com.google.common.collect.ImmutableList;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import com.yxcorp.gifshow.follow.config.model.EnableMyfollowSlide;
import com.yxcorp.gifshow.follow.common.selector.FollowFilterHelper;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.List;
import java.util.Map;
import java.lang.Integer;
import wga.c;
import java.util.ArrayList;
import ekd.j;
import tkd.b;
import tkd.d;
import lv5.c;
import w99.h;
import lv5.b;
import wha.b;
import n3d.a;
import com.kwai.feature.api.live.base.model.LivePassThruParamExtraInfo;
import ekd.q;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam$b;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam;
import wkd.b;
import l66.a;
import dda.d;
import m66.a;
import os5.e;

public final class k	// class@0003cb
{
    public static final List a;

    static {
       ImmutableList immutableLis = ImmutableList.of(PhotoType.VIDEO, PhotoType.IMAGE, PhotoType.LIVESTREAM);
       a.o(immutableLis, "ImmutableList.of\(\n  Phot¡­E, PhotoType.LIVESTREAM\n\)");
       k.a = immutableLis;
    }
    public static final boolean a(SlidePlayViewModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, k.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "slidePlayViewModel");
       QPhoto qPhoto = p0.n(p0.q(p0.j()));
       if (qPhoto == null) {
          return false;
       }
       a.o(qPhoto, "slidePlayViewModel.getPh\x20\x02owIndex\)\) ?: return false\x00");
       return r1.S2(qPhoto.getEntity());
    }
    public static final boolean b(){
       EnableMyfollowSlide obj = PatchProxy.apply(null, null, k.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (FollowConfigUtil.i() && FollowConfigUtil.y() != null) {
          obj = FollowConfigUtil.y();
          obj = (obj != null)? obj.sameLiveOrderInAndOut: false;
       }else {
          boolean b = FollowFilterHelper.j();
       }
       return obj;
    }
    public static void c(GifshowActivity p0,BaseFragment p1,BaseFeed p2,List p3,int p4,Map p5,boolean p6,int p7,Object p8){
       if (p7 & 0x20) {
          p5 = null;
       }
       int i = 0;
       if (p7 & 0x40) {
          p6 = false;
       }
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),p5,Boolean.valueOf(p6)};
          if (!PatchProxy.applyVoid(objArray, null, ok, "9")) {
          label_003d :
             if (p2 != null) {
                QPhoto qPhoto = new QPhoto(p2);
                c uoc = new c();
                uoc.b(p0);
                uoc.i(qPhoto);
                uoc.g(2);
                uoc.h(p4);
                uoc.e(97);
                if (p5 != null) {
                   uoc.m = p5;
                }
                if (k.b() || p6) {
                   uoc.f(p3);
                }else {
                   QPhoto[] qPhotoArray = new QPhoto[]{qPhoto};
                   uoc.f(j.a(qPhotoArray));
                }
                uoc.d(p1);
                if (k.b() || p6) {
                   h oh = new h();
                   if (!PatchProxy.applyVoidTwoRefs(uoc, oh, null, b.class, "2") && uoc.a()) {
                      oh.b(1);
                      c n = uoc.n;
                      if (n != null) {
                         uoc.a.e(n);
                      }
                      if (uoc.h != null) {
                         i = 1;
                      }else if(uoc.i != null){
                         i = 2;
                      }
                      LivePassThruParamExtraInfo livePassThru = new LivePassThruParamExtraInfo();
                      if (!q.h(uoc.m)) {
                         livePassThru.mFollowExtraInfo = uoc.m;
                      }
                      LiveSlidePlayEnterParam$b uob = new LiveSlidePlayEnterParam$b();
                      uob.F(b.a(uoc.f));
                      uob.B(uoc.e);
                      uob.C(uoc.c);
                      uob.o(uoc.k);
                      uob.u(livePassThru.mFollowExtraInfo);
                      uob.h(livePassThru);
                      uob.E(1);
                      uob.e(1);
                      uob.t(i);
                      uob.d(1);
                      LiveSlidePlayEnterParam liveSlidePla = uob.a();
                      b.a(0x6d2a4fdd).b(new d(uoc.c.mEntity));
                      d.a(-1835681758).eO(uoc.a, liveSlidePla, 68);
                   }
                }else {
                   d.a(-242212848).CK(uoc, new h());
                }
             }
          }
       }else {
          goto label_003d ;
       }
       return;
    }
}
