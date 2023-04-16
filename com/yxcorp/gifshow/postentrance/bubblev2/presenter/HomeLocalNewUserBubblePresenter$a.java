package com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomeLocalNewUserBubblePresenter$a;
import com.kwai.gifshow.post.api.feature.postentrance.bubble.BaseHomePostBubbleV2;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomeLocalNewUserBubblePresenter;
import an6.k;
import pr6.d;
import java.lang.Object;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.PublishGuideInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Map;
import lnc.i3;
import com.yxcorp.gifshow.postentrance.util.b;
import po5.c;
import pr6.b;
import k2b.e0;
import com.yxcorp.gifshow.postentrance.util.HomePostBubbleFrequencyControlUtils;
import java.lang.Boolean;
import com.yxcorp.gifshow.postentrance.util.d;
import ezb.k;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomeLocalNewUserBubblePresenter$a$b;
import io.reactivex.g;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomeLocalNewUserBubblePresenter$a$c;
import erd.o;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomeLocalNewUserBubblePresenter$a$d;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomeLocalNewUserBubblePresenter$a$e;
import com.kwai.gifshow.post.api.feature.postentrance.bubble.BasePostEntranceBubble;
import an6.e;
import java.util.List;
import com.yxcorp.gifshow.postentrance.util.HomePostEntranceExpUtil;
import an6.i;
import mzb.d$b;
import nzb.b;
import mzb.c;
import mzb.d;
import szb.d;
import java.util.Objects;
import sx4.e;
import rx4.a;
import szb.b;
import mzb.a$b;
import nzb.a;
import mzb.b;
import mzb.a;
import szb.e;
import com.yxcorp.gifshow.widget.m;
import gzb.a;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomeLocalNewUserBubblePresenter$a$a;
import erd.g;
import crd.b;

public final class HomeLocalNewUserBubblePresenter$a extends BaseHomePostBubbleV2	// class@001017
{
    public final HomeLocalNewUserBubblePresenter v;

    public void HomeLocalNewUserBubblePresenter$a(HomeLocalNewUserBubblePresenter p0,k p1,d p2,int p3,int p4,int p5){
       this.v = p0;
       super(p1, p2, p3, p4, p5);
    }
    public void A(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLocalNewUserBubblePresenter$a.class, "10")) {
       }else {
          a.p(p0, "bubbleInfo");
          b c = c.C;
          a.o(c, "HomeFragmentFuncIds.LOG_PAGE");
          b.d(b.a(p0, null).e(), this.F().d(c));
          HomePostBubbleFrequencyControlUtils.g.g(p0.mType);
       }
       return;
    }
    public void B(Object p0,boolean p1){
       if (!PatchProxy.isSupport(HomeLocalNewUserBubblePresenter$a.class) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, HomeLocalNewUserBubblePresenter$a.class, "11")) {
          HomePostBubbleFrequencyControlUtils.g.g(p0.mType);
       }
       return;
    }
    public void D(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLocalNewUserBubblePresenter$a.class, "9")) {
       }else {
          a.p(p0, "bubbleInfo");
          this.v.u = false;
          HomePostBubbleFrequencyControlUtils.g.h(3);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, objArray, d.class, "15")) {
             SharedPreferences$Editor uEditor = k.a.edit();
             uEditor.putBoolean(b.d("user")+"has_post_entrance_new_user_bubble_shown", true);
             g.a(uEditor);
          }
          b c = c.C;
          a.o(c, "HomeFragmentFuncIds.LOG_PAGE");
          b.e(b.a(p0, objArray).e(), this.F().d(c));
       }
       return;
    }
    public t E(){
       t obj = PatchProxy.apply(null, this, HomeLocalNewUserBubblePresenter$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       z c = d.c;
       obj = t.create(new HomeLocalNewUserBubblePresenter$a$b(this)).subscribeOn(c).observeOn(c);
       obj = obj.flatMap(HomeLocalNewUserBubblePresenter$a$c.b).map(new HomeLocalNewUserBubblePresenter$a$d(this)).flatMap(new HomeLocalNewUserBubblePresenter$a$e(this));
       a.o(obj, "Observable.create<Mutabl¡­fo\)\n          }\n        }");
       return obj;
    }
    public boolean b(){
       Object[] objArray = null;
       k obj = PatchProxy.apply(objArray, this, HomeLocalNewUserBubblePresenter$a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (super.b()) {
          obj = this.w();
          e uoe = this.g();
          String str = (uoe != null)? uoe.a(): objArray;
          if (obj.b(str, b) && (!this.w().k(objArray) && this.w().h(this.i()))) {
          label_0051 :
             return b;
          }
       }
    label_0050 :
       b = false;
       goto label_0051 ;
    }
    public e o(Object p0){
       e uoe = PatchProxy.applyOneRefs(p0, this, HomeLocalNewUserBubblePresenter$a.class, "7");
       if (uoe != PatchProxyResult.class) {
       }else {
          a.p(p0, "bubbleInfo");
          uoe = new e();
          uoe.j(p0.mType);
          uoe.k(HomePostEntranceExpUtil.h.e());
          uoe.n(b.a(p0, null));
       }
       return uoe;
    }
    public i q(Object p0){
       d uod = PatchProxy.applyOneRefs(p0, this, HomeLocalNewUserBubblePresenter$a.class, "6");
       if (uod != PatchProxyResult.class) {
       }else {
          a.p(p0, "bubbleInfo");
          if (p0.mTKViewContainer != null) {
             d uod1 = new d(new d$b(new b(p0)).a(), p0.mBubbleUiType, this.G());
             PublishGuideInfo mTKViewConta = p0.mTKViewContainer;
             Objects.requireNonNull(mTKViewConta, "null cannot be cast to non-null type com.kuaishou.tk.api.export.ITKViewContainer");
             uod1.t(mTKViewConta);
             uod1.u(p0.mTkBubbleConfig);
             p0 = p0.mKwaiTKContainer;
             a.o(p0, "bubbleInfo.mKwaiTKContainer");
             uod1.s(p0);
             uod = uod1;
          }else if(p0.mBubbleUiType != 3){
             uod = new b(new a$b(new a(p0)).a(), this.G(), p0.getBubbleStyle());
          }else {
             uod = new e(new d$b(new b(p0)).a(), this.G());
          }
       }
       return uod;
    }
    public m s(Object p0){
       a uoa = PatchProxy.applyOneRefs(p0, this, HomeLocalNewUserBubblePresenter$a.class, "4");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "bubbleInfo");
          uoa = new a(this.F(), this.G(), 1, this.g());
       }
       return uoa;
    }
    public m t(Object p0){
       a uoa = PatchProxy.applyOneRefs(p0, this, HomeLocalNewUserBubblePresenter$a.class, "5");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "bubbleInfo");
          uoa = new a(this.F(), this.G(), 3, this.g());
       }
       return uoa;
    }
    public boolean y(){
       Object obj = PatchProxy.apply(null, this, HomeLocalNewUserBubblePresenter$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.w().f();
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, HomeLocalNewUserBubblePresenter$a.class, "3")) {
          return;
       }
       b uob = this.w().e().subscribe(new HomeLocalNewUserBubblePresenter$a$a(this));
       a.o(uob, "pageStateDelegate.observ¡­  }\n          }\n        }");
       this.n(uob);
       return;
    }
}
