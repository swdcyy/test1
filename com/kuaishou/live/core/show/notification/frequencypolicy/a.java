package com.kuaishou.live.core.show.notification.frequencypolicy.a;
import p91.m;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vc2.b;
import com.kuaishou.live.core.show.notification.frequencypolicy.LiveAudienceActivityNotificationFrequencyPolicy;
import z1.k;
import java.util.List;

public class a	// class@000d4b
{
    public final m a;
    public final List b;

    public void a(m p0){
       super();
       ArrayList uArrayList = new ArrayList();
       this.b = uArrayList;
       this.a = p0;
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
       }else if(!p0.e()){
          uArrayList.add(new LiveAudienceActivityNotificationFrequencyPolicy(new b(this)));
       }
       return;
    }
}
