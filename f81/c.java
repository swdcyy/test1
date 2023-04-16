package f81.c;
import os5.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.player.LivePlayerNetworkRetryConfig;
import o51.b;
import android.app.Activity;
import dw6.b;
import java.lang.Integer;
import com.kuaishou.live.preview.item.base.LiveGrootPreviewBaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.live.model.i;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import yp.x;
import tkd.b;
import tkd.d;
import os5.l;
import az6.a;
import android.content.Intent;
import android.net.Uri;
import vm5.f;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.yxcorp.gifshow.entity.QPreInfo;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.preview.item.fragment.LivePreviewFragment;
import pw6.d;
import android.util.Pair;
import java.util.Objects;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ck3.b;
import com.kwai.video.waynelive.LivePlayerController;
import com.yxcorp.gifshow.autoplay.live.g;

public class c implements c	// class@0022cb
{

    public void c(){
       super();
    }
    public String F50(){
       Object obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a().mDetailScene;
    }
    public void LY(Activity p0,b p1,int p2){
       int i;
       b c;
       b d;
       LiveAudienceParam liveAudience;
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, c.class, "3")) {
          return;
       }
       if (!PatchProxy.isSupport(LiveGrootPreviewBaseFragment.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, LiveGrootPreviewBaseFragment.class, "15")) {
          PhotoDetailParam photoDetailP = p1.d("KEY_PHOTO_DETAIL_PARAM");
          QPhoto qPhoto = p1.b(QPhoto.class);
          if (i.i(qPhoto.getEntity()) > 0) {
             p2 = i.i(qPhoto.getEntity());
          }else if(k.B(qPhoto) != null && k.B(qPhoto).mAdLiveForFansTop != null){
             i = 12;
          label_0095 :
             String str = (p0.getIntent() != null && (p0.getIntent().getData() != null && f.g(p0.getIntent())))? p0.getIntent().getData().toString(): null;
             object oobject = p0;
             c = p1.c;
             d = p1.d;
             QPhoto qPhoto1 = qPhoto.mEntity;
             if (PatchProxy.isSupport(LiveGrootPreviewBaseFragment.class)) {
                Object[] objArray = new Object[]{oobject,Integer.valueOf(c),Integer.valueOf(d),qPhoto1,Integer.valueOf(i),str,photoDetailP};
                liveAudience = PatchProxy.apply(objArray, null, LiveGrootPreviewBaseFragment.class, "16");
                if (liveAudience != PatchProxyResult.class) {
                label_0117 :
                   p1.h(LiveAudienceParam.LIVE_AUDIENCE_PARAM_KEY, liveAudience);
                }
             }
             liveAudience = d.a(-1492894991).HL(oobject, qPhoto1, i, photoDetailP.mDetailCommonParam.mPreInfo, d, photoDetailP.mSlidePlayId, str);
             goto label_0117 ;
          }else if(i.h(qPhoto.getEntity()) > 0){
             p2 = x.h(qPhoto.getEntity());
          }else if(p2 && p2 > 0){
             p2 = d.a(-1492894991).KL(photoDetailP.mSource);
          }
          i = p2;
          goto label_0095 ;
       }
       return;
    }
    public boolean b6(Fragment p0){
       return p0 instanceof LivePreviewFragment;
    }
    public boolean isAvailable(){
       return true;
    }
    public d re(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new LivePreviewFragment(p0);
    }
    public Pair x7(Fragment p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       Objects.requireNonNull(p0);
       Object[] objArray = null;
       obj = PatchProxy.apply(objArray, p0, LivePreviewFragment.class, "6");
       if (obj != patchProxyRe) {
          objArray = obj;
       }else {
          QPhoto currentPhoto = p0.y.getCurrentPhoto();
          if (currentPhoto == null || (currentPhoto.getEntity() != null && !TextUtils.x(currentPhoto.getPhotoId()))) {
             b b = p0.H.b;
             objArray = (b != null && b.Q() != null)? Pair.create(currentPhoto.getPhotoId(), String.valueOf(b.Q().getPlayDuration())): Pair.create(currentPhoto.getPhotoId(), objArray);
          }
       }
    label_0065 :
       return objArray;
    }
}
