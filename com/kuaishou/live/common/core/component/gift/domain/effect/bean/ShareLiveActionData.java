package com.kuaishou.live.common.core.component.gift.domain.effect.bean.ShareLiveActionData;
import com.kuaishou.live.common.core.component.gift.domain.effect.bean.ActionData;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;

public final class ShareLiveActionData extends ActionData	// class@0011aa
{
    public final String platformName;

    public void ShareLiveActionData(String p0){
       a.p(p0, "platformName");
       super(6, 0, 2, null);
       this.platformName = p0;
    }
    public final String getPlatformName(){
       return this.platformName;
    }
}
