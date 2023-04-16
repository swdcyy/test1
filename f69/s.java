package f69.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import qa9.q;
import com.yxcorp.gifshow.data.FriendPhotoClapResponse;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.FriendClap;
import android.os.Build$VERSION;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import xja.c;
import f69.l;
import xja.a;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import t45.d;
import brd.z;
import f69.o;
import f69.p;
import erd.g;
import crd.b;
import xl8.b;
import f69.r;
import bp6.a;
import android.view.View;
import com.yxcorp.utility.n;
import com.airbnb.lottie.LottieAnimationView;
import com.kwai.library.widget.popup.common.c;
import e69.a;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Context;
import ekd.p0;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import android.app.Application;
import f69.h;
import java.lang.Runnable;
import ol5.a;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import jga.f$a;
import jga.f;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import io.reactivex.internal.functions.Functions;
import f69.g;
import androidx.fragment.app.Fragment;
import qa9.s;
import tkd.b;
import tkd.d;
import pu5.a;
import qu5.r;
import android.view.ViewStub;
import android.widget.ImageView;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import ou5.b;
import f69.m;
import n3d.a;
import com.yxcorp.gifshow.aggregate.relation.RelationAggregateFragment;
import com.yxcorp.gifshow.follow.state.UserFollowState;
import xja.b;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.widget.TextView;
import xf6.l;
import mp.a;
import f69.q;
import f69.i;
import qra.f;
import ekd.m1;
import f69.s$a;
import com.yxcorp.gifshow.widget.m;
import java.lang.Integer;

public class s extends PresenterV2	// class@0022c3
{
    public View A;
    public View B;
    public c C;
    public boolean D;
    public ViewStub E;
    public LottieAnimationView F;
    public q p;
    public User q;
    public RelationAggregateFragment r;
    public a s;
    public String t;
    public String u;
    public int v;
    public b w;
    public a x;
    public boolean y;
    public TextView z;

