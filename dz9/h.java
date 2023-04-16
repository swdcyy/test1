package dz9.h;
import mf5.w0;
import v6a.m0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import f6a.a;
import km5.i;
import xx9.a;
import com.kwai.feature.api.danmaku.DanmakuSwitchUtil;
import kf5.g;
import mm5.c;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import k2b.e0;
import com.kwai.feature.api.danmaku.DanmakuUtil;
import java.lang.CharSequence;
import e17.i;

public final class h extends w0	// class@002013
{
    public final BaseFragment C;
    public final QPhoto D;
    public final m0 E;
    public final SlidePageConfig F;

    public void h(m0 p0,SlidePageConfig p1){
       a.p(p0, "callerContext");
       a.p(p1, "pageConfig");
       super("danmaku_disable");
       this.E = p0;
       this.F = p1;
       this.C = p0.b;
       this.D = p0.c.mPhoto;
       this.T(R.string.arg_RES_7f10484e);
       this.L(R.drawable.arg_RES_7f080afd);
    }
    public boolean E(){
       h obj = PatchProxy.apply(null, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.D;
       a.o(obj, "photo");
       int i = 0;
       if (a.b(obj)) {
          a c = this.E.c;
          a.o(c, "callerContext.mPhotoDetailParam");
          if (i.e(c, i, 2, null)) {
             m0 r = this.E.r;
             if (r != null && (!r.c() && (this.E.c.showDanmkuSwitch != null && !DanmakuSwitchUtil.b(this.D)))) {
                i = true;
             }
          }
       }
       return i;
    }
    public void d(w0 p0,g p1){
       h oh = h.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, oh, "2")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       p1.a();
       if (!PatchProxy.applyVoid(null, this, oh, "3")) {
          h tC = this.C;
          a.o(tC, "fragment");
          h tD = this.D;
          a.o(tD, "photo");
          c.a.a(tC, tD, DanmakuSwitchUtil.b(this.D), DanmakuSwitchUtils.h.g(this.D), false, "PLAYER_PANEL_POPUP");
          i.d(R.style.arg_RES_7f11066a, DanmakuUtil.b(this.D));
       }
       return;
    }
    public void onShow(){
    }
}
