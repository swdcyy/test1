package com.kwaishou.merchant.daccore.util.DynamicPendantSwitch$a;
import java.lang.Object;
import nsd.u;
import com.kwaishou.merchant.daccore.util.DynamicPendantSwitch$Config;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.reflect.Type;

public final class DynamicPendantSwitch$a	// class@001343
{

    public void DynamicPendantSwitch$a(){
       super();
    }
    public void DynamicPendantSwitch$a(u p0){
       super();
    }
    public final DynamicPendantSwitch$Config a(){
       return a.t().getValue("merchantLiveSuperBowlConfig", DynamicPendantSwitch$Config.class, new DynamicPendantSwitch$Config());
    }
    public final boolean b(){
       return a.t().d("enableDyBubbleAnimation", false);
    }
}
