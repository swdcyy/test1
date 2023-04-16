package com.kuaishou.live.core.voiceparty.micmanager.FriendsInvitationFragment$b;
import au2.b;
import com.kuaishou.live.core.voiceparty.micmanager.FriendsInvitationFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micmanager.FriendsInvitationFragment$a;
import au2.a;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import y8c.g;
import qvb.i;

public final class FriendsInvitationFragment$b implements b	// class@001552
{
    public final FriendsInvitationFragment a;

    public void FriendsInvitationFragment$b(FriendsInvitationFragment p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, FriendsInvitationFragment$b.class, "1")) {
          return;
       }
       this.a.O.b();
       return;
    }
    public void b(String p0){
       a.b(this, p0);
    }
    public void c(UserInfo p0){
       a.h(this, p0);
    }
    public void d(VoicePartyOnlineUser p0,boolean p1,g p2,int p3){
       a.a(this, p0, p1, p2, p3);
    }
    public void e(){
       a.g(this);
    }
    public void f(VoicePartyOnlineUser p0,boolean p1,g p2,int p3){
       a.d(this, p0, p1, p2, p3);
    }
    public void g(boolean p0){
       a.c(this, p0);
    }
    public void h(i p0){
       a.f(this, p0);
    }
}