    public void s(q p0){
       super();
       this.p = p0;
    }
    public static void P8(s p0,FriendPhotoClapResponse p1){
       p0.W8(p1);
    }
    public static void R8(s p0){
       p0.X8();
    }
    private void W8(FriendPhotoClapResponse p0){
       p0.mCanClap = false;
       this.b9();
       if (Build$VERSION.SDK_INT < 23) {
          i.d(R.style.arg_RES_7f110669, a1.p(R.string.arg_RES_7f104b35));
          return;
       }else {
          this.Z8();
          return;
       }
    }
    public void E8(){
       s os = s.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, os, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, os, "6") && this.C == null) {
          c uoc = new c();
          this.C = uoc;
          uoc.c(new l(this));
       }
       this.b9();
       this.q.startSyncWithFragment(this.r.m());
       this.X7(this.q.observable().observeOn(d.a).subscribe(new o(this), new p(this)));
       User mFriendClap = this.q.mFriendClap;
       if (mFriendClap != null && mFriendClap.mCanClap != null) {
          this.X7(this.w.observable().subscribe(new r(this), new a()));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, s.class, "5")) {
          return;
       }
       this.S8();
       this.V8();
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, s.class, "17")) {
          return;
       }
       n.Y(this.F, 8, false);
       s tF = this.F;
       if (tF != null && tF.p()) {
          this.F.f();
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, s.class, "4")) {
          return;
       }
       s tx = this.x;
       if (tx != null) {
          tx.o();
          this.x = null;
       }
       return;
    }
    public final void X8(){
       int i;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, s.class, "13")) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       if (activity == null) {
          return;
       }
       if (!p0.C(activity)) {
          i.a(R.style.arg_RES_7f110669, 0x7f1038e7);
          return;
       }else if(!QCurrentUser.ME.isLogined()){
          this.a9(a.B.getString(R.string.arg_RES_7f103077), new h(this));
          return;
       }else {
          s ts = this.s;
          if (ts != null) {
             ts.a(this.q.mId);
          }
          boolean b = this.q.isFollowingOrFollowRequesting();
          i = (!b && this.q.isPrivate())? 1: 0;
          String str = activity.Q2();
          if (!TextUtils.x(this.u)) {
             str = (!TextUtils.x(str))? str+","+this.u: this.u;
          }else {
             s tu = objArray;
          }
          f$a uoa1 = new f$a(this.q, str);
          uoa1.q((i ^ 0x01));
          f uof = uoa1.b();
          if (b) {
             ts = this.q;
             if (!PatchProxy.applyVoidOneRefs(ts, objArray, uoa, "5")) {
                a.d(ts, "unfollow");
             }
             FollowHelper.k(uof).subscribe(Functions.d(), Functions.d());
          }else {
             ts = this.q;
             if (!PatchProxy.applyVoidOneRefs(ts, objArray, uoa, "2")) {
                a.d(ts, "follow");
             }
             FollowHelper.b(uof);
          }
          return;
       }
    }
    public final void Y8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, s.class, "12")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       if (!QCurrentUser.ME.isLogined()) {
          this.a9(a.B.getString(R.string.arg_RES_7f10307c), new g(this));
          return;
       }else {
          s tq = this.q;
          if (!PatchProxy.applyVoidOneRefs(tq, objArray, a.class, "6")) {
             a.d(tq, "send_message");
          }
          tq = this.s;
          if (tq != null) {
             tq.c(this.q.mId);
          }
          if (s.a(this.r) != null) {
             d.a(-1497343380).MD(this.getActivity(), this.q);
          }
          return;
       }
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, s.class, "16")) {
          return;
       }
       if (this.F == null) {
          this.F = this.E.inflate();
       }
       this.F.setVisibility(0);
       this.F.s();
       return;
    }
    public final void a9(String p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, s.class, "14")) {
          return;
       }
       if (!QCurrentUser.ME.isLogined()) {
          LoginParams$a uoa = new LoginParams$a();
          uoa.d(p0);
          uoa.c(21);
          d.a(-1712118428).x00(this.getContext(), 21, uoa.a(), new m(p1));
       }
       return;
    }
    public final void b9(){
       boolean b;
       s os = s.class;
       if (PatchProxy.applyVoid(null, this, os, "9")) {
          return;
       }
       int i = 1;
       int i1 = 8;
       if (this.r.Hh()) {
          View[] viewArray = new View[i];
          viewArray[0] = this.A;
          n.Z(i1, viewArray);
          return;
       }else {
          this.C.e(b.a(this.q, 0));
          if (this.C.a() == UserFollowState.CLAP) {
             this.A.setBackground(a1.f(R.drawable.arg_RES_7f080c98));
             this.z.setTextColor(a1.b(R.color.arg_RES_7f060135));
             FriendClap mCanClap = this.q.mFriendClap.mCanClap;
             this.A.setSelected(mCanClap);
             this.z.setSelected(mCanClap);
             if (mCanClap != null) {
                this.B.setVisibility(0);
                this.z.setText(this.q.mFriendClap.mClapText);
                this.z.setMaxWidth(a1.d(R.dimen.arg_RES_7f07031d));
                mCanClap = this.q.mFriendClap.mUserGuideText;
                if (!PatchProxy.applyVoidOneRefs(mCanClap, this, os, "10") && !TextUtils.x(this.q.mFriendClap.mUserGuideText)) {
                   if (l.c("KEY_CLAP_BUBBLE_GUIDE_SHOW", 0)) {
                      a.f(0);
                   }
                   if (this.D == null && !a.c()) {
                      this.D = i;
                      os = this.p;
                      if (os != null && os.d()) {
                         this.X7(this.p.e().subscribe(new q(this)));
                      }
                      a.f(i);
                      f.a(this.A, new i(this, mCanClap));
                   }
                }
             }else {
                this.B.setVisibility(i1);
                this.z.setText(this.q.mFriendClap.mClapSubText);
                this.z.setMaxWidth(a1.d(R.dimen.arg_RES_7f07032e));
             }
          }else {
             this.B.setVisibility(i1);
             this.A.setBackground(a1.f(R.drawable.arg_RES_7f080c74));
             this.z.setTextColor(a1.b(R.color.arg_RES_7f060a41));
             b = b.b(this.q);
             this.A.setSelected(b);
             this.z.setSelected(b);
             this.z.setText(this.C.b());
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "2")) {
          return;
       }
       this.z = m1.f(p0, 0x7f0a0fa1);
       this.A = m1.f(p0, 0x7f0a0f4e);
       this.B = m1.f(p0, 0x7f0a070c);
       this.E = m1.f(p0, 0x7f0a1285);
       m1.b(p0, new s$a(this), R.id.follow_button);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       this.q = this.q8(User.class);
       this.r = this.r8("RELATION_USER_FRAGMENT");
       this.s = this.s8(a.class);
       this.t = this.r8("RELATION_AGGREGATE_QUERY_URL");
       this.u = this.r8("RELATION_USER_FOLLOW_REFER");
       this.v = this.r8("ADAPTER_POSITION").intValue();
       this.w = this.r8("RELATION_CLICK_ITEM_POSITION");
       return;
    }
}
