package d2c.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import z5c.f3;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import kp.r1;
import k2b.f3;
import lnc.i3;
import android.app.Activity;
import k2b.e0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import wb5.g;
import lu7.f;
import java.lang.CharSequence;
import d2c.a$a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import d2c.a$b;
import d2c.a$c;
import k2b.h;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.gifshow.activity.GifshowActivity;
import tkd.b;
import tkd.d;
import vu5.b;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import android.view.ViewStub;

public final class a extends PresenterV2	// class@0020b6
{
    public ViewStub p;
    public BaseFeed q;
    public String r;

    public void a(){
       super();
    }
    public void E8(){
       a$c uoc;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "3")) {
          return;
       }
       a tq = this.q;
       if (tq != null) {
          a tp = this.p;
          if (tp == null) {
             a.S("mPhotoDetailViewStub");
          }
          View view = f3.a(tp);
          View view1 = m1.f(view, R.id.avatar);
          a.o(view1, "ViewBindUtils.bindWidget\(it, R.id.avatar\)");
          View view2 = view1;
          view1 = m1.f(view, R.id.name);
          a.o(view1, "ViewBindUtils.bindWidget\(it, R.id.name\)");
          View view3 = view1;
          view1 = m1.f(view, R.id.content);
          a.o(view1, "ViewBindUtils.bindWidget\(it, R.id.content\)");
          View view4 = view1;
          User user = r1.T1(tq);
          if (user != null) {
             f3 uof3 = f3.l("3398385", "RECO_PHOTO_CARD");
             i3 oi3 = i3.f();
             a.o(user, "user");
             oi3.d("identity", user.getId());
             oi3.d("photo_id", tq.getId());
             uof3.m(oi3.e());
             Activity activity = this.getActivity();
             if (activity instanceof e0) {
                objArray = activity;
             }
             uof3.h(objArray);
             view2.setPlaceHolderImage(R.drawable.detail_avatar_secret);
             g.h(view2, user.mSex, user.getAvatar(), user.getAvatars(), HeadImageSize.MIDDLE);
             view3.setText(f.e(user));
             User user1 = user;
             View view5 = view2;
             View view6 = view3;
             View view7 = view;
             a uoa = this;
             a uoa1 = tq;
             a$a uoa2 = new a$a(user1, view5, view6, view7, uoa, uoa1);
             view2.setOnClickListener(objArray);
             a$b uob = new a$b(user1, view5, view6, view7, uoa, uoa1);
             view3.setOnClickListener(objArray);
             uoc = new a$c(user1, view5, view6, view7, uoa, uoa1);
             view.setOnClickListener(objArray);
          }
          String str = r1.p0(tq);
          uoc = (str == null || !str.length())? 1: 0;
          if (uoc) {
             view4.setVisibility(8);
          }else {
             view4.setVisibility(0);
             view4.setText(str);
          }
       }
       return;
    }
    public final void P8(User p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "4")) {
          return;
       }
       a.p(p0, "user");
       a.p(p1, "feedId");
       h oh = h.m("3398386", "RECO_PHOTO_CARD");
       i3 oi3 = i3.f();
       oi3.d("identity", p0.getId());
       oi3.d("photo_id", p1);
       int i = 1;
       oi3.c("click_area", Integer.valueOf(i));
       oh.n(oi3.e());
       Activity activity = this.getActivity();
       GifshowActivity gifshowActiv = null;
       if (!activity instanceof e0) {
          activity = gifshowActiv;
       }
       oh.i(activity);
       Activity activity1 = this.getActivity();
       if (activity1 instanceof GifshowActivity) {
          gifshowActiv = activity1;
       }
       if (gifshowActiv != null) {
          a tr = this.r;
          if (tr == null) {
             a.S("lastUid");
          }
          if (tr.length() <= 0) {
             i = 0;
          }
          if (i) {
             a tr1 = this.r;
             if (tr1 == null) {
                a.S("lastUid");
             }
             if (a.g(tr1, p0.getId())) {
                gifshowActiv.finish();
             }
          }
          d.a(-1718536792).Kp(gifshowActiv, ProfileStartParam.l(p0));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "view");
       p0 = m1.f(p0, R.id.photo_detail);
       a.o(p0, "ViewBindUtils.bindWidget\(view, R.id.photo_detail\)");
       this.p = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.q = this.t8("PROFILE_PREVIEW_PHOTO_FEED");
       Object obj = this.r8("PROFILE_PREVIEW_PHOTO_LAST_UID");
       a.o(obj, "inject\(AccessIds.PROFILE_PREVIEW_PHOTO_LAST_UID\)");
       this.r = obj;
       return;
    }
}
