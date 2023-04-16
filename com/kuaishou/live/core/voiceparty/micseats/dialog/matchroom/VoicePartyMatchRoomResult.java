package com.kuaishou.live.core.voiceparty.micseats.dialog.matchroom.VoicePartyMatchRoomResult;
import java.io.Serializable;
import com.kuaishou.live.core.voiceparty.micseats.dialog.matchroom.VoicePartyMatchRoomResult$a;
import nsd.u;
import java.lang.String;
import java.util.List;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class VoicePartyMatchRoomResult implements Serializable	// class@0015af
{
    public final String constellation;
    public final String displayLocation;
    public final List heads;
    public final String roomKwaiLink;
    public final Integer roomType;
    public final String userGender;
    public final String userId;
    public final String userName;
    public static final VoicePartyMatchRoomResult$a Companion;
    public static final long serialVersionUID;

    static {
       VoicePartyMatchRoomResult.Companion = new VoicePartyMatchRoomResult$a(null);
    }
    public void VoicePartyMatchRoomResult(String p0,String p1,String p2,String p3,List p4,String p5,String p6,Integer p7){
       super();
       this.roomKwaiLink = p0;
       this.userId = p1;
       this.userName = p2;
       this.userGender = p3;
       this.heads = p4;
       this.displayLocation = p5;
       this.constellation = p6;
       this.roomType = p7;
    }
    public static VoicePartyMatchRoomResult copy$default(VoicePartyMatchRoomResult p0,String p1,String p2,String p3,String p4,List p5,String p6,String p7,Integer p8,int p9,Object p10){
       VoicePartyMatchRoomResult voicePartyMa = p0;
       int i = p9;
       VoicePartyMatchRoomResult roomKwaiLink = (i & 0x01)? voicePartyMa.roomKwaiLink: p1;
       VoicePartyMatchRoomResult userId = (i & 0x02)? voicePartyMa.userId: p2;
       VoicePartyMatchRoomResult userName = (i & 0x04)? voicePartyMa.userName: p3;
       VoicePartyMatchRoomResult userGender = (i & 0x08)? voicePartyMa.userGender: p4;
       VoicePartyMatchRoomResult heads = (i & 0x10)? voicePartyMa.heads: p5;
       VoicePartyMatchRoomResult displayLocat = (i & 0x20)? voicePartyMa.displayLocation: p6;
       VoicePartyMatchRoomResult constellatio = (i & 0x40)? voicePartyMa.constellation: p7;
       VoicePartyMatchRoomResult roomType = (i & 0x0080)? voicePartyMa.roomType: p8;
       return p0.copy(roomKwaiLink, userId, userName, userGender, heads, displayLocat, constellatio, roomType);
    }
    public final String component1(){
       return this.roomKwaiLink;
    }
    public final String component2(){
       return this.userId;
    }
    public final String component3(){
       return this.userName;
    }
    public final String component4(){
       return this.userGender;
    }
    public final List component5(){
       return this.heads;
    }
    public final String component6(){
       return this.displayLocation;
    }
    public final String component7(){
       return this.constellation;
    }
    public final Integer component8(){
       return this.roomType;
    }
    public final VoicePartyMatchRoomResult copy(String p0,String p1,String p2,String p3,List p4,String p5,String p6,Integer p7){
       Object obj;
       if (PatchProxy.isSupport(VoicePartyMatchRoomResult.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6,p7};
          obj = PatchProxy.apply(objArray, this, VoicePartyMatchRoomResult.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       VoicePartyMatchRoomResult voicePartyMa = new VoicePartyMatchRoomResult(p0, p1, p2, p3, p4, p5, p6, p7);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyMatchRoomResult.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof VoicePartyMatchRoomResult && (a.g(this.roomKwaiLink, p0.roomKwaiLink) && (a.g(this.userId, p0.userId) && (a.g(this.userName, p0.userName) && (a.g(this.userGender, p0.userGender) && (a.g(this.heads, p0.heads) && (a.g(this.displayLocation, p0.displayLocation) && (a.g(this.constellation, p0.constellation) && a.g(this.roomType, p0.roomType)))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       VoicePartyMatchRoomResult obj = PatchProxy.apply(null, this, VoicePartyMatchRoomResult.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.roomKwaiLink;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       VoicePartyMatchRoomResult tuserId = this.userId;
       int i2 = (tuserId != null)? tuserId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuserId = this.userName;
       i2 = (tuserId != null)? tuserId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuserId = this.userGender;
       i2 = (tuserId != null)? tuserId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuserId = this.heads;
       i2 = (tuserId != null)? tuserId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuserId = this.displayLocation;
       i2 = (tuserId != null)? tuserId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuserId = this.constellation;
       i2 = (tuserId != null)? tuserId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tuserId = this.roomType;
       if (tuserId != null) {
          i = tuserId.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, VoicePartyMatchRoomResult.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "VoicePartyMatchRoomResult\(roomKwaiLink="+this.roomKwaiLink+", userId="+this.userId+", userName="+this.userName+", userGender="+this.userGender+", heads="+this.heads+", displayLocation="+this.displayLocation+", constellation="+this.constellation+", roomType="+this.roomType+"\)";
    }
}
