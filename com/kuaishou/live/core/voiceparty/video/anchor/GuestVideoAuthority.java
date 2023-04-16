package com.kuaishou.live.core.voiceparty.video.anchor.GuestVideoAuthority;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GuestVideoAuthority extends Enum	// class@001ad8
{
    public static final GuestVideoAuthority[] $VALUES;
    public static final GuestVideoAuthority ALL_USER;
    public static final GuestVideoAuthority FANS;
    public static final GuestVideoAuthority FRIEND;
    public static final GuestVideoAuthority NO_USER;
    public static final GuestVideoAuthority UNKNOWN;

    static {
       GuestVideoAuthority guestVideoAu1;
       GuestVideoAuthority[] guestVideoAu = new GuestVideoAuthority[]{guestVideoAu1,guestVideoAu1,guestVideoAu1,guestVideoAu1,guestVideoAu1};
       guestVideoAu1 = new GuestVideoAuthority("UNKNOWN", 0);
       GuestVideoAuthority.UNKNOWN = guestVideoAu1;
       guestVideoAu1 = new GuestVideoAuthority("ALL_USER", 1);
       GuestVideoAuthority.ALL_USER = guestVideoAu1;
       guestVideoAu1 = new GuestVideoAuthority("FANS", 2);
       GuestVideoAuthority.FANS = guestVideoAu1;
       guestVideoAu1 = new GuestVideoAuthority("FRIEND", 3);
       GuestVideoAuthority.FRIEND = guestVideoAu1;
       guestVideoAu1 = new GuestVideoAuthority("NO_USER", 4);
       GuestVideoAuthority.NO_USER = guestVideoAu1;
       GuestVideoAuthority.$VALUES = guestVideoAu;
    }
    public void GuestVideoAuthority(String p0,int p1){
       super(p0, p1);
    }
    public static GuestVideoAuthority valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GuestVideoAuthority.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GuestVideoAuthority.class, p0);
    }
    public static GuestVideoAuthority[] values(){
       Object obj = PatchProxy.apply(null, null, GuestVideoAuthority.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GuestVideoAuthority.$VALUES.clone();
    }
}
