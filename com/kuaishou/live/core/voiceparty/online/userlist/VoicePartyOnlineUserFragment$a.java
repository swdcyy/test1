package com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUserFragment$a;
import du2.g;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUserFragment;
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

public class VoicePartyOnlineUserFragment$a implements g	// class@001804
{
    public final VoicePartyOnlineUserFragment a;

    public void VoicePartyOnlineUserFragment$a(VoicePartyOnlineUserFragment p0){
       this.a = p0;
       super();
    }
    public void a(){
       f.b(this);
    }
    public void b(UserInfo p0,int p1,String[] p2,int p3){
       if (PatchProxy.isSupport(VoicePartyOnlineUserFragment$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, Integer.valueOf(p3), this, VoicePartyOnlineUserFragment$a.class, "2")) {
          return;
       }
       VoicePartyOnlineUserFragment l = this.a.L;
       if (l != null) {
          l.c(p0);
       }
       return;
    }
    public void c(VoicePartyOnlineUser p0,int p1,g p2,String[] p3){
       f.a(this, p0, p1, p2, p3);
    }
    public void d(VoicePartyOnlineUser p0,int p1,g p2,String[] p3){
       if (PatchProxy.isSupport(VoicePartyOnlineUserFragment$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, VoicePartyOnlineUserFragment$a.class, "1")) {
          return;
       }
       if (p0.mStatus == 1) {
          VoicePartyOnlineUserFragment l = this.a.L;
          if (l != null) {
             l.f(p0, false, p2, p1);
          }
       }
       return;
    }
}
