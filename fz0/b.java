package fz0.b;
import z1.a;
import fz0.k;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.o;
import t02.a0;
import ry1.b;
import hf3.a;
import mk1.a0;
import fz0.h;
import lnc.c3$a;
import lnc.c3;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.i;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import uw1.m;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import m91.b;
import aq5.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import gz0.e;
import h47.b;
import j47.d;
import android.widget.ImageView;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import z1.k;
import gz0.c;
import java.util.Objects;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kuaishou.livestream.message.nano.LiveCapsuleGiftRedDotNotice;
import lf3.g;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.k;
import gz0.g;
import qm1.a;
import qm1.d;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveAudienceBottomBarGiftAnimationManger;
import mk1.d0;
import jk1.f;
import sr5.a;
import u53.b;
import android.content.Context;
import gz0.h;
import qm1.c;

public final class b implements a	// class@0023dd
{
    public final k a;

    public void b(k p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       b ta = this.a;
       View view = p0;
       p0 = ta.K;
       o oo = new o(p0.b3, p0.C, ta.W);
       c3.c(ta.W, new h(oo));
       p0 = ta.R;
       if (p0 != null) {
          p0.b(ta.Q);
       }
       i oi = new i(ta.L, view, ta.K, ta.U, new MutableLiveData(Boolean.FALSE), oo);
       ta.R = Boolean.FALSE;
       k p = ta.P;
       oi = i.class;
       if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p), Boolean.FALSE, oi, "1")) {
          AudienceBizRelation bOTTOM_BAR_S = AudienceBizRelation.BOTTOM_BAR_SHOP;
          p0.k = Boolean.FALSE.c.Y0.r2(bOTTOM_BAR_S);
          Object[] objArray = null;
          g og = 1;
          if (!PatchProxy.applyVoid(objArray, Boolean.FALSE, oi, "5")) {
             a[] uoaArray = new a[og];
             uoaArray[0] = bOTTOM_BAR_S;
             Boolean.FALSE.c.Y0.u5(Boolean.FALSE.p, uoaArray);
          }
          a0 e = Boolean.FALSE.c.e;
          if (e == null || (e.mIsFromLiveMate != null && !PatchProxy.applyVoid(objArray, Boolean.FALSE, oi, "7"))) {
             e = Boolean.FALSE.c.t1;
             if (e != null) {
                e uoe = new e(Boolean.FALSE);
                p0.m = uoe;
                e.Q1(uoe);
             }
          }
          if (!PatchProxy.applyVoid(objArray, Boolean.FALSE, oi, "9")) {
             ImageView imageView = Boolean.FALSE.b.findViewById(R.id.live_gift_popular_rank_free_ticket_dot_notify);
             if (imageView == null) {
                b.Z(LiveLogTag.GIFT_BOX, "gift box free ticket red dot view is null");
             }
             i f = Boolean.FALSE.f;
             c uoc = PatchProxy.apply(objArray, Boolean.FALSE, oi, "10");
             if (uoc != PatchProxyResult.class) {
             }else {
                uoc = new c(Boolean.FALSE);
             }
             i e1 = Boolean.FALSE.e;
             Objects.requireNonNull(f);
             if (!PatchProxy.applyVoidThreeRefs(uoc, imageView, e1, f, o.class, "1")) {
                f.e = uoc;
                f.d = imageView;
                f.f = e1;
                f.b(og);
                f.f.observeForever(f.g);
                f.a.u0(1088, LiveCapsuleGiftRedDotNotice.class, f.i);
             }
          }
          p0.h = new k(Boolean.FALSE.c, Boolean.FALSE.b, Boolean.FALSE.d, new g(Boolean.FALSE));
          if (p != null) {
             i n = Boolean.FALSE.n;
             if (n != null) {
                n.f();
             }
          }
          LiveAudienceBottomBarGiftAnimationManger liveAudience = new LiveAudienceBottomBarGiftAnimationManger(Boolean.FALSE.c, Boolean.FALSE.b, Boolean.FALSE.a);
          p0.g = liveAudience;
          liveAudience.j(Boolean.FALSE.a());
          Boolean.FALSE.c.x1.Ng(Boolean.FALSE.q);
          if (Boolean.FALSE.n == null && !b.g(Boolean.FALSE.c)) {
             d uod = new d(3, Boolean.FALSE.r, Boolean.FALSE.b.getContext(), new h(Boolean.FALSE), Boolean.FALSE.e);
             p0.n = liveAudience;
          }
       }
    label_0156 :
       return;
    }
}
