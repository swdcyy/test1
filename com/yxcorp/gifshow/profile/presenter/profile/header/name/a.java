package com.yxcorp.gifshow.profile.presenter.profile.header.name.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import z5c.m2;
import a3c.e;
import android.widget.TextView;
import z5c.g3;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.ViewTreeObserver;
import r4c.e;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import brd.t;
import j5c.c;
import r4c.c;
import erd.g;
import z5c.l0;
import crd.b;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.QCurrentUser;
import z5c.y1;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import z5c.b0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import k2b.u1;
import com.yxcorp.gifshow.util.rx.RxBus;
import cx5.e;
import t45.d;
import brd.z;
import r4c.a;
import eda.q;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import r4c.b;
import tkd.b;
import tkd.d;
import gx5.c;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.UserProfile;
import k2b.e0;
import android.view.View;
import ekd.m1;
import android.view.ViewStub;
import com.yxcorp.gifshow.widget.EmojiTextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.a$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.a$b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;

public class a extends PresenterV2	// class@0014f2
{
    public boolean A;
    public int B;
    public ViewTreeObserver$OnGlobalLayoutListener C;
    public EmojiTextView p;
    public ViewStub q;
    public View r;
    public BaseFragment s;
    public ProfileParam t;
    public User u;
    public c v;
    public KwaiImageView w;
    public a x;
    public PublishSubject y;
    public int z;

    public void a(){
       super();
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       int i = 1;
       y1 oy1 = 2;
       if (!PatchProxy.applyVoid(objArray, this, uoa, "8") && this.z != oy1) {
          this.B = m2.b(this.getActivity(), this.z, i);
          if (!e.a(this.z)) {
             g3.e(this.p, this.B);
          }else {
             this.p.setTextSize(i, (float)this.B);
          }
          e uoe = new e(this);
          this.C = uoe;
          this.p.getViewTreeObserver().addOnGlobalLayoutListener(uoe);
       }
       this.X7(this.v.e().subscribe(new c(this), l0.a("MyProfileHeaderPresenter")));
       String id = this.u.getId();
       if (!QCurrentUser.me().isPublicFollow()) {
          i = 2;
       }
       if (!PatchProxy.isSupport(y1.class) || !PatchProxy.applyVoidThreeRefs(id, "owner", Integer.valueOf(i), null, y1.class, "65")) {
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page = 4;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 0x7921;
          uElementPack.name = "owner";
          uElementPack.value = (double)i;
          ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
          showEvent.elementPackage = uElementPack;
          showEvent.contentPackage = b0.g(id);
          u1.z0(urlPackage, showEvent);
       }
       RxBus f = RxBus.f;
       this.X7(f.f(e.class).observeOn(d.a).subscribe(new a(this)));
       this.X7(f.g(q.class, RxBus$ThreadMode.MAIN).subscribe(new b(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a tp = this.p;
       if (tp != null && tp.getViewTreeObserver().isAlive()) {
          this.p.getViewTreeObserver().removeOnGlobalLayoutListener(this.C);
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       if (d.a(0x763547f8).tj(this.t.mUserProfile, this.getActivity())) {
          y1.n(this.s, this.u.getId(), "nickname", 2, this.t.mUserProfile);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a4382);
       this.p = m1.f(p0, 0x7f0a4388);
       this.w = m1.f(p0, 0x7f0a00d5);
       m1.b(p0, new a$a(this), R.id.user_name_edit);
       m1.b(p0, new a$b(this), R.id.user_name_tv);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.s = this.r8("PROFILE_FRAGMENT");
       this.t = this.q8(ProfileParam.class);
       this.u = this.q8(User.class);
       this.v = this.r8("PROFILE_LOAD_STATE");
       this.y = this.t8("SHOW_TORCH_ICON_CHANGED_OBSERVABLE");
       this.z = this.r8("PROFILE_STYLE").intValue();
       return;
    }
}
