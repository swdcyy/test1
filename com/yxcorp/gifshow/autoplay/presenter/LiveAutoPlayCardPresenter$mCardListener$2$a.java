package com.yxcorp.gifshow.autoplay.presenter.LiveAutoPlayCardPresenter$mCardListener$2$a;
import s99.i;
import com.yxcorp.gifshow.autoplay.presenter.LiveAutoPlayCardPresenter$mCardListener$2;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import x99.s0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import java.lang.StringBuilder;
import com.kwai.framework.model.feed.BaseFeed;
import w99.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.HashMap;
import u99.d;
import v99.a;
import ba9.a;
import im8.f;
import s99.m;
import java.util.Objects;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import com.kwai.video.waynelive.LivePlayerController;
import u99.a;
import com.yxcorp.gifshow.autoplay.live.e;
import kp.r1;
import xl8.b;
import androidx.fragment.app.Fragment;
import mrd.a;
import android.view.ViewGroup;
import s99.h;

public final class LiveAutoPlayCardPresenter$mCardListener$2$a implements i	// class@001c1b
{
    public final LiveAutoPlayCardPresenter$mCardListener$2 b;

    public void LiveAutoPlayCardPresenter$mCardListener$2$a(LiveAutoPlayCardPresenter$mCardListener$2 p0){
       this.b = p0;
       super();
    }
    public boolean C(RecyclerView p0,int p1){
       s0 obj;
       s0 d;
       LiveAutoPlayCardPresenter$mCardListener$2$a omCardListen = LiveAutoPlayCardPresenter$mCardListener$2$a.class;
       if (PatchProxy.isSupport(omCardListen)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, omCardListen, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "recyclerView");
       d.h("LiveAutoPlayCardPresenter", "acceptPlayFocus", d.c(s0.R8(this.b.this$0).mEntity, s0.V8(this.b.this$0), this.b.this$0.t, "playChecker", String.valueOf(this.b.this$0.b9(p1))+", direction="+p1));
       if (this.b.this$0.b9(p1)) {
          s0.S8(this.b.this$0).u("focus_dispatch", s0.P8(this.b.this$0));
          d = this.b.this$0.D;
          if (d != null) {
             m om = d.get();
             if (om != null && om.a() == true) {
                s0.S8(this.b.this$0).h(s0.P8(this.b.this$0));
             }
          }
          LiveAutoPlayCardPresenter$mCardListener$2 this$0 = this.b.this$0;
          obj = this$0.F;
          LiveAutoPlayModule liveAutoPlay = s0.V8(this$0);
          Objects.requireNonNull(liveAutoPlay);
          Object[] objArray = null;
          LiveQualityItem liveQualityI = PatchProxy.apply(objArray, liveAutoPlay, LiveAutoPlayModule.class, "47");
          if (liveQualityI != PatchProxyResult.class) {
          }else {
             liveAutoPlay = liveAutoPlay.k;
             liveQualityI = (liveAutoPlay != null)? liveAutoPlay.getCurrentLiveQualityItem(): objArray;
          }
          if (liveQualityI != null) {
             objArray = liveQualityI.mQualityType;
          }
          a.c(obj, objArray, 1);
          return 1;
       }else {
          this.b.this$0.d9();
          return false;
       }
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveAutoPlayCardPresenter$mCardListener$2$a.class, "1")) {
          return;
       }
       d.d("LiveAutoPlayCardPresenter", "onAttached");
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAutoPlayCardPresenter$mCardListener$2$a.class, "2")) {
          return;
       }
       if (s0.V8(this.b.this$0).d.A != null) {
          s0.P8(this.b.this$0).setItemWeight(r1.k1(s0.R8(this.b.this$0).mEntity));
       }
       s0 b = this.b.this$0.B;
       if (b != null) {
          objArray = b.a();
       }
       Boolean tRUE = Boolean.TRUE;
       if (a.g(objArray, tRUE)) {
          s0 t = this.b.this$0.t;
          if (t != null) {
             a.m(t);
             if (!t.isResumed()) {
             label_0074 :
                d.g("LiveAutoPlayCardPresenter", "onDetached", "isResume", "命中直播转场动画实验且页面不可见");
                return;
             }
          }
          t = this.b.this$0.u;
          if (t != null) {
             a.m(t);
             if (a.g(t.i(), tRUE) ^ 0x01) {
                goto label_0074 ;
             }
          }
       }
    label_0080 :
       this.b.this$0.e9("detach");
       return;
    }
    public void c(int p0,int p1,int p2,int p3,int p4,int p5){
       if (PatchProxy.isSupport(LiveAutoPlayCardPresenter$mCardListener$2$a.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, LiveAutoPlayCardPresenter$mCardListener$2$a.class, "4")) {
             return;
          }
       }
       if (s0.S8(this.b.this$0).g(s0.P8(this.b.this$0)) && !this.b.this$0.b9(p2)) {
          this.b.this$0.e9("scrolled");
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LiveAutoPlayCardPresenter$mCardListener$2$a.class, "5")) {
          return;
       }
       this.b.this$0.e9("dispatch_interrupted");
       return;
    }
    public boolean i(ViewGroup p0,int p1){
       return h.a(this, p0, p1);
    }
    public void n(){
       h.f(this);
    }
    public void onScrollStateChanged(int p0){
    }
}
