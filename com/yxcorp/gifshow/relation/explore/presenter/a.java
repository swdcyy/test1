package com.yxcorp.gifshow.relation.explore.presenter.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import vm5.h$a;
import im8.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fac.c;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import eg.a;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import java.lang.Math;
import java.lang.Integer;
import android.widget.TextView;
import android.widget.FrameLayout$LayoutParams;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import kp.r1;
import android.view.View;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import com.yxcorp.gifshow.image.KwaiImageView;
import wb5.h;
import a7c.h;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.RecoUser;
import java.util.List;
import android.view.View$OnClickListener;
import hac.s;
import ekd.m1;
import crd.b;
import java.lang.Float;
import com.facebook.drawee.generic.RoundingParams;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;
import f7c.c;

public class a extends PresenterV2	// class@00181f
{
    public float A;
    public b B;
    public PublishSubject C;
    public c D;
    public h E;
    public c F;
    public ImageView p;
    public KwaiImageView q;
    public KwaiImageView r;
    public TextView s;
    public BaseFragment t;
    public QPhoto u;
    public User v;
    public RecoUser w;
    public h$a x;
    public int y;
    public int z;

    public void a(){
       super();
       this.A = 0x3f800000;
       h$a uoa = new h$a();
       this.x = uoa;
       this.W7(uoa);
    }
    public void E8(){
       int i1;
       ViewGroup$LayoutParams layoutParams1;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "6")) {
          return;
       }
       this.A = this.F.e();
       a uoa1 = null;
       float f = 146.00f;
       float f1 = 0x3f800000;
       int i = 0x7f0702e3;
       if (!this.F.g()) {
          i1 = n.j(this.getActivity());
          int i2 = a.c(48.00f, a.b().getResources());
          int i3 = a.c(110.00f, a.b().getResources());
          i = a1.d(i);
          if (this.getActivity() != null) {
             i3 = ((n.k(this.getActivity()) - (i2 * 2)) - (i * 2)) / 3;
          }
          ViewGroup$LayoutParams layoutParams = this.q.getLayoutParams();
          layoutParams1 = this.r.getLayoutParams();
          layoutParams.width = i3;
          layoutParams.height = Math.min((int)((((float)i3 * f1) / 110.00f) * f), i1);
          layoutParams1.width = i3;
          this.q.setLayoutParams(layoutParams);
          this.r.setLayoutParams(layoutParams1);
       }else {
          i1 = this.F.g();
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), this, uoa, "3")) {
             layoutParams1 = this.q.getLayoutParams();
             ViewGroup$LayoutParams layoutParams2 = this.r.getLayoutParams();
             i1 = ((i1 - ((int)((float)a1.d(0x7f0700cc) * this.A) * 2)) - ((int)((float)a1.d(i) * this.A) * 2)) / 3;
             layoutParams1.width = i1;
             float f2 = (float)i1 * f1;
             layoutParams1.height = (int)((f2 / 110.00f) * f);
             layoutParams2.width = i1;
             this.q.setLayoutParams(layoutParams1);
             this.r.setLayoutParams(layoutParams2);
             f2 = f2 / (float)a1.e(110.00f);
             FrameLayout$LayoutParams layoutParams3 = this.s.getLayoutParams();
             layoutParams3.setMargins((int)((float)a1.d(R.dimen.arg_RES_7f070334) * f2), (int)((float)a1.d(R.dimen.arg_RES_7f070334) * f2), (int)((float)a1.d(R.dimen.arg_RES_7f070334) * f2), (int)((float)a1.d(R.dimen.arg_RES_7f070334) * f2));
             this.s.setLayoutParams(layoutParams3);
             this.s.setTextSize(uoa1, ((float)a1.d(R.dimen.arg_RES_7f070271) * f2));
             Drawable uDrawable = a1.f(R.drawable.arg_RES_7f0803c8);
             uDrawable.setBounds(uoa1, uoa1, (int)((float)a1.d(R.dimen.arg_RES_7f07028d) * f2), (int)((float)a1.d(R.dimen.arg_RES_7f07028d) * f2));
             this.s.setCompoundDrawables(uDrawable, objArray, objArray, objArray);
          }
       }
       QPhoto mEntity = this.u.mEntity;
       if (!PatchProxy.applyVoidOneRefs(mEntity, this, uoa, "8") && r1.w0(mEntity) != null) {
          r1.P4(mEntity, (this.y + 1));
          this.m8().setVisibility(uoa1);
          a tp = this.p;
          i = 8;
          if (!mEntity instanceof LiveStreamFeed) {
             uoa1 = 8;
          }
          tp.setVisibility(uoa1);
          if (this.u.getPhotoMeta().getLikeCount() > 0) {
             this.s.setText(TextUtils.N((long)this.u.getPhotoMeta().getLikeCount()));
          }else {
             this.s.setVisibility(i);
          }
          h.h(this.q, this.u.mEntity);
       }
       i1 = 85;
       uoa1 = this.E;
       if (uoa1 != null) {
          i1 = uoa1.t();
       }
       this.q.setTag(R.id.tag_view_refere, Integer.valueOf(i1));
       this.q.setTag(R.id.tag_pymk_portal_refer, Integer.valueOf(this.z));
       a tv = this.v;
       if (tv != null) {
          this.q.setTag(R.id.tag_pymk_follow_text_refer, tv.mFollowActionReasonTextId);
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "7")) {
          int i4 = a.c(8.00f, a.b().getResources());
          RecoUser mFeedList = this.w.mFeedList;
          if (mFeedList != null) {
             if (mFeedList.size() == 3) {
                tv = this.y;
                if (tv == null) {
                   this.P8((float)i4, 0, 0, (float)i4);
                   this.r.setImageResource(R.drawable.arg_RES_7f0803d3);
                }else if(tv == 2){
                   this.P8(0, (float)i4, (float)i4, 0);
                   this.r.setImageResource(R.drawable.arg_RES_7f0803d7);
                }else {
                   this.P8(0, 0, 0, 0);
                   this.r.setImageResource(R.drawable.arg_RES_7f0803d5);
                }
             }else if(this.w.mFeedList.size() == 2){
                tv = this.y;
                if (tv == null) {
                   this.P8((float)i4, 0, 0, (float)i4);
                   this.r.setImageResource(R.drawable.arg_RES_7f0803d3);
                }else if(tv == 1){
                   this.P8(0, (float)i4, (float)i4, 0);
                   this.r.setImageResource(R.drawable.arg_RES_7f0803d7);
                }
             }else if(this.w.mFeedList.size() == 1 && this.y == null){
                this.P8((float)i4, (float)i4, (float)i4, (float)i4);
                this.r.setImageResource(R.drawable.arg_RES_7f0803d6);
             }
          }
       }
       this.q.setOnClickListener(objArray);
       m1.a(this.m8(), new s(this), R.id.player_cover);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a tB = this.B;
       if (tB != null) {
          tB.dispose();
       }
       return;
    }
    public final void P8(float p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, a.class, "5")) {
          return;
       }
       RoundingParams roundingPara = new RoundingParams();
       roundingPara.m(p0, p1, p2, p3);
       this.q.getHierarchy().L(roundingPara);
       RoundingParams roundingPara1 = new RoundingParams();
       roundingPara1.m(0, 0, p2, p3);
       this.r.getHierarchy().L(roundingPara1);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3105);
       this.p = m1.f(p0, 0x7f0a215e);
       this.s = m1.f(p0, 0x7f0a177c);
       this.r = m1.f(p0, 0x7f0a0497);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.t = this.r8("FRAGMENT");
       this.u = this.q8(QPhoto.class);
       this.v = this.s8(User.class);
       this.w = this.s8(RecoUser.class);
       this.F = this.r8("PYMK_ACCESS_IDScard_size");
       this.z = this.r8("PYMK_ACCESS_IDSportal").intValue();
       this.y = this.r8("ADAPTER_POSITION").intValue();
       this.C = this.r8("PYMK_ACCESS_IDScurrentUser");
       this.D = this.r8("PYMK_ACCESS_IDSITEM_CLICK_LISTENER");
       this.E = this.t8("PYMK_ACCESS_IDSPYMK_PARAMS");
       return;
    }
}
