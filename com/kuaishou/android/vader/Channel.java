package com.kuaishou.android.vader.Channel;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Channel extends Enum	// class@000705
{
    public int value;
    public static final Channel[] $VALUES;
    public static final Channel CLICK2;
    public static final Channel COMMENT_SHOW;
    public static final Channel COVER_SHOW;
    public static final Channel HIGH_FREQ;
    public static final Channel NORMAL;
    public static final Channel REAL_SHOW;
    public static final Channel REAL_TIME;
    public static final Channel USER_TRACK;

    static {
       Channel uChannel = new Channel("REAL_TIME", 0, 0);
       Channel.REAL_TIME = uChannel;
       Channel uChannel1 = new Channel("HIGH_FREQ", 1, 1);
       Channel.HIGH_FREQ = uChannel1;
       Channel uChannel2 = new Channel("NORMAL", 2, 2);
       Channel.NORMAL = uChannel2;
       Channel uChannel3 = new Channel("REAL_SHOW", 3, 3);
       Channel.REAL_SHOW = uChannel3;
       Channel uChannel4 = new Channel("CLICK2", 4, 4);
       Channel.CLICK2 = uChannel4;
       Channel uChannel5 = new Channel("COVER_SHOW", 5, 5);
       Channel.COVER_SHOW = uChannel5;
       Channel uChannel6 = new Channel("COMMENT_SHOW", 6, 6);
       Channel.COMMENT_SHOW = uChannel6;
       Channel uChannel7 = new Channel("USER_TRACK", 7, 7);
       Channel.USER_TRACK = uChannel7;
       Channel[] uChannelArra = new Channel[]{uChannel,uChannel1,uChannel2,uChannel3,uChannel4,uChannel5,uChannel6,uChannel7};
       Channel.$VALUES = uChannelArra;
    }
    public void Channel(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static Channel valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Channel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(Channel.class, p0);
    }
    public static Channel[] values(){
       Object obj = PatchProxy.apply(null, null, Channel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Channel.$VALUES.clone();
    }
    public int getValue(){
       return this.value;
    }
}
