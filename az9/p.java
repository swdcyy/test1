package az9.p;
import erd.g;
import az9.i0;
import java.lang.Object;
import d6a.e;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.b;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import bz9.h;
import kotlin.jvm.internal.a;
import lnc.ja;
import v6a.m0;
import java.lang.Boolean;
import brd.y;
import i3a.b;
import tkd.b;
import tkd.d;
import nl9.u;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import f6a.c;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import mf5.s0$a;
import kf5.x;
import mf5.v0;
import cz9.a;
import mf5.v0$a;
import java.util.List;
import trd.t;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import kf5.x$a;
import bz9.f;
import android.content.DialogInterface$OnDismissListener;
import android.app.Dialog;
import bz9.g;
import android.content.DialogInterface$OnCancelListener;
import com.yxcorp.gifshow.comment.e;
import de5.a;
import p5a.e;
import com.kwai.framework.player.core.b;
import xx9.a;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.yxcorp.gifshow.share.widget.d;
import qrd.l1;
import com.kwai.component.photo.detail.slide.negative.operation.NewPlayerFeedbackPanel;
import mf5.s0;
import com.kwai.robust.PatchProxyResult;
import cz9.c;
import cz9.b;
import com.kwai.component.photo.detail.slide.negative.operation.NewPlayerFeedbackPanel$a;
import bz9.d;
import bz9.e;
import kf5.l;

public final class p implements g	// class@000336
{
    public final i0 b;

    public void p(i0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a a;
       PhotoDetailParam mPhoto;
       p tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, i0.class, "9")) {
       }else if(!tb.J() || VisitorModeManager.f()){
          boolean b = true;
          tb.U0 = b;
          i0 y = tb.Y;
          Objects.requireNonNull(y);
          h oh = h.class;
          String str = "1";
          if (!PatchProxy.applyVoidOneRefs(p0, y, oh, str)) {
             a.p(p0, "param");
             ja.a();
             y.c(false);
             y.c.m0 = p0.a();
             y.c.k0.onNext(Boolean.TRUE);
             b d = b.d;
             p0 = (p0.c != null)? "more_btn": "long_click";
             Objects.requireNonNull(d);
             if (!PatchProxy.applyVoidOneRefs(p0, d, b.class, str)) {
                a.p(p0, "<set-?>");
                b.b = p0;
             }
             h c = y.c;
             p0 = d.a(-1694791652).tg(c.c.mPhoto, c.a);
             if (!c.b() && (!c.a() || !y.d.a0())) {
                b = false;
             }
             String str1 = "callerContext.mFragment";
             String str2 = "callerContext.mActivity";
             String str3 = "callerContext.mPhotoDetailParam.mPhoto";
             if (p0 instanceof s0$a || (p0 == null && b)) {
                NewPlayerFeedbackPanel$a e1 = NewPlayerFeedbackPanel.e1;
                a = y.c.a;
                a.o(a, str2);
                a b1 = y.c.b;
                a.o(b1, str1);
                mPhoto = y.c.c.mPhoto;
                a.o(mPhoto, str3);
                if (p0 == null) {
                   p0 = PatchProxy.apply(null, y, oh, "2");
                   if (p0 != PatchProxyResult.class) {
                   }else {
                      p0 = y.c.c.mPhoto;
                      a.o(p0, str3);
                      p0 = (p0.isVideoType())? new c(y.c, y.d): new b(y.c, y.d);
                   }
                }else {
                }
                p0 = e1.a(a, b1, mPhoto, new s0(t.k(p0)));
                p0.setOnDismissListener(new d(y));
                p0.setOnCancelListener(new e(y));
                p0.U0 = y.c.r.c();
                p0.Z = y.c.c.mDetailCommonParam.mPreInfo;
                p0.show();
                y.b = p0;
             }else {
                x$a w = x.W;
                a a1 = y.c.a;
                a.o(a1, str2);
                a = y.c.b;
                a.o(a, str1);
                mPhoto = y.c.c.mPhoto;
                a.o(mPhoto, str3);
                if (p0 == null) {
                   p0 = new a(y.c, y.d);
                }else {
                }
                p0 = w.a(a1, a, mPhoto, new v0(t.k(p0)));
                p0.setOnDismissListener(new f(y));
                p0.setOnCancelListener(new g(y));
                p0.D(y.c.l);
                m0 j = y.c.j;
                a.o(j, "callerContext.mPlayModule");
                p0.F(j.c());
                j = y.c.j;
                a.o(j, "callerContext.mPlayModule");
                e player = j.getPlayer();
                a.o(player, "callerContext.mPlayModule.player");
                p0.E(player.getCurrentTranscodeType());
                p0.Q = y.c.r.c();
                p0.R = y.c.c.mDetailCommonParam.mPreInfo;
                p0.show();
                y.b = p0;
             }
          }
       }
       return;
    }
}
