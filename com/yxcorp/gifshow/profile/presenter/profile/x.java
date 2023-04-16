package com.yxcorp.gifshow.profile.presenter.profile.x;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import com.yxcorp.gifshow.entity.QPhoto;
import ga5.j;
import android.widget.ImageView;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.yxcorp.gifshow.tube.TubePhotoPayInfo;
import android.view.ViewStub;
import android.view.ViewParent;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.kuaishou.android.model.mix.ImageMeta;
import com.kuaishou.android.model.mix.ImageMetaExt;
import kp.w1;
import com.kwai.component.imageextension.util.ImageMetaImagePrefetchUtil;
import com.yxcorp.gifshow.util.rx.RxBus;
import cda.f;
import brd.t;
import t45.d;
import brd.z;
import j4c.a0;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import j4c.z;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.User;
import z5c.d3;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.android.model.mix.w;
import ekd.m1;
import java.lang.Integer;
import androidx.fragment.app.Fragment;

public class x extends PresenterV2	// class@001591
{
    public int A;
    public Fragment B;
    public int C;
    public ImageView p;
    public ImageView q;
    public ViewStub r;
    public View s;
    public View t;
    public QPhoto u;
    public BaseFeed v;
    public ImageMeta w;
    public PhotoItemViewParam x;
    public PhotoMeta y;
    public User z;

    public void x(){
       super();
       this.C = 0;
    }
    public void E8(){
       x ox = x.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ox, "3")) {
          return;
       }
       x tu = this.u;
       x tx = this.x;
       boolean b = (tx != null && tx.mIsShowNewTagIcon != null)? true: false;
       this.C = j.e(tu, b);
       if (this.P8()) {
          this.p.setVisibility(8);
          this.S8();
       }else if(this.u.getPhotoMeta() != null && this.R8(this.u.getPhotoMeta())){
          this.p.setVisibility(8);
       }else if(this.C != null){
          this.p.setVisibility(0);
          this.p.setImageResource(this.C);
       }else {
          this.p.setVisibility(8);
       }
       if (!PatchProxy.applyVoid(objArray, this, ox, "9") && this.t != null) {
          if (r1.t3(this.u.mEntity)) {
             TubePhotoPayInfo mIconUrl = (r1.v1(this.u.mEntity) != null)? r1.v1(this.u.mEntity).mIconUrl: "";
             x tt = this.t;
             if (tt instanceof ViewStub && tt.getParent() != null) {
                this.t = this.t.inflate();
             }
             this.t.setVisibility(0);
             this.t.findViewById(R.id.serial_pay_icon).setImageURI(mIconUrl);
          }else {
             this.t.setVisibility(8);
          }
       }
       if (!this.P8()) {
          ox = this.s;
          if (ox != null) {
             ox.setVisibility(8);
          }
       }
       ox = this.w;
       if (ox != null && (ImageMetaExt.isAtlasPhotos(ox) || ImageMetaExt.isLongPhotos(this.w))) {
          ImageMetaImagePrefetchUtil.prefetchAtlas(this.w, w1.m(this.v), 0, 1);
       }
       this.X7(RxBus.f.f(f.class).observeOn(d.a).subscribe(new a0(this)));
       if (this.B instanceof BaseFragment && (this.u.getPhotoMeta() != null && this.A == 19)) {
          this.X7(this.u.getPhotoMeta().observable().compose(c.c(this.B.m(), FragmentEvent.DESTROY)).subscribe(new z(this)));
       }
    label_0140 :
       return;
    }
    public final boolean P8(){
       boolean b;
       x obj = PatchProxy.apply(null, this, x.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.u.showCoCreateIcon() && !r1.t3(this.u.mEntity)) {
          obj = this.y;
          if (obj == null || !this.R8(obj)) {
             b = true;
          label_0033 :
             return b;
          }
       }
       b = false;
       goto label_0033 ;
    }
    public final boolean R8(PhotoMeta p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, x.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!d3.a(this.z) || (this.A == b && (p0.isPublic() && (!TextUtils.isEmpty(p0.mMessageGroupId) || (!w.o0(p0) && (this.A != 19 || p0.mAtMePhotoPrivacyStatus != b)))))) {
          b = false;
       }
    label_0040 :
       return b;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, x.class, "7")) {
          return;
       }
       if (this.s == null) {
          this.s = this.r.inflate();
       }
       this.s.setVisibility(0);
       this.s.findViewById(R.id.serial_pay_icon).setImageResource(R.drawable.arg_RES_7f08097d);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a136c);
       this.q = m1.f(p0, 0x7f0a3b70);
       this.t = m1.f(p0, 0x7f0a3890);
       this.r = m1.f(p0, 0x7f0a07a4);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, x.class, "1")) {
          return;
       }
       this.u = this.q8(QPhoto.class);
       this.v = this.r8("feed");
       this.w = this.s8(ImageMeta.class);
       this.x = this.t8("FEED_ITEM_VIEW_PARAM");
       this.z = this.q8(User.class);
       this.A = this.r8("TAB_ID").intValue();
       this.B = this.r8("FRAGMENT");
       this.y = this.s8(PhotoMeta.class);
       return;
    }
}
