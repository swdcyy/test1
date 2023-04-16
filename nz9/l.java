package nz9.l;
import androidx.lifecycle.Observer;
import nz9.z0;
import java.lang.Object;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nz9.a0;
import androidx.fragment.app.Fragment;
import java.lang.Runnable;
import k2b.n;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import uw9.o;
import q87.c;
import com.kuaishou.android.model.entity.DynamicEffectMarker;
import qp7.x0;
import qp7.b;
import os7.a;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import mrd.a;
import java.util.HashMap;
import java.lang.Integer;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import nz9.a;
import z1.a;
import nz9.j0;
import t45.c;
import tkd.b;
import tkd.d;
import os5.l;

public final class l implements Observer	// class@003231
{
    public final z0 b;

    public void l(z0 p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       DynamicEffectMarker mIsBlocked;
       l tb = this.b;
       Objects.requireNonNull(tb);
       z0 oz0 = z0.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, oz0, "38")) {
       }else {
          boolean b = true;
          tb.L = b;
          if (p0 == null) {
             n.a(tb.G, new a0(tb));
          }else {
             tb.X = p0.mIsShopLive;
             AvatarInfoResponse mPhoto = p0.mPhoto;
             if (mPhoto != null && !TextUtils.n(tb.u.getUserId(), mPhoto.getUserId())) {
                Object[] objArray = new Object[0];
                o.C().t("GET_NOT_SAME_USER_LIVE_NasaLiveTipPresenter", "current photo"+" id:"+tb.u.getPhotoId()+" userId:"+tb.u.getUserId()+"\r\n"+"current live"+" feed type:"+mPhoto.getType()+" id:"+mPhoto.getPhotoId()+" userId:"+mPhoto.getUserId()+"\r\n", objArray);
             }
             tb.O0(p0);
             DynamicEffectMarker uDynamicEffe = null;
             if (tb.B0(b)) {
                mPhoto = p0.mDynamicEffectMarker;
                if (mPhoto != null) {
                   uDynamicEffe = mPhoto.mIcon;
                   mIsBlocked = mPhoto.mIsBlocked;
                }else {
                   mIsBlocked = null;
                }
                a uoa = tb.E();
                boolean b1 = (tb.B0(b) && mIsBlocked == null)? true: false;
                uoa.w(Boolean.valueOf(b1), uDynamicEffe, 0);
                if (tb.B0(b) && (mIsBlocked == null && NasaExperimentUtils.I() > 0)) {
                   HashMap hashMap = (tb.f1.i() != null)? tb.f1.i(): new HashMap();
                   hashMap.put("liveTip", Integer.valueOf(b));
                   tb.f1.onNext(hashMap);
                }
             label_0103 :
                if (tb.C0()) {
                   tb.x0();
                   tb.X0 = false;
                   tb.Z0 = false;
                   tb.a1 = false;
                   _monitor_enter(tb);
                   if (PatchProxy.applyVoidOneRefs(p0, tb, oz0, "9")) {
                      _monitor_exit(tb);
                   }else if(NasaSlidePlayExperimentUtil.a()){
                      tb.E().i(a.a);
                      c.a(new j0(tb, p0));
                   }else {
                      tb.p0(p0);
                   }
                   _monitor_exit(tb);
                }
             }else {
                tb.E().w(Boolean.FALSE, uDynamicEffe, 0);
                if (tb.B0(0)) {
                   d.a(-1492894991).ly("delay_from_thanos_avatar", b);
                }
             }
             n.a(tb.G, new a0(tb));
          }
       }
       return;
    }
}
