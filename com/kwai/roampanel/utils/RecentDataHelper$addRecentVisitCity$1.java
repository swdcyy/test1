package com.kwai.roampanel.utils.RecentDataHelper$addRecentVisitCity$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class RecentDataHelper$addRecentVisitCity$1 extends Lambda implements l	// class@0013e0
{
    public final CityInfo $cityInfo;

    public void RecentDataHelper$addRecentVisitCity$1(CityInfo p0){
       this.$cityInfo = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(CityInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecentDataHelper$addRecentVisitCity$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       return (TextUtils.n(p0.mCityName, this.$cityInfo.mCityName) ^ 0x01);
    }
}
