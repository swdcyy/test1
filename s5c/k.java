package s5c.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xja.c;
import s5c.f;
import xja.a;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import t45.d;
import brd.z;
import s5c.h;
import s5c.i;
import erd.g;
import crd.b;
import com.kwai.framework.model.user.User;
import r5c.a;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Context;
import ekd.p0;
import e17.i;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import android.app.Application;
import s5c.j;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import tkd.b;
import tkd.d;
import ou5.b;
import s5c.g;
import java.lang.Runnable;
import n3d.a;
import jga.f$a;
import jga.f;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import io.reactivex.internal.functions.Functions;
import s5c.e;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.yxcorp.gifshow.follow.state.UserFollowState;
import xja.b;
import android.view.View;
import android.widget.TextView;
import java.lang.CharSequence;
import ekd.m1;
import s5c.d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.profile.status.panel.StatusPanelListFragment;

public class k extends PresenterV2	// class@004132
{
    public User p;
    public String q;
    public StatusPanelListFragment r;
    public QPhoto s;
    public TextView t;
    public View u;
    public c v;

    public void k(){
       super();
    }
    public void E8(){
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ok, "4") && this.v == null) {
          c uoc = new c();
          this.v = uoc;
          uoc.c(new f(this));
       }
       this.X8();
       this.p.startSyncWithFragment(this.r.m());
       this.X7(this.p.observable().observeOn(d.a).subscribe(new h(this), new i(this)));
       return;
    }
    public void P8(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "9")) {
          return;
       }
       k tq = this.q;
       k ts = this.s;
       if (!PatchProxy.applyVoidThreeRefs(p0, tq, ts, null, a.class, "2")) {
          a.b(p0, "follow", tq, ts);
       }
       return;
    }
    public void R8(User p0){
    }
    public void S8(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "10")) {
          return;
       }
       a.a(p0, this.q, this.s);
       return;
    }
    public void V8(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "8")) {
          return;
       }
       k tq = this.q;
       k ts = this.s;
       if (!PatchProxy.applyVoidThreeRefs(p0, tq, ts, null, a.class, "3")) {
          a.b(p0, "unfollow", tq, ts);
       }
       return;
    }
    public final void W8(){
       int i;
       k ok = k.class;
       if (PatchProxy.applyVoid(null, this, ok, "7")) {
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
          String str = a.B.getString(R.string.arg_RES_7f103077);
          j oj = new j(this);
          if (!PatchProxy.applyVoidTwoRefs(str, oj, this, ok, "11") && !QCurrentUser.ME.isLogined()) {
             LoginParams$a uoa = new LoginParams$a();
             uoa.d(str);
             uoa.c(21);
             d.a(-1712118428).x00(this.getContext(), 21, uoa.a(), new g(oj));
          }
          return;
       }else {
          boolean b = this.p.isFollowingOrFollowRequesting();
          i = (!b && this.p.isPrivate())? 1: 0;
          f$a uoa1 = new f$a(this.p, activity.Q2());
          uoa1.q((i ^ 0x01));
          f uof = uoa1.b();
          if (b) {
             this.V8(this.p);
             FollowHelper.k(uof).subscribe(Functions.d(), Functions.d());
          }else {
             this.P8(this.p);
             FollowHelper.c(uof, new e(this));
          }
          return;
       }
    }
    public final void X8(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, k.class, "6")) {
          return;
       }
       this.v.e(b.a(this.p, false));
       b = b.b(this.p);
       this.u.setSelected(b);
       this.t.setSelected(b);
       this.t.setText(this.v.b());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a0fa1);
       this.u = m1.f(p0, 0x7f0a0f4e);
       m1.a(p0, new d(this), R.id.follow_button);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.p = this.q8(User.class);
       this.r = this.r8("FRIEND_LIKE_USER_LIST_FRAGMENT");
       this.q = this.t8("STATUS_PANEL_TAB_ID");
       this.s = this.q8(QPhoto.class);
       return;
    }
}
