package com.yxcorp.gifshow.ad.AdProcessUtils$tryOpenDeepLink$isDeepLinkSuccess$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.app.Activity;
import java.lang.String;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.AdProcessUtils;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.HashMap;
import com.yxcorp.gifshow.entity.QPhoto;
import n49.s;
import com.kwai.feature.api.router.social.profile.ProfileExtraKey;
import kotlin.jvm.internal.a;
import android.net.Uri;
import ekd.x0;
import java.util.Map;
import agc.b;
import java.lang.Throwable;
import yx.j0;

public final class AdProcessUtils$tryOpenDeepLink$isDeepLinkSuccess$1 extends Lambda implements a	// class@0014ef
{
    public final Activity $activity;
    public final AdDataWrapper $dataWrapper;
    public final String $scheme;

    public void AdProcessUtils$tryOpenDeepLink$isDeepLinkSuccess$1(Activity p0,String p1,AdDataWrapper p2){
       this.$activity = p0;
       this.$scheme = p1;
       this.$dataWrapper = p2;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HashMap obj = PatchProxy.apply(null, this, AdProcessUtils$tryOpenDeepLink$isDeepLinkSuccess$1.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       AdProcessUtils$tryOpenDeepLink$isDeepLinkSuccess$1 t$activity = this.$activity;
       AdProcessUtils$tryOpenDeepLink$isDeepLinkSuccess$1 t$scheme = this.$scheme;
       AdProcessUtils$tryOpenDeepLink$isDeepLinkSuccess$1 t$dataWrappe = this.$dataWrapper;
       obj = PatchProxy.applyThreeRefs(t$activity, t$scheme, t$dataWrappe, null, AdProcessUtils.class, "11");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          b = false;
          if (t$dataWrappe.getPhoto() != null) {
             obj = new HashMap();
             QPhoto qPhoto = new QPhoto(t$dataWrappe.getPhoto());
             obj.put("QPhoto", qPhoto);
             if (s.k(t$scheme) == 3) {
                BaseFeed entity = qPhoto.getEntity();
                a.o(entity, "qPhoto.entity");
                obj.put(ProfileExtraKey.REFER_PHOTO.getValue(), entity);
             }
             b = b.a(t$activity, x0.f(t$scheme), obj);
          }
       }
       return b;
    }
}
