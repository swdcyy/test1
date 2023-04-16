package com.kwai.live.gzone.accompanyplay.audience.k0$i;
import g37.g;
import com.kwai.live.gzone.accompanyplay.audience.k0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.live.gzone.pendant.service.LiveGzoneAudienceFeatureEntranceItem;
import k67.g;
import java.lang.Number;
import o37.a;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAudienceAccompanyFleetInfo;

public class k0$i implements g	// class@000b92
{
    public final k0 a;

    public void k0$i(k0 p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, k0$i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.a.u.sa(LiveGzoneAudienceFeatureEntranceItem.ACCOMPANY.mEntranceId)) {
          return false;
       }
       this.a.Y8();
       return true;
    }
    public int b(){
       k0 obj = PatchProxy.apply(null, this, k0$i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a.C;
       if (obj != null) {
          a uoa = obj.t();
          if (uoa != null) {
             uoa = uoa.mFleetInfo;
             if (uoa != null) {
                return uoa.mAccompanyStatus;
             }
          }
       }
       return -1;
    }
}
