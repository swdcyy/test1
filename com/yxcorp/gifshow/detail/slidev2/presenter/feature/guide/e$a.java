package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.e$a;
import jta.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import im8.f;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slideplay.c;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import com.yxcorp.utility.n;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import rf5.u;
import com.kwai.framework.model.user.User;
import h9a.a;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import le5.f;
import com.kwai.library.widget.popup.bubble.a$c;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$Excluded;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import h9a.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import android.view.View;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import lnc.a1;
import com.kwai.library.widget.popup.bubble.a;
import com.kwai.library.widget.popup.common.c;

public class e$a extends a	// class@00198a
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       boolean b1;
       a c;
       boolean b2;
       e uoe = e.class;
       e$a uoa = e$a.class;
       String str = "1";
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, str)) {
          return;
       }
       if (!p0 - null) {
          e$a ta = this.a;
          Objects.requireNonNull(ta);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          Object[] objArray = null;
          a obj = PatchProxy.apply(objArray, ta, uoe, "5");
          boolean b = false;
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else if(!ta.s.isAtlasPhotos() && (!ta.s.isLongPhotos() && !ta.q.get().booleanValue())){
             Object obj1 = PatchProxy.apply(objArray, ta, uoe, "9");
             if (obj1 != patchProxyRe) {
                b2 = obj1.booleanValue();
             }else if(ta.t == null && !c.k(ta.getActivity(), ta.s)){
                b2 = true;
             }else {
                b2 = false;
             }
             if (b2 && (NasaFeatureGuideManager.f().o() && (!NasaFeatureGuideManager.f().m() && (!n.I(ta.getActivity()) && !SlideGuideManager.a().b(ta.getActivity()))))) {
                b1 = true;
             }
          }
       label_00a6 :
          b1 = false;
          if (b1) {
             ta = this.a;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoid(objArray, ta, uoe, "6") && ta.w != null) {
                ta.p.F(b, 7);
                int i = (ta.s.getUser().isMale())? 0x7f104c87: 0x7f104c86;
                e w = ta.w;
                e y = ta.y;
                Objects.requireNonNull(w);
                obj = a.class;
                if (!PatchProxy.isSupport(obj) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), y, w, obj, str)) {
                   a.p(y, "onVisibilityListener");
                   if (w.b != null && (w.c != null || !f.o())) {
                      a$c uoc = new a$c(w.d);
                      uoc.P(true);
                      uoc.D(PopupInterface$Excluded.NOT_AGAINST);
                      uoc.T(5000);
                      uoc.F(objArray);
                      uoc.N(objArray);
                      uoc.L(new b(i));
                      uoc.M(y);
                      if (f.o()) {
                         c = w.c;
                         a.m(c);
                         uoc.o0(c);
                         uoc.D0(BubbleInterface$Position.LEFT);
                         uoc.C0(((- (a1.d(R.dimen.arg_RES_7f070fdf) + w.c.getHeight())) / 2));
                         uoc.B0((w.c.getWidth() + a1.e(0x3f800000)));
                      }else {
                         uoc.o0(w.b);
                         uoc.D0(BubbleInterface$Position.LEFT);
                         uoc.B0(a1.e(0xc0f00000));
                      }
                      c = uoc.e0();
                      w.a = c;
                      c.Z();
                   }
                }
             }
          }
       }
    label_0181 :
       return;
    }
}
