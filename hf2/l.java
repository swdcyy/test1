package hf2.l;
import a51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hf2.p;
import wj2.r;
import hf2.f;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import hf2.g;
import hf2.h;
import hf2.o;
import com.kuaishou.live.core.show.profilecard.b;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import m91.b;
import t02.r1;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import aq5.a;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import t02.a0;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import com.kuaishou.live.core.show.profilecard.http.LiveUserProfileExtraInfo;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import java.util.Objects;
import java.lang.Integer;
import d61.y;
import com.yxcorp.utility.n;
import com.kwai.framework.model.user.User;
import co2.i0;
import ne2.k;
import com.kwai.framework.model.user.UserInfo;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatTextView;
import lnc.a1;
import java.lang.CharSequence;
import android.content.Context;
import androidx.core.content.ContextCompat;
import wca.m$a;
import wca.m;
import com.kwai.library.widget.gravityeffect.KwaiGravityEffectButton;
import android.content.res.Resources;
import java.lang.Number;
import cf2.c;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import ekd.m1;
import hf2.l$a;
import android.view.View$OnClickListener;
import hf2.d;
import hf2.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import wj2.l0;
import androidx.fragment.app.Fragment;
import tx1.d;
import wj2.n0;

public class l extends c	// class@002d88
{
    public boolean A;
    public p B;
    public o C;
    public r D;
    public LiveProfileParams E;
    public GifshowActivity F;
    public User G;
    public l0 H;
    public Fragment I;
    public d J;
    public k K;
    public n0 L;
    public KwaiGravityEffectButton v;
    public TextView w;
    public TextView x;
    public View y;
    public boolean z;
    public static String sLivePresenterClassName = "LiveProfileAnchorOperationBarPresenter";

