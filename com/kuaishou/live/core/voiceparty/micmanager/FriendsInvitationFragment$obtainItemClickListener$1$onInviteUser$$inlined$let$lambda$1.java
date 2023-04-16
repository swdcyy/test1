package com.kuaishou.live.core.voiceparty.micmanager.FriendsInvitationFragment$obtainItemClickListener$1$onInviteUser$$inlined$let$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micmanager.FriendsInvitationFragment$obtainItemClickListener$1;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import java.lang.String;
import y8c.g;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class FriendsInvitationFragment$obtainItemClickListener$1$onInviteUser$$inlined$let$lambda$1 extends Lambda implements a	// class@001553
{
    public final int $adapterPosition$inlined;
    public final String[] $labels$inlined;
    public final VoicePartyOnlineUser $onlineUser$inlined;
    public final g $recyclerAdapter$inlined;
    public final FriendsInvitationFragment$obtainItemClickListener$1 this$0;

    public void FriendsInvitationFragment$obtainItemClickListener$1$onInviteUser$$inlined$let$lambda$1(FriendsInvitationFragment$obtainItemClickListener$1 p0,int p1,VoicePartyOnlineUser p2,String[] p3,g p4){
       this.this$0 = p0;
       this.$adapterPosition$inlined = p1;
       this.$onlineUser$inlined = p2;
       this.$labels$inlined = p3;
       this.$recyclerAdapter$inlined = p4;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final l1 invoke(){
       Object[] objArray = null;
       FriendsInvitationFragment$obtainItemClickListener$1$onInviteUser$$inlined$let$lambda$1 obj = PatchProxy.applyWithListener(objArray, this, FriendsInvitationFragment$obtainItemClickListener$1$onInviteUser$$inlined$let$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.$onlineUser$inlined.mStatus = 2;
       obj = this.$recyclerAdapter$inlined;
       if (obj != null) {
          obj.l0(this.$adapterPosition$inlined);
          objArray = l1.a;
       }
       PatchProxy.onMethodExit(FriendsInvitationFragment$obtainItemClickListener$1$onInviteUser$$inlined$let$lambda$1.class, "1");
       return objArray;
    }
}
