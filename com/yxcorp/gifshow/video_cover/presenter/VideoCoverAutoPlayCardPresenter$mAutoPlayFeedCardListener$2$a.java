package com.yxcorp.gifshow.video_cover.presenter.VideoCoverAutoPlayCardPresenter$mAutoPlayFeedCardListener$2$a;
import s99.i;
import com.yxcorp.gifshow.video_cover.presenter.VideoCoverAutoPlayCardPresenter$mAutoPlayFeedCardListener$2;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import oxc.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.framework.model.feed.BaseFeed;
import w99.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import u99.d;
import v99.a;
import java.util.Objects;
import java.util.Iterator;
import java.lang.Iterable;
import ba9.a;
import kp.r1;
import im8.f;
import s99.p;
import s99.h;
import android.view.ViewGroup;

public final class VideoCoverAutoPlayCardPresenter$mAutoPlayFeedCardListener$2$a implements i	// class@0016a1
{
    public final VideoCoverAutoPlayCardPresenter$mAutoPlayFeedCardListener$2 b;

    public void VideoCoverAutoPlayCardPresenter$mAutoPlayFeedCardListener$2$a(VideoCoverAutoPlayCardPresenter$mAutoPlayFeedCardListener$2 p0){
       this.b = p0;
       super();
    }
    public boolean C(RecyclerView p0,int p1){
       VideoCoverAutoPlayCardPresenter$mAutoPlayFeedCardListener$2 obj;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       VideoCoverAutoPlayCardPresenter$mAutoPlayFeedCardListener$2$a omAutoPlayFe = VideoCoverAutoPlayCardPresenter$mAutoPlayFeedCardListener$2$a.class;
       if (PatchProxy.isSupport(omAutoPlayFe)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, omAutoPlayFe, "2");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "dispatchView");
       obj = this.b.this$0;
       d.e("FollowVideoAutoPlayCardPresenter", "acceptPlayFocus", a.S8(this.b.this$0).mEntity, obj.p, a.R8(obj));
       a uoa = a.V8(this.b.this$0);
       Objects.requireNonNull(uoa);
       g obj1 = PatchProxy.apply(null, uoa, a.class, "17");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          Iterator iterator = uoa.a.iterator();
          while (true) {
             if (iterator.hasNext()) {
                a uoa1 = iterator.next();
                obj1 = uoa1.getAutoPlayModule();
                if (obj1 == null || obj1.isPlaying() != true) {
                   g autoPlayModu = uoa1.getAutoPlayModule();
                   if (autoPlayModu == null || autoPlayModu.isPreparing() != true) {
                      continue ;
                   }
                }
                b = true;
             }else {
                b = false;
             }
          }
       }
       if (!b && r1.T0(a.S8(this.b.this$0).mEntity)) {
          uoa = this.b.this$0.x;
          if (uoa != null) {
             p op = uoa.get();
             if (op != null && op.c(p1) == true) {
                this.b.this$0.d9();
                return true;
             }
          }
       }
       return false;
    }
    public void a(){
       h.c(this);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, VideoCoverAutoPlayCardPresenter$mAutoPlayFeedCardListener$2$a.class, "1")) {
          return;
       }
       VideoCoverAutoPlayCardPresenter$mAutoPlayFeedCardListener$2 this$0 = this.b.this$0;
       d.e("FollowVideoAutoPlayCardPresenter", "onDetached", a.S8(this.b.this$0).mEntity, this$0.p, a.R8(this$0));
       this.b.this$0.a9();
       return;
    }
    public void c(int p0,int p1,int p2,int p3,int p4,int p5){
       a uoa;
       p obj;
       boolean b;
       int i = 0;
       if (PatchProxy.isSupport(VideoCoverAutoPlayCardPresenter$mAutoPlayFeedCardListener$2$a.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, VideoCoverAutoPlayCardPresenter$mAutoPlayFeedCardListener$2$a.class, "3")) {
             return;
          }
       }
       VideoCoverAutoPlayCardPresenter$mAutoPlayFeedCardListener$2 this$0 = this.b.this$0;
       this$0.G = true;
       if (!a.V8(this$0).f(a.P8(this.b.this$0))) {
          uoa = a.V8(this.b.this$0);
          a uoa1 = a.P8(this.b.this$0);
          Objects.requireNonNull(uoa);
          obj = PatchProxy.applyOneRefs(uoa1, uoa, a.class, "18");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             a.p(uoa1, "autoPlayCard");
             g autoPlayModu = uoa1.getAutoPlayModule();
             if (autoPlayModu != null && autoPlayModu.isPreparing() == true) {
                i = 1;
             }
             autoPlayModu = i;
          }
          if (!b) {
             this.b.this$0.h9();
          }
       }
       if (!a.P8(this.b.this$0).g()) {
          return;
       }else {
          uoa = this.b.this$0.x;
          if (uoa != null) {
             obj = uoa.get();
             if (obj != null && (!obj.e(p2) && a.V8(this.b.this$0).f(a.P8(this.b.this$0)))) {
                VideoCoverAutoPlayCardPresenter$mAutoPlayFeedCardListener$2 this$01 = this.b.this$0;
                d.e("FollowVideoAutoPlayCardPresenter", "onScrolled", a.S8(this.b.this$0).mEntity, this$01.p, a.R8(this$01));
                this.b.this$0.e9("scrolled");
             }
          }
          return;
       }
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, VideoCoverAutoPlayCardPresenter$mAutoPlayFeedCardListener$2$a.class, "4")) {
          return;
       }
       VideoCoverAutoPlayCardPresenter$mAutoPlayFeedCardListener$2 this$0 = this.b.this$0;
       d.e("FollowVideoAutoPlayCardPresenter", "onDispatchInterrupted", a.S8(this.b.this$0).mEntity, this$0.p, a.R8(this$0));
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
       h.g(this, p0);
    }
}
