package dz9.i;
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
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import f6a.c;
import com.yxcorp.gifshow.entity.QPhoto;
import f6a.a;
import xx9.a;
import km5.i;
import kf5.g;
import com.yxcorp.gifshow.util.rx.RxBus;
import bz9.b;
import com.kwai.feature.api.danmaku.model.DanmakuSettingAnchorViewType;
import mm5.c;
import java.util.Objects;
import sm5.b;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import qrd.l1;
import k2b.e0;
import mm5.d;
import java.lang.Runnable;
import t45.c;

public final class i extends w0	// class@002014
{
    public final BaseFragment C;
    public final QPhoto D;
    public final m0 E;
    public final SlidePageConfig F;

    public void i(m0 p0,SlidePageConfig p1){
       a.p(p0, "callerContext");
       a.p(p1, "pageConfig");
       super("danmaku_setting");
       this.E = p0;
       this.F = p1;
       this.C = p0.b;
       this.D = p0.c.mPhoto;
       this.T(R.string.arg_RES_7f103d38);
       int i = (this.W())? 0x7f080b14: 0x7f080aff;
       this.L(i);
       this.H(true);
       this.V(R.drawable.arg_RES_7f080aec);
       return;
    }
    public boolean D(){
       Object obj = PatchProxy.apply(null, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.X() && (!this.W() || DanmakuSwitchUtils.h.f()))? true: false;
       return b;
    }
    public boolean E(){
       Object obj = PatchProxy.apply(null, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (DanmakuSwitchUtils.h.f() && this.X())? true: false;
       return b;
    }
    public final boolean W(){
       Object obj = PatchProxy.apply(null, this, i.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!c.a() || (this.F.a0() || c.b()))? true: false;
       return b;
    }
    public final boolean X(){
       int i;
       i obj = PatchProxy.apply(null, this, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.D;
       a.o(obj, "photo");
       i = 0;
       if (a.b(obj)) {
          m0 r = this.E.r;
          if (r != null && !r.c()) {
             a c = this.E.c;
             if (c.showDanmkuSwitch != null) {
                a.o(c, "callerContext.mPhotoDetailParam");
                if (i.f(c, i, 2, null)) {
                   i = true;
                }
             }
          }
       }
       return i;
    }
    public void d(w0 p0,g p1){
       c a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "3")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       p1.a();
       RxBus.f.b(new b(true, null));
       a = c.a;
       i tC = this.C;
       String str = "fragment";
       a.o(tC, str);
       i tD = this.D;
       String str1 = "photo";
       a.o(tD, str1);
       boolean b = DanmakuSwitchUtils.h.d();
       Objects.requireNonNull(a);
       if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidThreeRefs(tC, tD, Boolean.valueOf(b), a, c.class, "9")) {
          a.p(tC, str);
          a.p(tD, str1);
          i3 oi3 = i3.f();
          oi3.c("danmauk_state", Integer.valueOf(b));
          oi3.d("show_pos", "PORTRAIT");
          oi3.d("source", "PLAYER_PANEL_SHARE");
          oi3.d("button_pos", "PLAYER_PANEL_POPUP");
          a.o(oi3, "JsonStringBuilder.newIns¡­PLAYER_PANEL_POPUP\)\n    }");
          b.a.e(tC, tD, "DAMAKU_SETTING_BTN", oi3);
       }
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       c a = c.a;
       i tC = this.C;
       a.o(tC, "fragment");
       i tD = this.D;
       a.o(tD, "photo");
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidTwoRefs(tC, tD, a, c.class, "8")) {
          a.p(tC, "fragment");
          a.p(tD, "photo");
          c.a(new d(tC, tD));
       }
       return;
    }
}
