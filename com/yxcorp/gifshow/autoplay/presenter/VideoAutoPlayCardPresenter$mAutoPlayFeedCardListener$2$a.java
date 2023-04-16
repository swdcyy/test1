package com.yxcorp.gifshow.autoplay.presenter.VideoAutoPlayCardPresenter$mAutoPlayFeedCardListener$2$a;
import s99.i;
import com.yxcorp.gifshow.autoplay.presenter.VideoAutoPlayCardPresenter$mAutoPlayFeedCardListener$2;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import x99.z0;
import com.yxcorp.gifshow.entity.QPhoto;
import aa9.b;
import com.kwai.framework.model.feed.BaseFeed;
import w99.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import u99.d;
import im8.f;
import s99.p;
import u99.f;
import v99.a;
import ba9.a;
import u99.a;
import java.lang.System;
import nc6.a;
import android.view.ViewGroup;
import s99.h;

public final class VideoAutoPlayCardPresenter$mAutoPlayFeedCardListener$2$a implements i	// class@001c20
{
    public final VideoAutoPlayCardPresenter$mAutoPlayFeedCardListener$2 b;

    public void VideoAutoPlayCardPresenter$mAutoPlayFeedCardListener$2$a(VideoAutoPlayCardPresenter$mAutoPlayFeedCardListener$2 p0){
       this.b = p0;
       super();
    }
    public boolean C(RecyclerView p0,int p1){
       z0 a;
       VideoAutoPlayCardPresenter$mAutoPlayFeedCardListener$2$a omAutoPlayFe = VideoAutoPlayCardPresenter$mAutoPlayFeedCardListener$2$a.class;
       if (PatchProxy.isSupport(omAutoPlayFe)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, omAutoPlayFe, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "recyclerView");
       d.e("VideoAutoPlayCardPresenter", "acceptPlayFocus", z0.R8(this.b.this$0).mEntity, z0.S8(this.b.this$0), this.b.this$0.q);
       a = this.b.this$0.A;
       if (a != null) {
          p op = a.get();
          if (op != null && op.c(p1) == true) {
             a = this.b.this$0.x;
             if (a != null && !a.f()) {
                a = this.b.this$0.x;
                if (a != null) {
                   a.c();
                }
             }
             a = this.b.this$0.A;
             if (a != null) {
                op = a.get();
                if (op != null) {
                   op.d();
                }
             }
             z0.V8(this.b.this$0).u("focus_dispatch", z0.P8(this.b.this$0));
             a.c(this.b.this$0.F, "", 2);
             return true;
          }
       }
       return false;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, VideoAutoPlayCardPresenter$mAutoPlayFeedCardListener$2$a.class, "1")) {
          return;
       }
       d.e("VideoAutoPlayCardPresenter", "onAttached", z0.R8(this.b.this$0).mEntity, z0.S8(this.b.this$0), this.b.this$0.q);
       z0 x = this.b.this$0.x;
       if (x != null) {
          x.k = String.valueOf(System.currentTimeMillis());
       }
       x = this.b.this$0.x;
       if (x != null) {
          x.l = a.a();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, VideoAutoPlayCardPresenter$mAutoPlayFeedCardListener$2$a.class, "2")) {
          return;
       }
       d.e("VideoAutoPlayCardPresenter", "onDetached", z0.R8(this.b.this$0).mEntity, z0.S8(this.b.this$0), this.b.this$0.q);
       VideoAutoPlayCardPresenter$mAutoPlayFeedCardListener$2 this$0 = this.b.this$0;
       if (this$0.y != null) {
          this$0.b9();
          this.b.this$0.a9();
       }
       return;
    }
    public void c(int p0,int p1,int p2,int p3,int p4,int p5){
       if (PatchProxy.isSupport(VideoAutoPlayCardPresenter$mAutoPlayFeedCardListener$2$a.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, VideoAutoPlayCardPresenter$mAutoPlayFeedCardListener$2$a.class, "4")) {
             return;
          }
       }
       if (!z0.P8(this.b.this$0).g()) {
          return;
       }else {
          z0 a = this.b.this$0.A;
          if (a != null) {
             p op = a.get();
             if (op != null && (!op.c(p2) && z0.V8(this.b.this$0).f(z0.P8(this.b.this$0)))) {
                d.e("VideoAutoPlayCardPresenter", "onScrolled", z0.R8(this.b.this$0).mEntity, z0.S8(this.b.this$0), this.b.this$0.q);
                z0.V8(this.b.this$0).k("scrolled", z0.P8(this.b.this$0));
             }
          }
          return;
       }
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, VideoAutoPlayCardPresenter$mAutoPlayFeedCardListener$2$a.class, "5")) {
          return;
       }
       d.e("VideoAutoPlayCardPresenter", "onDispatchInterrupted", z0.R8(this.b.this$0).mEntity, z0.S8(this.b.this$0), this.b.this$0.q);
       z0.V8(this.b.this$0).k("dispatch_interrupted", z0.P8(this.b.this$0));
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
