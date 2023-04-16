package com.yxcorp.gifshow.ad.AdProcessUtils$tryOpenDeepLink$isDeepLinkSuccess$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.app.Activity;
import java.lang.String;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.yxcorp.gifshow.ad.AdProcessUtils;

public final class AdProcessUtils$tryOpenDeepLink$isDeepLinkSuccess$3 extends Lambda implements a	// class@0014f1
{
    public final Activity $activity;
    public final AdDataWrapper $dataWrapper;
    public final String $scheme;

    public void AdProcessUtils$tryOpenDeepLink$isDeepLinkSuccess$3(Activity p0,String p1,AdDataWrapper p2){
       this.$activity = p0;
       this.$scheme = p1;
       this.$dataWrapper = p2;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, AdProcessUtils$tryOpenDeepLink$isDeepLinkSuccess$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return AdProcessUtils.i(this.$activity, this.$scheme, this.$dataWrapper);
    }
}
