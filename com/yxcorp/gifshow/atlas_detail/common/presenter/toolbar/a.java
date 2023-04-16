package com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.activity.GifshowActivity$AnchorPoint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wh5.c;
import android.widget.ImageView;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.User;
import wb5.g;
import android.graphics.drawable.Drawable;
import wb5.i;
import com.kwai.framework.model.user.DynamicPendant;
import java.lang.Float;
import com.yxcorp.gifshow.widget.AvatarWithPendantView;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import android.view.ViewGroup;
import lu7.f;
import java.lang.CharSequence;
import g99.e;
import android.view.View$OnClickListener;
import g99.c;
import android.widget.TextView;
import g99.d;
import g99.f;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import zz5.d;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import im8.f;
import org.json.JSONObject;
import je5.b;
import p1a.a$a;
import com.yxcorp.gifshow.log.model.CommonParams;
import e3b.a;
import lnc.i3;
import qd5.a;
import org.json.JSONException;
import p1a.a;
import g99.g;
import lnc.c3$a;
import lnc.c3;
import g99.h;
import msd.a;
import com.kwai.framework.kgi.sdk.Kgi;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import io.reactivex.subjects.PublishSubject;
import tkd.b;
import tkd.d;
import vu5.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import com.yxcorp.gifshow.entity.QPreInfo;
import java.lang.Integer;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class a extends PresenterV2	// class@001ba5
{
    public PhotoDetailLogger A;
    public PublishSubject B;
    public BaseFragment C;
    public KwaiImageView p;
    public AvatarWithPendantView q;
    public View r;
    public ViewGroup s;
    public TextView t;
    public User u;
    public QPhoto v;
    public f w;
    public f x;
    public f y;
    public QPreInfo z;
    public static final HeadImageSize D;
    public static final GifshowActivity$AnchorPoint E;

    static {
       a.D = HeadImageSize.ADJUST_MIDDLE;
       a.E = GifshowActivity$AnchorPoint.AVATAR;
    }
    public void a(){
       super();
    }
    public void E8(){
       a tr;
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       if (!c.f()) {
          this.p.setVisibility(8);
          tr = this.r;
          if (tr != null) {
             tr.setVisibility(8);
          }
          return;
       }else {
          g.b(this.p, this.u, a.D);
          this.p.setPlaceHolderImage(i.b(this.u.getSex()));
          tr = this.u;
          User mDynamicPend = tr.mDynamicPendant;
          User mPendants = tr.mPendants;
          a tq = this.q;
          if (tq != null) {
             if (mDynamicPend != null) {
                tq.s(mDynamicPend.getLottieUrl(), mDynamicPend.getWidthRadio().floatValue(), mDynamicPend.getHeightRadio().floatValue());
             }else if(!j.h(mPendants)){
                this.q.setStaticPendantUrl(mPendants);
             }
             boolean b = false;
             this.s.setClipChildren(b);
             this.q.setVisibility(b);
          }
          this.p.setContentDescription(f.c(this.u));
          this.p.setOnClickListener(new e(this));
          tr = this.t;
          if (tr != null) {
             tr.setOnClickListener(new c(this));
          }
          tr = this.r;
          if (tr != null) {
             tr.setOnClickListener(new d(this));
          }
          d.b(this.v, this.C, new f(this));
          return;
       }
    }
    public final void P8(View p0){
       a tA;
       b uob;
       ProfileStartParam profileStart;
       a ty;
       int i;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "7")) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       activity.m3("avatar");
       activity.n3(a.E);
       if (this.x.get() != null) {
          this.x.get().onClick(p0);
          return;
       }else {
          JSONObject jSONObject = b.b(this.u);
          a$a uoa1 = a$a.a(810, "click_head");
          uoa1.n(2);
          uoa1.g(a.b(this.v));
          i3 oi3 = i3.f();
          oi3.d("comment_tips_content", a.a(this.v));
          oi3.d("head_position", "RIGHT_BAR");
          uoa1.m(oi3.e());
          uoa1.q(p0);
          if (jSONObject != null) {
             try{
                uoa1.m(jSONObject.put("comment_tips_content", a.a(this.v)).toString());
             }catch(org.json.JSONException e9){
                e9.printStackTrace();
             }
          }
       }
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       a tq = this.q;
       if (tq != null) {
          tq.u();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       AvatarWithPendantView uAvatarWithP = m1.f(p0, R.id.avatar_with_pendant);
       this.q = uAvatarWithP;
       int i = 0x7f0a0333;
       if (uAvatarWithP == null) {
          this.p = m1.f(p0, i);
       }else {
          m1.f(p0, i).setVisibility(8);
          this.p = this.q.getAvatar();
       }
       this.s = m1.f(p0, 0x7f0a3f6a);
       this.r = m1.f(p0, 0x7f0a0380);
       this.t = m1.f(p0, 0x7f0a3fd7);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.u = this.q8(User.class);
       this.v = this.q8(QPhoto.class);
       this.w = this.x8("LOG_LISTENER");
       this.x = this.x8("DETAIL_AVATAR_CLICK_HANDLER");
       this.y = this.w8("DETAIL_PHOTO_INDEX");
       this.z = this.s8(QPreInfo.class);
       this.A = this.r8("DETAIL_LOGGER");
       this.B = this.r8("SLIDE_PLAY_PROFILE_PUBLISHER");
       this.C = this.r8("DETAIL_FRAGMENT");
       return;
    }
}
