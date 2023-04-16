package com.yxcorp.gifshow.profile.presenter.profile.header.name.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.d$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import z5c.m2;
import a3c.e;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import z5c.g3;
import android.view.ViewTreeObserver;
import r4c.b0;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import s1c.j1;
import r4c.a0;
import erd.g;
import crd.b;
import brd.t;
import java.util.Set;
import j5c.c;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.c;
import z5c.l0;
import com.kwai.framework.model.user.User$FollowStatus;
import com.kwai.framework.model.user.User;
import lu7.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import xl8.b;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.EmojiTextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import java.lang.Integer;

public class d extends PresenterV2	// class@0014f6
{
    public int A;
    public g B;
    public CharSequence C;
    public PublishSubject D;
    public KwaiImageView E;
    public a F;
    public final b G;
    public EmojiTextView p;
    public View q;
    public BaseFragment r;
    public j1 s;
    public RxPageBus t;
    public ProfileParam u;
    public User v;
    public b w;
    public c x;
    public int y;
    public boolean z;

    public void d(){
       super();
       this.G = new d$a(this);
    }
    public void E8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "10")) {
          boolean b = true;
          this.A = m2.b(this.getActivity(), this.y, b);
          if (e.a(this.y)) {
             this.p.setTextSize(b, (float)this.A);
          }else {
             g3.e(this.p, this.A);
          }
          this.p.getViewTreeObserver().addOnGlobalLayoutListener(new b0(this));
       }
       this.X7(this.s.d.subscribe(new a0(this)));
       this.s.b.add(this.G);
       this.X7(this.x.e().subscribe(new c(this), l0.a));
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, d.class, "8")) {
          return;
       }
       String str = (this.v.getFollowStatus() == User$FollowStatus.FOLLOWING && f.i(this.v))? f.a(this.v): this.v.mName;
       if (TextUtils.n(str, this.C)) {
          return;
       }else {
          this.C = str;
          this.p.setText(str);
          this.w.d(str);
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a4388);
       this.E = m1.f(p0, 0x7f0a00d5);
       m1.a(p0, new b(this), R.id.user_name_tv);
       this.q = m1.f(p0, 0x7f0a437a);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.r = this.r8("PROFILE_FRAGMENT");
       this.s = this.q8(j1.class);
       this.u = this.q8(ProfileParam.class);
       this.v = this.q8(User.class);
       this.x = this.r8("PROFILE_LOAD_STATE");
       this.w = this.r8("PROFILE_NAME_OBSERVABLE_DATA");
       this.D = this.t8("SHOW_TORCH_ICON_CHANGED_OBSERVABLE");
       this.t = this.r8("PROFILE_PAGE_RXBUS");
       this.y = this.r8("PROFILE_STYLE").intValue();
       return;
    }
}
