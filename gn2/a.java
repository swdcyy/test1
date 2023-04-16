package gn2.a;
import erd.g;
import gn2.c;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.basic.model.LiveWishLightGiftGuideConfig;
import com.yxcorp.gifshow.models.Gift;
import java.lang.CharSequence;
import android.text.TextUtils;
import wkd.b;
import j80.c;
import java.io.File;
import en2.i;
import com.kuaishou.live.core.show.wishlight.download.base.a;
import com.yxcorp.gifshow.model.CDNUrl;
import gn2.e;
import com.kuaishou.live.core.show.wishlight.download.base.a$a;

public final class a implements g	// class@002b4c
{
    public final c b;

    public void a(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       boolean b;
       boolean b1;
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null) {
          p0 = p0.mLiveWishLightGiftGuideConfig;
          c uoc = c.class;
          if (!PatchProxy.applyVoidOneRefs(p0, tb, uoc, "7")) {
             a obj = PatchProxy.applyOneRefs(p0, tb, uoc, "8");
             b = true;
             if (obj != PatchProxyResult.class) {
                b1 = obj.booleanValue();
             }else {
                b1 = false;
                if (p0 == null) {
                   b.P(c.U, "server dispatch mLiveWishLightGiftGuideConfig is null");
                }else {
                   LiveWishLightGiftGuideConfig mGift = p0.mGift;
                   if (mGift == null) {
                      b.P(c.U, "server dispatch mGift is null");
                   }else if(mGift.mId == null){
                      b.P(c.U, "server dispatch mGift.mId is 0");
                   }else if(mGift.mImageUrl == null){
                      b.P(c.U, "server dispatch mGift.mImageUrl is null");
                   }else if(TextUtils.isEmpty(p0.mGiftToken)){
                      b.P(c.U, "server dispatch mGiftToken is null");
                   }else if(TextUtils.isEmpty(p0.liveMultiMagicEffectInfoStr)){
                      b.P(c.U, "mLiveWishLightGiftGuideConfig.liveMultiMagicEffectInfoStr is empty");
                   }else {
                      b1 = true;
                   }
                }
             }
             if (b1) {
                i oi = new i(b.a(-1504323719).c("wish_light_icon_cache").getAbsolutePath());
                oi.g(c.V, c.V);
                oi.f(b);
                oi.e(b);
                obj = oi.a();
                CDNUrl[] uCDNUrlArray = new CDNUrl[p0.mGift.mImageUrl.size()];
                obj.a(p0.mGift.mImageUrl.toArray(uCDNUrlArray), new e(tb, p0, uCDNUrlArray));
             }
          }
       }else {
          b.P(c.U, "userIoStatusResponse is null");
       }
       return;
    }
}
