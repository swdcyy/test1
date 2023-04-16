package com.yxcorp.gifshow.autoplay.presenter.VideoAutoPlayCardPresenter$mStartPlayListener$2$a;
import v99.a$b;
import com.yxcorp.gifshow.autoplay.presenter.VideoAutoPlayCardPresenter$mStartPlayListener$2;
import java.lang.Object;
import ba9.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import x99.z0;
import java.util.Objects;
import aa9.b;
import u99.f;
import v5a.g;
import com.kwai.framework.player.core.b;
import com.yxcorp.gifshow.autoplay.listener.VideoAutoPlayerStateRecordCallback;
import com.kwai.framework.player.multisource.PlaySourceSwitcher$a;
import elb.e;
import c0d.d;

public final class VideoAutoPlayCardPresenter$mStartPlayListener$2$a implements a$b	// class@001c24
{
    public final VideoAutoPlayCardPresenter$mStartPlayListener$2 a;

    public void VideoAutoPlayCardPresenter$mStartPlayListener$2$a(VideoAutoPlayCardPresenter$mStartPlayListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       z0 p;
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoAutoPlayCardPresenter$mStartPlayListener$2$a.class, "1")) {
          return;
       }
       a.p(p0, "card");
       if (a.g(z0.P8(this.a.this$0), p0)) {
          VideoAutoPlayCardPresenter$mStartPlayListener$2 this$0 = this.a.this$0;
          Objects.requireNonNull(this$0);
          if (!PatchProxy.applyVoid(null, this$0, z0.class, "13")) {
             z0 x = this$0.x;
             String str = "mPlayModule";
             if (x != null) {
                p = this$0.p;
                if (p == null) {
                   a.S(str);
                }
                x.m(p.j());
             }
             x = this$0.x;
             if (x != null) {
                p = this$0.p;
                if (p == null) {
                   a.S(str);
                }
                x.n(p.f());
             }
             x = this$0.C;
             if (x != null) {
                x.c();
             }
             x = this$0.p;
             if (x == null) {
                a.S(str);
             }
             int i = x.e();
             if (!i || (i != 5 && i != 1)) {
                x = this$0.p;
                if (x == null) {
                   a.S(str);
                }
                PlaySourceSwitcher$a uoa = x.c();
                if (uoa != null) {
                   e uoe = uoa.a();
                   if (uoe != null) {
                      z0 x1 = this$0.x;
                      if (x1 != null) {
                         x1.l(uoe.c);
                      }
                      z0 x2 = this$0.x;
                      if (x2 != null) {
                         x2.o(uoe.b);
                      }
                   }
                }
             }
          }
       }
    label_0097 :
       return;
    }
}
