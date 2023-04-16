package com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter$b;
import xa3.a;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.Lifecycle;
import b93.d;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle$State;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import java.lang.Enum;
import com.kuaishou.android.live.log.b;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel;
import java.lang.Boolean;
import k73.d;
import k73.a;
import e93.b;
import xp5.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import i73.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Number;
import lp3.e;
import lp3.c;
import lp3.b;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import android.view.View;
import f73.b;
import java.util.Objects;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import f73.a;
import android.animation.Animator$AnimatorListener;

public final class LiveLiteFansGroupPresenter$b implements a	// class@001d92
{
    public final LiveLiteFansGroupPresenter b;

    public void LiveLiteFansGroupPresenter$b(LiveLiteFansGroupPresenter p0){
       this.b = p0;
       super();
    }
    public void A1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteFansGroupPresenter$b.class, "5")) {
          return;
       }
       Lifecycle lifecycle = this.b.getLifecycle();
       String str = "lifecycle";
       a.o(lifecycle, str);
       if (!lifecycle.getCurrentState().isAtLeast(Lifecycle$State.CREATED)) {
          Lifecycle lifecycle1 = this.b.getLifecycle();
          a.o(lifecycle1, str);
          b.S(LiveLiteLogTag.LITE_FANS_GROUP.appendTag(this.b.v), "showFansGroupAudienceDialog: lifecycle not ready", "currentState", lifecycle1.getCurrentState().name());
          return;
       }else if(a.g(this.b.K.g().getValue(), Boolean.TRUE)){
          LiveLiteFansGroupPresenter l = this.b.L;
          if (l != null && !PatchProxy.applyVoid(objArray, l, d.class, "1")) {
             l.b.qc(a.a("jumpToLiveRoom"), false);
          }
          return;
       }else {
          this.b.h9();
          return;
       }
    }
    public void Mm(String p0,boolean p1){
       LiveLiteFansGroupPresenter$b uob = LiveLiteFansGroupPresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "9")) {
          return;
       }
       a.p(p0, "iconPosition");
       ClientContent$LiveStreamPackage liveStreamPa = LiveLiteFansGroupPresenter.d9(this.b).a();
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(liveStreamPa, p0, Boolean.valueOf(p1), null, a.class, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "FANS_GROUP_ICON_CLICK";
          i3 oi3 = i3.f();
          oi3.d("icon_position", p0);
          p0 = (p1)? "IS_MEMBER": "NOT_MEMBER";
          oi3.d("icon_status", p0);
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.B(new ClickMetaData().setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack).setIsRealTime(false));
       }
       return;
    }
    public t Ri(boolean p0,boolean p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(LiveLiteFansGroupPresenter$b.class)) {
          Object obj = PatchProxy.applyFourRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, LiveLiteFansGroupPresenter$b.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.b.K.c(p0, p1, p2, p3);
    }
    public void Sd(boolean p0){
       LiveLiteFansGroupPresenter$b uob = LiveLiteFansGroupPresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "11")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = LiveLiteFansGroupPresenter.d9(this.b).a();
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(liveStreamPa, Boolean.valueOf(p0), null, uoa, "4")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PERSONEL_CARD_FANS_GROUP_BUTTON";
          i3 oi3 = i3.f();
          oi3.c("if_join", Integer.valueOf(p0));
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.B(new ClickMetaData().setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack).setIsRealTime(false));
       }
       return;
    }
    public LiveData Uf(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFansGroupPresenter$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.K.k();
    }
    public LiveData W2(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFansGroupPresenter$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.K.j();
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void f9(boolean p0){
       LiveLiteFansGroupPresenter$b uob = LiveLiteFansGroupPresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "10")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = LiveLiteFansGroupPresenter.d9(this.b).a();
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(liveStreamPa, Boolean.valueOf(p0), null, uoa, "3")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PERSONEL_CARD_FANS_GROUP_BUTTON";
          i3 oi3 = i3.f();
          oi3.c("if_join", Integer.valueOf(p0));
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.B0(new ShowMetaData().setType(3).setElementPackage(uElementPack).setContentPackage(uContentPack));
       }
       return;
    }
    public void ib(String p0,boolean p1){
       LiveLiteFansGroupPresenter$b uob = LiveLiteFansGroupPresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "8")) {
          return;
       }
       a.p(p0, "iconPosition");
       ClientContent$LiveStreamPackage liveStreamPa = LiveLiteFansGroupPresenter.d9(this.b).a();
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(liveStreamPa, p0, Boolean.valueOf(p1), null, a.class, "1")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "FANS_GROUP_ICON_SHOW";
          i3 oi3 = i3.f();
          oi3.d("icon_position", p0);
          p0 = (p1)? "IS_MEMBER": "NOT_MEMBER";
          oi3.d("icon_status", p0);
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.B0(new ShowMetaData().setType(3).setElementPackage(uElementPack).setContentPackage(uContentPack));
       }
       return;
    }
    public void jk(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFansGroupPresenter$b.class, "7")) {
          return;
       }
       b a = b.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(p0, a, b.class, "1") && p0 != null) {
          PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f99999a,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f99999a,0x3f800000})};
          ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
          a.o(objectAnimat, "ObjectAnimator.ofPropert¡­lerScaleX, smallerScaleY\)");
          objectAnimat.setDuration(500);
          PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f800000,0x3f99999a}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f800000,0x3f99999a})};
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu1);
          a.o(objectAnimat1, "ObjectAnimator.ofPropert¡­ggerScaleX, biggerScaleY\)");
          objectAnimat1.setDuration(500);
          AnimatorSet uAnimatorSet = new AnimatorSet();
          Animator[] uAnimatorArr = new Animator[]{objectAnimat1,objectAnimat};
          uAnimatorSet.playSequentially(uAnimatorArr);
          uAnimatorSet.addListener(new a(uAnimatorSet, p0));
          uAnimatorSet.start();
       }
       return;
    }
    public LiveData md(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFansGroupPresenter$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.K.i();
    }
    public LiveData sn(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFansGroupPresenter$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.K.h();
    }
    public LiveData ui(){
       Object obj = PatchProxy.apply(null, this, LiveLiteFansGroupPresenter$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.K.e();
    }
}
