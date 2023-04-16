package com.yxcorp.gifshow.relation.explore.presenter.z;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hac.x1;
import java.lang.Runnable;
import android.widget.TextView;
import com.yxcorp.gifshow.widget.EmojiTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.graphics.drawable.Drawable;
import android.text.TextUtils$TruncateAt;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserExtraInfo;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import hac.w1;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import im8.f;
import java.lang.Integer;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import android.widget.ImageView;
import com.kwai.framework.model.user.UserVerifiedDetail;
import lu7.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import lnc.a1;
import fka.e;
import com.kwai.robust.PatchProxyResult;
import jga.c;
import wca.b;
import tkd.b;
import tkd.d;
import vu5.b;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import hac.v1;
import android.view.View$OnClickListener;
import hac.u1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import zbc.c;
import zbc.a;

public class z extends PresenterV2	// class@00186b
{
    public KwaiImageView p;
    public TextView q;
    public EmojiTextView r;
    public ImageView s;
    public User t;
    public BaseFragment u;
    public f v;
    public c w;
    public a x;
    public boolean y;

    public void z(){
       super(false);
    }
    public void z(boolean p0){
       super();
       this.y = p0;
    }
    public void E8(){
       z oz = z.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oz, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oz, "4")) {
          if (this.y != null) {
             if (!PatchProxy.applyVoid(objArray, this, oz, "7")) {
                this.r.post(new x1(this));
             }
          }else if(PatchProxy.applyVoid(objArray, this, oz, "6")){
             this.r.setSingleLine();
             this.r.setPreventDeadCycleInvalidate(true);
             this.r.setTextSize(true, 14.00f);
             this.r.setBackgroundDrawable(objArray);
             this.r.setEllipsize(TextUtils$TruncateAt.END);
             this.r.setPadding(0, 0, 0, 0);
          }
          oz = this.t;
          User mExtraInfo = oz.mExtraInfo;
          if (mExtraInfo != null) {
             this.P8(mExtraInfo.mRecommendReason);
          }else {
             this.P8(objArray);
          }
          this.X7(this.t.observable().subscribe(new w1(this, oz), Functions.d()));
       }
       this.t.mPosition = this.v.get().intValue();
       g.b(this.p, this.t, HeadImageSize.ADJUST_BIG);
       oz = this.t;
       int i = 0x7f081d7e;
       if (oz.mVerifiedDetail != null) {
          this.s.setVisibility(0);
          UserVerifiedDetail mIconType = this.t.mVerifiedDetail.mIconType;
          if (mIconType != true) {
             if (mIconType != 2) {
                if (mIconType == 3) {
                   this.s.setImageResource(R.drawable.arg_RES_7f08045f);
                }
             }else {
                this.s.setImageResource(i);
             }
          }else {
             this.s.setImageResource(R.drawable.arg_RES_7f081d7f);
          }
       }else if(oz.isVerified()){
          this.s.setVisibility(0);
          oz = this.s;
          if (!this.t.isBlueVerifiedType()) {
             i = 0x7f081d7f;
          }
          oz.setImageResource(i);
       }else {
          this.s.setVisibility(8);
       }
       return;
    }
    public final void P8(String p0){
       StringBuilder str;
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "5")) {
          return;
       }
       z tt = this.t;
       User mContactName = tt.mContactName;
       boolean b = f.i(tt);
       int i = TextUtils.x(mContactName) ^ 0x01;
       if (b || i) {
          if (this.y != null) {
             p0 = f.b(this.t.getId(), this.t.mName);
          }else if(b){
             p0 = f.a(this.t);
          }else {
             User user = mContactName;
          }
          str = (this.y != null)? a1.r(R.string.arg_RES_7f104239, mContactName): a1.p(0x7f1007fc)+this.t.mName;
          this.q.setText(p0);
          this.r.setText(str);
       }else if(TextUtils.x(p0)){
          p0 = this.n8(R.string.arg_RES_7f100807);
       }
       str = p0;
       if (i) {
          str = str+"£º"+mContactName;
       }
       this.q.setText(f.a(this.t));
       this.r.setText(str);
       return;
    }
    public final void R8(){
       z oz = z.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oz, "10")) {
          return;
       }
       e uoe = e.a();
       c uoc = PatchProxy.apply(objArray, this, oz, "11");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = new c();
          uoc.e(b.a(85));
          uoc.b(String.valueOf(this.t.getId()));
          uoc.c(1);
       }
       uoe.j(uoc);
       d.a(-1718536792).Y7(this.getActivity(), ProfileStartParam.l(this.t));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a3deb);
       TextView textView = m1.f(p0, R.id.name);
       this.q = textView;
       textView.setVisibility(0);
       this.p = m1.f(p0, 0x7f0a0333);
       this.s = m1.f(p0, 0x7f0a4479);
       m1.a(p0, new v1(this), R.id.follower_layout);
       m1.a(p0, new u1(this), R.id.avatar);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, z.class, "1")) {
          return;
       }
       this.t = this.q8(User.class);
       this.u = this.r8("FRAGMENT");
       this.v = this.x8("ADAPTER_POSITION");
       this.w = this.t8("USER_CLICK_LOGGER");
       this.x = this.t8("USER_CLICK_LISTENER");
       return;
    }
}