    public void l(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       super.E8();
       this.B = new p();
       l tD = this.D;
       tD.o.observe(tD.e, new f(this));
       tD = this.D;
       tD.n.observe(tD.e, new g(this));
       tD = this.D;
       tD.q.observe(tD.e, new h(this));
       this.C = new o();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l.class, "4")) {
          return;
       }
       super.J8();
       this.z = false;
       this.A = false;
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, l.class, "28")) {
          return;
       }
       b.c(this.D);
       return;
    }
    public final UserProfile V8(){
       Object obj = PatchProxy.apply(null, this, l.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.D.n.getValue();
    }
    public final boolean W8(){
       r obj = PatchProxy.apply(null, this, l.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.D.x;
       if (obj != null) {
          return obj.O().r2(AnchorBizRelation.VOICE_PARTY_TEAM_PK);
       }
       if (this.E.isVoicePartyAdmin()) {
          obj = this.D.w;
          if (obj != null) {
             return obj.N().r2(AudienceBizRelation.VOICE_PARTY_TEAM_PK);
          }
       }
       return false;
    }
    public final void X8(){
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "6")) {
          return;
       }
       if (this.V8() != null) {
          LiveUserProfileExtraInfo liveUserProf = PatchProxy.apply(objArray, this, ol, "30");
          if (liveUserProf == PatchProxyResult.class) {
             liveUserProf = this.D.o.getValue();
          }
          if (liveUserProf != null) {
             ol = this.B;
             Activity activity = this.getActivity();
             int measuredWidt = this.y.getMeasuredWidth();
             Objects.requireNonNull(ol);
             p op = p.class;
             if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidTwoRefs(activity, Integer.valueOf(measuredWidt), ol, op, "1")) {
                ol.a = (y.d(activity))? measuredWidt - p.c: n.k(activity) - p.d;
             }
          label_0063 :
             if (this.G.isFollowingOrFollowRequesting()) {
                this.a9();
             }else {
                this.c9();
             }
          }
       }
       return;
    }
    public final void Y8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l.class, "26")) {
          return;
       }
       if (this.A == null) {
          this.K.h(this.G.mId, objArray);
          this.A = true;
       }
       UserProfile userProfile = this.V8();
       if (userProfile == null) {
          return;
       }else if(("F").equals(userProfile.mProfile.mSex)){
          this.x.setText(R.string.arg_RES_7f10023f);
       }else {
          this.x.setText(R.string.arg_RES_7f10023e);
       }
       return;
    }
    public final void Z8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l.class, "12")) {
          return;
       }
       this.v.setCompoundDrawables(objArray, objArray, objArray, objArray);
       this.v.setText(a1.p(R.string.arg_RES_7f100f8f));
       this.v.setEnabled(true);
       this.v.setTextColor(ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f061e52));
       return;
    }
    public final void a9(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p op = p.class;
       Object[] objArray = null;
       String str = "8";
       if (PatchProxy.applyVoid(objArray, this, l.class, str)) {
          return;
       }
       this.K.k(-1, this.E, this.G.mVisitorBeFollowed, objArray);
       this.v.setVisibility(0);
       this.v.setCompoundDrawables(objArray, objArray, objArray, objArray);
       this.v.setTextColor(ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f061e52));
       this.v.setText(m.a(this.G).a);
       this.v.setEnableGravityEffect(0);
       this.v.setBackground(this.l8().getDrawable(R.drawable.arg_RES_7f0813f1).mutate());
       this.v.setEnabled(true);
       float f = 0;
       if (this.D.t != null) {
          this.b9(this.B.i(), this.B.a(), this.B.i(), a1.e(f), this.B.e(), this.B.b());
          this.w.setBackground(this.l8().getDrawable(R.drawable.arg_RES_7f081188).mutate());
       }else {
          int i1 = this.B.f();
          int i2 = a1.e(f);
          int i3 = this.B.f();
          l tB = this.B;
          Objects.requireNonNull(tB);
          Object obj = PatchProxy.apply(objArray, tB, op, "7");
          int i4 = (obj != patchProxyRe)? obj.intValue(): tB.f() + p.b;
          int i5 = i4;
          int i6 = this.B.f();
          tB = this.B;
          Objects.requireNonNull(tB);
          Object obj1 = PatchProxy.apply(objArray, tB, op, str);
          int i7 = (obj1 != patchProxyRe)? obj1.intValue(): (tB.f() * 2) + (p.b * 2);
          this.b9(i1, i2, i3, i5, i6, i7);
       }
       this.x.setVisibility(0);
       this.Y8();
       this.w.setVisibility(0);
       int i = 0x7f102e44;
       if (this.E.isInVoiceParty()) {
          if (this.E.isCrossRoomPkOpponentGuest() || this.E.isCrossRoomPkOpponentAnchor()) {
             this.w.setEnabled(0);
          }else if(this.E.isVoicePartyGuest()){
             this.w.setEnabled(0);
          }else {
             this.w.setEnabled((this.W8() ^ true));
             i = 0x7f1050e7;
             c uoc = this.D.c();
             e0 uoe0 = uoc.c();
             this.K.u(uoe0, uoc.y(), this.D.b.mId);
          }
       }else {
          this.K.p(this.E.getProfileOriginSource(), this.G.mId);
          i = 0x7f101ffb;
       }
       this.w.setText(i);
       return;
    }
    public final void b9(int p0,int p1,int p2,int p3,int p4,int p5){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, ol, "9")) {
             return;
          }
       }
       this.B.j(this.v, p0, p1);
       this.B.j(this.x, p2, p3);
       this.B.j(this.w, p4, p5);
       return;
    }
    public final void c9(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p op = p.class;
       Object[] objArray = null;
       String str = "10";
       if (PatchProxy.applyVoid(objArray, this, l.class, str)) {
          return;
       }
       this.K.k(1, this.E, this.G.mVisitorBeFollowed, objArray);
       float f = 0;
       if (this.D.t != null) {
          this.b9(this.B.e(), this.B.b(), this.B.i(), a1.e(f), this.B.i(), this.B.a());
       }else {
          int i1 = this.B.e();
          int i2 = a1.e(f);
          int i3 = this.B.i();
          l tB = this.B;
          Objects.requireNonNull(tB);
          Object obj = PatchProxy.apply(objArray, tB, op, "9");
          i = (obj != patchProxyRe)? obj.intValue(): tB.e() + p.b;
          int i4 = i;
          int i5 = this.B.i();
          tB = this.B;
          Objects.requireNonNull(tB);
          Object obj1 = PatchProxy.apply(objArray, tB, op, str);
          int i6 = (obj1 != patchProxyRe)? obj1.intValue(): (tB.e() + tB.i()) + (p.b * 2);
          this.b9(i1, i2, i3, i4, i5, i6);
       }
       this.v.setVisibility(0);
       this.v.setEnableGravityEffect(1);
       this.v.setBackground(this.l8().getDrawable(R.drawable.arg_RES_7f081188).mutate());
       this.v.setCompoundDrawables(objArray, objArray, objArray, objArray);
       this.v.setText(m.a(this.G).a);
       this.x.setVisibility(0);
       this.Y8();
       this.w.setVisibility(0);
       i = 0x7f102e44;
       if (this.E.isInVoiceParty()) {
          if (this.E.isCrossRoomPkOpponentGuest() || this.E.isCrossRoomPkOpponentAnchor()) {
             this.w.setEnabled(0);
          }else if(this.E.isVoicePartyGuest()){
             this.w.setEnabled(0);
          }else {
             this.w.setEnabled((this.W8() ^ 1));
             i = 0x7f1050e7;
             c uoc = this.D.c();
             e0 uoe0 = uoc.c();
             this.K.u(uoe0, uoc.y(), this.D.b.mId);
          }
       }else {
          this.K.p(this.E.getProfileOriginSource(), this.G.mId);
          this.w.setEnabled(1);
          i = 0x7f101ffb;
       }
       this.w.setVisibility(0);
       this.w.setText(i);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       p0.findViewById(R.id.live_profile_operator_bar).setVisibility(0);
       this.y = m1.f(p0, 0x7f0a2372);
       this.v = m1.f(p0, 0x7f0a198f);
       this.w = m1.f(p0, 0x7f0a1992);
       this.x = m1.f(p0, 0x7f0a1989);
       this.v.setOnClickListener(new l$a(this));
       m1.a(p0, new d(this), R.id.live_audience_new_profile_live_apply_chat);
       m1.a(p0, new e(this), R.id.live_audience_new_profile_at);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.D = this.q8(r.class);
       this.E = this.q8(LiveProfileParams.class);
       this.F = this.q8(GifshowActivity.class);
       this.G = this.q8(User.class);
       this.H = this.s8(l0.class);
       this.I = this.q8(Fragment.class);
       this.J = this.s8(d.class);
       this.K = this.q8(k.class);
       this.L = this.s8(n0.class);
       return;
    }
}
