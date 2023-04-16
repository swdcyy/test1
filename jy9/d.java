package jy9.d;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import jh5.a;
import xq7.d;
import rp7.a;
import jy9.a;
import qp7.a;
import v6a.m0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import fr7.e;
import java.lang.Boolean;
import lnc.u1;
import p5a.e;
import de5.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import jy9.b;
import erd.g;
import crd.b;
import qp7.b;
import fr7.d;
import jy9.c;
import io.reactivex.internal.functions.Functions;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kwai.components.feedmodel.RewardPhotoInfo;
import com.kwai.components.feedmodel.RewardPhotoInfo$RewardBubbleInfo;
import qp7.x0;
import java.lang.CharSequence;
import android.text.TextUtils;
import lnc.a1;
import pp7.b;
import elb.f0;
import cda.b;
import mvb.c;
import oe6.a;
import m9a.j;
import iz5.a;
import com.kuaishou.android.model.mix.w;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import java.lang.System;
import qp7.d;
import fr7.c;
import qp7.c;

public class d extends DispatchBaseElement	// class@002b84
{
    public PhotoMeta t;
    public QPhoto u;
    public Activity v;
    public a w;
    public boolean x;
    public final IMediaPlayer$OnInfoListener y;

    public void d(a p0){
       super(d.h, p0);
       this.y = new a(this);
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, d.class, "1")) {
       }else {
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          this.u = mPhoto;
          this.v = p0.a;
          this.w = p0.j;
          if (mPhoto != null) {
             this.t = mPhoto.getPhotoMeta();
          }
          PatchProxy.onMethodExit(d.class, "1");
       }
       return;
    }
    public a f0(a p0){
       e uoe = PatchProxy.applyOneRefs(p0, this, d.class, "10");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e(p0);
       }
       return uoe;
    }
    public void j0(boolean p0){
       d uod = d.class;
       String str = "2";
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, str)) {
          return;
       }
       this.n0();
       u1.a(this);
       if (this.o0()) {
          this.w.getPlayer().addOnInfoListener(this.y);
          if (!PatchProxy.applyVoid(null, this, uod, "6") && (!this.u.isAtlasPhotos() && (this.u.isLongPhotos() || this.u.isSinglePhoto()))) {
             this.j(t.timer(7000, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new b(this)));
          }
       }
       b ti = this.i;
       c uoc = new c(this);
       g e = Functions.e;
       Objects.requireNonNull(ti);
       b uob = PatchProxy.applyTwoRefs(uoc, e, ti, d.class, str);
       if (uob != PatchProxyResult.class) {
       }else {
          a.p(uoc, "onNext");
          a.p(e, "onError");
          uob = ti.a.subscribe(uoc, e);
          a.o(uob, "rewardSubject.subscribe\(onNext, onError\)");
       }
       this.j(uob);
       return;
    }
    public void m0(boolean p0){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, d.class, "3")) {
          return;
       }
       u1.b(this);
       this.x = false;
       return;
    }
    public final void n0(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       d tt = this.t;
       if (tt != null && tt.mHasShowedRewardBubble != null) {
          PhotoMeta mRewardPhoto = tt.mRewardPhotoInfo;
          if (mRewardPhoto != null) {
             RewardPhotoInfo mRewardBubbl = mRewardPhoto.mRewardBubbleInfo;
             if (mRewardBubbl != null) {
                RewardPhotoInfo$RewardBubbleInfo mBubbleDes = mRewardBubbl.mBubbleDes;
                e uoe = this.E();
                if (TextUtils.isEmpty(mBubbleDes)) {
                   mBubbleDes = a1.p(R.string.arg_RES_7f1042dd);
                }
                Objects.requireNonNull(uoe);
                if (!PatchProxy.applyVoidOneRefs(mBubbleDes, uoe, e.class, "1")) {
                   uoe.e.f(mBubbleDes);
                }
                this.c0();
             label_004b :
                return;
             }
          }
       }
       this.b0();
       goto label_004b ;
    }
    public final boolean o0(){
       d obj = PatchProxy.apply(null, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       boolean b = (obj != null && (f0.a(obj) && (this.u.enableShowRewardBubbleTip() && (this.u.numberOfReward() >= 3 && !this.u.hasRewarded()))))? true: false;
       return b;
    }
    public void onEventMainThread(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "9")) {
          return;
       }
       if (p0 != null) {
          d tu = this.u;
          if (tu != null && !tu.equals(p0.b)) {
             return;
          }
       }
       if (p0 != null && p0.a == 1) {
          this.p0();
       }
       return;
    }
    public void onEventMainThread(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "8")) {
          return;
       }
       if (p0 != null) {
          d tu = this.u;
          if (tu != null && !tu.equals(p0.a)) {
          label_001f :
             return;
          }
       }
       if (!this.o0()) {
          goto label_001f ;
       }else if(p0 != null && p0.a.isLiked()){
          this.p0();
       }
       return;
    }
    public final void p0(){
       SharedPreferences a;
       if (PatchProxy.applyVoid(null, this, d.class, "7")) {
          return;
       }
       int i = a.z();
       long l = a.A();
       if (i < 3 && !j.a(l)) {
          this.x = true;
          a.d(true, this.u, false, "");
          w.w1(this.t, true);
          a = a.a;
          SharedPreferences$Editor uEditor = a.edit();
          uEditor.putInt("rewardTipsShowCountNasa", (i + true));
          g.a(uEditor);
          SharedPreferences$Editor uEditor1 = a.edit();
          uEditor1.putLong("rewardTipsShowTimeNasa", System.currentTimeMillis());
          g.a(uEditor1);
          this.n0();
       }
       return;
    }
    public d q(){
       c uoc = PatchProxy.apply(null, this, d.class, "12");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c();
       }
       return uoc;
    }
    public c r(){
       d uod = PatchProxy.apply(null, this, d.class, "11");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = new d();
       }
       return uod;
    }
}
