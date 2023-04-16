package com.yxcorp.gifshow.im.RtcCallStartParam;
import java.io.Serializable;
import com.yxcorp.gifshow.im.RtcCallStartParam$a;
import java.lang.Object;

public class RtcCallStartParam implements Serializable	// class@001920
{
    public String behavior;
    public int callType;
    public final int floatWindowSource;
    public String inviteId;
    public String roomId;
    public final String rtcPageSource;
    public String subbiz;
    public final String targetId;
    public final int targetType;
    public static final long serialVersionUID = 0xdd5763c265655de7;

    public void RtcCallStartParam(RtcCallStartParam$a p0){
       super();
       this.targetType = p0.a;
       this.targetId = p0.b;
       this.subbiz = p0.c;
       this.roomId = p0.d;
       this.inviteId = p0.f;
       this.behavior = p0.e;
       this.callType = p0.g;
       this.rtcPageSource = p0.h;
       this.floatWindowSource = p0.i;
    }
}
