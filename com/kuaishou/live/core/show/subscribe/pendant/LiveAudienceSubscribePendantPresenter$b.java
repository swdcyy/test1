package com.kuaishou.live.core.show.subscribe.pendant.LiveAudienceSubscribePendantPresenter$b;
import ft5.d;
import com.kuaishou.live.core.show.subscribe.pendant.LiveAudienceSubscribePendantPresenter;
import java.lang.Object;
import ft5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveAudienceSubscribePendantPresenter$b implements d	// class@001146
{
    public final LiveAudienceSubscribePendantPresenter a;

    public void LiveAudienceSubscribePendantPresenter$b(LiveAudienceSubscribePendantPresenter p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
       c.a(this, p0, p1);
    }
    public void onDismiss(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceSubscribePendantPresenter$b.class, "2")) {
          return;
       }
       this.a.c9();
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceSubscribePendantPresenter$b.class, "1")) {
          return;
       }
       this.a.c9();
       return;
    }
}
