package dca.d;
import androidx.lifecycle.Observer;
import dca.a;
import android.widget.RelativeLayout;
import java.lang.Object;
import cca.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import cca.a;
import java.util.Objects;
import xoc.d;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Integer;
import lnc.a1;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.widget.TextView;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.aicut.ui.loading.AICutLoadingImageChangeView;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;
import tkd.b;
import tkd.d;
import h69.b;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.v3.editor.i;
import dca.e;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import java.util.concurrent.TimeUnit;
import dca.f;
import erd.a;
import dca.g;
import dca.h;
import erd.g;
import crd.b;
import faa.a;
import q87.c;
import lq.i;
import lq.a;
import com.kwai.video.editorsdk2.VideoEditorSession;
import com.kwai.video.editorsdk2.PreviewPlayer;
import xoc.c;
import android.animation.ObjectAnimator;
import th0.n;
import android.animation.TimeInterpolator;
import xoc.f;
import android.animation.Animator$AnimatorListener;
import dca.c;
import java.lang.Runnable;

public final class d implements Observer	// class@001ef0
{
    public final a b;
    public final boolean c;
    public final RelativeLayout d;

    public void d(a p0,boolean p1,RelativeLayout p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onChanged(Object p0){
       d tb;
       a f;
       d a;
       z a1;
       boolean i;
       d a3;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          b uob = this.b.k.u0();
          p0 = p0.e();
          if (p0 != null) {
             if (this.c != null) {
                tb = this.b;
                if (tb.n == null) {
                   tb.E();
                }
             }
             tb = this.b;
             a uoa1 = uob.e();
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidTwoRefs(p0, uoa1, tb, uoa, "6")) {
                i = p0.d();
                if (uoa1 != null && i != uoa1.d()) {
                   String str1 = "editBtn";
                   if (i) {
                      a3 = d.a;
                      f = tb.i;
                      if (f == null) {
                         a.S(str1);
                      }
                      a3.a(f);
                   }else {
                      a3 = d.a;
                      f = tb.i;
                      if (f == null) {
                         a.S(str1);
                      }
                      a3.b(f);
                   }
                }
             }
             tb = this.b;
             uoa1 = p0.c;
             Objects.requireNonNull(tb);
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(uoa1), tb, uoa, "10")) {
                i = 0x7f100b0f;
                f = tb.c;
                if (f == null) {
                   a.S("progressText");
                }
                f.setText(a1.q(i, uoa1)+"%");
             }
             Bitmap uBitmap = p0.b();
             uoa1 = uob.e();
             AICutErrorCode uAICutErrorC = null;
             Bitmap uBitmap1 = (uoa1 != null)? uoa1.b(): uAICutErrorC;
             if (a.g(uBitmap, uBitmap1) ^ 0x01) {
                f = this.b.f;
                if (f == null) {
                   a.S("assetImage");
                }
                f.a(p0.b());
             }
             if (p0.c() != null) {
                AICutErrorCode uAICutErrorC1 = p0.c();
                a.m(uAICutErrorC1);
                d.a(-873393519).r00(uAICutErrorC1);
                p0.h = uAICutErrorC;
             }
             boolean b = p0.f();
             uoa1 = uob.e();
             String str = "3";
             if (uoa1 == null || b != uoa1.f()) {
                if (p0.f()) {
                   tb = this.b;
                   Objects.requireNonNull(tb);
                   if (!PatchProxy.applyVoid(uAICutErrorC, tb, uoa, "11")) {
                      VideoSDKPlayerView videoSDKPlay = tb.p.j();
                      a.m(videoSDKPlay);
                      a.o(videoSDKPlay, "editorHelperContract.videoSDKPlayerView!!");
                      a1 = d.a;
                      t ot = t.fromCallable(new e(videoSDKPlay)).subscribeOn(d.c).timeout(1, TimeUnit.SECONDS).observeOn(a1).doFinally(new f(videoSDKPlay)).observeOn(a1);
                      g og = new g(videoSDKPlay);
                      tb.m = ot.subscribe(og, h.b);
                   }
                }else {
                   tb = this.b;
                   Objects.requireNonNull(tb);
                   if (!PatchProxy.applyVoid(uAICutErrorC, tb, uoa, "12")) {
                      uoa1 = tb.m;
                      if (uoa1 != null) {
                         uoa1.dispose();
                      }
                      VideoSDKPlayerView videoSDKPlay1 = tb.p.j();
                      if (videoSDKPlay1 != null) {
                         Object[] objArray = new Object[0];
                         a.D().w("AICutStyleLoadingViewBinder", "restorePlayer", objArray);
                         uoa1 = i.m().p();
                         a.o(uoa1, "PostSession.current\(\).editSession\(\)");
                         uoa1.t();
                         Objects.requireNonNull(uoa1.q(), "EditSession should be initialized first");
                         VideoEditorSession videoEditorS = uoa1.q();
                         a.m(videoEditorS);
                         videoSDKPlay1.initialize(videoEditorS, uoa1.s());
                         c a2 = c.a;
                         a.o(videoSDKPlay1, "this");
                         Objects.requireNonNull(a2);
                         if (!PatchProxy.applyVoidOneRefs(videoSDKPlay1, a2, c.class, str)) {
                            a.p(videoSDKPlay1, "playerView");
                            videoSDKPlay1.seekTo(0);
                            videoSDKPlay1.play();
                         }
                      }
                   }
                }
             }
             b = p0.e();
             uoa1 = uob.e();
             if (uoa1 == null || (b != uoa1.e() && !p0.e())) {
                tb = this.b;
                Objects.requireNonNull(tb);
                if (!PatchProxy.applyVoid(uAICutErrorC, tb, uoa, "8")) {
                   uoa = tb.l;
                   if (uoa != null) {
                      uoa.dispose();
                   }
                   a = d.a;
                   uoa1 = tb.j;
                   if (uoa1 == null) {
                      a.S("loadingLayout");
                   }
                   Objects.requireNonNull(a);
                   if (!PatchProxy.applyVoidOneRefs(uoa1, a, d.class, str)) {
                      a.p(uoa1, "view");
                      ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(uoa1, "alpha", new float[2]{0x3f800000,0});
                      a.o(objectAnimat, "fadeOut");
                      objectAnimat.setInterpolator(new n());
                      objectAnimat.setDuration(300);
                      objectAnimat.addListener(new f(uoa1));
                      objectAnimat.start();
                   }
                   f = tb.d;
                   if (f == null) {
                      a.S("progressView");
                   }
                   a.b(f);
                }
                this.d.post(new c(p0, this, uob));
             }
          }
       }
       return;
    }
}
