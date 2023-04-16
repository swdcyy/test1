package com.yxcorp.gifshow.ad.webview.AdNeoH5VideoModel$fetchAvatarInfoResponseIfNeed$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import k59.t0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.commercial.PhotoAdvertisementInterface;

public final class AdNeoH5VideoModel$fetchAvatarInfoResponseIfNeed$1 extends FunctionReferenceImpl implements l	// class@00188d
{

    public void AdNeoH5VideoModel$fetchAvatarInfoResponseIfNeed$1(t0 p0){
       super(1, p0, t0.class, "onFetchLiveStatusResponse", "onFetchLiveStatusResponse\(Lcom/kwai/feature/component/photofeatures/startup/response/AvatarInfoResponse;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(AvatarInfoResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdNeoH5VideoModel$fetchAvatarInfoResponseIfNeed$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, t0.class, "4") && p0.mPhoto != null) {
          PhotoAdvertisement photoAdverti = k.B(treceiver.d);
          photoAdverti = (photoAdverti != null)? photoAdverti.cloneForLiveStreamFeed(): null;
          if (photoAdverti != null) {
             photoAdverti.mIsFansTopWholeArea = true;
          }
          AvatarInfoResponse mPhoto = p0.mPhoto;
          a.o(mPhoto, "avatarInfoResponse.mPhoto");
          mPhoto.setAdvertisement(photoAdverti);
          treceiver.a = p0;
       }
       return;
    }
}
