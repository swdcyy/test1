package com.kuaishou.live.core.voiceparty.micmanager.FriendsListResponse;
import java.io.Serializable;
import la6.b;
import com.kuaishou.live.core.voiceparty.micmanager.FriendsListResponse$a;
import nsd.u;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;

public final class FriendsListResponse implements Serializable, b	// class@001557
{
    public List friendList;
    public static final FriendsListResponse$a Companion;
    public static final long serialVersionUID;

    static {
       FriendsListResponse.Companion = new FriendsListResponse$a(null);
    }
    public void FriendsListResponse(List p0){
       a.p(p0, "friendList");
       super();
       this.friendList = p0;
    }
    public final List getFriendList(){
       return this.friendList;
    }
    public List getItems(){
       Object obj = PatchProxy.apply(null, this, FriendsListResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.processFriendList();
       return this.friendList;
    }
    public boolean hasMore(){
       return false;
    }
    public final void processFriendList(){
       if (PatchProxy.applyVoid(null, this, FriendsListResponse.class, "2")) {
          return;
       }
       Iterator iterator = this.friendList.iterator();
       while (iterator.hasNext()) {
          iterator.next().mIsUserNotInLivingRoom = true;
       }
       return;
    }
    public final void setFriendList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendsListResponse.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.friendList = p0;
       return;
    }
}
