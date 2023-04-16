package aua.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;
import com.kuaishou.android.model.mix.CommonMeta;
import ga5.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import im8.f;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserVerifiedDetail;
import ekd.m1;

public class f extends PresenterV2	// class@00030d
{
    public ViewStub p;
    public User q;
    public f r;
    public f s;
    public f t;
    public QPhoto u;
    public CommonMeta v;
    public ImageView w;

    public void f(){
       super();
    }
    public void E8(){
       boolean b;
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "4")) {
          return;
       }
       if (this.p != null) {
          UserVerifiedDetail obj = PatchProxy.apply(objArray, this, uof, "3");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             PhotoAdvertisement photoAdverti = k.B(this.u);
             if (photoAdverti != null) {
                PhotoAdvertisement$AdGroup[] uAdGroupArra = new PhotoAdvertisement$AdGroup[]{PhotoAdvertisement$AdGroup.DSP,PhotoAdvertisement$AdGroup.THIRD_PLATFORM,PhotoAdvertisement$AdGroup.ALI_DONG_FENG};
                if (photoAdverti.isAdGroup(uAdGroupArra)) {
                   b = true;
                }
             }
             b = false;
          }
          if (!b) {
             int i = 8;
             if (b.d(this.v) || w.k0(this.u.getEntity())) {
                uof = this.w;
                if (uof != null) {
                   uof.setVisibility(i);
                }
             }else if(!this.r.get().booleanValue() && (this.s.get().booleanValue() || this.t.get().booleanValue())){
                uof = this.w;
                if (uof != null) {
                   uof.setVisibility(i);
                }
             }else if(this.w == null){
                this.w = this.p.inflate();
             }
             uof = this.q;
             int i1 = 0x7f080a2b;
             if (uof.mVerifiedDetail != null) {
                this.w.setVisibility(0);
                obj = this.q.mVerifiedDetail.mIconType;
                if (obj != 1) {
                   if (obj != 2) {
                      if (obj == 3) {
                         this.w.setImageResource(R.drawable.arg_RES_7f080a2d);
                      }
                   }else {
                      this.w.setImageResource(i1);
                   }
                }else {
                   this.w.setImageResource(R.drawable.arg_RES_7f080a2c);
                }
             }else if(uof.isVerified()){
                this.w.setVisibility(0);
                uof = this.w;
                if (!this.q.isBlueVerifiedType()) {
                   i1 = 0x7f080a2c;
                }
                uof.setImageResource(i1);
             }else {
                this.w.setVisibility(i);
             }
             return;
          }
       }
    label_00fe :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0309);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.q = this.q8(User.class);
       this.r = this.x8("FEED_HAS_SHOWN_FRIEND_ICON");
       this.s = this.x8("FEED_HAS_SHOWN_FAVORITE_ICON");
       this.t = this.x8("FEED_HAS_SHOWN_LIVE_ICON");
       this.u = this.q8(QPhoto.class);
       this.v = this.s8(CommonMeta.class);
       return;
    }
}
