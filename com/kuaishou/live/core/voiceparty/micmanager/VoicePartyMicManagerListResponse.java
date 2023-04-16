package com.kuaishou.live.core.voiceparty.micmanager.VoicePartyMicManagerListResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import ps2.l;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import lnc.a1;

public class VoicePartyMicManagerListResponse implements Serializable, b	// class@00155c
{
    public List mApplyList;
    public List mFriendUserList;
    public List mTopUserList;
    public static final long serialVersionUID = 0x9eb94d061ad1cdee;

    public void VoicePartyMicManagerListResponse(){
       super();
    }
    public final void convertAndAddToMicManagerItemList(List p0,List p1,int p2){
       if (PatchProxy.isSupport(VoicePartyMicManagerListResponse.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, VoicePartyMicManagerListResponse.class, "3")) {
          return;
       }
       for (int i = 0; i < p0.size(); i = i + 1) {
          VoicePartyOnlineUser voicePartyOn = p0.get(i);
          l ol = new l(0);
          boolean b = (p2 == 3)? true: false;
          voicePartyOn.mIsUserNotInLivingRoom = b;
          ol.b = voicePartyOn;
          ol.e = i;
          ol.f = p2;
          p1.add(ol);
       }
       return;
    }
    public List getItems(){
       Object obj = PatchProxy.apply(null, this, VoicePartyMicManagerListResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.parseMicManagerItemList(this.mApplyList, this.mTopUserList, this.mFriendUserList);
    }
    public boolean hasMore(){
       return false;
    }
    public boolean haveFriends(){
       VoicePartyMicManagerListResponse obj = PatchProxy.apply(null, this, VoicePartyMicManagerListResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mFriendUserList;
       boolean b = (obj != null && obj.size() > 0)? true: false;
       return b;
    }
    public final List parseMicManagerItemList(List p0,List p1,List p2){
       l ol1;
       ArrayList obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, VoicePartyMicManagerListResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       boolean b = false;
       if (!q.f(p0)) {
          if (!q.f(p1)) {
             l ol = new l(1);
             ol.c = a1.p(0x7f100517);
             ol.d = b;
             obj.add(ol);
             b = true;
          }
          this.convertAndAddToMicManagerItemList(p0, obj, 1);
       }
       if (!q.f(p1)) {
          if (!q.f(p0)) {
             ol1 = new l(1);
             ol1.c = a1.p(0x7f100519);
             ol1.d = b;
             obj.add(ol1);
             b = true;
          }
          this.convertAndAddToMicManagerItemList(p1, obj, 2);
       }
       if (!q.f(p2)) {
          ol1 = new l(1);
          ol1.c = a1.p(0x7f102e1d);
          ol1.d = b;
          obj.add(ol1);
          this.convertAndAddToMicManagerItemList(p2, obj, 3);
       }
       return obj;
    }
}
