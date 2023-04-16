package com.kuaishou.live.core.show.activityredpacket.model.LiveActivityRedPacketGrabButtonInfo;
import java.lang.Object;
import com.kuaishou.live.core.show.activityredpacket.a;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import msd.a;
import com.kuaishou.live.core.show.activityredpacket.model.LiveActivityRedPacketGrabButtonInfo$ConditionButtonState;
import com.kuaishou.livestream.message.nano.LiveRedPackSkinMessage$RedPackSkinButtonInfo;
import java.util.Map;
import z12.x;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;

public class LiveActivityRedPacketGrabButtonInfo	// class@00095c
{
    public long A;
    public final Map B;
    public boolean a;
    public boolean b;
    public boolean c;
    public a d;
    public int e;
    public int[] f;
    public int g;
    public int h;
    public String i;
    public int j;
    public CDNUrl[] k;
    public long l;
    public long m;
    public long n;
    public int o;
    public CDNUrl[] p;
    public CDNUrl[] q;
    public CDNUrl[] r;
    public String s;
    public int t;
    public boolean u;
    public String v;
    public String w;
    public String x;
    public String y;
    public long z;

    public void LiveActivityRedPacketGrabButtonInfo(){
       super();
       this.d = a.b;
       this.e = -256;
       this.g = 0;
       this.h = -256;
       this.j = -1;
       this.B = new HashMap();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, LiveActivityRedPacketGrabButtonInfo.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.d.invoke();
       }
       return obj.booleanValue();
    }
    public String b(){
       return this.y;
    }
    public String c(){
       return this.i;
    }
    public int d(){
       return this.j;
    }
    public boolean e(){
       boolean b = (this.c != null || this.u == null)? true: false;
       return b;
    }
    public boolean f(){
       return this.a;
    }
    public void g(LiveActivityRedPacketGrabButtonInfo$ConditionButtonState p0,LiveRedPackSkinMessage$RedPackSkinButtonInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveActivityRedPacketGrabButtonInfo.class, "4")) {
          return;
       }
       this.B.put(p0, p1);
       return;
    }
    public void h(boolean p0){
       this.c = p0;
    }
    public void i(LiveActivityRedPacketGrabButtonInfo$ConditionButtonState p0){
       LiveActivityRedPacketGrabButtonInfo liveActivity = LiveActivityRedPacketGrabButtonInfo.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveActivity, "6")) {
          return;
       }
       Object obj = PatchProxy.applyOneRefs(p0, this, liveActivity, "5");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = this.B.get(p0);
       }
       if (obj != null) {
          this.i = obj.text;
          this.j = x.z(obj.textColor);
          this.k = e0.i(obj.buttonPict);
       }
       return;
    }
}
