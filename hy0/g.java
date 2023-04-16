package hy0.g;
import hy0.p$b;
import hy0.p;
import java.lang.Object;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kuaishou.live.core.basic.model.LivePayBulletResponse;
import hy0.y;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Boolean;
import hy0.w;
import java.lang.reflect.Type;
import el.a;
import java.util.Map;
import ow0.a;
import fq5.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import hy0.v;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import u07.t$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import hy0.h;
import hy0.u;
import ya1.j$b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.CharSequence;
import android.text.TextUtils;
import w07.n;
import w07.l;
import w07.i;
import com.kwai.library.widget.popup.common.PopupInterface$g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import hy0.i;
import u07.u;
import hy0.l;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class g implements p$b	// class@0027a7
{
    public final p a;

    public void g(p p0){
       this.a = p0;
    }
    public final void a(BaseEditorFragment$g p0){
       int b;
       i3 obj1;
       g ta = this.a;
       Objects.requireNonNull(ta);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p op = p.class;
       if (PatchProxy.applyVoidOneRefs(p0, ta, op, "2")) {
       }else {
          LivePayBulletResponse livePayBulle = y.b(ta.p);
          ta.w = livePayBulle;
          if (livePayBulle == null) {
             b.Z(LiveLogTag.LIVE_BULLET_COMMENT, "sendLiveBullet mLivePayBulletResponse null");
          }else {
             String str = String.valueOf(livePayBulle.getLivingTypeVal());
             String str1 = "4";
             Map obj = PatchProxy.applyOneRefs(str, null, y.class, str1);
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                obj = a.j(new w().getType());
                b = (obj == null || obj.get(str) == null)? true: obj.get(str).booleanValue();
             }
             p op1 = (b && !ta.w.getLeftFreeCount())? 1: null;
             if (op1) {
                p0 = p0.c;
                if (!PatchProxy.applyVoidOneRefs(p0, ta, op, str1)) {
                   ClientContent$LiveStreamPackage liveStreamPa = ta.p.b().a();
                   b = ta.w.getPrice();
                   int livingTypeVa = ta.w.getLivingTypeVal();
                   if (!PatchProxy.isSupport(v.class) || !PatchProxy.applyVoidThreeRefs(liveStreamPa, Integer.valueOf(b), Integer.valueOf(livingTypeVa), null, v.class, "4")) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "BARRAGE_PRICE_PROMPT_POPUP";
                      obj1 = i3.f();
                      obj1.d("barrage_price", String.valueOf(b));
                      obj1.d("acu_type", v.d(livingTypeVa));
                      uElementPack.params = obj1.e();
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.liveStreamPackage = liveStreamPa;
                      u1.u0(9, uElementPack, uContentPack);
                   }
                   t$a uoa = new t$a(ta.getActivity());
                   b = 0x7f101ef4;
                   str1 = a1.p(b);
                   h oh = new h(ta);
                   obj1 = PatchProxy.applyThreeRefs(uoa, str1, oh, null, p.class, "10");
                   if (obj1 != patchProxyRe) {
                      uoa = obj1;
                   }else {
                      uoa.v0(new u(uoa, oh));
                      CharSequence[] uCharSequenc = new CharSequence[true];
                      if (TextUtils.isEmpty(str1)) {
                         str1 = a1.p(b);
                      }
                      uCharSequenc[0] = str1;
                      uoa.P0(uCharSequenc);
                      uoa.N0(R.layout.arg_RES_7f0d0a9e);
                      uoa.a0(new n());
                      uoa.a0(new i());
                      uoa.L(new PopupInterface$g(R.layout.arg_RES_7f0d02ec));
                   }
                   uoa.T0(a1.p(R.string.arg_RES_7f103a83));
                   uoa.R0(a1.p(R.string.cancel));
                   uoa.X0(a1.r(R.string.arg_RES_7f101ef5, ta.w.getLivingType()));
                   uoa.z0(a1.q(R.string.arg_RES_7f101ef3, ta.w.getPrice()));
                   uoa.t0(new i(ta));
                   uoa.u0(new l(ta, p0));
                   uoa.v(true);
                   uoa.z(true);
                   uoa.Y(PopupInterface.a);
                }
             }else {
                ta.P8(p0.c, ta.w.getPrice());
             }
          }
       }
       return;
    }
}
