package com.yxcorp.gifshow.pymk.element.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.pymk.element.e$a;
import rkd.b;
import vm5.h$a;
import im8.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import kp.r1;
import im8.f;
import java.lang.Integer;
import android.view.View;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import wb5.h;
import com.yxcorp.gifshow.pymk.f;
import a7c.h;
import a7c.c;
import com.kwai.framework.model.user.User;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import lnc.d2;
import ekd.m1;
import b7c.m;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.RecoUser;
import f7c.c;

public class e extends PresenterV2	// class@0016c1
{
    public RecoUser A;
    public h$a B;
    public b p;
    public int q;
    public QPhoto r;
    public ImageView s;
    public KwaiImageView t;
    public BaseFragment u;
    public BaseFeed v;
    public User w;
    public c x;
    public f y;
    public h z;

    public void e(){
       super();
       this.p = new e$a(this);
       int i = (b.g())? this.R8(): this.P8();
       this.q = i;
       h$a uoa = new h$a();
       this.B = uoa;
       this.W7(uoa);
       return;
    }
    public void E8(){
       e uoe = e.class;
       if (PatchProxy.applyVoid(null, this, uoe, "5")) {
          return;
       }
       e tv = this.v;
       if (!PatchProxy.applyVoidOneRefs(tv, this, uoe, "7") && r1.w0(tv) != null) {
          r1.P4(tv, (this.y.get().intValue() + 1));
          int i2 = 0;
          this.m8().setVisibility(i2);
          uoe = this.s;
          if (!tv instanceof LiveStreamFeed) {
             i2 = 8;
          }
          uoe.setVisibility(i2);
          h.h(this.t, this.v);
       }
       int i = c.a(this.z.s().l2());
       int i1 = this.z.t();
       if (!i) {
          i = i1;
       }
       this.t.setTag(R.id.tag_view_refere, Integer.valueOf(i));
       this.t.setTag(R.id.tag_pymk_portal_refer, Integer.valueOf(this.z.s().l2()));
       uoe = this.w;
       if (uoe != null) {
          this.t.setTag(R.id.tag_pymk_follow_text_refer, uoe.mFollowActionReasonTextId);
       }
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().i3(this.p);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "6")) {
          return;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().s3(this.p);
       }
       return;
    }
    public int P8(){
       Object obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = a1.d(R.dimen.arg_RES_7f0702ab);
       int i1 = a1.d(R.dimen.arg_RES_7f07034b);
       int i2 = d2.d();
       i2 = (i2)? ((i2 - (i * 2)) - (i1 * 2)) / 3: a1.d(R.dimen.arg_RES_7f070268);
       return i2;
    }
    public int R8(){
       Object obj = PatchProxy.apply(null, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = a1.d(R.dimen.arg_RES_7f0702ab);
       int i1 = a1.d(R.dimen.arg_RES_7f07034b);
       int i2 = (b.e())? d2.e(): d2.d();
       i2 = (i2)? ((i2 - (i * 2)) - (i1 * 2)) / 3: a1.d(R.dimen.arg_RES_7f070268);
       return i2;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a3105);
       this.s = m1.f(p0, 0x7f0a215e);
       m1.a(p0, new m(this), R.id.player_cover);
       ViewGroup$LayoutParams layoutParams = this.t.getLayoutParams();
       e tq = this.q;
       layoutParams.width = tq;
       layoutParams.height = tq;
       this.t.setLayoutParams(layoutParams);
       this.t.getHierarchy().L(RoundingParams.c((float)a1.d(R.dimen.arg_RES_7f070426)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.u = this.r8("FRAGMENT");
       this.v = this.r8("feed");
       this.r = this.q8(QPhoto.class);
       this.w = this.s8(User.class);
       this.A = this.s8(RecoUser.class);
       this.x = this.r8("PYMK_ACCESS_IDSITEM_CLICK_LISTENER");
       this.y = this.x8("ADAPTER_POSITION");
       this.z = this.r8("PYMK_ACCESS_IDSPYMK_PARAMS");
       return;
    }
}
