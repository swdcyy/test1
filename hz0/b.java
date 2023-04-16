package hz0.b;
import im8.g;
import k51.c;
import xs5.a;
import hz0.a;
import java.util.HashSet;
import java.util.Stack;
import java.util.HashMap;
import hz0.b$a;
import hz0.b$b;
import hz0.b$c;
import hz0.b$d;
import hz0.b$e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import jk1.c;
import jk1.f;
import nn2.y1;
import com.kuaishou.live.core.show.wishlist.d$c;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.basic.bulletin.CommentAreaOptABContext;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView;
import hz0.c;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$n;
import hz0.d;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import i81.g;
import ug1.s0;
import com.kuaishou.live.common.core.component.gift.ScaleFrameLayout;
import i81.a;
import x43.c;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import java.lang.Long;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.live.common.core.component.gift.gift.p;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import vq5.d;
import com.kwai.framework.model.user.UserInfo;
import mk1.b;
import e92.a;
import android.app.Activity;
import d61.y;
import xp5.a;
import android.view.View;
import android.widget.FrameLayout;
import va1.n0;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import dq5.b;
import ekd.m1;
import android.view.ViewParent;
import com.kwai.robust.PatchProxyResult;
import hz0.h;
import java.util.Map;
import jv1.b;
import lp3.i;
import lp3.c;
import g81.c;

public class b extends c implements g	// class@0027cf
{
    public c A;
    public b B;
    public final a C;
    public CommentAreaOptABContext D;
    public s0 E;
    public r F;
    public a G;
    public c H;
    public c I;
    public y1 J;
    public g p;
    public c q;
    public Set r;
    public ScaleFrameLayout s;
    public GiftAnimContainerView t;
    public View u;
    public View v;
    public Stack w;
    public Map x;
    public b y;
    public a0 z;
    public static String sLivePresenterClassName = "LiveAudienceGiftAnimContainerViewPresenter";

    public void b(a p0){
       super();
       this.q = a.b;
       this.r = new HashSet();
       this.w = new Stack();
       this.x = new HashMap();
       this.F = new b$a(this);
       this.G = new b$b(this);
       this.H = new b$c(this);
       this.I = new b$d(this);
       this.J = new b$e(this);
       this.C = p0;
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "5")) {
          return;
       }
       this.z.x1.fl(this.I);
       this.z.y1.c(this.J);
       if (!PatchProxy.applyVoid(objArray, this, uob, "9")) {
          if (this.D == null) {
             this.D = CommentAreaOptABContext.a(this.C.b);
          }
          this.t.a(this.D.c(), this.D.e());
          this.t.setOnTopItemClickListener(new c(this));
          this.t.setOnBottomItemClickListener(new d(this));
          this.t.setIsAnchor(false);
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "6")) {
          LiveBulletinLayoutManager liveBulletin = this.p.i7();
          if (liveBulletin != null) {
             s0 os0 = new s0(this.t, this.s);
             this.E = os0;
             liveBulletin.m(os0);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       this.z.x1.ii(this.I);
       this.z.y1.e(this.J);
       this.t.setLiveGiftUnitViewListener(null);
       return;
    }
    public void P8(GiftMessage p0){
       int i2;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "10")) {
          return;
       }
       if (this.z.x1 != null) {
          Gift gift = a.a(p0.mGiftId);
          int i = 0;
          if (gift != null) {
             Object[] objArray = new Object[]{Long.valueOf(gift.mGiftType)};
             b.d0(LiveLogTag.GIFT, "onClickGiftAnimIcon", "giftId", Integer.valueOf(gift.mId), "giftType", String.format("0x%x", objArray));
          }
          gift = (gift != null && gift.isNormalGift())? gift.mId: -1;
          int i1 = 46;
          if (a.t().u("SOURCE_LIVE").d("enableClickGiftSlotOpenVoiceGiftPanel", i)) {
             this.z.p2.r4(p.f(gift, i1), this.getContext());
             return;
          }else {
             b tz = this.z;
             tz.x1.bb(a.b(null, gift, i1, tz));
          }
       }
       return;
    }
    public void R8(int p0){
       int id;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "3")) {
          return;
       }
       if (this.p.R6()) {
          return;
       }
       if (y.d(this.getActivity())) {
          return;
       }
       if (this.z.y4().d() && this.z.y4().e()) {
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "8")) {
             if (p0 > (this.v.getHeight() - this.s.getBottom())) {
                n0.o(this.s, 0);
                n0.t(this.s, -1);
                n0.n(this.s, p0);
             }else {
                n0.t(this.s, R.id.live_comment_top_guideline);
                n0.o(this.s, -1);
                n0.n(this.s, 0);
             }
          }
          return;
       }else {
          int height = this.u.getHeight();
          p0 = p0 - (n.j(this.getActivity()) - this.v.getBottom());
          if (this.z.y4().d()) {
             if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(height), Integer.valueOf(p0), this, uob, "4")) {
                if (p0 > height) {
                   n0.o(this.s, 0);
                   n0.n(this.s, p0);
                }else {
                   b ts = this.s;
                   id = this.u.getId();
                   n0 on0 = n0.class;
                   if (!PatchProxy.isSupport(on0) || !PatchProxy.applyVoidTwoRefs(ts, Integer.valueOf(id), null, on0, "28")) {
                      ViewGroup$LayoutParams layoutParams = ts.getLayoutParams();
                      if (layoutParams instanceof ConstraintLayout$LayoutParams && layoutParams.j != id) {
                         layoutParams.j = id;
                         layoutParams.k = -1;
                         ts.setLayoutParams(layoutParams);
                      }
                   }
                   n0.n(this.s, 0);
                }
             }
             return;
          }else {
             this.B.e(p0);
             this.B.a();
             return;
          }
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a10a6);
       this.t = m1.f(p0, 0x7f0a1092);
       this.u = m1.f(p0, 0x7f0a2539);
       this.v = this.s.getParent();
       this.t.setLiveGiftUnitViewListener(this.H);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new h());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.y = this.q8(b.class);
       this.z = this.q8(a0.class);
       this.p = this.r8("LIVE_SERVICE_MANAGER").a(g.class);
       this.A = this.q8(c.class);
       this.B = this.q8(b.class);
       return;
    }
}
