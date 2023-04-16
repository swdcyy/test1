package com.yxcorp.gifshow.profile.krn.ProfileStatusBridge$a;
import q3c.a;
import com.yxcorp.gifshow.profile.krn.ProfileStatusBridge;
import java.lang.Object;
import com.yxcorp.gifshow.profile.status.model.HistoryStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class ProfileStatusBridge$a implements a	// class@001367
{
    public final ProfileStatusBridge a;

    public void ProfileStatusBridge$a(ProfileStatusBridge p0){
       this.a = p0;
       super();
    }
    public void a(HistoryStatusResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileStatusBridge$a.class, "2")) {
          return;
       }
       this.a.sendUpdateEvent(p0);
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileStatusBridge$a.class, "1")) {
          return;
       }
       this.a.sendRemoveEvent(p0);
       return;
    }
}
