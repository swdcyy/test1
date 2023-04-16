package f72.t;
import k51.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import kp.r1;
import ga5.b;
import com.kuaishou.android.model.mix.w;
import java.lang.Boolean;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;
import com.kwai.framework.model.user.User;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.h;
import android.widget.ImageView;
import com.kwai.framework.model.user.UserVerifiedDetail;

public class t extends c	// class@0028da
{
    public LiveStreamFeed p;
    public ImageView q;
    public QPhoto r;
    public static String sLivePresenterClassName = "LiveDoubleListFeedCoverAuthenticatedPresenter";

    public void t(){
       super();
    }
    public void E8(){
       boolean b;
       t tq;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = t.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ot, "2")) {
          return;
       }
       QPhoto mEntity = this.r.mEntity;
       this.p = mEntity;
       if (!b.d(r1.w0(mEntity)) && !w.k0(this.r.getEntity())) {
          PhotoAdvertisement obj = PatchProxy.apply(objArray, this, ot, "3");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             obj = k.B(this.r);
             if (obj != null) {
                PhotoAdvertisement$AdGroup[] uAdGroupArra = new PhotoAdvertisement$AdGroup[]{PhotoAdvertisement$AdGroup.DSP,PhotoAdvertisement$AdGroup.THIRD_PLATFORM,PhotoAdvertisement$AdGroup.ALI_DONG_FENG};
                if (obj.isAdGroup(uAdGroupArra)) {
                   b = true;
                }
             }
             b = false;
          }
          if (!b) {
             User user = PatchProxy.apply(objArray, this, ot, "4");
             if (user != patchProxyRe) {
             }else {
                user = r1.T1(this.p);
             }
             if (user == null) {
                return;
             }else if(this.q == null){
                this.q = h.f(this.m8(), 0x7f0a1c87, 0x7f0a1c86);
             }
             int i = 0x7f080a2b;
             if (user.mVerifiedDetail != null) {
                this.q.setVisibility(0);
                UserVerifiedDetail mIconType = user.mVerifiedDetail.mIconType;
                if (mIconType != 1) {
                   if (mIconType != 2) {
                      if (mIconType == 3) {
                         this.q.setImageResource(R.drawable.arg_RES_7f080a2d);
                      }
                   }else {
                      this.q.setImageResource(i);
                   }
                }else {
                   this.q.setImageResource(R.drawable.arg_RES_7f080a2c);
                }
             }else if(user.isVerified()){
                this.q.setVisibility(0);
                tq = this.q;
                if (!user.isBlueVerifiedType()) {
                   i = 0x7f080a2c;
                }
                tq.setImageResource(i);
             }else {
                this.q.setVisibility(8);
             }
             return;
          }
       }
    label_00de :
       tq = this.q;
       if (tq != null) {
          tq.setVisibility(8);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t.class, "1")) {
          return;
       }
       this.r = this.q8(QPhoto.class);
       return;
    }
}
