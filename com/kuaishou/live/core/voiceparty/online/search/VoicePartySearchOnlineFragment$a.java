package com.kuaishou.live.core.voiceparty.online.search.VoicePartySearchOnlineFragment$a;
import du2.g;
import com.kuaishou.live.core.voiceparty.online.search.VoicePartySearchOnlineFragment;
import java.lang.Object;
import du2.f;
import com.kwai.framework.model.user.UserInfo;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import au2.b;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import y8c.g;

public class VoicePartySearchOnlineFragment$a implements g	// class@0017ff
{
    public final VoicePartySearchOnlineFragment a;

    public void VoicePartySearchOnlineFragment$a(VoicePartySearchOnlineFragment p0){
       this.a = p0;
       super();
    }
    public void a(){
       f.b(this);
    }
    public void b(UserInfo p0,int p1,String[] p2,int p3){
       if (PatchProxy.isSupport(VoicePartySearchOnlineFragment$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, Integer.valueOf(p3), this, VoicePartySearchOnlineFragment$a.class, "2")) {
          return;
       }
       VoicePartySearchOnlineFragment f = this.a.F;
       if (f != null) {
          f.c(p0);
       }
       return;
    }
    public void c(VoicePartyOnlineUser p0,int p1,g p2,String[] p3){
       f.a(this, p0, p1, p2, p3);
    }
    public void d(VoicePartyOnlineUser p0,int p1,g p2,String[] p3){
       if (PatchProxy.isSupport(VoicePartySearchOnlineFragment$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, VoicePartySearchOnlineFragment$a.class, "1")) {
          return;
       }
       if (p0.mStatus == true) {
          VoicePartySearchOnlineFragment f = this.a.F;
          if (f != null) {
             f.f(p0, true, p2, p1);
          }
       }
       return;
    }
}
